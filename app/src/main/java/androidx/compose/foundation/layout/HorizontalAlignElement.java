package androidx.compose.foundation.layout;

import D.V;
import Q0.AbstractC0344d0;
import r0.AbstractC1397o;
import r0.C1388f;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1388f f9183a;

    public HorizontalAlignElement(C1388f c1388f) {
        this.f9183a = c1388f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f9183a.equals(horizontalAlignElement.f9183a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9183a.f15625a);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        V v3 = new V();
        v3.f1276C = this.f9183a;
        return v3;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((V) abstractC1397o).f1276C = this.f9183a;
    }
}
