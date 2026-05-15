package H2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements W {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W f3168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3169p;

    public e0(W w7, long j3) {
        this.f3168o = w7;
        this.f3169p = j3;
    }

    @Override // H2.W
    public final void B() {
        this.f3168o.B();
    }

    @Override // H2.W
    public final int C(long j3) {
        return this.f3168o.C(j3 - this.f3169p);
    }

    @Override // H2.W
    public final int f(V.o oVar, z2.f fVar, int i7) {
        int iF = this.f3168o.f(oVar, fVar, i7);
        if (iF == -4) {
            fVar.f21117u += this.f3169p;
        }
        return iF;
    }

    @Override // H2.W
    public final boolean w() {
        return this.f3168o.w();
    }
}
