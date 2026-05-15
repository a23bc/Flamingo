package n1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14513a;

    public /* synthetic */ i(long j3) {
        this.f14513a = j3;
    }

    public static final float a(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static String c(long j3) {
        if (j3 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) g.b(b(j3))) + " x " + ((Object) g.b(a(j3)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f14513a == ((i) obj).f14513a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14513a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return c(this.f14513a);
    }
}
