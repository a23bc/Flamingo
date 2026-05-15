package androidx.compose.ui.layout;

import O0.D;
import O0.Y;
import l5.InterfaceC1182c;
import l5.f;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(Y y6) {
        Object objI = y6.i();
        D d4 = objI instanceof D ? (D) objI : null;
        if (d4 != null) {
            return d4.f5287C;
        }
        return null;
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, f fVar) {
        return interfaceC1398p.f(new LayoutElement(fVar));
    }

    public static final InterfaceC1398p c(Enum r12) {
        return new LayoutIdElement(r12);
    }

    public static final InterfaceC1398p d(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new OnGloballyPositionedElement(interfaceC1182c));
    }

    public static final InterfaceC1398p e(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new OnPlacedElement(interfaceC1182c));
    }

    public static final InterfaceC1398p f(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new OnSizeChangedModifier(interfaceC1182c));
    }
}
