package h6;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.AbstractC1674g;
import w3.C1760y;
import y0.C1987t;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f12909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f12910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f12912s;

    public /* synthetic */ O0(InterfaceC1180a interfaceC1180a, Context context, InterfaceC1182c interfaceC1182c, float f7, int i7) {
        this.f12908o = i7;
        this.f12909p = interfaceC1180a;
        this.f12910q = context;
        this.f12911r = interfaceC1182c;
        this.f12912s = f7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12908o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    final InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f12909p;
                    boolean z6 = ((Number) interfaceC1180a.a()).intValue() == 2 || ((Number) interfaceC1180a.a()).intValue() == 1;
                    Z0 z0B = AbstractC1674g.b(z6 ? 0.9f : 0.0f, null, 0.0f, null, c0912t, 0, 30);
                    C1395m c1395m = C1395m.f15634a;
                    c0912t.X(-2131175383);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    if (objK == w7) {
                        objK = n1.c.q(c0912t);
                    }
                    B.k kVar = (B.k) objK;
                    c0912t.p(false);
                    c0912t.X(-2131201078);
                    final Context context = (Context) this.f12910q;
                    boolean zF = c0912t.f(context) | c0912t.f(interfaceC1180a);
                    final InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f12911r;
                    boolean zF2 = zF | c0912t.f(interfaceC1182c);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == w7) {
                        final int i7 = 0;
                        objK2 = new InterfaceC1180a() { // from class: h6.L0
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                switch (i7) {
                                    case 0:
                                        Context context2 = context;
                                        AbstractC1209k.f(context2, "$context");
                                        InterfaceC1180a interfaceC1180a2 = interfaceC1180a;
                                        AbstractC1209k.f(interfaceC1180a2, "$repeatModeLambda");
                                        InterfaceC1182c interfaceC1182c2 = interfaceC1182c;
                                        AbstractC1209k.f(interfaceC1182c2, "$repeatModeOnChanged");
                                        Object systemService = context2.getSystemService("vibrator");
                                        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                                        Vibrator vibrator = (Vibrator) systemService;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            vibrator.vibrate(VibrationEffect.createPredefined(0));
                                        } else {
                                            vibrator.vibrate(30L);
                                        }
                                        int iIntValue = ((Number) interfaceC1180a2.a()).intValue();
                                        int i8 = iIntValue != 0 ? iIntValue != 2 ? 0 : 1 : 2;
                                        C1760y c1760y = b6.i.f10423c;
                                        if (c1760y != null) {
                                            c1760y.f(i8);
                                        }
                                        C1760y c1760y2 = b6.i.f10423c;
                                        if (c1760y2 != null) {
                                            new YosPlaybackService().l(c1760y2);
                                        }
                                        interfaceC1182c2.b(Integer.valueOf(i8));
                                        break;
                                    default:
                                        Context context3 = context;
                                        AbstractC1209k.f(context3, "$context");
                                        AbstractC1209k.f(interfaceC1180a, "$shuffleModeEnabledLambda");
                                        InterfaceC1182c interfaceC1182c3 = interfaceC1182c;
                                        AbstractC1209k.f(interfaceC1182c3, "$shuffleModeOnChanged");
                                        Object systemService2 = context3.getSystemService("vibrator");
                                        AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                                        Vibrator vibrator2 = (Vibrator) systemService2;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            vibrator2.vibrate(VibrationEffect.createPredefined(0));
                                        } else {
                                            vibrator2.vibrate(30L);
                                        }
                                        C1760y c1760y3 = b6.i.f10423c;
                                        if (c1760y3 != null) {
                                            c1760y3.E(!((Boolean) r1.a()).booleanValue());
                                        }
                                        C1760y c1760y4 = b6.i.f10423c;
                                        if (c1760y4 != null) {
                                            new YosPlaybackService().l(c1760y4);
                                        }
                                        interfaceC1182c3.b(Boolean.valueOf(!((Boolean) r1.a()).booleanValue()));
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t.i0(objK2);
                    }
                    c0912t.p(false);
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.c(c1395m, kVar, null, false, (InterfaceC1180a) objK2, 28), 10, 0.0f, 0.0f, 0.0f, 14);
                    float f7 = this.f12912s;
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.g(interfaceC1398pJ, f7), C1987t.b(C1987t.f20259f, ((Number) z0B.getValue()).floatValue()), AbstractC1109c.i(8, null, 6));
                    O0.Z zD = AbstractC0074o.d(C1385c.f15616s, false);
                    long j3 = c0912t.f11891T;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pB);
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
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t, i8, c0351h);
                    }
                    C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                    AbstractC1110d.n(n0.e.e(1548333991, new N0(interfaceC1180a, f7, z6), c0912t), c0912t, 6);
                    c0912t.p(true);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    final InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f12909p;
                    Z0 z0B2 = AbstractC1674g.b(((Boolean) interfaceC1180a2.a()).booleanValue() ? 0.9f : 0.0f, null, 0.0f, null, c0912t2, 0, 30);
                    C1395m c1395m2 = C1395m.f15634a;
                    c0912t2.X(1059691874);
                    Object objK3 = c0912t2.K();
                    f0.W w8 = C0903o.f11850a;
                    if (objK3 == w8) {
                        objK3 = n1.c.q(c0912t2);
                    }
                    B.k kVar2 = (B.k) objK3;
                    c0912t2.p(false);
                    c0912t2.X(1059678455);
                    final Context context2 = (Context) this.f12910q;
                    boolean zF3 = c0912t2.f(context2) | c0912t2.f(interfaceC1180a2);
                    final InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) this.f12911r;
                    boolean zF4 = zF3 | c0912t2.f(interfaceC1182c2);
                    Object objK4 = c0912t2.K();
                    if (zF4 || objK4 == w8) {
                        final int i9 = 1;
                        objK4 = new InterfaceC1180a() { // from class: h6.L0
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                switch (i9) {
                                    case 0:
                                        Context context22 = context2;
                                        AbstractC1209k.f(context22, "$context");
                                        InterfaceC1180a interfaceC1180a22 = interfaceC1180a2;
                                        AbstractC1209k.f(interfaceC1180a22, "$repeatModeLambda");
                                        InterfaceC1182c interfaceC1182c22 = interfaceC1182c2;
                                        AbstractC1209k.f(interfaceC1182c22, "$repeatModeOnChanged");
                                        Object systemService = context22.getSystemService("vibrator");
                                        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                                        Vibrator vibrator = (Vibrator) systemService;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            vibrator.vibrate(VibrationEffect.createPredefined(0));
                                        } else {
                                            vibrator.vibrate(30L);
                                        }
                                        int iIntValue = ((Number) interfaceC1180a22.a()).intValue();
                                        int i82 = iIntValue != 0 ? iIntValue != 2 ? 0 : 1 : 2;
                                        C1760y c1760y = b6.i.f10423c;
                                        if (c1760y != null) {
                                            c1760y.f(i82);
                                        }
                                        C1760y c1760y2 = b6.i.f10423c;
                                        if (c1760y2 != null) {
                                            new YosPlaybackService().l(c1760y2);
                                        }
                                        interfaceC1182c22.b(Integer.valueOf(i82));
                                        break;
                                    default:
                                        Context context3 = context2;
                                        AbstractC1209k.f(context3, "$context");
                                        AbstractC1209k.f(interfaceC1180a2, "$shuffleModeEnabledLambda");
                                        InterfaceC1182c interfaceC1182c3 = interfaceC1182c2;
                                        AbstractC1209k.f(interfaceC1182c3, "$shuffleModeOnChanged");
                                        Object systemService2 = context3.getSystemService("vibrator");
                                        AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                                        Vibrator vibrator2 = (Vibrator) systemService2;
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            vibrator2.vibrate(VibrationEffect.createPredefined(0));
                                        } else {
                                            vibrator2.vibrate(30L);
                                        }
                                        C1760y c1760y3 = b6.i.f10423c;
                                        if (c1760y3 != null) {
                                            c1760y3.E(!((Boolean) r1.a()).booleanValue());
                                        }
                                        C1760y c1760y4 = b6.i.f10423c;
                                        if (c1760y4 != null) {
                                            new YosPlaybackService().l(c1760y4);
                                        }
                                        interfaceC1182c3.b(Boolean.valueOf(!((Boolean) r1.a()).booleanValue()));
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t2.i0(objK4);
                    }
                    c0912t2.p(false);
                    InterfaceC1398p interfaceC1398pC2 = androidx.compose.foundation.a.c(c1395m2, kVar2, null, false, (InterfaceC1180a) objK4, 28);
                    float f8 = this.f12912s;
                    InterfaceC1398p interfaceC1398pB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.g(interfaceC1398pC2, f8), C1987t.b(C1987t.f20259f, ((Number) z0B2.getValue()).floatValue()), AbstractC1109c.i(8, null, 6));
                    O0.Z zD2 = AbstractC0074o.d(C1385c.f15616s, false);
                    long j7 = c0912t2.f11891T;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t2, interfaceC1398pB2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD2, C0354j.f6019f);
                    C0879c.y(c0912t2, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                        n1.c.w(i10, c0912t2, i10, c0351h2);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC3, C0354j.f6017d);
                    AbstractC1110d.n(n0.e.e(582427568, new P0(interfaceC1180a2, f8), c0912t2), c0912t2, 6);
                    c0912t2.p(true);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    O3.f fVar = new O3.f((Context) c0912t3.j(AndroidCompositionLocals_androidKt.f9324b), 2);
                    c0912t3.X(425004467);
                    Object objK5 = c0912t3.K();
                    f0.W w9 = C0903o.f11850a;
                    if (objK5 == w9) {
                        objK5 = n1.c.q(c0912t3);
                    }
                    B.k kVar3 = (B.k) objK5;
                    c0912t3.p(false);
                    c0912t3.X(424998736);
                    boolean zF5 = c0912t3.f(fVar);
                    Object objK6 = c0912t3.K();
                    if (zF5 || objK6 == w9) {
                        objK6 = new G(fVar, 0);
                        c0912t3.i0(objK6);
                    }
                    c0912t3.p(false);
                    InterfaceC1398p interfaceC1398pC4 = androidx.compose.foundation.a.c((InterfaceC1398p) this.f12909p, kVar3, null, false, (InterfaceC1180a) objK6, 28);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15609B, c0912t3, 48);
                    long j8 = c0912t3.f11891T;
                    int i11 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t3.l();
                    InterfaceC1398p interfaceC1398pC5 = AbstractC1383a.c(c0912t3, interfaceC1398pC4);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i3 = C0354j.f6015b;
                    c0912t3.b0();
                    if (c0912t3.f11890S) {
                        c0912t3.k(c0353i3);
                    } else {
                        c0912t3.l0();
                    }
                    C0351h c0351h3 = C0354j.f6019f;
                    C0879c.y(c0912t3, c0084zA, c0351h3);
                    C0351h c0351h4 = C0354j.f6018e;
                    C0879c.y(c0912t3, interfaceC0906p0L3, c0351h4);
                    C0351h c0351h5 = C0354j.f6020g;
                    if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i11))) {
                        n1.c.w(i11, c0912t3, i11, c0351h5);
                    }
                    C0351h c0351h6 = C0354j.f6017d;
                    C0879c.y(c0912t3, interfaceC1398pC5, c0351h6);
                    InterfaceC1398p interfaceC1398pC6 = androidx.compose.foundation.layout.c.c(C1395m.f15634a, 36);
                    C1390h c1390h = C1385c.f15616s;
                    O0.Z zD3 = AbstractC0074o.d(c1390h, false);
                    long j9 = c0912t3.f11891T;
                    int i12 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L4 = c0912t3.l();
                    InterfaceC1398p interfaceC1398pC7 = AbstractC1383a.c(c0912t3, interfaceC1398pC6);
                    c0912t3.b0();
                    if (c0912t3.f11890S) {
                        c0912t3.k(c0353i3);
                    } else {
                        c0912t3.l0();
                    }
                    C0879c.y(c0912t3, zD3, c0351h3);
                    C0879c.y(c0912t3, interfaceC0906p0L4, c0351h4);
                    if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i12))) {
                        n1.c.w(i12, c0912t3, i12, c0351h5);
                    }
                    C0879c.y(c0912t3, interfaceC1398pC7, c0351h6);
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f12910q;
                    AbstractC1110d.a(interfaceC0878b0.getValue(), null, new b6.k(8), c1390h, null, null, n0.e.e(1139040549, new C(2, this.f12912s), c0912t3), c0912t3, 1576320, 50);
                    c0912t3.p(true);
                    AbstractC1113a.d(((Boolean) interfaceC0878b0.getValue()).booleanValue(), null, androidx.compose.animation.b.h(null, 0.3f, 5).a(androidx.compose.animation.b.e(null, 3)), androidx.compose.animation.b.j(null, 0.3f, 5).a(androidx.compose.animation.b.f(null, 3)), null, n0.e.e(105385908, new H((InterfaceC0878b0) this.f12911r, 0), c0912t3), c0912t3, 1600518, 18);
                    c0912t3.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public O0(InterfaceC1398p interfaceC1398p, InterfaceC0878b0 interfaceC0878b0, float f7, InterfaceC0878b0 interfaceC0878b02) {
        this.f12908o = 2;
        this.f12909p = interfaceC1398p;
        this.f12910q = interfaceC0878b0;
        this.f12912s = f7;
        this.f12911r = interfaceC0878b02;
    }
}
