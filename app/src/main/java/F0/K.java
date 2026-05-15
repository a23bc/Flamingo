package f0;

/* JADX INFO: loaded from: classes.dex */
public final class K implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0894j0 f11693a;

    public K(C0894j0 c0894j0) {
        this.f11693a = c0894j0;
    }

    @Override // f0.c1
    public final Object a(InterfaceC0906p0 interfaceC0906p0) {
        return this.f11693a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && this.f11693a.equals(((K) obj).f11693a);
    }

    public final int hashCode() {
        return this.f11693a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f11693a + ')';
    }
}
