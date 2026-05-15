package androidx.compose.foundation;

import Q0.AbstractC0344d0;
import r0.AbstractC1397o;
import x.C1813C0;
import x.C1817E0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1817E0 f9150a;

    public ScrollingLayoutElement(C1817E0 c1817e0) {
        this.f9150a = c1817e0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return this.f9150a.equals(((ScrollingLayoutElement) obj).f9150a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f9150a.hashCode() * 31) + 1237) * 31) + 1231;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1813C0 c1813c0 = new C1813C0();
        c1813c0.f19608C = this.f9150a;
        c1813c0.f19609D = true;
        return c1813c0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1813C0 c1813c0 = (C1813C0) abstractC1397o;
        c1813c0.f19608C = this.f9150a;
        c1813c0.f19609D = true;
    }
}
