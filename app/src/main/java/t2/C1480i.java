package t2;

import java.util.Arrays;

/* JADX INFO: renamed from: t2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1480i {
    public static final C1480i h = new C1480i(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: i */
    public static final String f16476i;

    /* JADX INFO: renamed from: j */
    public static final String f16477j;

    /* JADX INFO: renamed from: k */
    public static final String f16478k;
    public static final String l;

    /* JADX INFO: renamed from: m */
    public static final String f16479m;

    /* JADX INFO: renamed from: n */
    public static final String f16480n;

    /* JADX INFO: renamed from: a */
    public final int f16481a;

    /* JADX INFO: renamed from: b */
    public final int f16482b;

    /* JADX INFO: renamed from: c */
    public final int f16483c;

    /* JADX INFO: renamed from: d */
    public final byte[] f16484d;

    /* JADX INFO: renamed from: e */
    public final int f16485e;

    /* JADX INFO: renamed from: f */
    public final int f16486f;

    /* JADX INFO: renamed from: g */
    public int f16487g;

    static {
        int i7 = w2.t.f18881a;
        f16476i = Integer.toString(0, 36);
        f16477j = Integer.toString(1, 36);
        f16478k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        f16479m = Integer.toString(4, 36);
        f16480n = Integer.toString(5, 36);
    }

    public C1480i(int i7, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f16481a = i7;
        this.f16482b = i8;
        this.f16483c = i9;
        this.f16484d = bArr;
        this.f16485e = i10;
        this.f16486f = i11;
    }

    public static String a(int i7) {
        return i7 != -1 ? i7 != 1 ? i7 != 2 ? n1.c.s(i7, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i7) {
        return i7 != -1 ? i7 != 6 ? i7 != 1 ? i7 != 2 ? n1.c.s(i7, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i7) {
        return i7 != -1 ? i7 != 10 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 6 ? i7 != 7 ? n1.c.s(i7, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(C1480i c1480i) {
        if (c1480i == null) {
            return true;
        }
        int i7 = c1480i.f16481a;
        if (i7 != -1 && i7 != 1 && i7 != 2) {
            return false;
        }
        int i8 = c1480i.f16482b;
        if (i8 != -1 && i8 != 2) {
            return false;
        }
        int i9 = c1480i.f16483c;
        if ((i9 != -1 && i9 != 3) || c1480i.f16484d != null) {
            return false;
        }
        int i10 = c1480i.f16486f;
        if (i10 != -1 && i10 != 8) {
            return false;
        }
        int i11 = c1480i.f16485e;
        return i11 == -1 || i11 == 8;
    }

    public static int f(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f16481a == -1 || this.f16482b == -1 || this.f16483c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1480i.class == obj.getClass()) {
            C1480i c1480i = (C1480i) obj;
            if (this.f16481a == c1480i.f16481a && this.f16482b == c1480i.f16482b && this.f16483c == c1480i.f16483c && Arrays.equals(this.f16484d, c1480i.f16484d) && this.f16485e == c1480i.f16485e && this.f16486f == c1480i.f16486f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f16487g == 0) {
            this.f16487g = ((((Arrays.hashCode(this.f16484d) + ((((((527 + this.f16481a) * 31) + this.f16482b) * 31) + this.f16483c) * 31)) * 31) + this.f16485e) * 31) + this.f16486f;
        }
        return this.f16487g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f16481a));
        sb.append(", ");
        sb.append(a(this.f16482b));
        sb.append(", ");
        sb.append(c(this.f16483c));
        sb.append(", ");
        sb.append(this.f16484d != null);
        sb.append(", ");
        String str2 = "NA";
        int i7 = this.f16485e;
        if (i7 != -1) {
            str = i7 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i8 = this.f16486f;
        if (i8 != -1) {
            str2 = i8 + "bit Chroma";
        }
        return Z1.l.t(sb, str2, ")");
    }
}
