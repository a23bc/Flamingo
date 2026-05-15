package i3;

import N2.A;
import N2.B;
import N2.C;
import java.math.BigInteger;
import w2.t;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1080a implements B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1081b f13449a;

    public C1080a(C1081b c1081b) {
        this.f13449a = c1081b;
    }

    @Override // N2.B
    public final boolean h() {
        return true;
    }

    @Override // N2.B
    public final A j(long j3) {
        C1081b c1081b = this.f13449a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) c1081b.f13453r.f13490i) * j3) / 1000000);
        long j7 = c1081b.f13452q;
        long j8 = c1081b.f13451p;
        C c7 = new C(j3, t.h((bigIntegerValueOf.multiply(BigInteger.valueOf(j7 - j8)).divide(BigInteger.valueOf(c1081b.f13455t)).longValue() + j8) - 30000, c1081b.f13451p, j7 - 1));
        return new A(c7, c7);
    }

    @Override // N2.B
    public final long l() {
        C1081b c1081b = this.f13449a;
        return (c1081b.f13455t * 1000000) / ((long) c1081b.f13453r.f13490i);
    }
}
