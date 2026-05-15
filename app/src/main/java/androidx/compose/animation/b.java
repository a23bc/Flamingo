package androidx.compose.animation;

import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.W;
import i6.h;
import j5.AbstractC1107a;
import java.util.LinkedHashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.k;
import n1.m;
import r0.C1385c;
import r0.C1388f;
import r0.C1389g;
import r0.C1395m;
import r0.InterfaceC1386d;
import r0.InterfaceC1398p;
import v.C1584B;
import v.C1589G;
import v.C1591I;
import v.C1592J;
import v.C1593K;
import v.C1598P;
import v.C1599Q;
import v.C1600S;
import v.C1606c;
import v.EnumC1588F;
import v.v0;
import w.AbstractC1671d;
import w.InterfaceC1652A;
import w.S;
import w.c0;
import w.j0;
import w.m0;
import w.o0;
import w.p0;
import w.t0;
import x0.C1893c;
import y0.C1967Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f9111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f9112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f9113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S f9114d;

    static {
        C1606c c1606c = C1606c.f18059x;
        C1606c c1606c2 = C1606c.f18060y;
        o0 o0Var = p0.f18727a;
        f9111a = new o0(c1606c, c1606c2);
        f9112b = AbstractC1671d.k(0.0f, 400.0f, null, 5);
        C1893c c1893c = t0.f18746a;
        f9113c = AbstractC1671d.k(0.0f, 400.0f, new k(h.a(1, 1)), 1);
        f9114d = AbstractC1671d.k(0.0f, 400.0f, new m(AbstractC1107a.b(1, 1)), 1);
    }

    public static final InterfaceC1398p a(j0 j0Var, C1598P c1598p, C1599Q c1599q, String str, C0912t c0912t, int i7) {
        int i8;
        c0 c0Var;
        c0 c0Var2;
        C1584B c1584b;
        c0 c0VarB;
        c0 c0Var3;
        c0 c0Var4;
        j0 j0Var2;
        c0 c0Var5;
        C0912t c0912t2;
        Object c1589g;
        C0912t c0912t3;
        C1599Q c1599q2;
        C1598P c1598p2;
        C1591I c1591i = C1591I.f17975q;
        int i9 = i7 & 14;
        boolean z6 = ((i9 ^ 6) > 4 && c0912t.f(j0Var)) || (i7 & 6) == 4;
        Object objK = c0912t.K();
        W w7 = C0903o.f11850a;
        if (z6 || objK == w7) {
            objK = C0879c.t(c1598p);
            c0912t.i0(objK);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
        Object objC = j0Var.c();
        C0894j0 c0894j0 = j0Var.f18691d;
        Object value = c0894j0.getValue();
        EnumC1588F enumC1588F = EnumC1588F.f17963p;
        if (objC == value && j0Var.c() == enumC1588F) {
            if (j0Var.g()) {
                interfaceC0878b0.setValue(c1598p);
            } else {
                interfaceC0878b0.setValue(C1598P.f18003b);
            }
        } else if (c0894j0.getValue() == enumC1588F) {
            interfaceC0878b0.setValue(((C1598P) interfaceC0878b0.getValue()).a(c1598p));
        }
        C1598P c1598p3 = (C1598P) interfaceC0878b0.getValue();
        int i10 = i7 >> 3;
        int i11 = (i10 & 112) | i9;
        boolean z7 = (((i11 & 14) ^ 6) > 4 && c0912t.f(j0Var)) || (i11 & 6) == 4;
        Object objK2 = c0912t.K();
        if (z7 || objK2 == w7) {
            objK2 = C0879c.t(c1599q);
            c0912t.i0(objK2);
        }
        InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objK2;
        if (j0Var.c() == c0894j0.getValue() && j0Var.c() == enumC1588F) {
            if (j0Var.g()) {
                interfaceC0878b02.setValue(c1599q);
            } else {
                interfaceC0878b02.setValue(C1599Q.f18005b);
            }
        } else if (c0894j0.getValue() != enumC1588F) {
            interfaceC0878b02.setValue(((C1599Q) interfaceC0878b02.getValue()).a(c1599q));
        }
        C1599Q c1599q3 = (C1599Q) interfaceC0878b02.getValue();
        v0 v0Var = c1598p3.f18004a;
        v0 v0Var2 = c1599q3.f18007a;
        C1584B c1584b2 = v0Var.f18187b;
        boolean z8 = (c1584b2 == null && v0Var2.f18187b == null) ? false : true;
        c0912t.X(-821278096);
        c0912t.p(false);
        c0 c0VarB2 = null;
        if (z8) {
            c0912t.X(-821202177);
            o0 o0Var = p0.h;
            Object objK3 = c0912t.K();
            if (objK3 == w7) {
                objK3 = str.concat(" shrink/expand");
                c0912t.i0(objK3);
            }
            i8 = i10;
            c0 c0VarB3 = m0.b(j0Var, o0Var, (String) objK3, c0912t, i9 | 384, 0);
            c0912t.p(false);
            c0Var = c0VarB3;
        } else {
            i8 = i10;
            c0912t.X(-821099041);
            c0912t.p(false);
            c0Var = null;
        }
        if (z8) {
            c0912t.X(-821034002);
            o0 o0Var2 = p0.f18733g;
            Object objK4 = c0912t.K();
            if (objK4 == w7) {
                objK4 = str.concat(" InterruptionHandlingOffset");
                c0912t.i0(objK4);
            }
            c0 c0VarB4 = m0.b(j0Var, o0Var2, (String) objK4, c0912t, i9 | 384, 0);
            c0912t.p(false);
            c0Var2 = c0VarB4;
        } else {
            c0912t.X(-820883777);
            c0912t.p(false);
            c0Var2 = null;
        }
        v0 v0Var3 = c1599q3.f18007a;
        boolean z9 = ((c1584b2 == null || c1584b2.f17948d) && ((c1584b = v0Var3.f18187b) == null || c1584b.f17948d) && z8) ? false : true;
        int i12 = i9 | (i8 & 7168);
        boolean z10 = (v0Var.f18186a == null && v0Var3.f18186a == null) ? false : true;
        boolean z11 = (v0Var.f18188c == null && v0Var3.f18188c == null) ? false : true;
        if (z10) {
            c0912t.X(-675389204);
            o0 o0Var3 = p0.f18727a;
            Object objK5 = c0912t.K();
            if (objK5 == w7) {
                objK5 = str.concat(" alpha");
                c0912t.i0(objK5);
            }
            c0VarB = m0.b(j0Var, o0Var3, (String) objK5, c0912t, (i12 & 14) | 384, 0);
            c0912t.p(false);
        } else {
            c0912t.X(-675252433);
            c0912t.p(false);
            c0VarB = null;
        }
        if (z11) {
            c0912t.X(-675193780);
            c0 c0Var6 = c0VarB;
            o0 o0Var4 = p0.f18727a;
            Object objK6 = c0912t.K();
            if (objK6 == w7) {
                objK6 = str.concat(" scale");
                c0912t.i0(objK6);
            }
            c0Var3 = c0Var6;
            c0 c0VarB5 = m0.b(j0Var, o0Var4, (String) objK6, c0912t, (i12 & 14) | 384, 0);
            c0912t.p(false);
            c0Var4 = c0VarB5;
        } else {
            c0Var3 = c0VarB;
            c0912t.X(-675057009);
            c0912t.p(false);
            c0Var4 = null;
        }
        if (z11) {
            c0912t.X(-674987940);
            j0Var2 = j0Var;
            c0Var5 = c0Var4;
            c0VarB2 = m0.b(j0Var2, f9111a, "TransformOriginInterruptionHandling", c0912t, (i12 & 14) | 384, 0);
            c0912t2 = c0912t;
            c0912t2.p(false);
        } else {
            j0Var2 = j0Var;
            c0Var5 = c0Var4;
            c0912t2 = c0912t;
            c0912t2.X(-674835793);
            c0912t2.p(false);
        }
        c0 c0Var7 = c0VarB2;
        boolean zH = c0912t2.h(c0Var3) | c0912t2.f(c1598p3) | c0912t2.f(c1599q3) | c0912t2.h(c0Var5) | ((((i12 & 14) ^ 6) > 4 && c0912t2.f(j0Var2)) || (i12 & 6) == 4) | c0912t2.h(c0Var7);
        Object objK7 = c0912t2.K();
        if (zH || objK7 == w7) {
            c0912t3 = c0912t2;
            c1599q2 = c1599q3;
            c1598p2 = c1598p3;
            c1589g = new C1589G(c0Var3, c0Var5, j0Var, c1598p2, c1599q2, c0Var7);
            c0912t3.i0(c1589g);
        } else {
            c0912t3 = c0912t2;
            c1589g = objK7;
            c1599q2 = c1599q3;
            c1598p2 = c1598p3;
        }
        C1589G c1589g2 = (C1589G) c1589g;
        C1395m c1395m = C1395m.f15634a;
        boolean zG = c0912t3.g(z9) | ((((i7 & 7168) ^ 3072) > 2048 && c0912t3.f(c1591i)) || (i7 & 3072) == 2048);
        Object objK8 = c0912t3.K();
        if (zG || objK8 == w7) {
            objK8 = new C1592J(0, z9);
            c0912t3.i0(objK8);
        }
        return androidx.compose.ui.graphics.a.a(c1395m, (InterfaceC1182c) objK8).f(new EnterExitTransitionElement(j0Var, c0Var, c0Var2, c1598p2, c1599q2, c1589g2));
    }

    public static final C1598P b(InterfaceC1652A interfaceC1652A, C1388f c1388f, boolean z6, InterfaceC1182c interfaceC1182c) {
        return c(new C1593K(interfaceC1182c, 0), AbstractC1209k.a(c1388f, C1385c.f15608A) ? C1385c.f15615r : AbstractC1209k.a(c1388f, C1385c.f15610C) ? C1385c.f15617t : C1385c.f15616s, interfaceC1652A, z6);
    }

    public static final C1598P c(InterfaceC1182c interfaceC1182c, InterfaceC1386d interfaceC1386d, InterfaceC1652A interfaceC1652A, boolean z6) {
        return new C1598P(new v0((C1600S) null, new C1584B(interfaceC1182c, interfaceC1386d, interfaceC1652A, z6), (v.W) null, (LinkedHashMap) null, 59));
    }

    public static C1598P d(InterfaceC1652A interfaceC1652A, C1389g c1389g, b6.k kVar, int i7) {
        int i8 = 1;
        if ((i7 & 1) != 0) {
            C1893c c1893c = t0.f18746a;
            interfaceC1652A = AbstractC1671d.k(0.0f, 400.0f, new m(AbstractC1107a.b(1, 1)), 1);
        }
        int i9 = i7 & 2;
        C1389g c1389g2 = C1385c.f15623z;
        if (i9 != 0) {
            c1389g = c1389g2;
        }
        boolean z6 = (i7 & 4) != 0;
        InterfaceC1182c interfaceC1182c = kVar;
        if ((i7 & 8) != 0) {
            interfaceC1182c = C1606c.f18047B;
        }
        return c(new C1593K(interfaceC1182c, i8), AbstractC1209k.a(c1389g, C1385c.f15621x) ? C1385c.f15613p : AbstractC1209k.a(c1389g, c1389g2) ? C1385c.f15619v : C1385c.f15616s, interfaceC1652A, z6);
    }

    public static C1598P e(InterfaceC1652A interfaceC1652A, int i7) {
        if ((i7 & 1) != 0) {
            interfaceC1652A = AbstractC1671d.k(0.0f, 400.0f, null, 5);
        }
        return new C1598P(new v0(new C1600S(interfaceC1652A), (C1584B) null, (v.W) null, (LinkedHashMap) null, 62));
    }

    public static C1599Q f(InterfaceC1652A interfaceC1652A, int i7) {
        if ((i7 & 1) != 0) {
            interfaceC1652A = AbstractC1671d.k(0.0f, 400.0f, null, 5);
        }
        return new C1599Q(new v0(new C1600S(interfaceC1652A), (C1584B) null, (v.W) null, (LinkedHashMap) null, 62));
    }

    public static final C1598P g(float f7, long j3, InterfaceC1652A interfaceC1652A) {
        return new C1598P(new v0((C1600S) null, (C1584B) null, new v.W(f7, j3, interfaceC1652A), (LinkedHashMap) null, 55));
    }

    public static C1598P h(InterfaceC1652A interfaceC1652A, float f7, int i7) {
        if ((i7 & 1) != 0) {
            interfaceC1652A = AbstractC1671d.k(0.0f, 400.0f, null, 5);
        }
        return g(f7, C1967Q.f20224b, interfaceC1652A);
    }

    public static final C1599Q i(float f7, long j3, InterfaceC1652A interfaceC1652A) {
        return new C1599Q(new v0((C1600S) null, (C1584B) null, new v.W(f7, j3, interfaceC1652A), (LinkedHashMap) null, 55));
    }

    public static C1599Q j(S s7, float f7, int i7) {
        if ((i7 & 1) != 0) {
            s7 = AbstractC1671d.k(0.0f, 400.0f, null, 5);
        }
        return i(f7, C1967Q.f20224b, s7);
    }

    public static final C1599Q k(InterfaceC1652A interfaceC1652A, C1388f c1388f, boolean z6, InterfaceC1182c interfaceC1182c) {
        return l(new C1593K(interfaceC1182c, 2), AbstractC1209k.a(c1388f, C1385c.f15608A) ? C1385c.f15615r : AbstractC1209k.a(c1388f, C1385c.f15610C) ? C1385c.f15617t : C1385c.f15616s, interfaceC1652A, z6);
    }

    public static final C1599Q l(InterfaceC1182c interfaceC1182c, InterfaceC1386d interfaceC1386d, InterfaceC1652A interfaceC1652A, boolean z6) {
        return new C1599Q(new v0((C1600S) null, new C1584B(interfaceC1182c, interfaceC1386d, interfaceC1652A, z6), (v.W) null, (LinkedHashMap) null, 59));
    }

    public static C1599Q m(InterfaceC1652A interfaceC1652A, C1389g c1389g, b6.k kVar, int i7) {
        if ((i7 & 1) != 0) {
            C1893c c1893c = t0.f18746a;
            interfaceC1652A = AbstractC1671d.k(0.0f, 400.0f, new m(AbstractC1107a.b(1, 1)), 1);
        }
        int i8 = i7 & 2;
        C1389g c1389g2 = C1385c.f15623z;
        if (i8 != 0) {
            c1389g = c1389g2;
        }
        boolean z6 = (i7 & 4) != 0;
        InterfaceC1182c interfaceC1182c = kVar;
        if ((i7 & 8) != 0) {
            interfaceC1182c = C1606c.f18049D;
        }
        return l(new C1593K(interfaceC1182c, 3), AbstractC1209k.a(c1389g, C1385c.f15621x) ? C1385c.f15613p : AbstractC1209k.a(c1389g, c1389g2) ? C1385c.f15619v : C1385c.f15616s, interfaceC1652A, z6);
    }
}
