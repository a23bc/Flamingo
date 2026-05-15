package i6;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0084z;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1388f;
import r0.C1395m;
import r0.InterfaceC1398p;
import u6.C1554a0;
import u6.C1556b0;
import u6.E0;
import w.AbstractC1671d;
import w.AbstractC1674g;
import w.S;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class l implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f13544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f13545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13546r;

    public /* synthetic */ l(Object obj, Object obj2, long j3, int i7) {
        this.f13543o = i7;
        this.f13545q = obj;
        this.f13546r = obj2;
        this.f13544p = j3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13543o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                    c0912t.X(284159567);
                    Object objK = c0912t.K();
                    W w7 = C0903o.f11850a;
                    if (objK == w7) {
                        objK = n1.c.q(c0912t);
                    }
                    B.k kVar = (B.k) objK;
                    c0912t.p(false);
                    c0912t.X(284160912);
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f13545q;
                    boolean zF = c0912t.f(interfaceC1182c);
                    Object objK2 = c0912t.K();
                    if (zF || objK2 == w7) {
                        objK2 = new h6.W(interfaceC1182c, 3);
                        c0912t.i0(objK2);
                    }
                    c0912t.p(false);
                    InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.a.c(interfaceC1398pB, kVar, null, false, (InterfaceC1180a) objK2, 28);
                    Z zD = AbstractC0074o.d(C1385c.f15612o, false);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pC);
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
                    C0879c.y(c0912t, interfaceC1398pC2, C0354j.f6017d);
                    S s7 = new S(0.7f, 340.0f, Float.valueOf(1.0E-4f));
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f13546r;
                    AbstractC1113a.c(((Boolean) interfaceC0878b0.getValue()).booleanValue(), androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 0.0f, ((n1.d) c0912t.j(AbstractC0403q0.h)).k0(Float.intBitsToFloat((int) (4294967295L & this.f13544p))) + 10, 0.0f, 0.0f, 13), androidx.compose.animation.b.e(s7, 2).a(androidx.compose.animation.b.g(0.618f, AbstractC1959I.h(0.95f, 0.0f), s7)), androidx.compose.animation.b.f(s7, 2).a(androidx.compose.animation.b.i(0.618f, AbstractC1959I.h(0.95f, 0.0f), s7)), null, n0.e.e(2021368633, new k(AbstractC1674g.b(((Boolean) interfaceC0878b0.getValue()).booleanValue() ? 225.0f : 0.0f, ((Boolean) interfaceC0878b0.getValue()).booleanValue() ? AbstractC1671d.l(300, 430, null, 4) : AbstractC1671d.l(0, 0, null, 6), 0.0f, null, c0912t, 0, 28)), c0912t), c0912t, 196608, 16);
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    float f7 = 16;
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.j(C1395m.f15634a, f7, 0.0f, f7, 0.0f, 10), 0.0f, 10, 0.0f, 25, 5);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, (C1388f) this.f13545q, c0912t2, 0);
                    long j7 = c0912t2.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t2, interfaceC1398pJ);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, c0084zA, C0354j.f6019f);
                    C0879c.y(c0912t2, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t2, i8, c0351h2);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC3, C0354j.f6017d);
                    c0912t2.X(-663127547);
                    d6.f fVar = (d6.f) this.f13546r;
                    boolean zF2 = c0912t2.f(fVar);
                    Object objK3 = c0912t2.K();
                    W w8 = C0903o.f11850a;
                    if (zF2 || objK3 == w8) {
                        objK3 = new C1554a0(fVar, 0);
                        c0912t2.i0(objK3);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK3;
                    c0912t2.p(false);
                    long j8 = fVar.f11292q - fVar.f11291p;
                    c0912t2.X(-663112518);
                    long j9 = this.f13544p;
                    boolean zE = c0912t2.e(j9);
                    Object objK4 = c0912t2.K();
                    if (zE || objK4 == w8) {
                        objK4 = new C1556b0(j9);
                        c0912t2.i0(objK4);
                    }
                    c0912t2.p(false);
                    E0.b(interfaceC1180a, j8, (InterfaceC1180a) objK4, c0912t2, 0);
                    c0912t2.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
