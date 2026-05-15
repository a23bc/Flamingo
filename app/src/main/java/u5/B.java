package U5;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0076q;
import D.C0084z;
import I.C0211c;
import M.C0254d;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import d.C0746L;
import f0.C0879c;
import f0.C0888g0;
import f0.C0890h0;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import h6.C1007a0;
import h6.C1025j0;
import h6.C1027k0;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w.C1670c;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1987t;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class B implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7060o = 0;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC0878b0 f7061p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0878b0 f7062q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Z0 f7063r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f7064s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f7065t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f7066u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f7067v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f7068w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Z0 f7069x;

    public B(Z0 z02, T4.l lVar, InterfaceC0878b0 interfaceC0878b0, Context context, InterfaceC0878b0 interfaceC0878b02, InterfaceC1765B interfaceC1765B, C0211c c0211c, y3.x xVar, C0888g0 c0888g0) {
        this.f7063r = z02;
        this.f7064s = lVar;
        this.f7061p = interfaceC0878b0;
        this.f7065t = context;
        this.f7062q = interfaceC0878b02;
        this.f7066u = interfaceC1765B;
        this.f7067v = c0211c;
        this.f7068w = xVar;
        this.f7069x = c0888g0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj3 = this.f7067v;
        Object obj4 = this.f7066u;
        Object obj5 = this.f7068w;
        Object obj6 = this.f7065t;
        Z0 z02 = this.f7069x;
        Z0 z03 = this.f7063r;
        f0.W w7 = C0903o.f11850a;
        Object obj7 = this.f7064s;
        C1395m c1395m = C1395m.f15634a;
        switch (this.f7060o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    long jB = t6.a.b(AbstractC1959I.d(4294309365L), C1987t.f20255b, c0912t);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    O0.Z zD = AbstractC0074o.d(C1385c.f15619v, false);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
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
                    if (((Boolean) z03.getValue()).booleanValue() || !SettingsLibrary.INSTANCE.getBarBlurEffect()) {
                        c0912t.X(398763817);
                        AbstractC0060d.d(c0912t, androidx.compose.foundation.a.a(i6.h.E(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 128), C0746L.D(8, Z4.o.e0(new C1987t(C1987t.f20261i), new C1987t(C1987t.b(jB, 0.3f)), new C1987t(C1987t.b(jB, 0.6f)), new C1987t(jB), new C1987t(jB), new C1987t(jB), new C1987t(jB), new C1987t(jB))), null, 6));
                        c0912t.p(false);
                    } else {
                        c0912t.X(396106373);
                        InterfaceC1398p interfaceC1398pA = dev.chrisbanes.haze.a.a(androidx.compose.ui.graphics.a.a(i6.h.E(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 128), new F.g(22)), (T4.l) obj7, T4.m.a(new T4.m(jB, C1987t.b(jB, ((double) AbstractC1959I.o(jB)) >= 0.5d ? 0.73f : 0.8f), 24, 8), 0L, 0L, 48, 11));
                        c0912t.X(151362790);
                        boolean zE = c0912t.e(jB);
                        Object objK = c0912t.K();
                        if (zE || objK == w7) {
                            objK = new C0254d(jB, 2);
                            c0912t.i0(objK);
                        }
                        c0912t.p(false);
                        AbstractC0060d.d(c0912t, androidx.compose.ui.draw.a.b(interfaceC1398pA, (InterfaceC1182c) objK));
                        c0912t.p(false);
                    }
                    c0912t.X(151461273);
                    InterfaceC0878b0 interfaceC0878b0 = this.f7061p;
                    boolean zF = c0912t.f(interfaceC0878b0);
                    Object objK2 = c0912t.K();
                    if (zF || objK2 == w7) {
                        objK2 = new F.m(interfaceC0878b0, 8);
                        c0912t.i0(objK2);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
                    c0912t.p(false);
                    c0912t.X(151465700);
                    Context context = (Context) obj6;
                    boolean zF2 = c0912t.f(interfaceC0878b0) | c0912t.f(context);
                    InterfaceC0878b0 interfaceC0878b02 = this.f7062q;
                    InterfaceC1765B interfaceC1765B = (InterfaceC1765B) obj4;
                    C0211c c0211c = (C0211c) obj3;
                    y3.x xVar = (y3.x) obj5;
                    boolean zF3 = zF2 | c0912t.f(interfaceC0878b02) | c0912t.h(interfaceC1765B) | c0912t.f(c0211c) | c0912t.h(xVar);
                    Object objK3 = c0912t.K();
                    if (zF3 || objK3 == w7) {
                        objK3 = new C0076q(interfaceC0878b0, context, interfaceC0878b02, interfaceC1765B, xVar, c0211c, 1);
                        c0912t.i0(objK3);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK3;
                    c0912t.p(false);
                    List listE0 = Z4.o.e0(new v6.i(I0.c.S(R.string.page_home_title, c0912t), R.drawable.flamingo_icon), new v6.i(I0.c.S(R.string.page_library_title, c0912t), R.drawable.ic_uitabbar_library));
                    c0912t.X(151552674);
                    Object objK4 = c0912t.K();
                    if (objK4 == w7) {
                        objK4 = new C0452y((C0888g0) z02, 0);
                        c0912t.i0(objK4);
                    }
                    c0912t.p(false);
                    j0.k.a(interfaceC1180a, interfaceC1182c, listE0, androidx.compose.ui.layout.a.f(c1395m, (InterfaceC1182c) objK4), c0912t, 3072);
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                    long j7 = c0912t2.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, fillElement2);
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
                    C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
                    System.out.getClass();
                    c0912t2.X(-1389826323);
                    C1670c c1670c = (C1670c) obj7;
                    boolean zH = c0912t2.h(c1670c);
                    Object objK5 = c0912t2.K();
                    if (zH || objK5 == w7) {
                        objK5 = new C1025j0(c1670c, z03, z02, 1);
                        c0912t2.i0(objK5);
                    }
                    c0912t2.p(false);
                    InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.graphics.a.a(c1395m, (InterfaceC1182c) objK5);
                    c0912t2.X(-1389847496);
                    C0894j0 c0894j0 = (C0894j0) obj6;
                    boolean zF4 = c0912t2.f(c0894j0);
                    Object objK6 = c0912t2.K();
                    if (zF4 || objK6 == w7) {
                        objK6 = new C1027k0(c0894j0, 1);
                        c0912t2.i0(objK6);
                    }
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK6;
                    c0912t2.p(false);
                    c0912t2.X(-1389845287);
                    InterfaceC0878b0 interfaceC0878b03 = this.f7061p;
                    boolean zF5 = c0912t2.f(interfaceC0878b03);
                    Object objK7 = c0912t2.K();
                    if (zF5 || objK7 == w7) {
                        objK7 = new F.m(interfaceC0878b03, 25);
                        c0912t2.i0(objK7);
                    }
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK7;
                    c0912t2.p(false);
                    c0912t2.X(-1389842887);
                    InterfaceC0878b0 interfaceC0878b04 = this.f7062q;
                    boolean zF6 = c0912t2.f(interfaceC0878b04);
                    Object objK8 = c0912t2.K();
                    if (zF6 || objK8 == w7) {
                        objK8 = new F.m(interfaceC0878b04, 26);
                        c0912t2.i0(objK8);
                    }
                    InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) objK8;
                    c0912t2.p(false);
                    c0912t2.X(-1389840478);
                    C0890h0 c0890h0 = (C0890h0) obj5;
                    boolean zF7 = c0912t2.f(interfaceC0878b03) | c0912t2.f(c0890h0);
                    Object objK9 = c0912t2.K();
                    if (zF7 || objK9 == w7) {
                        objK9 = new C1007a0(interfaceC0878b03, c0890h0, 7);
                        c0912t2.i0(objK9);
                    }
                    c0912t2.p(false);
                    M3.a.f(interfaceC1398pA2, interfaceC1180a2, interfaceC1180a3, interfaceC1180a4, (Z5.b) obj4, (Z5.c) obj3, (InterfaceC1180a) objK9, c0912t2, 0);
                    c0912t2.p(true);
                }
                break;
        }
        return oVar;
    }

    public B(C1670c c1670c, C0894j0 c0894j0, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, Z5.b bVar, Z5.c cVar, C0890h0 c0890h0, Z0 z02, Z0 z03) {
        this.f7064s = c1670c;
        this.f7065t = c0894j0;
        this.f7061p = interfaceC0878b0;
        this.f7062q = interfaceC0878b02;
        this.f7066u = bVar;
        this.f7067v = cVar;
        this.f7068w = c0890h0;
        this.f7063r = z02;
        this.f7069x = z03;
    }
}
