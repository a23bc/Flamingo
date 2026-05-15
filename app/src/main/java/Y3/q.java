package y3;

import a.AbstractC0509a;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m5.AbstractC1209k;
import u5.AbstractC1545g;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: m */
    public static final Pattern f20444m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n */
    public static final Pattern f20445n = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a */
    public final String f20446a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f20447b;

    /* JADX INFO: renamed from: c */
    public final String f20448c;

    /* JADX INFO: renamed from: d */
    public final Y4.m f20449d;

    /* JADX INFO: renamed from: e */
    public final Y4.m f20450e;

    /* JADX INFO: renamed from: f */
    public final Object f20451f;

    /* JADX INFO: renamed from: g */
    public boolean f20452g;
    public final Object h;

    /* JADX INFO: renamed from: i */
    public final Object f20453i;

    /* JADX INFO: renamed from: j */
    public final Object f20454j;

    /* JADX INFO: renamed from: k */
    public final Y4.m f20455k;
    public final boolean l;

    public q(String str) {
        this.f20446a = str;
        ArrayList arrayList = new ArrayList();
        this.f20447b = arrayList;
        this.f20449d = AbstractC0509a.O(new o(this, 6));
        this.f20450e = AbstractC0509a.O(new o(this, 4));
        Y4.f fVar = Y4.f.f8724p;
        this.f20451f = AbstractC0509a.N(fVar, new o(this, 7));
        this.h = AbstractC0509a.N(fVar, new o(this, 1));
        this.f20453i = AbstractC0509a.N(fVar, new o(this, 0));
        this.f20454j = AbstractC0509a.N(fVar, new o(this, 3));
        this.f20455k = AbstractC0509a.O(new o(this, 2));
        AbstractC0509a.O(new o(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f20444m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z6 = false;
        String strSubstring = str.substring(0, matcher.start());
        AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        a(strSubstring, arrayList, sb);
        if (!AbstractC1545g.N(sb, ".*", false) && !AbstractC1545g.N(sb, "([^/]+?)", false)) {
            z6 = true;
        }
        this.l = z6;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        AbstractC1209k.e(string, "uriRegex.toString()");
        this.f20448c = AbstractC1552n.I(string, ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f20445n.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            AbstractC1209k.d(strGroup, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            AbstractC1209k.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public final boolean b(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.f20447b;
        ArrayList arrayList2 = new ArrayList(Z4.p.j0(arrayList));
        int i7 = 0;
        for (Object obj : arrayList) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                Z4.o.i0();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i8));
            if (map.get(str) != null) {
                throw new ClassCastException();
            }
            try {
                AbstractC1209k.e(strDecode, "value");
                bundle.putString(str, strDecode);
                arrayList2.add(Y4.o.f8736a);
                i7 = i8;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y4.e, java.lang.Object] */
    public final boolean c(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : ((Map) this.f20451f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            n nVar = (n) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f20452g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = I0.c.G(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = nVar.f20438a;
                    Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                    int i7 = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = nVar.f20439b;
                        ArrayList arrayList2 = new ArrayList(Z4.p.j0(arrayList));
                        for (Object obj : arrayList) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                Z4.o.i0();
                                throw null;
                            }
                            String str4 = (String) obj;
                            String strGroup = matcher.group(i8);
                            if (strGroup == null) {
                                strGroup = "";
                            }
                            try {
                                if (map.get(str4) != null) {
                                    throw new ClassCastException();
                                }
                                if (!bundle.containsKey(str4)) {
                                    if (!strGroup.equals('{' + str4 + '}')) {
                                        bundle2.putString(str4, strGroup);
                                    }
                                }
                                arrayList2.add(Y4.o.f8736a);
                                i7 = i8;
                            } catch (IllegalArgumentException unused) {
                                continue;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        return this.f20446a.equals(((q) obj).f20446a);
    }

    public final int hashCode() {
        return this.f20446a.hashCode() * 961;
    }
}
