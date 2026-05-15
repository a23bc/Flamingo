package X;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1.j f7887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7889c;

    public D(m1.j jVar, int i7, long j3) {
        this.f7887a = jVar;
        this.f7888b = i7;
        this.f7889c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return this.f7887a == d4.f7887a && this.f7888b == d4.f7888b && this.f7889c == d4.f7889c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f7887a.hashCode() * 31) + this.f7888b) * 31;
        long j3 = this.f7889c;
        return iHashCode + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f7887a + ", offset=" + this.f7888b + ", selectableId=" + this.f7889c + ')';
    }
}
