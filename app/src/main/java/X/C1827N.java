package x;

import Q0.AbstractC0347f;
import m5.AbstractC1207i;
import m5.C1220v;
import w5.AbstractC1767D;

/* JADX INFO: renamed from: x.N */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1827N extends AbstractC1207i implements l5.e {
    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        boolean zB;
        C1830Q c1830qF0;
        w0.s sVar = (w0.s) obj;
        w0.s sVar2 = (w0.s) obj2;
        C1829P c1829p = (C1829P) this.f14420p;
        if (c1829p.f15636B && (zB = ((w0.t) sVar2).b()) != ((w0.t) sVar).b()) {
            M.r0 r0Var = c1829p.f19675F;
            if (r0Var != null) {
                r0Var.b(Boolean.valueOf(zB));
            }
            if (zB) {
                AbstractC1767D.t(c1829p.n0(), null, new C1828O(c1829p, null), 3);
                C1220v c1220v = new C1220v();
                AbstractC0347f.t(c1829p, new G.i(c1220v, 26, c1829p));
                H.T t7 = (H.T) c1220v.f14439o;
                if (t7 != null) {
                    t7.a();
                } else {
                    t7 = null;
                }
                c1829p.f19677H = t7;
                Q0.j0 j0Var = c1829p.f19678I;
                if (j0Var != null && j0Var.J0().f15636B && (c1830qF0 = c1829p.F0()) != null) {
                    c1830qF0.B0(c1829p.f19678I);
                }
            } else {
                H.T t8 = c1829p.f19677H;
                if (t8 != null) {
                    t8.b();
                }
                c1829p.f19677H = null;
                C1830Q c1830qF02 = c1829p.F0();
                if (c1830qF02 != null) {
                    c1830qF02.B0(null);
                }
            }
            AbstractC0347f.o(c1829p);
            B.k kVar = c1829p.f19674E;
            if (kVar != null) {
                if (zB) {
                    B.d dVar = c1829p.f19676G;
                    if (dVar != null) {
                        c1829p.E0(kVar, new B.e(dVar));
                        c1829p.f19676G = null;
                    }
                    B.d dVar2 = new B.d();
                    c1829p.E0(kVar, dVar2);
                    c1829p.f19676G = dVar2;
                } else {
                    B.d dVar3 = c1829p.f19676G;
                    if (dVar3 != null) {
                        c1829p.E0(kVar, new B.e(dVar3));
                        c1829p.f19676G = null;
                    }
                }
            }
        }
        return Y4.o.f8736a;
    }
}
