package androidx.compose.ui.focus;

import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import w0.C1695c;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9292a;

    public FocusChangedElement(InterfaceC1182c interfaceC1182c) {
        this.f9292a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.f9292a == ((FocusChangedElement) obj).f9292a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9292a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1695c c1695c = new C1695c();
        c1695c.f18774C = this.f9292a;
        return c1695c;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((C1695c) abstractC1397o).f18774C = this.f9292a;
    }
}
