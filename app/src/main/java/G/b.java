package G;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2485a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f2485a == ((b) obj).f2485a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f2485a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f2485a + ')';
    }
}
