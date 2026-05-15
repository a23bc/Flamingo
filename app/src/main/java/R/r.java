package R;

import k.I;
import r1.InterfaceC1404C;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC1404C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final I f6208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n1.m f6209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n1.n f6210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n1.m f6211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n1.k f6212s;

    public r(I i7) {
        this.f6208o = i7;
    }

    @Override // r1.InterfaceC1404C
    public final long c(n1.l lVar, long j3, n1.n nVar, long j7) {
        n1.k kVar = this.f6212s;
        if (kVar != null) {
            n1.m mVar = this.f6209p;
            if ((mVar == null ? false : n1.m.b(mVar.f14520a, j3)) && this.f6210q == nVar) {
                n1.m mVar2 = this.f6211r;
                if (mVar2 != null ? n1.m.b(mVar2.f14520a, j7) : false) {
                    return kVar.f14514a;
                }
            }
        }
        long jC = this.f6208o.c(lVar, j3, nVar, j7);
        this.f6209p = new n1.m(j3);
        this.f6210q = nVar;
        this.f6211r = new n1.m(j7);
        this.f6212s = new n1.k(jC);
        return jC;
    }
}
