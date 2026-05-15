package G5;

import F5.m;
import F5.o;
import F5.v;
import F5.w;
import M5.C0282b;
import S5.C0427g;
import S5.E;
import S5.y;
import Z4.C0508b;
import Z4.n;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;
import u5.AbstractC1545g;
import u5.C1543e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2765a;

    /* JADX INFO: renamed from: b */
    public static final m f2766b = M3.a.Z(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final w f2767c;

    /* JADX INFO: renamed from: d */
    public static final TimeZone f2768d;

    /* JADX INFO: renamed from: e */
    public static final C1543e f2769e;

    /* JADX INFO: renamed from: f */
    public static final String f2770f;

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0125, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.b.<clinit>():void");
    }

    public static final boolean a(o oVar, o oVar2) {
        AbstractC1209k.f(oVar, "<this>");
        AbstractC1209k.f(oVar2, "other");
        return AbstractC1209k.a(oVar.f2397d, oVar2.f2397d) && oVar.f2398e == oVar2.f2398e && AbstractC1209k.a(oVar.f2394a, oVar2.f2394a);
    }

    public static final void b(Closeable closeable) {
        AbstractC1209k.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        AbstractC1209k.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (!AbstractC1209k.a(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(String str, char c7, int i7, int i8) {
        while (i7 < i8) {
            if (str.charAt(i7) == c7) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int e(String str, int i7, int i8, String str2) {
        while (i7 < i8) {
            if (AbstractC1545g.O(str2, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final boolean f(E e7) {
        AbstractC1209k.f(TimeUnit.MILLISECONDS, "timeUnit");
        try {
            return r(e7, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        AbstractC1209k.f(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1209k.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0508b c0508bJ = AbstractC1209k.j(strArr2);
                while (c0508bJ.hasNext()) {
                    if (comparator.compare(str, (String) c0508bJ.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long i(v vVar) {
        String strB = vVar.f2464t.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... objArr) {
        AbstractC1209k.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(Z4.o.e0(Arrays.copyOf(objArr2, objArr2.length)));
        AbstractC1209k.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (AbstractC1209k.g(cCharAt, 31) <= 0 || AbstractC1209k.g(cCharAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int l(String str, int i7, int i8) {
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int m(String str, int i7, int i8) {
        int i9 = i8 - 1;
        if (i7 <= i9) {
            while (true) {
                char cCharAt = str.charAt(i9);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i9 + 1;
                }
                if (i9 == i7) {
                    break;
                }
                i9--;
            }
        }
        return i7;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1209k.f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i7]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i7++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String str) {
        AbstractC1209k.f(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int p(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' > c7 || c7 >= 'G') {
            return -1;
        }
        return c7 - '7';
    }

    public static final int q(y yVar) {
        AbstractC1209k.f(yVar, "<this>");
        return (yVar.d() & 255) | ((yVar.d() & 255) << 16) | ((yVar.d() & 255) << 8);
    }

    public static final boolean r(E e7, int i7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1209k.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = e7.a().e() ? e7.a().c() - jNanoTime : Long.MAX_VALUE;
        e7.a().d(Math.min(jC, timeUnit.toNanos(i7)) + jNanoTime);
        try {
            C0427g c0427g = new C0427g();
            while (e7.k(8192L, c0427g) != -1) {
                c0427g.w(c0427g.f6785p);
            }
            if (jC == Long.MAX_VALUE) {
                e7.a().a();
                return true;
            }
            e7.a().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                e7.a().a();
                return false;
            }
            e7.a().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                e7.a().a();
            } else {
                e7.a().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final m s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0282b c0282b = (C0282b) it.next();
            String strP = c0282b.f4835a.p();
            String strP2 = c0282b.f4836b.p();
            arrayList.add(strP);
            arrayList.add(AbstractC1545g.u0(strP2).toString());
        }
        return new m((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(o oVar, boolean z6) {
        AbstractC1209k.f(oVar, "<this>");
        String str = oVar.f2397d;
        if (AbstractC1545g.N(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i7 = oVar.f2398e;
        if (!z6) {
            String str2 = oVar.f2394a;
            AbstractC1209k.f(str2, "scheme");
            if (i7 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i7;
    }

    public static final List u(List list) {
        AbstractC1209k.f(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(n.L0(list));
        AbstractC1209k.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int v(int i7, String str) {
        if (str == null) {
            return i7;
        }
        try {
            long j3 = Long.parseLong(str);
            if (j3 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j3 < 0) {
                return 0;
            }
            return (int) j3;
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    public static final String w(String str, int i7, int i8) {
        int iL = l(str, i7, i8);
        String strSubstring = str.substring(iL, m(str, iL, i8));
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
