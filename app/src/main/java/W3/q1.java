package w3;

import t2.C1468A;
import t2.C1473b;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends t2.h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f19331j = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t2.G f19332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19334g;
    public final C1468A h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19335i;

    public q1(r1 r1Var) {
        this.f19332e = r1Var.I0();
        this.f19333f = r1Var.H0();
        this.f19334g = r1Var.L0();
        this.h = r1Var.O0() ? C1468A.f16168f : null;
        this.f19335i = w2.t.D(r1Var.M());
    }

    @Override // t2.h0
    public final int b(Object obj) {
        return f19331j.equals(obj) ? 0 : -1;
    }

    @Override // t2.h0
    public final t2.e0 f(int i7, t2.e0 e0Var, boolean z6) {
        Object obj = f19331j;
        e0Var.getClass();
        e0Var.i(obj, obj, 0, this.f19335i, 0L, C1473b.f16398f, false);
        return e0Var;
    }

    @Override // t2.h0
    public final int h() {
        return 1;
    }

    @Override // t2.h0
    public final Object l(int i7) {
        return f19331j;
    }

    @Override // t2.h0
    public final t2.g0 m(int i7, t2.g0 g0Var, long j3) {
        g0Var.b(f19331j, this.f19332e, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f19333f, this.f19334g, this.h, 0L, this.f19335i, 0, 0, 0L);
        return g0Var;
    }

    @Override // t2.h0
    public final int o() {
        return 1;
    }
}
