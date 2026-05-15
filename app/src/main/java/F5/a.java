package F5;

import a.AbstractC0509a;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f2313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f2315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f2316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f2317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f2318g;
    public final o h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f2319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f2320j;

    public a(String str, int i7, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        AbstractC1209k.f(str, "uriHost");
        AbstractC1209k.f(bVar, "dns");
        AbstractC1209k.f(socketFactory, "socketFactory");
        AbstractC1209k.f(bVar2, "proxyAuthenticator");
        AbstractC1209k.f(list, "protocols");
        AbstractC1209k.f(list2, "connectionSpecs");
        AbstractC1209k.f(proxySelector, "proxySelector");
        this.f2312a = bVar;
        this.f2313b = socketFactory;
        this.f2314c = sSLSocketFactory;
        this.f2315d = hostnameVerifier;
        this.f2316e = eVar;
        this.f2317f = bVar2;
        this.f2318g = proxySelector;
        n nVar = new n();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            nVar.f2386a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            nVar.f2386a = "https";
        }
        String strA0 = AbstractC0509a.a0(b.e(str, 0, 0, 7));
        if (strA0 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        nVar.f2389d = strA0;
        if (1 > i7 || i7 >= 65536) {
            throw new IllegalArgumentException(n1.c.s(i7, "unexpected port: ").toString());
        }
        nVar.f2390e = i7;
        this.h = nVar.a();
        this.f2319i = G5.b.u(list);
        this.f2320j = G5.b.u(list2);
    }

    public final boolean a(a aVar) {
        AbstractC1209k.f(aVar, "that");
        return AbstractC1209k.a(this.f2312a, aVar.f2312a) && AbstractC1209k.a(this.f2317f, aVar.f2317f) && AbstractC1209k.a(this.f2319i, aVar.f2319i) && AbstractC1209k.a(this.f2320j, aVar.f2320j) && AbstractC1209k.a(this.f2318g, aVar.f2318g) && AbstractC1209k.a(this.f2314c, aVar.f2314c) && AbstractC1209k.a(this.f2315d, aVar.f2315d) && AbstractC1209k.a(this.f2316e, aVar.f2316e) && this.h.f2398e == aVar.h.f2398e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1209k.a(this.h, aVar.h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2316e) + ((Objects.hashCode(this.f2315d) + ((Objects.hashCode(this.f2314c) + ((this.f2318g.hashCode() + ((this.f2320j.hashCode() + ((this.f2319i.hashCode() + ((this.f2317f.hashCode() + ((this.f2312a.hashCode() + A0.e.C(this.h.h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.h;
        sb.append(oVar.f2397d);
        sb.append(':');
        sb.append(oVar.f2398e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2318g);
        sb.append('}');
        return sb.toString();
    }
}
