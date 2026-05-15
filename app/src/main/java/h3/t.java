package h3;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f12697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f12699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f12700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f12702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f12703g;
    public final long h;

    public t(q qVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j3) {
        AbstractC1697a.d(iArr.length == jArr2.length);
        AbstractC1697a.d(jArr.length == jArr2.length);
        AbstractC1697a.d(iArr2.length == jArr2.length);
        this.f12697a = qVar;
        this.f12699c = jArr;
        this.f12700d = iArr;
        this.f12701e = i7;
        this.f12702f = jArr2;
        this.f12703g = iArr2;
        this.h = j3;
        this.f12698b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f12702f;
        for (int iB = w2.t.b(jArr, j3, true); iB < jArr.length; iB++) {
            if ((this.f12703g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
