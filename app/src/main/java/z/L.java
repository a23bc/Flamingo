package z;

import androidx.compose.foundation.gestures.DraggableElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a */
    public static final K f20674a = new K(3, null, 0);

    /* JADX INFO: renamed from: b */
    public static final K f20675b = new K(3, null, 1);

    public static InterfaceC1398p a(InterfaceC1398p interfaceC1398p, Q q7, EnumC2048l0 enumC2048l0, boolean z6, B.k kVar, boolean z7, l5.f fVar, l5.f fVar2, boolean z8, int i7) {
        if ((i7 & 4) != 0) {
            z6 = true;
        }
        boolean z9 = z6;
        if ((i7 & 8) != 0) {
            kVar = null;
        }
        return interfaceC1398p.f(new DraggableElement(q7, enumC2048l0, z9, kVar, (i7 & 16) != 0 ? false : z7, (i7 & 32) != 0 ? f20674a : fVar, fVar2, (i7 & 128) != 0 ? false : z8));
    }

    public static final Q b(InterfaceC1182c interfaceC1182c, C0912t c0912t) {
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(interfaceC1182c, c0912t);
        Object objK = c0912t.K();
        if (objK == C0903o.f11850a) {
            C2043j c2043j = new C2043j(new M.t0(interfaceC0878b0X, 27));
            c0912t.i0(c2043j);
            objK = c2043j;
        }
        return (Q) objK;
    }
}
