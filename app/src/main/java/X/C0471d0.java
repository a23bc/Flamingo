package X;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0080v;
import D.C0084z;
import D.InterfaceC0077s;
import E0.C0094e;
import E0.C0095f;
import E0.C0096g;
import F.C0130c;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0434f;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import f0.C0879c;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import h6.C1026k;
import j5.AbstractC1110d;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1420a;
import w.C1670c;
import w.C1680m;
import w3.C1760y;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;
import x.C1848e0;
import x.InterfaceC1844c0;
import x.InterfaceC1846d0;
import x0.C1892b;
import y.C1947c;
import y.C1948d;
import y0.C1965O;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: renamed from: X.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0471d0 implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f8050o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f8051p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f8052q;

    public /* synthetic */ C0471d0(Object obj, int i7, Object obj2) {
        this.f8050o = i7;
        this.f8051p = obj;
        this.f8052q = obj2;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        boolean z6;
        Object obj4;
        C1395m c1395m = C1395m.f15634a;
        f0.W w7 = C0903o.f11850a;
        Y4.o oVar = Y4.o.f8736a;
        Object obj5 = this.f8051p;
        Object obj6 = this.f8052q;
        final int i7 = 0;
        switch (this.f8050o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t.X(759876635);
                Object objK = c0912t.K();
                Object obj7 = objK;
                if (objK == w7) {
                    f0.G gO = C0879c.o((InterfaceC1180a) obj5);
                    c0912t.i0(gO);
                    obj7 = gO;
                }
                Z0 z02 = (Z0) obj7;
                Object objK2 = c0912t.K();
                Object obj8 = objK2;
                if (objK2 == w7) {
                    C1670c c1670c = new C1670c(new C1892b(((C1892b) z02.getValue()).f19867a), AbstractC0481i0.f8083b, new C1892b(AbstractC0481i0.f8084c), 8);
                    c0912t.i0(c1670c);
                    obj8 = c1670c;
                }
                C1670c c1670c2 = (C1670c) obj8;
                boolean zH = c0912t.h(c1670c2);
                Object objK3 = c0912t.K();
                Object obj9 = objK3;
                if (zH || objK3 == w7) {
                    C0479h0 c0479h0 = new C0479h0(z02, c1670c2, null);
                    c0912t.i0(c0479h0);
                    obj9 = c0479h0;
                }
                C0879c.e(c0912t, oVar, (l5.e) obj9);
                C1680m c1680m = c1670c2.f18630c;
                boolean zF = c0912t.f(c1680m);
                Object objK4 = c0912t.K();
                Object obj10 = objK4;
                if (zF || objK4 == w7) {
                    E3.e eVar = new E3.e(17, c1680m);
                    c0912t.i0(eVar);
                    obj10 = eVar;
                }
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) ((InterfaceC1182c) obj6).b((InterfaceC1180a) obj10);
                c0912t.p(false);
                return interfaceC1398p;
            case 1:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((d0.D0) obj, "it");
                if ((iIntValue & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    M3.a.w(new d0.B0(new C1420a(0.0f, ((C0886f0) obj5).h() / ((C0890h0) obj6).h())), null, 7, c0912t2, 384);
                }
                return oVar;
            case 2:
                C0912t c0912t3 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((D.r0) obj, "$this$Title");
                if ((iIntValue2 & 17) == 16 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    c0912t3.X(-861248301);
                    Object objK5 = c0912t3.K();
                    if (objK5 == w7) {
                        objK5 = new M.t0((InterfaceC0878b0) obj5, 14);
                        c0912t3.i0(objK5);
                    }
                    c0912t3.p(false);
                    InterfaceC1398p interfaceC1398pD = androidx.compose.ui.layout.a.d(c1395m, (InterfaceC1182c) objK5);
                    C0095f c0095fB = AbstractC1267a.f14718c;
                    if (c0095fB == null) {
                        C0094e c0094e = new C0094e("Rounded.MoreHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = E0.I.f1667a;
                        C1965O c1965o = new C1965O(C1987t.f20255b);
                        C0096g c0096g = new C0096g(0);
                        c0096g.p(6.0f, 10.0f);
                        c0096g.k(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c0096g.q(0.9f, 2.0f, 2.0f, 2.0f);
                        c0096g.q(2.0f, -0.9f, 2.0f, -2.0f);
                        c0096g.q(-0.9f, -2.0f, -2.0f, -2.0f);
                        c0096g.i();
                        c0096g.p(18.0f, 10.0f);
                        c0096g.k(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c0096g.q(0.9f, 2.0f, 2.0f, 2.0f);
                        c0096g.q(2.0f, -0.9f, 2.0f, -2.0f);
                        c0096g.q(-0.9f, -2.0f, -2.0f, -2.0f);
                        c0096g.i();
                        c0096g.p(12.0f, 10.0f);
                        c0096g.k(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c0096g.q(0.9f, 2.0f, 2.0f, 2.0f);
                        c0096g.q(2.0f, -0.9f, 2.0f, -2.0f);
                        c0096g.q(-0.9f, -2.0f, -2.0f, -2.0f);
                        c0096g.i();
                        C0094e.a(c0094e, c0096g.f1743o, c1965o, 1.0f, 1.0f, 1.0f, 2, 1.0f);
                        c0095fB = c0094e.b();
                        AbstractC1267a.f14718c = c0095fB;
                    }
                    c0912t3.X(-861238228);
                    Object objK6 = c0912t3.K();
                    if (objK6 == w7) {
                        objK6 = new i6.r((InterfaceC0878b0) obj6, 0);
                        c0912t3.i0(objK6);
                    }
                    c0912t3.p(false);
                    AbstractC1110d.j(interfaceC1398pD, c0095fB, (InterfaceC1180a) objK6, c0912t3, 390);
                }
                return oVar;
            case 3:
                C0912t c0912t4 = (C0912t) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue3 & 17) == 16 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    float f7 = 15;
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 18, 0.0f, 2), 0.0f, 12, 0.0f, f7, 5);
                    D.q0 q0VarA = D.o0.a(AbstractC0068i.f1327a, C1385c.f15621x, c0912t4, 0);
                    long j3 = c0912t4.f11891T;
                    int i9 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t4.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t4, interfaceC1398pJ);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t4.b0();
                    if (c0912t4.f11890S) {
                        c0912t4.k(c0353i);
                    } else {
                        c0912t4.l0();
                    }
                    C0879c.y(c0912t4, q0VarA, C0354j.f6019f);
                    C0879c.y(c0912t4, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t4, i9, c0351h);
                    }
                    C0879c.y(c0912t4, interfaceC1398pC, C0354j.f6017d);
                    D0.b bVarB = AbstractC1267a.B(R.drawable.button_icon_play, c0912t4);
                    String strS = I0.c.S(R.string.normal_button_play, c0912t4);
                    InterfaceC1398p interfaceC1398pQ = A0.e.Q(c1395m, 1.0f);
                    c0912t4.X(1322091910);
                    final InterfaceC1765B interfaceC1765B = (InterfaceC1765B) obj5;
                    boolean zH2 = c0912t4.h(interfaceC1765B);
                    Object objK7 = c0912t4.K();
                    final InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) obj6;
                    Object obj11 = objK7;
                    if (zH2 || objK7 == w7) {
                        InterfaceC1180a interfaceC1180a = new InterfaceC1180a() { // from class: i6.t
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                switch (i7) {
                                    case 0:
                                        InterfaceC1765B interfaceC1765B2 = interfaceC1765B;
                                        AbstractC1209k.f(interfaceC1765B2, "$scope");
                                        InterfaceC0878b0 interfaceC0878b02 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b02, "$list");
                                        AbstractC1767D.t(interfaceC1765B2, M.f19498b, new u(interfaceC0878b02, null), 2);
                                        break;
                                    default:
                                        InterfaceC1765B interfaceC1765B3 = interfaceC1765B;
                                        AbstractC1209k.f(interfaceC1765B3, "$scope");
                                        InterfaceC0878b0 interfaceC0878b03 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b03, "$list");
                                        C1760y c1760y = b6.i.f10423c;
                                        if (c1760y != null) {
                                            c1760y.E(true);
                                        }
                                        AbstractC1767D.t(interfaceC1765B3, M.f19498b, new v(interfaceC0878b03, null), 2);
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t4.i0(interfaceC1180a);
                        obj11 = interfaceC1180a;
                    }
                    c0912t4.p(false);
                    j6.i.d(bVarB, strS, interfaceC1398pQ, (InterfaceC1180a) obj11, c0912t4, 0);
                    AbstractC0060d.d(c0912t4, androidx.compose.foundation.layout.c.k(c1395m, f7));
                    D0.b bVarB2 = AbstractC1267a.B(R.drawable.button_icon_shuffle, c0912t4);
                    String strS2 = I0.c.S(R.string.normal_button_shuffle, c0912t4);
                    InterfaceC1398p interfaceC1398pQ2 = A0.e.Q(c1395m, 1.0f);
                    c0912t4.X(1322115327);
                    boolean zH3 = c0912t4.h(interfaceC1765B);
                    Object objK8 = c0912t4.K();
                    if (zH3 || objK8 == w7) {
                        z6 = true;
                        final boolean z7 = true ? 1 : 0;
                        InterfaceC1180a interfaceC1180a2 = new InterfaceC1180a() { // from class: i6.t
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                switch (z7) {
                                    case 0:
                                        InterfaceC1765B interfaceC1765B2 = interfaceC1765B;
                                        AbstractC1209k.f(interfaceC1765B2, "$scope");
                                        InterfaceC0878b0 interfaceC0878b02 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b02, "$list");
                                        AbstractC1767D.t(interfaceC1765B2, M.f19498b, new u(interfaceC0878b02, null), 2);
                                        break;
                                    default:
                                        InterfaceC1765B interfaceC1765B3 = interfaceC1765B;
                                        AbstractC1209k.f(interfaceC1765B3, "$scope");
                                        InterfaceC0878b0 interfaceC0878b03 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b03, "$list");
                                        C1760y c1760y = b6.i.f10423c;
                                        if (c1760y != null) {
                                            c1760y.E(true);
                                        }
                                        AbstractC1767D.t(interfaceC1765B3, M.f19498b, new v(interfaceC0878b03, null), 2);
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t4.i0(interfaceC1180a2);
                        obj4 = interfaceC1180a2;
                    } else {
                        z6 = true;
                        obj4 = objK8;
                    }
                    c0912t4.p(false);
                    j6.i.d(bVarB2, strS2, interfaceC1398pQ2, (InterfaceC1180a) obj4, c0912t4, 0);
                    c0912t4.p(z6);
                }
                return oVar;
            case 4:
                C0912t c0912t5 = (C0912t) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue4 & 17) == 16 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    String strS3 = I0.c.S(R.string.page_settings_title, c0912t5);
                    c0912t5.X(-1515510645);
                    Activity activity = (Activity) obj5;
                    boolean zF2 = c0912t5.f(activity);
                    Object objK9 = c0912t5.K();
                    Object obj12 = objK9;
                    if (zF2 || objK9 == w7) {
                        C0434f c0434f = new C0434f(activity, 1);
                        c0912t5.i0(c0434f);
                        obj12 = c0434f;
                    }
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) obj12;
                    c0912t5.p(false);
                    c0912t5.X(-1515501447);
                    y3.x xVar = (y3.x) obj6;
                    boolean zH4 = c0912t5.h(xVar);
                    Object objK10 = c0912t5.K();
                    Object obj13 = objK10;
                    if (zH4 || objK10 == w7) {
                        i6.b bVar = new i6.b(xVar, 1);
                        c0912t5.i0(bVar);
                        obj13 = bVar;
                    }
                    c0912t5.p(false);
                    AbstractC1110d.h(strS3, null, true, interfaceC1180a3, null, null, null, 0.0f, true, (InterfaceC1182c) obj13, c0912t5, 100663680, 242);
                }
                return oVar;
            case 5:
                C0912t c0912t6 = (C0912t) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue5 & 17) == 16 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t6, 0);
                    long j7 = c0912t6.f11891T;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t6.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t6, fillElement);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t6.b0();
                    if (c0912t6.f11890S) {
                        c0912t6.k(c0353i2);
                    } else {
                        c0912t6.l0();
                    }
                    C0879c.y(c0912t6, c0084zA, C0354j.f6019f);
                    C0879c.y(c0912t6, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t6.f11890S || !AbstractC1209k.a(c0912t6.K(), Integer.valueOf(i10))) {
                        n1.c.w(i10, c0912t6, i10, c0351h2);
                    }
                    C0879c.y(c0912t6, interfaceC1398pC2, C0354j.f6017d);
                    Y4.m mVar = (Y4.m) obj5;
                    v6.E.a(null, null, 0L, n0.e.e(-1302822604, new o6.b(mVar, 0), c0912t6), c0912t6, 3072, 7);
                    AbstractC1113a.l(null, c0912t6, 0);
                    v6.E.a(null, null, 0L, n0.e.e(-198123029, new o6.c((C0888g0) obj6, 0), c0912t6), c0912t6, 3072, 7);
                    AbstractC1113a.l(null, c0912t6, 0);
                    i6.h.b(I0.c.S(R.string.settings_extend_statusbarlyric_debug, c0912t6), c0912t6, 0);
                    v6.E.a(null, null, 0L, n0.e.e(330117420, new o6.b(mVar, 1), c0912t6), c0912t6, 3072, 7);
                    i6.h.b(I0.c.S(R.string.settings_extend_statusbarlyric_debug_send_lyric_desc, c0912t6), c0912t6, 0);
                    AbstractC1113a.m(null, c0912t6, 0);
                    v6.E.a(null, null, 0L, n0.e.e(858357869, new o6.b(mVar, 2), c0912t6), c0912t6, 3072, 7);
                    i6.h.b(I0.c.S(R.string.settings_extend_statusbarlyric_debug_clear_lyric_desc, c0912t6), c0912t6, 0);
                    c0912t6.p(true);
                }
                return oVar;
            case 6:
                C0912t c0912t7 = (C0912t) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue6 & 17) == 16 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t7, 0);
                    long j8 = c0912t7.f11891T;
                    int i11 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t7.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t7, fillElement2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i3 = C0354j.f6015b;
                    c0912t7.b0();
                    if (c0912t7.f11890S) {
                        c0912t7.k(c0353i3);
                    } else {
                        c0912t7.l0();
                    }
                    C0879c.y(c0912t7, c0084zA2, C0354j.f6019f);
                    C0879c.y(c0912t7, interfaceC0906p0L3, C0354j.f6018e);
                    C0351h c0351h3 = C0354j.f6020g;
                    if (c0912t7.f11890S || !AbstractC1209k.a(c0912t7.K(), Integer.valueOf(i11))) {
                        n1.c.w(i11, c0912t7, i11, c0351h3);
                    }
                    C0879c.y(c0912t7, interfaceC1398pC3, C0354j.f6017d);
                    InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) obj5;
                    v6.E.a(null, null, 0L, n0.e.e(-468157422, new C1026k(interfaceC0878b02, 3), c0912t7), c0912t7, 3072, 7);
                    AbstractC1113a.l(null, c0912t7, 0);
                    v6.E.a(null, null, 0L, n0.e.e(-1892704631, new o6.c((C0888g0) obj6, 1), c0912t7), c0912t7, 3072, 7);
                    AbstractC1113a.l(null, c0912t7, 0);
                    i6.h.b(I0.c.S(R.string.settings_extend_statusbarlyric_debug, c0912t7), c0912t7, 0);
                    v6.E.a(null, null, 0L, n0.e.e(-1874277878, new C1026k(interfaceC0878b02, 4), c0912t7), c0912t7, 3072, 7);
                    i6.h.b(I0.c.S(R.string.settings_extend_statusbarlyric_debug_send_lyric_desc, c0912t7), c0912t7, 0);
                    AbstractC1113a.m(null, c0912t7, 0);
                    v6.E.a(null, null, 0L, n0.e.e(-1855851125, new C1026k(interfaceC0878b02, 5), c0912t7), c0912t7, 3072, 7);
                    i6.h.b(I0.c.S(R.string.settings_extend_statusbarlyric_debug_clear_lyric_desc, c0912t7), c0912t7, 0);
                    c0912t7.p(true);
                }
                return oVar;
            case 7:
                C0912t c0912t8 = (C0912t) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue7 & 17) == 16 && c0912t8.z()) {
                    c0912t8.Q();
                } else {
                    FillElement fillElement3 = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA3 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t8, 0);
                    long j9 = c0912t8.f11891T;
                    int i12 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L4 = c0912t8.l();
                    InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t8, fillElement3);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i4 = C0354j.f6015b;
                    c0912t8.b0();
                    if (c0912t8.f11890S) {
                        c0912t8.k(c0353i4);
                    } else {
                        c0912t8.l0();
                    }
                    C0879c.y(c0912t8, c0084zA3, C0354j.f6019f);
                    C0879c.y(c0912t8, interfaceC0906p0L4, C0354j.f6018e);
                    C0351h c0351h4 = C0354j.f6020g;
                    if (c0912t8.f11890S || !AbstractC1209k.a(c0912t8.K(), Integer.valueOf(i12))) {
                        n1.c.w(i12, c0912t8, i12, c0351h4);
                    }
                    C0879c.y(c0912t8, interfaceC1398pC4, C0354j.f6017d);
                    v6.E.a(null, null, 0L, n0.e.e(517063380, new C0080v((Context) obj5, 12, (e.i) obj6), c0912t8), c0912t8, 3072, 7);
                    i6.h.b(I0.c.S(R.string.settings_extend_ticker_lyric_tip, c0912t8), c0912t8, 0);
                    c0912t8.p(true);
                }
                return oVar;
            case 8:
                C0912t c0912t9 = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t9.X(-353972293);
                InterfaceC1846d0 interfaceC1846d0A = ((InterfaceC1844c0) obj5).a((B.k) obj6, c0912t9);
                boolean zF3 = c0912t9.f(interfaceC1846d0A);
                Object objK11 = c0912t9.K();
                if (zF3 || objK11 == w7) {
                    objK11 = new C1848e0(interfaceC1846d0A);
                    c0912t9.i0(objK11);
                }
                C1848e0 c1848e0 = (C1848e0) objK11;
                c0912t9.p(false);
                return c1848e0;
            default:
                C0912t c0912t10 = (C0912t) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if (c0912t10.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    Object objK12 = c0912t10.K();
                    if (objK12 == w7) {
                        objK12 = new C1948d();
                        c0912t10.i0(objK12);
                    }
                    C1948d c1948d = (C1948d) objK12;
                    c1948d.f20154a.clear();
                    ((InterfaceC1182c) obj6).b(c1948d);
                    c1948d.a((C1947c) obj5, c0912t10, 0);
                } else {
                    c0912t10.Q();
                }
                return oVar;
        }
    }

    public C0471d0(InterfaceC1182c interfaceC1182c, C1947c c1947c) {
        this.f8050o = 9;
        this.f8052q = interfaceC1182c;
        this.f8051p = c1947c;
    }
}
