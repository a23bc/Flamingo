package N5;

import N2.z;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f5242d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5243c;

    static {
        f5242d = z.t() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListG0 = Z4.l.g0(new O5.n[]{(!z.t() || Build.VERSION.SDK_INT < 29) ? null : new O5.a(), new O5.m(O5.f.f5673f), new O5.m(O5.k.f5683a), new O5.m(O5.h.f5679a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListG0) {
            if (((O5.n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f5243c = arrayList;
    }

    @Override // N5.n
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        O5.b bVar = x509TrustManagerExtensions != null ? new O5.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new R5.a(c(x509TrustManager));
    }

    @Override // N5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC1209k.f(list, "protocols");
        Iterator it = this.f5243c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((O5.n) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        O5.n nVar = (O5.n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // N5.n
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f5243c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((O5.n) next).a(sSLSocket)) {
                break;
            }
        }
        O5.n nVar = (O5.n) next;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // N5.n
    public final boolean h(String str) {
        AbstractC1209k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
