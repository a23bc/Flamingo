package g2;

/* JADX INFO: renamed from: g2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0986b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12409a;

    public /* synthetic */ C0986b(int i7) {
        this.f12409a = i7;
    }

    public static final /* synthetic */ C0986b a(int i7) {
        return new C0986b(i7);
    }

    public static String b(int i7) {
        return "Vertical(value=" + i7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0986b) {
            return this.f12409a == ((C0986b) obj).f12409a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12409a;
    }

    public final String toString() {
        return b(this.f12409a);
    }
}
