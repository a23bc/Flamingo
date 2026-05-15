package A2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements w2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f70o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t2.n0 f71p;

    public /* synthetic */ D(t2.n0 n0Var, int i7) {
        this.f70o = i7;
        this.f71p = n0Var;
    }

    @Override // w2.g
    public final void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f70o) {
            case 0:
                v3.e(this.f71p);
                break;
            default:
                v3.e(this.f71p);
                break;
        }
    }
}
