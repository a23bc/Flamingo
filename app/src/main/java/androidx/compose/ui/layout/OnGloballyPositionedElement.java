package androidx.compose.ui.layout;

import O0.C0308g0;
import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9315a;

    public OnGloballyPositionedElement(InterfaceC1182c interfaceC1182c) {
        this.f9315a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f9315a == ((OnGloballyPositionedElement) obj).f9315a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9315a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C0308g0 c0308g0 = new C0308g0();
        c0308g0.f5392C = this.f9315a;
        return c0308g0;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((C0308g0) abstractC1397o).f5392C = this.f9315a;
    }
}
