package androidx.compose.foundation.text.handwriting;

import Q0.C0359o;
import U.c;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import l5.InterfaceC1180a;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0359o f9243a;

    static {
        float f7 = 40;
        float f8 = 10;
        f9243a = new C0359o(f8, f7, f8, f7);
    }

    public static final InterfaceC1398p a(boolean z6, boolean z7, InterfaceC1180a interfaceC1180a) {
        InterfaceC1398p stylusHoverIconModifierElement = C1395m.f15634a;
        if (!z6 || !c.f7025a) {
            return stylusHoverIconModifierElement;
        }
        if (z7) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f9243a);
        }
        return stylusHoverIconModifierElement.f(new StylusHandwritingElement(interfaceC1180a));
    }
}
