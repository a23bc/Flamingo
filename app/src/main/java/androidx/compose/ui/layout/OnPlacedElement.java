package androidx.compose.ui.layout;

import O0.C0310h0;
import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class OnPlacedElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9316a;

    public OnPlacedElement(InterfaceC1182c interfaceC1182c) {
        this.f9316a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPlacedElement) {
            return this.f9316a == ((OnPlacedElement) obj).f9316a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9316a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0310h0 c0310h0 = new C0310h0();
        c0310h0.f5400C = this.f9316a;
        return c0310h0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((C0310h0) abstractC1397o).f5400C = this.f9316a;
    }
}
