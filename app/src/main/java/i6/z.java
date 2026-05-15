package i6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0080v;
import D.C0084z;
import D.o0;
import D.q0;
import E0.C0095f;
import I.C0210b;
import M.C0248a;
import M.C0271p;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0435g;
import X.C0471d0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w5.InterfaceC1765B;
import x0.C1892b;
import y0.AbstractC1959I;
import y0.C1987t;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final void a(InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, long j3, C0912t c0912t, int i7) {
        InterfaceC0878b0 interfaceC0878b0;
        AbstractC1209k.f(interfaceC1180a, "expandedLambda");
        AbstractC1209k.f(interfaceC1182c, "expandedOnChanged");
        c0912t.Z(-1555707853);
        if (((i7 | (c0912t.e(j3) ? 256 : 128)) & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.X(1242426065);
            Object objK = c0912t.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.t(Boolean.FALSE);
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objK;
            Object objR = n1.c.r(1242429041, c0912t, false);
            if (objR == w7) {
                objR = C0879c.t(Boolean.FALSE);
                c0912t.i0(objR);
            }
            InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) objR;
            c0912t.p(false);
            c0912t.X(1242437295);
            if (((Boolean) interfaceC0878b02.getValue()).booleanValue()) {
                c0912t.X(1242435745);
                Object objK2 = c0912t.K();
                if (objK2 == w7) {
                    objK2 = new h6.W(interfaceC1182c, 2);
                    c0912t.i0(objK2);
                }
                c0912t.p(false);
                interfaceC0878b0 = interfaceC0878b03;
                r1.n.b(null, 0L, (InterfaceC1180a) objK2, null, n0.e.e(-542936357, new l(interfaceC1182c, interfaceC0878b03, j3, 0), c0912t), c0912t, 24576);
            } else {
                interfaceC0878b0 = interfaceC0878b03;
            }
            c0912t.p(false);
            Object objA = interfaceC1180a.a();
            c0912t.X(1242619751);
            Object objK3 = c0912t.K();
            if (objK3 == w7) {
                objK3 = new m(interfaceC1180a, interfaceC0878b02, interfaceC0878b0, null);
                c0912t.i0(objK3);
            }
            c0912t.p(false);
            C0879c.e(c0912t, objA, (l5.e) objK3);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0248a(interfaceC1180a, interfaceC1182c, j3, i7, 1);
        }
    }

    public static final void b(int i7, C0912t c0912t) {
        c0912t.Z(1632544992);
        if (i7 == 0 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.c(C1395m.f15634a, 8));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new b1.x(i7, 6);
        }
    }

    public static final void c(String str, C0095f c0095f, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C0912t c0912t2 = c0912t;
        AbstractC1209k.f(str, "label");
        c0912t2.Z(1020246609);
        int i8 = i7 | (c0912t2.f(str) ? 4 : 2) | (c0912t2.f(c0095f) ? 32 : 16);
        if ((i8 & 147) == 146 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            float f7 = 18;
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.d(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(c1395m, 0.618f), 48), C1987t.b(t6.a.b(C1987t.f20259f, C1987t.f20255b, c0912t2), 0.68f), AbstractC1959I.f20180a), false, null, interfaceC1180a, 15), f7, 0.0f, 2);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t2, 48);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pI);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, q0VarA, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            long jT = AbstractC1109c.t(17.5d);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            H0.b(str, androidx.compose.foundation.layout.a.j(h.l(new LayoutWeightElement(1.0f, true), 0.9f), 0.0f, 0.0f, f7, 0.0f, 11), 0L, jT, null, null, 0L, null, 0L, 2, false, 1, 0, null, c0912t, (i8 & 14) | 3072, 3120, 120820);
            c0912t2 = c0912t;
            AbstractC0774A.b(c0095f, androidx.compose.foundation.layout.c.g(c1395m, 24), ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11107o, c0912t2, ((i8 >> 3) & 14) | 432);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0271p(i7, 3, str, c0095f, interfaceC1180a);
        }
    }

    public static final void d(int i7, C0912t c0912t) {
        c0912t.Z(343860173);
        if (i7 == 0 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC0060d.d(c0912t, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(h.l(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 0.618f), 0.1f), (float) 0.65d), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t), AbstractC1959I.f20180a));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new b1.x(i7, 5);
        }
    }

    public static final void e(y3.x xVar, C0912t c0912t, int i7) {
        char c7;
        List list;
        InterfaceC0878b0 interfaceC0878b0;
        boolean z6;
        int i8;
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(1409501659);
        if (((i7 | (c0912t.h(xVar) ? 4 : 2)) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t, c0084zA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t, interfaceC1398pC, c0351h4);
            Object value = a6.a.f8882c.getValue();
            List list2 = (List) a6.a.f8881b.getValue();
            c0912t.X(-931255258);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = C0879c.t("");
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objK;
            Object objR = n1.c.r(-931251915, c0912t, false);
            if (objR == obj) {
                c7 = ' ';
                objR = C0879c.o(new C0210b(2, list2));
                c0912t.i0(objR);
            } else {
                c7 = ' ';
            }
            c0912t.p(false);
            if (((Boolean) ((Z0) objR).getValue()).booleanValue()) {
                c0912t.X(1196133294);
                if (list2 == null) {
                    c0912t.X(-931244925);
                    i8 = R.string.tip_scanning;
                } else {
                    c0912t.X(-931243352);
                    i8 = R.string.tip_no_song;
                }
                String strS = I0.c.S(i8, c0912t);
                c0912t.p(false);
                String str = (String) value;
                c0912t.X(-931238627);
                boolean zH = c0912t.h(xVar);
                Object objK2 = c0912t.K();
                if (zH || objK2 == obj) {
                    objK2 = new d(xVar, 3);
                    c0912t.i0(objK2);
                }
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK2;
                c0912t.p(false);
                c0912t.X(-931235664);
                boolean zF = c0912t.f(strS);
                Object objK3 = c0912t.K();
                if (zF || objK3 == obj) {
                    objK3 = new C0435g(strS, 1);
                    c0912t.i0(objK3);
                }
                c0912t.p(false);
                AbstractC1110d.h(str, null, false, interfaceC1180a2, null, null, null, 0.0f, false, (InterfaceC1182c) objK3, c0912t, 0, 502);
                c0912t.p(false);
                z6 = true;
            } else {
                c0912t.X(1197057745);
                c0912t.X(-931222506);
                Object objK4 = c0912t.K();
                if (objK4 == obj) {
                    objK4 = C0879c.o(new F.m(interfaceC0878b02, 28));
                    c0912t.i0(objK4);
                }
                Z0 z02 = (Z0) objK4;
                Object objR2 = n1.c.r(-931218713, c0912t, false);
                if (objR2 == obj) {
                    objR2 = C0879c.t(f(list2));
                    c0912t.i0(objR2);
                }
                InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) objR2;
                c0912t.p(false);
                AbstractC1110d.n(n0.e.e(1024874654, new q(interfaceC0878b02, list2, interfaceC0878b03, z02, 0), c0912t), c0912t, 6);
                Object objK5 = c0912t.K();
                if (objK5 == obj) {
                    objK5 = C0879c.l(c0912t);
                    c0912t.i0(objK5);
                }
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) objK5;
                c0912t.X(-931172005);
                Object objK6 = c0912t.K();
                if (objK6 == obj) {
                    objK6 = C0879c.t(Boolean.FALSE);
                    c0912t.i0(objK6);
                }
                InterfaceC0878b0 interfaceC0878b04 = (InterfaceC0878b0) objK6;
                Object objR3 = n1.c.r(-931169823, c0912t, false);
                if (objR3 == obj) {
                    list = list2;
                    interfaceC0878b0 = interfaceC0878b02;
                    objR3 = C0879c.t(new C1892b(0L));
                    c0912t.i0(objR3);
                } else {
                    list = list2;
                    interfaceC0878b0 = interfaceC0878b02;
                }
                InterfaceC0878b0 interfaceC0878b05 = (InterfaceC0878b0) objR3;
                c0912t.p(false);
                Z zD = AbstractC0074o.d(C1385c.f15612o, false);
                List list3 = list;
                long j7 = c0912t.f11891T;
                int i10 = (int) (j7 ^ (j7 >>> c7));
                InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, fillElement);
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(interfaceC1180a);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, zD, c0351h);
                C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                    n1.c.w(i10, c0912t, i10, c0351h3);
                }
                C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
                AbstractC1110d.n(n0.e.e(-494508008, new C0080v(interfaceC0878b05, 8, interfaceC0878b04), c0912t), c0912t, 6);
                String str2 = (String) value;
                c0912t.X(1399577220);
                boolean zH2 = c0912t.h(xVar);
                Object objK7 = c0912t.K();
                if (zH2 || objK7 == obj) {
                    objK7 = new d(xVar, 4);
                    c0912t.i0(objK7);
                }
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK7;
                c0912t.p(false);
                n0.d dVarE = n0.e.e(-957459684, new C0471d0(interfaceC0878b05, 2, interfaceC0878b04), c0912t);
                c0912t.X(1399603542);
                boolean zH3 = c0912t.h(interfaceC1765B) | c0912t.f(list3);
                Object objK8 = c0912t.K();
                if (zH3 || objK8 == obj) {
                    objK8 = new G.u(interfaceC0878b03, interfaceC0878b0, interfaceC1765B, list3);
                    c0912t.i0(objK8);
                }
                c0912t.p(false);
                AbstractC1110d.h(str2, null, false, interfaceC1180a3, null, null, dVarE, 0.0f, false, (InterfaceC1182c) objK8, c0912t, 1572864, 438);
                z6 = true;
                c0912t.p(true);
                c0912t.p(false);
            }
            c0912t.p(z6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new c(xVar, i7, 1);
        }
    }

    public static final List f(List list) {
        List listG0 = Z4.n.G0(list, new M4.j(2));
        return SettingsLibrary.INSTANCE.getEnableDescending() ? Z4.n.E0(listG0) : listG0;
    }
}
