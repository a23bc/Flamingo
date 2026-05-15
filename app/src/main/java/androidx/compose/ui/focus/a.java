package androidx.compose.ui.focus;

import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import w0.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final InterfaceC1398p a(InterfaceC1398p interfaceC1398p, p pVar) {
        return interfaceC1398p.f(new FocusRequesterElement(pVar));
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new FocusChangedElement(interfaceC1182c));
    }
}
