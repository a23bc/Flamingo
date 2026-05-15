package androidx.compose.foundation.text.contextmenu.modifier;

import D.J;
import Q0.AbstractC0344d0;
import S.b;
import l5.e;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class AddTextContextMenuDataComponentsWithContextElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9236a;

    public AddTextContextMenuDataComponentsWithContextElement(e eVar) {
        this.f9236a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddTextContextMenuDataComponentsWithContextElement) {
            return this.f9236a == ((AddTextContextMenuDataComponentsWithContextElement) obj).f9236a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9236a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        b bVar = new b();
        bVar.f6702E = this.f9236a;
        J j3 = new J(13, bVar);
        S.a aVar = new S.a();
        aVar.f6701C = j3;
        bVar.B0(aVar);
        return bVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((b) abstractC1397o).f6702E = this.f9236a;
    }
}
