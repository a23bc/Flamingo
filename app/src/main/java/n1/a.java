package n1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public final long f14505a;

    public /* synthetic */ a(long j3) {
        this.f14505a = j3;
    }

    public static long a(long j3, int i7, int i8, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i7 = j(j3);
        }
        if ((i11 & 2) != 0) {
            i8 = h(j3);
        }
        if ((i11 & 4) != 0) {
            i9 = i(j3);
        }
        if ((i11 & 8) != 0) {
            i10 = g(j3);
        }
        if (i8 < i7 || i10 < i9 || i7 < 0 || i9 < 0) {
            j.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i7, i8, i9, i10);
    }

    public static final boolean b(long j3, long j7) {
        return j3 == j7;
    }

    public static final boolean c(long j3) {
        int i7 = (int) (3 & j3);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return (((int) (j3 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) != 0;
    }

    public static final boolean d(long j3) {
        int i7 = (int) (3 & j3);
        return (((int) (j3 >> 33)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j3) {
        int i7 = (int) (3 & j3);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i9 = (1 << (18 - i8)) - 1;
        int i10 = ((int) (j3 >> (i8 + 15))) & i9;
        int i11 = ((int) (j3 >> (i8 + 46))) & i9;
        return i10 == (i11 == 0 ? Integer.MAX_VALUE : i11 - 1);
    }

    public static final boolean f(long j3) {
        int i7 = (int) (3 & j3);
        int i8 = (1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1;
        int i9 = ((int) (j3 >> 2)) & i8;
        int i10 = ((int) (j3 >> 33)) & i8;
        return i9 == (i10 == 0 ? Integer.MAX_VALUE : i10 - 1);
    }

    public static final int g(long j3) {
        int i7 = (int) (3 & j3);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i9 = ((int) (j3 >> (i8 + 46))) & ((1 << (18 - i8)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int h(long j3) {
        int i7 = (int) (3 & j3);
        int i8 = (int) (j3 >> 33);
        int i9 = i8 & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int i(long j3) {
        int i7 = (int) (3 & j3);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return ((int) (j3 >> (i8 + 15))) & ((1 << (18 - i8)) - 1);
    }

    public static final int j(long j3) {
        int i7 = (int) (3 & j3);
        return ((int) (j3 >> 2)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j3) {
        int iH = h(j3);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j3);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j3));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j3));
        sb.append(", maxHeight = ");
        return Z1.l.s(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f14505a == ((a) obj).f14505a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14505a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return k(this.f14505a);
    }
}
