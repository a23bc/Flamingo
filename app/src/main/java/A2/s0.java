package A2;

import H2.AbstractC0199p;
import t2.C1469B;
import t2.C1473b;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractC0199p {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f440f = 0;

    /* JADX INFO: renamed from: g */
    public final Object f441g;

    public s0(t2.h0 h0Var, t2.G g6) {
        super(h0Var);
        this.f441g = g6;
    }

    @Override // H2.AbstractC0199p, t2.h0
    public t2.e0 f(int i7, t2.e0 e0Var, boolean z6) {
        switch (this.f440f) {
            case 0:
                t2.h0 h0Var = this.f3220e;
                t2.e0 e0VarF = h0Var.f(i7, e0Var, z6);
                if (h0Var.m(e0VarF.f16428c, (t2.g0) this.f441g, 0L).a()) {
                    e0VarF.i(e0Var.f16426a, e0Var.f16427b, e0Var.f16428c, e0Var.f16429d, e0Var.f16430e, C1473b.f16398f, true);
                } else {
                    e0VarF.f16431f = true;
                }
                return e0VarF;
            default:
                return super.f(i7, e0Var, z6);
        }
    }

    @Override // H2.AbstractC0199p, t2.h0
    public t2.g0 m(int i7, t2.g0 g0Var, long j3) {
        switch (this.f440f) {
            case 1:
                super.m(i7, g0Var, j3);
                t2.G g6 = (t2.G) this.f441g;
                g0Var.f16456c = g6;
                C1469B c1469b = g6.f16224b;
                g0Var.getClass();
                return g0Var;
            default:
                return super.m(i7, g0Var, j3);
        }
    }

    public s0(t2.h0 h0Var) {
        super(h0Var);
        this.f441g = new t2.g0();
    }
}
