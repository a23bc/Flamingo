package U5;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import D.o0;
import D.q0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import X.AbstractC0498r0;
import d0.H0;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import j5.AbstractC1109c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import u5.AbstractC1545g;

/* JADX INFO: renamed from: U5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0437i implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7237o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ String f7238p;

    public /* synthetic */ C0437i(String str, int i7) {
        this.f7237o = i7;
        this.f7238p = str;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7237o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    H0.b(AbstractC1545g.u0(this.f7238p).toString(), i6.h.l(C1395m.f15634a, 0.8f), 0L, AbstractC1109c.u(16), null, f1.n.f12014c, 0L, null, 0L, 0, false, 0, 0, null, c0912t, 3120, 0, 130996);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.a.i(C1395m.f15634a, 20, 0.0f, 2), 0.0f, 25, 1);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                    long j3 = c0912t2.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pI);
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
                    AbstractC0498r0.b(null, n0.e.e(1593238769, new C0437i(this.f7238p, 0), c0912t2), c0912t2, 48);
                    c0912t2.p(true);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    InterfaceC1398p interfaceC1398pL = i6.h.l(C1395m.f15634a, 0.4f);
                    q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t3, 48);
                    long j7 = c0912t3.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t3.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t3, interfaceC1398pL);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t3.b0();
                    if (c0912t3.f11890S) {
                        c0912t3.k(c0353i2);
                    } else {
                        c0912t3.l0();
                    }
                    C0879c.y(c0912t3, q0VarA, C0354j.f6019f);
                    C0879c.y(c0912t3, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t3, i8, c0351h2);
                    }
                    C0879c.y(c0912t3, interfaceC1398pC2, C0354j.f6017d);
                    H0.b(this.f7238p, null, 0L, AbstractC1109c.u(15), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t3, 3072, 0, 131062);
                    c0912t3.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
