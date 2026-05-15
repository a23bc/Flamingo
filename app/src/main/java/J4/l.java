package j4;

import F5.n;
import F5.q;
import F5.t;
import S5.u;
import S5.y;
import android.webkit.MimeTypeMap;
import h4.C1004c;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;
import p4.EnumC1295a;
import u5.AbstractC1545g;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class l implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F5.c f13725f = new F5.c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final F5.c f13726g = new F5.c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.l f13728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y4.m f13729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y4.m f13730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13731e;

    public l(String str, p4.l lVar, Y4.m mVar, Y4.m mVar2, boolean z6) {
        this.f13727a = str;
        this.f13728b = lVar;
        this.f13729c = mVar;
        this.f13730d = mVar2;
        this.f13731e = z6;
    }

    public static String d(String str, q qVar) {
        String strB;
        String str2 = qVar != null ? qVar.f2404a : null;
        if ((str2 == null || AbstractC1552n.K(str2, "text/plain", false)) && (strB = s4.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 == null) {
            return null;
        }
        int iW = AbstractC1545g.W(str2, ';', 0, 6);
        if (iW == -1) {
            return str2;
        }
        String strSubstring = str2.substring(0, iW);
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203 A[Catch: Exception -> 0x018b, TryCatch #1 {Exception -> 0x018b, blocks: (B:93:0x01d4, B:95:0x01da, B:97:0x01fa, B:99:0x01ff, B:98:0x01fd, B:101:0x0203, B:102:0x0208, B:69:0x015b, B:72:0x0167, B:74:0x0173, B:76:0x0181, B:80:0x018d, B:82:0x0195, B:84:0x01b0, B:86:0x01b5, B:85:0x01b3, B:88:0x01b9), top: B:111:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: Exception -> 0x00cd, TRY_ENTER, TryCatch #0 {Exception -> 0x00cd, blocks: (B:103:0x0209, B:104:0x020c, B:67:0x0153, B:105:0x020d, B:106:0x0212, B:36:0x0095, B:38:0x009f, B:47:0x00d1, B:49:0x00d5, B:53:0x00ee, B:63:0x013a, B:55:0x0106, B:57:0x0112, B:58:0x011b, B:41:0x00b5, B:43:0x00bd, B:60:0x0125, B:61:0x012c, B:62:0x012d), top: B:110:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:103:0x0209, B:104:0x020c, B:67:0x0153, B:105:0x020d, B:106:0x0212, B:36:0x0095, B:38:0x009f, B:47:0x00d1, B:49:0x00d5, B:53:0x00ee, B:63:0x013a, B:55:0x0106, B:57:0x0112, B:58:0x011b, B:41:0x00b5, B:43:0x00bd, B:60:0x0125, B:61:0x012c, B:62:0x012d), top: B:110:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da A[Catch: Exception -> 0x018b, TryCatch #1 {Exception -> 0x018b, blocks: (B:93:0x01d4, B:95:0x01da, B:97:0x01fa, B:99:0x01ff, B:98:0x01fd, B:101:0x0203, B:102:0x0208, B:69:0x015b, B:72:0x0167, B:74:0x0173, B:76:0x0181, B:80:0x018d, B:82:0x0195, B:84:0x01b0, B:86:0x01b5, B:85:0x01b3, B:88:0x01b9), top: B:111:0x015b }] */
    /* JADX WARN: Type inference failed for: r0v12, types: [j4.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [j4.l] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [h4.h] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r3v9, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [h4.h] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [j4.l] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // j4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(c5.d r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.l.a(c5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(F5.t r5, e5.AbstractC0865c r6) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.l.b(F5.t, e5.c):java.lang.Object");
    }

    public final S5.l c() {
        Object value = this.f13730d.getValue();
        AbstractC1209k.c(value);
        return ((h4.i) value).f12744a;
    }

    public final t e() {
        U3.h hVar = new U3.h(2);
        String strConcat = this.f13727a;
        AbstractC1209k.f(strConcat, "url");
        if (AbstractC1552n.K(strConcat, "ws:", true)) {
            String strSubstring = strConcat.substring(3);
            AbstractC1209k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            strConcat = "http:".concat(strSubstring);
        } else if (AbstractC1552n.K(strConcat, "wss:", true)) {
            String strSubstring2 = strConcat.substring(4);
            AbstractC1209k.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            strConcat = "https:".concat(strSubstring2);
        }
        AbstractC1209k.f(strConcat, "<this>");
        n nVar = new n();
        nVar.c(null, strConcat);
        hVar.f7042o = nVar.a();
        p4.l lVar = this.f13728b;
        F5.m mVar = lVar.f15085i;
        AbstractC1209k.f(mVar, "headers");
        hVar.f7044q = mVar.g();
        for (Map.Entry entry : lVar.f15086j.f15100a.entrySet()) {
            Object key = entry.getKey();
            AbstractC1209k.d(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Class cls = (Class) key;
            Object value = entry.getValue();
            if (value == null) {
                ((LinkedHashMap) hVar.f7045r).remove(cls);
            } else {
                if (((LinkedHashMap) hVar.f7045r).isEmpty()) {
                    hVar.f7045r = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) hVar.f7045r;
                Object objCast = cls.cast(value);
                AbstractC1209k.c(objCast);
                linkedHashMap.put(cls, objCast);
            }
        }
        EnumC1295a enumC1295a = lVar.f15088m;
        boolean z6 = enumC1295a.f15003o;
        boolean z7 = lVar.f15089n.f15003o;
        if (!z7 && z6) {
            hVar.C(F5.c.f2325o);
        } else if (!z7 || z6) {
            if (!z7 && !z6) {
                hVar.C(f13726g);
            }
        } else if (enumC1295a.f15004p) {
            hVar.C(F5.c.f2324n);
        } else {
            hVar.C(f13725f);
        }
        return hVar.z();
    }

    public final o4.b f(h4.h hVar) throws Throwable {
        Throwable th;
        o4.b bVar;
        try {
            S5.l lVarC = c();
            C1004c c1004c = hVar.f12743o;
            if (c1004c.f12719p) {
                throw new IllegalStateException("snapshot is closed");
            }
            y yVarE = M3.a.E(lVarC.i((u) c1004c.f12718o.f12712c.get(0)));
            try {
                bVar = new o4.b(yVarE);
                try {
                    yVarE.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    yVarE.close();
                } catch (Throwable th4) {
                    N5.l.k(th3, th4);
                }
                th = th3;
                bVar = null;
            }
            if (th != null) {
                throw th;
            }
            AbstractC1209k.c(bVar);
            return bVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public final g4.m g(h4.h hVar) {
        C1004c c1004c = hVar.f12743o;
        if (c1004c.f12719p) {
            throw new IllegalStateException("snapshot is closed");
        }
        u uVar = (u) c1004c.f12718o.f12712c.get(1);
        S5.l lVarC = c();
        String str = this.f13728b.h;
        if (str == null) {
            str = this.f13727a;
        }
        return new g4.m(uVar, lVarC, str, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h4.h h(h4.h r5, F5.t r6, F5.v r7, o4.b r8) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.l.h(h4.h, F5.t, F5.v, o4.b):h4.h");
    }
}
