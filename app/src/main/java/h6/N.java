package h6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import androidx.compose.foundation.layout.FillElement;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class N implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f12897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f12898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12901t;

    public /* synthetic */ N(float f7, InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, int i7) {
        this.f12896o = i7;
        this.f12897p = f7;
        this.f12898q = interfaceC1398p;
        this.f12899r = interfaceC1180a;
        this.f12900s = interfaceC1180a2;
        this.f12901t = interfaceC1180a3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12896o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    System.out.getClass();
                    C1395m c1395m = C1395m.f15634a;
                    AbstractC0060d.d(c0912t, i6.h.J(c1395m, 40));
                    b1.M m7 = u6.E0.h;
                    L l = new L(1);
                    d6.g gVar = new d6.g(I0.c.S(R.string.tip_no_lyrics, c0912t), 4091);
                    float f7 = (this.f12897p - 54) / 2;
                    u6.E0.f(this.f12899r, new C1048w(3), l, this.f12900s, new C1048w(4), gVar, new C1048w(5), androidx.compose.ui.draw.a.b(c1395m, new b6.k(11)).f(this.f12898q), new n1.g(f7), true, 0.0f, true, m7, null, this.f12901t, c0912t, 806903856, 432, 9216);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    System.out.getClass();
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                    long j3 = c0912t2.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, fillElement);
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
                    AbstractC1110d.n(n0.e.e(-1727005949, new N(this.f12897p, this.f12898q, this.f12899r, this.f12900s, this.f12901t, 0), c0912t2), c0912t2, 6);
                    c0912t2.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
