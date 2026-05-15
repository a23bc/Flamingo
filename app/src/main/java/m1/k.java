package m1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14344a;

    public static String a(int i7) {
        return i7 == 1 ? "Left" : i7 == 2 ? "Right" : i7 == 3 ? "Center" : i7 == 4 ? "Justify" : i7 == 5 ? "Start" : i7 == 6 ? "End" : i7 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f14344a == ((k) obj).f14344a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14344a;
    }

    public final String toString() {
        return a(this.f14344a);
    }
}
