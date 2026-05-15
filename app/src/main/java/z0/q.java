package z0;

import java.util.Arrays;
import m5.AbstractC1209k;
import w3.V0;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: r */
    public static final V0 f21082r = new V0(19);

    /* JADX INFO: renamed from: d */
    public final s f21083d;

    /* JADX INFO: renamed from: e */
    public final float f21084e;

    /* JADX INFO: renamed from: f */
    public final float f21085f;

    /* JADX INFO: renamed from: g */
    public final r f21086g;
    public final float[] h;

    /* JADX INFO: renamed from: i */
    public final float[] f21087i;

    /* JADX INFO: renamed from: j */
    public final float[] f21088j;

    /* JADX INFO: renamed from: k */
    public final i f21089k;
    public final p l;

    /* JADX INFO: renamed from: m */
    public final m f21090m;

    /* JADX INFO: renamed from: n */
    public final i f21091n;

    /* JADX INFO: renamed from: o */
    public final p f21092o;

    /* JADX INFO: renamed from: p */
    public final m f21093p;

    /* JADX INFO: renamed from: q */
    public final boolean f21094q;

    public q(String str, float[] fArr, s sVar, final r rVar, int i7) {
        i iVar;
        i iVar2;
        double d4 = rVar.f21095a;
        boolean z6 = d4 == -3.0d;
        double d7 = rVar.f21101g;
        double d8 = rVar.f21100f;
        if (z6) {
            final int i8 = 4;
            iVar = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        } else if (d4 == -2.0d) {
            final int i9 = 5;
            iVar = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        } else if (d8 == 0.0d && d7 == 0.0d) {
            final int i10 = 6;
            iVar = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        } else {
            final int i11 = 7;
            iVar = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        }
        if (d4 == -3.0d) {
            final int i12 = 0;
            iVar2 = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        } else if (d4 == -2.0d) {
            final int i13 = 1;
            iVar2 = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        } else if (d8 == 0.0d && d7 == 0.0d) {
            final int i14 = 2;
            iVar2 = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        } else {
            final int i15 = 3;
            iVar2 = new i() { // from class: z0.o
                @Override // z0.i
                public final double b(double d9) {
                    r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = d.f21033a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f21033a;
                            return d.c(rVar2, d9);
                        case 2:
                            return d9 >= rVar2.f21099e ? Math.pow((rVar2.f21096b * d9) + rVar2.f21097c, rVar2.f21095a) : d9 * rVar2.f21098d;
                        case 3:
                            double d10 = rVar2.f21096b;
                            if (d9 >= rVar2.f21099e) {
                                return Math.pow((d10 * d9) + rVar2.f21097c, rVar2.f21095a) + rVar2.f21100f;
                            }
                            return rVar2.f21101g + (rVar2.f21098d * d9);
                        case 4:
                            float[] fArr4 = d.f21033a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f21033a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d11 = rVar2.f21099e;
                            double d12 = rVar2.f21098d;
                            return d9 >= d11 * d12 ? (Math.pow(d9, 1.0d / rVar2.f21095a) - rVar2.f21097c) / rVar2.f21096b : d9 / d12;
                        default:
                            double d13 = rVar2.f21096b;
                            double d14 = rVar2.f21099e;
                            double d15 = rVar2.f21098d;
                            return d9 >= d14 * d15 ? (Math.pow(d9 - rVar2.f21100f, 1.0d / rVar2.f21095a) - rVar2.f21097c) / d13 : (d9 - rVar2.f21101g) / d15;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i7);
    }

    @Override // z0.c
    public final float a(int i7) {
        return this.f21085f;
    }

    @Override // z0.c
    public final float b(int i7) {
        return this.f21084e;
    }

    @Override // z0.c
    public final boolean c() {
        return this.f21094q;
    }

    @Override // z0.c
    public final long d(float f7, float f8, float f9) {
        double d4 = f7;
        m mVar = this.f21093p;
        float fB = (float) mVar.b(d4);
        float fB2 = (float) mVar.b(f8);
        float fB3 = (float) mVar.b(f9);
        float[] fArr = this.f21087i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f10 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        return (((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    @Override // z0.c
    public final float e(float f7, float f8, float f9) {
        double d4 = f7;
        m mVar = this.f21093p;
        float fB = (float) mVar.b(d4);
        float fB2 = (float) mVar.b(f8);
        float fB3 = (float) mVar.b(f9);
        float[] fArr = this.f21087i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // z0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f21084e, this.f21084e) != 0 || Float.compare(qVar.f21085f, this.f21085f) != 0 || !AbstractC1209k.a(this.f21083d, qVar.f21083d) || !Arrays.equals(this.h, qVar.h)) {
            return false;
        }
        r rVar = qVar.f21086g;
        r rVar2 = this.f21086g;
        if (rVar2 != null) {
            return AbstractC1209k.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (AbstractC1209k.a(this.f21089k, qVar.f21089k)) {
            return AbstractC1209k.a(this.f21091n, qVar.f21091n);
        }
        return false;
    }

    @Override // z0.c
    public final long f(float f7, float f8, float f9, float f10, c cVar) {
        float[] fArr = this.f21088j;
        float f11 = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f7);
        m mVar = this.f21090m;
        return AbstractC1959I.b((float) mVar.b(f11), (float) mVar.b(f12), (float) mVar.b(f13), f10, cVar);
    }

    @Override // z0.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.f21083d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f7 = this.f21084e;
        int iFloatToIntBits = (iHashCode + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        float f8 = this.f21085f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f8 == 0.0f ? 0 : Float.floatToIntBits(f8))) * 31;
        r rVar = this.f21086g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f21091n.hashCode() + ((this.f21089k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(java.lang.String r34, float[] r35, z0.s r36, float[] r37, z0.i r38, z0.i r39, float r40, float r41, z0.r r42, int r43) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.q.<init>(java.lang.String, float[], z0.s, float[], z0.i, z0.i, float, float, z0.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d4, float f7, float f8, int i7) {
        i iVar;
        i iVar2 = f21082r;
        if (d4 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i8 = 0;
            iVar = new i() { // from class: z0.n
                @Override // z0.i
                public final double b(double d7) {
                    switch (i8) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d4);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d4);
                    }
                }
            };
        }
        if (d4 != 1.0d) {
            final int i9 = 1;
            iVar2 = new i() { // from class: z0.n
                @Override // z0.i
                public final double b(double d7) {
                    switch (i9) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d4);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d4);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f7, f8, new r(d4, 1.0d, 0.0d, 0.0d, 0.0d), i7);
    }
}
