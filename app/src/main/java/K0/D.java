package K0;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3826a;

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            return this.f3826a == ((D) obj).f3826a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3826a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f3826a + ')';
    }
}
