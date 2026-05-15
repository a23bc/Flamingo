package V4;

import D.AbstractC0074o;
import O0.Z;
import O0.w0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import a.AbstractC0509a;
import androidx.compose.foundation.gestures.DraggableElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.G0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.a1;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1393k;
import r0.InterfaceC1398p;
import r5.C1420a;
import t2.c0;
import w.AbstractC1671d;
import w.AbstractC1692z;
import w.n0;
import x.C1809A0;
import y0.C1987t;
import z.EnumC2048l0;
import z.K;
import z.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a */
    public static final float f7589a;

    /* JADX INFO: renamed from: b */
    public static final float f7590b;

    /* JADX INFO: renamed from: c */
    public static final float f7591c;

    /* JADX INFO: renamed from: d */
    public static final n0 f7592d;

    /* JADX INFO: renamed from: e */
    public static final n0 f7593e;

    /* JADX INFO: renamed from: f */
    public static final float f7594f;

    static {
        float f7 = 26;
        f7589a = f7;
        i6.g.d(f7, f7);
        f7590b = I.f7472d;
        f7591c = I.f7471c;
        c0 c0Var = AbstractC1692z.f18767b;
        f7592d = AbstractC1671d.l(180, 0, c0Var, 2);
        f7593e = AbstractC1671d.l(80, 0, c0Var, 2);
        f7594f = ((float) 0.125d) / 18;
    }

    public static final void a(float f7, InterfaceC1182c interfaceC1182c, InterfaceC1398p interfaceC1398p, boolean z6, C1420a c1420a, C0458e c0458e, B.k kVar, n0.d dVar, n0.d dVar2, C0912t c0912t, int i7) {
        int i8;
        n0.d dVarB;
        boolean z7;
        C0458e c0458e2;
        n0.d dVar3;
        C0458e c0458e3;
        boolean z8;
        AbstractC1209k.f(interfaceC1182c, "onValueChange");
        c0912t.Z(150850350);
        int i9 = i7 | (c0912t.c(f7) ? 4 : 2) | (c0912t.f(interfaceC1398p) ? 256 : 128) | 3072 | (c0912t.f(c1420a) ? 16384 : 8192) | 5963776;
        if ((1533916891 & i9) == 306783378 && c0912t.z()) {
            c0912t.Q();
            z8 = z6;
            c0458e3 = c0458e;
            dVar3 = dVar2;
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                c0912t.Y(555885630);
                c0912t.Y(-1864023982);
                long j3 = C1987t.f20259f;
                a1 a1Var = X4.c.f8322b;
                long j7 = ((X4.a) c0912t.j(a1Var)).f8313b;
                long j8 = ((X4.a) c0912t.j(a1Var)).f8315d;
                long j9 = ((X4.a) c0912t.j(a1Var)).f8315d;
                C0458e c0458e4 = new C0458e(j3, j7, j8, j9, j8, j3, C1987t.b(j7, 0.5f), j8, C1987t.b(j9, 0.5f), j8);
                c0912t.p(false);
                c0912t.p(false);
                i8 = i9 & (-29360129);
                dVarB = n0.e.b(c0912t, -1599065054, new O0.F(1, c0458e4));
                z7 = true;
                c0458e2 = c0458e4;
            } else {
                c0912t.Q();
                i8 = i9 & (-29360129);
                z7 = z6;
                c0458e2 = c0458e;
                dVarB = dVar2;
            }
            c0912t.q();
            b(interfaceC1398p, z7, kVar, interfaceC1182c, f7, c1420a, dVar, dVarB, c0912t, ((i8 << 9) & 29360128) | ((i8 >> 6) & 126) | 224640 | ((i8 << 18) & 3670016) | 905969664);
            C0458e c0458e5 = c0458e2;
            dVar3 = dVarB;
            c0458e3 = c0458e5;
            z8 = z7;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0462i(f7, interfaceC1182c, interfaceC1398p, z8, c1420a, c0458e3, kVar, dVar, dVar3, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(InterfaceC1398p interfaceC1398p, boolean z6, B.k kVar, InterfaceC1182c interfaceC1182c, float f7, C1420a c1420a, n0.d dVar, n0.d dVar2, C0912t c0912t, int i7) {
        int i8;
        InterfaceC0878b0 interfaceC0878b0;
        float f8;
        int i9;
        W w7;
        InterfaceC0878b0 interfaceC0878b02;
        boolean z7;
        char c7;
        K k7;
        Y4.e eVar;
        C1420a c1420a2;
        boolean z8;
        B.k kVar2;
        C0912t c0912t2;
        n0.d dVar3;
        InterfaceC1182c interfaceC1182c2 = interfaceC1182c;
        n0.d dVar4 = dVar2;
        c0912t.Z(1889334473);
        if ((i7 & 14) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 112) == 0) {
            i8 |= c0912t.g(z6) ? 32 : 16;
        }
        if ((i7 & 896) == 0) {
            i8 |= c0912t.f(kVar) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i8 |= c0912t.h(interfaceC1182c2) ? 2048 : 1024;
        }
        if ((57344 & i7) == 0) {
            i8 |= c0912t.h(null) ? 16384 : 8192;
        }
        if ((i7 & 458752) == 0) {
            i8 |= c0912t.d(0) ? 131072 : 65536;
        }
        if ((i7 & 3670016) == 0) {
            i8 |= c0912t.c(f7) ? 1048576 : 524288;
        }
        if ((i7 & 29360128) == 0) {
            i8 |= c0912t.f(c1420a) ? 8388608 : 4194304;
        }
        if ((i7 & 234881024) == 0) {
            i8 |= c0912t.h(dVar) ? 67108864 : 33554432;
        }
        if ((i7 & 1879048192) == 0) {
            i8 |= c0912t.h(dVar4) ? 536870912 : 268435456;
        }
        if ((i8 & 1533916891) == 306783378 && c0912t.z()) {
            c0912t.Q();
            kVar2 = kVar;
            c0912t2 = c0912t;
            c1420a2 = c1420a;
            z8 = z6;
            dVar3 = dVar4;
        } else {
            c0912t.Y(1591751538);
            int i10 = i8 & 3670016;
            boolean z9 = (i10 == 1048576) | ((i8 & 7168) == 2048);
            Object objK = c0912t.K();
            W w8 = C0903o.f11850a;
            if (z9 || objK == w8) {
                objK = new o(f7, interfaceC1182c2);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            InterfaceC0878b0 interfaceC0878b0X = C0879c.x((InterfaceC1182c) objK, c0912t);
            c0912t.Y(1591751638);
            boolean z10 = (i8 & 458752) == 131072;
            Object objK2 = c0912t.K();
            if (z10 || objK2 == w8) {
                objK2 = new float[0];
                c0912t.i0(objK2);
            }
            float[] fArr = (float[]) objK2;
            c0912t.p(false);
            c0912t.Y(1591751720);
            Object objK3 = c0912t.K();
            if (objK3 == w8) {
                objK3 = C0879c.t(Float.valueOf(f7589a));
                c0912t.i0(objK3);
            }
            InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) objK3;
            c0912t.p(false);
            c0912t.Y(1591751787);
            Object objK4 = c0912t.K();
            if (objK4 == w8) {
                objK4 = C0879c.t(0);
                c0912t.i0(objK4);
            }
            InterfaceC0878b0 interfaceC0878b04 = (InterfaceC0878b0) objK4;
            c0912t.p(false);
            boolean z11 = c0912t.j(AbstractC0403q0.f6513n) == n1.n.f14522p;
            c0912t.Y(1591752211);
            Object objK5 = c0912t.K();
            if (objK5 == w8) {
                objK5 = AbstractC0509a.O(new p(interfaceC0878b04, interfaceC0878b03, f7, c1420a));
                c0912t.i0(objK5);
            }
            Y4.e eVar2 = (Y4.e) objK5;
            boolean z12 = z11;
            c0912t.p(false);
            c0912t.Y(1591752468);
            Object objK6 = c0912t.K();
            if (objK6 == w8) {
                objK6 = C0879c.t(Float.valueOf(0.0f));
                c0912t.i0(objK6);
            }
            InterfaceC0878b0 interfaceC0878b05 = (InterfaceC0878b0) objK6;
            c0912t.p(false);
            float f9 = c1420a.f15779a;
            float f10 = c1420a.f15780b;
            float fP = i6.h.p(f7, f9, f10);
            float f11 = f10 - f9;
            if (f11 == 0.0f) {
                interfaceC0878b0 = interfaceC0878b05;
                f8 = 0.0f;
            } else {
                float f12 = (fP - f9) / f11;
                interfaceC0878b0 = interfaceC0878b05;
                f8 = f12;
            }
            float fP2 = i6.h.p(f8, 0.0f, 1.0f);
            c0912t.Y(1591752695);
            Object objK7 = c0912t.K();
            if (objK7 == w8) {
                objK7 = new H(new C1420a(0.0f, fP2), fArr);
                c0912t.i0(objK7);
            }
            H h = (H) objK7;
            c0912t.p(false);
            C1420a c1420a3 = new C1420a(0.0f, fP2);
            h.getClass();
            h.f7467a.setValue(c1420a3);
            AbstractC1209k.f(fArr, "<set-?>");
            h.f7468b.setValue(fArr);
            G0.a aVar = (G0.a) c0912t.j(AbstractC0403q0.l);
            c0912t.Y(1591752946);
            boolean z13 = i10 == 1048576;
            Object objK8 = c0912t.K();
            if (z13 || objK8 == w8) {
                objK8 = C0879c.t(Float.valueOf(f7));
                c0912t.i0(objK8);
            }
            InterfaceC0878b0 interfaceC0878b06 = (InterfaceC0878b0) objK8;
            c0912t.p(false);
            c0912t.Y(1591753026);
            boolean z14 = (i8 & 29360128) == 8388608;
            Object objK9 = c0912t.K();
            if (z14 || objK9 == w8) {
                i9 = i8;
                w7 = w8;
                interfaceC0878b02 = interfaceC0878b04;
                z7 = false;
                c7 = ' ';
                k7 = null;
                eVar = eVar2;
                c1420a2 = c1420a;
                objK9 = new G(new n(interfaceC0878b02, interfaceC0878b03, eVar2, interfaceC0878b0, fArr, aVar, interfaceC0878b0X, c1420a, interfaceC0878b06));
                c0912t.i0(objK9);
            } else {
                i9 = i8;
                w7 = w8;
                interfaceC0878b02 = interfaceC0878b04;
                z7 = false;
                c7 = ' ';
                k7 = null;
                c1420a2 = c1420a;
                eVar = eVar2;
            }
            G g6 = (G) objK9;
            c0912t.p(z7);
            InterfaceC0878b0 interfaceC0878b0X2 = C0879c.x(new E0.K(13, g6), c0912t);
            C0912t c0912t3 = c0912t;
            K k8 = k7;
            W w9 = w7;
            w wVar = new w(z6, g6, kVar, ((Number) interfaceC0878b02.getValue()).intValue(), z12, eVar, interfaceC0878b0X2);
            z8 = z6;
            kVar2 = kVar;
            C1393k c1393k = new C1393k(wVar);
            EnumC2048l0 enumC2048l0 = EnumC2048l0.f20895p;
            boolean zBooleanValue = ((Boolean) g6.f7464b.getValue()).booleanValue();
            c0912t3.Y(1591754520);
            boolean zF = c0912t3.f(interfaceC0878b0X2);
            Object objK10 = c0912t3.K();
            if (zF || objK10 == w9) {
                objK10 = new m(interfaceC0878b0X2, k8, 0);
                c0912t3.i0(objK10);
            }
            l5.f fVar = (l5.f) objK10;
            c0912t3.p(false);
            DraggableElement draggableElement = new DraggableElement(g6, enumC2048l0, (c7 & 4) != 0 ? true : z8, (c7 & '\b') != 0 ? k8 : kVar2, (c7 & 16) != 0 ? false : zBooleanValue, (c7 & c7) != 0 ? L.f20674a : k8, fVar, (c7 & 128) != 0 ? false : z12);
            InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.layout.c.f(interfaceC1398p, I.f7470b, I.f7469a, 0.0f, 0.0f, 12);
            float fP3 = i6.h.p(f7, f9, f10);
            interfaceC1182c2 = interfaceC1182c;
            InterfaceC1398p interfaceC1398pF2 = androidx.compose.foundation.a.f(Y0.l.a(Y0.l.a(interfaceC1398pF, false, new s(z8, c1420a2, fP3, interfaceC1182c2)), true, new C1809A0(f7, c1420a2)), z8, kVar2).f(c1393k);
            c0912t3.Y(1591755475);
            boolean zC = c0912t3.c(fP2);
            Object objK11 = c0912t3.K();
            if (zC || objK11 == w9) {
                objK11 = new k(fP2, interfaceC0878b03, interfaceC0878b02);
                c0912t3.i0(objK11);
            }
            Z z15 = (Z) objK11;
            c0912t3.p(false);
            c0912t3.Y(-1323940314);
            int iP = C0879c.p(c0912t3);
            InterfaceC0906p0 interfaceC0906p0L = c0912t3.l();
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            n0.d dVarK = w0.k(interfaceC1398pF2);
            c0912t3.b0();
            if (c0912t3.f11890S) {
                c0912t3.k(c0353i);
            } else {
                c0912t3.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t3, z15, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t3, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(iP))) {
                n1.c.w(iP, c0912t3, iP, c0351h3);
            }
            dVarK.d(new G0(c0912t3), c0912t3, 0);
            c0912t3.Y(2058660585);
            InterfaceC1398p interfaceC1398pC = androidx.compose.ui.layout.a.c(D.f7454o);
            c0912t3.Y(733328855);
            D.r rVarE = AbstractC0074o.e(0, c0912t3, false);
            c0912t3.Y(-1323940314);
            int iP2 = C0879c.p(c0912t3);
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t3.l();
            n0.d dVarK2 = w0.k(interfaceC1398pC);
            c0912t3.b0();
            if (c0912t3.f11890S) {
                c0912t3.k(c0353i);
            } else {
                c0912t3.l0();
            }
            C0879c.y(c0912t3, rVarE, c0351h);
            C0879c.y(c0912t3, interfaceC0906p0L2, c0351h2);
            if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(iP2))) {
                n1.c.w(iP2, c0912t3, iP2, c0351h3);
            }
            dVarK2.d(new G0(c0912t3), c0912t3, 0);
            c0912t3.Y(2058660585);
            c0912t3.Y(733328855);
            D.r rVarE2 = AbstractC0074o.e(0, c0912t3, false);
            c0912t3.Y(-1323940314);
            int iP3 = C0879c.p(c0912t3);
            InterfaceC0906p0 interfaceC0906p0L3 = c0912t3.l();
            n0.d dVarK3 = w0.k(draggableElement);
            c0912t3.b0();
            if (c0912t3.f11890S) {
                c0912t3.k(c0353i);
            } else {
                c0912t3.l0();
            }
            C0879c.y(c0912t3, rVarE2, c0351h);
            C0879c.y(c0912t3, interfaceC0906p0L3, c0351h2);
            if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(iP3))) {
                n1.c.w(iP3, c0912t3, iP3, c0351h3);
            }
            dVarK3.d(new G0(c0912t3), c0912t3, 0);
            c0912t3.Y(2058660585);
            dVar.d(h, c0912t3, Integer.valueOf(((i9 >> 21) & 112) | 6));
            c0912t3.p(false);
            c0912t3.p(true);
            c0912t3.p(false);
            c0912t3.p(false);
            c0912t3.p(false);
            c0912t3.p(true);
            c0912t3.p(false);
            c0912t3.p(false);
            InterfaceC1398p interfaceC1398pC2 = androidx.compose.ui.layout.a.c(D.f7455p);
            c0912t3.Y(733328855);
            D.r rVarE3 = AbstractC0074o.e(0, c0912t3, false);
            c0912t3.Y(-1323940314);
            int iP4 = C0879c.p(c0912t3);
            InterfaceC0906p0 interfaceC0906p0L4 = c0912t3.l();
            n0.d dVarK4 = w0.k(interfaceC1398pC2);
            c0912t3.b0();
            if (c0912t3.f11890S) {
                c0912t3.k(c0353i);
            } else {
                c0912t3.l0();
            }
            C0879c.y(c0912t3, rVarE3, c0351h);
            C0879c.y(c0912t3, interfaceC0906p0L4, c0351h2);
            if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(iP4))) {
                n1.c.w(iP4, c0912t3, iP4, c0351h3);
            }
            dVarK4.d(new G0(c0912t3), c0912t3, 0);
            c0912t3.Y(2058660585);
            n0.d dVar5 = dVar2;
            dVar5.d(h, c0912t3, Integer.valueOf(((i9 >> 24) & 112) | 6));
            c0912t3.p(false);
            c0912t3.p(true);
            c0912t3.p(false);
            c0912t3.p(false);
            c0912t3.p(false);
            c0912t3.p(true);
            c0912t3.p(false);
            dVar3 = dVar5;
            c0912t2 = c0912t3;
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l(interfaceC1398p, z8, kVar2, interfaceC1182c2, f7, c1420a2, dVar, dVar3, i7);
        }
    }
}
