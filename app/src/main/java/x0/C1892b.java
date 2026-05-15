package x0;

import j5.AbstractC1109c;

/* JADX INFO: renamed from: x0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1892b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19867a;

    public /* synthetic */ C1892b(long j3) {
        this.f19867a = j3;
    }

    public static long a(long j3, float f7, int i7) {
        float fIntBitsToFloat = (i7 & 1) != 0 ? Float.intBitsToFloat((int) (j3 >> 32)) : 0.0f;
        if ((i7 & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
    }

    public static final boolean b(long j3, long j7) {
        return j3 == j7;
    }

    public static final float c(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float e(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static int f(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static final long g(long j3, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long h(long j3, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long i(long j3, float f7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f7;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f7;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static String j(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC1109c.B(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + AbstractC1109c.B(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1892b) {
            return this.f19867a == ((C1892b) obj).f19867a;
        }
        return false;
    }

    public final int hashCode() {
        return f(this.f19867a);
    }

    public final String toString() {
        return j(this.f19867a);
    }
}
