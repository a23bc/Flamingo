package w3;

import A2.RunnableC0022x;
import C2.C0039k;
import Q0.C0348f0;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import g1.ExecutorC0984z;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import m5.AbstractC1209k;
import t2.C1482k;
import t2.C1485n;
import v4.C1640c;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public class A0 {

    /* JADX INFO: renamed from: A */
    public E4.I f18896A;

    /* JADX INFO: renamed from: B */
    public final Bundle f18897B;

    /* JADX INFO: renamed from: a */
    public final Object f18898a;

    /* JADX INFO: renamed from: b */
    public final Uri f18899b;

    /* JADX INFO: renamed from: c */
    public final HandlerC1761y0 f18900c;

    /* JADX INFO: renamed from: d */
    public final HandlerC1759x0 f18901d;

    /* JADX INFO: renamed from: e */
    public final A0.b f18902e;

    /* JADX INFO: renamed from: f */
    public final YosPlaybackService f18903f;

    /* JADX INFO: renamed from: g */
    public final i1 f18904g;
    public final K0 h;

    /* JADX INFO: renamed from: i */
    public final String f18905i;

    /* JADX INFO: renamed from: j */
    public final B1 f18906j;

    /* JADX INFO: renamed from: k */
    public final C1751t0 f18907k;
    public final Handler l;

    /* JADX INFO: renamed from: m */
    public final V1.a f18908m;

    /* JADX INFO: renamed from: n */
    public final RunnableC1753u0 f18909n;

    /* JADX INFO: renamed from: o */
    public final Handler f18910o;

    /* JADX INFO: renamed from: p */
    public final boolean f18911p;

    /* JADX INFO: renamed from: q */
    public final boolean f18912q;

    /* JADX INFO: renamed from: r */
    public n1 f18913r;

    /* JADX INFO: renamed from: s */
    public r1 f18914s;

    /* JADX INFO: renamed from: t */
    public final PendingIntent f18915t;

    /* JADX INFO: renamed from: u */
    public b6.u f18916u;

    /* JADX INFO: renamed from: v */
    public k.I f18917v;

    /* JADX INFO: renamed from: w */
    public O0 f18918w;

    /* JADX INFO: renamed from: x */
    public boolean f18919x;

    /* JADX INFO: renamed from: y */
    public final long f18920y;

    /* JADX INFO: renamed from: z */
    public boolean f18921z;

    static {
        new z1(1);
    }

    public A0(C1751t0 c1751t0, YosPlaybackService yosPlaybackService, b6.v vVar, PendingIntent pendingIntent, E4.b0 b0Var, A0.b bVar, V1.a aVar) {
        Bundle bundle = Bundle.EMPTY;
        this.f18898a = new Object();
        AbstractC1697a.q("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + w2.t.f18885e + "]");
        this.f18907k = c1751t0;
        this.f18903f = yosPlaybackService;
        this.f18905i = "";
        this.f18915t = pendingIntent;
        this.f18896A = b0Var;
        this.f18902e = bVar;
        this.f18897B = bundle;
        this.f18908m = aVar;
        this.f18911p = true;
        this.f18912q = true;
        i1 i1Var = new i1(this);
        this.f18904g = i1Var;
        this.f18910o = new Handler(Looper.getMainLooper());
        Looper looperM0 = ((t2.X) vVar.f2813b).M0();
        Handler handler = new Handler(looperM0);
        this.l = handler;
        this.f18913r = n1.f19254F;
        this.f18900c = new HandlerC1761y0(this, looperM0);
        this.f18901d = new HandlerC1759x0(this, looperM0);
        Uri uriBuild = new Uri.Builder().scheme(A0.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f18899b = uriBuild;
        this.f18906j = new B1(Process.myUid(), 1004000300, 4, yosPlaybackService.getPackageName(), i1Var, bundle);
        this.h = new K0(this, uriBuild, handler);
        t2.T t7 = C1744p0.f19320e;
        w1 w1Var = C1744p0.f19319d;
        r1 r1Var = new r1(4, vVar);
        r1Var.f19341c = b0Var;
        r1Var.f19342d = w1Var;
        r1Var.f19343e = t7;
        this.f18914s = r1Var;
        w2.t.G(handler, new RunnableC0022x(this, 15, r1Var));
        this.f18920y = 3000L;
        this.f18909n = new RunnableC1753u0(this, 1);
        w2.t.G(handler, new RunnableC1753u0(this, 2));
    }

    public static boolean i(C1747r0 c1747r0) {
        return c1747r0 != null && c1747r0.f19337b == 0 && Objects.equals(c1747r0.f19336a.f20039a.f20036a, "com.android.systemui");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.KeyEvent r4, boolean r5) {
        /*
            r3 = this;
            w3.t0 r0 = r3.f18907k
            w3.A0 r0 = r0.f19363a
            w3.r0 r0 = r0.d()
            r0.getClass()
            int r4 = r4.getKeyCode()
            r1 = 85
            r2 = 126(0x7e, float:1.77E-43)
            if (r4 == r1) goto L17
            if (r4 != r2) goto L1b
        L17:
            if (r5 == 0) goto L1b
            r4 = 87
        L1b:
            if (r4 == r2) goto L70
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 == r5) goto L69
            r5 = 272(0x110, float:3.81E-43)
            if (r4 == r5) goto L62
            r5 = 273(0x111, float:3.83E-43)
            if (r4 == r5) goto L5b
            switch(r4) {
                case 85: goto L45;
                case 86: goto L3e;
                case 87: goto L62;
                case 88: goto L5b;
                case 89: goto L36;
                case 90: goto L2e;
                default: goto L2c;
            }
        L2c:
            r4 = 0
            return r4
        L2e:
            w3.c r4 = new w3.c
            r5 = 8
            r4.<init>(r3, r0, r5)
            goto L76
        L36:
            w3.c r4 = new w3.c
            r5 = 9
            r4.<init>(r3, r0, r5)
            goto L76
        L3e:
            w3.c r4 = new w3.c
            r5 = 1
            r4.<init>(r3, r0, r5)
            goto L76
        L45:
            w3.r1 r4 = r3.f18914s
            boolean r4 = r4.C()
            if (r4 == 0) goto L54
            w3.c r4 = new w3.c
            r5 = 2
            r4.<init>(r3, r0, r5)
            goto L76
        L54:
            w3.c r4 = new w3.c
            r5 = 3
            r4.<init>(r3, r0, r5)
            goto L76
        L5b:
            w3.c r4 = new w3.c
            r5 = 7
            r4.<init>(r3, r0, r5)
            goto L76
        L62:
            w3.c r4 = new w3.c
            r5 = 6
            r4.<init>(r3, r0, r5)
            goto L76
        L69:
            w3.c r4 = new w3.c
            r5 = 5
            r4.<init>(r3, r0, r5)
            goto L76
        L70:
            w3.c r4 = new w3.c
            r5 = 4
            r4.<init>(r3, r0, r5)
        L76:
            android.os.Handler r5 = r3.l
            A2.d0 r1 = new A2.d0
            r2 = 11
            r1.<init>(r3, r4, r0, r2)
            w2.t.G(r5, r1)
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.A0.a(android.view.KeyEvent, boolean):boolean");
    }

    public final void b(C1747r0 c1747r0, InterfaceC1763z0 interfaceC1763z0) {
        int iB;
        i1 i1Var = this.f18904g;
        try {
            C0348f0 c0348f0W = i1Var.f19226e.W(c1747r0);
            if (c0348f0W != null) {
                iB = c0348f0W.b();
            } else {
                if (!(i1Var.f19226e.Z(c1747r0) || this.h.f19001f.Z(c1747r0))) {
                    return;
                } else {
                    iB = 0;
                }
            }
            InterfaceC1746q0 interfaceC1746q0 = c1747r0.f19339d;
            if (interfaceC1746q0 != null) {
                interfaceC1763z0.e(interfaceC1746q0, iB);
            }
        } catch (DeadObjectException unused) {
            i1Var.f19226e.k0(c1747r0);
        } catch (RemoteException e7) {
            AbstractC1697a.x("Exception in " + c1747r0.toString(), e7);
        }
    }

    public final void c(InterfaceC1763z0 interfaceC1763z0) {
        E4.I iR = this.f18904g.f19226e.R();
        for (int i7 = 0; i7 < iR.size(); i7++) {
            b((C1747r0) iR.get(i7), interfaceC1763z0);
        }
        try {
            interfaceC1763z0.e(this.h.f19003i, 0);
        } catch (RemoteException e7) {
            AbstractC1697a.n("Exception in using media1 API", e7);
        }
    }

    public final C1747r0 d() {
        E4.I iR = this.f18904g.f19226e.R();
        for (int i7 = 0; i7 < iR.size(); i7++) {
            C1747r0 c1747r0 = (C1747r0) iR.get(i7);
            if (g(c1747r0)) {
                return c1747r0;
            }
        }
        return null;
    }

    public final void e(t2.T t7) {
        this.f18900c.a(false, false);
        c(new C1719d0(t7));
        try {
            C1640c c1640c = this.h.f19003i;
            C1482k c1482k = this.f18913r.f19303q;
            c1640c.m();
        } catch (RemoteException e7) {
            AbstractC1697a.n("Exception in using media1 API", e7);
        }
    }

    public final void f(C1747r0 c1747r0, boolean z6) {
        if (n()) {
            boolean z7 = this.f18914s.K0(16) && this.f18914s.I0() != null;
            boolean z8 = this.f18914s.K0(31) || this.f18914s.K0(20);
            C1747r0 c1747r0R = r(c1747r0);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            AbstractC1697a.i(!false);
            sparseBooleanArray.append(1, true);
            AbstractC1697a.i(!false);
            t2.T t7 = new t2.T(new C1485n(sparseBooleanArray));
            if (z7 || !z8) {
                if (!z7) {
                    AbstractC1697a.w("Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                w2.t.x(this.f18914s);
                if (z6) {
                    o(c1747r0R, t7);
                    return;
                }
                return;
            }
            this.f18902e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            I4.u uVar = new I4.u();
            uVar.m(unsupportedOperationException);
            uVar.b(new I4.t(uVar, 0, new D2.B(this, c1747r0R, z6, t7)), new ExecutorC0984z(2, this));
        }
    }

    public final boolean g(C1747r0 c1747r0) {
        return Objects.equals(c1747r0.f19336a.f20039a.f20036a, this.f18903f.getPackageName()) && c1747r0.f19337b != 0 && new Bundle(c1747r0.f19340e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f18898a) {
            z6 = this.f18919x;
        }
        return z6;
    }

    public final I4.y j(C1747r0 c1747r0, E4.b0 b0Var) {
        r(c1747r0);
        this.f18902e.getClass();
        return n1.c.e(b0Var);
    }

    public final C1744p0 k(C1747r0 c1747r0) {
        if (this.f18921z && i(c1747r0)) {
            w1 w1Var = C1744p0.f19319d;
            w1 w1Var2 = this.f18914s.f19342d;
            w1Var2.getClass();
            t2.T t7 = this.f18914s.f19343e;
            t7.getClass();
            E4.I i7 = this.f18914s.f19341c;
            return new C1744p0(w1Var2, t7, i7 != null ? E4.I.p(i7) : null);
        }
        A0.b bVar = this.f18902e;
        bVar.getClass();
        C1751t0 c1751t0 = this.f18907k;
        AbstractC1209k.f(c1751t0, "session");
        w1 w1Var3 = C1744p0.f19319d;
        w1Var3.getClass();
        HashSet hashSet = new HashSet(w1Var3.f19387a);
        YosPlaybackService yosPlaybackService = (YosPlaybackService) bVar.f50p;
        Bundle bundle = Bundle.EMPTY;
        hashSet.add(new v1(yosPlaybackService.f20582v, bundle));
        hashSet.add(new v1(yosPlaybackService.f20583w, bundle));
        w1 w1Var4 = new w1(hashSet);
        t2.T t8 = C1744p0.f19320e;
        C1744p0 c1744p0 = new C1744p0(w1Var4, t8, null);
        if (g(c1747r0)) {
            this.f18921z = true;
            r1 r1Var = this.f18914s;
            r1Var.f19341c = c1751t0.f19363a.f18896A;
            boolean z6 = r1Var.f19343e.a(17) != t8.a(17);
            r1 r1Var2 = this.f18914s;
            r1Var2.f19342d = w1Var4;
            r1Var2.f19343e = t8;
            K0 k02 = this.h;
            if (z6) {
                w2.t.G(k02.f19002g.l, new E0(k02, r1Var2, 1));
                return c1744p0;
            }
            k02.M(r1Var2);
        }
        return c1744p0;
    }

    public final I4.y l(C1747r0 c1747r0, v1 v1Var, Bundle bundle) {
        C1747r0 c1747r0R = r(c1747r0);
        A0.b bVar = this.f18902e;
        bVar.getClass();
        AbstractC1209k.f(this.f18907k, "session");
        AbstractC1209k.f(c1747r0R, "controller");
        AbstractC1209k.f(bundle, "args");
        YosPlaybackService yosPlaybackService = (YosPlaybackService) bVar.f50p;
        String str = yosPlaybackService.f20582v;
        String str2 = v1Var.f19383b;
        boolean zA = AbstractC1209k.a(str2, str);
        b6.v vVar = (b6.v) bVar.f52r;
        A2.N n7 = (A2.N) bVar.f51q;
        if (zA) {
            n7.x1();
            n7.E(!n7.f96H);
            yosPlaybackService.k(vVar);
        } else if (AbstractC1209k.a(str2, yosPlaybackService.f20583w)) {
            n7.x1();
            int i7 = n7.f95G;
            if (i7 == 0) {
                n7.f(2);
            } else if (i7 != 2) {
                n7.f(0);
            } else {
                n7.f(1);
            }
            yosPlaybackService.k(vVar);
        }
        return M3.a.U(new z1(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(w3.C1747r0 r10, android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.A0.m(w3.r0, android.content.Intent):boolean");
    }

    public final boolean n() {
        int i7;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            I4.E e7 = new I4.E();
            this.f18910o.post(new RunnableC0022x(this, 17, e7));
            try {
                return ((Boolean) e7.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e8) {
                throw new IllegalStateException(e8);
            }
        }
        k.I i8 = this.f18917v;
        if (i8 != null && (i7 = w2.t.f18881a) >= 31 && i7 < 33) {
            N0 n02 = (N0) i8.f13847p;
            if (!n02.c().f13883b) {
                return n02.g(this.f18907k, true);
            }
        }
        return true;
    }

    public final void o(C1747r0 c1747r0, t2.T t7) {
        r(c1747r0);
        this.f18902e.getClass();
    }

    public final I4.y p(C1747r0 c1747r0, E4.b0 b0Var, final int i7, final long j3) {
        r(c1747r0);
        this.f18902e.getClass();
        return w2.t.M(n1.c.e(b0Var), new I4.q() { // from class: w3.o0
            @Override // I4.q
            public final I4.y apply(Object obj) {
                return M3.a.U(new C1749s0((List) obj, i7, j3));
            }
        });
    }

    public final void q() {
        AbstractC1697a.q("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + w2.t.f18885e + "] [" + t2.H.b() + "]");
        synchronized (this.f18898a) {
            try {
                if (this.f18919x) {
                    return;
                }
                this.f18919x = true;
                HandlerC1759x0 handlerC1759x0 = this.f18901d;
                A2.d0 d0Var = (A2.d0) handlerC1759x0.f19389b;
                if (d0Var != null) {
                    handlerC1759x0.removeCallbacks(d0Var);
                    handlerC1759x0.f19389b = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    w2.t.G(this.l, new RunnableC1753u0(this, 0));
                } catch (Exception e7) {
                    AbstractC1697a.x("Exception thrown while closing", e7);
                }
                K0 k02 = this.h;
                k02.getClass();
                int i7 = w2.t.f18881a;
                A0 a0 = k02.f19002g;
                x3.Z z6 = k02.f19005k;
                if (i7 < 31) {
                    ComponentName componentName = k02.f19006m;
                    if (componentName == null) {
                        z6.f20025a.f20005a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", a0.f18899b);
                        intent.setComponent(componentName);
                        z6.f20025a.f20005a.setMediaButtonReceiver(PendingIntent.getBroadcast(a0.f18903f, 0, intent, K0.f19000r));
                    }
                }
                C0039k c0039k = k02.l;
                if (c0039k != null) {
                    a0.f18903f.unregisterReceiver(c0039k);
                }
                x3.S s7 = z6.f20025a;
                s7.f20010f.kill();
                int i8 = Build.VERSION.SDK_INT;
                MediaSession mediaSession = s7.f20005a;
                if (i8 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception unused) {
                    }
                }
                mediaSession.setCallback(null);
                s7.f20006b.f20004c.set(null);
                mediaSession.release();
                i1 i1Var = this.f18904g;
                Iterator it = i1Var.f19226e.R().iterator();
                while (it.hasNext()) {
                    InterfaceC1746q0 interfaceC1746q0 = ((C1747r0) it.next()).f19339d;
                    if (interfaceC1746q0 != null) {
                        try {
                            interfaceC1746q0.a();
                        } catch (RemoteException unused2) {
                        }
                    }
                }
                Iterator it2 = i1Var.f19227f.iterator();
                while (it2.hasNext()) {
                    InterfaceC1746q0 interfaceC1746q02 = ((C1747r0) it2.next()).f19339d;
                    if (interfaceC1746q02 != null) {
                        try {
                            interfaceC1746q02.a();
                        } catch (RemoteException unused3) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1747r0 r(C1747r0 c1747r0) {
        if (!this.f18921z || !i(c1747r0)) {
            return c1747r0;
        }
        C1747r0 c1747r0D = d();
        c1747r0D.getClass();
        return c1747r0D;
    }

    public final void s() {
        Handler handler = this.l;
        RunnableC1753u0 runnableC1753u0 = this.f18909n;
        handler.removeCallbacks(runnableC1753u0);
        if (this.f18912q) {
            long j3 = this.f18920y;
            if (j3 > 0) {
                if (this.f18914s.L() || this.f18914s.c()) {
                    handler.postDelayed(runnableC1753u0, j3);
                }
            }
        }
    }

    public final void t() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
