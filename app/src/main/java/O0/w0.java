package O0;

import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.InterfaceC1398p;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0306f0 f5465a = new C0306f0(5);

    public static final void a(n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(441837433);
        if (c0912t.N(i7 & 1, (i7 & 3) != 2)) {
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = new W();
                c0912t.i0(objK);
            }
            W w8 = (W) objK;
            Object objK2 = c0912t.K();
            if (objK2 == w7) {
                objK2 = C0314k.f5407r;
                c0912t.i0(objK2);
            }
            InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            if (c0912t.f11890S) {
                c0912t.b(Y4.o.f8736a, new b1.x(4));
            }
            C0879c.y(c0912t, w8, C0316m.f5414r);
            dVar.d(w8, c0912t, 48);
            c0912t.p(true);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new X(dVar, i7, 0);
        }
    }

    public static final void b(A0 a0, InterfaceC1398p interfaceC1398p, l5.e eVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(-511989831);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.h(a0) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(eVar) ? 256 : 128;
        }
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            f0.r rVarW = C0879c.w(c0912t);
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            C0353i c0353i = C0353i.f6010r;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, a0, a0.f5280c);
            C0879c.y(c0912t, rVarW, a0.f5281d);
            C0879c.y(c0912t, eVar, a0.f5282e);
            InterfaceC0355k.f6047i.getClass();
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h);
            }
            c0912t.p(true);
            if (c0912t.z()) {
                c0912t.X(-1259216055);
                c0912t.p(false);
            } else {
                c0912t.X(-1259274676);
                boolean zH = c0912t.h(a0);
                Object objK = c0912t.K();
                if (zH || objK == C0903o.f11850a) {
                    objK = new E0.K(5, a0);
                    c0912t.i0(objK);
                }
                C0879c.g((InterfaceC1180a) objK, c0912t);
                c0912t.p(false);
            }
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new v0(a0, interfaceC1398p, eVar, i7, 0);
        }
    }

    public static final void c(InterfaceC1398p interfaceC1398p, l5.e eVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(-1298353104);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(eVar) ? 32 : 16;
        }
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = new A0(C0306f0.f5390p);
                c0912t.i0(objK);
            }
            b((A0) objK, interfaceC1398p, eVar, c0912t, (i8 << 3) & 1008);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new u0(interfaceC1398p, eVar, i7, 0);
        }
    }

    public static final float d(long j3, long j7) {
        return Math.min(Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float e(O0.l0 r6, boolean r7, O0.C0324v[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.c(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.w0.e(O0.l0, boolean, O0.v[], float):float");
    }

    public static final C1893c f(C c7) {
        C cJ = c7.j();
        return cJ != null ? cJ.m(c7, true) : new C1893c(0.0f, 0.0f, (int) (c7.G() >> 32), (int) (c7.G() & 4294967295L));
    }

    public static final C1893c g(C c7) {
        C cI = i(c7);
        float fG = (int) (cI.G() >> 32);
        float fG2 = (int) (cI.G() & 4294967295L);
        C1893c c1893cM = cI.m(c7, true);
        float f7 = c1893cM.f19869a;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > fG) {
            f7 = fG;
        }
        float f8 = c1893cM.f19870b;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > fG2) {
            f8 = fG2;
        }
        float f9 = c1893cM.f19871c;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 <= fG) {
            fG = f9;
        }
        float f10 = c1893cM.f19872d;
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 <= fG2) {
            fG2 = f11;
        }
        if (f7 == fG || f8 == fG2) {
            return C1893c.f19868e;
        }
        long jH = cI.h((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L));
        long jH2 = cI.h((((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (((long) Float.floatToRawIntBits(fG)) << 32));
        long jH3 = cI.h((((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fG2)) & 4294967295L));
        long jH4 = cI.h((((long) Float.floatToRawIntBits(fG2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jH4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jH3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jH2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jH4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (4294967295L & jH3));
        return new C1893c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean h(long j3, long j7) {
        return j3 == j7;
    }

    public static final C i(C c7) {
        C c8;
        C cJ = c7.j();
        while (true) {
            C c9 = cJ;
            c8 = c7;
            c7 = c9;
            if (c7 == null) {
                break;
            }
            cJ = c7.j();
        }
        Q0.j0 j0Var = c8 instanceof Q0.j0 ? (Q0.j0) c8 : null;
        if (j0Var == null) {
            return c8;
        }
        Q0.j0 j0Var2 = j0Var.f6028G;
        while (true) {
            Q0.j0 j0Var3 = j0Var2;
            Q0.j0 j0Var4 = j0Var;
            j0Var = j0Var3;
            if (j0Var == null) {
                return j0Var4;
            }
            j0Var2 = j0Var.f6028G;
        }
    }

    public static final Q0.U j(Q0.U u7) {
        Q0.K kV = u7.f5888C.f6024C;
        while (true) {
            Q0.K kV2 = kV.v();
            if ((kV2 != null ? kV2.f5837v : null) == null) {
                Q0.U uH0 = kV.f5821T.f6003d.H0();
                AbstractC1209k.c(uH0);
                return uH0;
            }
            Q0.K kV3 = kV.v();
            Q0.K k7 = kV3 != null ? kV3.f5837v : null;
            AbstractC1209k.c(k7);
            if (k7.f5836u) {
                kV = kV.v();
                AbstractC1209k.c(kV);
            } else {
                Q0.K kV4 = kV.v();
                AbstractC1209k.c(kV4);
                kV = kV4.f5837v;
                AbstractC1209k.c(kV);
            }
        }
    }

    public static final n0.d k(InterfaceC1398p interfaceC1398p) {
        return new n0.d(-511438721, new F(0, interfaceC1398p), true);
    }

    public static final long l(long j3, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
