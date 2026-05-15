package u6;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0084z;
import D.InterfaceC0064f;
import H.C0177t;
import M.AbstractC0267l;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import d0.AbstractC0805u;
import d0.C0803s;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0906p0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1388f;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.C1965O;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17551o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f17552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f17553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f17555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f17556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y4.c f17557u;

    public Z(InterfaceC0064f interfaceC0064f, InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, long j3, C1388f c1388f, n0.d dVar) {
        this.f17555s = interfaceC0064f;
        this.f17552p = interfaceC1398p;
        this.f17554r = interfaceC1180a;
        this.f17553q = j3;
        this.f17556t = c1388f;
        this.f17557u = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t;
        C1395m c1395m;
        boolean z6;
        switch (this.f17551o) {
            case 0:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f);
                    D.q0 q0VarA = D.o0.a((InterfaceC0064f) this.f17555s, C1385c.f15621x, c0912t2, 0);
                    long j3 = c0912t2.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pB);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0351h c0351h = C0354j.f6019f;
                    C0879c.y(c0912t2, q0VarA, c0351h);
                    C0351h c0351h2 = C0354j.f6018e;
                    C0879c.y(c0912t2, interfaceC0906p0L, c0351h2);
                    C0351h c0351h3 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t2, i7, c0351h3);
                    }
                    C0351h c0351h4 = C0354j.f6017d;
                    C0879c.y(c0912t2, interfaceC1398pC, c0351h4);
                    c0912t2.X(1126246127);
                    InterfaceC1180a interfaceC1180a = this.f17554r;
                    boolean zF = c0912t2.f(interfaceC1180a);
                    long j7 = this.f17553q;
                    boolean zE = zF | c0912t2.e(j7);
                    Object objK = c0912t2.K();
                    if (zE || objK == C0903o.f11850a) {
                        objK = new C0177t(2, j7, interfaceC1180a);
                        c0912t2.i0(objK);
                    }
                    c0912t2.p(false);
                    InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.ui.graphics.a.a(this.f17552p, (InterfaceC1182c) objK), 0.0f, 3, 1);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, (C1388f) this.f17556t, c0912t2, 0);
                    long j8 = c0912t2.f11891T;
                    int i8 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pI);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, c0084zA, c0351h);
                    C0879c.y(c0912t2, interfaceC0906p0L2, c0351h2);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t2, i8, c0351h3);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC2, c0351h4);
                    ((n0.d) this.f17557u).invoke(c0912t2, 0);
                    c0912t2.p(true);
                    c0912t2.p(true);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    float f7 = 10;
                    InterfaceC1398p interfaceC1398pC3 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.b(this.f17552p, C1987t.b(t6.a.b(C1987t.f20258e, C1987t.f20256c, c0912t3), 0.25f), L.f.a(f7)), 44);
                    D.q0 q0VarA2 = D.o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t3, 48);
                    long j9 = c0912t3.f11891T;
                    int i9 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t3.l();
                    InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t3, interfaceC1398pC3);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t3.b0();
                    if (c0912t3.f11890S) {
                        c0912t3.k(c0353i2);
                    } else {
                        c0912t3.l0();
                    }
                    C0351h c0351h5 = C0354j.f6019f;
                    C0879c.y(c0912t3, q0VarA2, c0351h5);
                    C0351h c0351h6 = C0354j.f6018e;
                    C0879c.y(c0912t3, interfaceC0906p0L3, c0351h6);
                    C0351h c0351h7 = C0354j.f6020g;
                    if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t3, i9, c0351h7);
                    }
                    C0351h c0351h8 = C0354j.f6017d;
                    C0879c.y(c0912t3, interfaceC1398pC4, c0351h8);
                    C1395m c1395m2 = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pI2 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), f7, 0.0f, 2);
                    O0.Z zD = AbstractC0074o.d(C1385c.f15612o, false);
                    long j10 = c0912t3.f11891T;
                    int i10 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L4 = c0912t3.l();
                    InterfaceC1398p interfaceC1398pC5 = AbstractC1383a.c(c0912t3, interfaceC1398pI2);
                    c0912t3.b0();
                    if (c0912t3.f11890S) {
                        c0912t3.k(c0353i2);
                    } else {
                        c0912t3.l0();
                    }
                    C0879c.y(c0912t3, zD, c0351h5);
                    C0879c.y(c0912t3, interfaceC0906p0L4, c0351h6);
                    if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i10))) {
                        n1.c.w(i10, c0912t3, i10, c0351h7);
                    }
                    C0879c.y(c0912t3, interfaceC1398pC5, c0351h8);
                    c0912t3.X(1195891133);
                    String str = (String) this.f17555s;
                    int length = str.length();
                    long j11 = this.f17553q;
                    if (length == 0) {
                        z6 = false;
                        c1395m = c1395m2;
                        Y.u.a((String) this.f17556t, i6.h.l(c1395m2, 0.6f), 0L, j11, 0L, 0L, 2, false, 1, 0, null, c0912t3, 3120);
                        c0912t = c0912t3;
                    } else {
                        c0912t = c0912t3;
                        c1395m = c1395m2;
                        z6 = false;
                    }
                    c0912t.p(z6);
                    b1.M m7 = new b1.M(t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t), j11, null, 0L, 0, 0L, null, 0, 16777212);
                    c0912t.X(1195913972);
                    InterfaceC1180a interfaceC1180a2 = this.f17554r;
                    boolean zF2 = c0912t.f(interfaceC1180a2);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == C0903o.f11850a) {
                        objK2 = new X.s0(interfaceC1180a2, 5);
                        c0912t.i0(objK2);
                    }
                    c0912t.p(z6);
                    M.X x6 = new M.X((InterfaceC1182c) objK2, 47);
                    C0912t c0912t4 = c0912t;
                    AbstractC0267l.a(str, (InterfaceC1182c) this.f17557u, androidx.compose.foundation.layout.c.b(c1395m, 1.0f), false, m7, new M.Y(115), x6, true, 0, 0, null, null, new C1965O(((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11095a), null, c0912t4, 102236544);
                    c0912t4.p(true);
                    c0912t4.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public Z(InterfaceC1398p interfaceC1398p, String str, String str2, long j3, InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c) {
        this.f17552p = interfaceC1398p;
        this.f17555s = str;
        this.f17556t = str2;
        this.f17553q = j3;
        this.f17554r = interfaceC1180a;
        this.f17557u = interfaceC1182c;
    }
}
