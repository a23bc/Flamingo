package androidx.compose.ui.draw;

import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import v0.g;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9282a;

    public DrawWithContentElement(InterfaceC1182c interfaceC1182c) {
        this.f9282a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithContentElement) {
            return this.f9282a == ((DrawWithContentElement) obj).f9282a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9282a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        g gVar = new g();
        gVar.f18211C = this.f9282a;
        return gVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((g) abstractC1397o).f18211C = this.f9282a;
    }
}
