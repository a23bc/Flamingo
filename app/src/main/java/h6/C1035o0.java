package h6;

import D.AbstractC0074o;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.InterfaceC1626w;

/* JADX INFO: renamed from: h6.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1035o0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f13141o;

    public C1035o0(float f7) {
        this.f13141o = f7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
        InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.a(C1395m.f15634a, 1.0f), this.f13141o * 1.3f), 1.0f);
        O0.Z zD = AbstractC0074o.d(C1385c.f15616s, false);
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
        C0879c.y(c0912t, zD, C0354j.f6019f);
        C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
        C0351h c0351h = C0354j.f6020g;
        if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
            n1.c.w(i7, c0912t, i7, c0351h);
        }
        C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
        c0912t.p(true);
        return Y4.o.f8736a;
    }
}
