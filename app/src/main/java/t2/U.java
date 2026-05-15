package t2;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1485n f16356a;

    public U(C1485n c1485n) {
        this.f16356a = c1485n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U) {
            return this.f16356a.equals(((U) obj).f16356a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16356a.hashCode();
    }
}
