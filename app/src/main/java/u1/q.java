package u1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.AbstractBinderC0603b;
import b.C0602a;
import b.InterfaceC0604c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f17186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f17187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f17188q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashSet f17189r = new HashSet();

    public q(Context context) {
        this.f17186o = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f17187p = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(p pVar) {
        boolean z6;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = pVar.f17181a;
        if (zIsLoggable) {
            Objects.toString(componentName);
            pVar.f17184d.size();
        }
        if (pVar.f17184d.isEmpty()) {
            return;
        }
        if (pVar.f17182b) {
            z6 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f17186o;
            boolean zBindService = context.bindService(component, this, 33);
            pVar.f17182b = zBindService;
            if (zBindService) {
                pVar.f17185e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z6 = pVar.f17182b;
        }
        if (!z6 || pVar.f17183c == null) {
            b(pVar);
            return;
        }
        while (true) {
            arrayDeque = pVar.f17184d;
            n nVar = (n) arrayDeque.peek();
            if (nVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    nVar.toString();
                }
                nVar.a(pVar.f17183c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(pVar);
    }

    public final void b(p pVar) {
        Handler handler = this.f17187p;
        ComponentName componentName = pVar.f17181a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i7 = pVar.f17185e + 1;
        pVar.f17185e = i7;
        if (i7 <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
        } else {
            ArrayDeque arrayDeque = pVar.f17184d;
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i7 = message.what;
        InterfaceC0604c interfaceC0604c = null;
        if (i7 == 0) {
            n nVar = (n) message.obj;
            String string = Settings.Secure.getString(this.f17186o.getContentResolver(), "enabled_notification_listeners");
            synchronized (r.f17190c) {
                if (string != null) {
                    try {
                        if (!string.equals(r.f17191d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            r.f17192e = hashSet2;
                            r.f17191d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = r.f17192e;
            }
            if (!hashSet.equals(this.f17189r)) {
                this.f17189r = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f17186o.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f17188q.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.f17188q.put(componentName2, new p(componentName2));
                    }
                }
                Iterator it = this.f17188q.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        p pVar = (p) entry.getValue();
                        if (pVar.f17182b) {
                            this.f17186o.unbindService(this);
                            pVar.f17182b = false;
                        }
                        pVar.f17183c = null;
                        it.remove();
                    }
                }
            }
            for (p pVar2 : this.f17188q.values()) {
                pVar2.f17184d.add(nVar);
                a(pVar2);
            }
        } else if (i7 == 1) {
            o oVar = (o) message.obj;
            ComponentName componentName3 = oVar.f17179a;
            IBinder iBinder = oVar.f17180b;
            p pVar3 = (p) this.f17188q.get(componentName3);
            if (pVar3 != null) {
                int i8 = AbstractBinderC0603b.f9874c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0604c.f9875a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0604c)) {
                        C0602a c0602a = new C0602a();
                        c0602a.f9873c = iBinder;
                        interfaceC0604c = c0602a;
                    } else {
                        interfaceC0604c = (InterfaceC0604c) iInterfaceQueryLocalInterface;
                    }
                }
                pVar3.f17183c = interfaceC0604c;
                pVar3.f17185e = 0;
                a(pVar3);
                return true;
            }
        } else if (i7 == 2) {
            p pVar4 = (p) this.f17188q.get((ComponentName) message.obj);
            if (pVar4 != null) {
                if (pVar4.f17182b) {
                    this.f17186o.unbindService(this);
                    pVar4.f17182b = false;
                }
                pVar4.f17183c = null;
                return true;
            }
        } else {
            if (i7 != 3) {
                return false;
            }
            p pVar5 = (p) this.f17188q.get((ComponentName) message.obj);
            if (pVar5 != null) {
                a(pVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f17187p.obtainMessage(1, new o(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f17187p.obtainMessage(2, componentName).sendToTarget();
    }
}
