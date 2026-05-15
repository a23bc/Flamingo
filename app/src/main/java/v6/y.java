package v6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import E0.C0095f;
import F.C0130c;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class y implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f18498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f18499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f18500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0095f f18501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f18502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z0 f18503u;

    public /* synthetic */ y(int i7, C0095f c0095f, Z0 z02, String str, String str2, InterfaceC1180a interfaceC1180a, boolean z6) {
        this.f18497o = i7;
        this.f18498p = z6;
        this.f18499q = str;
        this.f18500r = str2;
        this.f18501s = c0095f;
        this.f18502t = interfaceC1180a;
        this.f18503u = z02;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f18497o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((G.j) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, c1395m);
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
                    AbstractC0060d.d(c0912t, i6.h.J(c1395m, 0));
                    if (this.f18498p) {
                        c0912t.X(-219069336);
                        AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.c(c1395m, 8));
                        c0912t.p(false);
                    } else {
                        c0912t.X(-219371121);
                        AbstractC1110d.k(this.f18499q, this.f18500r, this.f18501s, this.f18502t, this.f18503u, true, c0912t, 196608);
                        c0912t.p(false);
                    }
                    c0912t.p(true);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C1395m c1395m2 = C1395m.f15634a;
                    C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                    long j7 = c0912t2.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, c1395m2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, c0084zA2, C0354j.f6019f);
                    C0879c.y(c0912t2, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t2, i8, c0351h2);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
                    AbstractC0060d.d(c0912t2, i6.h.J(c1395m2, 0));
                    if (this.f18498p) {
                        c0912t2.X(1907827088);
                        AbstractC0060d.d(c0912t2, androidx.compose.foundation.layout.c.c(c1395m2, 8));
                        c0912t2.p(false);
                    } else {
                        c0912t2.X(1907524342);
                        AbstractC1110d.k(this.f18499q, this.f18500r, this.f18501s, this.f18502t, this.f18503u, false, c0912t2, 196608);
                        c0912t2.p(false);
                    }
                    c0912t2.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
