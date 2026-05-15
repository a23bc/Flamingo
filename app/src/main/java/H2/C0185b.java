package H2;

import t2.C1486o;
import t2.C1487p;

/* JADX INFO: renamed from: H2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0185b implements W {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W f3131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0186c f3133q;

    public C0185b(C0186c c0186c, W w7) {
        this.f3133q = c0186c;
        this.f3131o = w7;
    }

    @Override // H2.W
    public final void B() {
        this.f3131o.B();
    }

    @Override // H2.W
    public final int C(long j3) {
        if (this.f3133q.l()) {
            return -3;
        }
        return this.f3131o.C(j3);
    }

    @Override // H2.W
    public final int f(V.o oVar, z2.f fVar, int i7) {
        C0186c c0186c = this.f3133q;
        if (c0186c.l()) {
            return -3;
        }
        if (this.f3132p) {
            fVar.f12566p = 4;
            return -4;
        }
        long jI = c0186c.i();
        int iF = this.f3131o.f(oVar, fVar, i7);
        if (iF != -5) {
            long j3 = c0186c.f3142t;
            if (j3 == Long.MIN_VALUE || ((iF != -4 || fVar.f21117u < j3) && !(iF == -3 && jI == Long.MIN_VALUE && !fVar.f21116t))) {
                return iF;
            }
            fVar.f();
            fVar.f12566p = 4;
            this.f3132p = true;
            return -4;
        }
        C1487p c1487p = (C1487p) oVar.f7343q;
        c1487p.getClass();
        int i8 = c1487p.f16684E;
        int i9 = c1487p.f16683D;
        if (i9 == 0 && i8 == 0) {
            return -5;
        }
        if (c0186c.f3141s != 0) {
            i9 = 0;
        }
        if (c0186c.f3142t != Long.MIN_VALUE) {
            i8 = 0;
        }
        C1486o c1486oA = c1487p.a();
        c1486oA.f16610C = i9;
        c1486oA.f16611D = i8;
        oVar.f7343q = new C1487p(c1486oA);
        return -5;
    }

    @Override // H2.W
    public final boolean w() {
        return !this.f3133q.l() && this.f3131o.w();
    }
}
