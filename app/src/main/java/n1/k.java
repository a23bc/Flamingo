package n1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14514a;

    public /* synthetic */ k(long j3) {
        this.f14514a = j3;
    }

    public static long a(int i7, int i8, int i9, long j3) {
        if ((i9 & 1) != 0) {
            i7 = (int) (j3 >> 32);
        }
        if ((i9 & 2) != 0) {
            i8 = (int) (j3 & 4294967295L);
        }
        return (((long) i8) & 4294967295L) | (((long) i7) << 32);
    }

    public static final boolean b(long j3, long j7) {
        return j3 == j7;
    }

    public static final long c(long j3, long j7) {
        return (((long) (((int) (j3 >> 32)) - ((int) (j7 >> 32)))) << 32) | (((long) (((int) (j3 & 4294967295L)) - ((int) (j7 & 4294967295L)))) & 4294967295L);
    }

    public static final long d(long j3, long j7) {
        return (((long) (((int) (j3 >> 32)) + ((int) (j7 >> 32)))) << 32) | (((long) (((int) (j3 & 4294967295L)) + ((int) (j7 & 4294967295L)))) & 4294967295L);
    }

    public static String e(long j3) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return Z1.l.r(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f14514a == ((k) obj).f14514a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14514a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return e(this.f14514a);
    }
}
