package g2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12437a;

    public /* synthetic */ j(int i7) {
        this.f12437a = i7;
    }

    public static String a(int i7) {
        return "ContentScale(value=" + i7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f12437a == ((j) obj).f12437a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12437a;
    }

    public final String toString() {
        return a(this.f12437a);
    }
}
