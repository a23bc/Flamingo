package w3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D0 implements J0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f18956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f18957q;

    public /* synthetic */ D0(K0 k02, long j3, int i7) {
        this.f18955o = i7;
        this.f18956p = k02;
        this.f18957q = j3;
    }

    @Override // w3.J0
    public final void f(C1747r0 c1747r0) {
        switch (this.f18955o) {
            case 0:
                this.f18956p.f19002g.f18914s.s((int) this.f18957q);
                break;
            default:
                this.f18956p.f19002g.f18914s.k(this.f18957q);
                break;
        }
    }
}
