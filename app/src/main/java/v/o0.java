package v;

import f0.C0903o;
import f0.C0912t;
import f0.Z0;
import w.AbstractC1671d;
import w.AbstractC1674g;
import w.InterfaceC1679l;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a */
    public static final w.S f18136a = AbstractC1671d.k(0.0f, 0.0f, null, 7);

    public static final Z0 a(long j3, w.n0 n0Var, C0912t c0912t, int i7, int i8) {
        InterfaceC1679l interfaceC1679l = n0Var;
        if ((i8 & 2) != 0) {
            interfaceC1679l = f18136a;
        }
        InterfaceC1679l interfaceC1679l2 = interfaceC1679l;
        String str = (i8 & 4) != 0 ? "ColorAnimation" : "color_effect_animation";
        boolean zF = c0912t.f(C1987t.f(j3));
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            z0.c cVarF = C1987t.f(j3);
            C1606c c1606c = C1606c.f18057v;
            C1628y c1628y = new C1628y(1, cVarF);
            w.o0 o0Var = w.p0.f18727a;
            w.o0 o0Var2 = new w.o0(c1606c, c1628y);
            c0912t.i0(o0Var2);
            objK = o0Var2;
        }
        return AbstractC1674g.c(new C1987t(j3), (w.o0) objK, interfaceC1679l2, null, str, c0912t, ((i7 << 3) & 896) | ((i7 << 6) & 57344), 8);
    }
}
