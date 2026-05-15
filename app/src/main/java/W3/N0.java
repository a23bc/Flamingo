package w3;

import A2.RunnableC0022x;
import X.AbstractC0496q;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import k.C1116d;
import t.C1450e;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 extends Service {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f19023o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f19024p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1450e f19025q = new C1450e(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M0 f19026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1116d f19027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC1730i0 f19028t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1.k f19029u;

    public final void a(C1751t0 c1751t0) {
        C1751t0 c1751t02;
        AbstractC1697a.g(c1751t0, "session must not be null");
        boolean z6 = true;
        AbstractC1697a.c("session is already released", !c1751t0.f19363a.h());
        synchronized (this.f19023o) {
            c1751t02 = (C1751t0) this.f19025q.get(c1751t0.f19363a.f18905i);
            if (c1751t02 != null && c1751t02 != c1751t0) {
                z6 = false;
            }
            AbstractC1697a.c("Session ID should be unique", z6);
            this.f19025q.put(c1751t0.f19363a.f18905i, c1751t0);
        }
        if (c1751t02 == null) {
            w2.t.G(this.f19024p, new A2.d0(this, c(), c1751t0, 13));
        }
    }

    public final C1.k b() {
        C1.k kVar;
        synchronized (this.f19023o) {
            try {
                if (this.f19029u == null) {
                    this.f19029u = new C1.k((Object) this);
                }
                kVar = this.f19029u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public final C1116d c() {
        C1116d c1116d;
        synchronized (this.f19023o) {
            try {
                if (this.f19027s == null) {
                    if (this.f19028t == null) {
                        this.f19028t = new t2.E(getApplicationContext(), new t2.c0(7));
                    }
                    this.f19027s = new C1116d(this, this.f19028t, b());
                }
                c1116d = this.f19027s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1116d;
    }

    public final M0 d() {
        M0 m02;
        synchronized (this.f19023o) {
            m02 = this.f19026r;
            AbstractC1697a.j(m02);
        }
        return m02;
    }

    public final boolean e(C1751t0 c1751t0) {
        boolean zContainsKey;
        synchronized (this.f19023o) {
            zContainsKey = this.f19025q.containsKey(c1751t0.f19363a.f18905i);
        }
        return zContainsKey;
    }

    public final void f(C1751t0 c1751t0, boolean z6) {
        C1760y c1760yA;
        C1760y c1760y;
        E4.I iL0;
        C1116d c1116dC = c();
        if (!((N0) c1116dC.f13884c).e(c1751t0) || (c1760yA = c1116dC.a(c1751t0)) == null || c1760yA.m0().p() || c1760yA.d() == 1) {
            c1116dC.b(true);
            return;
        }
        int i7 = c1116dC.f13882a + 1;
        c1116dC.f13882a = i7;
        I4.y yVar = (I4.y) ((HashMap) c1116dC.f13889i).get(c1751t0);
        if (yVar == null || !yVar.isDone()) {
            c1760y = null;
        } else {
            try {
                c1760y = (C1760y) M3.a.O(yVar);
            } catch (ExecutionException unused) {
                c1760y = null;
            }
        }
        if (c1760y != null) {
            c1760y.R0();
            InterfaceC1758x interfaceC1758x = c1760y.f19399c;
            if (interfaceC1758x.H0()) {
                iL0 = interfaceC1758x.L0();
            } else {
                E4.G g6 = E4.I.f1870p;
                iL0 = E4.b0.f1913s;
            }
        } else {
            E4.G g7 = E4.I.f1870p;
            iL0 = E4.b0.f1913s;
        }
        w2.t.G(new Handler(c1751t0.a().M0()), new RunnableC1732j0(c1116dC, c1751t0, iL0, new A2.F(c1116dC, i7, c1751t0, 4), z6, 0));
    }

    public final boolean g(C1751t0 c1751t0, boolean z6) {
        try {
            f(c1751t0, c().c(c1751t0, z6));
            return true;
        } catch (IllegalStateException e7) {
            if (w2.t.f18881a < 31 || !L0.a(e7)) {
                throw e7;
            }
            AbstractC1697a.n("Failed to start foreground", e7);
            this.f19024p.post(new B2.e(25, this));
            return false;
        }
    }

    public final void h(C1751t0 c1751t0) {
        AbstractC1697a.g(c1751t0, "session must not be null");
        synchronized (this.f19023o) {
            AbstractC1697a.c("session not found", this.f19025q.containsKey(c1751t0.f19363a.f18905i));
            this.f19025q.remove(c1751t0.f19363a.f18905i);
        }
        w2.t.G(this.f19024p, new RunnableC0022x(c(), 20, c1751t0));
    }

    public final void i(InterfaceC1730i0 interfaceC1730i0) {
        synchronized (this.f19023o) {
            this.f19028t = interfaceC1730i0;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        O0 o02;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            return d();
        }
        if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        }
        if (TextUtils.isEmpty("android.media.session.MediaController")) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0496q.v("android.media.session.MediaController", -1, -1);
        }
        Bundle bundle = Bundle.EMPTY;
        C1751t0 c1751t0 = b6.i.f10425e;
        if (c1751t0 == null) {
            return null;
        }
        a(c1751t0);
        A0 a0 = c1751t0.f19363a;
        synchronized (a0.f18898a) {
            try {
                if (a0.f18918w == null) {
                    x3.Y y6 = a0.f18907k.f19363a.h.f19005k.f20025a.f20007c;
                    O0 o03 = new O0(a0);
                    o03.b(y6);
                    a0.f18918w = o03;
                }
                o02 = a0.f18918w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o02.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        synchronized (this.f19023o) {
            this.f19026r = new M0(this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        synchronized (this.f19023o) {
            try {
                M0 m02 = this.f19026r;
                if (m02 != null) {
                    m02.f19016c.clear();
                    m02.f19017d.removeCallbacksAndMessages(null);
                    Iterator it = m02.f19019f.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC1737m) it.next()).a();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f19026r = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        C1751t0 c1751t0;
        C1751t0 c1751t02;
        if (intent != null) {
            C1.k kVarB = b();
            Uri data = intent.getData();
            if (data != null) {
                synchronized (C1751t0.f19361b) {
                    try {
                        Iterator it = C1751t0.f19362c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c1751t02 = null;
                                break;
                            }
                            c1751t02 = (C1751t0) it.next();
                            if (w2.t.a(c1751t02.f19363a.f18899b, data)) {
                            }
                        }
                    } finally {
                    }
                }
                c1751t0 = c1751t02;
            } else {
                c1751t0 = null;
            }
            kVarB.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (c1751t0 == null) {
                    if (TextUtils.isEmpty("android.media.session.MediaController")) {
                        throw new IllegalArgumentException("packageName should be nonempty");
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        AbstractC0496q.v("android.media.session.MediaController", -1, -1);
                    }
                    Bundle bundle = Bundle.EMPTY;
                    c1751t0 = b6.i.f10425e;
                    if (c1751t0 != null) {
                        a(c1751t0);
                    }
                }
                A0 a0 = c1751t0.f19363a;
                a0.l.post(new RunnableC0022x(a0, 19, intent));
                return 1;
            }
            if (c1751t0 != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle2 = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    C1116d c1116dC = c();
                    C1760y c1760yA = c1116dC.a(c1751t0);
                    if (c1760yA != null) {
                        w2.t.G(new Handler(c1751t0.a().M0()), new C2.F(c1116dC, c1751t0, str, bundle2, c1760yA, 3));
                    }
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (c().f13883b) {
            return;
        }
        stopSelf();
    }
}
