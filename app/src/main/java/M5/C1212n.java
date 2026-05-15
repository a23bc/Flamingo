package m5;

/* JADX INFO: renamed from: m5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1212n implements InterfaceC1202d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f14433a;

    public C1212n(Class cls) {
        this.f14433a = cls;
    }

    @Override // m5.InterfaceC1202d
    public final Class a() {
        return this.f14433a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1212n) {
            return AbstractC1209k.a(this.f14433a, ((C1212n) obj).f14433a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14433a.hashCode();
    }

    public final String toString() {
        return this.f14433a.toString() + " (Kotlin reflection is not available)";
    }
}
