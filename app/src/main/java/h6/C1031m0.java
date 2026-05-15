package h6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0058c;
import D.C0081w;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import androidx.compose.foundation.layout.LayoutWeightElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1109c;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1388f;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.C1670c;
import yos.music.player.R;

/* JADX INFO: renamed from: h6.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1031m0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1670c f13111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0081w f13112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f13113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1670c f13114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z0 f13115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z0 f13116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13118v;

    public C1031m0(C1670c c1670c, C0081w c0081w, float f7, C1670c c1670c2, Z0 z02, Z0 z03, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02) {
        this.f13111o = c1670c;
        this.f13112p = c0081w;
        this.f13113q = f7;
        this.f13114r = c1670c2;
        this.f13115s = z02;
        this.f13116t = z03;
        this.f13117u = interfaceC0878b0;
        this.f13118v = interfaceC0878b02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        float f7;
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1670c c1670c = this.f13111o;
            if (((Number) c1670c.e()).floatValue() != 0.0f) {
                c0912t.X(971167191);
                Object objK = c0912t.K();
                f0.W w7 = C0903o.f11850a;
                if (objK == w7) {
                    objK = b6.i.f10422b;
                    c0912t.i0(objK);
                }
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
                c0912t.p(false);
                C1395m c1395m = C1395m.f15634a;
                C0081w c0081w = this.f13112p;
                float fA = c0081w.a();
                float f8 = this.f13113q;
                float f9 = 2.3f * f8;
                InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(AbstractC1383a.a(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.a.j(c1395m, Float.compare(fA, f9) > 0 ? ((c0081w.a() - f9) / 2) + f8 : f8, 0.0f, 0.0f, 0.0f, 14), 1.0f), f8 * 1.3f), 1.0f), new D.C0(3)), 0.0f, 50, 0.0f, 0.0f, 13);
                c0912t.X(971189001);
                boolean zH = c0912t.h(c1670c);
                C1670c c1670c2 = this.f13114r;
                boolean zH2 = zH | c0912t.h(c1670c2);
                Object objK2 = c0912t.K();
                if (zH2 || objK2 == w7) {
                    f7 = 1.0f;
                    G.u uVar = new G.u(c1670c, this.f13115s, this.f13116t, c1670c2, 5);
                    c0912t.i0(uVar);
                    objK2 = uVar;
                } else {
                    f7 = 1.0f;
                }
                c0912t.p(false);
                InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pJ, (InterfaceC1182c) objK2);
                C0058c c0058c = AbstractC0068i.f1329c;
                C1388f c1388f = C1385c.f15608A;
                C0084z c0084zA = AbstractC0082x.a(c0058c, c1388f, c0912t, 0);
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
                C0351h c0351h = C0354j.f6019f;
                C0879c.y(c0912t, c0084zA, c0351h);
                C0351h c0351h2 = C0354j.f6018e;
                C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
                C0351h c0351h3 = C0354j.f6020g;
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                    n1.c.w(i7, c0912t, i7, c0351h3);
                }
                C0351h c0351h4 = C0354j.f6017d;
                C0879c.y(c0912t, interfaceC1398pC, c0351h4);
                InterfaceC1398p interfaceC1398pC2 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m, f7), 30, 0.0f, 2), 0.0f, 10, 0.0f, 0.0f, 13), 65);
                D.q0 q0VarA = D.o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t, 48);
                long j7 = c0912t.f11891T;
                int i8 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t, interfaceC1398pC2);
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, q0VarA, c0351h);
                C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                    n1.c.w(i8, c0912t, i8, c0351h3);
                }
                C0879c.y(c0912t, interfaceC1398pC3, c0351h4);
                InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                if (1.0f <= 0.0d) {
                    E.a.a("invalid weight; must be greater than zero");
                }
                InterfaceC1398p interfaceC1398pF = interfaceC1398pB.f(new LayoutWeightElement(1.0f, true));
                C0084z c0084zA2 = AbstractC0082x.a(c0058c, c1388f, c0912t, 0);
                long j8 = c0912t.f11891T;
                int i9 = (int) (j8 ^ (j8 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L3 = c0912t.l();
                InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t, interfaceC1398pF);
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, c0084zA2, c0351h);
                C0879c.y(c0912t, interfaceC0906p0L3, c0351h2);
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                    n1.c.w(i9, c0912t, i9, c0351h3);
                }
                C0879c.y(c0912t, interfaceC1398pC4, c0351h4);
                String strS = I0.c.S(R.string.page_library_playlists, c0912t);
                long jT = AbstractC1109c.t(16.5d);
                f1.k kVar = f1.k.f12003u;
                d0.H0.b(strS, c1395m, 0L, jT, kVar, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, 199728, 0, 131028);
                List list = (List) interfaceC0878b0.getValue();
                d0.H0.b(I0.c.T(R.string.page_library_playlists_music_total, new Object[]{Integer.valueOf(list != null ? list.size() : 0)}, c0912t), i6.h.l(AbstractC1109c.v(c0912t, androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 2, 0.0f, 0.0f, 13)), 0.35f), 0L, AbstractC1109c.u(15), kVar, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, 199680, 0, 131028);
                c0912t.p(true);
                c0912t.p(true);
                c0912t.X(-1390321408);
                InterfaceC0878b0 interfaceC0878b02 = this.f13117u;
                boolean zF = c0912t.f(interfaceC0878b02);
                Object objK3 = c0912t.K();
                if (zF || objK3 == w7) {
                    objK3 = new F.m(interfaceC0878b02, 21);
                    c0912t.i0(objK3);
                }
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK3;
                Object objR = n1.c.r(-1390318498, c0912t, false);
                if (objR == w7) {
                    objR = new F.m(this.f13118v, 22);
                    c0912t.i0(objR);
                }
                c0912t.p(false);
                M3.a.n(interfaceC0878b0, interfaceC1180a, (InterfaceC1180a) objR, c0912t, 3126);
                c0912t.p(true);
            }
        }
        return Y4.o.f8736a;
    }
}
