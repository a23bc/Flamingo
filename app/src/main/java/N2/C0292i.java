package N2;

import java.util.Arrays;

/* JADX INFO: renamed from: N2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0292i implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f5047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f5048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f5049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5050f;

    public C0292i(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f5046b = iArr;
        this.f5047c = jArr;
        this.f5048d = jArr2;
        this.f5049e = jArr3;
        int length = iArr.length;
        this.f5045a = length;
        if (length > 0) {
            this.f5050f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f5050f = 0L;
        }
    }

    @Override // N2.B
    public final boolean h() {
        return true;
    }

    @Override // N2.B
    public final A j(long j3) {
        long[] jArr = this.f5049e;
        int iD = w2.t.d(jArr, j3, true);
        long j7 = jArr[iD];
        long[] jArr2 = this.f5047c;
        C c7 = new C(j7, jArr2[iD]);
        if (j7 >= j3 || iD == this.f5045a - 1) {
            return new A(c7, c7);
        }
        int i7 = iD + 1;
        return new A(c7, new C(jArr[i7], jArr2[i7]));
    }

    @Override // N2.B
    public final long l() {
        return this.f5050f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f5045a + ", sizes=" + Arrays.toString(this.f5046b) + ", offsets=" + Arrays.toString(this.f5047c) + ", timeUs=" + Arrays.toString(this.f5049e) + ", durationsUs=" + Arrays.toString(this.f5048d) + ")";
    }
}
