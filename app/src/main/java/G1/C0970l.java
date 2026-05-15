package g1;

/* JADX INFO: renamed from: g1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0970l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12368a;

    public static String a(int i7) {
        return i7 == 0 ? "Unspecified" : i7 == 1 ? "Text" : i7 == 2 ? "Ascii" : i7 == 3 ? "Number" : i7 == 4 ? "Phone" : i7 == 5 ? "Uri" : i7 == 6 ? "Email" : i7 == 7 ? "Password" : i7 == 8 ? "NumberPassword" : i7 == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0970l) {
            return this.f12368a == ((C0970l) obj).f12368a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12368a;
    }

    public final String toString() {
        return a(this.f12368a);
    }
}
