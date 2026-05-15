package f1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11997a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f11997a == ((j) obj).f11997a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11997a;
    }

    public final String toString() {
        int i7 = this.f11997a;
        return i7 == 0 ? "None" : i7 == 1 ? "Weight" : i7 == 2 ? "Style" : i7 == 65535 ? "All" : "Invalid";
    }
}
