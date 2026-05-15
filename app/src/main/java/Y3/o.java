package y3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f20440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f20441q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, int i7) {
        super(0);
        this.f20440p = i7;
        this.f20441q = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [Y4.e, java.lang.Object] */
    @Override // l5.InterfaceC1180a
    public final Object a() {
        List list;
        switch (this.f20440p) {
            case 0:
                Y4.h hVar = (Y4.h) this.f20441q.h.getValue();
                return (hVar == null || (list = (List) hVar.f8726o) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f20441q.f20446a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                AbstractC1209k.c(fragment);
                q.a(fragment, arrayList, sb);
                String string = sb.toString();
                AbstractC1209k.e(string, "fragRegex.toString()");
                return new Y4.h(arrayList, string);
            case 2:
                String str2 = (String) this.f20441q.f20454j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                Y4.h hVar2 = (Y4.h) this.f20441q.h.getValue();
                if (hVar2 != null) {
                    return (String) hVar2.f8727p;
                }
                return null;
            case 4:
                String str3 = this.f20441q.f20446a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.f20441q.getClass();
                return null;
            case 6:
                String str4 = this.f20441q.f20448c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                q qVar = this.f20441q;
                qVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) qVar.f20450e.getValue()).booleanValue()) {
                    String str5 = qVar.f20446a;
                    Uri uri = Uri.parse(str5);
                    for (String str6 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str6 + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) Z4.n.r0(queryParameters);
                        if (str7 == null) {
                            qVar.f20452g = true;
                            str7 = str6;
                        }
                        Matcher matcher = q.f20445n.matcher(str7);
                        n nVar = new n();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            AbstractC1209k.d(strGroup, "null cannot be cast to non-null type kotlin.String");
                            nVar.f20439b.add(strGroup);
                            AbstractC1209k.e(str7, "queryParam");
                            String strSubstring = str7.substring(iEnd, matcher.start());
                            AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(strSubstring));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < str7.length()) {
                            String strSubstring2 = str7.substring(iEnd);
                            AbstractC1209k.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            sb2.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb2.toString();
                        AbstractC1209k.e(string2, "argRegex.toString()");
                        nVar.f20438a = AbstractC1552n.I(string2, ".*", "\\E.*\\Q");
                        AbstractC1209k.e(str6, "paramName");
                        linkedHashMap.put(str6, nVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
