package h6;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0450w;
import U5.C0452y;
import android.content.Context;
import f0.C0879c;
import f0.C0888g0;
import f0.C0890h0;
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
import yos.music.player.data.libraries.SettingsLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: h6.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1033n0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13127o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13134v;

    public C1033n0(InterfaceC1180a interfaceC1180a, InterfaceC0878b0 interfaceC0878b0, InterfaceC1182c interfaceC1182c, InterfaceC0878b0 interfaceC0878b02, C0890h0 c0890h0, InterfaceC0878b0 interfaceC0878b03, C0888g0 c0888g0) {
        this.f13128p = interfaceC1180a;
        this.f13129q = interfaceC0878b0;
        this.f13132t = interfaceC1182c;
        this.f13130r = interfaceC0878b02;
        this.f13133u = c0890h0;
        this.f13131s = interfaceC0878b03;
        this.f13134v = c0888g0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13127o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 50, 0.0f, 0.0f, 13);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
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
                    c0912t.X(-1492056989);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    InterfaceC0878b0 interfaceC0878b0 = this.f13129q;
                    if (objK == w7) {
                        objK = new F.m(interfaceC0878b0, 23);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    M3.a.d(c1395m, (InterfaceC1180a) objK, this.f13128p, false, c0912t, 25014, 0);
                    AbstractC1110d.a((YosMediaItem) interfaceC0878b0.getValue(), androidx.compose.foundation.layout.a.j(c1395m, 9.5f, 0.0f, 32, 0.0f, 10), new b6.k(18), null, null, null, AbstractC1014e.f13017a, c0912t, 1573248, 56);
                    c0912t.p(true);
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                    O0.Z zD = AbstractC0074o.d(C1385c.f15612o, false);
                    long j7 = c0912t.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pB);
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, zD, c0351h);
                    C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t, i8, c0351h3);
                    }
                    C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
                    System.out.getClass();
                    InterfaceC1398p interfaceC1398pJ2 = androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 12, 0.0f, 0.0f, 13);
                    c0912t.X(-1491919756);
                    InterfaceC0878b0 interfaceC0878b02 = this.f13130r;
                    boolean zF = c0912t.f(interfaceC0878b02);
                    C0890h0 c0890h0 = (C0890h0) this.f13133u;
                    boolean zF2 = zF | c0912t.f(c0890h0);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == w7) {
                        objK2 = new C1007a0(interfaceC0878b02, c0890h0, 5);
                        c0912t.i0(objK2);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
                    c0912t.p(false);
                    c0912t.X(-1491907014);
                    boolean zF3 = c0912t.f(interfaceC0878b02) | c0912t.f(c0890h0);
                    Object objK3 = c0912t.K();
                    if (zF3 || objK3 == w7) {
                        objK3 = new C1009b0(interfaceC0878b02, c0890h0, 1);
                        c0912t.i0(objK3);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK3;
                    c0912t.p(false);
                    c0912t.X(-1491887440);
                    boolean zF4 = c0912t.f(interfaceC0878b02) | c0912t.f(c0890h0);
                    Object objK4 = c0912t.K();
                    if (zF4 || objK4 == w7) {
                        objK4 = new C1007a0(interfaceC0878b02, c0890h0, 6);
                        c0912t.i0(objK4);
                    }
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK4;
                    c0912t.p(false);
                    b6.k kVar = new b6.k(19);
                    c0912t.X(-1491856322);
                    InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) this.f13131s;
                    boolean zF5 = c0912t.f(interfaceC0878b03);
                    Object objK5 = c0912t.K();
                    if (zF5 || objK5 == w7) {
                        objK5 = new F.m(interfaceC0878b03, 24);
                        c0912t.i0(objK5);
                    }
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK5;
                    c0912t.p(false);
                    c0912t.X(-1491853179);
                    boolean zF6 = c0912t.f(interfaceC0878b03);
                    Object objK6 = c0912t.K();
                    if (zF6 || objK6 == w7) {
                        objK6 = new M.t0(interfaceC0878b03, 11);
                        c0912t.i0(objK6);
                    }
                    InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objK6;
                    c0912t.p(false);
                    c0912t.X(-1491845159);
                    C0888g0 c0888g0 = (C0888g0) this.f13134v;
                    boolean zF7 = c0912t.f(c0888g0);
                    Object objK7 = c0912t.K();
                    if (zF7 || objK7 == w7) {
                        objK7 = new X(c0888g0, 1);
                        c0912t.i0(objK7);
                    }
                    InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) objK7;
                    c0912t.p(false);
                    c0912t.X(-1491842258);
                    boolean zF8 = c0912t.f(c0888g0);
                    Object objK8 = c0912t.K();
                    if (zF8 || objK8 == w7) {
                        objK8 = new C0452y(c0888g0, 3);
                        c0912t.i0(objK8);
                    }
                    InterfaceC1182c interfaceC1182c3 = (InterfaceC1182c) objK8;
                    c0912t.p(false);
                    c0912t.X(-1491869056);
                    boolean zF9 = c0912t.f(interfaceC0878b02) | c0912t.f(c0890h0);
                    Object objK9 = c0912t.K();
                    if (zF9 || objK9 == w7) {
                        objK9 = new C1007a0(interfaceC0878b02, c0890h0, 4);
                        c0912t.i0(objK9);
                    }
                    InterfaceC1180a interfaceC1180a5 = (InterfaceC1180a) objK9;
                    c0912t.p(false);
                    c0912t.X(-1491835788);
                    boolean zF10 = c0912t.f(interfaceC0878b03) | c0912t.f(c0888g0);
                    Object objK10 = c0912t.K();
                    if (zF10 || objK10 == w7) {
                        objK10 = new C1013d0(interfaceC0878b03, c0888g0, null, 1);
                        c0912t.i0(objK10);
                    }
                    c0912t.p(false);
                    M3.a.l(this.f13128p, (InterfaceC1182c) this.f13132t, interfaceC1180a, interfaceC1182c, interfaceC1180a2, kVar, interfaceC1180a3, interfaceC1182c2, interfaceC1180a4, interfaceC1182c3, interfaceC1180a5, (InterfaceC1182c) objK10, interfaceC1398pJ2, c0912t, 196608);
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    c0912t2.X(803258615);
                    Object objK11 = c0912t2.K();
                    f0.W w8 = C0903o.f11850a;
                    if (objK11 == w8) {
                        objK11 = C0879c.o(new I.L(this.f13128p, 7));
                        c0912t2.i0(objK11);
                    }
                    Z0 z02 = (Z0) objK11;
                    c0912t2.p(false);
                    boolean nowplayingBackgroundEffect = SettingsLibrary.INSTANCE.getNowplayingBackgroundEffect();
                    InterfaceC0878b0 interfaceC0878b04 = this.f13129q;
                    if (nowplayingBackgroundEffect) {
                        c0912t2.X(-868509290);
                        c0912t2.X(803266279);
                        Object objK12 = c0912t2.K();
                        if (objK12 == w8) {
                            objK12 = C0879c.t("Init");
                            c0912t2.i0(objK12);
                        }
                        c0912t2.p(false);
                        AbstractC1110d.n(n0.e.e(1388411201, new C0450w((InterfaceC1180a) this.f13131s, (InterfaceC1398p) this.f13132t, this.f13129q, (InterfaceC1180a) this.f13133u, this.f13130r, (InterfaceC0878b0) objK12), c0912t2), c0912t2, 6);
                        c0912t2.p(false);
                    } else {
                        c0912t2.X(-866054493);
                        AbstractC1110d.n(n0.e.e(-228912950, new R.j(interfaceC0878b04, (InterfaceC1398p) this.f13132t, this.f13130r), c0912t2), c0912t2, 6);
                        c0912t2.p(false);
                    }
                    AbstractC1110d.n(n0.e.e(-1665411802, new R.j(z02, this.f13134v, interfaceC0878b04, 8), c0912t2), c0912t2, 6);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public C1033n0(InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1398p interfaceC1398p, InterfaceC0878b0 interfaceC0878b0, InterfaceC1180a interfaceC1180a3, InterfaceC0878b0 interfaceC0878b02, Context context) {
        this.f13128p = interfaceC1180a;
        this.f13131s = interfaceC1180a2;
        this.f13132t = interfaceC1398p;
        this.f13129q = interfaceC0878b0;
        this.f13133u = interfaceC1180a3;
        this.f13130r = interfaceC0878b02;
        this.f13134v = context;
    }
}
