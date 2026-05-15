package X;

import D.AbstractC0060d;
import D.C0058c;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0906p0;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: X.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0472e implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f8053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f8054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f8055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0494p f8056r;

    public C0472e(long j3, boolean z6, InterfaceC1398p interfaceC1398p, InterfaceC0494p interfaceC0494p) {
        this.f8053o = j3;
        this.f8054p = z6;
        this.f8055q = interfaceC1398p;
        this.f8056r = interfaceC0494p;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j3 = this.f8053o;
            f0.W w7 = C0903o.f11850a;
            final InterfaceC0494p interfaceC0494p = this.f8056r;
            boolean z6 = this.f8054p;
            if (j3 != 9205357640488583168L) {
                c0912t.X(3458246);
                C0058c c0058c = z6 ? AbstractC0060d.f1305b : AbstractC0060d.f1304a;
                InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.layout.c.f(this.f8055q, n1.i.b(j3), n1.i.a(j3), 0.0f, 0.0f, 12);
                D.q0 q0VarA = D.o0.a(c0058c, C1385c.f15621x, c0912t, 0);
                long j7 = c0912t.f11891T;
                int i7 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pF);
                InterfaceC0355k.f6047i.getClass();
                C0353i c0353i = C0354j.f6015b;
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, q0VarA, C0354j.f6019f);
                C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                C0351h c0351h = C0354j.f6020g;
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                    n1.c.w(i7, c0912t, i7, c0351h);
                }
                C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                C1395m c1395m = C1395m.f15634a;
                boolean zH = c0912t.h(interfaceC0494p);
                Object objK = c0912t.K();
                if (zH || objK == w7) {
                    final int i8 = 0;
                    objK = new InterfaceC1180a() { // from class: X.d
                        @Override // l5.InterfaceC1180a
                        public final Object a() {
                            switch (i8) {
                                case 0:
                                    return Boolean.valueOf((interfaceC0494p.b() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((interfaceC0494p.b() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    c0912t.i0(objK);
                }
                AbstractC0498r0.e(c1395m, (InterfaceC1180a) objK, z6, c0912t, 6);
                c0912t.p(true);
                c0912t.p(false);
            } else {
                c0912t.X(4389176);
                boolean zH2 = c0912t.h(interfaceC0494p);
                Object objK2 = c0912t.K();
                if (zH2 || objK2 == w7) {
                    final int i9 = 1;
                    objK2 = new InterfaceC1180a() { // from class: X.d
                        @Override // l5.InterfaceC1180a
                        public final Object a() {
                            switch (i9) {
                                case 0:
                                    return Boolean.valueOf((interfaceC0494p.b() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((interfaceC0494p.b() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    c0912t.i0(objK2);
                }
                AbstractC0498r0.e(this.f8055q, (InterfaceC1180a) objK2, z6, c0912t, 0);
                c0912t.p(false);
            }
        } else {
            c0912t.Q();
        }
        return Y4.o.f8736a;
    }
}
