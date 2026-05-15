package w3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class R0 implements f1, g1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i1 f19049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f19050q;

    public /* synthetic */ R0(i1 i1Var, int i7, int i8) {
        this.f19048o = i8;
        this.f19049p = i1Var;
        this.f19050q = i7;
    }

    @Override // w3.g1
    public void a(r1 r1Var, C1747r0 c1747r0, List list) {
        switch (this.f19048o) {
            case 1:
                r1Var.x(this.f19049p.s1(c1747r0, r1Var, this.f19050q), list);
                break;
            case 2:
                i1 i1Var = this.f19049p;
                i1Var.getClass();
                int size = list.size();
                int i7 = this.f19050q;
                if (size != 1) {
                    r1Var.j0(i1Var.s1(c1747r0, r1Var, i7), i1Var.s1(c1747r0, r1Var, i7 + 1), list);
                } else {
                    r1Var.p0(i1Var.s1(c1747r0, r1Var, i7), (t2.G) list.get(0));
                }
                break;
            default:
                r1Var.x(this.f19049p.s1(c1747r0, r1Var, this.f19050q), list);
                break;
        }
    }

    @Override // w3.f1
    public void f(r1 r1Var, C1747r0 c1747r0) {
        switch (this.f19048o) {
            case 0:
                r1Var.s(this.f19049p.s1(c1747r0, r1Var, this.f19050q));
                break;
            default:
                r1Var.o0(this.f19049p.s1(c1747r0, r1Var, this.f19050q));
                break;
        }
    }
}
