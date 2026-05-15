package g3;

import N2.A;
import N2.C;
import android.util.Pair;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f12465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f12466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12467c;

    public c(long j3, long[] jArr, long[] jArr2) {
        this.f12465a = jArr;
        this.f12466b = jArr2;
        this.f12467c = j3 == -9223372036854775807L ? t.D(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair a(long j3, long[] jArr, long[] jArr2) {
        int iD = t.d(jArr, j3, true);
        long j7 = jArr[iD];
        long j8 = jArr2[iD];
        int i7 = iD + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j7), Long.valueOf(j8));
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) ((jArr[i7] == j7 ? 0.0d : (j3 - j7) / (r6 - j7)) * (jArr2[i7] - j8))) + j8));
    }

    @Override // g3.f
    public final long d() {
        return -1L;
    }

    @Override // N2.B
    public final boolean h() {
        return true;
    }

    @Override // g3.f
    public final long i(long j3) {
        return t.D(((Long) a(j3, this.f12465a, this.f12466b).second).longValue());
    }

    @Override // N2.B
    public final A j(long j3) {
        Pair pairA = a(t.N(t.h(j3, 0L, this.f12467c)), this.f12466b, this.f12465a);
        C c7 = new C(t.D(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new A(c7, c7);
    }

    @Override // g3.f
    public final int k() {
        return -2147483647;
    }

    @Override // N2.B
    public final long l() {
        return this.f12467c;
    }
}
