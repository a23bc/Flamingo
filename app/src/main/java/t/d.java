package T;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.o0;
import D.q0;
import F.m;
import I.C0211c;
import I.L;
import M.t0;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import Y4.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b6.k;
import d0.H0;
import e4.C0862k;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import h6.C1023i0;
import h6.C1024j;
import h6.C1028l;
import h6.C1043t;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import p0.p;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.C1670c;
import y0.C1987t;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class d implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f6841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f6842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6844s;

    public d(Z0 z02, Z0 z03, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02) {
        this.f6840o = 6;
        this.f6842q = z02;
        this.f6843r = z03;
        this.f6841p = interfaceC0878b0;
        this.f6844s = interfaceC0878b02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6840o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = c0912t.K();
                    W w7 = C0903o.f11850a;
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f6841p;
                    if (objK == w7) {
                        objK = new t0(interfaceC0878b0, 4);
                        c0912t.i0(objK);
                    }
                    InterfaceC1398p interfaceC1398pD = androidx.compose.ui.layout.a.d((InterfaceC1398p) this.f6842q, (InterfaceC1182c) objK);
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
                    ((n0.d) this.f6843r).invoke(c0912t, 0);
                    Object objK2 = c0912t.K();
                    if (objK2 == w7) {
                        objK2 = new m(interfaceC0878b0, 6);
                        c0912t.i0(objK2);
                    }
                    ((c) this.f6844s).b((InterfaceC1180a) objK2, c0912t, 6);
                    c0912t.p(true);
                } else {
                    c0912t.Q();
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue() & 3;
                o oVar = o.f8736a;
                if (iIntValue2 == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    c0912t2.X(-745519062);
                    boolean zF = c0912t2.f((YosMediaItem) this.f6842q);
                    Context context = (Context) this.f6843r;
                    boolean zF2 = zF | c0912t2.f(context);
                    C0862k c0862k = (C0862k) this.f6844s;
                    boolean zH = zF2 | c0912t2.h(c0862k) | c0912t2.f((InterfaceC0878b0) this.f6841p);
                    Object objK3 = c0912t2.K();
                    if (zH || objK3 == C0903o.f11850a) {
                        C1024j c1024j = new C1024j((YosMediaItem) this.f6842q, context, c0862k, (InterfaceC0878b0) this.f6841p, null);
                        c0912t2.i0(c1024j);
                        objK3 = c1024j;
                    }
                    c0912t2.p(false);
                    C0879c.e(c0912t2, oVar, (l5.e) objK3);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    c0912t3.X(800607006);
                    boolean zF3 = c0912t3.f((InterfaceC1182c) this.f6841p);
                    C0211c c0211c = (C0211c) this.f6842q;
                    boolean zF4 = zF3 | c0912t3.f(c0211c);
                    String str = (String) this.f6843r;
                    boolean zF5 = zF4 | c0912t3.f(str);
                    String str2 = (String) this.f6844s;
                    boolean zF6 = zF5 | c0912t3.f(str2);
                    Object objK4 = c0912t3.K();
                    if (zF6 || objK4 == C0903o.f11850a) {
                        C1028l c1028l = new C1028l((InterfaceC1182c) this.f6841p, (C0211c) this.f6842q, str, str2, null);
                        c0912t3.i0(c1028l);
                        objK4 = c1028l;
                    }
                    c0912t3.p(false);
                    C0879c.e(c0912t3, c0211c, (l5.e) objK4);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    Context context2 = (Context) c0912t4.j(AndroidCompositionLocals_androidKt.f9324b);
                    String string = context2.getString(R.string.page_home_title);
                    AbstractC1209k.e(string, "getString(...)");
                    String string2 = context2.getString(R.string.page_library_title);
                    AbstractC1209k.e(string2, "getString(...)");
                    AbstractC1110d.n(n0.e.e(1151835988, new d((C0211c) this.f6842q, (InterfaceC1182c) this.f6841p, string, string2, 2), c0912t4), c0912t4, 6);
                    N5.d.c(0.0f, 2, 100687920, 15084, null, null, null, null, (C0211c) this.f6842q, null, c0912t4, new k(2), n0.e.e(-19482474, new U5.W((x) this.f6843r, (Z5.a) this.f6844s), c0912t4), null, androidx.compose.foundation.layout.c.f9203c, null, false);
                }
                break;
            case 4:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    System.out.getClass();
                    InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(androidx.compose.foundation.layout.c.f9203c, new k(13));
                    c0912t5.X(158061512);
                    Object objK5 = c0912t5.K();
                    W w8 = C0903o.f11850a;
                    if (objK5 == w8) {
                        objK5 = new m((InterfaceC0878b0) this.f6841p, 12);
                        c0912t5.i0(objK5);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK5;
                    c0912t5.p(false);
                    c0912t5.X(158071834);
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f6843r;
                    boolean zF7 = c0912t5.f(interfaceC1180a2);
                    Object objK6 = c0912t5.K();
                    if (zF7 || objK6 == w8) {
                        objK6 = new L(interfaceC1180a2, 4);
                        c0912t5.i0(objK6);
                    }
                    c0912t5.p(false);
                    u6.L.d(interfaceC1398pA, interfaceC1180a, (InterfaceC1180a) this.f6842q, (InterfaceC1180a) objK6, (InterfaceC1180a) this.f6844s, c0912t5, 54);
                }
                break;
            case 5:
                C0912t c0912t6 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f6842q;
                    Object objA = interfaceC1180a3.a();
                    c0912t6.X(970974919);
                    boolean zF8 = c0912t6.f(interfaceC1180a3) | c0912t6.h((C1670c) this.f6841p) | c0912t6.h((C1670c) this.f6843r);
                    Object objK7 = c0912t6.K();
                    if (zF8 || objK7 == C0903o.f11850a) {
                        C1023i0 c1023i0 = new C1023i0((InterfaceC1180a) this.f6842q, (p) this.f6844s, (C1670c) this.f6841p, (C1670c) this.f6843r, null);
                        c0912t6.i0(c1023i0);
                        objK7 = c1023i0;
                    }
                    c0912t6.p(false);
                    C0879c.e(c0912t6, objA, (l5.e) objK7);
                }
                break;
            default:
                C0912t c0912t7 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pC2 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 7, 4), 22);
                    Z zD2 = AbstractC0074o.d(C1385c.f15616s, false);
                    long j7 = c0912t7.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t7.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t7, interfaceC1398pC2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t7.b0();
                    if (c0912t7.f11890S) {
                        c0912t7.k(c0353i2);
                    } else {
                        c0912t7.l0();
                    }
                    C0351h c0351h2 = C0354j.f6019f;
                    C0879c.y(c0912t7, zD2, c0351h2);
                    C0351h c0351h3 = C0354j.f6018e;
                    C0879c.y(c0912t7, interfaceC0906p0L2, c0351h3);
                    C0351h c0351h4 = C0354j.f6020g;
                    if (c0912t7.f11890S || !AbstractC1209k.a(c0912t7.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t7, i8, c0351h4);
                    }
                    C0351h c0351h5 = C0354j.f6017d;
                    C0879c.y(c0912t7, interfaceC1398pC3, c0351h5);
                    InterfaceC1398p interfaceC1398pV = AbstractC1109c.v(c0912t7, androidx.compose.foundation.layout.c.b(c1395m, 1.0f));
                    c0912t7.X(1962052204);
                    Z0 z02 = (Z0) this.f6842q;
                    boolean zF9 = c0912t7.f(z02);
                    Z0 z03 = (Z0) this.f6843r;
                    boolean zF10 = zF9 | c0912t7.f(z03);
                    Object objK8 = c0912t7.K();
                    if (zF10 || objK8 == C0903o.f11850a) {
                        objK8 = new C1043t(z02, z03, 2);
                        c0912t7.i0(objK8);
                    }
                    c0912t7.p(false);
                    InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.ui.graphics.a.a(interfaceC1398pV, (InterfaceC1182c) objK8), 25, 0.0f, 2);
                    q0 q0VarA = o0.a(AbstractC0068i.f1332f, C1385c.f15621x, c0912t7, 6);
                    long j8 = c0912t7.f11891T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t7.l();
                    InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t7, interfaceC1398pI);
                    c0912t7.b0();
                    if (c0912t7.f11890S) {
                        c0912t7.k(c0353i2);
                    } else {
                        c0912t7.l0();
                    }
                    C0879c.y(c0912t7, q0VarA, c0351h2);
                    C0879c.y(c0912t7, interfaceC0906p0L3, c0351h3);
                    if (c0912t7.f11890S || !AbstractC1209k.a(c0912t7.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t7, i9, c0351h4);
                    }
                    C0879c.y(c0912t7, interfaceC1398pC4, c0351h5);
                    String str3 = (String) ((InterfaceC0878b0) this.f6841p).getValue();
                    long jU = AbstractC1109c.u(12);
                    f1.k kVar = f1.k.f12003u;
                    long jT = AbstractC1109c.t(0.3d);
                    long j9 = C1987t.f20259f;
                    H0.b(str3, null, j9, jU, kVar, null, jT, null, 0L, 0, false, 0, 0, null, c0912t7, 12782976, 0, 130898);
                    H0.b((String) ((InterfaceC0878b0) this.f6844s).getValue(), null, j9, AbstractC1109c.u(12), kVar, null, AbstractC1109c.t(0.3d), null, 0L, 0, false, 0, 0, null, c0912t7, 12782976, 0, 130898);
                    c0912t7.p(true);
                    u6.L.b(0, c0912t7);
                    c0912t7.p(true);
                }
                break;
        }
        return o.f8736a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f6840o = i7;
        this.f6842q = obj;
        this.f6843r = obj2;
        this.f6844s = obj3;
        this.f6841p = interfaceC0878b0;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f6840o = i7;
        this.f6842q = obj;
        this.f6841p = obj2;
        this.f6843r = obj3;
        this.f6844s = obj4;
    }
}
