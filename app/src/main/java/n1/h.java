package n1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14512a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f14512a == ((h) obj).f14512a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14512a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        long j3 = this.f14512a;
        if (j3 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) g.b(Float.intBitsToFloat((int) (j3 >> 32)))) + ", " + ((Object) g.b(Float.intBitsToFloat((int) (j3 & 4294967295L)))) + ')';
    }
}
