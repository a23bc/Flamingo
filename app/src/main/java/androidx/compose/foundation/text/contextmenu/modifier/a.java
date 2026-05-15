package androidx.compose.foundation.text.contextmenu.modifier;

import L2.C0247a;
import O0.C;
import O0.w0;
import X.B0;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import l5.e;
import r0.InterfaceC1398p;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final InterfaceC1398p a(InterfaceC1398p interfaceC1398p, e eVar) {
        return interfaceC1398p.f(new AddTextContextMenuDataComponentsWithContextElement(eVar));
    }

    public static final InterfaceC1398p b(InterfaceC1182c interfaceC1182c) {
        return new TextContextMenuGestureElement(interfaceC1182c);
    }

    public static final InterfaceC1398p c(InterfaceC1398p interfaceC1398p, C0247a c0247a, InterfaceC1182c interfaceC1182c, B0 b0, InterfaceC1182c interfaceC1182c2) {
        return interfaceC1398p.f(new TextContextMenuToolbarHandlerElement(c0247a, interfaceC1182c, b0, interfaceC1182c2));
    }

    public static final C1893c d(C1893c c1893c, C c7, C c8) {
        if (!c7.y() || !c8.y()) {
            return C1893c.f19868e;
        }
        return AbstractC1113a.o(c8.K(w0.i(c7), c1893c.d()), c1893c.c());
    }
}
