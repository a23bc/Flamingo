package O5;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends N5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f5668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f5669b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f5668a = x509TrustManager;
        this.f5669b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f5668a == this.f5668a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5668a);
    }

    @Override // N5.d
    public final List v(String str, List list) throws SSLPeerUnverifiedException {
        AbstractC1209k.f(list, "chain");
        AbstractC1209k.f(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f5669b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            AbstractC1209k.e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }
}
