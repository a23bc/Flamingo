package h6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0058c;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import f0.C0879c;
import f0.C0886f0;
import f0.C0890h0;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1388f;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12792A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12793B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12794C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12795D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12796E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ Object f12797F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ Y4.c f12798G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12799H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12800o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12805t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12806u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f12807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f12809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12810y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12811z;

    public D0(InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, C0890h0 c0890h02, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, InterfaceC1182c interfaceC1182c, C0886f0 c0886f0, InterfaceC1180a interfaceC1180a, Context context, b6.k kVar, InterfaceC1180a interfaceC1180a2, InterfaceC1182c interfaceC1182c2, InterfaceC1180a interfaceC1180a3, InterfaceC1182c interfaceC1182c3, InterfaceC1180a interfaceC1180a4, InterfaceC1182c interfaceC1182c4, InterfaceC1180a interfaceC1180a5, InterfaceC1182c interfaceC1182c5, InterfaceC1180a interfaceC1180a6) {
        this.f12801p = interfaceC0878b0;
        this.f12802q = c0890h0;
        this.f12803r = c0890h02;
        this.f12804s = interfaceC0878b02;
        this.f12805t = interfaceC0878b03;
        this.f12806u = interfaceC1182c;
        this.f12807v = c0886f0;
        this.f12808w = interfaceC1180a;
        this.f12809x = context;
        this.f12797F = kVar;
        this.f12810y = interfaceC1180a2;
        this.f12811z = interfaceC1182c2;
        this.f12792A = interfaceC1180a3;
        this.f12793B = interfaceC1182c3;
        this.f12794C = interfaceC1180a4;
        this.f12798G = interfaceC1182c4;
        this.f12795D = interfaceC1180a5;
        this.f12799H = interfaceC1182c5;
        this.f12796E = interfaceC1180a6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12800o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b((InterfaceC1398p) this.f12797F, 1.0f), 0.0f, 0.0f, 0.0f, 15, 7);
                    C1388f c1388f = C1385c.f15609B;
                    C0058c c0058c = AbstractC0068i.f1329c;
                    C0084z c0084zA = AbstractC0082x.a(c0058c, c1388f, c0912t, 48);
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
                    System.out.getClass();
                    b6.k kVar = (b6.k) this.f12799H;
                    InterfaceC1182c interfaceC1182c = this.f12811z;
                    InterfaceC1180a interfaceC1180a = this.f12792A;
                    InterfaceC0878b0 interfaceC0878b0 = this.f12801p;
                    C0890h0 c0890h0 = this.f12802q;
                    C0890h0 c0890h02 = this.f12803r;
                    InterfaceC0878b0 interfaceC0878b02 = this.f12804s;
                    InterfaceC0878b0 interfaceC0878b03 = this.f12805t;
                    InterfaceC1182c interfaceC1182c2 = this.f12806u;
                    C0886f0 c0886f0 = this.f12807v;
                    InterfaceC1180a interfaceC1180a2 = this.f12808w;
                    Context context = this.f12809x;
                    AbstractC1110d.n(n0.e.e(1400346119, new C1044t0(interfaceC0878b0, c0890h0, c0890h02, interfaceC0878b02, interfaceC0878b03, interfaceC1182c2, c0886f0, interfaceC1180a2, context, kVar, this.f12810y, interfaceC1182c, interfaceC1180a, this.f12793B, this.f12794C), c0912t), c0912t, 6);
                    InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(C1395m.f15634a, 25, 0.0f, 2);
                    C0084z c0084zA2 = AbstractC0082x.a(c0058c, C1385c.f15608A, c0912t, 0);
                    long j7 = c0912t.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pI);
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, c0084zA2, c0351h);
                    C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t, i8, c0351h3);
                    }
                    C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
                    AbstractC1110d.n(n0.e.e(1661772541, new C0(context, interfaceC1180a2, 0), c0912t), c0912t, 6);
                    AbstractC1110d.n(n0.e.e(-506773772, new R.j(this.f12795D, this.f12796E, (InterfaceC1180a) this.f12798G, 4), c0912t), c0912t, 6);
                    c0912t.p(true);
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    AbstractC1110d.n(n0.e.e(332809315, new v0(this.f12801p, this.f12802q, this.f12803r, this.f12804s, this.f12805t, this.f12806u, this.f12807v, 1), c0912t2), c0912t2, 6);
                    AbstractC1110d.n(n0.e.e(2081934106, new U5.H(this.f12807v, this.f12802q, this.f12804s, this.f12805t, this.f12808w, this.f12809x, (b6.k) this.f12797F, this.f12801p), c0912t2), c0912t2, 6);
                    AbstractC1110d.n(n0.e.e(1171054363, new A0(this.f12804s, this.f12805t, this.f12810y, this.f12809x, this.f12811z, this.f12792A, this.f12793B, this.f12794C, (InterfaceC1182c) this.f12798G, this.f12795D, this.f12799H, this.f12796E), c0912t2), c0912t2, 6);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public D0(InterfaceC1398p interfaceC1398p, InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, C0890h0 c0890h02, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, InterfaceC1182c interfaceC1182c, C0886f0 c0886f0, InterfaceC1180a interfaceC1180a, Context context, b6.k kVar, InterfaceC1180a interfaceC1180a2, InterfaceC1182c interfaceC1182c2, InterfaceC1180a interfaceC1180a3, InterfaceC1182c interfaceC1182c3, InterfaceC1180a interfaceC1180a4, InterfaceC1180a interfaceC1180a5, InterfaceC1180a interfaceC1180a6, InterfaceC1180a interfaceC1180a7) {
        this.f12797F = interfaceC1398p;
        this.f12801p = interfaceC0878b0;
        this.f12802q = c0890h0;
        this.f12803r = c0890h02;
        this.f12804s = interfaceC0878b02;
        this.f12805t = interfaceC0878b03;
        this.f12806u = interfaceC1182c;
        this.f12807v = c0886f0;
        this.f12808w = interfaceC1180a;
        this.f12809x = context;
        this.f12799H = kVar;
        this.f12810y = interfaceC1180a2;
        this.f12811z = interfaceC1182c2;
        this.f12792A = interfaceC1180a3;
        this.f12793B = interfaceC1182c3;
        this.f12794C = interfaceC1180a4;
        this.f12795D = interfaceC1180a5;
        this.f12796E = interfaceC1180a6;
        this.f12798G = interfaceC1180a7;
    }
}
