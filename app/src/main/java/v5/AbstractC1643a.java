package v5;

import Z1.l;
import i6.g;
import i6.h;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: v5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1643a implements Comparable {

    /* JADX INFO: renamed from: o */
    public static final long f18313o;

    /* JADX INFO: renamed from: p */
    public static final long f18314p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f18315q = 0;

    static {
        int i7 = AbstractC1644b.f18316a;
        f18313o = g.t(4611686018427387903L);
        f18314p = g.t(-4611686018427387903L);
    }

    public static final long a(long j3, long j7) {
        long j8 = 1000000;
        long j9 = j7 / j8;
        long j10 = j3 + j9;
        if (-4611686018426L > j10 || j10 >= 4611686018427L) {
            return g.t(h.r(j10, -4611686018427387903L, 4611686018427387903L));
        }
        long j11 = ((j10 * j8) + (j7 - (j9 * j8))) << 1;
        int i7 = AbstractC1644b.f18316a;
        return j11;
    }

    public static final void b(StringBuilder sb, int i7, int i8, int i9, String str) {
        CharSequence charSequenceSubSequence;
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i8);
            AbstractC1209k.f(strValueOf, "<this>");
            if (i9 < 0) {
                throw new IllegalArgumentException(l.o(i9, "Desired length ", " is less than zero."));
            }
            if (i9 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i9);
                int length = i9 - strValueOf.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i11 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i11 = length2;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length2 = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (i13 < 3) {
                sb.append((CharSequence) string, 0, i13);
            } else {
                sb.append((CharSequence) string, 0, ((i11 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static int c(long j3, long j7) {
        long j8 = j3 ^ j7;
        if (j8 < 0 || (((int) j8) & 1) == 0) {
            return AbstractC1209k.h(j3, j7);
        }
        int i7 = (((int) j3) & 1) - (((int) j7) & 1);
        return j3 < 0 ? -i7 : i7;
    }

    public static final long d(long j3) {
        return ((((int) j3) & 1) != 1 || e(j3)) ? g(j3, EnumC1645c.f18318q) : j3 >> 1;
    }

    public static final boolean e(long j3) {
        return j3 == f18313o || j3 == f18314p;
    }

    public static final long f(long j3, long j7) {
        if (e(j3)) {
            if (!e(j7) || (j7 ^ j3) >= 0) {
                return j3;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j7)) {
            return j7;
        }
        int i7 = ((int) j3) & 1;
        if (i7 != (((int) j7) & 1)) {
            return i7 == 1 ? a(j3 >> 1, j7 >> 1) : a(j7 >> 1, j3 >> 1);
        }
        long j8 = (j3 >> 1) + (j7 >> 1);
        if (i7 == 0) {
            if (-4611686018426999999L > j8 || j8 >= 4611686018427000000L) {
                return g.t(j8 / ((long) 1000000));
            }
            long j9 = j8 << 1;
            int i8 = AbstractC1644b.f18316a;
            return j9;
        }
        if (-4611686018426L > j8 || j8 >= 4611686018427L) {
            return g.t(h.r(j8, -4611686018427387903L, 4611686018427387903L));
        }
        long j10 = (j8 * ((long) 1000000)) << 1;
        int i9 = AbstractC1644b.f18316a;
        return j10;
    }

    public static final long g(long j3, EnumC1645c enumC1645c) {
        AbstractC1209k.f(enumC1645c, "unit");
        if (j3 == f18313o) {
            return Long.MAX_VALUE;
        }
        if (j3 == f18314p) {
            return Long.MIN_VALUE;
        }
        return h.t(j3 >> 1, (((int) j3) & 1) == 0 ? EnumC1645c.f18317p : EnumC1645c.f18318q, enumC1645c);
    }

    public static String h(long j3) {
        long j7;
        int iG;
        int i7;
        long j8 = j3;
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f18313o) {
            return "Infinity";
        }
        if (j8 == f18314p) {
            return "-Infinity";
        }
        int i8 = 0;
        boolean z6 = j8 < 0;
        StringBuilder sb = new StringBuilder();
        if (z6) {
            sb.append('-');
        }
        if (j8 < 0) {
            j8 = ((long) (((int) j8) & 1)) + ((-(j8 >> 1)) << 1);
            int i9 = AbstractC1644b.f18316a;
        }
        long jG = g(j8, EnumC1645c.f18322u);
        int iG2 = e(j8) ? 0 : (int) (g(j8, EnumC1645c.f18321t) % ((long) 24));
        if (e(j8)) {
            j7 = 0;
            iG = 0;
        } else {
            j7 = 0;
            iG = (int) (g(j8, EnumC1645c.f18320s) % ((long) 60));
        }
        int iG3 = e(j8) ? 0 : (int) (g(j8, EnumC1645c.f18319r) % ((long) 60));
        if (e(j8)) {
            i7 = 0;
        } else {
            i7 = (int) ((((int) j8) & 1) == 1 ? ((j8 >> 1) % ((long) 1000)) * ((long) 1000000) : (j8 >> 1) % ((long) 1000000000));
        }
        boolean z7 = jG != j7;
        boolean z8 = iG2 != 0;
        boolean z9 = iG != 0;
        boolean z10 = (iG3 == 0 && i7 == 0) ? false : true;
        if (z7) {
            sb.append(jG);
            sb.append('d');
            i8 = 1;
        }
        if (z8 || (z7 && (z9 || z10))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(iG2);
            sb.append('h');
            i8 = i10;
        }
        if (z9 || (z10 && (z8 || z7))) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(iG);
            sb.append('m');
            i8 = i11;
        }
        if (z10) {
            int i12 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (iG3 != 0 || z7 || z8 || z9) {
                b(sb, iG3, i7, 9, "s");
            } else if (i7 >= 1000000) {
                b(sb, i7 / 1000000, i7 % 1000000, 6, "ms");
            } else if (i7 >= 1000) {
                b(sb, i7 / 1000, i7 % 1000, 3, "us");
            } else {
                sb.append(i7);
                sb.append("ns");
            }
            i8 = i12;
        }
        if (z6 && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
