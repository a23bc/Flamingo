package androidx.compose.foundation.text.handwriting;

import Q0.AbstractC0344d0;
import U.b;
import l5.InterfaceC1180a;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1180a f9242a;

    public StylusHandwritingElement(InterfaceC1180a interfaceC1180a) {
        this.f9242a = interfaceC1180a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StylusHandwritingElement) {
            return this.f9242a == ((StylusHandwritingElement) obj).f9242a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9242a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new b(this.f9242a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((b) abstractC1397o).f7022E = this.f9242a;
    }
}
