package w;

import y0.AbstractC1959I;

/* JADX INFO: renamed from: w.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1687u implements InterfaceC1690x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f18748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f18749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f18750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f18751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f18752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f18753t;

    public C1687u(float f7, float f8, float f9, float f10) {
        int iD;
        this.f18748o = f7;
        this.f18749p = f8;
        this.f18750q = f9;
        this.f18751r = f10;
        if (!((Float.isNaN(f7) || Float.isNaN(f8) || Float.isNaN(f9) || Float.isNaN(f10)) ? false : true)) {
            AbstractC1666O.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f7 + ", " + f8 + ", " + f9 + ", " + f10 + '.');
        }
        float[] fArr = new float[5];
        float f11 = (f8 - 0.0f) * 3.0f;
        float f12 = (f10 - f8) * 3.0f;
        float f13 = (1.0f - f10) * 3.0f;
        double d4 = f11;
        double d7 = f12;
        double d8 = f13;
        double d9 = d7 * 2.0d;
        double d10 = (d4 - d9) + d8;
        if (d10 == 0.0d) {
            iD = d7 == d8 ? 0 : AbstractC1959I.D((float) ((d9 - d8) / (d9 - (d8 * 2.0d))), fArr, 0);
        } else {
            double d11 = -Math.sqrt((d7 * d7) - (d8 * d4));
            double d12 = (-d4) + d7;
            int iD2 = AbstractC1959I.D((float) ((-(d11 + d12)) / d10), fArr, 0);
            int iD3 = AbstractC1959I.D((float) ((d11 - d12) / d10), fArr, iD2) + iD2;
            if (iD3 > 1) {
                float f14 = fArr[0];
                float f15 = fArr[1];
                if (f14 > f15) {
                    fArr[0] = f15;
                    fArr[1] = f14;
                } else if (f14 == f15) {
                    iD = iD3 - 1;
                }
                iD = iD3;
            } else {
                iD = iD3;
            }
        }
        float f16 = (f12 - f11) * 2.0f;
        int iD4 = AbstractC1959I.D((-f16) / (((f13 - f12) * 2.0f) - f16), fArr, iD) + iD;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i7 = 0; i7 < iD4; i7++) {
            float f17 = fArr[i7];
            float f18 = (((((((((f8 - f10) * 3.0f) + 1.0f) - 0.0f) * f17) + (((f10 - (f8 * 2.0f)) + 0.0f) * 3.0f)) * f17) + f11) * f17) + 0.0f;
            fMin = Math.min(fMin, f18);
            fMax = Math.max(fMax, f18);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f18752s = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f18753t = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1687u)) {
            return false;
        }
        C1687u c1687u = (C1687u) obj;
        return this.f18748o == c1687u.f18748o && this.f18749p == c1687u.f18749p && this.f18750q == c1687u.f18750q && this.f18751r == c1687u.f18751r;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18751r) + n1.c.n(this.f18750q, n1.c.n(this.f18749p, Float.floatToIntBits(this.f18748o) * 31, 31), 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[PHI: r3
  0x008c: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0230, B:117:0x0200, B:92:0x01b5, B:47:0x00df, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c A[PHI: r12
  0x015c: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x015a, B:81:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // w.InterfaceC1690x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float k(float r27) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1687u.k(float):float");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f18748o);
        sb.append(", b=");
        sb.append(this.f18749p);
        sb.append(", c=");
        sb.append(this.f18750q);
        sb.append(", d=");
        return n1.c.u(sb, this.f18751r, ')');
    }
}
