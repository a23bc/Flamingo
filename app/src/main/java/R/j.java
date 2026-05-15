package R;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.B0;
import D.h0;
import D.o0;
import D.q0;
import M.t0;
import O0.C0306f0;
import O0.C0318o;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0440l;
import V4.B;
import V4.x;
import Y4.o;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.AbstractC0774A;
import f0.C0879c;
import f0.C0886f0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import h6.C1020h;
import h6.C1040r0;
import h6.K;
import j5.AbstractC1109c;
import java.util.List;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.C1247d;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1420a;
import w.AbstractC1671d;
import w.AbstractC1674g;
import w.AbstractC1692z;
import w.C1670c;
import y0.AbstractC1959I;
import y0.C1980m;
import y0.C1987t;
import yos.music.player.MainActivity;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6190o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f6191p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f6192q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f6193r;

    public j(InterfaceC0878b0 interfaceC0878b0, InterfaceC1398p interfaceC1398p, InterfaceC0878b0 interfaceC0878b02) {
        this.f6190o = 7;
        this.f6192q = interfaceC0878b0;
        this.f6191p = interfaceC1398p;
        this.f6193r = interfaceC0878b02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0886f0 c0886f0;
        switch (this.f6190o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = c0912t.K();
                    if (objK == C0903o.f11850a) {
                        objK = new t0((InterfaceC0878b0) this.f6192q, 2);
                        c0912t.i0(objK);
                    }
                    InterfaceC1398p interfaceC1398pD = androidx.compose.ui.layout.a.d((InterfaceC1398p) this.f6191p, (InterfaceC1182c) objK);
                    Z zD = AbstractC0074o.d(C1385c.f15612o, true);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pD);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, zD, C0354j.f6019f);
                    C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t, i7, c0351h);
                    }
                    C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                    ((n0.d) this.f6193r).invoke(c0912t, 0);
                    c0912t.p(true);
                } else {
                    c0912t.Q();
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue() & 3;
                Y4.o oVar = Y4.o.f8736a;
                if (iIntValue2 == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    c0912t2.X(761451259);
                    Context context = (Context) this.f6191p;
                    boolean zF = c0912t2.f(context);
                    e.i iVar = (e.i) this.f6192q;
                    boolean zH = zF | c0912t2.h(iVar);
                    MainActivity mainActivity = (MainActivity) this.f6193r;
                    boolean zF2 = zH | c0912t2.f(mainActivity);
                    Object objK2 = c0912t2.K();
                    if (zF2 || objK2 == C0903o.f11850a) {
                        objK2 = new C0440l(context, iVar, mainActivity, null);
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    C0879c.e(c0912t2, oVar, (l5.e) objK2);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    Object value = ((Z0) this.f6191p).getValue();
                    c0912t3.X(-285701582);
                    List list = (List) this.f6193r;
                    boolean zF3 = c0912t3.f(list);
                    Object objK3 = c0912t3.K();
                    if (zF3 || objK3 == C0903o.f11850a) {
                        objK3 = new C1020h((InterfaceC0878b0) this.f6192q, list, null);
                        c0912t3.i0(objK3);
                    }
                    c0912t3.p(false);
                    C0879c.e(c0912t3, value, (l5.e) objK3);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f6191p;
                    Object objA = interfaceC1180a.a();
                    c0912t4.X(971686780);
                    boolean zF4 = c0912t4.f(interfaceC1180a);
                    C1670c c1670c = (C1670c) this.f6192q;
                    boolean zH2 = zF4 | c0912t4.h(c1670c);
                    Object objK4 = c0912t4.K();
                    if (zH2 || objK4 == C0903o.f11850a) {
                        objK4 = new C1040r0(interfaceC1180a, (p0.p) this.f6193r, c1670c, null);
                        c0912t4.i0(objK4);
                    }
                    c0912t4.p(false);
                    C0879c.e(c0912t4, objA, (l5.e) objK4);
                }
                break;
            case 4:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pL = i6.h.l(i6.h.E(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.b(AbstractC1109c.v(c0912t5, c1395m), 1.0f), 53, Float.NaN), 48), 0.4f);
                    q0 q0VarA = o0.a(AbstractC0068i.f1331e, C1385c.f15621x, c0912t5, 6);
                    long j7 = c0912t5.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t5.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t5, interfaceC1398pL);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t5.b0();
                    if (c0912t5.f11890S) {
                        c0912t5.k(c0353i2);
                    } else {
                        c0912t5.l0();
                    }
                    C0879c.y(c0912t5, q0VarA, C0354j.f6019f);
                    C0879c.y(c0912t5, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t5.f11890S || !AbstractC1209k.a(c0912t5.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t5, i8, c0351h2);
                    }
                    C0879c.y(c0912t5, interfaceC1398pC2, C0354j.f6017d);
                    float f7 = 30;
                    InterfaceC1398p interfaceC1398pQ = A0.e.Q(c1395m, 1.0f);
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f6191p;
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f6192q;
                    M3.a.h(interfaceC1398pQ, interfaceC1180a2, interfaceC1180a3, f7, c0912t5, 3072);
                    AbstractC0060d.d(c0912t5, A0.e.Q(c1395m, 0.1f));
                    M3.a.b(A0.e.Q(c1395m, 1.0f), 0.0f, c0912t5, 0);
                    AbstractC0060d.d(c0912t5, A0.e.Q(c1395m, 0.1f));
                    M3.a.p(A0.e.Q(c1395m, 1.0f), (InterfaceC1180a) this.f6193r, interfaceC1180a3, f7, c0912t5, 3072);
                    c0912t5.p(true);
                }
                break;
            case 5:
                C0912t c0912t6 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    boolean zBooleanValue = ((Boolean) ((InterfaceC1180a) this.f6191p).a()).booleanValue();
                    c0912t6.X(1932107514);
                    InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) this.f6192q;
                    boolean zF5 = c0912t6.f(interfaceC1180a4);
                    Context context2 = (Context) this.f6193r;
                    boolean zF6 = zF5 | c0912t6.f(context2);
                    Object objK5 = c0912t6.K();
                    if (zF6 || objK5 == C0903o.f11850a) {
                        objK5 = new h0(interfaceC1180a4, 21, context2);
                        c0912t6.i0(objK5);
                    }
                    c0912t6.p(false);
                    B.a(zBooleanValue, (InterfaceC1182c) objK5, androidx.compose.foundation.layout.c.c(C1395m.f15634a, 25), null, false, null, c0912t6, 384, 120);
                }
                break;
            case 6:
                C0912t c0912t7 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    C1395m c1395m2 = C1395m.f15634a;
                    float f8 = 14;
                    InterfaceC1398p interfaceC1398pH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), C1987t.b(t6.a.b(C1987t.f20258e, C1987t.f20256c, c0912t7), 0.15f), AbstractC1109c.i(f8, null, 6)), f8, 15);
                    q0 q0VarA2 = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t7, 48);
                    long j8 = c0912t7.f11891T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t7.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t7, interfaceC1398pH);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i3 = C0354j.f6015b;
                    c0912t7.b0();
                    if (c0912t7.f11890S) {
                        c0912t7.k(c0353i3);
                    } else {
                        c0912t7.l0();
                    }
                    C0879c.y(c0912t7, q0VarA2, C0354j.f6019f);
                    C0879c.y(c0912t7, interfaceC0906p0L3, C0354j.f6018e);
                    C0351h c0351h3 = C0354j.f6020g;
                    if (c0912t7.f11890S || !AbstractC1209k.a(c0912t7.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t7, i9, c0351h3);
                    }
                    C0879c.y(c0912t7, interfaceC1398pC3, C0354j.f6017d);
                    D0.b bVarB = AbstractC1267a.B(R.drawable.ic_tips_minus, c0912t7);
                    float f9 = 12;
                    InterfaceC1398p interfaceC1398pL2 = i6.h.l(androidx.compose.foundation.layout.c.g(c1395m2, f9), 0.45f);
                    c0912t7.X(1457040252);
                    Object objK6 = c0912t7.K();
                    W w7 = C0903o.f11850a;
                    if (objK6 == w7) {
                        objK6 = n1.c.q(c0912t7);
                    }
                    B.k kVar = (B.k) objK6;
                    c0912t7.p(false);
                    c0912t7.X(1457044476);
                    final Context context3 = (Context) this.f6191p;
                    boolean zF7 = c0912t7.f(context3);
                    Object objK7 = c0912t7.K();
                    final C0886f0 c0886f02 = (C0886f0) this.f6192q;
                    if (zF7 || objK7 == w7) {
                        final int i10 = 0;
                        objK7 = new InterfaceC1180a() { // from class: s6.e
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                switch (i10) {
                                    case 0:
                                        C0886f0 c0886f03 = c0886f02;
                                        AbstractC1209k.f(c0886f03, "$cornerValue");
                                        Context context4 = context3;
                                        AbstractC1209k.f(context4, "$context");
                                        if (c0886f03.h() > 0.0f) {
                                            Object systemService = context4.getSystemService("vibrator");
                                            AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                                            Vibrator vibrator = (Vibrator) systemService;
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                vibrator.vibrate(VibrationEffect.createPredefined(0));
                                            } else {
                                                vibrator.vibrate(30L);
                                            }
                                            c0886f03.j(c0886f03.h() - 1.0f);
                                        }
                                        break;
                                    default:
                                        C0886f0 c0886f04 = c0886f02;
                                        AbstractC1209k.f(c0886f04, "$cornerValue");
                                        Context context5 = context3;
                                        AbstractC1209k.f(context5, "$context");
                                        if (c0886f04.h() < 130.0f) {
                                            Object systemService2 = context5.getSystemService("vibrator");
                                            AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                                            Vibrator vibrator2 = (Vibrator) systemService2;
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                vibrator2.vibrate(VibrationEffect.createPredefined(0));
                                            } else {
                                                vibrator2.vibrate(30L);
                                            }
                                            c0886f04.j(c0886f04.h() + 1.0f);
                                        }
                                        break;
                                }
                                return o.f8736a;
                            }
                        };
                        c0912t7.i0(objK7);
                    }
                    c0912t7.p(false);
                    AbstractC0774A.a(bVarB, null, androidx.compose.foundation.a.c(interfaceC1398pL2, kVar, null, false, (InterfaceC1180a) objK7, 28), 0L, c0912t7, 48, 8);
                    float fH = c0886f02.h();
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m2, 1.0f);
                    if (1.0f <= 0.0d) {
                        E.a.a("invalid weight; must be greater than zero");
                    }
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(interfaceC1398pB.f(new LayoutWeightElement(1.0f, true)), f9, 0.0f, 8, 0.0f, 10);
                    C1420a c1420a = new C1420a(0.0f, 130.0f);
                    c0912t7.X(1457054496);
                    Object objK8 = c0912t7.K();
                    if (objK8 == w7) {
                        c0886f0 = c0886f02;
                        objK8 = new s6.f(c0886f0, 0);
                        c0912t7.i0(objK8);
                    } else {
                        c0886f0 = c0886f02;
                    }
                    c0912t7.p(false);
                    B.k kVar2 = (B.k) this.f6193r;
                    final C0886f0 c0886f03 = c0886f0;
                    x.a(fH, (InterfaceC1182c) objK8, interfaceC1398pJ, false, c1420a, null, kVar2, n0.e.e(845770198, new B0(10, kVar2), c0912t7), null, c0912t7, 905969712);
                    D0.b bVarB2 = AbstractC1267a.B(R.drawable.ic_tips_plus, c0912t7);
                    InterfaceC1398p interfaceC1398pL3 = i6.h.l(androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.a.j(c1395m2, 0.0f, 0.0f, 2, 0.0f, 11), f8), 0.45f);
                    c0912t7.X(1457095228);
                    Object objK9 = c0912t7.K();
                    if (objK9 == w7) {
                        objK9 = n1.c.q(c0912t7);
                    }
                    B.k kVar3 = (B.k) objK9;
                    c0912t7.p(false);
                    c0912t7.X(1457099454);
                    boolean zF8 = c0912t7.f(context3);
                    Object objK10 = c0912t7.K();
                    if (zF8 || objK10 == w7) {
                        final int i11 = 1;
                        objK10 = new InterfaceC1180a() { // from class: s6.e
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                switch (i11) {
                                    case 0:
                                        C0886f0 c0886f032 = c0886f03;
                                        AbstractC1209k.f(c0886f032, "$cornerValue");
                                        Context context4 = context3;
                                        AbstractC1209k.f(context4, "$context");
                                        if (c0886f032.h() > 0.0f) {
                                            Object systemService = context4.getSystemService("vibrator");
                                            AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                                            Vibrator vibrator = (Vibrator) systemService;
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                vibrator.vibrate(VibrationEffect.createPredefined(0));
                                            } else {
                                                vibrator.vibrate(30L);
                                            }
                                            c0886f032.j(c0886f032.h() - 1.0f);
                                        }
                                        break;
                                    default:
                                        C0886f0 c0886f04 = c0886f03;
                                        AbstractC1209k.f(c0886f04, "$cornerValue");
                                        Context context5 = context3;
                                        AbstractC1209k.f(context5, "$context");
                                        if (c0886f04.h() < 130.0f) {
                                            Object systemService2 = context5.getSystemService("vibrator");
                                            AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                                            Vibrator vibrator2 = (Vibrator) systemService2;
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                vibrator2.vibrate(VibrationEffect.createPredefined(0));
                                            } else {
                                                vibrator2.vibrate(30L);
                                            }
                                            c0886f04.j(c0886f04.h() + 1.0f);
                                        }
                                        break;
                                }
                                return o.f8736a;
                            }
                        };
                        c0912t7.i0(objK10);
                    }
                    c0912t7.p(false);
                    AbstractC0774A.a(bVarB2, null, androidx.compose.foundation.a.c(interfaceC1398pL3, kVar3, null, false, (InterfaceC1180a) objK10, 28), 0L, c0912t7, 48, 8);
                    c0912t7.p(true);
                    AbstractC1113a.h(I0.c.S(R.string.tip_corner_desc, c0912t7), androidx.compose.foundation.layout.a.j(c1395m2, 0.0f, 6, 0.0f, 0.0f, 13), c0912t7, 48);
                }
                break;
            case 7:
                C0912t c0912t8 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t8.z()) {
                    c0912t8.Q();
                } else {
                    p4.g gVar = new p4.g((Context) c0912t8.j(AndroidCompositionLocals_androidKt.f9324b));
                    gVar.f15027c = ((InterfaceC0878b0) this.f6192q).getValue();
                    gVar.f15035m = Boolean.valueOf(c6.a.f10688a);
                    gVar.b();
                    p4.h hVarA = gVar.a();
                    C0306f0 c0306f0 = C0318o.f5425a;
                    InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a((InterfaceC1398p) this.f6191p, new C1247d(12));
                    c0912t8.X(1723002345);
                    Object objK11 = c0912t8.K();
                    if (objK11 == C0903o.f11850a) {
                        objK11 = new t0((InterfaceC0878b0) this.f6193r, 25);
                        c0912t8.i0(objK11);
                    }
                    c0912t8.p(false);
                    f4.r.a(hVarA, null, androidx.compose.ui.draw.a.b(interfaceC1398pA, (InterfaceC1182c) objK11), c0306f0, null, c0912t8, 1572912, 952);
                }
                break;
            default:
                C0912t c0912t9 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t9.z()) {
                    c0912t9.Q();
                } else {
                    Z0 z0B = AbstractC1674g.b(((Boolean) ((Z0) this.f6191p).getValue()).booleanValue() ? 0.618f : 0.0f, AbstractC1671d.l(300, 0, AbstractC1692z.f18766a, 2), 0.0f, null, c0912t9, 0, 28);
                    p4.g gVar2 = new p4.g((Context) this.f6193r);
                    gVar2.f15027c = ((InterfaceC0878b0) this.f6192q).getValue();
                    gVar2.f15035m = Boolean.valueOf(c6.a.f10688a);
                    gVar2.b();
                    p4.h hVarA2 = gVar2.a();
                    C0306f0 c0306f02 = C0318o.f5425a;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    c0912t9.X(1723036054);
                    boolean zF9 = c0912t9.f(z0B);
                    Object objK12 = c0912t9.K();
                    if (zF9 || objK12 == C0903o.f11850a) {
                        objK12 = new K(z0B, 3);
                        c0912t9.i0(objK12);
                    }
                    c0912t9.p(false);
                    f4.r.a(hVarA2, null, androidx.compose.ui.graphics.a.a(fillElement, (InterfaceC1182c) objK12), c0306f02, new C1980m(AbstractC1959I.c(855638016), 15), c0912t9, 1572912, 696);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ j(Z0 z02, Object obj, InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f6190o = i7;
        this.f6191p = z02;
        this.f6193r = obj;
        this.f6192q = interfaceC0878b0;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        this.f6190o = i7;
        this.f6191p = obj;
        this.f6192q = obj2;
        this.f6193r = obj3;
    }
}
