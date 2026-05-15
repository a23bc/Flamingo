package androidx.compose.ui.draw;

import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import v0.e;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9280a;

    public DrawBehindElement(InterfaceC1182c interfaceC1182c) {
        this.f9280a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.f9280a == ((DrawBehindElement) obj).f9280a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9280a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        e eVar = new e();
        eVar.f18210C = this.f9280a;
        return eVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((e) abstractC1397o).f18210C = this.f9280a;
    }
}
