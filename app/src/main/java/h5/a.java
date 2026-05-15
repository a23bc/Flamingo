package H5;

import F5.u;
import F5.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final v a(v vVar) {
        if ((vVar != null ? vVar.f2465u : null) == null) {
            return vVar;
        }
        u uVarC = vVar.c();
        uVarC.f2452g = null;
        return uVarC.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
