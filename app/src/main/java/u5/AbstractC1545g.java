package u5;

import A5.y;
import O0.E;
import Z4.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;
import r5.C1421b;
import r5.C1423d;
import t5.C1523g;

/* JADX INFO: renamed from: u5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1545g extends AbstractC1552n {
    public static boolean N(CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        AbstractC1209k.f(charSequence, "<this>");
        AbstractC1209k.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (X(charSequence, (String) charSequence2, 0, z6, 2) >= 0) {
                return true;
            }
        } else if (V(charSequence, charSequence2, 0, charSequence.length(), z6, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean O(CharSequence charSequence, char c7) {
        AbstractC1209k.f(charSequence, "<this>");
        return W(charSequence, c7, 0, 2) >= 0;
    }

    public static String P(int i7, String str) {
        AbstractC1209k.f(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(Z1.l.o(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(i7);
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return t0(length, str);
    }

    public static boolean R(CharSequence charSequence, String str) {
        AbstractC1209k.f(charSequence, "<this>");
        return charSequence instanceof String ? AbstractC1552n.E((String) charSequence, str, false) : e0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean S(String str, char c7) {
        return str.length() > 0 && j0.k.u(str.charAt(T(str)), c7, false);
    }

    public static int T(CharSequence charSequence) {
        AbstractC1209k.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int U(CharSequence charSequence, String str, int i7, boolean z6) {
        AbstractC1209k.f(charSequence, "<this>");
        AbstractC1209k.f(str, "string");
        return (z6 || !(charSequence instanceof String)) ? V(charSequence, str, i7, charSequence.length(), z6, false) : ((String) charSequence).indexOf(str, i7);
    }

    public static final int V(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7) {
        C1421b c1421b;
        if (z7) {
            int iT = T(charSequence);
            if (i7 > iT) {
                i7 = iT;
            }
            if (i8 < 0) {
                i8 = 0;
            }
            c1421b = new C1421b(i7, i8, -1);
        } else {
            if (i7 < 0) {
                i7 = 0;
            }
            int length = charSequence.length();
            if (i8 > length) {
                i8 = length;
            }
            c1421b = new C1423d(i7, i8, 1);
        }
        boolean z8 = charSequence instanceof String;
        int i9 = c1421b.f15783q;
        int i10 = c1421b.f15782p;
        int i11 = c1421b.f15781o;
        if (!z8 || !(charSequence2 instanceof String)) {
            boolean z9 = z6;
            if ((i9 > 0 && i11 <= i10) || (i9 < 0 && i10 <= i11)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z10 = z9;
                    z9 = z10;
                    if (!e0(charSequence4, 0, charSequence3, i11, charSequence2.length(), z10)) {
                        if (i11 == i10) {
                            break;
                        }
                        i11 += i9;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i11;
                    }
                }
            }
        } else if ((i9 > 0 && i11 <= i10) || (i9 < 0 && i10 <= i11)) {
            int i12 = i11;
            while (true) {
                boolean z11 = z6;
                if (!AbstractC1552n.G(0, i12, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z11)) {
                    if (i12 == i10) {
                        break;
                    }
                    i12 += i9;
                    z6 = z11;
                } else {
                    return i12;
                }
            }
        }
        return -1;
    }

    public static int W(CharSequence charSequence, char c7, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        AbstractC1209k.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? Y(charSequence, new char[]{c7}, i7, false) : ((String) charSequence).indexOf(c7, i7);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i7, boolean z6, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return U(charSequence, str, i7, z6);
    }

    public static final int Y(CharSequence charSequence, char[] cArr, int i7, boolean z6) {
        AbstractC1209k.f(charSequence, "<this>");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(Z4.l.n0(cArr), i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int iT = T(charSequence);
        if (i7 > iT) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i7);
            for (char c7 : cArr) {
                if (j0.k.u(c7, cCharAt, z6)) {
                    return i7;
                }
            }
            if (i7 == iT) {
                return -1;
            }
            i7++;
        }
    }

    public static boolean Z(CharSequence charSequence) {
        AbstractC1209k.f(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!j0.k.y(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static int a0(int i7, String str, String str2) {
        int iT = (i7 & 2) != 0 ? T(str) : 0;
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str2, "string");
        return str.lastIndexOf(str2, iT);
    }

    public static int b0(CharSequence charSequence, char c7, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = T(charSequence);
        }
        AbstractC1209k.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c7, i7);
        }
        char[] cArr = {c7};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(Z4.l.n0(cArr), i7);
        }
        int iT = T(charSequence);
        if (i7 > iT) {
            i7 = iT;
        }
        while (-1 < i7) {
            if (j0.k.u(cArr[0], charSequence.charAt(i7), false)) {
                return i7;
            }
            i7--;
        }
        return -1;
    }

    public static final C1523g c0(String str) {
        AbstractC1209k.f(str, "<this>");
        return new C1523g(d0(str, new String[]{"\r\n", "\n", "\r"}), new Y0.m(str, 5), 2);
    }

    public static C1523g d0(String str, String[] strArr) {
        return new C1523g(str, new E(1, Z4.l.S(strArr)));
    }

    public static final boolean e0(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z6) {
        AbstractC1209k.f(charSequence, "<this>");
        AbstractC1209k.f(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!j0.k.u(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z6)) {
                return false;
            }
        }
        return true;
    }

    public static String f0(String str, String str2) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str2, "prefix");
        if (!m0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String g0(String str, String str2) {
        if (!R(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String h0(String str, String str2, String str3) {
        AbstractC1209k.f(str, "<this>");
        if (str.length() < str3.length() + str2.length() || !m0(str, str2) || !R(str, str3)) {
            return str;
        }
        String strSubstring = str.substring(str2.length(), str.length() - str3.length());
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List i0(String str, String str2) {
        int iU = U(str, str2, 0, false);
        if (iU == -1) {
            return I0.c.G(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(str.subSequence(length, iU).toString());
            length = str2.length() + iU;
            iU = U(str, str2, length, false);
        } while (iU != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }

    public static List j0(String str, char[] cArr) {
        AbstractC1209k.f(str, "<this>");
        if (cArr.length == 1) {
            return i0(str, String.valueOf(cArr[0]));
        }
        t5.l lVar = new t5.l(new C1523g(str, new y(7, cArr)));
        ArrayList arrayList = new ArrayList(p.j0(lVar));
        Iterator it = lVar.iterator();
        while (true) {
            C1540b c1540b = (C1540b) it;
            if (!c1540b.hasNext()) {
                return arrayList;
            }
            arrayList.add(n0(str, (C1423d) c1540b.next()));
        }
    }

    public static List k0(String str, String[] strArr) {
        AbstractC1209k.f(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return i0(str, str2);
            }
        }
        t5.l lVar = new t5.l(d0(str, strArr));
        ArrayList arrayList = new ArrayList(p.j0(lVar));
        Iterator it = lVar.iterator();
        while (true) {
            C1540b c1540b = (C1540b) it;
            if (!c1540b.hasNext()) {
                return arrayList;
            }
            arrayList.add(n0(str, (C1423d) c1540b.next()));
        }
    }

    public static boolean l0(String str, char c7) {
        return str.length() > 0 && j0.k.u(str.charAt(0), c7, false);
    }

    public static boolean m0(String str, String str2) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str2, "prefix");
        return AbstractC1552n.K(str, str2, false);
    }

    public static final String n0(String str, C1423d c1423d) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(c1423d, "range");
        return str.subSequence(c1423d.f15781o, c1423d.f15782p + 1).toString();
    }

    public static String o0(String str, String str2) {
        AbstractC1209k.f(str2, "delimiter");
        int iX = X(str, str2, 0, false, 6);
        if (iX == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iX, str.length());
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String p0(String str, char c7, String str2) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str2, "missingDelimiterValue");
        int iB0 = b0(str, c7, 0, 6);
        if (iB0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iB0 + 1, str.length());
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String q0(String str, String str2) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str, "missingDelimiterValue");
        int iA0 = a0(6, str, str2);
        if (iA0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iA0, str.length());
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String r0(String str, char c7) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str, "missingDelimiterValue");
        int iB0 = b0(str, c7, 0, 6);
        if (iB0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iB0);
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String s0(String str, String str2) {
        AbstractC1209k.f(str, "<this>");
        AbstractC1209k.f(str, "missingDelimiterValue");
        int iA0 = a0(6, str, str2);
        if (iA0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iA0);
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String t0(int i7, String str) {
        if (i7 < 0) {
            throw new IllegalArgumentException(Z1.l.o(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(0, i7);
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence u0(CharSequence charSequence) {
        AbstractC1209k.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean zY = j0.k.y(charSequence.charAt(!z6 ? i7 : length));
            if (z6) {
                if (!zY) {
                    break;
                }
                length--;
            } else if (zY) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }
}
