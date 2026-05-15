package b6;

import A2.N;
import H.P;

/* JADX INFO: loaded from: classes.dex */
public final class v extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f10499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(N n7) {
        super(4, n7);
        this.f10499c = n7;
    }

    @Override // H.P, t2.X
    public final boolean L() {
        return I0.c.f3441b != 0;
    }

    @Override // H.P, t2.X
    public final void e() {
        N n7 = this.f10499c;
        I0.c.R(1);
        n7.x1();
        float f7 = n7.f111W;
        n7.e();
        I0.c.u(n7, f7, 1.0f, 1, null);
    }

    @Override // H.P, t2.X
    public final void g() {
        N n7 = this.f10499c;
        I0.c.R(0);
        n7.x1();
        I0.c.u(n7, n7.f111W, 0.0f, 0, new E3.e(21, n7));
    }
}
