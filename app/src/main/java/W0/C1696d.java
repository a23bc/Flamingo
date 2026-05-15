package w0;

/* JADX INFO: renamed from: w0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1696d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18776a;

    public static String a(int i7) {
        return i7 == 1 ? "Next" : i7 == 2 ? "Previous" : i7 == 3 ? "Left" : i7 == 4 ? "Right" : i7 == 5 ? "Up" : i7 == 6 ? "Down" : i7 == 7 ? "Enter" : i7 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1696d) {
            return this.f18776a == ((C1696d) obj).f18776a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18776a;
    }

    public final String toString() {
        return a(this.f18776a);
    }
}
