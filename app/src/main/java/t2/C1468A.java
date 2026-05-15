package t2;

import android.os.Bundle;

/* JADX INFO: renamed from: t2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1468A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1468A f16168f = new C1468A(new C1496z());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16169g;
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f16171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16172k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16177e;

    static {
        int i7 = w2.t.f18881a;
        f16169g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f16170i = Integer.toString(2, 36);
        f16171j = Integer.toString(3, 36);
        f16172k = Integer.toString(4, 36);
    }

    public C1468A(C1496z c1496z) {
        long j3 = c1496z.f16772a;
        long j7 = c1496z.f16773b;
        long j8 = c1496z.f16774c;
        float f7 = c1496z.f16775d;
        float f8 = c1496z.f16776e;
        this.f16173a = j3;
        this.f16174b = j7;
        this.f16175c = j8;
        this.f16176d = f7;
        this.f16177e = f8;
    }

    public static C1468A b(Bundle bundle) {
        C1496z c1496z = new C1496z();
        C1468A c1468a = f16168f;
        c1496z.f16772a = bundle.getLong(f16169g, c1468a.f16173a);
        c1496z.f16773b = bundle.getLong(h, c1468a.f16174b);
        c1496z.f16774c = bundle.getLong(f16170i, c1468a.f16175c);
        c1496z.f16775d = bundle.getFloat(f16171j, c1468a.f16176d);
        c1496z.f16776e = bundle.getFloat(f16172k, c1468a.f16177e);
        return new C1468A(c1496z);
    }

    public final C1496z a() {
        C1496z c1496z = new C1496z();
        c1496z.f16772a = this.f16173a;
        c1496z.f16773b = this.f16174b;
        c1496z.f16774c = this.f16175c;
        c1496z.f16775d = this.f16176d;
        c1496z.f16776e = this.f16177e;
        return c1496z;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        C1468A c1468a = f16168f;
        long j3 = c1468a.f16173a;
        long j7 = this.f16173a;
        if (j7 != j3) {
            bundle.putLong(f16169g, j7);
        }
        long j8 = c1468a.f16174b;
        long j9 = this.f16174b;
        if (j9 != j8) {
            bundle.putLong(h, j9);
        }
        long j10 = c1468a.f16175c;
        long j11 = this.f16175c;
        if (j11 != j10) {
            bundle.putLong(f16170i, j11);
        }
        float f7 = c1468a.f16176d;
        float f8 = this.f16176d;
        if (f8 != f7) {
            bundle.putFloat(f16171j, f8);
        }
        float f9 = c1468a.f16177e;
        float f10 = this.f16177e;
        if (f10 != f9) {
            bundle.putFloat(f16172k, f10);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1468A)) {
            return false;
        }
        C1468A c1468a = (C1468A) obj;
        return this.f16173a == c1468a.f16173a && this.f16174b == c1468a.f16174b && this.f16175c == c1468a.f16175c && this.f16176d == c1468a.f16176d && this.f16177e == c1468a.f16177e;
    }

    public final int hashCode() {
        long j3 = this.f16173a;
        long j7 = this.f16174b;
        int i7 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f16175c;
        int i8 = (i7 + ((int) ((j8 >>> 32) ^ j8))) * 31;
        float f7 = this.f16176d;
        int iFloatToIntBits = (i8 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.f16177e;
        return iFloatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }
}
