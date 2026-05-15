package w3;

import java.util.Arrays;
import java.util.List;
import t2.C1473b;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends t2.h0 {

    /* JADX INFO: renamed from: g */
    public static final t1 f19364g;
    public static final Object h;

    /* JADX INFO: renamed from: e */
    public final E4.I f19365e;

    /* JADX INFO: renamed from: f */
    public final s1 f19366f;

    static {
        E4.G g6 = E4.I.f1870p;
        f19364g = new t1(E4.b0.f1913s, null);
        h = new Object();
    }

    public t1(E4.I i7, s1 s1Var) {
        this.f19365e = i7;
        this.f19366f = s1Var;
    }

    @Override // t2.h0
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // t2.h0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return M3.a.L(this.f19365e, t1Var.f19365e) && M3.a.L(this.f19366f, t1Var.f19366f);
    }

    @Override // t2.h0
    public final t2.e0 f(int i7, t2.e0 e0Var, boolean z6) {
        s1 s1VarS = s(i7);
        Long lValueOf = Long.valueOf(s1VarS.f19349b);
        long jD = w2.t.D(s1VarS.f19350c);
        e0Var.getClass();
        e0Var.i(lValueOf, null, i7, jD, 0L, C1473b.f16398f, false);
        return e0Var;
    }

    @Override // t2.h0
    public final int h() {
        return o();
    }

    @Override // t2.h0
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19365e, this.f19366f});
    }

    @Override // t2.h0
    public final Object l(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // t2.h0
    public final t2.g0 m(int i7, t2.g0 g0Var, long j3) {
        s1 s1VarS = s(i7);
        g0Var.b(h, s1VarS.f19348a, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, w2.t.D(s1VarS.f19350c), i7, i7, 0L);
        return g0Var;
    }

    @Override // t2.h0
    public final int o() {
        return this.f19365e.size() + (this.f19366f == null ? 0 : 1);
    }

    public final t1 q(int i7, List list) {
        E4.F f7 = new E4.F(4);
        E4.I i8 = this.f19365e;
        f7.c(i8.subList(0, i7));
        for (int i9 = 0; i9 < list.size(); i9++) {
            f7.a(new s1((t2.G) list.get(i9), -1L, -9223372036854775807L));
        }
        f7.c(i8.subList(i7, i8.size()));
        return new t1(f7.f(), this.f19366f);
    }

    public final long r(int i7) {
        if (i7 < 0) {
            return -1L;
        }
        E4.I i8 = this.f19365e;
        if (i7 < i8.size()) {
            return ((s1) i8.get(i7)).f19349b;
        }
        return -1L;
    }

    public final s1 s(int i7) {
        s1 s1Var;
        E4.I i8 = this.f19365e;
        return (i7 != i8.size() || (s1Var = this.f19366f) == null) ? (s1) i8.get(i7) : s1Var;
    }
}
