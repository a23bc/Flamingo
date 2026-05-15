package O5;

import javax.net.ssl.SSLSocket;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {
    @Override // O5.l
    public final boolean a(SSLSocket sSLSocket) {
        return AbstractC1552n.K(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // O5.l
    public final n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(superclass);
    }
}
