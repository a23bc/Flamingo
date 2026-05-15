package H2;

import t2.C1473b;

/* JADX INFO: renamed from: H2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187d extends AbstractC0199p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3159g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3160i;

    public C0187d(t2.h0 h0Var, long j3, long j7) throws C0188e {
        super(h0Var);
        boolean z6 = false;
        if (h0Var.h() != 1) {
            throw new C0188e(0);
        }
        t2.g0 g0VarM = h0Var.m(0, new t2.g0(), 0L);
        long jMax = Math.max(0L, j3);
        if (!g0VarM.f16462j && jMax != 0 && !g0VarM.f16460g) {
            throw new C0188e(1);
        }
        long jMax2 = j7 == Long.MIN_VALUE ? g0VarM.l : Math.max(0L, j7);
        long j8 = g0VarM.l;
        if (j8 != -9223372036854775807L) {
            jMax2 = jMax2 > j8 ? j8 : jMax2;
            if (jMax > jMax2) {
                throw new C0188e(2);
            }
        }
        this.f3158f = jMax;
        this.f3159g = jMax2;
        this.h = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (g0VarM.h && (jMax2 == -9223372036854775807L || (j8 != -9223372036854775807L && jMax2 == j8))) {
            z6 = true;
        }
        this.f3160i = z6;
    }

    @Override // H2.AbstractC0199p, t2.h0
    public final t2.e0 f(int i7, t2.e0 e0Var, boolean z6) {
        this.f3220e.f(0, e0Var, z6);
        long j3 = e0Var.f16430e - this.f3158f;
        long j7 = this.h;
        e0Var.i(e0Var.f16426a, e0Var.f16427b, 0, j7 != -9223372036854775807L ? j7 - j3 : -9223372036854775807L, j3, C1473b.f16398f, false);
        return e0Var;
    }

    @Override // H2.AbstractC0199p, t2.h0
    public final t2.g0 m(int i7, t2.g0 g0Var, long j3) {
        this.f3220e.m(0, g0Var, 0L);
        long j7 = g0Var.f16466o;
        long j8 = this.f3158f;
        g0Var.f16466o = j7 + j8;
        g0Var.l = this.h;
        g0Var.h = this.f3160i;
        long j9 = g0Var.f16463k;
        if (j9 != -9223372036854775807L) {
            long jMax = Math.max(j9, j8);
            g0Var.f16463k = jMax;
            long j10 = this.f3159g;
            if (j10 != -9223372036854775807L) {
                jMax = Math.min(jMax, j10);
            }
            g0Var.f16463k = jMax - j8;
        }
        long jN = w2.t.N(j8);
        long j11 = g0Var.f16457d;
        if (j11 != -9223372036854775807L) {
            g0Var.f16457d = j11 + jN;
        }
        long j12 = g0Var.f16458e;
        if (j12 != -9223372036854775807L) {
            g0Var.f16458e = j12 + jN;
        }
        return g0Var;
    }
}
