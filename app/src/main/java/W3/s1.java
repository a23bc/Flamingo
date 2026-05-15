package w3;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.G f19348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19350c;

    public s1(t2.G g6, long j3, long j7) {
        this.f19348a = g6;
        this.f19349b = j3;
        this.f19350c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.f19349b == s1Var.f19349b && this.f19348a.equals(s1Var.f19348a) && this.f19350c == s1Var.f19350c;
    }

    public final int hashCode() {
        long j3 = this.f19349b;
        int iHashCode = (this.f19348a.hashCode() + ((217 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        long j7 = this.f19350c;
        return iHashCode + ((int) ((j7 >>> 32) ^ j7));
    }
}
