package u4;

import R0.AbstractC0403q0;
import f0.C0879c;
import f0.C0886f0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.W;
import h6.r;
import j0.k;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class f implements l5.f {
    public static final boolean e(InterfaceC0878b0 interfaceC0878b0) {
        return ((Boolean) interfaceC0878b0.getValue()).booleanValue();
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1398p interfaceC1398p = (InterfaceC1398p) obj;
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f(interfaceC1398p, "$this$composed");
        c0912t.X(-42826998);
        Boolean bool = Boolean.TRUE;
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(bool, c0912t);
        c0912t.X(1661907901);
        W w7 = C0903o.f11850a;
        c0912t.X(-1140298759);
        float fB = ((n1.d) c0912t.j(AbstractC0403q0.h)).b();
        c0912t.X(-1967793518);
        boolean zC = c0912t.c(fB);
        Object objK = c0912t.K();
        if (zC || objK == w7) {
            objK = new r(fB);
            c0912t.i0(objK);
        }
        c0912t.p(false);
        c0912t.p(false);
        c0912t.p(false);
        InterfaceC0878b0 interfaceC0878b0X2 = C0879c.x((l5.e) objK, c0912t);
        InterfaceC0878b0 interfaceC0878b0X3 = C0879c.x(Float.valueOf(150.0f), c0912t);
        InterfaceC0878b0 interfaceC0878b0X4 = C0879c.x(Float.valueOf(0.86f), c0912t);
        InterfaceC0878b0 interfaceC0878b0X5 = C0879c.x(bool, c0912t);
        c0912t.X(1661915351);
        Object objK2 = c0912t.K();
        if (objK2 == w7) {
            objK2 = new J0.d();
            c0912t.i0(objK2);
        }
        J0.d dVar = (J0.d) objK2;
        Object objR = n1.c.r(1661917142, c0912t, false);
        if (objR == w7) {
            objR = new C0886f0(0.0f);
            c0912t.i0(objR);
        }
        C0886f0 c0886f0 = (C0886f0) objR;
        Object objR2 = n1.c.r(1661925344, c0912t, false);
        if (objR2 == w7) {
            e eVar = new e(dVar, interfaceC0878b0X, interfaceC0878b0X5, c0886f0, interfaceC0878b0X2, interfaceC0878b0X4, interfaceC0878b0X3);
            c0912t.i0(eVar);
            objR2 = eVar;
        }
        c0912t.p(false);
        InterfaceC1398p interfaceC1398pA = androidx.compose.ui.input.nestedscroll.a.a(k.r(interfaceC1398p), (e) objR2, dVar);
        c0912t.X(1662119850);
        boolean zF = c0912t.f(interfaceC0878b0X5);
        Object objK3 = c0912t.K();
        if (zF || objK3 == w7) {
            objK3 = new C1536a(interfaceC0878b0X5, c0886f0, 0);
            c0912t.i0(objK3);
        }
        c0912t.p(false);
        InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.graphics.a.a(interfaceC1398pA, (InterfaceC1182c) objK3);
        c0912t.p(false);
        return interfaceC1398pA2;
    }
}
