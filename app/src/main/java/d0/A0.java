package d0;

import e0.AbstractC0843h;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import r5.C1420a;
import r5.C1422c;
import r5.C1423d;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 {
    static {
        i6.g.d(AbstractC0843h.f11436b, AbstractC0843h.f11435a);
        float f7 = AbstractC0843h.f11438d;
        float f8 = AbstractC0843h.f11437c;
    }

    public static final void a(float f7, InterfaceC1182c interfaceC1182c, InterfaceC1398p interfaceC1398p, boolean z6, InterfaceC1180a interfaceC1180a, p0 p0Var, B.k kVar, n0.d dVar, n0.d dVar2, C1420a c1420a, C0912t c0912t, int i7) {
        B.k kVar2;
        boolean z7;
        boolean z8;
        B.k kVar3;
        c0912t.Z(1191170377);
        int i8 = i7 | (c0912t.c(f7) ? 4 : 2) | (c0912t.h(interfaceC1182c) ? 32 : 16) | (c0912t.f(interfaceC1398p) ? 256 : 128) | 3072 | (c0912t.h(interfaceC1180a) ? 16384 : 8192) | (c0912t.f(p0Var) ? 131072 : 65536) | 14155776;
        char c7 = c0912t.f(c1420a) ? (char) 4 : (char) 2;
        if ((306783379 & i8) == 306783378 && (c7 & 3) == 2 && c0912t.z()) {
            c0912t.Q();
            z8 = z6;
            kVar3 = kVar;
        } else {
            c0912t.S();
            int i9 = i7 & 1;
            f0.W w7 = C0903o.f11850a;
            if (i9 == 0 || c0912t.x()) {
                c0912t.Y(-1537039109);
                Object objK = c0912t.K();
                if (objK == w7) {
                    objK = n1.c.q(c0912t);
                }
                c0912t.p(false);
                kVar2 = (B.k) objK;
                z7 = true;
            } else {
                c0912t.Q();
                z7 = z6;
                kVar2 = kVar;
            }
            c0912t.q();
            InterfaceC0878b0 interfaceC0878b0X = C0879c.x(interfaceC1180a, c0912t);
            c0912t.Y(-1537038451);
            boolean z9 = (((c7 & 14) ^ 6) > 4 && c0912t.f(c1420a)) || (c7 & 6) == 4;
            Object objK2 = c0912t.K();
            if (z9 || objK2 == w7) {
                objK2 = new D0(f7, new c0.u(interfaceC0878b0X, 1), c1420a);
                c0912t.i0(objK2);
            }
            D0 d02 = (D0) objK2;
            c0912t.p(false);
            d02.f10836d = interfaceC1182c;
            d02.c(f7);
            boolean z10 = z7;
            b(d02, interfaceC1398p, z10, null, kVar2, dVar, dVar2, c0912t, ((i8 >> 3) & 1008) | 1794048);
            z8 = z10;
            kVar3 = kVar2;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new t0(f7, interfaceC1182c, interfaceC1398p, z8, interfaceC1180a, p0Var, kVar3, dVar, dVar2, c1420a, i7);
        }
    }

    public static final void b(D0 d02, InterfaceC1398p interfaceC1398p, boolean z6, p0 p0Var, B.k kVar, n0.d dVar, n0.d dVar2, C0912t c0912t, int i7) {
        int i8;
        int i9;
        p0 p0Var2;
        p0 p0Var3;
        c0912t.Z(-1303883986);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(d02) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.g(z6) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t.f(kVar) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0912t.h(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= c0912t.h(dVar2) ? 1048576 : 524288;
        }
        if ((599187 & i8) == 599186 && c0912t.z()) {
            c0912t.Q();
            p0Var3 = p0Var;
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                c0912t.Y(1376295968);
                p0 p0VarB = r0.b((C0803s) c0912t.j(AbstractC0805u.f11147a));
                c0912t.p(false);
                i9 = i8 & (-7169);
                p0Var2 = p0VarB;
            } else {
                c0912t.Q();
                i9 = i8 & (-7169);
                p0Var2 = p0Var;
            }
            c0912t.q();
            int i10 = i9 >> 3;
            c(interfaceC1398p, d02, z6, kVar, dVar, dVar2, c0912t, (i9 & 896) | (i10 & 14) | ((i9 << 3) & 112) | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
            p0Var3 = p0Var2;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new s0(d02, interfaceC1398p, z6, p0Var3, kVar, dVar, dVar2, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(r0.InterfaceC1398p r30, d0.D0 r31, boolean r32, B.k r33, n0.d r34, n0.d r35, f0.C0912t r36, int r37) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.A0.c(r0.p, d0.D0, boolean, B.k, n0.d, n0.d, f0.t, int):void");
    }

    public static final float d(float f7, float[] fArr, float f8, float f9) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f10 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f10);
            } else {
                float fAbs = Math.abs(AbstractC1113a.J(f8, f9, f10) - f7);
                C1422c it = new C1423d(1, length, 1).iterator();
                while (it.f15786q) {
                    float f11 = fArr[it.b()];
                    float fAbs2 = Math.abs(AbstractC1113a.J(f8, f9, f11) - f7);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f10 = f11;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f10);
            }
        }
        return fValueOf != null ? AbstractC1113a.J(f8, f9, fValueOf.floatValue()) : f7;
    }
}
