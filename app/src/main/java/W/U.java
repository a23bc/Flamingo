package w;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class U implements q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q0 f18560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f18561p;

    public U(q0 q0Var, long j3) {
        this.f18560o = q0Var;
        this.f18561p = j3;
    }

    @Override // w.q0
    public final boolean a() {
        return this.f18560o.a();
    }

    @Override // w.q0
    public final long e(r rVar, r rVar2, r rVar3) {
        return this.f18560o.e(rVar, rVar2, rVar3) + this.f18561p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U)) {
            return false;
        }
        U u7 = (U) obj;
        return u7.f18561p == this.f18561p && AbstractC1209k.a(u7.f18560o, this.f18560o);
    }

    @Override // w.q0
    public final r f(r rVar, r rVar2, r rVar3) {
        return w(e(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    public final int hashCode() {
        int iHashCode = this.f18560o.hashCode() * 31;
        long j3 = this.f18561p;
        return iHashCode + ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // w.q0
    public final r o(long j3, r rVar, r rVar2, r rVar3) {
        long j7 = this.f18561p;
        return j3 < j7 ? rVar : this.f18560o.o(j3 - j7, rVar, rVar2, rVar3);
    }

    @Override // w.q0
    public final r w(long j3, r rVar, r rVar2, r rVar3) {
        long j7 = this.f18561p;
        return j3 < j7 ? rVar3 : this.f18560o.w(j3 - j7, rVar, rVar2, rVar3);
    }
}
