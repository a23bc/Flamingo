package w3;

import A2.C0020v;
import A2.C0021w;
import A2.C0023y;
import A2.RunnableC0022x;
import Q0.C0348f0;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import t.C1450e;
import t2.BinderC1478g;
import t2.C1476e;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends Binder implements InterfaceC1741o {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f19223i = 0;

    /* JADX INFO: renamed from: c */
    public final WeakReference f19224c;

    /* JADX INFO: renamed from: d */
    public final x3.g0 f19225d;

    /* JADX INFO: renamed from: e */
    public final U3.h f19226e;

    /* JADX INFO: renamed from: f */
    public final Set f19227f;

    /* JADX INFO: renamed from: g */
    public E4.a0 f19228g;
    public int h;

    public i1(A0 a0) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f19224c = new WeakReference(a0);
        this.f19225d = x3.g0.a(a0.f18903f);
        this.f19226e = new U3.h(a0);
        this.f19227f = Collections.synchronizedSet(new HashSet());
        this.f19228g = E4.a0.f1906w;
    }

    public static I4.y r1(A0 a0, C1747r0 c1747r0, int i7, h1 h1Var, w2.c cVar) {
        if (a0.h()) {
            return I4.v.f3536p;
        }
        I4.y yVar = (I4.y) h1Var.i(a0, c1747r0, i7);
        I4.E e7 = new I4.E();
        yVar.b(new RunnableC1718d(a0, e7, cVar, yVar, 4), I4.r.f3531o);
        return e7;
    }

    public static void v1(C1747r0 c1747r0, int i7, z1 z1Var) {
        try {
            InterfaceC1746q0 interfaceC1746q0 = c1747r0.f19339d;
            AbstractC1697a.j(interfaceC1746q0);
            interfaceC1746q0.c(i7, z1Var);
        } catch (RemoteException e7) {
            AbstractC1697a.x("Failed to send result to controller " + c1747r0, e7);
        }
    }

    public static A2.I w1(w2.c cVar) {
        return new A2.I(25, new A2.I(26, cVar));
    }

    @Override // w3.InterfaceC1741o
    public final void A(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            A0 a0 = (A0) this.f19224c.get();
            if (a0 != null && !a0.h()) {
                w2.t.G(a0.l, new RunnableC0022x(this, 21, interfaceC1737m));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void B0(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9, IBinder iBinder) {
        if (interfaceC1737m == null || iBinder == null || i8 < 0 || i9 < i8) {
            return;
        }
        try {
            E4.I iA = BinderC1478g.a(iBinder);
            E4.F fO = E4.I.o();
            for (int i10 = 0; i10 < iA.size(); i10++) {
                Bundle bundle = (Bundle) iA.get(i10);
                bundle.getClass();
                fO.a(t2.G.a(bundle));
            }
            t1(interfaceC1737m, i7, 20, new C1711a1(new B2.b(new Q0(0, fO.f()), 20, new P0(this, i8, i9)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void C0(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 2, w1(new V0(6)));
    }

    @Override // w3.InterfaceC1741o
    public final void D(InterfaceC1737m interfaceC1737m, int i7, boolean z6) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 26, w1(new A2.B(4, z6)));
    }

    @Override // w3.InterfaceC1741o
    public final void E0(InterfaceC1737m interfaceC1737m, int i7, Surface surface) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 27, w1(new A2.I(24, surface)));
    }

    @Override // w3.InterfaceC1741o
    public final void F(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 8, w1(new t2.c0(21)));
    }

    @Override // w3.InterfaceC1741o
    public final void G(InterfaceC1737m interfaceC1737m, int i7, int i8, Bundle bundle) {
        if (interfaceC1737m == null || bundle == null || i8 < 0) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 20, new C1711a1(new B2.b(new S0(0, t2.G.a(bundle)), 20, new R0(this, i8, 1)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void G0(InterfaceC1737m interfaceC1737m, int i7, final int i8, final int i9, final int i10) {
        if (interfaceC1737m == null || i8 < 0 || i9 < i8 || i10 < 0) {
            return;
        }
        t1(interfaceC1737m, i7, 20, w1(new w2.c() { // from class: w3.U0
            @Override // w2.c
            public final void c(Object obj) {
                ((r1) obj).h0(i8, i9, i10);
            }
        }));
    }

    @Override // w3.InterfaceC1741o
    public final void I(InterfaceC1737m interfaceC1737m, int i7) {
        C1747r0 c1747r0S;
        if (interfaceC1737m == null || (c1747r0S = this.f19226e.S(interfaceC1737m.asBinder())) == null) {
            return;
        }
        u1(c1747r0S, i7, 3, w1(new V0(4)));
    }

    @Override // w3.InterfaceC1741o
    public final void I0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 19, w1(new C0020v(t2.J.b(bundle), 2)));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaMetadata", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void J(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, boolean z6) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 31, new C1711a1(new B2.b(new T0(0, t2.G.a(bundle), z6), 19, new V0(11)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void K(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9) {
        if (interfaceC1737m == null || i8 < 0 || i9 < 0) {
            return;
        }
        t1(interfaceC1737m, i7, 20, w1(new C0021w(i8, i9, 3)));
    }

    @Override // w3.InterfaceC1741o
    public final void L0(InterfaceC1737m interfaceC1737m) {
        if (interfaceC1737m == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            A0 a0 = (A0) this.f19224c.get();
            if (a0 != null && !a0.h()) {
                C1747r0 c1747r0S = this.f19226e.S(interfaceC1737m.asBinder());
                if (c1747r0S != null) {
                    w2.t.G(a0.l, new RunnableC0022x(this, 22, c1747r0S));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void M(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        if (interfaceC1737m == null || i8 < 0) {
            return;
        }
        t1(interfaceC1737m, i7, 25, w1(new A2.A(i8, 6)));
    }

    @Override // w3.InterfaceC1741o
    public final void N(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 20, w1(new V0(9)));
    }

    @Override // w3.InterfaceC1741o
    public final void O0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 29, w1(new B2.b(this, 16, t2.n0.b(bundle))));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for TrackSelectionParameters", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void P(InterfaceC1737m interfaceC1737m, int i7, IBinder iBinder, boolean z6) {
        if (interfaceC1737m == null || iBinder == null) {
            return;
        }
        try {
            E4.I iA = BinderC1478g.a(iBinder);
            E4.F fO = E4.I.o();
            for (int i8 = 0; i8 < iA.size(); i8++) {
                Bundle bundle = (Bundle) iA.get(i8);
                bundle.getClass();
                fO.a(t2.G.a(bundle));
            }
            t1(interfaceC1737m, i7, 20, new C1711a1(new B2.b(new T0(2, fO.f(), z6), 19, new V0(11)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void Q0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, boolean z6) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 35, w1(new T0(1, C1476e.a(bundle), z6)));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for AudioAttributes", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void T(InterfaceC1737m interfaceC1737m, int i7, int i8, Bundle bundle) {
        if (interfaceC1737m == null || bundle == null || i8 < 0) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 20, new C1711a1(new B2.b(new S0(1, t2.G.a(bundle)), 20, new R0(this, i8, 2)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void T0(InterfaceC1737m interfaceC1737m, int i7, final boolean z6, final int i8) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 34, w1(new w2.c() { // from class: w3.W0
            @Override // w2.c
            public final void c(Object obj) {
                ((r1) obj).W(i8, z6);
            }
        }));
    }

    @Override // w3.InterfaceC1741o
    public final void U0(InterfaceC1737m interfaceC1737m, int i7) {
        C1747r0 c1747r0S;
        if (interfaceC1737m == null || (c1747r0S = this.f19226e.S(interfaceC1737m.asBinder())) == null) {
            return;
        }
        u1(c1747r0S, i7, 12, w1(new t2.c0(27)));
    }

    @Override // w3.InterfaceC1741o
    public final void V0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 13, w1(new C1701D(new t2.Q(bundle.getFloat(t2.Q.f16346e, 1.0f), bundle.getFloat(t2.Q.f16347f, 1.0f)), 2)));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for PlaybackParameters", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void W(InterfaceC1737m interfaceC1737m, int i7, float f7) {
        if (interfaceC1737m == null || f7 <= 0.0f) {
            return;
        }
        t1(interfaceC1737m, i7, 13, w1(new C0023y(2, f7)));
    }

    @Override // w3.InterfaceC1741o
    public final void X0(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 34, w1(new A2.A(i8, 3)));
    }

    @Override // w3.InterfaceC1741o
    public final void Y(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        if (interfaceC1737m == null || i8 < 0) {
            return;
        }
        t1(interfaceC1737m, i7, 10, new A2.I(25, new R0(this, i8, 0)));
    }

    @Override // w3.InterfaceC1741o
    public final void Z(InterfaceC1737m interfaceC1737m, int i7, IBinder iBinder) {
        if (interfaceC1737m == null || iBinder == null) {
            return;
        }
        try {
            E4.I iA = BinderC1478g.a(iBinder);
            E4.F fO = E4.I.o();
            for (int i8 = 0; i8 < iA.size(); i8++) {
                Bundle bundle = (Bundle) iA.get(i8);
                bundle.getClass();
                fO.a(t2.G.a(bundle));
            }
            t1(interfaceC1737m, i7, 20, new C1711a1(new B2.b(new Q0(2, fO.f()), 20, new V0(0)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void b0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        C1723f c1723f;
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            z1 z1VarA = z1.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                U3.h hVar = this.f19226e;
                IBinder iBinderAsBinder = interfaceC1737m.asBinder();
                synchronized (hVar.f7042o) {
                    try {
                        C1747r0 c1747r0S = hVar.S(iBinderAsBinder);
                        c1723f = c1747r0S != null ? (C1723f) ((C1450e) hVar.f7044q).get(c1747r0S) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0348f0 c0348f0 = c1723f != null ? c1723f.f19178b : null;
                if (c0348f0 == null) {
                    return;
                }
                c0348f0.d(i7, z1VarA);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for SessionResult", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void b1(InterfaceC1737m interfaceC1737m, int i7) {
        C1747r0 c1747r0S;
        if (interfaceC1737m == null || (c1747r0S = this.f19226e.S(interfaceC1737m.asBinder())) == null) {
            return;
        }
        u1(c1747r0S, i7, 7, w1(new t2.c0(24)));
    }

    @Override // w3.InterfaceC1741o
    public final void c0(InterfaceC1737m interfaceC1737m, int i7) {
        C1747r0 c1747r0S;
        if (interfaceC1737m == null || (c1747r0S = this.f19226e.S(interfaceC1737m.asBinder())) == null) {
            return;
        }
        u1(c1747r0S, i7, 1, w1(new B2.b(this, 18, c1747r0S)));
    }

    @Override // w3.InterfaceC1741o
    public final void c1(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        if (interfaceC1737m == null) {
            return;
        }
        if (i8 == 2 || i8 == 0 || i8 == 1) {
            t1(interfaceC1737m, i7, 15, w1(new A2.A(i8, 5)));
        }
    }

    @Override // w3.InterfaceC1741o
    public final void d0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, Bundle bundle2) {
        if (interfaceC1737m == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            v1 v1VarA = v1.a(bundle);
            p1(interfaceC1737m, i7, v1VarA, 0, new C1711a1(new B2.b(v1VarA, 17, bundle2), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for SessionCommand", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void d1(InterfaceC1737m interfaceC1737m, int i7) {
        C1747r0 c1747r0S;
        if (interfaceC1737m == null || (c1747r0S = this.f19226e.S(interfaceC1737m.asBinder())) == null) {
            return;
        }
        u1(c1747r0S, i7, 11, w1(new t2.c0(23)));
    }

    @Override // w3.InterfaceC1741o
    public final void e1(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        if (interfaceC1737m == null || i8 < 0) {
            return;
        }
        t1(interfaceC1737m, i7, 20, new A2.I(25, new R0(this, i8, 4)));
    }

    @Override // w3.InterfaceC1741o
    public final void f1(InterfaceC1737m interfaceC1737m, int i7, IBinder iBinder, int i8, long j3) {
        if (interfaceC1737m == null || iBinder == null) {
            return;
        }
        if (i8 == -1 || i8 >= 0) {
            try {
                E4.I iA = BinderC1478g.a(iBinder);
                E4.F fO = E4.I.o();
                for (int i9 = 0; i9 < iA.size(); i9++) {
                    Bundle bundle = (Bundle) iA.get(i9);
                    bundle.getClass();
                    fO.a(t2.G.a(bundle));
                }
                t1(interfaceC1737m, i7, 20, new C1711a1(new B2.b(new B2.f(i8, j3, fO.f()), 19, new V0(11)), 1));
            } catch (RuntimeException e7) {
                AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    @Override // w3.InterfaceC1741o
    public final void g0(InterfaceC1737m interfaceC1737m, int i7, boolean z6) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 1, w1(new A2.B(3, z6)));
    }

    @Override // w3.InterfaceC1741o
    public final void g1(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            C1725g c1725gA = C1725g.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = c1725gA.f19192d;
            }
            try {
                x3.f0 f0Var = new x3.f0(c1725gA.f19191c, callingPid, callingUid);
                o1(interfaceC1737m, new C1747r0(f0Var, c1725gA.f19189a, c1725gA.f19190b, this.f19225d.b(f0Var), new e1(interfaceC1737m), c1725gA.f19193e));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for ConnectionRequest", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void h0(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 26, w1(new V0(1)));
    }

    @Override // w3.InterfaceC1741o
    public final void i1(InterfaceC1737m interfaceC1737m, int i7) {
        C1747r0 c1747r0S;
        if (interfaceC1737m == null || (c1747r0S = this.f19226e.S(interfaceC1737m.asBinder())) == null) {
            return;
        }
        u1(c1747r0S, i7, 9, w1(new t2.c0(28)));
    }

    @Override // w3.InterfaceC1741o
    public final void j1(InterfaceC1737m interfaceC1737m, int i7, boolean z6) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 14, w1(new A2.B(5, z6)));
    }

    @Override // w3.InterfaceC1741o
    public final void k0(InterfaceC1737m interfaceC1737m, int i7, final long j3) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 5, w1(new w2.c() { // from class: w3.X0
            @Override // w2.c
            public final void c(Object obj) {
                ((r1) obj).k(j3);
            }
        }));
    }

    @Override // w3.InterfaceC1741o
    public final void k1(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 26, w1(new t2.c0(22)));
    }

    @Override // w3.InterfaceC1741o
    public final void m0(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 4, w1(new V0(7)));
    }

    @Override // w3.InterfaceC1741o
    public final void n0(InterfaceC1737m interfaceC1737m, int i7, int i8, long j3) {
        if (interfaceC1737m == null || i8 < 0) {
            return;
        }
        t1(interfaceC1737m, i7, 10, new A2.I(25, new B2.f(i8, j3, this)));
    }

    public final void o1(InterfaceC1737m interfaceC1737m, C1747r0 c1747r0) {
        if (interfaceC1737m != null) {
            A0 a0 = (A0) this.f19224c.get();
            if (a0 == null || a0.h()) {
                try {
                    interfaceC1737m.a();
                } catch (RemoteException unused) {
                }
            } else {
                this.f19227f.add(c1747r0);
                w2.t.G(a0.l, new RunnableC1718d(this, c1747r0, a0, interfaceC1737m, 3));
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i7) {
            case 3002:
                s0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                M(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                k1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                h0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                D(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                J(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                v0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                J(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                P(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                P(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                f1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                g0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                b0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                g1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                InterfaceC1737m interfaceC1737mO1 = BinderC1724f0.o1(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                d0(interfaceC1737mO1, i9, (Bundle) k1.b(parcel, creator), (Bundle) k1.b(parcel, creator));
                return true;
            case 3017:
                c1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                j1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                e1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                v(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                N(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                K(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                G0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                c0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                r0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                C0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                V0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                W(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                InterfaceC1737m interfaceC1737mO12 = BinderC1724f0.o1(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                Bundle bundle = (Bundle) k1.b(parcel, Bundle.CREATOR);
                if (interfaceC1737mO12 != null && bundle != null) {
                    try {
                        t1(interfaceC1737mO12, i10, 20, new C1711a1(new B2.b(new S0(2, t2.G.a(bundle)), 20, new V0(2)), 1));
                    } catch (RuntimeException e7) {
                        AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
                    }
                }
                return true;
            case 3030:
                G(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                Z(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                p0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                I0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                I(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                A(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                m0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                Y(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                k0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                n0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                d1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                U0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                y(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                F(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                E0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Surface) k1.b(parcel, Surface.CREATOR));
                return true;
            case 3045:
                L0(BinderC1724f0.o1(parcel.readStrongBinder()));
                return true;
            case 3046:
                b1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                i1(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                O0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                InterfaceC1737m interfaceC1737mO13 = BinderC1724f0.o1(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) k1.b(parcel, Bundle.CREATOR);
                if (interfaceC1737mO13 != null && string != null && bundle2 != null) {
                    if (TextUtils.isEmpty(string)) {
                        AbstractC1697a.w("setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            p1(interfaceC1737mO13, i11, null, 40010, new C1711a1(new t2.c0(string, t2.Y.a(bundle2)), 1));
                        } catch (RuntimeException e8) {
                            AbstractC1697a.x("Ignoring malformed Bundle for Rating", e8);
                        }
                    }
                }
                return true;
            case 3050:
                InterfaceC1737m interfaceC1737mO14 = BinderC1724f0.o1(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                Bundle bundle3 = (Bundle) k1.b(parcel, Bundle.CREATOR);
                if (interfaceC1737mO14 != null && bundle3 != null) {
                    try {
                        p1(interfaceC1737mO14, i12, null, 40010, new C1711a1(new V0(t2.Y.a(bundle3)), 1));
                    } catch (RuntimeException e9) {
                        AbstractC1697a.x("Ignoring malformed Bundle for Rating", e9);
                    }
                }
                return true;
            case 3051:
                q(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                z0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                X0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                T0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                T(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                B0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                Q0(BinderC1724f0.o1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k1.b(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            default:
                switch (i7) {
                    case 4001:
                        InterfaceC1737m interfaceC1737mO15 = BinderC1724f0.o1(parcel.readStrongBinder());
                        int i13 = parcel.readInt();
                        Bundle bundle4 = (Bundle) k1.b(parcel, Bundle.CREATOR);
                        if (interfaceC1737mO15 != null) {
                            if (bundle4 == null) {
                                p1(interfaceC1737mO15, i13, null, 50000, new C1711a1(new V0(5), 0));
                            } else {
                                try {
                                    C1726g0.a(bundle4);
                                    p1(interfaceC1737mO15, i13, null, 50000, new C1711a1(new V0(5), 0));
                                } catch (RuntimeException e10) {
                                    AbstractC1697a.x("Ignoring malformed Bundle for LibraryParams", e10);
                                }
                            }
                        }
                        return true;
                    case 4002:
                        InterfaceC1737m interfaceC1737mO16 = BinderC1724f0.o1(parcel.readStrongBinder());
                        int i14 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (interfaceC1737mO16 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                AbstractC1697a.w("getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            p1(interfaceC1737mO16, i14, null, 50004, new C1711a1(new t2.c0(26), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        InterfaceC1737m interfaceC1737mO17 = BinderC1724f0.o1(parcel.readStrongBinder());
                        int i15 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i16 = parcel.readInt();
                        int i17 = parcel.readInt();
                        Bundle bundle5 = (Bundle) k1.b(parcel, Bundle.CREATOR);
                        if (interfaceC1737mO17 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                AbstractC1697a.w("getChildren(): Ignoring empty parentId");
                            } else if (i16 < 0) {
                                AbstractC1697a.w("getChildren(): Ignoring negative page");
                            } else if (i17 < 1) {
                                AbstractC1697a.w("getChildren(): Ignoring pageSize less than 1");
                            } else if (bundle5 == null) {
                                p1(interfaceC1737mO17, i15, null, 50003, new C1711a1(new t2.c0(19), 0));
                            } else {
                                try {
                                    C1726g0.a(bundle5);
                                    p1(interfaceC1737mO17, i15, null, 50003, new C1711a1(new t2.c0(19), 0));
                                } catch (RuntimeException e11) {
                                    AbstractC1697a.x("Ignoring malformed Bundle for LibraryParams", e11);
                                }
                            }
                        }
                        return true;
                    case 4004:
                        InterfaceC1737m interfaceC1737mO18 = BinderC1724f0.o1(parcel.readStrongBinder());
                        int i18 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle6 = (Bundle) k1.b(parcel, Bundle.CREATOR);
                        if (interfaceC1737mO18 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                AbstractC1697a.w("search(): Ignoring empty query");
                            } else if (bundle6 == null) {
                                p1(interfaceC1737mO18, i18, null, 50005, new C1711a1(new V0(10), 0));
                            } else {
                                try {
                                    C1726g0.a(bundle6);
                                    p1(interfaceC1737mO18, i18, null, 50005, new C1711a1(new V0(10), 0));
                                } catch (RuntimeException e12) {
                                    AbstractC1697a.x("Ignoring malformed Bundle for LibraryParams", e12);
                                }
                            }
                        }
                        return true;
                    case 4005:
                        InterfaceC1737m interfaceC1737mO19 = BinderC1724f0.o1(parcel.readStrongBinder());
                        int i19 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i20 = parcel.readInt();
                        int i21 = parcel.readInt();
                        Bundle bundle7 = (Bundle) k1.b(parcel, Bundle.CREATOR);
                        if (interfaceC1737mO19 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                AbstractC1697a.w("getSearchResult(): Ignoring empty query");
                            } else if (i20 < 0) {
                                AbstractC1697a.w("getSearchResult(): Ignoring negative page");
                            } else if (i21 < 1) {
                                AbstractC1697a.w("getSearchResult(): Ignoring pageSize less than 1");
                            } else if (bundle7 == null) {
                                p1(interfaceC1737mO19, i19, null, 50006, new C1711a1(new V0(3), 0));
                            } else {
                                try {
                                    C1726g0.a(bundle7);
                                    p1(interfaceC1737mO19, i19, null, 50006, new C1711a1(new V0(3), 0));
                                } catch (RuntimeException e13) {
                                    AbstractC1697a.x("Ignoring malformed Bundle for LibraryParams", e13);
                                }
                            }
                        }
                        return true;
                    case 4006:
                        InterfaceC1737m interfaceC1737mO110 = BinderC1724f0.o1(parcel.readStrongBinder());
                        int i22 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle8 = (Bundle) k1.b(parcel, Bundle.CREATOR);
                        if (interfaceC1737mO110 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                AbstractC1697a.w("subscribe(): Ignoring empty parentId");
                            } else if (bundle8 == null) {
                                p1(interfaceC1737mO110, i22, null, 50001, new C1711a1(new V0(8), 0));
                            } else {
                                try {
                                    C1726g0.a(bundle8);
                                    p1(interfaceC1737mO110, i22, null, 50001, new C1711a1(new V0(8), 0));
                                } catch (RuntimeException e14) {
                                    AbstractC1697a.x("Ignoring malformed Bundle for LibraryParams", e14);
                                }
                            }
                        }
                        return true;
                    case 4007:
                        InterfaceC1737m interfaceC1737mO111 = BinderC1724f0.o1(parcel.readStrongBinder());
                        int i23 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (interfaceC1737mO111 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                AbstractC1697a.w("unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            p1(interfaceC1737mO111, i23, null, 50002, new C1711a1(new t2.c0(18), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i7, parcel, parcel2, i8);
                }
        }
    }

    @Override // w3.InterfaceC1741o
    public final void p0(InterfaceC1737m interfaceC1737m, int i7, int i8, IBinder iBinder) {
        if (interfaceC1737m == null || iBinder == null || i8 < 0) {
            return;
        }
        try {
            E4.I iA = BinderC1478g.a(iBinder);
            E4.F fO = E4.I.o();
            for (int i9 = 0; i9 < iA.size(); i9++) {
                Bundle bundle = (Bundle) iA.get(i9);
                bundle.getClass();
                fO.a(t2.G.a(bundle));
            }
            t1(interfaceC1737m, i7, 20, new C1711a1(new B2.b(new Q0(1, fO.f()), 20, new R0(this, i8, 3)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    public final void p1(InterfaceC1737m interfaceC1737m, final int i7, final v1 v1Var, final int i8, final h1 h1Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final A0 a0 = (A0) this.f19224c.get();
            if (a0 != null && !a0.h()) {
                final C1747r0 c1747r0S = this.f19226e.S(interfaceC1737m.asBinder());
                if (c1747r0S == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    w2.t.G(a0.l, new Runnable() { // from class: w3.Y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            U3.h hVar = this.f19101o.f19226e;
                            C1747r0 c1747r0 = c1747r0S;
                            if (hVar.Z(c1747r0)) {
                                v1 v1Var2 = v1Var;
                                int i9 = i7;
                                if (v1Var2 != null) {
                                    if (!hVar.c0(c1747r0, v1Var2)) {
                                        i1.v1(c1747r0, i9, new z1(-4));
                                        return;
                                    }
                                } else if (!hVar.b0(c1747r0, i8)) {
                                    i1.v1(c1747r0, i9, new z1(-4));
                                    return;
                                }
                                h1Var.i(a0, c1747r0, i9);
                            }
                        }
                    });
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void q(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9) {
        if (interfaceC1737m == null || i8 < 0) {
            return;
        }
        t1(interfaceC1737m, i7, 33, w1(new C0021w(i8, i9, 2)));
    }

    public final n1 q1(n1 n1Var) {
        E4.I i7 = n1Var.f19287D.f16717a;
        E4.F fO = E4.I.o();
        E4.A a4 = new E4.A(4);
        for (int i8 = 0; i8 < i7.size(); i8++) {
            t2.o0 o0Var = (t2.o0) i7.get(i8);
            t2.i0 i0Var = o0Var.f16645b;
            String string = (String) this.f19228g.get(i0Var);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i9 = this.h;
                this.h = i9 + 1;
                int i10 = w2.t.f18881a;
                sb.append(Integer.toString(i9, 36));
                sb.append("-");
                sb.append(i0Var.f16491b);
                string = sb.toString();
            }
            a4.D(i0Var, string);
            fO.a(new t2.o0(new t2.i0(string, o0Var.f16645b.f16493d), o0Var.f16646c, o0Var.f16647d, o0Var.f16648e));
        }
        this.f19228g = a4.d();
        n1 n1VarB = n1Var.b(new t2.p0(fO.f()));
        t2.n0 n0Var = n1VarB.f19288E;
        if (n0Var.f16582A.isEmpty()) {
            return n1VarB;
        }
        t2.m0 m0VarC = n0Var.a().c();
        E4.p0 it = n0Var.f16582A.values().iterator();
        while (it.hasNext()) {
            t2.j0 j0Var = (t2.j0) it.next();
            t2.i0 i0Var2 = j0Var.f16497a;
            String str = (String) this.f19228g.get(i0Var2);
            if (str != null) {
                m0VarC.a(new t2.j0(new t2.i0(str, i0Var2.f16493d), j0Var.f16498b));
            } else {
                m0VarC.a(j0Var);
            }
        }
        return n1VarB.o(m0VarC.b());
    }

    @Override // w3.InterfaceC1741o
    public final void r0(InterfaceC1737m interfaceC1737m, int i7) {
        C1747r0 c1747r0S;
        if (interfaceC1737m == null || (c1747r0S = this.f19226e.S(interfaceC1737m.asBinder())) == null) {
            return;
        }
        u1(c1747r0S, i7, 1, w1(new t2.c0(20)));
    }

    @Override // w3.InterfaceC1741o
    public final void s0(InterfaceC1737m interfaceC1737m, int i7, float f7) {
        if (interfaceC1737m == null || f7 < 0.0f || f7 > 1.0f) {
            return;
        }
        t1(interfaceC1737m, i7, 24, w1(new C0023y(3, f7)));
    }

    public final int s1(C1747r0 c1747r0, r1 r1Var, int i7) {
        if (r1Var.K0(17)) {
            U3.h hVar = this.f19226e;
            if (!hVar.a0(c1747r0, 17) && hVar.a0(c1747r0, 16)) {
                return r1Var.V() + i7;
            }
        }
        return i7;
    }

    public final void t1(InterfaceC1737m interfaceC1737m, int i7, int i8, h1 h1Var) {
        C1747r0 c1747r0S = this.f19226e.S(interfaceC1737m.asBinder());
        if (c1747r0S != null) {
            u1(c1747r0S, i7, i8, h1Var);
        }
    }

    public final void u1(final C1747r0 c1747r0, final int i7, final int i8, final h1 h1Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final A0 a0 = (A0) this.f19224c.get();
            if (a0 != null && !a0.h()) {
                w2.t.G(a0.l, new Runnable() { // from class: w3.Z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        U3.h hVar = this.f19110o.f19226e;
                        final C1747r0 c1747r02 = c1747r0;
                        int i9 = i8;
                        boolean zA0 = hVar.a0(c1747r02, i9);
                        final int i10 = i7;
                        if (!zA0) {
                            i1.v1(c1747r02, i10, new z1(-4));
                            return;
                        }
                        final A0 a02 = a0;
                        a02.r(c1747r02);
                        a02.f18902e.getClass();
                        final h1 h1Var2 = h1Var;
                        if (i9 != 27) {
                            hVar.y(c1747r02, i9, new InterfaceC1721e() { // from class: w3.d1
                                @Override // w3.InterfaceC1721e
                                public final I4.y run() {
                                    return (I4.y) h1Var2.i(a02, c1747r02, i10);
                                }
                            });
                        } else {
                            h1Var2.i(a02, c1747r02, i10);
                            hVar.y(c1747r02, i9, new C1717c1());
                        }
                    }
                });
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void v(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9) {
        if (interfaceC1737m == null || i8 < 0 || i9 < i8) {
            return;
        }
        t1(interfaceC1737m, i7, 20, new A2.I(25, new P0(this, i8, i9)));
    }

    @Override // w3.InterfaceC1741o
    public final void v0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, long j3) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            t1(interfaceC1737m, i7, 31, new C1711a1(new B2.b(new C1702E(j3, t2.G.a(bundle)), 19, new V0(11)), 1));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for MediaItem", e7);
        }
    }

    @Override // w3.InterfaceC1741o
    public final void y(InterfaceC1737m interfaceC1737m, int i7) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 6, w1(new t2.c0(25)));
    }

    @Override // w3.InterfaceC1741o
    public final void z0(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        if (interfaceC1737m == null) {
            return;
        }
        t1(interfaceC1737m, i7, 34, w1(new A2.A(i8, 4)));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
