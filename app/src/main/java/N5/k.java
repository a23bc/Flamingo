package N5;

import F5.s;
import Z4.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f5262c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numL = property != null ? AbstractC1552n.L(property) : null;
        boolean z6 = true;
        if (numL == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z6 = false;
            }
        } else if (numL.intValue() < 9) {
            z6 = false;
        }
        f5262c = z6;
    }

    @Override // N5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1209k.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s) obj) != s.f2432p) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.j0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f2439o);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // N5.n
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
