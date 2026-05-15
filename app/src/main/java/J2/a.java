package J2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3615b;

    public a(long j3, long j7) {
        this.f3614a = j3;
        this.f3615b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3614a == aVar.f3614a && this.f3615b == aVar.f3615b;
    }

    public final int hashCode() {
        return (((int) this.f3614a) * 31) + ((int) this.f3615b);
    }
}
