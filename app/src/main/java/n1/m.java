package n1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14520a;

    public static boolean a(long j3, Object obj) {
        return (obj instanceof m) && j3 == ((m) obj).f14520a;
    }

    public static final boolean b(long j3, long j7) {
        return j3 == j7;
    }

    public static String c(long j3) {
        return ((int) (j3 >> 32)) + " x " + ((int) (j3 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(this.f14520a, obj);
    }

    public final int hashCode() {
        long j3 = this.f14520a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return c(this.f14520a);
    }
}
