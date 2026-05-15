package D;

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

/* JADX INFO: loaded from: classes.dex */
public final class M implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.d f1253p;

    public /* synthetic */ M(int i7, n0.d dVar) {
        this.f1252o = i7;
        this.f1253p = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1252o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f1253p.d(U.f1275a, c0912t, 6);
                } else {
                    c0912t.Q();
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    this.f1253p.d(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), c0912t2, 6);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    this.f1253p.d(C1395m.f15634a, c0912t3, 6);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    this.f1253p.d(C1395m.f15634a, c0912t4, 6);
                }
                break;
            default:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 26);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t5, 0);
                    long j3 = c0912t5.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t5.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t5, interfaceC1398pG);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t5.b0();
                    if (c0912t5.f11890S) {
                        c0912t5.k(c0353i);
                    } else {
                        c0912t5.l0();
                    }
                    C0879c.y(c0912t5, c0084zA, C0354j.f6019f);
                    C0879c.y(c0912t5, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t5.f11890S || !AbstractC1209k.a(c0912t5.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t5, i7, c0351h);
                    }
                    C0879c.y(c0912t5, interfaceC1398pC, C0354j.f6017d);
                    this.f1253p.d(A.f1206a, c0912t5, 6);
                    c0912t5.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
