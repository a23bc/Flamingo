package w;

import K0.C0236d;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import x0.C1893c;

/* JADX INFO: renamed from: w.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1674g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f18676a = AbstractC1671d.k(0.0f, 0.0f, null, 7);

    static {
        C1893c c1893c = t0.f18746a;
        new n1.g(0.1f);
        i6.h.i(0.5f, 0.5f);
        AbstractC1110d.g(0.5f, 0.5f);
    }

    public static final Z0 a(float f7, InterfaceC1652A interfaceC1652A, C0912t c0912t, int i7) {
        return c(new n1.g(f7), p0.f18729c, interfaceC1652A, null, "DpAnimation", c0912t, (i7 << 3) & 896, 8);
    }

    public static final Z0 b(float f7, InterfaceC1652A interfaceC1652A, float f8, String str, C0912t c0912t, int i7, int i8) {
        int i9 = i8 & 2;
        S s7 = f18676a;
        InterfaceC1652A interfaceC1652A2 = i9 != 0 ? s7 : interfaceC1652A;
        float f9 = (i8 & 4) != 0 ? 0.01f : f8;
        String str2 = (i8 & 8) != 0 ? "FloatAnimation" : str;
        if (interfaceC1652A2 == s7) {
            c0912t.X(1125598679);
            boolean z6 = (((i7 & 896) ^ 384) > 256 && c0912t.c(f9)) || (i7 & 384) == 256;
            Object objK = c0912t.K();
            if (z6 || objK == C0903o.f11850a) {
                objK = AbstractC1671d.k(0.0f, 0.0f, Float.valueOf(f9), 3);
                c0912t.i0(objK);
            }
            interfaceC1652A2 = (S) objK;
            c0912t.p(false);
        } else {
            c0912t.X(1125708605);
            c0912t.p(false);
        }
        return c(Float.valueOf(f7), p0.f18727a, interfaceC1652A2, Float.valueOf(f9), str2, c0912t, (i7 << 3) & 64512, 0);
    }

    public static final Z0 c(Object obj, o0 o0Var, InterfaceC1679l interfaceC1679l, Float f7, String str, C0912t c0912t, int i7, int i8) {
        Object obj2 = C0903o.f11850a;
        if ((i8 & 8) != 0) {
            f7 = null;
        }
        Object objK = c0912t.K();
        if (objK == obj2) {
            objK = C0879c.t(null);
            c0912t.i0(objK);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
        Object objK2 = c0912t.K();
        if (objK2 == obj2) {
            objK2 = new C1670c(obj, o0Var, f7);
            c0912t.i0(objK2);
        }
        C1670c c1670c = (C1670c) objK2;
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(null, c0912t);
        if (f7 != null && (interfaceC1679l instanceof S)) {
            S s7 = (S) interfaceC1679l;
            if (!AbstractC1209k.a(s7.f18557c, f7)) {
                interfaceC1679l = new S(s7.f18555a, s7.f18556b, f7);
            }
        }
        InterfaceC0878b0 interfaceC0878b0X2 = C0879c.x(interfaceC1679l, c0912t);
        Object objK3 = c0912t.K();
        if (objK3 == obj2) {
            objK3 = y5.j.a(-1, 6, null);
            c0912t.i0(objK3);
        }
        y5.g gVar = (y5.g) objK3;
        boolean zH = c0912t.h(gVar) | c0912t.h(obj);
        Object objK4 = c0912t.K();
        if (zH || objK4 == obj2) {
            objK4 = new C0236d(gVar, 12, obj);
            c0912t.i0(objK4);
        }
        C0879c.g((InterfaceC1180a) objK4, c0912t);
        boolean zH2 = c0912t.h(gVar) | c0912t.h(c1670c) | c0912t.f(interfaceC0878b0X2) | c0912t.f(interfaceC0878b0X);
        Object objK5 = c0912t.K();
        if (zH2 || objK5 == obj2) {
            Object c1673f = new C1673f(gVar, c1670c, interfaceC0878b0X2, interfaceC0878b0X, null);
            c0912t.i0(c1673f);
            objK5 = c1673f;
        }
        C0879c.e(c0912t, gVar, (l5.e) objK5);
        Z0 z02 = (Z0) interfaceC0878b0.getValue();
        return z02 == null ? c1670c.f18630c : z02;
    }
}
