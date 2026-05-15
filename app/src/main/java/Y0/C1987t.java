package y0;

/* JADX INFO: renamed from: y0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1987t {

    /* JADX INFO: renamed from: b */
    public static final long f20255b = AbstractC1959I.d(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f20256c = AbstractC1959I.d(4282664004L);

    /* JADX INFO: renamed from: d */
    public static final long f20257d = AbstractC1959I.d(4287137928L);

    /* JADX INFO: renamed from: e */
    public static final long f20258e = AbstractC1959I.d(4291611852L);

    /* JADX INFO: renamed from: f */
    public static final long f20259f = AbstractC1959I.d(4294967295L);

    /* JADX INFO: renamed from: g */
    public static final long f20260g = AbstractC1959I.d(4294901760L);
    public static final long h;

    /* JADX INFO: renamed from: i */
    public static final long f20261i;

    /* JADX INFO: renamed from: j */
    public static final long f20262j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f20263k = 0;

    /* JADX INFO: renamed from: a */
    public final long f20264a;

    static {
        AbstractC1959I.d(4278255360L);
        h = AbstractC1959I.d(4278190335L);
        AbstractC1959I.d(4294967040L);
        AbstractC1959I.d(4278255615L);
        AbstractC1959I.d(4294902015L);
        f20261i = AbstractC1959I.c(0);
        f20262j = AbstractC1959I.b(0.0f, 0.0f, 0.0f, 0.0f, z0.d.f21051u);
    }

    public /* synthetic */ C1987t(long j3) {
        this.f20264a = j3;
    }

    public static final long a(long j3, z0.c cVar) {
        z0.g gVarE;
        z0.c cVarF = f(j3);
        int i7 = cVarF.f21032c;
        int i8 = cVar.f21032c;
        if ((i7 | i8) < 0) {
            gVarE = z0.j.e(cVarF, cVar);
        } else {
            t.y yVar = z0.h.f21063a;
            int i9 = i7 | (i8 << 6);
            Object objB = yVar.b(i9);
            if (objB == null) {
                objB = z0.j.e(cVarF, cVar);
                yVar.h(i9, objB);
            }
            gVarE = (z0.g) objB;
        }
        return gVarE.a(j3);
    }

    public static long b(long j3, float f7) {
        return AbstractC1959I.b(h(j3), g(j3), e(j3), f7, f(j3));
    }

    public static final boolean c(long j3, long j7) {
        return j3 == j7;
    }

    public static final float d(long j3) {
        float fX;
        float f7;
        if ((63 & j3) == 0) {
            fX = (float) I0.c.X((j3 >>> 56) & 255);
            f7 = 255.0f;
        } else {
            fX = (float) I0.c.X((j3 >>> 6) & 1023);
            f7 = 1023.0f;
        }
        return fX / f7;
    }

    public static final float e(long j3) {
        int i7;
        int i8;
        int i9;
        if ((63 & j3) == 0) {
            return ((float) I0.c.X((j3 >>> 32) & 255)) / 255.0f;
        }
        short s7 = (short) ((j3 >>> 16) & 65535);
        int i10 = Short.MIN_VALUE & s7;
        int i11 = ((65535 & s7) >>> 10) & 31;
        int i12 = s7 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC1991x.f20267a;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static final z0.c f(long j3) {
        float[] fArr = z0.d.f21033a;
        return z0.d.f21055y[(int) (j3 & 63)];
    }

    public static final float g(long j3) {
        int i7;
        int i8;
        int i9;
        if ((63 & j3) == 0) {
            return ((float) I0.c.X((j3 >>> 40) & 255)) / 255.0f;
        }
        short s7 = (short) ((j3 >>> 32) & 65535);
        int i10 = Short.MIN_VALUE & s7;
        int i11 = ((65535 & s7) >>> 10) & 31;
        int i12 = s7 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC1991x.f20267a;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static final float h(long j3) {
        int i7;
        int i8;
        int i9;
        if ((63 & j3) == 0) {
            return ((float) I0.c.X((j3 >>> 48) & 255)) / 255.0f;
        }
        short s7 = (short) ((j3 >>> 48) & 65535);
        int i10 = Short.MIN_VALUE & s7;
        int i11 = ((65535 & s7) >>> 10) & 31;
        int i12 = s7 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC1991x.f20267a;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static int i(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static String j(long j3) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j3));
        sb.append(", ");
        sb.append(g(j3));
        sb.append(", ");
        sb.append(e(j3));
        sb.append(", ");
        sb.append(d(j3));
        sb.append(", ");
        return Z1.l.s(sb, f(j3).f21030a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1987t) {
            return this.f20264a == ((C1987t) obj).f20264a;
        }
        return false;
    }

    public final int hashCode() {
        return i(this.f20264a);
    }

    public final String toString() {
        return j(this.f20264a);
    }
}
