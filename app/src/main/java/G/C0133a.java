package G;

/* JADX INFO: renamed from: G.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0133a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2484a;

    public C0133a(int i7) {
        this.f2484a = i7;
        if (i7 > 0) {
            return;
        }
        C.b.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0133a) {
            return this.f2484a == ((C0133a) obj).f2484a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f2484a;
    }
}
