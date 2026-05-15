package androidx.compose.foundation.text.contextmenu.modifier;

import L2.C0247a;
import Q0.AbstractC0344d0;
import S.h;
import X.B0;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class TextContextMenuToolbarHandlerElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a */
    public final C0247a f9238a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0871i f9239b;

    /* JADX INFO: renamed from: c */
    public final B0 f9240c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1182c f9241d;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuToolbarHandlerElement(C0247a c0247a, InterfaceC1182c interfaceC1182c, B0 b0, InterfaceC1182c interfaceC1182c2) {
        this.f9238a = c0247a;
        this.f9239b = (AbstractC0871i) interfaceC1182c;
        this.f9240c = b0;
        this.f9241d = interfaceC1182c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.f9238a == textContextMenuToolbarHandlerElement.f9238a && this.f9239b == textContextMenuToolbarHandlerElement.f9239b && this.f9240c == textContextMenuToolbarHandlerElement.f9240c && this.f9241d == textContextMenuToolbarHandlerElement.f9241d;
    }

    public final int hashCode() {
        int iHashCode = (this.f9239b.hashCode() + (this.f9238a.hashCode() * 31)) * 31;
        B0 b0 = this.f9240c;
        return this.f9241d.hashCode() + ((iHashCode + (b0 != null ? b0.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.c] */
    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new h(this.f9238a, this.f9239b, this.f9240c, this.f9241d);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        h hVar = (h) abstractC1397o;
        hVar.f6716E.f4105p = null;
        C0247a c0247a = this.f9238a;
        hVar.f6716E = c0247a;
        c0247a.f4105p = hVar;
        hVar.f6717F = this.f9239b;
        hVar.f6718G = this.f9240c;
        hVar.f6719H = this.f9241d;
    }
}
