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
import androidx.compose.foundation.layout.FillElement;
import f0.C0879c;
import f0.C0888g0;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1110d;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1389g;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.C1598P;
import w.AbstractC1671d;
import w.AbstractC1674g;
import w.C1670c;

/* JADX INFO: renamed from: h6.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1017f0 implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13039A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f13043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13045t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f13046u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13047v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f13048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1670c f13049x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Z0 f13050y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f13051z;

    public /* synthetic */ C1017f0(InterfaceC0878b0 interfaceC0878b0, InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, C0890h0 c0890h0, InterfaceC1180a interfaceC1180a2, InterfaceC1182c interfaceC1182c2, InterfaceC0878b0 interfaceC0878b02, C0888g0 c0888g0, C1670c c1670c, Z0 z02, Context context, InterfaceC0878b0 interfaceC0878b03, int i7) {
        this.f13040o = i7;
        this.f13041p = interfaceC0878b0;
        this.f13042q = interfaceC1180a;
        this.f13043r = interfaceC1182c;
        this.f13044s = c0890h0;
        this.f13045t = interfaceC1180a2;
        this.f13046u = interfaceC1182c2;
        this.f13047v = interfaceC0878b02;
        this.f13048w = c0888g0;
        this.f13049x = c1670c;
        this.f13050y = z02;
        this.f13051z = context;
        this.f13039A = interfaceC0878b03;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13040o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    InterfaceC0878b0 interfaceC0878b0 = this.f13041p;
                    Z0 z0B = AbstractC1674g.b(((Boolean) interfaceC0878b0.getValue()).booleanValue() ? 1.0f : 0.86f, AbstractC1671d.k(1.0f, 405.0f, null, 4), 0.0f, null, c0912t, 48, 28);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    c0912t.X(-1491091411);
                    boolean zF = c0912t.f(z0B);
                    Object objK = c0912t.K();
                    if (zF || objK == C0903o.f11850a) {
                        objK = new K(z0B, 2);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(fillElement, (InterfaceC1182c) objK);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1330d, C1385c.f15608A, c0912t, 6);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pA);
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
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t, i7, c0351h);
                    }
                    C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                    boolean zBooleanValue = ((Boolean) interfaceC0878b0.getValue()).booleanValue();
                    C1598P c1598pE = androidx.compose.animation.b.e(AbstractC1671d.k(1.0f, 405.0f, null, 4), 2);
                    C1389g c1389g = C1385c.f15621x;
                    AbstractC1113a.d(zBooleanValue, null, c1598pE.a(androidx.compose.animation.b.d(AbstractC1671d.k(1.0f, 405.0f, null, 4), c1389g, new b6.k(15), 4)), androidx.compose.animation.b.f(AbstractC1671d.k(1.0f, 705.0f, null, 4), 2).a(androidx.compose.animation.b.m(AbstractC1671d.k(1.0f, 405.0f, null, 4), c1389g, new b6.k(16), 4)), null, n0.e.e(1343740266, new C1015e0(this.f13042q, this.f13043r, interfaceC0878b0, this.f13044s, this.f13045t, this.f13046u, this.f13047v, this.f13048w, this.f13049x, this.f13050y, this.f13051z, this.f13039A), c0912t), c0912t, 1572870, 18);
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pA2 = AbstractC1383a.a(androidx.compose.foundation.layout.c.f9203c, P.f12915s);
                    C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1330d, C1385c.f15608A, c0912t2, 6);
                    long j7 = c0912t2.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pA2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0351h c0351h2 = C0354j.f6019f;
                    C0879c.y(c0912t2, c0084zA2, c0351h2);
                    C0351h c0351h3 = C0354j.f6018e;
                    C0879c.y(c0912t2, interfaceC0906p0L2, c0351h3);
                    C0351h c0351h4 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t2, i8, c0351h4);
                    }
                    C0351h c0351h5 = C0354j.f6017d;
                    C0879c.y(c0912t2, interfaceC1398pC2, c0351h5);
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.a(c1395m, 0.437f), 1.0f);
                    O0.Z zD = AbstractC0074o.d(C1385c.f15612o, false);
                    long j8 = c0912t2.f11891T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t2, interfaceC1398pB);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD, c0351h2);
                    C0879c.y(c0912t2, interfaceC0906p0L3, c0351h3);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t2, i9, c0351h4);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC3, c0351h5);
                    System.out.getClass();
                    InterfaceC0878b0 interfaceC0878b02 = this.f13041p;
                    AbstractC1110d.n(n0.e.e(1499754255, new C1026k(interfaceC0878b02, 1), c0912t2), c0912t2, 6);
                    AbstractC1110d.n(n0.e.e(-1527272328, new C1017f0(interfaceC0878b02, this.f13042q, this.f13043r, this.f13044s, this.f13045t, this.f13046u, this.f13047v, this.f13048w, this.f13049x, this.f13050y, this.f13051z, this.f13039A, 0), c0912t2), c0912t2, 6);
                    c0912t2.p(true);
                    c0912t2.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
