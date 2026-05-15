package O5;

import N2.z;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    @Override // O5.n
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // O5.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // O5.n
    public final boolean c() {
        N5.n nVar = N5.n.f5271a;
        return z.t() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // O5.n
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        AbstractC1209k.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            N5.n nVar = N5.n.f5271a;
            sSLParameters.setApplicationProtocols((String[]) z.d(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e7) {
            throw new IOException("Android internal error", e7);
        }
    }
}
