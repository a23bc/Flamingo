package x0;

import j5.AbstractC1109c;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1895e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19880a;

    public static final boolean a(long j3, long j7) {
        return j3 == j7;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final float c(long j3) {
        return Math.min(Float.intBitsToFloat((int) ((j3 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j3 & 2147483647L)));
    }

    public static final float d(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final boolean e(long j3) {
        return (j3 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j3 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j3 & 4294967295L)) <= 0.0f);
    }

    public static String f(long j3) {
        if (j3 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC1109c.B(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + AbstractC1109c.B(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1895e) {
            return this.f19880a == ((C1895e) obj).f19880a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f19880a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return f(this.f19880a);
    }
}
