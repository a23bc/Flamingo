package w3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P0 implements f1, g1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i1 f19039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f19040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f19041q;

    public /* synthetic */ P0(i1 i1Var, int i7, int i8) {
        this.f19039o = i1Var;
        this.f19040p = i7;
        this.f19041q = i8;
    }

    @Override // w3.g1
    public void a(r1 r1Var, C1747r0 c1747r0, List list) {
        i1 i1Var = this.f19039o;
        r1Var.j0(i1Var.s1(c1747r0, r1Var, this.f19040p), i1Var.s1(c1747r0, r1Var, this.f19041q), list);
    }

    @Override // w3.f1
    public void f(r1 r1Var, C1747r0 c1747r0) {
        i1 i1Var = this.f19039o;
        r1Var.u0(i1Var.s1(c1747r0, r1Var, this.f19040p), i1Var.s1(c1747r0, r1Var, this.f19041q));
    }
}
