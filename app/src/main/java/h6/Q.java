package h6;

import D.AbstractC0068i;
import D.AbstractC0074o;
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
import j5.AbstractC1109c;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12922p;

    public /* synthetic */ Q(InterfaceC1180a interfaceC1180a, int i7) {
        this.f12921o = i7;
        this.f12922p = interfaceC1180a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12921o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
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
                    C0879c.y(c0912t, c0084zA, c0351h);
                    C0351h c0351h2 = C0354j.f6018e;
                    C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
                    C0351h c0351h3 = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t, i7, c0351h3);
                    }
                    C0351h c0351h4 = C0354j.f6017d;
                    C0879c.y(c0912t, interfaceC1398pC, c0351h4);
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(AbstractC1383a.a(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), P.f12913q), 0.0f, 20, 0.0f, 0.0f, 13);
                    O0.Z zD = AbstractC0074o.d(C1385c.f15616s, false);
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
                    C0879c.y(c0912t, zD, c0351h);
                    C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t, i8, c0351h3);
                    }
                    C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
                    float f7 = (float) 2.25d;
                    InterfaceC1398p interfaceC1398pQ = j0.k.q(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.i(AbstractC1109c.v(c0912t, c1395m), 57, 4.8f), AbstractC1959I.c(1308622847), L.f.a(f7)), L.f.a(f7));
                    c0912t.X(-1390751509);
                    Object objK = c0912t.K();
                    if (objK == C0903o.f11850a) {
                        objK = n1.c.q(c0912t);
                    }
                    c0912t.p(false);
                    AbstractC0074o.a(androidx.compose.foundation.a.c(interfaceC1398pQ, (B.k) objK, null, false, this.f12922p, 28), c0912t, 0);
                    c0912t.p(true);
                    c0912t.p(true);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else if (!AbstractC1209k.a(this.f12922p.a(), "Lyric")) {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    c0912t2.X(-1390456757);
                    Object objK2 = c0912t2.K();
                    if (objK2 == C0903o.f11850a) {
                        objK2 = n1.c.q(c0912t2);
                    }
                    c0912t2.p(false);
                    AbstractC0074o.a(androidx.compose.foundation.a.c(fillElement, (B.k) objK2, null, false, new C1048w(0), 28), c0912t2, 0);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    M3.a.a(this.f12922p, c0912t3, 0);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
