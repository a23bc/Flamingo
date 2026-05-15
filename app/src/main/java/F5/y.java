package F5;

import java.net.InetSocketAddress;
import java.net.Proxy;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f2474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2475c;

    public y(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC1209k.f(inetSocketAddress, "socketAddress");
        this.f2473a = aVar;
        this.f2474b = proxy;
        this.f2475c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return AbstractC1209k.a(yVar.f2473a, this.f2473a) && AbstractC1209k.a(yVar.f2474b, this.f2474b) && AbstractC1209k.a(yVar.f2475c, this.f2475c);
    }

    public final int hashCode() {
        return this.f2475c.hashCode() + ((this.f2474b.hashCode() + ((this.f2473a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2475c + '}';
    }
}
