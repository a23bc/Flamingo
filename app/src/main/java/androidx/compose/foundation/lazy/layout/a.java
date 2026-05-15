package androidx.compose.foundation.lazy.layout;

import B5.i;
import H.C0170l;
import H.InterfaceC0174p;
import H.b0;
import r0.InterfaceC1398p;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final InterfaceC1398p a(InterfaceC0174p interfaceC0174p, C0170l c0170l, EnumC2048l0 enumC2048l0) {
        return new LazyLayoutBeyondBoundsModifierElement(interfaceC0174p, c0170l, enumC2048l0);
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, i iVar, b0 b0Var, EnumC2048l0 enumC2048l0, boolean z6) {
        return interfaceC1398p.f(new LazyLayoutSemanticsModifier(iVar, b0Var, enumC2048l0, z6));
    }
}
