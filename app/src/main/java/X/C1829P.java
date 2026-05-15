package x;

import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0361q;
import m5.AbstractC1209k;
import m5.C1220v;
import r0.AbstractC1397o;
import s5.InterfaceC1438c;
import w5.AbstractC1767D;
import w5.C1806y;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: x.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1829P extends AbstractC0358n implements Q0.A0, InterfaceC0361q, InterfaceC0356l, Q0.n0, Q0.F0 {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C1874r0 f19673K = new C1874r0();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B.k f19674E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final M.r0 f19675F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B.d f19676G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public H.T f19677H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Q0.j0 f19678I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final w0.u f19679J;

    public C1829P(B.k kVar, int i7, M.r0 r0Var) {
        this.f19674E = kVar;
        this.f19675F = r0Var;
        w0.u uVar = new w0.u(i7, new C1827N(2, 0, C1829P.class, this, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"), 4);
        B0(uVar);
        this.f19679J = uVar;
    }

    public final void E0(B.k kVar, B.j jVar) {
        if (!this.f15636B) {
            kVar.b(jVar);
            return;
        }
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) ((B5.d) n0()).f885o.n(C1806y.f19581p);
        AbstractC1767D.t(n0(), null, new C1826M(kVar, jVar, interfaceC1786g0 != null ? interfaceC1786g0.t(new D.h0(kVar, 27, jVar)) : null, null), 3);
    }

    @Override // Q0.n0
    public final void F() {
        C1220v c1220v = new C1220v();
        AbstractC0347f.t(this, new G.i(c1220v, 26, this));
        H.T t7 = (H.T) c1220v.f14439o;
        if (this.f19679J.D0().b()) {
            H.T t8 = this.f19677H;
            if (t8 != null) {
                t8.b();
            }
            if (t7 != null) {
                t7.a();
            } else {
                t7 = null;
            }
            this.f19677H = t7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final C1830Q F0() {
        Q0.F0 f02;
        C0352h0 c0352h0;
        if (this.f15636B) {
            C1874r0 c1874r0 = C1830Q.f19680D;
            if (!this.f15637o.f15636B) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1397o abstractC1397o = this.f15637o.f15641s;
            Q0.K kX = AbstractC0347f.x(this);
            loop0: while (true) {
                if (kX == null) {
                    f02 = null;
                    break;
                }
                if ((kX.f5821T.f6005f.f15640r & 262144) != 0) {
                    while (abstractC1397o != null) {
                        if ((abstractC1397o.f15639q & 262144) != 0) {
                            ?? eVar = 0;
                            ?? F6 = abstractC1397o;
                            while (F6 != 0) {
                                if (F6 instanceof Q0.F0) {
                                    f02 = (Q0.F0) F6;
                                    if (c1874r0.equals(f02.o())) {
                                        break loop0;
                                    }
                                } else if ((F6.f15639q & 262144) != 0 && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                                    int i7 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o2 != null) {
                                        if ((abstractC1397o2.f15639q & 262144) != 0) {
                                            i7++;
                                            eVar = eVar;
                                            if (i7 == 1) {
                                                F6 = abstractC1397o2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.b(F6);
                                                    F6 = 0;
                                                }
                                                eVar.b(abstractC1397o2);
                                            }
                                        }
                                        abstractC1397o2 = abstractC1397o2.f15642t;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                F6 = AbstractC0347f.f(eVar);
                            }
                        }
                        abstractC1397o = abstractC1397o.f15641s;
                    }
                }
                kX = kX.v();
                abstractC1397o = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
            }
            if (f02 instanceof C1830Q) {
                return (C1830Q) f02;
            }
        }
        return null;
    }

    public final void G0(B.k kVar) {
        B.d dVar;
        if (AbstractC1209k.a(this.f19674E, kVar)) {
            return;
        }
        B.k kVar2 = this.f19674E;
        if (kVar2 != null && (dVar = this.f19676G) != null) {
            kVar2.b(new B.e(dVar));
        }
        this.f19676G = null;
        this.f19674E = kVar;
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        boolean zB = this.f19679J.D0().b();
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        Y0.w wVar = Y0.t.f8539k;
        InterfaceC1438c interfaceC1438c = Y0.v.f8556a[4];
        wVar.a(jVar, Boolean.valueOf(zB));
        jVar.i(Y0.i.f8468v, new Y0.a(null, new R.o(0, this, C1829P.class, "requestFocus", "requestFocus()Z", 0, 5)));
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // Q0.F0
    public final Object o() {
        return f19673K;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // r0.AbstractC1397o
    public final void v0() {
        H.T t7 = this.f19677H;
        if (t7 != null) {
            t7.b();
        }
        this.f19677H = null;
    }

    @Override // Q0.InterfaceC0361q
    public final void z(Q0.j0 j0Var) {
        C1830Q c1830qF0;
        this.f19678I = j0Var;
        if (this.f19679J.D0().b()) {
            if (!j0Var.J0().f15636B) {
                C1830Q c1830qF02 = F0();
                if (c1830qF02 != null) {
                    c1830qF02.B0(null);
                    return;
                }
                return;
            }
            Q0.j0 j0Var2 = this.f19678I;
            if (j0Var2 == null || !j0Var2.J0().f15636B || (c1830qF0 = F0()) == null) {
                return;
            }
            c1830qF0.B0(this.f19678I);
        }
    }
}
