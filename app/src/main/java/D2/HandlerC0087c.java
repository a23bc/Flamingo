package D2;

import E4.G;
import E4.I;
import G1.T;
import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import c.C0706d;
import com.blankj.utilcode.util.MessengerUtils$ServerService;
import d2.C0821i;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import t4.AbstractC1507b;
import w2.AbstractC1697a;
import w3.C1747r0;
import w3.InterfaceC1746q0;
import x3.AbstractC1914P;
import x3.AbstractServiceC1940y;
import x3.C1928m;
import x3.RunnableC1936u;
import x3.RunnableC1937v;
import x3.RunnableC1938w;
import x3.RunnableC1939x;
import x3.S;
import x3.Z;
import x3.f0;

/* JADX INFO: renamed from: D2.c */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0087c extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1469a;

    /* JADX INFO: renamed from: b */
    public Object f1470b;

    public /* synthetic */ HandlerC0087c(int i7) {
        this.f1469a = i7;
    }

    private final void a(Message message) {
        F2.e eVar = (F2.e) this.f1470b;
        eVar.getClass();
        int i7 = message.what;
        F2.d dVar = null;
        if (i7 == 1) {
            F2.d dVar2 = (F2.d) message.obj;
            try {
                eVar.f2197o.queueInputBuffer(dVar2.f2190a, 0, dVar2.f2191b, dVar2.f2193d, dVar2.f2194e);
            } catch (RuntimeException e7) {
                AtomicReference atomicReference = eVar.f2200r;
                while (!atomicReference.compareAndSet(null, e7) && atomicReference.get() == null) {
                }
            }
            dVar = dVar2;
        } else if (i7 == 2) {
            F2.d dVar3 = (F2.d) message.obj;
            int i8 = dVar3.f2190a;
            MediaCodec.CryptoInfo cryptoInfo = dVar3.f2192c;
            long j3 = dVar3.f2193d;
            int i9 = dVar3.f2194e;
            try {
                synchronized (F2.e.f2196v) {
                    eVar.f2197o.queueSecureInputBuffer(i8, 0, cryptoInfo, j3, i9);
                }
            } catch (RuntimeException e8) {
                AtomicReference atomicReference2 = eVar.f2200r;
                while (!atomicReference2.compareAndSet(null, e8) && atomicReference2.get() == null) {
                }
            }
            dVar = dVar3;
        } else if (i7 == 3) {
            eVar.f2201s.e();
        } else if (i7 != 4) {
            AtomicReference atomicReference3 = eVar.f2200r;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                eVar.f2197o.setParameters((Bundle) message.obj);
            } catch (RuntimeException e9) {
                AtomicReference atomicReference4 = eVar.f2200r;
                while (!atomicReference4.compareAndSet(null, e9) && atomicReference4.get() == null) {
                }
            }
        }
        if (dVar != null) {
            F2.e.e(dVar);
        }
    }

    public void b(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        int i7;
        String str;
        S s7;
        AbstractC1914P abstractC1914P;
        HandlerC0087c handlerC0087c;
        int i8 = 0;
        switch (this.f1469a) {
            case 0:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i9 = message.what;
                if (i9 != 1) {
                    if (i9 != 2) {
                        return;
                    }
                    C0089e c0089e = (C0089e) this.f1470b;
                    if (obj == c0089e.f1491w && c0089e.k()) {
                        c0089e.f1491w = null;
                        if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                            c0089e.m((Throwable) obj2, false);
                            return;
                        }
                        try {
                            byte[] bArrO = c0089e.f1472b.o(c0089e.f1489u, (byte[]) obj2);
                            if (c0089e.f1490v != null && bArrO != null && bArrO.length != 0) {
                                c0089e.f1490v = bArrO;
                            }
                            c0089e.f1483o = 4;
                            c0089e.i(new B2.g(2));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            c0089e.m(e, true);
                            return;
                        } catch (NoSuchMethodError e8) {
                            e = e8;
                            c0089e.m(e, true);
                            return;
                        }
                    }
                    return;
                }
                C0089e c0089e2 = (C0089e) this.f1470b;
                if (obj == c0089e2.f1492x) {
                    if (c0089e2.f1483o == 2 || c0089e2.k()) {
                        c0089e2.f1492x = null;
                        boolean z6 = obj2 instanceof Exception;
                        V.o oVar = c0089e2.f1473c;
                        if (z6) {
                            oVar.y((Exception) obj2, false);
                            return;
                        }
                        try {
                            c0089e2.f1472b.u((byte[]) obj2);
                            oVar.f7343q = null;
                            HashSet hashSet = (HashSet) oVar.f7342p;
                            I iP = I.p(hashSet);
                            hashSet.clear();
                            G gListIterator = iP.listIterator(0);
                            while (gListIterator.hasNext()) {
                                C0089e c0089e3 = (C0089e) gListIterator.next();
                                if (c0089e3.n()) {
                                    c0089e3.j(true);
                                }
                            }
                            return;
                        } catch (Exception e9) {
                            oVar.y(e9, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                for (C0089e c0089e4 : ((i) this.f1470b).f1520z) {
                    c0089e4.p();
                    if (Arrays.equals(c0089e4.f1489u, bArr)) {
                        if (message.what == 2 && c0089e4.f1483o == 4) {
                            int i10 = w2.t.f18881a;
                            c0089e4.j(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                a(message);
                return;
            case 3:
                int i11 = message.what;
                if (i11 == -3 || i11 == -2 || i11 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f1470b).get(), message.what);
                    return;
                } else {
                    if (i11 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 4:
                int i12 = message.what;
                MessengerUtils$ServerService messengerUtils$ServerService = (MessengerUtils$ServerService) this.f1470b;
                ConcurrentHashMap concurrentHashMap = messengerUtils$ServerService.f10704o;
                if (i12 == 0) {
                    concurrentHashMap.put(Integer.valueOf(message.arg1), message.replyTo);
                    return;
                }
                if (i12 == 1) {
                    concurrentHashMap.remove(Integer.valueOf(message.arg1));
                    return;
                }
                if (i12 != 2) {
                    super.handleMessage(message);
                    return;
                }
                int i13 = MessengerUtils$ServerService.f10703r;
                messengerUtils$ServerService.a(message);
                Bundle data = message.getData();
                if (data != null && (string = data.getString("MESSENGER_UTILS")) != null && AbstractC1507b.f17068a.get(string) != null) {
                    throw new ClassCastException();
                }
                return;
            case 5:
                C1747r0 c1747r0 = (C1747r0) message.obj;
                U3.h hVar = (U3.h) this.f1470b;
                if (hVar.Z(c1747r0)) {
                    try {
                        InterfaceC1746q0 interfaceC1746q0 = c1747r0.f19339d;
                        AbstractC1697a.j(interfaceC1746q0);
                        interfaceC1746q0.a();
                        break;
                    } catch (RemoteException unused) {
                    }
                    hVar.k0(c1747r0);
                    return;
                }
                return;
            case 6:
                AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) this.f1470b;
                if (abstractServiceC1940y == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                Bundle data2 = message.getData();
                int i14 = message.what;
                k.I i15 = abstractServiceC1940y.f20125p;
                switch (i14) {
                    case 1:
                        Bundle bundle = data2.getBundle("data_root_hints");
                        Z.a(bundle);
                        String string2 = data2.getString("data_package_name");
                        int i16 = data2.getInt("data_calling_pid");
                        int i17 = data2.getInt("data_calling_uid");
                        k.I i18 = new k.I(22, message.replyTo);
                        AbstractServiceC1940y abstractServiceC1940y2 = (AbstractServiceC1940y) i15.f13847p;
                        if (string2 != null) {
                            String[] packagesForUid = abstractServiceC1940y2.getPackageManager().getPackagesForUid(i17);
                            if (packagesForUid != null) {
                                int length = packagesForUid.length;
                                while (i8 < length) {
                                    if (packagesForUid[i8].equals(string2)) {
                                        abstractServiceC1940y2.f20130u.b(new RunnableC1936u(i16, i17, bundle, string2, i15, i18));
                                        return;
                                    }
                                    i8++;
                                    string2 = string2;
                                    i17 = i17;
                                    i18 = i18;
                                }
                            }
                            String str2 = string2;
                            i7 = i17;
                            str = str2;
                        } else {
                            i7 = i17;
                            str = string2;
                            abstractServiceC1940y2.getClass();
                        }
                        throw new IllegalArgumentException("Package/uid mismatch: uid=" + i7 + " package=" + str);
                    case 2:
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new RunnableC1937v(i15, new k.I(22, message.replyTo), 0));
                        return;
                    case 3:
                        Bundle bundle2 = data2.getBundle("data_options");
                        Z.a(bundle2);
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new X3.l(i15, new k.I(22, message.replyTo), data2.getString("data_media_item_id"), data2.getBinder("data_callback_token"), bundle2, 1));
                        return;
                    case 4:
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new T(i15, new k.I(22, message.replyTo), data2.getString("data_media_item_id"), data2.getBinder("data_callback_token"), 2));
                        return;
                    case 5:
                        String string3 = data2.getString("data_media_item_id");
                        C0706d c0706d = (C0706d) data2.getParcelable("data_result_receiver");
                        k.I i19 = new k.I(22, message.replyTo);
                        i15.getClass();
                        if (TextUtils.isEmpty(string3) || c0706d == null) {
                            return;
                        }
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new RunnableC1938w(i15, i19, string3, c0706d));
                        return;
                    case 6:
                        Bundle bundle3 = data2.getBundle("data_root_hints");
                        Z.a(bundle3);
                        k.I i20 = new k.I(22, message.replyTo);
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new RunnableC1939x(data2.getInt("data_calling_uid"), data2.getInt("data_calling_pid"), bundle3, data2.getString("data_package_name"), i15, i20));
                        return;
                    case 7:
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new RunnableC1937v(i15, new k.I(22, message.replyTo), 1));
                        return;
                    case 8:
                        Bundle bundle4 = data2.getBundle("data_search_extras");
                        Z.a(bundle4);
                        String string4 = data2.getString("data_search_query");
                        C0706d c0706d2 = (C0706d) data2.getParcelable("data_result_receiver");
                        k.I i21 = new k.I(22, message.replyTo);
                        i15.getClass();
                        if (TextUtils.isEmpty(string4) || c0706d2 == null) {
                            return;
                        }
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new RunnableC1938w(i15, i21, string4, bundle4, c0706d2));
                        return;
                    case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                        Bundle bundle5 = data2.getBundle("data_custom_action_extras");
                        Z.a(bundle5);
                        String string5 = data2.getString("data_custom_action");
                        C0706d c0706d3 = (C0706d) data2.getParcelable("data_result_receiver");
                        k.I i22 = new k.I(22, message.replyTo);
                        i15.getClass();
                        if (TextUtils.isEmpty(string5) || c0706d3 == null) {
                            return;
                        }
                        ((AbstractServiceC1940y) i15.f13847p).f20130u.b(new T(i15, i22, string5, bundle5, c0706d3));
                        return;
                    default:
                        message.toString();
                        return;
                }
            default:
                if (message.what == 1) {
                    synchronized (((AbstractC1914P) this.f1470b).f19998a) {
                        s7 = (S) ((AbstractC1914P) this.f1470b).f20001d.get();
                        abstractC1914P = (AbstractC1914P) this.f1470b;
                        handlerC0087c = abstractC1914P.f20002e;
                        break;
                    }
                    if (s7 == null || abstractC1914P != s7.b() || handlerC0087c == null) {
                        return;
                    }
                    s7.f((f0) message.obj);
                    ((AbstractC1914P) this.f1470b).a(s7, handlerC0087c);
                    s7.f(null);
                    return;
                }
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j3) {
        switch (this.f1469a) {
            case 6:
                Bundle data = message.getData();
                ClassLoader classLoader = C1928m.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0087c(Object obj, Looper looper, int i7) {
        super(looper);
        this.f1469a = i7;
        this.f1470b = obj;
    }

    public HandlerC0087c(MessengerUtils$ServerService messengerUtils$ServerService) {
        this.f1469a = 4;
        this.f1470b = messengerUtils$ServerService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0087c(Looper looper, U3.h hVar) {
        super(looper);
        this.f1469a = 5;
        this.f1470b = hVar;
    }
}
