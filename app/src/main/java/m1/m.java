package m1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14349a;

    public static String a(int i7) {
        return i7 == 1 ? "Ltr" : i7 == 2 ? "Rtl" : i7 == 3 ? "Content" : i7 == 4 ? "ContentOrLtr" : i7 == 5 ? "ContentOrRtl" : i7 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f14349a == ((m) obj).f14349a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14349a;
    }

    public final String toString() {
        return a(this.f14349a);
    }
}
