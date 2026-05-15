package N5;

import N2.z;
import O5.o;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: e */
    public static final boolean f5246e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5247c;

    /* JADX INFO: renamed from: d */
    public final O5.i f5248d;

    static {
        boolean z6 = false;
        if (z.t() && Build.VERSION.SDK_INT < 30) {
            z6 = true;
        }
        f5246e = z6;
    }

    public c() throws NoSuchMethodException {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e7) {
            n.f5271a.getClass();
            n.i("unable to load android socket classes", 5, e7);
            oVar = null;
        }
        ArrayList arrayListG0 = Z4.l.g0(new O5.n[]{oVar, new O5.m(O5.f.f5673f), new O5.m(O5.k.f5683a), new O5.m(O5.h.f5679a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListG0) {
            if (((O5.n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f5247c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f5248d = new O5.i(method3, method, method2);
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
    public final R5.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // N5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC1209k.f(list, "protocols");
        Iterator it = this.f5247c.iterator();
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i7) throws IOException {
        AbstractC1209k.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i7);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // N5.n
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f5247c.iterator();
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
    public final Object g() {
        O5.i iVar = this.f5248d;
        iVar.getClass();
        Method method = iVar.f5680a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = iVar.f5681b;
                AbstractC1209k.c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // N5.n
    public final boolean h(String str) {
        AbstractC1209k.f(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // N5.n
    public final void j(Object obj, String str) {
        AbstractC1209k.f(str, "message");
        O5.i iVar = this.f5248d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f5682c;
                AbstractC1209k.c(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
