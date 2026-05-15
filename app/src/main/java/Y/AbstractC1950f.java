package y;

import D.A;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0058c;
import D.C0066g;
import D.C0084z;
import D.EnumC0057b0;
import D.o0;
import D.q0;
import H.I;
import I.L;
import M.V;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import X.C0471d0;
import X.K;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.M;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.D;
import f0.InterfaceC0906p0;
import j5.AbstractC1107a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.AbstractC1256m;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1389g;
import r0.C1395m;
import r0.InterfaceC1398p;
import r1.EnumC1406E;
import r1.n;
import x.C1817E0;
import y0.AbstractC1959I;
import y0.C1987t;
import z.EnumC2048l0;

/* JADX INFO: renamed from: y.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1950f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1947c f20169a;

    static {
        EnumC1406E enumC1406E = EnumC1406E.f15661o;
        D d4 = n.f15708a;
        EnumC1406E enumC1406E2 = EnumC1406E.f15661o;
        EnumC1406E enumC1406E3 = EnumC1406E.f15661o;
        long j3 = C1987t.f20259f;
        long j7 = C1987t.f20255b;
        f20169a = new C1947c(j3, j7, j7, C1987t.b(j7, 0.38f), C1987t.b(j7, 0.38f));
    }

    public static final void a(C1947c c1947c, InterfaceC1398p interfaceC1398p, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(621449936);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(c1947c) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(dVar) ? 256 : 128;
        }
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.a.b(AbstractC1107a.A(interfaceC1398p, AbstractC1949e.f20158d, L.f.a(AbstractC1949e.f20159e), 0L, 0L, 28), c1947c.f20149a, AbstractC1959I.f20180a);
            EnumC0057b0 enumC0057b0 = EnumC0057b0.f1299o;
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.a.k(interfaceC1398pB), 0.0f, AbstractC1949e.f20162i, 1);
            Object[] objArr = new Object[0];
            V1.a aVar = C1817E0.f19618i;
            boolean zD = c0912t.d(0);
            Object objK = c0912t.K();
            if (zD || objK == C0903o.f11850a) {
                objK = new n6.c(29);
                c0912t.i0(objK);
            }
            C1817E0 c1817e0 = (C1817E0) AbstractC1256m.d(objArr, aVar, (InterfaceC1180a) objK, c0912t, 0);
            InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.a.i(interfaceC1398pI, c1817e0, EnumC2048l0.f20894o, true, null, c1817e0.f19621c, true, null, null).f(new ScrollingLayoutElement(c1817e0));
            int i9 = (i8 << 3) & 7168;
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j3 = c0912t.f11891T;
            int i10 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pF);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t, i10, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            dVar.d(A.f1206a, c0912t, Integer.valueOf(((i9 >> 6) & 112) | 6));
            c0912t.p(true);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(i7, 13, c1947c, interfaceC1398p, dVar);
        }
    }

    public static final void b(InterfaceC1398p interfaceC1398p, C1947c c1947c, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7, int i8) {
        int i9;
        int i10;
        c0912t.Z(-1430784946);
        int i11 = i8 & 1;
        if (i11 != 0) {
            i9 = i7 | 6;
        } else {
            i9 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        }
        int i12 = i8 & 2;
        if (i12 != 0) {
            i10 = i9 | 48;
        } else {
            i10 = i9 | (c0912t.f(c1947c) ? 32 : 16);
        }
        int i13 = i10 | (c0912t.h(interfaceC1182c) ? 256 : 128);
        if (c0912t.N(i13 & 1, (i13 & 147) != 146)) {
            if (i11 != 0) {
                interfaceC1398p = C1395m.f15634a;
            }
            if (i12 != 0) {
                c1947c = f20169a;
            }
            a(c1947c, interfaceC1398p, n0.e.e(860259975, new C0471d0(interfaceC1182c, c1947c), c0912t), c0912t, ((i13 << 3) & 112) | ((i13 >> 3) & 14) | 384);
        } else {
            c0912t.Q();
        }
        InterfaceC1398p interfaceC1398p2 = interfaceC1398p;
        C1947c c1947c2 = c1947c;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(interfaceC1398p2, c1947c2, interfaceC1182c, i7, i8);
        }
    }

    public static final void c(String str, C1947c c1947c, l5.f fVar, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        int i8;
        int i9;
        C1395m c1395m = C1395m.f15634a;
        c0912t.Z(-1027365588);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.g(true) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.f(c1947c) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.f(c1395m) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t.h(fVar) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0912t.h(interfaceC1180a) ? 131072 : 65536;
        }
        int i10 = i8;
        if (c0912t.N(i10 & 1, (74899 & i10) != 74898)) {
            C1389g c1389g = AbstractC1949e.f20160f;
            C0058c c0058c = AbstractC0068i.f1327a;
            float f7 = AbstractC1949e.h;
            C0066g c0066gG = AbstractC0068i.g(f7);
            boolean z6 = ((i10 & 458752) == 131072) | ((i10 & 112) == 32);
            Object objK = c0912t.K();
            if (z6 || objK == C0903o.f11850a) {
                objK = new L(interfaceC1180a, 9);
                c0912t.i0(objK);
            }
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.a.d(c1395m, true, str, (InterfaceC1180a) objK, 12), 1.0f)), f7, 0.0f, 2);
            q0 q0VarA = o0.a(c0066gG, c1389g, c0912t, 54);
            long j3 = c0912t.f11891T;
            int i11 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pI);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a2 = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a2);
            } else {
                c0912t.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i11))) {
                n1.c.w(i11, c0912t, i11, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t, interfaceC1398pC, c0351h4);
            if (fVar == null) {
                c0912t.X(-1483499797);
                c0912t.p(false);
                i9 = i10;
            } else {
                c0912t.X(-1483499796);
                float f8 = AbstractC1949e.f20163j;
                i9 = i10;
                InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.layout.c.f(c1395m, f8, 0.0f, f8, f8, 2);
                Z zD = AbstractC0074o.d(C1385c.f15612o, false);
                long j7 = c0912t.f11891T;
                int i12 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pF);
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(interfaceC1180a2);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, zD, c0351h);
                C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i12))) {
                    n1.c.w(i12, c0912t, i12, c0351h3);
                }
                C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
                fVar.d(new C1987t(c1947c.f20151c), c0912t, 0);
                c0912t.p(true);
                c0912t.p(false);
            }
            M m7 = new M(c1947c.f20150b, AbstractC1949e.f20165m, AbstractC1949e.f20166n, AbstractC1949e.f20168p, AbstractC1949e.f20161g, AbstractC1949e.f20167o, null, 0, 16613240);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            V.a(str, new LayoutWeightElement(1.0f, true), m7, 0, false, 1, 0, null, c0912t, (i9 & 14) | 1572864, 952);
            c0912t.p(true);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new K(str, c1947c, fVar, interfaceC1180a, i7, 4);
        }
    }
}
