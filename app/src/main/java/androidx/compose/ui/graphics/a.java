package androidx.compose.ui.graphics;

import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;
import y0.C1967Q;
import y0.InterfaceC1963M;
import y0.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final InterfaceC1398p a(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new BlockGraphicsLayerElement(interfaceC1182c));
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, float f7, float f8, long j3, InterfaceC1963M interfaceC1963M, boolean z6, long j7, long j8) {
        return interfaceC1398p.f(new GraphicsLayerElement(f7, f8, j3, interfaceC1963M, z6, j7, j8));
    }

    public static InterfaceC1398p c(InterfaceC1398p interfaceC1398p, float f7, InterfaceC1963M interfaceC1963M, int i7) {
        if ((i7 & 4) != 0) {
            f7 = 1.0f;
        }
        float f8 = f7;
        long j3 = C1967Q.f20224b;
        if ((i7 & 2048) != 0) {
            interfaceC1963M = AbstractC1959I.f20180a;
        }
        long j7 = z.f20268a;
        return b(interfaceC1398p, f8, 0.0f, j3, interfaceC1963M, true, j7, j7);
    }
}
