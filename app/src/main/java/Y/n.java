package Y;

import Q0.InterfaceC0357m;
import f0.C0912t;
import x.C1874r0;
import x.InterfaceC1846d0;
import x.InterfaceC1852g0;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1852g0 {

    /* JADX INFO: renamed from: a */
    public final boolean f8389a;

    /* JADX INFO: renamed from: b */
    public final long f8390b;

    public n(long j3, boolean z6) {
        this.f8389a = z6;
        this.f8390b = j3;
    }

    @Override // x.InterfaceC1844c0
    public final InterfaceC1846d0 a(B.k kVar, C0912t c0912t) {
        c0912t.X(1257603829);
        c0912t.p(false);
        return C1874r0.f19828o;
    }

    @Override // x.InterfaceC1852g0
    public final InterfaceC0357m b(B.k kVar) {
        return new j(kVar, this.f8389a, new h(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f8389a == nVar.f8389a && n1.g.a(Float.NaN, Float.NaN)) {
            return C1987t.c(this.f8390b, nVar.f8390b);
        }
        return false;
    }

    @Override // x.InterfaceC1852g0
    public final int hashCode() {
        return C1987t.i(this.f8390b) + n1.c.n(Float.NaN, (this.f8389a ? 1231 : 1237) * 31, 961);
    }
}
