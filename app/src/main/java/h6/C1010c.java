package h6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import androidx.compose.foundation.layout.LayoutWeightElement;
import d0.AbstractC0774A;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import j5.AbstractC1107a;
import j5.AbstractC1110d;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.C1614k;
import yos.music.player.R;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: h6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1010c implements l5.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1010c f13001p = new C1010c(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1010c f13002q = new C1010c(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1010c f13003r = new C1010c(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1010c f13004s = new C1010c(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13005o;

    public /* synthetic */ C1010c(int i7) {
        this.f13005o = i7;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f13005o) {
            case 0:
                YosMediaItem yosMediaItem = (YosMediaItem) obj2;
                C0912t c0912t = (C0912t) obj3;
                ((Number) obj4).intValue();
                AbstractC1209k.f((C1614k) obj, "$this$AnimatedContent");
                C1395m c1395m = C1395m.f15634a;
                InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                D.q0 q0VarA = D.o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t, 48);
                long j3 = c0912t.f11891T;
                int i7 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pB);
                InterfaceC0355k.f6047i.getClass();
                C0353i c0353i = C0354j.f6015b;
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0351h c0351h = C0354j.f6019f;
                C0879c.y(c0912t, q0VarA, c0351h);
                C0351h c0351h2 = C0354j.f6018e;
                C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
                C0351h c0351h3 = C0354j.f6020g;
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                    n1.c.w(i7, c0912t, i7, c0351h3);
                }
                C0351h c0351h4 = C0354j.f6017d;
                C0879c.y(c0912t, interfaceC1398pC, c0351h4);
                InterfaceC1398p interfaceC1398pB2 = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                if (1.0f <= 0.0d) {
                    E.a.a("invalid weight; must be greater than zero");
                }
                InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(interfaceC1398pB2.f(new LayoutWeightElement(1.0f, true)), 0.0f, 0.0f, 5, 0.0f, 11);
                C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
                long j7 = c0912t.f11891T;
                int i8 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pJ);
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, c0084zA, c0351h);
                C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                    n1.c.w(i8, c0912t, i8, c0351h3);
                }
                C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
                AbstractC1107a.d(null, AbstractC1107a.n(c0912t), n0.e.e(255574503, new C1006a(yosMediaItem, 0), c0912t), c0912t, 384);
                AbstractC1107a.d(null, AbstractC1107a.n(c0912t), n0.e.e(683485328, new C1006a(yosMediaItem, 1), c0912t), c0912t, 384);
                c0912t.p(true);
                AbstractC1110d.n(n0.e.e(-1385298650, new V5.j(yosMediaItem, 1), c0912t), c0912t, 6);
                c0912t.p(true);
                break;
            case 1:
                YosMediaItem yosMediaItem2 = (YosMediaItem) obj2;
                C0912t c0912t2 = (C0912t) obj3;
                ((Number) obj4).intValue();
                AbstractC1209k.f((C1614k) obj, "$this$AnimatedContent");
                C1395m c1395m2 = C1395m.f15634a;
                InterfaceC1398p interfaceC1398pB3 = androidx.compose.foundation.layout.c.b(c1395m2, 1.0f);
                D.q0 q0VarA2 = D.o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t2, 48);
                long j8 = c0912t2.f11891T;
                int i9 = (int) (j8 ^ (j8 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L3 = c0912t2.l();
                InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t2, interfaceC1398pB3);
                InterfaceC0355k.f6047i.getClass();
                C0353i c0353i2 = C0354j.f6015b;
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0912t2.k(c0353i2);
                } else {
                    c0912t2.l0();
                }
                C0351h c0351h5 = C0354j.f6019f;
                C0879c.y(c0912t2, q0VarA2, c0351h5);
                C0351h c0351h6 = C0354j.f6018e;
                C0879c.y(c0912t2, interfaceC0906p0L3, c0351h6);
                C0351h c0351h7 = C0354j.f6020g;
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                    n1.c.w(i9, c0912t2, i9, c0351h7);
                }
                C0351h c0351h8 = C0354j.f6017d;
                C0879c.y(c0912t2, interfaceC1398pC3, c0351h8);
                InterfaceC1398p interfaceC1398pB4 = androidx.compose.foundation.layout.c.b(c1395m2, 1.0f);
                if (1.0f <= 0.0d) {
                    E.a.a("invalid weight; must be greater than zero");
                }
                InterfaceC1398p interfaceC1398pJ2 = androidx.compose.foundation.layout.a.j(interfaceC1398pB4.f(new LayoutWeightElement(1.0f, true)), 0.0f, 0.0f, 5, 0.0f, 11);
                C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                long j9 = c0912t2.f11891T;
                int i10 = (int) (j9 ^ (j9 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L4 = c0912t2.l();
                InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t2, interfaceC1398pJ2);
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0912t2.k(c0353i2);
                } else {
                    c0912t2.l0();
                }
                C0879c.y(c0912t2, c0084zA2, c0351h5);
                C0879c.y(c0912t2, interfaceC0906p0L4, c0351h6);
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                    n1.c.w(i10, c0912t2, i10, c0351h7);
                }
                C0879c.y(c0912t2, interfaceC1398pC4, c0351h8);
                AbstractC1107a.d(null, AbstractC1107a.n(c0912t2), n0.e.e(852421203, new C1006a(yosMediaItem2, 2), c0912t2), c0912t2, 384);
                AbstractC1107a.d(null, AbstractC1107a.n(c0912t2), n0.e.e(139297226, new C1006a(yosMediaItem2, 3), c0912t2), c0912t2, 384);
                c0912t2.p(true);
                AbstractC1110d.n(n0.e.e(-1938829836, new V5.j(yosMediaItem2, 2), c0912t2), c0912t2, 6);
                c0912t2.p(true);
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C0912t c0912t3 = (C0912t) obj3;
                ((Number) obj4).intValue();
                AbstractC1209k.f((C1614k) obj, "$this$AnimatedContent");
                C1395m c1395m3 = C1395m.f15634a;
                if (zBooleanValue) {
                    c0912t3.X(386630330);
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_pause, c0912t3), "Pause", androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.f9203c, 10), 0L, c0912t3, 432, 8);
                    c0912t3.p(false);
                } else {
                    c0912t3.X(387124439);
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_play, c0912t3), "Play", androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.g(c1395m3, 56.0f), 9), 2, 0.0f, 0.0f, 0.0f, 14), 0L, c0912t3, 432, 8);
                    c0912t3.p(false);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                C0912t c0912t4 = (C0912t) obj3;
                ((Number) obj4).intValue();
                AbstractC1209k.f((C1614k) obj, "$this$AnimatedContent");
                C1395m c1395m4 = C1395m.f15634a;
                if (zBooleanValue2) {
                    c0912t4.X(-618007528);
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_pause, c0912t4), "Pause", androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.f9203c, 10), 0L, c0912t4, 432, 8);
                    c0912t4.p(false);
                } else {
                    c0912t4.X(-617513450);
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_play, c0912t4), "Play", androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.g(c1395m4, 49), 9), 2, 0.0f, 0.0f, 0.0f, 14), 0L, c0912t4, 432, 8);
                    c0912t4.p(false);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
