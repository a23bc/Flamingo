package w3;

import A2.C0020v;
import A2.C0021w;
import A2.C0023y;
import Q0.C0348f0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import d2.C0821i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import t.C1450e;
import t.C1451f;
import t2.BinderC1478g;
import t2.C1473b;
import t2.C1476e;
import t2.C1482k;
import t2.C1488q;
import v2.C1636c;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public class U implements InterfaceC1758x {

    /* JADX INFO: renamed from: A */
    public l1 f19058A;

    /* JADX INFO: renamed from: a */
    public final C1760y f19059a;

    /* JADX INFO: renamed from: b */
    public final C0348f0 f19060b;

    /* JADX INFO: renamed from: c */
    public final BinderC1724f0 f19061c;

    /* JADX INFO: renamed from: d */
    public final Context f19062d;

    /* JADX INFO: renamed from: e */
    public final B1 f19063e;

    /* JADX INFO: renamed from: f */
    public final Bundle f19064f;

    /* JADX INFO: renamed from: g */
    public final M f19065g;
    public final w2.j h;

    /* JADX INFO: renamed from: i */
    public final V1.a f19066i;

    /* JADX INFO: renamed from: j */
    public final C1451f f19067j;

    /* JADX INFO: renamed from: k */
    public B1 f19068k;
    public T l;

    /* JADX INFO: renamed from: m */
    public boolean f19069m;

    /* JADX INFO: renamed from: o */
    public E4.I f19071o;

    /* JADX INFO: renamed from: p */
    public E4.b0 f19072p;

    /* JADX INFO: renamed from: r */
    public t2.T f19074r;

    /* JADX INFO: renamed from: s */
    public t2.T f19075s;

    /* JADX INFO: renamed from: t */
    public t2.T f19076t;

    /* JADX INFO: renamed from: u */
    public Surface f19077u;

    /* JADX INFO: renamed from: w */
    public InterfaceC1741o f19079w;

    /* JADX INFO: renamed from: x */
    public long f19080x;

    /* JADX INFO: renamed from: y */
    public long f19081y;

    /* JADX INFO: renamed from: z */
    public n1 f19082z;

    /* JADX INFO: renamed from: n */
    public n1 f19070n = n1.f19254F;

    /* JADX INFO: renamed from: v */
    public w2.n f19078v = w2.n.f18870c;

    /* JADX INFO: renamed from: q */
    public w1 f19073q = w1.f19385b;

    /* JADX WARN: Type inference failed for: r5v4, types: [w3.M] */
    public U(Context context, C1760y c1760y, B1 b12, Bundle bundle, Looper looper) {
        E4.b0 b0Var = E4.b0.f1913s;
        this.f19071o = b0Var;
        this.f19072p = b0Var;
        t2.T t7 = t2.T.f16353b;
        this.f19074r = t7;
        this.f19075s = t7;
        this.f19076t = O0(t7, t7);
        this.h = new w2.j(looper, w2.o.f18873a, new C1700C(this, 4));
        this.f19059a = c1760y;
        AbstractC1697a.g(context, "context must not be null");
        AbstractC1697a.g(b12, "token must not be null");
        this.f19062d = context;
        this.f19060b = new C0348f0();
        this.f19061c = new BinderC1724f0(this);
        this.f19067j = new C1451f(0);
        this.f19063e = b12;
        this.f19064f = bundle;
        this.f19065g = new IBinder.DeathRecipient() { // from class: w3.M
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C1760y c1760y2 = this.f19015a.f19059a;
                Objects.requireNonNull(c1760y2);
                c1760y2.Q0(new B2.e(23, c1760y2));
            }
        };
        Bundle bundle2 = Bundle.EMPTY;
        this.l = b12.f18932a.a() == 0 ? null : new T(this, bundle);
        V1.a aVar = new V1.a();
        aVar.f7390p = this;
        aVar.f7389o = new Handler(looper, new com.hchen.superlyricapi.a(2, aVar));
        this.f19066i = aVar;
        this.f19080x = -9223372036854775807L;
        this.f19081y = -9223372036854775807L;
    }

    public static t2.T O0(t2.T t7, t2.T t8) {
        t2.T tG = k1.g(t7, t8);
        if (tG.a(32)) {
            return tG;
        }
        B3.l lVar = new B3.l();
        lVar.b(tG.f16355a);
        lVar.a(32);
        return new t2.T(lVar.d());
    }

    public static t2.f0 P0(ArrayList arrayList, ArrayList arrayList2) {
        E4.F f7 = new E4.F(4);
        f7.c(arrayList);
        E4.b0 b0VarF = f7.f();
        E4.F f8 = new E4.F(4);
        f8.c(arrayList2);
        E4.b0 b0VarF2 = f8.f();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = i7;
        }
        return new t2.f0(b0VarF, b0VarF2, iArr);
    }

    public static int S0(n1 n1Var) {
        int i7 = n1Var.f19291c.f19418a.f16364b;
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    public static n1 X0(n1 n1Var, int i7, List list, long j3, long j7) {
        int size;
        t2.h0 h0Var = n1Var.f19297j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i8 = 0; i8 < h0Var.o(); i8++) {
            arrayList.add(h0Var.m(i8, new t2.g0(), 0L));
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            t2.G g6 = (t2.G) list.get(i9);
            t2.g0 g0Var = new t2.g0();
            g0Var.b(0, g6, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i9 + i7, g0Var);
        }
        d1(h0Var, arrayList, arrayList2);
        t2.f0 f0VarP0 = P0(arrayList, arrayList2);
        if (n1Var.f19297j.p()) {
            size = 0;
        } else {
            y1 y1Var = n1Var.f19291c;
            int i10 = y1Var.f19418a.f16364b;
            size2 = i10 >= i7 ? list.size() + i10 : i10;
            int i11 = y1Var.f19418a.f16367e;
            size = i11 >= i7 ? list.size() + i11 : i11;
        }
        return Z0(n1Var, f0VarP0, size2, size, j3, j7, 5);
    }

    public static n1 Y0(n1 n1Var, int i7, int i8, boolean z6, long j3, long j7) {
        int i9;
        int i10;
        int iA;
        boolean z7;
        n1 n1VarZ0;
        t2.h0 h0Var = n1Var.f19297j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < h0Var.o(); i12++) {
            if (i12 < i7 || i12 >= i8) {
                arrayList.add(h0Var.m(i12, new t2.g0(), 0L));
            }
        }
        d1(h0Var, arrayList, arrayList2);
        t2.f0 f0VarP0 = P0(arrayList, arrayList2);
        int iS0 = S0(n1Var);
        int i13 = n1Var.f19291c.f19418a.f16367e;
        t2.g0 g0Var = new t2.g0();
        boolean z8 = iS0 >= i7 && iS0 < i8;
        if (f0VarP0.p()) {
            i10 = -1;
            i9 = 1;
        } else {
            if (z8) {
                int iO = h0Var.o();
                iA = iS0;
                while (true) {
                    z7 = n1Var.f19296i;
                    i9 = 1;
                    if (i11 >= iO || (iA = h0Var.e(iA, n1Var.h, z7)) == -1) {
                        break;
                    }
                    if (iA < i7 || iA >= i8) {
                        break;
                    }
                    i11++;
                }
                iA = -1;
                if (iA == -1) {
                    iA = f0VarP0.a(z7);
                } else if (iA >= i8) {
                    iA -= i8 - i7;
                }
                f0VarP0.m(iA, g0Var, 0L);
                i11 = g0Var.f16464m;
            } else {
                i9 = 1;
                if (iS0 >= i8) {
                    iA = iS0 - (i8 - i7);
                    if (i13 != -1) {
                        for (int i14 = i7; i14 < i8; i14++) {
                            t2.g0 g0Var2 = new t2.g0();
                            h0Var.n(i14, g0Var2);
                            i13 -= (g0Var2.f16465n - g0Var2.f16464m) + 1;
                        }
                    }
                    i11 = i13;
                } else {
                    i11 = i13;
                    i10 = iS0;
                }
            }
            i10 = iA;
        }
        if (!z8) {
            n1VarZ0 = Z0(n1Var, f0VarP0, i10, i11, j3, j7, 4);
        } else if (i10 == -1) {
            n1VarZ0 = a1(n1Var, f0VarP0, y1.f19407k, y1.l, 4);
        } else if (z6) {
            n1VarZ0 = Z0(n1Var, f0VarP0, i10, i11, j3, j7, 4);
        } else {
            t2.g0 g0Var3 = new t2.g0();
            f0VarP0.m(i10, g0Var3, 0L);
            long jN = w2.t.N(g0Var3.f16463k);
            long jN2 = w2.t.N(g0Var3.l);
            t2.W w7 = new t2.W(null, i10, g0Var3.f16456c, null, i11, jN, jN, -1, -1);
            n1VarZ0 = a1(n1Var, f0VarP0, w7, new y1(w7, false, SystemClock.elapsedRealtime(), jN2, jN, k1.e(jN, jN2), 0L, -9223372036854775807L, jN2, jN), 4);
        }
        int i15 = n1VarZ0.f19311y;
        return (i15 == i9 || i15 == 4 || i7 >= i8 || i8 != h0Var.o() || iS0 < i7) ? n1VarZ0 : n1VarZ0.f(4, null);
    }

    public static n1 Z0(n1 n1Var, t2.f0 f0Var, int i7, int i8, long j3, long j7, int i9) {
        t2.g0 g0Var = new t2.g0();
        f0Var.m(i7, g0Var, 0L);
        t2.G g6 = g0Var.f16456c;
        t2.W w7 = n1Var.f19291c.f19418a;
        t2.W w8 = new t2.W(null, i7, g6, null, i8, j3, j7, w7.h, w7.f16370i);
        y1 y1Var = n1Var.f19291c;
        return a1(n1Var, f0Var, w8, new y1(w8, y1Var.f19419b, SystemClock.elapsedRealtime(), y1Var.f19421d, y1Var.f19422e, y1Var.f19423f, y1Var.f19424g, y1Var.h, y1Var.f19425i, y1Var.f19426j), i9);
    }

    public static n1 a1(n1 n1Var, t2.h0 h0Var, t2.W w7, y1 y1Var, int i7) {
        t2.P p7 = n1Var.f19289a;
        t2.W w8 = n1Var.f19291c.f19418a;
        AbstractC1697a.i(h0Var.p() || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(p7, n1Var.f19290b, y1Var, w8, w7, i7, n1Var.f19295g, n1Var.h, n1Var.f19296i, n1Var.l, h0Var, n1Var.f19298k, n1Var.f19299m, n1Var.f19300n, n1Var.f19301o, n1Var.f19302p, n1Var.f19303q, n1Var.f19304r, n1Var.f19305s, n1Var.f19306t, n1Var.f19307u, n1Var.f19310x, n1Var.f19311y, n1Var.f19308v, n1Var.f19309w, n1Var.f19312z, n1Var.f19284A, n1Var.f19285B, n1Var.f19286C, n1Var.f19287D, n1Var.f19288E);
    }

    public static void d1(t2.h0 h0Var, ArrayList arrayList, ArrayList arrayList2) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            t2.g0 g0Var = (t2.g0) arrayList.get(i7);
            int i8 = g0Var.f16464m;
            int i9 = g0Var.f16465n;
            if (i8 == -1 || i9 == -1) {
                g0Var.f16464m = arrayList2.size();
                g0Var.f16465n = arrayList2.size();
                t2.e0 e0Var = new t2.e0();
                e0Var.i(null, null, i7, -9223372036854775807L, 0L, C1473b.f16398f, true);
                arrayList2.add(e0Var);
            } else {
                g0Var.f16464m = arrayList2.size();
                g0Var.f16465n = (i9 - i8) + arrayList2.size();
                while (i8 <= i9) {
                    t2.e0 e0Var2 = new t2.e0();
                    h0Var.f(i8, e0Var2, false);
                    e0Var2.f16428c = i7;
                    arrayList2.add(e0Var2);
                    i8++;
                }
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void A(t2.V v3) {
        this.h.a(v3);
    }

    @Override // w3.InterfaceC1758x
    public final void A0(float f7) {
        if (W0(24)) {
            R0(new C1699B(this, f7, 0));
            n1 n1Var = this.f19070n;
            if (n1Var.f19300n != f7) {
                this.f19070n = n1Var.p(f7);
                C0023y c0023y = new C0023y(1, f7);
                w2.j jVar = this.h;
                jVar.c(22, c0023y);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final long B() {
        return this.f19070n.f19291c.f19422e;
    }

    @Override // w3.InterfaceC1758x
    public final t2.J B0() {
        return this.f19070n.f19312z;
    }

    @Override // w3.InterfaceC1758x
    public final boolean C() {
        return this.f19070n.f19306t;
    }

    @Override // w3.InterfaceC1758x
    public final void C0(List list) {
        if (W0(20)) {
            R0(new P(this, list, 0));
            i1(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void D() {
        if (W0(20)) {
            R0(new C1700C(this, 6));
            e1(0, Integer.MAX_VALUE);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void D0() {
        if (W0(7)) {
            R0(new C1700C(this, 5));
            t2.h0 h0Var = this.f19070n.f19297j;
            if (h0Var.p() || r()) {
                return;
            }
            boolean z6 = V0() != -1;
            t2.g0 g0VarM = h0Var.m(S0(this.f19070n), new t2.g0(), 0L);
            if (g0VarM.h && g0VarM.a()) {
                if (z6) {
                    g1(-9223372036854775807L, V0());
                }
            } else if (!z6 || F0() > this.f19070n.f19286C) {
                g1(0L, S0(this.f19070n));
            } else {
                g1(-9223372036854775807L, V0());
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void E(boolean z6) {
        if (W0(14)) {
            R0(new C1706I(this, z6, 0));
            n1 n1Var = this.f19070n;
            if (n1Var.f19296i != z6) {
                this.f19070n = n1Var.k(z6);
                A2.B b7 = new A2.B(2, z6);
                w2.j jVar = this.h;
                jVar.c(9, b7);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void E0(final t2.G g6, final long j3) {
        if (W0(31)) {
            R0(new S() { // from class: w3.O
                @Override // w3.S
                public final void e(InterfaceC1741o interfaceC1741o, int i7) {
                    U u7 = this.f19030o;
                    u7.getClass();
                    interfaceC1741o.v0(u7.f19061c, i7, g6.b(true), j3);
                }
            });
            i1(Collections.singletonList(g6), -1, j3, false);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void F() {
        if (W0(8)) {
            R0(new C1700C(this, 10));
            if (T0() != -1) {
                g1(-9223372036854775807L, T0());
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final long F0() {
        long jF = k1.f(this.f19070n, this.f19080x, this.f19081y, this.f19059a.f19402f);
        this.f19080x = jF;
        return jF;
    }

    @Override // w3.InterfaceC1758x
    public final void G(int i7) {
        if (W0(34)) {
            R0(new C1698A(this, i7, 2));
            n1 n1Var = this.f19070n;
            int i8 = n1Var.f19304r - 1;
            if (i8 >= n1Var.f19303q.f16504b) {
                this.f19070n = n1Var.c(i8, n1Var.f19305s);
                C1698A c1698a = new C1698A(this, i8, 3);
                w2.j jVar = this.h;
                jVar.c(30, c1698a);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final long G0() {
        return this.f19070n.f19284A;
    }

    @Override // w3.InterfaceC1758x
    public final t2.p0 H() {
        return this.f19070n.f19287D;
    }

    @Override // w3.InterfaceC1758x
    public final boolean H0() {
        return this.f19079w != null;
    }

    @Override // w3.InterfaceC1758x
    public final int I() {
        return this.f19070n.f19291c.f19423f;
    }

    @Override // w3.InterfaceC1758x
    public final w1 I0() {
        return this.f19073q;
    }

    @Override // w3.InterfaceC1758x
    public final long J() {
        return this.f19070n.f19286C;
    }

    @Override // w3.InterfaceC1758x
    public final I4.y J0(v1 v1Var) {
        InterfaceC1741o interfaceC1741o;
        Bundle bundle = Bundle.EMPTY;
        B2.b bVar = new B2.b(this, v1Var);
        AbstractC1697a.d(v1Var.f19382a == 0);
        w1 w1Var = this.f19073q;
        w1Var.getClass();
        if (w1Var.f19387a.contains(v1Var)) {
            interfaceC1741o = this.f19079w;
        } else {
            AbstractC1697a.w("Controller isn't allowed to call custom session command:" + v1Var.f19383b);
            interfaceC1741o = null;
        }
        return Q0(interfaceC1741o, bVar, false);
    }

    @Override // w3.InterfaceC1758x
    public final t2.J K() {
        return this.f19070n.f19299m;
    }

    @Override // w3.InterfaceC1758x
    public final void K0() {
        InterfaceC1741o interfaceC1741o;
        B1 b12 = this.f19063e;
        int iA = b12.f18932a.a();
        A1 a12 = b12.f18932a;
        Context context = this.f19062d;
        Bundle bundle = this.f19064f;
        if (iA == 0) {
            this.l = null;
            Object objQ = a12.q();
            AbstractC1697a.j(objQ);
            IBinder iBinder = (IBinder) objQ;
            int i7 = i1.f19223i;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1741o)) {
                C1739n c1739n = new C1739n();
                c1739n.f19253c = iBinder;
                interfaceC1741o = c1739n;
            } else {
                interfaceC1741o = (InterfaceC1741o) iInterfaceQueryLocalInterface;
            }
            try {
                interfaceC1741o.g1(this.f19061c, this.f19060b.b(), new C1725g(context.getPackageName(), Process.myPid(), bundle).b());
                return;
            } catch (RemoteException e7) {
                AbstractC1697a.x("Failed to call connection request.", e7);
            }
        } else {
            this.l = new T(this, bundle);
            int i8 = w2.t.f18881a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(a12.n(), a12.r());
            if (context.bindService(intent, this.l, i8)) {
                return;
            }
            AbstractC1697a.w("bind to " + b12 + " failed");
        }
        C1760y c1760y = this.f19059a;
        Objects.requireNonNull(c1760y);
        c1760y.Q0(new B2.e(23, c1760y));
    }

    @Override // w3.InterfaceC1758x
    public final boolean L() {
        return this.f19070n.f19308v;
    }

    @Override // w3.InterfaceC1758x
    public final E4.I L0() {
        return this.f19072p;
    }

    @Override // w3.InterfaceC1758x
    public final long M() {
        return this.f19070n.f19291c.f19425i;
    }

    @Override // w3.InterfaceC1758x
    public final void M0(C1488q c1488q) {
        this.h.e(c1488q);
    }

    @Override // w3.InterfaceC1758x
    public final int N() {
        return this.f19070n.f19291c.f19418a.f16367e;
    }

    public final void N0(int i7, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f19070n.f19297j.p()) {
            i1(list, -1, -9223372036854775807L, false);
        } else {
            k1(X0(this.f19070n, Math.min(i7, this.f19070n.f19297j.o()), list, F0(), v()), 0, null, null, this.f19070n.f19297j.p() ? 3 : null);
        }
    }

    @Override // w3.InterfaceC1758x
    public final C1636c O() {
        return this.f19070n.f19302p;
    }

    @Override // w3.InterfaceC1758x
    public final t2.s0 P() {
        return this.f19070n.l;
    }

    @Override // w3.InterfaceC1758x
    public final void Q() {
        if (W0(6)) {
            R0(new C1700C(this, 0));
            if (V0() != -1) {
                g1(-9223372036854775807L, V0());
            }
        }
    }

    public final I4.y Q0(InterfaceC1741o interfaceC1741o, S s7, boolean z6) {
        int iB;
        u1 u1Var;
        if (interfaceC1741o == null) {
            return M3.a.U(new z1(-4));
        }
        C0348f0 c0348f0 = this.f19060b;
        z1 z1Var = new z1(1);
        synchronized (c0348f0.f5989c) {
            try {
                iB = c0348f0.b();
                u1Var = new u1(iB, z1Var);
                if (c0348f0.f5988b) {
                    u1Var.n();
                } else {
                    ((C1450e) c0348f0.f5990d).put(Integer.valueOf(iB), u1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            this.f19067j.add(Integer.valueOf(iB));
        }
        try {
            s7.e(interfaceC1741o, iB);
            return u1Var;
        } catch (RemoteException e7) {
            AbstractC1697a.x("Cannot connect to the service or the session is gone", e7);
            this.f19067j.remove(Integer.valueOf(iB));
            this.f19060b.d(iB, new z1(-100));
            return u1Var;
        }
    }

    @Override // w3.InterfaceC1758x
    public final float R() {
        return this.f19070n.f19300n;
    }

    public final void R0(S s7) {
        V1.a aVar = this.f19066i;
        if (((U) aVar.f7390p).f19079w != null) {
            Handler handler = (Handler) aVar.f7389o;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        Q0(this.f19079w, s7, true);
    }

    @Override // w3.InterfaceC1758x
    public final void S() {
        if (W0(4)) {
            R0(new C1700C(this, 3));
            g1(-9223372036854775807L, S0(this.f19070n));
        }
    }

    @Override // w3.InterfaceC1758x
    public final C1476e T() {
        return this.f19070n.f19301o;
    }

    public final int T0() {
        if (this.f19070n.f19297j.p()) {
            return -1;
        }
        n1 n1Var = this.f19070n;
        t2.h0 h0Var = n1Var.f19297j;
        int iS0 = S0(n1Var);
        n1 n1Var2 = this.f19070n;
        int i7 = n1Var2.h;
        if (i7 == 1) {
            i7 = 0;
        }
        return h0Var.e(iS0, i7, n1Var2.f19296i);
    }

    @Override // w3.InterfaceC1758x
    public final int U() {
        return this.f19070n.f19291c.f19418a.h;
    }

    public final K2.i U0(t2.h0 h0Var, int i7, long j3) {
        if (h0Var.p()) {
            return null;
        }
        t2.g0 g0Var = new t2.g0();
        t2.e0 e0Var = new t2.e0();
        if (i7 == -1 || i7 >= h0Var.o()) {
            i7 = h0Var.a(this.f19070n.f19296i);
            j3 = w2.t.N(h0Var.m(i7, g0Var, 0L).f16463k);
        }
        long jD = w2.t.D(j3);
        AbstractC1697a.f(i7, h0Var.o());
        h0Var.n(i7, g0Var);
        if (jD == -9223372036854775807L) {
            jD = g0Var.f16463k;
            if (jD == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = g0Var.f16464m;
        h0Var.f(i8, e0Var, false);
        while (i8 < g0Var.f16465n && e0Var.f16430e != jD) {
            int i9 = i8 + 1;
            if (h0Var.f(i9, e0Var, false).f16430e > jD) {
                break;
            }
            i8 = i9;
        }
        h0Var.f(i8, e0Var, false);
        return new K2.i(jD - e0Var.f16430e, i8);
    }

    @Override // w3.InterfaceC1758x
    public final int V() {
        return S0(this.f19070n);
    }

    public final int V0() {
        if (this.f19070n.f19297j.p()) {
            return -1;
        }
        n1 n1Var = this.f19070n;
        t2.h0 h0Var = n1Var.f19297j;
        int iS0 = S0(n1Var);
        n1 n1Var2 = this.f19070n;
        int i7 = n1Var2.h;
        if (i7 == 1) {
            i7 = 0;
        }
        return h0Var.k(iS0, i7, n1Var2.f19296i);
    }

    @Override // w3.InterfaceC1758x
    public final void W(final int i7, final boolean z6) {
        if (W0(34)) {
            R0(new S() { // from class: w3.K
                @Override // w3.S
                public final void e(InterfaceC1741o interfaceC1741o, int i8) {
                    interfaceC1741o.T0(this.f18997o.f19061c, i8, z6, i7);
                }
            });
            n1 n1Var = this.f19070n;
            if (n1Var.f19305s != z6) {
                this.f19070n = n1Var.c(n1Var.f19304r, z6);
                C1706I c1706i = new C1706I(this, z6, 1);
                w2.j jVar = this.h;
                jVar.c(30, c1706i);
                jVar.b();
            }
        }
    }

    public final boolean W0(int i7) {
        if (this.f19076t.a(i7)) {
            return true;
        }
        n1.c.x(i7, "Controller isn't allowed to call command= ");
        return false;
    }

    @Override // w3.InterfaceC1758x
    public final C1482k X() {
        return this.f19070n.f19303q;
    }

    @Override // w3.InterfaceC1758x
    public final void Y() {
        if (W0(26)) {
            R0(new C1700C(this, 12));
            n1 n1Var = this.f19070n;
            int i7 = n1Var.f19304r - 1;
            if (i7 >= n1Var.f19303q.f16504b) {
                this.f19070n = n1Var.c(i7, n1Var.f19305s);
                C1698A c1698a = new C1698A(this, i7, 10);
                w2.j jVar = this.h;
                jVar.c(30, c1698a);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void Z(t2.n0 n0Var) {
        if (W0(29)) {
            R0(new B2.b(this, 10, n0Var));
            n1 n1Var = this.f19070n;
            if (n0Var != n1Var.f19288E) {
                this.f19070n = n1Var.o(n0Var);
                A2.D d4 = new A2.D(n0Var, 1);
                w2.j jVar = this.h;
                jVar.c(19, d4);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void a() {
        InterfaceC1741o interfaceC1741o = this.f19079w;
        if (this.f19069m) {
            return;
        }
        this.f19069m = true;
        this.f19068k = null;
        V1.a aVar = this.f19066i;
        Handler handler = (Handler) aVar.f7389o;
        if (handler.hasMessages(1)) {
            try {
                U u7 = (U) aVar.f7390p;
                u7.f19079w.L0(u7.f19061c);
            } catch (RemoteException unused) {
                AbstractC1697a.w("Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.f19079w = null;
        if (interfaceC1741o != null) {
            int iB = this.f19060b.b();
            try {
                interfaceC1741o.asBinder().unlinkToDeath(this.f19065g, 0);
                interfaceC1741o.A(this.f19061c, iB);
            } catch (RemoteException unused2) {
            }
        }
        this.h.d();
        C0348f0 c0348f0 = this.f19060b;
        B2.e eVar = new B2.e(24, this);
        synchronized (c0348f0.f5989c) {
            try {
                Handler handlerJ = w2.t.j(null);
                c0348f0.f5992f = handlerJ;
                c0348f0.f5991e = eVar;
                if (((C1450e) c0348f0.f5990d).isEmpty()) {
                    c0348f0.c();
                } else {
                    handlerJ.postDelayed(new B2.e(26, c0348f0), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void a0(C1476e c1476e, boolean z6) {
        if (W0(35)) {
            R0(new N(this, c1476e, z6));
            if (this.f19070n.f19301o.equals(c1476e)) {
                return;
            }
            this.f19070n = this.f19070n.a(c1476e);
            A2.C c7 = new A2.C(c1476e, 1);
            w2.j jVar = this.h;
            jVar.c(20, c7);
            jVar.b();
        }
    }

    @Override // w3.InterfaceC1758x
    public final void b() {
        if (W0(2)) {
            R0(new C1700C(this, 16));
            n1 n1Var = this.f19070n;
            if (n1Var.f19311y == 1) {
                k1(n1Var.f(n1Var.f19297j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void b0(int i7, int i8) {
        if (W0(33)) {
            R0(new C1707J(this, i7, i8, 0));
            n1 n1Var = this.f19070n;
            C1482k c1482k = n1Var.f19303q;
            if (n1Var.f19304r == i7 || c1482k.f16504b > i7) {
                return;
            }
            int i9 = c1482k.f16505c;
            if (i9 == 0 || i7 <= i9) {
                this.f19070n = n1Var.c(i7, n1Var.f19305s);
                C1698A c1698a = new C1698A(this, i7, 4);
                w2.j jVar = this.h;
                jVar.c(30, c1698a);
                jVar.b();
            }
        }
    }

    public final void b1(int i7, int i8, int i9) {
        int i10;
        int i11;
        t2.h0 h0Var = this.f19070n.f19297j;
        int iO = h0Var.o();
        int iMin = Math.min(i8, iO);
        int i12 = iMin - i7;
        int iMin2 = Math.min(i9, iO - i12);
        if (i7 >= iO || i7 == iMin || i7 == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < iO; i13++) {
            arrayList.add(h0Var.m(i13, new t2.g0(), 0L));
        }
        w2.t.C(arrayList, i7, iMin, iMin2);
        d1(h0Var, arrayList, arrayList2);
        t2.f0 f0VarP0 = P0(arrayList, arrayList2);
        if (f0VarP0.p()) {
            return;
        }
        int iS0 = S0(this.f19070n);
        if (iS0 >= i7 && iS0 < iMin) {
            i11 = (iS0 - i7) + iMin2;
        } else if (iMin <= iS0 && iMin2 > iS0) {
            i11 = iS0 - i12;
        } else {
            if (iMin <= iS0 || iMin2 > iS0) {
                i10 = iS0;
                t2.g0 g0Var = new t2.g0();
                int i14 = this.f19070n.f19291c.f19418a.f16367e - h0Var.m(iS0, g0Var, 0L).f16464m;
                f0VarP0.m(i10, g0Var, 0L);
                k1(Z0(this.f19070n, f0VarP0, i10, g0Var.f16464m + i14, F0(), v(), 5), 0, null, null, null);
            }
            i11 = iS0 + i12;
        }
        i10 = i11;
        t2.g0 g0Var2 = new t2.g0();
        int i142 = this.f19070n.f19291c.f19418a.f16367e - h0Var.m(iS0, g0Var2, 0L).f16464m;
        f0VarP0.m(i10, g0Var2, 0L);
        k1(Z0(this.f19070n, f0VarP0, i10, g0Var2.f16464m + i142, F0(), v(), 5), 0, null, null, null);
    }

    @Override // w3.InterfaceC1758x
    public final boolean c() {
        return this.f19070n.f19309w;
    }

    @Override // w3.InterfaceC1758x
    public final void c0(boolean z6) {
        if (W0(26)) {
            R0(new C1706I(this, z6, 2));
            n1 n1Var = this.f19070n;
            if (n1Var.f19305s != z6) {
                this.f19070n = n1Var.c(n1Var.f19304r, z6);
                C1706I c1706i = new C1706I(this, z6, 3);
                w2.j jVar = this.h;
                jVar.c(30, c1706i);
                jVar.b();
            }
        }
    }

    public final void c1(n1 n1Var, final n1 n1Var2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        w2.j jVar = this.h;
        if (num != null) {
            final int i7 = 0;
            jVar.c(0, new w2.g() { // from class: w3.F
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i7) {
                        case 0:
                            n1 n1Var3 = n1Var2;
                            v3.J(n1Var3.f19297j, num.intValue());
                            break;
                        case 1:
                            n1 n1Var4 = n1Var2;
                            v3.C(n1Var4.f19292d, n1Var4.f19293e, num.intValue());
                            break;
                        default:
                            v3.x(num.intValue(), n1Var2.f19306t);
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i8 = 1;
            jVar.c(11, new w2.g() { // from class: w3.F
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i8) {
                        case 0:
                            n1 n1Var3 = n1Var2;
                            v3.J(n1Var3.f19297j, num3.intValue());
                            break;
                        case 1:
                            n1 n1Var4 = n1Var2;
                            v3.C(n1Var4.f19292d, n1Var4.f19293e, num3.intValue());
                            break;
                        default:
                            v3.x(num3.intValue(), n1Var2.f19306t);
                            break;
                    }
                }
            });
        }
        t2.G gS = n1Var2.s();
        if (num4 != null) {
            jVar.c(1, new B2.b(gS, 9, num4));
        }
        t2.P p7 = n1Var.f19289a;
        t2.P p8 = n1Var2.f19289a;
        if (p7 != p8 && (p7 == null || !p7.a(p8))) {
            jVar.c(10, new B2.c(1, p8));
            if (p8 != null) {
                jVar.c(10, new B2.c(2, p8));
            }
        }
        if (!n1Var.f19287D.equals(n1Var2.f19287D)) {
            final int i9 = 17;
            jVar.c(2, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i9) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.f19312z.equals(n1Var2.f19312z)) {
            final int i10 = 18;
            jVar.c(14, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i10) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19309w != n1Var2.f19309w) {
            final int i11 = 19;
            jVar.c(3, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i11) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19311y != n1Var2.f19311y) {
            final int i12 = 20;
            jVar.c(4, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i12) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i13 = 2;
            jVar.c(5, new w2.g() { // from class: w3.F
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i13) {
                        case 0:
                            n1 n1Var3 = n1Var2;
                            v3.J(n1Var3.f19297j, num2.intValue());
                            break;
                        case 1:
                            n1 n1Var4 = n1Var2;
                            v3.C(n1Var4.f19292d, n1Var4.f19293e, num2.intValue());
                            break;
                        default:
                            v3.x(num2.intValue(), n1Var2.f19306t);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19310x != n1Var2.f19310x) {
            final int i14 = 0;
            jVar.c(6, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i14) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19308v != n1Var2.f19308v) {
            final int i15 = 1;
            jVar.c(7, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i15) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.f19295g.equals(n1Var2.f19295g)) {
            final int i16 = 2;
            jVar.c(12, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i16) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.h != n1Var2.h) {
            final int i17 = 3;
            jVar.c(8, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i17) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19296i != n1Var2.f19296i) {
            final int i18 = 4;
            jVar.c(9, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i18) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.f19299m.equals(n1Var2.f19299m)) {
            final int i19 = 5;
            jVar.c(15, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i19) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19300n != n1Var2.f19300n) {
            final int i20 = 6;
            jVar.c(22, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i20) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.f19301o.equals(n1Var2.f19301o)) {
            final int i21 = 7;
            jVar.c(20, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i21) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.f19302p.f18274a.equals(n1Var2.f19302p.f18274a)) {
            final int i22 = 8;
            jVar.c(27, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i22) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
            final int i23 = 9;
            jVar.c(27, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i23) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.f19303q.equals(n1Var2.f19303q)) {
            final int i24 = 10;
            jVar.c(29, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i24) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19304r != n1Var2.f19304r || n1Var.f19305s != n1Var2.f19305s) {
            final int i25 = 11;
            jVar.c(30, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i25) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.l.equals(n1Var2.l)) {
            final int i26 = 12;
            jVar.c(25, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i26) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19284A != n1Var2.f19284A) {
            final int i27 = 13;
            jVar.c(16, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i27) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19285B != n1Var2.f19285B) {
            final int i28 = 14;
            jVar.c(17, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i28) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (n1Var.f19286C != n1Var2.f19286C) {
            final int i29 = 15;
            jVar.c(18, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i29) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        if (!n1Var.f19288E.equals(n1Var2.f19288E)) {
            final int i30 = 16;
            jVar.c(19, new w2.g() { // from class: w3.G
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i30) {
                        case 0:
                            v3.f(n1Var2.f19310x);
                            break;
                        case 1:
                            v3.V(n1Var2.f19308v);
                            break;
                        case 2:
                            v3.O(n1Var2.f19295g);
                            break;
                        case 3:
                            v3.c(n1Var2.h);
                            break;
                        case 4:
                            v3.K(n1Var2.f19296i);
                            break;
                        case 5:
                            v3.q(n1Var2.f19299m);
                            break;
                        case 6:
                            v3.z(n1Var2.f19300n);
                            break;
                        case 7:
                            v3.P(n1Var2.f19301o);
                            break;
                        case 8:
                            v3.s(n1Var2.f19302p.f18274a);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.n(n1Var2.f19302p);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.S(n1Var2.f19303q);
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            n1 n1Var3 = n1Var2;
                            v3.U(n1Var3.f19304r, n1Var3.f19305s);
                            break;
                        case 12:
                            v3.F(n1Var2.l);
                            break;
                        case 13:
                            v3.g(n1Var2.f19284A);
                            break;
                        case 14:
                            v3.j(n1Var2.f19285B);
                            break;
                        case 15:
                            v3.H(n1Var2.f19286C);
                            break;
                        case 16:
                            v3.e(n1Var2.f19288E);
                            break;
                        case 17:
                            v3.D(n1Var2.f19287D);
                            break;
                        case 18:
                            v3.R(n1Var2.f19312z);
                            break;
                        case 19:
                            v3.o(n1Var2.f19309w);
                            break;
                        default:
                            v3.G(n1Var2.f19311y);
                            break;
                    }
                }
            });
        }
        jVar.b();
    }

    @Override // w3.InterfaceC1758x
    public final int d() {
        return this.f19070n.f19311y;
    }

    @Override // w3.InterfaceC1758x
    public final void d0(int i7) {
        if (W0(34)) {
            R0(new C1698A(this, i7, 6));
            n1 n1Var = this.f19070n;
            int i8 = n1Var.f19304r + 1;
            int i9 = n1Var.f19303q.f16505c;
            if (i9 == 0 || i8 <= i9) {
                this.f19070n = n1Var.c(i8, n1Var.f19305s);
                C1698A c1698a = new C1698A(this, i8, 7);
                w2.j jVar = this.h;
                jVar.c(30, c1698a);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void e() {
        if (!W0(1)) {
            AbstractC1697a.w("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            R0(new C1700C(this, 13));
            j1(true);
        }
    }

    @Override // w3.InterfaceC1758x
    public final int e0() {
        return this.f19070n.f19291c.f19418a.f16370i;
    }

    public final void e1(int i7, int i8) {
        int iO = this.f19070n.f19297j.o();
        int iMin = Math.min(i8, iO);
        if (i7 >= iO || i7 == iMin || iO == 0) {
            return;
        }
        boolean z6 = S0(this.f19070n) >= i7 && S0(this.f19070n) < iMin;
        n1 n1VarY0 = Y0(this.f19070n, i7, iMin, false, F0(), v());
        int i9 = this.f19070n.f19291c.f19418a.f16364b;
        k1(n1VarY0, 0, null, z6 ? 4 : null, i9 >= i7 && i9 < iMin ? 3 : null);
    }

    @Override // w3.InterfaceC1758x
    public final void f(int i7) {
        if (W0(15)) {
            R0(new C1698A(this, i7, 1));
            n1 n1Var = this.f19070n;
            if (n1Var.h != i7) {
                this.f19070n = n1Var.i(i7);
                A2.A a4 = new A2.A(i7, 2);
                w2.j jVar = this.h;
                jVar.c(8, a4);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void f0(t2.J j3) {
        if (W0(19)) {
            R0(new B2.b(this, 7, j3));
            if (this.f19070n.f19299m.equals(j3)) {
                return;
            }
            this.f19070n = this.f19070n.g(j3);
            C0020v c0020v = new C0020v(j3, 1);
            w2.j jVar = this.h;
            jVar.c(15, c0020v);
            jVar.b();
        }
    }

    public final void f1(int i7, int i8, List list) {
        int iO = this.f19070n.f19297j.o();
        if (i7 > iO) {
            return;
        }
        if (this.f19070n.f19297j.p()) {
            i1(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i8, iO);
        n1 n1VarY0 = Y0(X0(this.f19070n, iMin, list, F0(), v()), i7, iMin, true, F0(), v());
        int i9 = this.f19070n.f19291c.f19418a.f16364b;
        boolean z6 = i9 >= i7 && i9 < iMin;
        k1(n1VarY0, 0, null, z6 ? 4 : null, z6 ? 3 : null);
    }

    @Override // w3.InterfaceC1758x
    public final void g() {
        if (W0(1)) {
            R0(new C1700C(this, 11));
            j1(false);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void g0(int i7, int i8) {
        if (W0(20)) {
            AbstractC1697a.d(i7 >= 0 && i8 >= 0);
            R0(new C1707J(this, i7, i8, 1));
            b1(i7, i7 + 1, i8);
        }
    }

    public final void g1(long j3, int i7) {
        int i8;
        boolean z6;
        n1 n1VarA1;
        t2.h0 h0Var = this.f19070n.f19297j;
        if ((h0Var.p() || i7 < h0Var.o()) && !r()) {
            n1 n1Var = this.f19070n;
            n1 n1VarF = n1Var.f(n1Var.f19311y == 1 ? 1 : 2, n1Var.f19289a);
            K2.i iVarU0 = U0(h0Var, i7, j3);
            if (iVarU0 == null) {
                i8 = 2;
                t2.W w7 = new t2.W(null, i7, null, null, i7, j3 != -9223372036854775807L ? j3 : 0L, j3 == -9223372036854775807L ? 0L : j3, -1, -1);
                n1 n1Var2 = this.f19070n;
                t2.h0 h0Var2 = n1Var2.f19297j;
                boolean z7 = this.f19070n.f19291c.f19419b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                y1 y1Var = this.f19070n.f19291c;
                z6 = false;
                n1VarA1 = a1(n1Var2, h0Var2, w7, new y1(w7, z7, jElapsedRealtime, y1Var.f19421d, j3 == -9223372036854775807L ? 0L : j3, 0, 0L, y1Var.h, y1Var.f19425i, j3 == -9223372036854775807L ? 0L : j3), 1);
            } else {
                i8 = 2;
                y1 y1Var2 = n1VarF.f19291c;
                int i9 = y1Var2.f19418a.f16367e;
                t2.e0 e0Var = new t2.e0();
                h0Var.f(i9, e0Var, false);
                t2.e0 e0Var2 = new t2.e0();
                int i10 = iVarU0.f4020a;
                h0Var.f(i10, e0Var2, false);
                boolean z8 = i9 != i10;
                long jD = w2.t.D(F0()) - e0Var.f16430e;
                long j7 = iVarU0.f4021b;
                if (z8 || j7 != jD) {
                    t2.W w8 = y1Var2.f19418a;
                    AbstractC1697a.i(w8.h == -1);
                    t2.W w9 = new t2.W(null, e0Var.f16428c, w8.f16365c, null, i9, w2.t.N(e0Var.f16430e + jD), w2.t.N(e0Var.f16430e + jD), -1, -1);
                    z6 = false;
                    h0Var.f(i10, e0Var2, false);
                    t2.g0 g0Var = new t2.g0();
                    h0Var.n(e0Var2.f16428c, g0Var);
                    t2.W w10 = new t2.W(null, e0Var2.f16428c, g0Var.f16456c, null, i10, w2.t.N(e0Var2.f16430e + j7), w2.t.N(e0Var2.f16430e + j7), -1, -1);
                    n1 n1VarH = n1VarF.h(w9, w10, 1);
                    if (z8 || j7 < jD) {
                        n1VarF = n1VarH.j(new y1(w10, false, SystemClock.elapsedRealtime(), w2.t.N(g0Var.l), w2.t.N(e0Var2.f16430e + j7), k1.e(w2.t.N(e0Var2.f16430e + j7), w2.t.N(g0Var.l)), 0L, -9223372036854775807L, -9223372036854775807L, w2.t.N(e0Var2.f16430e + j7)));
                    } else {
                        long jMax = Math.max(0L, w2.t.D(n1VarH.f19291c.f19424g) - (j7 - jD));
                        long j8 = j7 + jMax;
                        n1VarF = n1VarH.j(new y1(w10, false, SystemClock.elapsedRealtime(), w2.t.N(g0Var.l), w2.t.N(j8), k1.e(w2.t.N(j8), w2.t.N(g0Var.l)), w2.t.N(jMax), -9223372036854775807L, -9223372036854775807L, w2.t.N(j8)));
                    }
                } else {
                    z6 = false;
                }
                n1VarA1 = n1VarF;
            }
            boolean zP = this.f19070n.f19297j.p();
            y1 y1Var3 = n1VarA1.f19291c;
            boolean z9 = (zP || y1Var3.f19418a.f16364b == this.f19070n.f19291c.f19418a.f16364b) ? z6 : true;
            if (z9 || y1Var3.f19418a.f16368f != this.f19070n.f19291c.f19418a.f16368f) {
                k1(n1VarA1, null, null, 1, z9 ? Integer.valueOf(i8) : null);
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void h(t2.Q q7) {
        if (W0(13)) {
            R0(new B2.b(this, 6, q7));
            if (this.f19070n.f19295g.equals(q7)) {
                return;
            }
            this.f19070n = this.f19070n.e(q7);
            C1701D c1701d = new C1701D(q7, 0);
            w2.j jVar = this.h;
            jVar.c(12, c1701d);
            jVar.b();
        }
    }

    @Override // w3.InterfaceC1758x
    public final void h0(final int i7, final int i8, final int i9) {
        if (W0(20)) {
            AbstractC1697a.d(i7 >= 0 && i7 <= i8 && i9 >= 0);
            R0(new S() { // from class: w3.L
                @Override // w3.S
                public final void e(InterfaceC1741o interfaceC1741o, int i10) {
                    interfaceC1741o.G0(this.f19011o.f19061c, i10, i7, i8, i9);
                }
            });
            b1(i7, i8, i9);
        }
    }

    public final void h1(long j3) {
        long jF0 = F0() + j3;
        long jL0 = l0();
        if (jL0 != -9223372036854775807L) {
            jF0 = Math.min(jF0, jL0);
        }
        g1(Math.max(jF0, 0L), S0(this.f19070n));
    }

    @Override // w3.InterfaceC1758x
    public final int i() {
        return this.f19070n.h;
    }

    @Override // w3.InterfaceC1758x
    public final int i0() {
        return this.f19070n.f19310x;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1(java.util.List r35, int r36, long r37, boolean r39) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.U.i1(java.util.List, int, long, boolean):void");
    }

    @Override // w3.InterfaceC1758x
    public final t2.Q j() {
        return this.f19070n.f19295g;
    }

    @Override // w3.InterfaceC1758x
    public final void j0(final int i7, final int i8, final List list) {
        if (W0(20)) {
            AbstractC1697a.d(i7 >= 0 && i7 <= i8);
            R0(new S() { // from class: w3.Q
                @Override // w3.S
                public final void e(InterfaceC1741o interfaceC1741o, int i9) {
                    U u7 = this.f19042o;
                    u7.getClass();
                    E4.F fO = E4.I.o();
                    int i10 = 0;
                    while (true) {
                        List list2 = list;
                        if (i10 >= list2.size()) {
                            break;
                        }
                        fO.a(((t2.G) list2.get(i10)).b(true));
                        i10++;
                    }
                    BinderC1478g binderC1478g = new BinderC1478g(fO.f());
                    B1 b12 = u7.f19068k;
                    b12.getClass();
                    int iS = b12.f18932a.s();
                    int i11 = i7;
                    int i12 = i8;
                    if (iS >= 2) {
                        interfaceC1741o.B0(u7.f19061c, i9, i11, i12, binderC1478g);
                        return;
                    }
                    BinderC1724f0 binderC1724f0 = u7.f19061c;
                    interfaceC1741o.p0(binderC1724f0, i9, i12, binderC1478g);
                    interfaceC1741o.v(binderC1724f0, i9, i11, i12);
                }
            });
            f1(i7, i8, list);
        }
    }

    public final void j1(boolean z6) {
        n1 n1Var = this.f19070n;
        int i7 = n1Var.f19310x;
        int i8 = i7 == 1 ? 0 : i7;
        if (n1Var.f19306t == z6 && i7 == i8) {
            return;
        }
        this.f19080x = k1.f(n1Var, this.f19080x, this.f19081y, this.f19059a.f19402f);
        this.f19081y = SystemClock.elapsedRealtime();
        k1(this.f19070n.d(1, i8, z6), null, 1, null, null);
    }

    @Override // w3.InterfaceC1758x
    public final void k(long j3) {
        if (W0(5)) {
            R0(new C1702E(j3, this));
            g1(j3, S0(this.f19070n));
        }
    }

    @Override // w3.InterfaceC1758x
    public final void k0(List list) {
        if (W0(20)) {
            R0(new P(this, list, 1));
            N0(this.f19070n.f19297j.o(), list);
        }
    }

    public final void k1(n1 n1Var, Integer num, Integer num2, Integer num3, Integer num4) {
        n1 n1Var2 = this.f19070n;
        this.f19070n = n1Var;
        c1(n1Var2, n1Var, num, num2, num3, num4);
    }

    @Override // w3.InterfaceC1758x
    public final void l(float f7) {
        if (W0(13)) {
            R0(new C1699B(this, f7, 1));
            t2.Q q7 = this.f19070n.f19295g;
            if (q7.f16348a != f7) {
                t2.Q q8 = new t2.Q(f7, q7.f16349b);
                this.f19070n = this.f19070n.e(q8);
                C1701D c1701d = new C1701D(q8, 1);
                w2.j jVar = this.h;
                jVar.c(12, c1701d);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final long l0() {
        return this.f19070n.f19291c.f19421d;
    }

    @Override // w3.InterfaceC1758x
    public final void m(final List list, final int i7, final long j3) {
        if (W0(20)) {
            R0(new S() { // from class: w3.H
                @Override // w3.S
                public final void e(InterfaceC1741o interfaceC1741o, int i8) {
                    U u7 = this.f18985o;
                    u7.getClass();
                    E4.F fO = E4.I.o();
                    int i9 = 0;
                    while (true) {
                        List list2 = list;
                        if (i9 >= list2.size()) {
                            interfaceC1741o.f1(u7.f19061c, i8, new BinderC1478g(fO.f()), i7, j3);
                            return;
                        }
                        fO.a(((t2.G) list2.get(i9)).b(true));
                        i9++;
                    }
                }
            });
            i1(list, i7, j3, false);
        }
    }

    @Override // w3.InterfaceC1758x
    public final t2.h0 m0() {
        return this.f19070n.f19297j;
    }

    @Override // w3.InterfaceC1758x
    public final t2.P n() {
        return this.f19070n.f19289a;
    }

    @Override // w3.InterfaceC1758x
    public final boolean n0() {
        return this.f19070n.f19305s;
    }

    @Override // w3.InterfaceC1758x
    public final int o() {
        return this.f19070n.f19304r;
    }

    @Override // w3.InterfaceC1758x
    public final void o0(int i7) {
        if (W0(20)) {
            AbstractC1697a.d(i7 >= 0);
            R0(new C1698A(this, i7, 11));
            e1(i7, i7 + 1);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void p(boolean z6) {
        if (W0(1)) {
            R0(new C1706I(this, z6, 4));
            j1(z6);
        } else if (z6) {
            AbstractC1697a.w("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // w3.InterfaceC1758x
    public final void p0(int i7, t2.G g6) {
        if (W0(20)) {
            AbstractC1697a.d(i7 >= 0);
            R0(new A2.F(this, i7, g6, 2));
            f1(i7, i7 + 1, E4.I.t(g6));
        }
    }

    @Override // w3.InterfaceC1758x
    public final void q(Surface surface) {
        if (W0(27)) {
            if (this.f19077u != null) {
                this.f19077u = null;
            }
            this.f19077u = surface;
            B2.b bVar = new B2.b(this, 5, surface);
            V1.a aVar = this.f19066i;
            if (((U) aVar.f7390p).f19079w != null) {
                Handler handler = (Handler) aVar.f7389o;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
            }
            I4.y yVarQ0 = Q0(this.f19079w, bVar, true);
            try {
                AbstractC1748s.t(yVarQ0);
            } catch (ExecutionException e7) {
                throw new IllegalStateException(e7);
            } catch (TimeoutException e8) {
                if (yVarQ0 instanceof u1) {
                    int i7 = ((u1) yVarQ0).f19369v;
                    this.f19067j.remove(Integer.valueOf(i7));
                    this.f19060b.d(i7, new z1(-1));
                }
                AbstractC1697a.x("Synchronous command takes too long on the session side.", e8);
            }
            int i8 = surface == null ? 0 : -1;
            w2.n nVar = this.f19078v;
            if (nVar.f18871a == i8 && nVar.f18872b == i8) {
                return;
            }
            this.f19078v = new w2.n(i8, i8);
            this.h.f(24, new C0021w(i8, i8, 1));
        }
    }

    @Override // w3.InterfaceC1758x
    public final void q0() {
        if (W0(26)) {
            R0(new C1700C(this, 8));
            n1 n1Var = this.f19070n;
            int i7 = n1Var.f19304r + 1;
            int i8 = n1Var.f19303q.f16505c;
            if (i8 == 0 || i7 <= i8) {
                this.f19070n = n1Var.c(i7, n1Var.f19305s);
                C1698A c1698a = new C1698A(this, i7, 5);
                w2.j jVar = this.h;
                jVar.c(30, c1698a);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final boolean r() {
        return this.f19070n.f19291c.f19419b;
    }

    @Override // w3.InterfaceC1758x
    public final boolean r0() {
        return this.f19070n.f19296i;
    }

    @Override // w3.InterfaceC1758x
    public final void s(int i7) {
        if (W0(10)) {
            AbstractC1697a.d(i7 >= 0);
            R0(new C1698A(this, i7, 0));
            g1(-9223372036854775807L, i7);
        }
    }

    @Override // w3.InterfaceC1758x
    public final t2.n0 s0() {
        return this.f19070n.f19288E;
    }

    @Override // w3.InterfaceC1758x
    public final void stop() {
        if (W0(3)) {
            R0(new C1700C(this, 9));
            n1 n1Var = this.f19070n;
            y1 y1Var = this.f19070n.f19291c;
            t2.W w7 = y1Var.f19418a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            y1 y1Var2 = this.f19070n.f19291c;
            long j3 = y1Var2.f19421d;
            long j7 = y1Var2.f19418a.f16368f;
            int iE = k1.e(j7, j3);
            y1 y1Var3 = this.f19070n.f19291c;
            n1 n1VarJ = n1Var.j(new y1(w7, y1Var.f19419b, jElapsedRealtime, j3, j7, iE, 0L, y1Var3.h, y1Var3.f19425i, y1Var3.f19418a.f16368f));
            this.f19070n = n1VarJ;
            if (n1VarJ.f19311y != 1) {
                this.f19070n = n1VarJ.f(1, n1VarJ.f19289a);
                t2.c0 c0Var = new t2.c0(8);
                w2.j jVar = this.h;
                jVar.c(4, c0Var);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final long t() {
        return this.f19070n.f19285B;
    }

    @Override // w3.InterfaceC1758x
    public final long t0() {
        return this.f19070n.f19291c.f19426j;
    }

    @Override // w3.InterfaceC1758x
    public final long u() {
        return this.f19070n.f19291c.h;
    }

    @Override // w3.InterfaceC1758x
    public final void u0(int i7, int i8) {
        if (W0(20)) {
            AbstractC1697a.d(i7 >= 0 && i8 >= i7);
            R0(new C1707J(this, i7, i8, 2));
            e1(i7, i8);
        }
    }

    @Override // w3.InterfaceC1758x
    public final long v() {
        y1 y1Var = this.f19070n.f19291c;
        return !y1Var.f19419b ? F0() : y1Var.f19418a.f16369g;
    }

    @Override // w3.InterfaceC1758x
    public final void v0(int i7) {
        if (W0(25)) {
            R0(new C1698A(this, i7, 8));
            n1 n1Var = this.f19070n;
            C1482k c1482k = n1Var.f19303q;
            if (n1Var.f19304r == i7 || c1482k.f16504b > i7) {
                return;
            }
            int i8 = c1482k.f16505c;
            if (i8 == 0 || i7 <= i8) {
                this.f19070n = n1Var.c(i7, n1Var.f19305s);
                C1698A c1698a = new C1698A(this, i7, 9);
                w2.j jVar = this.h;
                jVar.c(30, c1698a);
                jVar.b();
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final long w() {
        return this.f19070n.f19291c.f19424g;
    }

    @Override // w3.InterfaceC1758x
    public final void w0() {
        if (W0(9)) {
            R0(new C1700C(this, 1));
            t2.h0 h0Var = this.f19070n.f19297j;
            if (h0Var.p() || r()) {
                return;
            }
            if (T0() != -1) {
                g1(-9223372036854775807L, T0());
                return;
            }
            t2.g0 g0VarM = h0Var.m(S0(this.f19070n), new t2.g0(), 0L);
            if (g0VarM.h && g0VarM.a()) {
                g1(-9223372036854775807L, S0(this.f19070n));
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final void x(int i7, List list) {
        if (W0(20)) {
            AbstractC1697a.d(i7 >= 0);
            R0(new A2.F(this, i7, list, 1));
            N0(i7, list);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void x0() {
        if (W0(12)) {
            R0(new C1700C(this, 2));
            h1(this.f19070n.f19285B);
        }
    }

    @Override // w3.InterfaceC1758x
    public final t2.T y() {
        return this.f19076t;
    }

    @Override // w3.InterfaceC1758x
    public final void y0() {
        if (W0(11)) {
            R0(new C1700C(this, 7));
            h1(-this.f19070n.f19284A);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void z(t2.G g6) {
        if (W0(31)) {
            R0(new B2.b(this, 11, g6));
            i1(Collections.singletonList(g6), -1, -9223372036854775807L, true);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void z0(long j3, int i7) {
        if (W0(10)) {
            AbstractC1697a.d(i7 >= 0);
            R0(new B2.f(i7, j3, this));
            g1(j3, i7);
        }
    }
}
