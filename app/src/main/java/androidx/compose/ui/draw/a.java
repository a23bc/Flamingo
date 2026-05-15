package androidx.compose.ui.draw;

import D0.b;
import l5.InterfaceC1182c;
import r0.C1385c;
import r0.C1390h;
import r0.InterfaceC1398p;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final InterfaceC1398p a(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new DrawBehindElement(interfaceC1182c));
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new DrawWithCacheElement(interfaceC1182c));
    }

    public static final InterfaceC1398p c(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new DrawWithContentElement(interfaceC1182c));
    }

    public static InterfaceC1398p d(InterfaceC1398p interfaceC1398p, b bVar, float f7, C1980m c1980m, int i7) {
        C1390h c1390h = C1385c.f15616s;
        if ((i7 & 16) != 0) {
            f7 = 1.0f;
        }
        return interfaceC1398p.f(new PainterElement(bVar, c1390h, f7, c1980m));
    }
}
