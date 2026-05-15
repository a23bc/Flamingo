package N2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f5095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f5096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5098d;

    public x(long j3, long[] jArr, long[] jArr2) {
        AbstractC1697a.d(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z6 = length > 0;
        this.f5098d = z6;
        if (!z6 || jArr2[0] <= 0) {
            this.f5095a = jArr;
            this.f5096b = jArr2;
        } else {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f5095a = jArr3;
            long[] jArr4 = new long[i7];
            this.f5096b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f5097c = j3;
    }

    @Override // N2.B
    public final boolean h() {
        return this.f5098d;
    }

    @Override // N2.B
    public final A j(long j3) {
        if (!this.f5098d) {
            C c7 = C.f4965c;
            return new A(c7, c7);
        }
        long[] jArr = this.f5096b;
        int iD = w2.t.d(jArr, j3, true);
        long j7 = jArr[iD];
        long[] jArr2 = this.f5095a;
        C c8 = new C(j7, jArr2[iD]);
        if (j7 == j3 || iD == jArr.length - 1) {
            return new A(c8, c8);
        }
        int i7 = iD + 1;
        return new A(c8, new C(jArr[i7], jArr2[i7]));
    }

    @Override // N2.B
    public final long l() {
        return this.f5097c;
    }
}
