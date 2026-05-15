package w3;

import d2.C0821i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0 implements J0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f18936p;

    public /* synthetic */ C0(K0 k02, int i7) {
        this.f18935o = i7;
        this.f18936p = k02;
    }

    @Override // w3.J0
    public final void f(C1747r0 c1747r0) {
        switch (this.f18935o) {
            case 0:
                r1 r1Var = this.f18936p.f19002g.f18914s;
                if (r1Var != null && r1Var.K0(1)) {
                    r1Var.g();
                    break;
                }
                break;
            case 1:
                A0 a0 = this.f18936p.f19002g;
                r1 r1Var2 = a0.f18914s;
                if (!w2.t.L(r1Var2, a0.f18911p)) {
                    if (r1Var2 != null && r1Var2.K0(1)) {
                        r1Var2.g();
                        break;
                    }
                } else {
                    w2.t.x(r1Var2);
                    break;
                }
                break;
            case 2:
                A0 a02 = this.f18936p.f19002g;
                if (a02.f18914s.f1() != null) {
                    a02.r(c1747r0);
                    a02.f18902e.getClass();
                    M3.a.U(new z1(-6));
                    break;
                }
                break;
            case 3:
                this.f18936p.f19002g.f18914s.D0();
                break;
            case 4:
                this.f18936p.f19002g.f18914s.Q();
                break;
            case 5:
                this.f18936p.f19002g.f18914s.y0();
                break;
            case 6:
                this.f18936p.f19002g.f18914s.b();
                break;
            case 7:
                this.f18936p.f19002g.f18914s.stop();
                break;
            case 8:
                this.f18936p.f19002g.f18914s.w0();
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                this.f18936p.f19002g.f18914s.F();
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                this.f18936p.f19002g.f18914s.x0();
                break;
            default:
                this.f18936p.f19002g.f(c1747r0, true);
                break;
        }
    }

    public /* synthetic */ C0(K0 k02, t2.Y y6) {
        this.f18935o = 2;
        this.f18936p = k02;
    }
}
