package u6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import b1.C0615K;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import j5.AbstractC1110d;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1388f;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.InterfaceC1626w;

/* JADX INFO: loaded from: classes.dex */
public final class V implements l5.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ long f17526A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f17527B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ long f17528C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f17529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1388f f17533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d6.f f17534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f17535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f17537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f17538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b1.M f17539y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0615K f17540z;

    public V(boolean z6, InterfaceC0878b0 interfaceC0878b0, InterfaceC1182c interfaceC1182c, boolean z7, C1388f c1388f, d6.f fVar, boolean z8, boolean z9, int i7, long j3, b1.M m7, C0615K c0615k, long j7, boolean z10, long j8) {
        this.f17529o = z6;
        this.f17530p = interfaceC0878b0;
        this.f17531q = interfaceC1182c;
        this.f17532r = z7;
        this.f17533s = c1388f;
        this.f17534t = fVar;
        this.f17535u = z8;
        this.f17536v = z9;
        this.f17537w = i7;
        this.f17538x = j3;
        this.f17539y = m7;
        this.f17540z = c0615k;
        this.f17526A = j7;
        this.f17527B = z10;
        this.f17528C = j8;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1626w interfaceC1626w = (InterfaceC1626w) obj;
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f(interfaceC1626w, "$this$AnimatedVisibility");
        InterfaceC1398p interfaceC1398pA = interfaceC1626w.a(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), androidx.compose.animation.b.e(null, 3), androidx.compose.animation.b.f(null, 3));
        c0912t.X(-1277320285);
        boolean z6 = this.f17529o;
        boolean zG = c0912t.g(z6);
        InterfaceC0878b0 interfaceC0878b0 = this.f17530p;
        boolean zF = zG | c0912t.f(interfaceC0878b0);
        InterfaceC1182c interfaceC1182c = this.f17531q;
        boolean zF2 = zF | c0912t.f(interfaceC1182c);
        Object objK = c0912t.K();
        if (zF2 || objK == C0903o.f11850a) {
            objK = new I.s(2, interfaceC0878b0, interfaceC1182c, z6);
            c0912t.i0(objK);
        }
        c0912t.p(false);
        InterfaceC1398p interfaceC1398pE = androidx.compose.ui.layout.a.e(interfaceC1398pA, (InterfaceC1182c) objK);
        boolean z7 = this.f17532r;
        InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(interfaceC1398pE, 0.0f, z7 ? 0 : 7, 0.0f, z7 ? 7 : 0, 5);
        C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, this.f17533s, c0912t, 0);
        long j3 = c0912t.f11891T;
        int i7 = (int) (j3 ^ (j3 >>> 32));
        InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
        InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pJ);
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
        AbstractC1110d.n(n0.e.e(1880137753, new U(this.f17534t, this.f17535u, this.f17536v, this.f17529o, this.f17537w, this.f17538x, this.f17539y, this.f17540z, this.f17526A, this.f17527B, this.f17528C), c0912t), c0912t, 6);
        c0912t.p(true);
        return Y4.o.f8736a;
    }
}
