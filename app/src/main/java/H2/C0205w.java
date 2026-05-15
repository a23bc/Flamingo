package H2;

import t2.C1487p;
import w.q0;
import w.r0;

/* JADX INFO: renamed from: H2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205w implements q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f3246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f3247r;

    public C0205w(int i7, C1487p c1487p, long j3, long j7) {
        this.f3244o = i7;
        this.f3247r = c1487p;
        this.f3245p = j3;
        this.f3246q = j7;
    }

    @Override // w.q0
    public boolean a() {
        return true;
    }

    public long b(long j3) {
        long j7 = j3 + this.f3246q;
        if (j7 <= 0) {
            return 0L;
        }
        long j8 = this.f3245p;
        long j9 = j7 / j8;
        if (this.f3244o != 1 && j9 % ((long) 2) != 0) {
            return ((j9 + 1) * j8) - j7;
        }
        Long.signum(j9);
        return j7 - (j9 * j8);
    }

    public w.r c(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        long j7 = this.f3246q;
        long j8 = j3 + j7;
        long j9 = this.f3245p;
        return j8 > j9 ? ((r0) this.f3247r).w(j9 - j7, rVar, rVar3, rVar2) : rVar2;
    }

    @Override // w.q0
    public long e(w.r rVar, w.r rVar2, w.r rVar3) {
        return Long.MAX_VALUE;
    }

    @Override // w.q0
    public w.r f(w.r rVar, w.r rVar2, w.r rVar3) {
        return w(Long.MAX_VALUE, rVar, rVar2, rVar3);
    }

    @Override // w.q0
    public w.r o(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return ((r0) this.f3247r).o(b(j3), rVar, rVar2, c(j3, rVar, rVar3, rVar2));
    }

    @Override // w.q0
    public w.r w(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return ((r0) this.f3247r).w(b(j3), rVar, rVar2, c(j3, rVar, rVar3, rVar2));
    }

    public C0205w(r0 r0Var, int i7, long j3) {
        this.f3247r = r0Var;
        this.f3244o = i7;
        this.f3245p = ((long) (r0Var.v() + r0Var.n())) * 1000000;
        this.f3246q = j3 * 1000000;
    }
}
