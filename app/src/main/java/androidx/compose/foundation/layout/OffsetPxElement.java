package androidx.compose.foundation.layout;

import D.i0;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class OffsetPxElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9186a;

    public OffsetPxElement(InterfaceC1182c interfaceC1182c) {
        this.f9186a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f9186a == offsetPxElement.f9186a;
    }

    public final int hashCode() {
        return (this.f9186a.hashCode() * 31) + 1231;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        i0 i0Var = new i0();
        i0Var.f1334C = this.f9186a;
        i0Var.f1335D = true;
        return i0Var;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        i0 i0Var = (i0) abstractC1397o;
        InterfaceC1182c interfaceC1182c = i0Var.f1334C;
        InterfaceC1182c interfaceC1182c2 = this.f9186a;
        if (interfaceC1182c != interfaceC1182c2 || !i0Var.f1335D) {
            AbstractC0347f.x(i0Var).U(false);
        }
        i0Var.f1334C = interfaceC1182c2;
        i0Var.f1335D = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f9186a + ", rtlAware=true)";
    }
}
