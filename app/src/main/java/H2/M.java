package H2;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3020b;

    public M(int i7, boolean z6) {
        this.f3019a = i7;
        this.f3020b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m7 = (M) obj;
        return this.f3019a == m7.f3019a && this.f3020b == m7.f3020b;
    }

    public final int hashCode() {
        return (this.f3019a * 31) + (this.f3020b ? 1 : 0);
    }
}
