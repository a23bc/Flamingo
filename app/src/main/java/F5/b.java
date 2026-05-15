package F5;

import S5.C0427g;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;
import r5.C1421b;
import u5.AbstractC1539a;
import u5.AbstractC1545g;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2321a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2322b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2323c = new b();

    public static final g a(b bVar, String str) {
        g gVar = new g(str);
        g.f2342d.put(str, gVar);
        return gVar;
    }

    public static String b(String str, int i7, int i8, String str2, int i9) throws EOFException {
        int i10 = (i9 & 1) != 0 ? 0 : i7;
        int length = (i9 & 2) != 0 ? str.length() : i8;
        boolean z6 = (i9 & 8) == 0;
        boolean z7 = (i9 & 16) == 0;
        boolean z8 = (i9 & 32) == 0;
        boolean z9 = (i9 & 64) == 0;
        AbstractC1209k.f(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i11 = 32;
            int i12 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z9) || AbstractC1545g.O(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z7 && !d(str, iCharCount, length)))) || (iCodePointAt == 43 && z8)))) {
                C0427g c0427g = new C0427g();
                c0427g.H(str, i10, iCharCount);
                C0427g c0427g2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z8) {
                            c0427g.G(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i11 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i12 && !z9) || AbstractC1545g.O(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z7 && !d(str, iCharCount, length)))))) {
                            if (c0427g2 == null) {
                                c0427g2 = new C0427g();
                            }
                            c0427g2.I(iCodePointAt2);
                            while (!c0427g2.d()) {
                                byte bN = c0427g2.n();
                                c0427g.D(37);
                                char[] cArr = o.f2393j;
                                c0427g.D(cArr[((bN & 255) >> 4) & 15]);
                                c0427g.D(cArr[bN & 15]);
                            }
                        } else {
                            c0427g.I(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i11 = 32;
                    i12 = 128;
                }
                return c0427g.u(c0427g.f6785p, AbstractC1539a.f17313a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, length);
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(String str, int i7, int i8) {
        int i9 = i7 + 2;
        return i9 < i8 && str.charAt(i7) == '%' && G5.b.p(str.charAt(i7 + 1)) != -1 && G5.b.p(str.charAt(i9)) != -1;
    }

    public static String e(String str, int i7, int i8, int i9) {
        int i10;
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        boolean z6 = (i9 & 4) == 0;
        AbstractC1209k.f(str, "<this>");
        int iCharCount = i7;
        while (iCharCount < i8) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                C0427g c0427g = new C0427g();
                c0427g.H(str, i7, iCharCount);
                while (iCharCount < i8) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i10 = iCharCount + 2) < i8) {
                        int iP = G5.b.p(str.charAt(iCharCount + 1));
                        int iP2 = G5.b.p(str.charAt(i10));
                        if (iP == -1 || iP2 == -1) {
                            c0427g.I(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0427g.D((iP << 4) + iP2);
                            iCharCount = Character.charCount(iCodePointAt) + i10;
                        }
                    } else if (iCodePointAt == 43 && z6) {
                        c0427g.D(32);
                        iCharCount++;
                    } else {
                        c0427g.I(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0427g.u(c0427g.f6785p, AbstractC1539a.f17313a);
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i7, i8);
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int iW = AbstractC1545g.W(str, '&', i7, 4);
            if (iW == -1) {
                iW = str.length();
            }
            int iW2 = AbstractC1545g.W(str, '=', i7, 4);
            if (iW2 == -1 || iW2 > iW) {
                String strSubstring = str.substring(i7, iW);
                AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i7, iW2);
                AbstractC1209k.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iW2 + 1, iW);
                AbstractC1209k.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i7 = iW + 1;
        }
        return arrayList;
    }

    public static void g(ArrayList arrayList, StringBuilder sb) {
        AbstractC1209k.f(arrayList, "<this>");
        C1421b c1421bK = i6.h.K(i6.h.M(0, arrayList.size()), 2);
        int i7 = c1421bK.f15781o;
        int i8 = c1421bK.f15782p;
        int i9 = c1421bK.f15783q;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i7);
            String str2 = (String) arrayList.get(i7 + 1);
            if (i7 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i7 == i8) {
                return;
            } else {
                i7 += i9;
            }
        }
    }

    public synchronized g c(String str) {
        g gVar;
        String strConcat;
        try {
            AbstractC1209k.f(str, "javaName");
            LinkedHashMap linkedHashMap = g.f2342d;
            gVar = (g) linkedHashMap.get(str);
            if (gVar == null) {
                if (AbstractC1552n.K(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    AbstractC1209k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC1552n.K(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    AbstractC1209k.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                gVar = (g) linkedHashMap.get(strConcat);
                if (gVar == null) {
                    gVar = new g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}
