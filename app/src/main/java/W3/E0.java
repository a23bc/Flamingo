package w3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f18971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r1 f18972q;

    public /* synthetic */ E0(K0 k02, r1 r1Var, int i7) {
        this.f18970o = i7;
        this.f18971p = k02;
        this.f18972q = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18970o) {
            case 0:
                K0 k02 = this.f18971p;
                k02.getClass();
                k02.f19005k.b(this.f18972q.b1());
                break;
            default:
                K0 k03 = this.f18971p;
                k03.getClass();
                r1 r1Var = this.f18972q;
                k03.f19005k.b(r1Var.b1());
                k03.f19003i.u(r1Var.y().a(17) ? r1Var.m0() : t2.h0.f16472a);
                break;
        }
    }
}
