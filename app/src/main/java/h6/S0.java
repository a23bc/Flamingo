package h6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import d0.AbstractC0774A;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1420a;
import y0.AbstractC1959I;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z0 f12937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f12938q;

    public /* synthetic */ S0(Z0 z02, Z0 z03, int i7) {
        this.f12936o = i7;
        this.f12937p = z02;
        this.f12938q = z03;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f12936o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((d0.D0) obj, "it");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    M3.a.w(new d0.B0(new C1420a(0.0f, ((Number) this.f12937p.getValue()).floatValue())), null, ((n1.g) this.f12938q.getValue()).f14511o, c0912t, 0);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0912t2.g(zBooleanValue) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C1390h c1390h = C1385c.f15616s;
                    C1395m c1395m = C1395m.f15634a;
                    if (zBooleanValue) {
                        c0912t2.X(-1752623709);
                        InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 22);
                        O0.Z zD = AbstractC0074o.d(c1390h, false);
                        long j3 = c0912t2.f11891T;
                        int i7 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                        InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pC);
                        InterfaceC0355k.f6047i.getClass();
                        C0353i c0353i = C0354j.f6015b;
                        c0912t2.b0();
                        if (c0912t2.f11890S) {
                            c0912t2.k(c0353i);
                        } else {
                            c0912t2.l0();
                        }
                        C0879c.y(c0912t2, zD, C0354j.f6019f);
                        C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
                        C0351h c0351h = C0354j.f6020g;
                        if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i7))) {
                            n1.c.w(i7, c0912t2, i7, c0351h);
                        }
                        C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
                        AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_dolby_atmos, c0912t2), "dolby_atmos", i6.h.l(AbstractC1109c.v(c0912t2, androidx.compose.foundation.layout.c.c(c1395m, 19)), 0.45f), 0L, c0912t2, 48, 8);
                        c0912t2.p(true);
                        c0912t2.p(false);
                    } else {
                        boolean zBooleanValue2 = ((Boolean) this.f12937p.getValue()).booleanValue();
                        Z0 z02 = this.f12938q;
                        if (zBooleanValue2 || ((Boolean) z02.getValue()).booleanValue()) {
                            c0912t2.X(-1751843005);
                            float f7 = 20;
                            InterfaceC1398p interfaceC1398pC3 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), f7);
                            O0.Z zD2 = AbstractC0074o.d(c1390h, false);
                            long j7 = c0912t2.f11891T;
                            int i8 = (int) (j7 ^ (j7 >>> 32));
                            InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                            InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t2, interfaceC1398pC3);
                            InterfaceC0355k.f6047i.getClass();
                            C0353i c0353i2 = C0354j.f6015b;
                            c0912t2.b0();
                            if (c0912t2.f11890S) {
                                c0912t2.k(c0353i2);
                            } else {
                                c0912t2.l0();
                            }
                            C0351h c0351h2 = C0354j.f6019f;
                            C0879c.y(c0912t2, zD2, c0351h2);
                            C0351h c0351h3 = C0354j.f6018e;
                            C0879c.y(c0912t2, interfaceC0906p0L2, c0351h3);
                            C0351h c0351h4 = C0354j.f6020g;
                            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                                n1.c.w(i8, c0912t2, i8, c0351h4);
                            }
                            C0351h c0351h5 = C0354j.f6017d;
                            C0879c.y(c0912t2, interfaceC1398pC4, c0351h5);
                            float f8 = 5;
                            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.b(AbstractC1109c.v(c0912t2, c1395m), AbstractC1959I.c(352321535), AbstractC1109c.i(f8, null, 6)), f7), 7, 0.0f, 2);
                            O0.Z zD3 = AbstractC0074o.d(c1390h, false);
                            long j8 = c0912t2.f11891T;
                            int i9 = (int) (j8 ^ (j8 >>> 32));
                            InterfaceC0906p0 interfaceC0906p0L3 = c0912t2.l();
                            InterfaceC1398p interfaceC1398pC5 = AbstractC1383a.c(c0912t2, interfaceC1398pI);
                            c0912t2.b0();
                            if (c0912t2.f11890S) {
                                c0912t2.k(c0353i2);
                            } else {
                                c0912t2.l0();
                            }
                            C0879c.y(c0912t2, zD3, c0351h2);
                            C0879c.y(c0912t2, interfaceC0906p0L3, c0351h3);
                            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                                n1.c.w(i9, c0912t2, i9, c0351h4);
                            }
                            C0879c.y(c0912t2, interfaceC1398pC5, c0351h5);
                            D.q0 q0VarA = D.o0.a(AbstractC0068i.f1331e, C1385c.f15622y, c0912t2, 54);
                            long j9 = c0912t2.f11891T;
                            int i10 = (int) (j9 ^ (j9 >>> 32));
                            InterfaceC0906p0 interfaceC0906p0L4 = c0912t2.l();
                            InterfaceC1398p interfaceC1398pC6 = AbstractC1383a.c(c0912t2, c1395m);
                            c0912t2.b0();
                            if (c0912t2.f11890S) {
                                c0912t2.k(c0353i2);
                            } else {
                                c0912t2.l0();
                            }
                            C0879c.y(c0912t2, q0VarA, c0351h2);
                            C0879c.y(c0912t2, interfaceC0906p0L4, c0351h3);
                            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                                n1.c.w(i10, c0912t2, i10, c0351h4);
                            }
                            C0879c.y(c0912t2, interfaceC1398pC6, c0351h5);
                            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_quality_lossless, c0912t2), "quality_lossless", i6.h.l(androidx.compose.foundation.layout.c.c(c1395m, 9), 0.45f), 0L, c0912t2, 432, 8);
                            AbstractC0060d.d(c0912t2, androidx.compose.foundation.layout.c.k(c1395m, f8));
                            AbstractC1110d.n(n0.e.e(511685873, new R.n(7, z02), c0912t2), c0912t2, 6);
                            c0912t2.p(true);
                            c0912t2.p(true);
                            c0912t2.p(true);
                            c0912t2.p(false);
                        } else {
                            c0912t2.X(-1749580811);
                            c0912t2.p(false);
                        }
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
