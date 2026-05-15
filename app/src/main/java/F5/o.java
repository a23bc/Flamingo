package F5;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: j */
    public static final char[] f2393j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f2394a;

    /* JADX INFO: renamed from: b */
    public final String f2395b;

    /* JADX INFO: renamed from: c */
    public final String f2396c;

    /* JADX INFO: renamed from: d */
    public final String f2397d;

    /* JADX INFO: renamed from: e */
    public final int f2398e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2399f;

    /* JADX INFO: renamed from: g */
    public final String f2400g;
    public final String h;

    /* JADX INFO: renamed from: i */
    public final boolean f2401i;

    public o(String str, String str2, String str3, String str4, int i7, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        AbstractC1209k.f(str, "scheme");
        AbstractC1209k.f(str4, "host");
        this.f2394a = str;
        this.f2395b = str2;
        this.f2396c = str3;
        this.f2397d = str4;
        this.f2398e = i7;
        this.f2399f = arrayList2;
        this.f2400g = str5;
        this.h = str6;
        this.f2401i = str.equals("https");
    }

    public final String a() {
        if (this.f2396c.length() == 0) {
            return "";
        }
        int length = this.f2394a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(AbstractC1545g.W(str, ':', length, 4) + 1, AbstractC1545g.W(str, '@', 0, 6));
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f2394a.length() + 3;
        String str = this.h;
        int iW = AbstractC1545g.W(str, '/', length, 4);
        String strSubstring = str.substring(iW, G5.b.e(str, iW, str.length(), "?#"));
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f2394a.length() + 3;
        String str = this.h;
        int iW = AbstractC1545g.W(str, '/', length, 4);
        int iE = G5.b.e(str, iW, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iW < iE) {
            int i7 = iW + 1;
            int iD = G5.b.d(str, '/', i7, iE);
            String strSubstring = str.substring(i7, iD);
            AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iW = iD;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2399f == null) {
            return null;
        }
        String str = this.h;
        int iW = AbstractC1545g.W(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iW, G5.b.d(str, '#', iW, str.length()));
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f2395b.length() == 0) {
            return "";
        }
        int length = this.f2394a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(length, G5.b.e(str, length, str.length(), ":@"));
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && AbstractC1209k.a(((o) obj).h, this.h);
    }

    public final String f() {
        n nVar;
        try {
            nVar = new n();
            nVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        AbstractC1209k.c(nVar);
        nVar.f2387b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        nVar.f2388c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return nVar.a().h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        n nVar = new n();
        String str = this.f2394a;
        nVar.f2386a = str;
        nVar.f2387b = e();
        nVar.f2388c = a();
        nVar.f2389d = this.f2397d;
        AbstractC1209k.f(str, "scheme");
        int i7 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i8 = this.f2398e;
        nVar.f2390e = i8 != i7 ? i8 : -1;
        ArrayList arrayList = nVar.f2391f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        nVar.f2392g = strD != null ? b.f(b.b(strD, 0, 0, " \"'<>#", 211)) : null;
        if (this.f2400g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(AbstractC1545g.W(str2, '#', 0, 6) + 1);
            AbstractC1209k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        nVar.h = strSubstring;
        String str3 = nVar.f2389d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC1209k.e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            AbstractC1209k.e(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        nVar.f2389d = strReplaceAll;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.set(i9, b.b((String) arrayList.get(i9), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = nVar.f2392g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str4 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str4 != null ? b.b(str4, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str5 = nVar.h;
        nVar.h = str5 != null ? b.b(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = nVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e7) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC1209k.e(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                AbstractC1209k.e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC1209k.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
