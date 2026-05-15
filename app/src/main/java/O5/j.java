package O5;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l {
    @Override // O5.l
    public final boolean a(SSLSocket sSLSocket) {
        return N5.h.f5252d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // O5.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
