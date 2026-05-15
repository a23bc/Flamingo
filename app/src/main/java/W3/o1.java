package w3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p1 f19316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f19317q;

    public /* synthetic */ o1(p1 p1Var, int i7, int i8) {
        this.f19315o = i8;
        this.f19316p = p1Var;
        this.f19317q = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19315o) {
            case 0:
                r1 r1Var = this.f19316p.f19330g;
                if (r1Var.K0(25) || r1Var.K0(33)) {
                    boolean zK0 = r1Var.K0(33);
                    int i7 = this.f19317q;
                    if (!zK0) {
                        r1Var.v0(i7);
                    } else {
                        r1Var.b0(i7, 1);
                    }
                }
                break;
            default:
                r1 r1Var2 = this.f19316p.f19330g;
                if (r1Var2.K0(26) || r1Var2.K0(34)) {
                    int i8 = this.f19317q;
                    if (i8 == -100) {
                        if (!r1Var2.K0(34)) {
                            r1Var2.c0(true);
                        } else {
                            r1Var2.W(1, true);
                        }
                    } else if (i8 == -1) {
                        if (!r1Var2.K0(34)) {
                            r1Var2.Y();
                        } else {
                            r1Var2.G(1);
                        }
                    } else if (i8 == 1) {
                        if (!r1Var2.K0(34)) {
                            r1Var2.q0();
                        } else {
                            r1Var2.d0(1);
                        }
                    } else if (i8 == 100) {
                        if (!r1Var2.K0(34)) {
                            r1Var2.c0(false);
                        } else {
                            r1Var2.W(1, false);
                        }
                    } else if (i8 != 101) {
                        n1.c.x(i8, "onAdjustVolume: Ignoring unknown direction: ");
                    } else if (!r1Var2.K0(34)) {
                        r1Var2.c0(!r1Var2.i1());
                    } else {
                        r1Var2.W(1, !r1Var2.i1());
                    }
                }
                break;
        }
    }
}
