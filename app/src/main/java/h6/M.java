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
import f0.C0903o;
import f0.C0912t;
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
import w.AbstractC1671d;
import w.AbstractC1674g;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class M implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f12890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12893t;

    public /* synthetic */ M(int i7, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1180a interfaceC1180a4, InterfaceC1398p interfaceC1398p) {
        this.f12888o = i7;
        this.f12889p = interfaceC1180a;
        this.f12890q = interfaceC1398p;
        this.f12891r = interfaceC1180a2;
        this.f12892s = interfaceC1180a3;
        this.f12893t = interfaceC1180a4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12888o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    System.out.getClass();
                    C1395m c1395m = C1395m.f15634a;
                    AbstractC0060d.d(c0912t, i6.h.J(c1395m, 110));
                    InterfaceC1180a interfaceC1180a = this.f12889p;
                    Z0 z0B = AbstractC1674g.b(((Boolean) interfaceC1180a.a()).booleanValue() ? 0.0f : 0.6f, AbstractC1671d.k(1.0f, ((Boolean) interfaceC1180a.a()).booleanValue() ? 405.0f : 105.0f, null, 4), 0.0f, null, c0912t, 0, 28);
                    L l = new L(0);
                    d6.g gVar = new d6.g(I0.c.S(R.string.tip_no_lyrics, c0912t), 4091);
                    c0912t.X(-1473249761);
                    boolean zF = c0912t.f(z0B);
                    Object objK = c0912t.K();
                    if (zF || objK == C0903o.f11850a) {
                        objK = new K(z0B, 0);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    u6.E0.f(this.f12891r, new C1048w(1), l, this.f12892s, new C1048w(2), gVar, this.f12889p, androidx.compose.ui.draw.a.b(c1395m, (InterfaceC1182c) objK).f(this.f12890q), null, false, 0.0f, false, null, null, this.f12893t, c0912t, 24624, 48, 14080);
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
                    AbstractC1110d.n(n0.e.e(256890726, new M(0, this.f12889p, this.f12891r, this.f12892s, this.f12893t, this.f12890q), c0912t2), c0912t2, 6);
                    c0912t2.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
