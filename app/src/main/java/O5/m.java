package O5;

import java.util.List;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f5685b;

    public m(l lVar) {
        this.f5684a = lVar;
    }

    @Override // O5.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f5684a.a(sSLSocket);
    }

    @Override // O5.n
    public final String b(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.b(sSLSocket);
        }
        return null;
    }

    @Override // O5.n
    public final boolean c() {
        return true;
    }

    @Override // O5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1209k.f(list, "protocols");
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f5685b == null && this.f5684a.a(sSLSocket)) {
                this.f5685b = this.f5684a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5685b;
    }
}
