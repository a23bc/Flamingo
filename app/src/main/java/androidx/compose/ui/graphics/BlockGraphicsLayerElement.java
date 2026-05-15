package androidx.compose.ui.graphics;

import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Q0.j0;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import y0.C1981n;

/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9296a;

    public BlockGraphicsLayerElement(InterfaceC1182c interfaceC1182c) {
        this.f9296a = interfaceC1182c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.f9296a == ((BlockGraphicsLayerElement) obj).f9296a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9296a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new C1981n(this.f9296a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1981n c1981n = (C1981n) abstractC1397o;
        c1981n.f20249C = this.f9296a;
        j0 j0Var = AbstractC0347f.v(c1981n, 2).f6027F;
        if (j0Var != null) {
            j0Var.g1(c1981n.f20249C, true);
        }
    }
}
