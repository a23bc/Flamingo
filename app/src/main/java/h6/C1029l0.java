package h6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0081w;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import f0.C0879c;
import f0.C0890h0;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.C1670c;

/* JADX INFO: renamed from: h6.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1029l0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0081w f13092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f13093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1670c f13094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0894j0 f13095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z5.b f13097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z5.c f13098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Z0 f13101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Z0 f13102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13103z;

    public C1029l0(C0081w c0081w, float f7, C1670c c1670c, C0894j0 c0894j0, InterfaceC0878b0 interfaceC0878b0, Z5.b bVar, Z5.c cVar, InterfaceC0878b0 interfaceC0878b02, C0890h0 c0890h0, Z0 z02, Z0 z03, InterfaceC1180a interfaceC1180a) {
        this.f13092o = c0081w;
        this.f13093p = f7;
        this.f13094q = c1670c;
        this.f13095r = c0894j0;
        this.f13096s = interfaceC0878b0;
        this.f13097t = bVar;
        this.f13098u = cVar;
        this.f13099v = interfaceC0878b02;
        this.f13100w = c0890h0;
        this.f13101x = z02;
        this.f13102y = z03;
        this.f13103z = interfaceC1180a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            C0081w c0081w = this.f13092o;
            float fA = c0081w.a();
            float f7 = this.f13093p;
            float f8 = 2.3f * f7;
            InterfaceC1398p interfaceC1398pA = AbstractC1383a.a(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.a.j(c1395m, Float.compare(fA, f8) > 0 ? ((c0081w.a() - f8) / 2) + f7 : f7, 0.0f, 0.0f, 0.0f, 14), 1.0f), f7 * 1.3f), 1.0f), new D.C0(3));
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
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
            System.out.getClass();
            c0912t.X(-1390495251);
            C1670c c1670c = this.f13094q;
            boolean zH = c0912t.h(c1670c);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (zH || objK == w7) {
                objK = new C1025j0(c1670c, this.f13101x, this.f13102y, 0);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.graphics.a.a(c1395m, (InterfaceC1182c) objK);
            c0912t.X(-1390515688);
            C0894j0 c0894j0 = this.f13095r;
            boolean zF = c0912t.f(c0894j0);
            Object objK2 = c0912t.K();
            if (zF || objK2 == w7) {
                objK2 = new C1027k0(c0894j0, 0);
                c0912t.i0(objK2);
            }
            InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
            c0912t.p(false);
            c0912t.X(-1390513319);
            InterfaceC0878b0 interfaceC0878b0 = this.f13096s;
            boolean zF2 = c0912t.f(interfaceC0878b0);
            Object objK3 = c0912t.K();
            if (zF2 || objK3 == w7) {
                objK3 = new F.m(interfaceC0878b0, 20);
                c0912t.i0(objK3);
            }
            InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK3;
            c0912t.p(false);
            c0912t.X(-1390510910);
            InterfaceC0878b0 interfaceC0878b02 = this.f13099v;
            boolean zF3 = c0912t.f(interfaceC0878b02);
            C0890h0 c0890h0 = this.f13100w;
            boolean zF4 = zF3 | c0912t.f(c0890h0);
            Object objK4 = c0912t.K();
            if (zF4 || objK4 == w7) {
                objK4 = new C1007a0(interfaceC0878b02, c0890h0, 3);
                c0912t.i0(objK4);
            }
            c0912t.p(false);
            M3.a.g(interfaceC1398pA2, interfaceC1180a, interfaceC1180a2, this.f13093p, this.f13097t, this.f13098u, (InterfaceC1180a) objK4, c0912t, 0);
            c0912t.p(true);
            AbstractC1110d.n(n0.e.e(-585101066, new Q(this.f13103z, 1), c0912t), c0912t, 6);
        }
        return Y4.o.f8736a;
    }
}
