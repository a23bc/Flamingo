package m1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14330a;

    public static String a(int i7) {
        return i7 == 1 ? "Hyphens.None" : i7 == 2 ? "Hyphens.Auto" : i7 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f14330a == ((d) obj).f14330a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14330a;
    }

    public final String toString() {
        return a(this.f14330a);
    }
}
