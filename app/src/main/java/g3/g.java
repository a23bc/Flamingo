package g3;

import N2.A;
import N2.C;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f12484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f12485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12488e;

    public g(long[] jArr, long[] jArr2, long j3, long j7, int i7) {
        this.f12484a = jArr;
        this.f12485b = jArr2;
        this.f12486c = j3;
        this.f12487d = j7;
        this.f12488e = i7;
    }

    @Override // g3.f
    public final long d() {
        return this.f12487d;
    }

    @Override // N2.B
    public final boolean h() {
        return true;
    }

    @Override // g3.f
    public final long i(long j3) {
        return this.f12484a[t.d(this.f12485b, j3, true)];
    }

    @Override // N2.B
    public final A j(long j3) {
        long[] jArr = this.f12484a;
        int iD = t.d(jArr, j3, true);
        long j7 = jArr[iD];
        long[] jArr2 = this.f12485b;
        C c7 = new C(j7, jArr2[iD]);
        if (j7 >= j3 || iD == jArr.length - 1) {
            return new A(c7, c7);
        }
        int i7 = iD + 1;
        return new A(c7, new C(jArr[i7], jArr2[i7]));
    }

    @Override // g3.f
    public final int k() {
        return this.f12488e;
    }

    @Override // N2.B
    public final long l() {
        return this.f12486c;
    }
}
