package H0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2954a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f2954a == ((a) obj).f2954a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2954a;
    }

    public final String toString() {
        int i7 = this.f2954a;
        return i7 == 1 ? "Touch" : i7 == 2 ? "Keyboard" : "Error";
    }
}
