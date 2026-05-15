package u5;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: u5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1552n extends AbstractC1551m {
    public static boolean E(String str, String str2, boolean z6) {
        AbstractC1209k.f(str, "<this>");
        return !z6 ? str.endsWith(str2) : G(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean F(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean G(int i7, int i8, int i9, String str, String str2, boolean z6) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str2, "other");
        return !z6 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z6, i7, str2, i8, i9);
    }

    public static String H(int i7, String str) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        int i8 = 1;
        if (i7 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                cArr[i9] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i7);
        if (1 <= i7) {
            while (true) {
                sb.append((CharSequence) str);
                if (i8 == i7) {
                    break;
                }
                i8++;
            }
        }
        String string = sb.toString();
        AbstractC1209k.c(string);
        return string;
    }

    public static String I(String str, String str2, String str3) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str2, "oldValue");
        AbstractC1209k.f(str3, "newValue");
        int iU = AbstractC1545g.U(str, str2, 0, false);
        if (iU < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, iU);
            sb.append(str3);
            i8 = iU + length;
            if (iU >= str.length()) {
                break;
            }
            iU = AbstractC1545g.U(str, str2, iU + i7, false);
        } while (iU > 0);
        sb.append((CharSequence) str, i8, str.length());
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static boolean J(String str, String str2, int i7, boolean z6) {
        AbstractC1209k.f(str, "<this>");
        return !z6 ? str.startsWith(str2, i7) : G(i7, 0, str2.length(), str, str2, z6);
    }

    public static boolean K(String str, String str2, boolean z6) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str2, "prefix");
        return !z6 ? str.startsWith(str2) : G(0, 0, str2.length(), str, str2, z6);
    }

    public static Integer L(String str) {
        boolean z6;
        int i7;
        int i8;
        j0.k.p(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        int i10 = -2147483647;
        if (AbstractC1209k.g(cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z6 = true;
            }
        } else {
            z6 = false;
            i7 = 0;
        }
        int i11 = -59652323;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + iDigit) {
                return null;
            }
            i9 = i8 - iDigit;
            i7++;
        }
        return z6 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    public static Long M(String str) {
        boolean z6;
        AbstractC1209k.f(str, "<this>");
        j0.k.p(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char cCharAt = str.charAt(0);
        long j3 = -9223372036854775807L;
        if (AbstractC1209k.g(cCharAt, 48) < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
                i7 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j3 = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z6 = false;
        }
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 != -256204778801521550L) {
                    return null;
                }
                j8 = j3 / ((long) 10);
                if (j7 < j8) {
                    return null;
                }
            }
            long j9 = j7 * ((long) 10);
            long j10 = iDigit;
            if (j9 < j3 + j10) {
                return null;
            }
            j7 = j9 - j10;
            i7++;
        }
        return z6 ? Long.valueOf(j7) : Long.valueOf(-j7);
    }
}
