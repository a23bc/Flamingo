package androidx.compose.ui.draw;

import Q0.AbstractC0344d0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import v0.c;
import v0.d;
import v0.h;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9281a;

    public DrawWithCacheElement(InterfaceC1182c interfaceC1182c) {
        this.f9281a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.f9281a == ((DrawWithCacheElement) obj).f9281a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9281a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        d dVar = new d();
        dVar.f18208o = h.f18212o;
        return new c(dVar, this.f9281a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        c cVar = (c) abstractC1397o;
        cVar.f18207E = this.f9281a;
        cVar.B0();
    }
}
