package U5;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0084z;
import D.o0;
import D.q0;
import I.C0211c;
import M.C0265j;
import M.t0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import X.C0478h;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.InterfaceC0597u;
import d0.AbstractC0774A;
import e4.C0862k;
import f0.C0879c;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import h6.AbstractC1014e;
import h6.B0;
import h6.C1011c0;
import h6.C1033n0;
import h6.C1047v;
import j5.AbstractC1110d;
import java.util.Objects;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n2.AbstractC1228a;
import o0.C1247d;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.k0;
import w.AbstractC1671d;
import w.AbstractC1691y;
import w.C1670c;
import w.C1687u;
import w.n0;
import yos.music.player.MainActivity;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: U5.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0450w implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7274o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f7275p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f7276q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f7277r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f7278s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f7279t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f7280u;

    public C0450w(InterfaceC0878b0 interfaceC0878b0, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a4) {
        this.f7274o = 6;
        this.f7275p = interfaceC0878b0;
        this.f7276q = interfaceC1180a;
        this.f7277r = interfaceC1180a2;
        this.f7278s = interfaceC1180a3;
        this.f7279t = interfaceC1398p;
        this.f7280u = interfaceC1180a4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1180a interfaceC1180a;
        switch (this.f7274o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C1687u c1687u = AbstractC1691y.f18765d;
                    n0 n0VarL = AbstractC1671d.l(340, 0, c1687u, 2);
                    n0 n0VarL2 = AbstractC1671d.l(180, 0, c1687u, 2);
                    boolean barBlurEffect = SettingsLibrary.INSTANCE.getBarBlurEffect();
                    InterfaceC1398p interfaceC1398pT = C1395m.f15634a;
                    if (barBlurEffect && !((Boolean) ((Z0) this.f7276q).getValue()).booleanValue()) {
                        interfaceC1398pT = M3.a.T(interfaceC1398pT, (T4.l) this.f7277r);
                    }
                    c0912t.X(151142222);
                    boolean zF = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    if (zF || objK == w7) {
                        objK = new C0446s(n0VarL2, n0VarL, 0);
                        c0912t.i0(objK);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK;
                    c0912t.p(false);
                    c0912t.X(151160719);
                    boolean zF2 = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == w7) {
                        objK2 = new C0446s(n0VarL2, n0VarL, 1);
                        c0912t.i0(objK2);
                    }
                    InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objK2;
                    c0912t.p(false);
                    c0912t.X(151179371);
                    boolean zF3 = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK3 = c0912t.K();
                    if (zF3 || objK3 == w7) {
                        objK3 = new C0446s(n0VarL2, n0VarL, 2);
                        c0912t.i0(objK3);
                    }
                    InterfaceC1182c interfaceC1182c3 = (InterfaceC1182c) objK3;
                    c0912t.p(false);
                    c0912t.X(151197874);
                    boolean zF4 = c0912t.f(n0VarL2) | c0912t.f(n0VarL);
                    Object objK4 = c0912t.K();
                    if (zF4 || objK4 == w7) {
                        objK4 = new C0446s(n0VarL2, n0VarL, 3);
                        c0912t.i0(objK4);
                    }
                    InterfaceC1182c interfaceC1182c4 = (InterfaceC1182c) objK4;
                    c0912t.p(false);
                    c0912t.X(151215989);
                    y3.x xVar = (y3.x) this.f7278s;
                    boolean zH = c0912t.h(xVar);
                    C0211c c0211c = (C0211c) this.f7279t;
                    boolean zF5 = zH | c0912t.f(c0211c);
                    MainActivity mainActivity = (MainActivity) this.f7280u;
                    boolean zF6 = zF5 | c0912t.f(mainActivity);
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f7275p;
                    boolean zF7 = zF6 | c0912t.f(interfaceC0878b0);
                    Object objK5 = c0912t.K();
                    if (zF7 || objK5 == w7) {
                        G.u uVar = new G.u(xVar, c0211c, mainActivity, interfaceC0878b0, 3);
                        c0912t.i0(uVar);
                        objK5 = uVar;
                    }
                    c0912t.p(false);
                    N5.d.a((y3.x) this.f7278s, interfaceC1398pT, interfaceC1182c, interfaceC1182c2, interfaceC1182c3, interfaceC1182c4, (InterfaceC1182c) objK5, c0912t, 48);
                    AbstractC1110d.n(n0.e.e(1407224796, new C0449v(mainActivity, 0), c0912t), c0912t, 6);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pA = androidx.compose.foundation.layout.c.a(c1395m, 0.595f);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                    long j3 = c0912t2.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pA);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, c0084zA, C0354j.f6019f);
                    C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t2, i7, c0351h);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f7277r;
                    boolean zA = AbstractC1209k.a(interfaceC1180a2.a(), "Album");
                    k0 k0Var = (k0) this.f7278s;
                    InterfaceC1398p interfaceC1398pD = n1.c.D(k0Var, k0Var.c(c0912t2), zA);
                    c0912t2.X(-924102527);
                    Object objK6 = c0912t2.K();
                    f0.W w8 = C0903o.f11850a;
                    InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) this.f7275p;
                    if (objK6 == w8) {
                        objK6 = new F.m(interfaceC0878b02, 13);
                        c0912t2.i0(objK6);
                    }
                    c0912t2.p(false);
                    M3.a.d(interfaceC1398pD, (InterfaceC1180a) objK6, (InterfaceC1180a) this.f7279t, false, c0912t2, 390, 8);
                    YosMediaItem yosMediaItem = (YosMediaItem) interfaceC0878b02.getValue();
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(c1395m, 9.5f, 0.0f, 32, 0.0f, 10);
                    c0912t2.X(-924069513);
                    C1670c c1670c = (C1670c) this.f7280u;
                    boolean zH2 = c0912t2.h(c1670c) | c0912t2.f(interfaceC1180a2);
                    Object objK7 = c0912t2.K();
                    if (zH2 || objK7 == w8) {
                        objK7 = new C0265j(c1670c, interfaceC1180a2, (Z0) this.f7276q, 9);
                        c0912t2.i0(objK7);
                    }
                    c0912t2.p(false);
                    AbstractC1110d.a(yosMediaItem, androidx.compose.ui.graphics.a.a(interfaceC1398pJ, (InterfaceC1182c) objK7), new b6.k(14), null, null, null, AbstractC1014e.f13018b, c0912t2, 1573248, 56);
                    c0912t2.p(true);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    boolean zA2 = AbstractC1209k.a(((InterfaceC1180a) this.f7277r).a(), "Lyric");
                    C1395m c1395m2 = C1395m.f15634a;
                    c0912t3.X(-1743122105);
                    C1670c c1670c2 = (C1670c) this.f7278s;
                    boolean zH3 = c0912t3.h(c1670c2);
                    Object objK8 = c0912t3.K();
                    f0.W w9 = C0903o.f11850a;
                    if (zH3 || objK8 == w9) {
                        objK8 = new h6.V(c1670c2, (Z0) this.f7276q);
                        c0912t3.i0(objK8);
                    }
                    c0912t3.p(false);
                    InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.graphics.a.a(c1395m2, (InterfaceC1182c) objK8);
                    k0 k0Var2 = (k0) this.f7279t;
                    InterfaceC1398p interfaceC1398pD2 = n1.c.D(k0Var2, k0Var2.c(c0912t3), zA2);
                    c0912t3.X(-1743089810);
                    Object objK9 = c0912t3.K();
                    InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) this.f7275p;
                    if (objK9 == w9) {
                        objK9 = new F.m(interfaceC0878b03, 14);
                        c0912t3.i0(objK9);
                    }
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK9;
                    Object objR = n1.c.r(-1743083013, c0912t3, false);
                    if (objR == w9) {
                        objR = new F.m(interfaceC0878b03, 15);
                        c0912t3.i0(objR);
                    }
                    InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) objR;
                    c0912t3.p(false);
                    c0912t3.X(-1743082016);
                    InterfaceC1182c interfaceC1182c5 = (InterfaceC1182c) this.f7280u;
                    boolean zF8 = c0912t3.f(interfaceC1182c5);
                    Object objK10 = c0912t3.K();
                    if (zF8 || objK10 == w9) {
                        objK10 = new h6.W(interfaceC1182c5, 0);
                        c0912t3.i0(objK10);
                    }
                    c0912t3.p(false);
                    M3.a.m(interfaceC1398pD2, interfaceC1398pA2, interfaceC1180a3, interfaceC1180a4, (InterfaceC1180a) objK10, c0912t3, 3456, 0);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 32, 0.0f, 2);
                    c0912t4.X(1479737991);
                    C1670c c1670c3 = (C1670c) this.f7277r;
                    boolean zH4 = c0912t4.h(c1670c3);
                    Object objK11 = c0912t4.K();
                    if (zH4 || objK11 == C0903o.f11850a) {
                        objK11 = new C1011c0(c1670c3, 0);
                        c0912t4.i0(objK11);
                    }
                    c0912t4.p(false);
                    InterfaceC1398p interfaceC1398pA3 = androidx.compose.ui.graphics.a.a(interfaceC1398pI, (InterfaceC1182c) objK11);
                    q0 q0VarA = o0.a(AbstractC0068i.f1328b, C1385c.f15621x, c0912t4, 6);
                    long j7 = c0912t4.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t4.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t4, interfaceC1398pA3);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t4.b0();
                    if (c0912t4.f11890S) {
                        c0912t4.k(c0353i2);
                    } else {
                        c0912t4.l0();
                    }
                    C0879c.y(c0912t4, q0VarA, C0354j.f6019f);
                    C0879c.y(c0912t4, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t4, i8, c0351h2);
                    }
                    C0879c.y(c0912t4, interfaceC1398pC2, C0354j.f6017d);
                    M3.a.x((Z0) this.f7276q, (Context) this.f7278s, (InterfaceC0878b0) this.f7275p, (InterfaceC0878b0) this.f7279t, (C0890h0) this.f7280u, 0.0f, c0912t4, 6, 32);
                    c0912t4.p(true);
                }
                break;
            case 4:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    C1395m c1395m3 = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pP = A0.e.P(c1395m3);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    InterfaceC1398p interfaceC1398pF = interfaceC1398pP.f(fillElement);
                    C1390h c1390h = C1385c.f15616s;
                    O0.Z zD = AbstractC0074o.d(c1390h, false);
                    long j8 = c0912t5.f11891T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t5.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t5, interfaceC1398pF);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i3 = C0354j.f6015b;
                    c0912t5.b0();
                    if (c0912t5.f11890S) {
                        c0912t5.k(c0353i3);
                    } else {
                        c0912t5.l0();
                    }
                    C0351h c0351h3 = C0354j.f6019f;
                    C0879c.y(c0912t5, zD, c0351h3);
                    C0351h c0351h4 = C0354j.f6018e;
                    C0879c.y(c0912t5, interfaceC0906p0L3, c0351h4);
                    C0351h c0351h5 = C0354j.f6020g;
                    if (c0912t5.f11890S || !AbstractC1209k.a(c0912t5.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t5, i9, c0351h5);
                    }
                    C0351h c0351h6 = C0354j.f6017d;
                    C0879c.y(c0912t5, interfaceC1398pC3, c0351h6);
                    q0 q0VarA2 = o0.a(AbstractC0068i.f1331e, C1385c.f15622y, c0912t5, 54);
                    long j9 = c0912t5.f11891T;
                    int i10 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L4 = c0912t5.l();
                    InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t5, c1395m3);
                    c0912t5.b0();
                    if (c0912t5.f11890S) {
                        c0912t5.k(c0353i3);
                    } else {
                        c0912t5.l0();
                    }
                    C0879c.y(c0912t5, q0VarA2, c0351h3);
                    C0879c.y(c0912t5, interfaceC0906p0L4, c0351h4);
                    if (c0912t5.f11890S || !AbstractC1209k.a(c0912t5.K(), Integer.valueOf(i10))) {
                        n1.c.w(i10, c0912t5, i10, c0351h5);
                    }
                    C0879c.y(c0912t5, interfaceC1398pC4, c0351h6);
                    float f7 = 61;
                    InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(c1395m3, f7);
                    c0912t5.X(1962121004);
                    Object objK12 = c0912t5.K();
                    f0.W w10 = C0903o.f11850a;
                    if (objK12 == w10) {
                        objK12 = n1.c.q(c0912t5);
                    }
                    B.k kVar = (B.k) objK12;
                    c0912t5.p(false);
                    Y.n nVarA = Y.m.a();
                    c0912t5.X(1962126541);
                    Context context = (Context) this.f7276q;
                    boolean zF9 = c0912t5.f(context);
                    InterfaceC1180a interfaceC1180a5 = (InterfaceC1180a) this.f7277r;
                    boolean zF10 = zF9 | c0912t5.f(interfaceC1180a5);
                    Object objK13 = c0912t5.K();
                    if (zF10 || objK13 == w10) {
                        objK13 = new C1047v(context, interfaceC1180a5, 1);
                        c0912t5.i0(objK13);
                    }
                    c0912t5.p(false);
                    InterfaceC1398p interfaceC1398pC5 = androidx.compose.foundation.a.c(interfaceC1398pG, kVar, nVarA, false, (InterfaceC1180a) objK13, 28);
                    O0.Z zD2 = AbstractC0074o.d(c1390h, false);
                    long j10 = c0912t5.f11891T;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L5 = c0912t5.l();
                    InterfaceC1398p interfaceC1398pC6 = AbstractC1383a.c(c0912t5, interfaceC1398pC5);
                    c0912t5.b0();
                    if (c0912t5.f11890S) {
                        c0912t5.k(c0353i3);
                    } else {
                        c0912t5.l0();
                    }
                    C0879c.y(c0912t5, zD2, c0351h3);
                    C0879c.y(c0912t5, interfaceC0906p0L5, c0351h4);
                    if (c0912t5.f11890S || !AbstractC1209k.a(c0912t5.K(), Integer.valueOf(i11))) {
                        n1.c.w(i11, c0912t5, i11, c0351h5);
                    }
                    C0879c.y(c0912t5, interfaceC1398pC6, c0351h6);
                    float f8 = 10;
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_rewind, c0912t5), "Previous", androidx.compose.foundation.layout.a.g(fillElement, f8), 0L, c0912t5, 432, 8);
                    c0912t5.p(true);
                    float f9 = 46;
                    AbstractC0060d.d(c0912t5, androidx.compose.foundation.layout.c.k(c1395m3, f9));
                    InterfaceC1398p interfaceC1398pG2 = androidx.compose.foundation.layout.c.g(c1395m3, 60.5f);
                    c0912t5.X(1962159500);
                    Object objK14 = c0912t5.K();
                    if (objK14 == w10) {
                        objK14 = n1.c.q(c0912t5);
                    }
                    B.k kVar2 = (B.k) objK14;
                    c0912t5.p(false);
                    Y.n nVarA2 = Y.m.a();
                    c0912t5.X(1962165135);
                    boolean zF11 = c0912t5.f(context);
                    InterfaceC1182c interfaceC1182c6 = (InterfaceC1182c) this.f7278s;
                    boolean zF12 = zF11 | c0912t5.f(interfaceC1182c6);
                    InterfaceC1180a interfaceC1180a6 = (InterfaceC1180a) this.f7279t;
                    boolean zF13 = zF12 | c0912t5.f(interfaceC1180a6);
                    InterfaceC1182c interfaceC1182c7 = (InterfaceC1182c) this.f7280u;
                    boolean zF14 = zF13 | c0912t5.f(interfaceC1182c7);
                    Object objK15 = c0912t5.K();
                    if (zF14 || objK15 == w10) {
                        objK15 = new B0(context, interfaceC1182c6, interfaceC1180a6, interfaceC1182c7, 0);
                        interfaceC1180a = interfaceC1180a6;
                        c0912t5.i0(objK15);
                    } else {
                        interfaceC1180a = interfaceC1180a6;
                    }
                    c0912t5.p(false);
                    InterfaceC1398p interfaceC1398pC7 = androidx.compose.foundation.a.c(interfaceC1398pG2, kVar2, nVarA2, false, (InterfaceC1180a) objK15, 28);
                    O0.Z zD3 = AbstractC0074o.d(c1390h, false);
                    long j11 = c0912t5.f11891T;
                    int i12 = (int) (j11 ^ (j11 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L6 = c0912t5.l();
                    InterfaceC1398p interfaceC1398pC8 = AbstractC1383a.c(c0912t5, interfaceC1398pC7);
                    c0912t5.b0();
                    if (c0912t5.f11890S) {
                        c0912t5.k(c0353i3);
                    } else {
                        c0912t5.l0();
                    }
                    C0879c.y(c0912t5, zD3, c0351h3);
                    C0879c.y(c0912t5, interfaceC0906p0L6, c0351h4);
                    if (c0912t5.f11890S || !AbstractC1209k.a(c0912t5.K(), Integer.valueOf(i12))) {
                        n1.c.w(i12, c0912t5, i12, c0351h5);
                    }
                    C0879c.y(c0912t5, interfaceC1398pC8, c0351h6);
                    AbstractC1110d.a(interfaceC1180a.a(), null, new b6.k(20), null, null, null, AbstractC1014e.f13022f, c0912t5, 1573248, 58);
                    c0912t5.p(true);
                    AbstractC0060d.d(c0912t5, androidx.compose.foundation.layout.c.k(c1395m3, f9));
                    InterfaceC1398p interfaceC1398pG3 = androidx.compose.foundation.layout.c.g(c1395m3, f7);
                    c0912t5.X(1962260972);
                    Object objK16 = c0912t5.K();
                    if (objK16 == w10) {
                        objK16 = n1.c.q(c0912t5);
                    }
                    B.k kVar3 = (B.k) objK16;
                    c0912t5.p(false);
                    Y.n nVarA3 = Y.m.a();
                    c0912t5.X(1962266505);
                    boolean zF15 = c0912t5.f(context);
                    InterfaceC1180a interfaceC1180a7 = (InterfaceC1180a) this.f7275p;
                    boolean zF16 = zF15 | c0912t5.f(interfaceC1180a7);
                    Object objK17 = c0912t5.K();
                    if (zF16 || objK17 == w10) {
                        objK17 = new C1047v(context, interfaceC1180a7, 2);
                        c0912t5.i0(objK17);
                    }
                    c0912t5.p(false);
                    InterfaceC1398p interfaceC1398pC9 = androidx.compose.foundation.a.c(interfaceC1398pG3, kVar3, nVarA3, false, (InterfaceC1180a) objK17, 28);
                    O0.Z zD4 = AbstractC0074o.d(c1390h, false);
                    long j12 = c0912t5.f11891T;
                    int i13 = (int) (j12 ^ (j12 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L7 = c0912t5.l();
                    InterfaceC1398p interfaceC1398pC10 = AbstractC1383a.c(c0912t5, interfaceC1398pC9);
                    c0912t5.b0();
                    if (c0912t5.f11890S) {
                        c0912t5.k(c0353i3);
                    } else {
                        c0912t5.l0();
                    }
                    C0879c.y(c0912t5, zD4, c0351h3);
                    C0879c.y(c0912t5, interfaceC0906p0L7, c0351h4);
                    if (c0912t5.f11890S || !AbstractC1209k.a(c0912t5.K(), Integer.valueOf(i13))) {
                        n1.c.w(i13, c0912t5, i13, c0351h5);
                    }
                    C0879c.y(c0912t5, interfaceC1398pC10, c0351h6);
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_fforward, c0912t5), "Next", androidx.compose.foundation.layout.a.g(fillElement, f8), 0L, c0912t5, 432, 8);
                    c0912t5.p(true);
                    c0912t5.p(true);
                    c0912t5.p(true);
                }
                break;
            case 5:
                C0912t c0912t6 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    boolean z6 = ((EnumC0593p) C0879c.k(((InterfaceC0597u) c0912t6.j(AbstractC1228a.f14530a)).h().j(), c0912t6, 0).getValue()).compareTo(EnumC0593p.f9749s) >= 0 && !((Boolean) ((InterfaceC1180a) this.f7276q).a()).booleanValue();
                    C1247d c1247d = new C1247d(11);
                    c0912t6.X(1722930382);
                    Object objK18 = c0912t6.K();
                    f0.W w11 = C0903o.f11850a;
                    if (objK18 == w11) {
                        objK18 = new t0((InterfaceC0878b0) this.f7279t, 23);
                        c0912t6.i0(objK18);
                    }
                    c0912t6.p(false);
                    InterfaceC1398p interfaceC1398pB = androidx.compose.ui.draw.a.b((InterfaceC1398p) this.f7277r, (InterfaceC1182c) objK18);
                    c0912t6.X(1722940416);
                    InterfaceC0878b0 interfaceC0878b04 = (InterfaceC0878b0) this.f7275p;
                    boolean zF17 = c0912t6.f(interfaceC0878b04);
                    InterfaceC1180a interfaceC1180a8 = (InterfaceC1180a) this.f7278s;
                    boolean zF18 = zF17 | c0912t6.f(interfaceC1180a8) | c0912t6.g(z6);
                    Object objK19 = c0912t6.K();
                    if (zF18 || objK19 == w11) {
                        objK19 = new C0478h(interfaceC0878b04, (InterfaceC0878b0) this.f7280u, interfaceC1180a8, z6);
                        c0912t6.i0(objK19);
                    }
                    c0912t6.p(false);
                    androidx.compose.ui.viewinterop.a.a(c1247d, interfaceC1398pB, (InterfaceC1182c) objK19, c0912t6, 6);
                }
                break;
            default:
                C0912t c0912t7 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    Objects.toString(((InterfaceC0878b0) this.f7275p).getValue());
                    System.out.getClass();
                    Context context2 = (Context) c0912t7.j(AndroidCompositionLocals_androidKt.f9324b);
                    C0862k c0862kW = N5.d.w(context2);
                    c0912t7.X(-467164017);
                    Object objK20 = c0912t7.K();
                    if (objK20 == C0903o.f11850a) {
                        objK20 = C0879c.t(Boolean.TRUE);
                        c0912t7.i0(objK20);
                    }
                    InterfaceC0878b0 interfaceC0878b05 = (InterfaceC0878b0) objK20;
                    c0912t7.p(false);
                    AbstractC1110d.n(n0.e.e(-59482516, new R.s((InterfaceC1180a) this.f7276q, context2, c0862kW, (InterfaceC0878b0) this.f7275p, interfaceC0878b05), c0912t7), c0912t7, 6);
                    AbstractC1110d.n(n0.e.e(-1977742429, new C1033n0((InterfaceC1180a) this.f7277r, (InterfaceC1180a) this.f7278s, (InterfaceC1398p) this.f7279t, (InterfaceC0878b0) this.f7275p, (InterfaceC1180a) this.f7280u, interfaceC0878b05, context2), c0912t7), c0912t7, 6);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0450w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f7274o = i7;
        this.f7276q = obj;
        this.f7277r = obj2;
        this.f7278s = obj3;
        this.f7279t = obj4;
        this.f7280u = obj5;
        this.f7275p = obj6;
    }

    public C0450w(InterfaceC1180a interfaceC1180a, InterfaceC1398p interfaceC1398p, InterfaceC0878b0 interfaceC0878b0, InterfaceC1180a interfaceC1180a2, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03) {
        this.f7274o = 5;
        this.f7276q = interfaceC1180a;
        this.f7277r = interfaceC1398p;
        this.f7275p = interfaceC0878b0;
        this.f7278s = interfaceC1180a2;
        this.f7279t = interfaceC0878b02;
        this.f7280u = interfaceC0878b03;
    }

    public C0450w(InterfaceC1180a interfaceC1180a, k0 k0Var, InterfaceC1180a interfaceC1180a2, InterfaceC0878b0 interfaceC0878b0, C1670c c1670c, Z0 z02) {
        this.f7274o = 1;
        this.f7277r = interfaceC1180a;
        this.f7278s = k0Var;
        this.f7279t = interfaceC1180a2;
        this.f7275p = interfaceC0878b0;
        this.f7280u = c1670c;
        this.f7276q = z02;
    }

    public C0450w(InterfaceC1180a interfaceC1180a, C1670c c1670c, k0 k0Var, InterfaceC1182c interfaceC1182c, Z0 z02, InterfaceC0878b0 interfaceC0878b0) {
        this.f7274o = 2;
        this.f7277r = interfaceC1180a;
        this.f7278s = c1670c;
        this.f7279t = k0Var;
        this.f7280u = interfaceC1182c;
        this.f7276q = z02;
        this.f7275p = interfaceC0878b0;
    }

    public C0450w(C1670c c1670c, Z0 z02, Context context, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, C0890h0 c0890h0) {
        this.f7274o = 3;
        this.f7277r = c1670c;
        this.f7276q = z02;
        this.f7278s = context;
        this.f7275p = interfaceC0878b0;
        this.f7279t = interfaceC0878b02;
        this.f7280u = c0890h0;
    }
}
