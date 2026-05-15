package O5;

import N2.z;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5679a = new g();

    @Override // O5.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // O5.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // O5.n
    public final boolean c() {
        boolean z6 = N5.e.f5249d;
        return N5.e.f5249d;
    }

    @Override // O5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1209k.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            N5.n nVar = N5.n.f5271a;
            parameters.setApplicationProtocols((String[]) z.d(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
