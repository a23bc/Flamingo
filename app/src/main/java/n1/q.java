package n1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14528a;

    public static final boolean a(long j3, long j7) {
        return j3 == j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f14528a == ((q) obj).f14528a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14528a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        long j3 = this.f14528a;
        return a(j3, 0L) ? "Unspecified" : a(j3, 4294967296L) ? "Sp" : a(j3, 8589934592L) ? "Em" : "Invalid";
    }
}
