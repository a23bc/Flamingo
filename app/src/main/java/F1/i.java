package f1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11996a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f11996a == ((i) obj).f11996a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11996a;
    }

    public final String toString() {
        int i7 = this.f11996a;
        return i7 == 0 ? "Normal" : i7 == 1 ? "Italic" : "Invalid";
    }
}
