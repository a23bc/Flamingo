package androidx.compose.foundation.text.contextmenu.modifier;

import Q0.AbstractC0344d0;
import S.f;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class TextContextMenuGestureElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0871i f9237a;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuGestureElement(InterfaceC1182c interfaceC1182c) {
        this.f9237a = (AbstractC0871i) interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextContextMenuGestureElement) {
            return this.f9237a == ((TextContextMenuGestureElement) obj).f9237a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9237a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.c] */
    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new f(this.f9237a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((f) abstractC1397o).f6710E = this.f9237a;
    }
}
