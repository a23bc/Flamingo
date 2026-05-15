package M5;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0282b[] f4852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f4853b;

    static {
        C0282b c0282b = new C0282b(C0282b.f4834i, "");
        S5.j jVar = C0282b.f4832f;
        C0282b c0282b2 = new C0282b(jVar, "GET");
        C0282b c0282b3 = new C0282b(jVar, "POST");
        S5.j jVar2 = C0282b.f4833g;
        C0282b c0282b4 = new C0282b(jVar2, "/");
        C0282b c0282b5 = new C0282b(jVar2, "/index.html");
        S5.j jVar3 = C0282b.h;
        C0282b c0282b6 = new C0282b(jVar3, "http");
        C0282b c0282b7 = new C0282b(jVar3, "https");
        S5.j jVar4 = C0282b.f4831e;
        C0282b[] c0282bArr = {c0282b, c0282b2, c0282b3, c0282b4, c0282b5, c0282b6, c0282b7, new C0282b(jVar4, "200"), new C0282b(jVar4, "204"), new C0282b(jVar4, "206"), new C0282b(jVar4, "304"), new C0282b(jVar4, "400"), new C0282b(jVar4, "404"), new C0282b(jVar4, "500"), new C0282b("accept-charset", ""), new C0282b("accept-encoding", "gzip, deflate"), new C0282b("accept-language", ""), new C0282b("accept-ranges", ""), new C0282b("accept", ""), new C0282b("access-control-allow-origin", ""), new C0282b("age", ""), new C0282b("allow", ""), new C0282b("authorization", ""), new C0282b("cache-control", ""), new C0282b("content-disposition", ""), new C0282b("content-encoding", ""), new C0282b("content-language", ""), new C0282b("content-length", ""), new C0282b("content-location", ""), new C0282b("content-range", ""), new C0282b("content-type", ""), new C0282b("cookie", ""), new C0282b("date", ""), new C0282b("etag", ""), new C0282b("expect", ""), new C0282b("expires", ""), new C0282b("from", ""), new C0282b("host", ""), new C0282b("if-match", ""), new C0282b("if-modified-since", ""), new C0282b("if-none-match", ""), new C0282b("if-range", ""), new C0282b("if-unmodified-since", ""), new C0282b("last-modified", ""), new C0282b("link", ""), new C0282b("location", ""), new C0282b("max-forwards", ""), new C0282b("proxy-authenticate", ""), new C0282b("proxy-authorization", ""), new C0282b("range", ""), new C0282b("referer", ""), new C0282b("refresh", ""), new C0282b("retry-after", ""), new C0282b("server", ""), new C0282b("set-cookie", ""), new C0282b("strict-transport-security", ""), new C0282b("transfer-encoding", ""), new C0282b("user-agent", ""), new C0282b("vary", ""), new C0282b("via", ""), new C0282b("www-authenticate", "")};
        f4852a = c0282bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i7 = 0; i7 < 61; i7++) {
            if (!linkedHashMap.containsKey(c0282bArr[i7].f4835a)) {
                linkedHashMap.put(c0282bArr[i7].f4835a, Integer.valueOf(i7));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC1209k.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        f4853b = mapUnmodifiableMap;
    }

    public static void a(S5.j jVar) throws IOException {
        AbstractC1209k.f(jVar, "name");
        int iC = jVar.c();
        for (int i7 = 0; i7 < iC; i7++) {
            byte bH = jVar.h(i7);
            if (65 <= bH && bH < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.p()));
            }
        }
    }
}
