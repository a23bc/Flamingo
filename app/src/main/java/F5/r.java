package F5;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Cloneable, d {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final List f2405N = G5.b.j(s.f2435s, s.f2433q);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final List f2406O = G5.b.j(i.f2362e, i.f2363f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f2407A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final SocketFactory f2408B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final SSLSocketFactory f2409C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final X509TrustManager f2410D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final List f2411E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final List f2412F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final R5.c f2413G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final e f2414H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final N5.d f2415I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f2416J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f2417K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f2418L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final A.b f2419M;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final U3.h f2420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A.b f2421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f2422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f2423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B2.g f2424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f2426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2427v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f2429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f2430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ProxySelector f2431z;

    public r() throws NoSuchAlgorithmException, KeyStoreException {
        U3.h hVar = new U3.h(1);
        A.b bVar = new A.b(14);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        B2.g gVar = new B2.g(8);
        b bVar2 = b.f2321a;
        b bVar3 = b.f2322b;
        b bVar4 = b.f2323c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC1209k.e(socketFactory, "getDefault()");
        List list = f2406O;
        List list2 = f2405N;
        R5.c cVar = R5.c.f6700a;
        e eVar = e.f2337c;
        this.f2420o = hVar;
        this.f2421p = bVar;
        this.f2422q = G5.b.u(arrayList);
        this.f2423r = G5.b.u(arrayList2);
        this.f2424s = gVar;
        this.f2425t = true;
        this.f2426u = bVar2;
        this.f2427v = true;
        this.f2428w = true;
        this.f2429x = bVar3;
        this.f2430y = bVar4;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2431z = proxySelector == null ? P5.a.f5764a : proxySelector;
        this.f2407A = bVar2;
        this.f2408B = socketFactory;
        this.f2411E = list;
        this.f2412F = list2;
        this.f2413G = cVar;
        this.f2416J = 10000;
        this.f2417K = 10000;
        this.f2418L = 10000;
        this.f2419M = new A.b(26);
        if ((list instanceof Collection) && list.isEmpty()) {
            this.f2409C = null;
            this.f2415I = null;
            this.f2410D = null;
            this.f2414H = e.f2337c;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f2364a) {
                    N5.n nVar = N5.n.f5271a;
                    X509TrustManager x509TrustManagerM = N5.n.f5271a.m();
                    this.f2410D = x509TrustManagerM;
                    this.f2409C = N5.n.f5271a.l(x509TrustManagerM);
                    N5.d dVarB = N5.n.f5271a.b(x509TrustManagerM);
                    this.f2415I = dVarB;
                    this.f2414H = AbstractC1209k.a(eVar.f2339b, dVarB) ? eVar : new e(eVar.f2338a, dVarB);
                }
            }
            this.f2409C = null;
            this.f2415I = null;
            this.f2410D = null;
            this.f2414H = e.f2337c;
        }
        List list3 = this.f2422q;
        AbstractC1209k.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List list4 = this.f2423r;
        AbstractC1209k.d(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list5 = this.f2411E;
        boolean z6 = list5 instanceof Collection;
        X509TrustManager x509TrustManager = this.f2410D;
        N5.d dVar = this.f2415I;
        SSLSocketFactory sSLSocketFactory = this.f2409C;
        if (!z6 || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((i) it2.next()).f2364a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (dVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (dVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC1209k.a(this.f2414H, e.f2337c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
