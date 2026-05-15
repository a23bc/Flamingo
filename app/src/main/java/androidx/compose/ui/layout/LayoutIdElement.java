package androidx.compose.ui.layout;

import O0.D;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum f9314a;

    public LayoutIdElement(Enum r12) {
        this.f9314a = r12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f9314a.equals(((LayoutIdElement) obj).f9314a);
    }

    public final int hashCode() {
        return this.f9314a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        D d4 = new D();
        d4.f5287C = this.f9314a;
        return d4;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((D) abstractC1397o).f5287C = this.f9314a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f9314a + ')';
    }
}
