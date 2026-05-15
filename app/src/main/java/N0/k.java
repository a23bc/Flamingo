package n0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a */
    public final int f14501a;

    /* JADX INFO: renamed from: b */
    public final long[] f14502b;

    /* JADX INFO: renamed from: c */
    public final Object[] f14503c;

    public k(int i7, long[] jArr, Object[] objArr) {
        this.f14501a = i7;
        this.f14502b = jArr;
        this.f14503c = objArr;
    }

    public final int a(long j3) {
        int i7 = this.f14501a - 1;
        if (i7 != -1) {
            long[] jArr = this.f14502b;
            int i8 = 0;
            if (i7 != 0) {
                while (i8 <= i7) {
                    int i9 = (i8 + i7) >>> 1;
                    long j7 = jArr[i9] - j3;
                    if (j7 < 0) {
                        i8 = i9 + 1;
                    } else {
                        if (j7 <= 0) {
                            return i9;
                        }
                        i7 = i9 - 1;
                    }
                }
                return -(i8 + 1);
            }
            long j8 = jArr[0];
            if (j8 == j3) {
                return 0;
            }
            if (j8 > j3) {
                return -2;
            }
        }
        return -1;
    }

    public final k b(long j3, Object obj) {
        long[] jArr;
        int i7;
        Object[] objArr = this.f14503c;
        int i8 = 0;
        int i9 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i9++;
            }
        }
        int i10 = i9 + 1;
        long[] jArr2 = new long[i10];
        Object[] objArr2 = new Object[i10];
        if (i10 > 1) {
            int i11 = 0;
            while (true) {
                jArr = this.f14502b;
                i7 = this.f14501a;
                if (i8 >= i10 || i11 >= i7) {
                    break;
                }
                long j7 = jArr[i11];
                Object obj3 = objArr[i11];
                if (j7 > j3) {
                    jArr2[i8] = j3;
                    objArr2[i8] = obj;
                    i8++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i8] = j7;
                    objArr2[i8] = obj3;
                    i8++;
                }
                i11++;
            }
            if (i11 == i7) {
                jArr2[i9] = j3;
                objArr2[i9] = obj;
            } else {
                while (i8 < i10) {
                    long j8 = jArr[i11];
                    Object obj4 = objArr[i11];
                    if (obj4 != null) {
                        jArr2[i8] = j8;
                        objArr2[i8] = obj4;
                        i8++;
                    }
                    i11++;
                }
            }
        } else {
            jArr2[0] = j3;
            objArr2[0] = obj;
        }
        return new k(i10, jArr2, objArr2);
    }
}
