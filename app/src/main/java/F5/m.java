package F5;

import E0.C0096g;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final String[] f2385o;

    public m(String[] strArr) {
        this.f2385o = strArr;
    }

    public final String b(String str) {
        AbstractC1209k.f(str, "name");
        String[] strArr = this.f2385o;
        int length = strArr.length - 2;
        int iG = N5.d.G(length, 0, -2);
        if (iG > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iG) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final Date c(String str) {
        String strB = b(str);
        if (strB == null) {
            return null;
        }
        K5.c cVar = K5.d.f4074a;
        if (strB.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) K5.d.f4074a.get()).parse(strB, parsePosition);
        if (parsePosition.getIndex() == strB.length()) {
            return date;
        }
        String[] strArr = K5.d.f4075b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    DateFormat[] dateFormatArr = K5.d.f4076c;
                    DateFormat simpleDateFormat = dateFormatArr[i7];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(K5.d.f4075b[i7], Locale.US);
                        simpleDateFormat.setTimeZone(G5.b.f2768d);
                        dateFormatArr[i7] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(strB, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e(int i7) {
        return this.f2385o[i7 * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Arrays.equals(this.f2385o, ((m) obj).f2385o);
        }
        return false;
    }

    public final C0096g g() {
        C0096g c0096g = new C0096g(1);
        ArrayList arrayList = c0096g.f1743o;
        AbstractC1209k.f(arrayList, "<this>");
        String[] strArr = this.f2385o;
        AbstractC1209k.f(strArr, "elements");
        arrayList.addAll(Z4.l.S(strArr));
        return c0096g;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2385o);
    }

    public final String i(int i7) {
        return this.f2385o[(i7 * 2) + 1];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Y4.h[] hVarArr = new Y4.h[size];
        for (int i7 = 0; i7 < size; i7++) {
            hVarArr[i7] = new Y4.h(e(i7), i(i7));
        }
        return AbstractC1209k.j(hVarArr);
    }

    public final int size() {
        return this.f2385o.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String strE = e(i7);
            String strI = i(i7);
            sb.append(strE);
            sb.append(": ");
            if (G5.b.o(strE)) {
                strI = "██";
            }
            sb.append(strI);
            sb.append("\n");
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
