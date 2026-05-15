package g1;

/* JADX INFO: renamed from: g1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12360a;

    public static String a(int i7) {
        return i7 == -1 ? "Unspecified" : i7 == 0 ? "None" : i7 == 1 ? "Default" : i7 == 2 ? "Go" : i7 == 3 ? "Search" : i7 == 4 ? "Send" : i7 == 5 ? "Previous" : i7 == 6 ? "Next" : i7 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0968j) {
            return this.f12360a == ((C0968j) obj).f12360a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12360a;
    }

    public final String toString() {
        return a(this.f12360a);
    }
}
