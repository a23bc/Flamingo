package N5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements R5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f5244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f5245b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f5244a = x509TrustManager;
        this.f5245b = method;
    }

    @Override // R5.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f5245b.invoke(this.f5244a, x509Certificate);
            AbstractC1209k.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("unable to get issues and signature", e7);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC1209k.a(this.f5244a, bVar.f5244a) && AbstractC1209k.a(this.f5245b, bVar.f5245b);
    }

    public final int hashCode() {
        return this.f5245b.hashCode() + (this.f5244a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f5244a + ", findByIssuerAndSignatureMethod=" + this.f5245b + ')';
    }
}
