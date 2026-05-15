package N5;

import F5.s;
import Z4.p;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f5257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f5258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f5259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f5260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f5261g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f5257c = method;
        this.f5258d = method2;
        this.f5259e = method3;
        this.f5260f = cls;
        this.f5261g = cls2;
    }

    @Override // N5.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f5259e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // N5.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1209k.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s) obj) != s.f2432p) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.j0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f2439o);
        }
        try {
            this.f5257c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f5260f, this.f5261g}, new i(arrayList2)));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // N5.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f5258d.invoke(null, sSLSocket));
            AbstractC1209k.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z6 = iVar.f5255b;
            if (!z6 && iVar.f5256c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z6) {
                return null;
            }
            return iVar.f5256c;
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}
