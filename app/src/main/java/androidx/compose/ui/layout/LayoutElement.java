package androidx.compose.ui.layout;

import O0.H;
import Q0.AbstractC0344d0;
import l5.f;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9313a;

    public LayoutElement(f fVar) {
        this.f9313a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.f9313a == ((LayoutElement) obj).f9313a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9313a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        H h = new H();
        h.f5304C = this.f9313a;
        return h;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((H) abstractC1397o).f5304C = this.f9313a;
    }
}
