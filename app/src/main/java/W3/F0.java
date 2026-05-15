package w3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F0 implements J0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f18977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18978q;

    public /* synthetic */ F0(K0 k02, int i7, int i8) {
        this.f18976o = i8;
        this.f18977p = k02;
        this.f18978q = i7;
    }

    @Override // w3.J0
    public final void f(C1747r0 c1747r0) {
        switch (this.f18976o) {
            case 0:
                this.f18977p.f19002g.f18914s.f(AbstractC1748s.q(this.f18978q));
                break;
            default:
                this.f18977p.f19002g.f18914s.E(AbstractC1748s.s(this.f18978q));
                break;
        }
    }
}
