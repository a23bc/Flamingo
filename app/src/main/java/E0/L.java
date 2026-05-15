package E0;

import Q0.N;
import f0.C0879c;
import f0.C0888g0;
import f0.C0894j0;
import x0.C1895e;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class L extends D0.b {

    /* JADX INFO: renamed from: s */
    public final C0894j0 f1670s = C0879c.t(new C1895e(0));

    /* JADX INFO: renamed from: t */
    public final C0894j0 f1671t = C0879c.t(Boolean.FALSE);

    /* JADX INFO: renamed from: u */
    public final F f1672u;

    /* JADX INFO: renamed from: v */
    public final C0888g0 f1673v;

    /* JADX INFO: renamed from: w */
    public float f1674w;

    /* JADX INFO: renamed from: x */
    public C1980m f1675x;

    /* JADX INFO: renamed from: y */
    public int f1676y;

    public L(C0092c c0092c) {
        F f7 = new F(c0092c);
        f7.f1649f = new K(0, this);
        this.f1672u = f7;
        this.f1673v = new C0888g0(0);
        this.f1674w = 1.0f;
        this.f1676y = -1;
    }

    @Override // D0.b
    public final void b(float f7) {
        this.f1674w = f7;
    }

    @Override // D0.b
    public final void c(C1980m c1980m) {
        this.f1675x = c1980m;
    }

    @Override // D0.b
    public final long h() {
        return ((C1895e) this.f1670s.getValue()).f19880a;
    }

    @Override // D0.b
    public final void i(N n7) {
        C1980m c1980m = this.f1675x;
        F f7 = this.f1672u;
        if (c1980m == null) {
            c1980m = (C1980m) f7.f1650g.getValue();
        }
        if (((Boolean) this.f1671t.getValue()).booleanValue() && n7.getLayoutDirection() == n1.n.f14522p) {
            A0.c cVar = n7.f5853o;
            long jR = cVar.R();
            A0.b bVar = cVar.f54p;
            long jW = bVar.W();
            bVar.S().l();
            try {
                ((A.b) bVar.f50p).E(-1.0f, 1.0f, jR);
                f7.e(n7, this.f1674w, c1980m);
            } finally {
                n1.c.A(bVar, jW);
            }
        } else {
            f7.e(n7, this.f1674w, c1980m);
        }
        this.f1676y = this.f1673v.h();
    }
}
