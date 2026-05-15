package y0;

/* JADX INFO: renamed from: y0.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1967Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20224b = AbstractC1959I.h(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20225c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20226a;

    public static final boolean a(long j3, long j7) {
        return j3 == j7;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        return "TransformOrigin(packedValue=" + j3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1967Q) {
            return this.f20226a == ((C1967Q) obj).f20226a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f20226a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return d(this.f20226a);
    }
}
