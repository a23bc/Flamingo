package m1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14357a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f14357a == ((r) obj).f14357a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14357a;
    }

    public final String toString() {
        int i7 = this.f14357a;
        return i7 == 1 ? "Linearity.Linear" : i7 == 2 ? "Linearity.FontHinting" : i7 == 3 ? "Linearity.None" : "Invalid";
    }
}
