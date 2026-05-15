package u6;

/* JADX INFO: renamed from: u6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1571n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17759c;

    public C1571n(int i7, int i8, long j3) {
        this.f17757a = i7;
        this.f17758b = i8;
        this.f17759c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1571n)) {
            return false;
        }
        C1571n c1571n = (C1571n) obj;
        return this.f17757a == c1571n.f17757a && this.f17758b == c1571n.f17758b && n1.m.b(this.f17759c, c1571n.f17759c);
    }

    public final int hashCode() {
        int i7 = ((this.f17757a * 31) + this.f17758b) * 31;
        long j3 = this.f17759c;
        return ((int) (j3 ^ (j3 >>> 32))) + i7;
    }

    public final String toString() {
        return "WavyLazyColumnItemInfo(index=" + this.f17757a + ", offset=" + this.f17758b + ", size=" + ((Object) n1.m.c(this.f17759c)) + ')';
    }
}
