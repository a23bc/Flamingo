package O0;

import m5.AbstractC1209k;
import x0.C1892b;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class U implements C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q0.U f5369o;

    public U(Q0.U u7) {
        this.f5369o = u7;
    }

    @Override // O0.C
    public final void C(C c7, float[] fArr) {
        this.f5369o.f5888C.C(c7, fArr);
    }

    @Override // O0.C
    public final long G() {
        Q0.U u7 = this.f5369o;
        return (((long) u7.f5416o) << 32) | (((long) u7.f5417p) & 4294967295L);
    }

    @Override // O0.C
    public final long I(long j3) {
        return this.f5369o.f5888C.I(C1892b.h(j3, a()));
    }

    @Override // O0.C
    public final long K(C c7, long j3) {
        return b(c7, j3);
    }

    public final long a() {
        Q0.U u7 = this.f5369o;
        Q0.U uJ = w0.j(u7);
        return C1892b.g(b(uJ.f5891F, 0L), u7.f5888C.S0(uJ.f5888C, 0L));
    }

    public final long b(C c7, long j3) {
        boolean z6 = c7 instanceof U;
        Q0.U u7 = this.f5369o;
        if (!z6) {
            Q0.U uJ = w0.j(u7);
            long jB = b(uJ.f5891F, j3);
            long j7 = uJ.f5889D;
            long jG = C1892b.g(jB, (4294967295L & ((long) Float.floatToRawIntBits((int) (j7 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32));
            Q0.j0 j0Var = uJ.f5888C;
            if (!j0Var.J0().f15636B) {
                N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            j0Var.T0();
            Q0.j0 j0Var2 = j0Var.f6028G;
            if (j0Var2 != null) {
                j0Var = j0Var2;
            }
            return C1892b.h(jG, j0Var.S0(c7, 0L));
        }
        Q0.U u8 = ((U) c7).f5369o;
        u8.f5888C.T0();
        Q0.U uH0 = u7.f5888C.F0(u8.f5888C).H0();
        if (uH0 != null) {
            long jC = n1.k.c(n1.k.d(u8.C0(uH0, false), i6.h.H(j3)), u7.C0(uH0, false));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        Q0.U uJ2 = w0.j(u8);
        long jD = n1.k.d(n1.k.d(u8.C0(uJ2, false), uJ2.f5889D), i6.h.H(j3));
        Q0.U uJ3 = w0.j(u7);
        long jC2 = n1.k.c(jD, n1.k.d(u7.C0(uJ3, false), uJ3.f5889D));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        Q0.j0 j0Var3 = uJ3.f5888C.f6028G;
        AbstractC1209k.c(j0Var3);
        Q0.j0 j0Var4 = uJ2.f5888C.f6028G;
        AbstractC1209k.c(j0Var4);
        return j0Var3.S0(j0Var4, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // O0.C
    public final long c(long j3) {
        return this.f5369o.f5888C.c(C1892b.h(0L, a()));
    }

    @Override // O0.C
    public final long g(long j3) {
        return C1892b.h(this.f5369o.f5888C.g(j3), a());
    }

    @Override // O0.C
    public final long h(long j3) {
        return this.f5369o.f5888C.h(C1892b.h(j3, a()));
    }

    @Override // O0.C
    public final C j() {
        Q0.U uH0;
        if (!y()) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Q0.j0 j0Var = this.f5369o.f5888C.f6024C.f5821T.f6003d.f6028G;
        if (j0Var == null || (uH0 = j0Var.H0()) == null) {
            return null;
        }
        return uH0.f5891F;
    }

    @Override // O0.C
    public final C1893c m(C c7, boolean z6) {
        return this.f5369o.f5888C.m(c7, z6);
    }

    @Override // O0.C
    public final long x(long j3) {
        return C1892b.h(this.f5369o.f5888C.x(j3), a());
    }

    @Override // O0.C
    public final boolean y() {
        return this.f5369o.f5888C.J0().f15636B;
    }

    @Override // O0.C
    public final void z(float[] fArr) {
        this.f5369o.f5888C.z(fArr);
    }
}
