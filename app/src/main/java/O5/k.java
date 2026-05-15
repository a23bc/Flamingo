package O5;

import N2.z;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f5683a = new j();

    @Override // O5.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // O5.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // O5.n
    public final boolean c() {
        boolean z6 = N5.h.f5252d;
        return N5.h.f5252d;
    }

    @Override // O5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1209k.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            N5.n nVar = N5.n.f5271a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) z.d(list).toArray(new String[0]));
        }
    }
}
