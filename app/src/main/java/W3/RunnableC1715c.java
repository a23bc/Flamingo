package w3;

/* JADX INFO: renamed from: w3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1715c implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A0 f19151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1747r0 f19152q;

    public /* synthetic */ RunnableC1715c(A0 a0, C1747r0 c1747r0, int i7) {
        this.f19150o = i7;
        this.f19151p = a0;
        this.f19152q = c1747r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19150o) {
            case 0:
                A0 a0 = this.f19151p;
                if (!a0.h()) {
                    if (a0.f18921z) {
                        C1747r0 c1747r0 = this.f19152q;
                        if (!A0.i(c1747r0)) {
                            if (a0.g(c1747r0)) {
                                a0.f18921z = false;
                            }
                        }
                    }
                    a0.f18902e.getClass();
                    break;
                }
                break;
            case 1:
                this.f19151p.f18904g.u1(this.f19152q, Integer.MIN_VALUE, 3, i1.w1(new V0(4)));
                break;
            case 2:
                this.f19151p.f18904g.u1(this.f19152q, Integer.MIN_VALUE, 1, i1.w1(new t2.c0(20)));
                break;
            case 3:
                i1 i1Var = this.f19151p.f18904g;
                C1747r0 c1747r02 = this.f19152q;
                i1Var.getClass();
                i1Var.u1(c1747r02, Integer.MIN_VALUE, 1, i1.w1(new B2.b(i1Var, 18, c1747r02)));
                break;
            case 4:
                i1 i1Var2 = this.f19151p.f18904g;
                C1747r0 c1747r03 = this.f19152q;
                i1Var2.getClass();
                i1Var2.u1(c1747r03, Integer.MIN_VALUE, 1, i1.w1(new B2.b(i1Var2, 18, c1747r03)));
                break;
            case 5:
                this.f19151p.f18904g.u1(this.f19152q, Integer.MIN_VALUE, 1, i1.w1(new t2.c0(20)));
                break;
            case 6:
                this.f19151p.f18904g.u1(this.f19152q, Integer.MIN_VALUE, 9, i1.w1(new t2.c0(28)));
                break;
            case 7:
                this.f19151p.f18904g.u1(this.f19152q, Integer.MIN_VALUE, 7, i1.w1(new t2.c0(24)));
                break;
            case 8:
                this.f19151p.f18904g.u1(this.f19152q, Integer.MIN_VALUE, 12, i1.w1(new t2.c0(27)));
                break;
            default:
                this.f19151p.f18904g.u1(this.f19152q, Integer.MIN_VALUE, 11, i1.w1(new t2.c0(23)));
                break;
        }
    }
}
