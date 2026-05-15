package g2;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0985a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12408a;

    public /* synthetic */ C0985a(int i7) {
        this.f12408a = i7;
    }

    public static final /* synthetic */ C0985a a(int i7) {
        return new C0985a(i7);
    }

    public static String b(int i7) {
        return "Horizontal(value=" + i7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0985a) {
            return this.f12408a == ((C0985a) obj).f12408a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12408a;
    }

    public final String toString() {
        return b(this.f12408a);
    }
}
