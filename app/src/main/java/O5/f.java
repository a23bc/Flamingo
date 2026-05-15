package O5;

import N2.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;
import u5.AbstractC1539a;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f5673f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f5675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f5676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f5677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f5678e;

    public f(Class cls) throws NoSuchMethodException {
        this.f5674a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC1209k.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f5675b = declaredMethod;
        this.f5676c = cls.getMethod("setHostname", String.class);
        this.f5677d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f5678e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // O5.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f5674a.isInstance(sSLSocket);
    }

    @Override // O5.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f5674a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f5677d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, AbstractC1539a.f17313a);
            }
            return null;
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if ((cause instanceof NullPointerException) && AbstractC1209k.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e8);
        }
    }

    @Override // O5.n
    public final boolean c() {
        boolean z6 = N5.c.f5246e;
        return N5.c.f5246e;
    }

    @Override // O5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1209k.f(list, "protocols");
        if (this.f5674a.isInstance(sSLSocket)) {
            try {
                this.f5675b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f5676c.invoke(sSLSocket, str);
                }
                Method method = this.f5678e;
                N5.n nVar = N5.n.f5271a;
                method.invoke(sSLSocket, z.g(list));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }
}
