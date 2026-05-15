package J5;

import C2.N;
import F5.o;
import F5.r;
import F5.s;
import F5.t;
import F5.u;
import S5.E;
import S5.w;
import S5.y;
import Z4.v;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import u5.C1543e;

/* JADX INFO: loaded from: classes.dex */
public final class n implements K5.e {

    /* JADX INFO: renamed from: a */
    public int f3807a;

    /* JADX INFO: renamed from: b */
    public final Object f3808b;

    /* JADX INFO: renamed from: c */
    public final Object f3809c;

    /* JADX INFO: renamed from: d */
    public final Object f3810d;

    /* JADX INFO: renamed from: e */
    public final Object f3811e;

    /* JADX INFO: renamed from: f */
    public Object f3812f;

    /* JADX INFO: renamed from: g */
    public Iterable f3813g;

    public n(F5.a aVar, A.b bVar, h hVar) {
        List listJ;
        AbstractC1209k.f(bVar, "routeDatabase");
        AbstractC1209k.f(hVar, "call");
        this.f3808b = aVar;
        this.f3809c = bVar;
        this.f3810d = hVar;
        v vVar = v.f8818o;
        this.f3811e = vVar;
        this.f3812f = vVar;
        this.f3813g = new ArrayList();
        o oVar = aVar.h;
        AbstractC1209k.f(oVar, "url");
        URI uriG = oVar.g();
        if (uriG.getHost() == null) {
            listJ = G5.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = aVar.f2318g.select(uriG);
            listJ = (listSelect == null || listSelect.isEmpty()) ? G5.b.j(Proxy.NO_PROXY) : G5.b.u(listSelect);
        }
        this.f3811e = listJ;
        this.f3807a = 0;
    }

    @Override // K5.e
    public void a(t tVar) {
        AbstractC1209k.f(tVar, "request");
        Proxy.Type type = ((k) this.f3809c).f3787b.f2474b.type();
        AbstractC1209k.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) tVar.f2442q);
        sb.append(' ');
        o oVar = (o) tVar.f2441p;
        if (oVar.f2401i || type != Proxy.Type.HTTP) {
            String strB = oVar.b();
            String strD = oVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC1209k.e(string, "StringBuilder().apply(builderAction).toString()");
        k((F5.m) tVar.f2443r, string);
    }

    @Override // K5.e
    public void b() {
        ((w) this.f3811e).flush();
    }

    @Override // K5.e
    public void c() {
        ((w) this.f3811e).flush();
    }

    @Override // K5.e
    public void cancel() {
        Socket socket = ((k) this.f3809c).f3788c;
        if (socket != null) {
            G5.b.c(socket);
        }
    }

    @Override // K5.e
    public E d(F5.v vVar) {
        if (!K5.f.a(vVar)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(F5.v.b(vVar, "Transfer-Encoding"))) {
            o oVar = (o) vVar.f2459o.f2441p;
            if (this.f3807a == 4) {
                this.f3807a = 5;
                return new L5.b(this, oVar);
            }
            throw new IllegalStateException(("state: " + this.f3807a).toString());
        }
        long jI = G5.b.i(vVar);
        if (jI != -1) {
            return i(jI);
        }
        if (this.f3807a == 4) {
            this.f3807a = 5;
            ((k) this.f3809c).l();
            return new L5.d(this);
        }
        throw new IllegalStateException(("state: " + this.f3807a).toString());
    }

    @Override // K5.e
    public long e(F5.v vVar) {
        if (!K5.f.a(vVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(F5.v.b(vVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return G5.b.i(vVar);
    }

    @Override // K5.e
    public u f(boolean z6) {
        N n7 = (N) this.f3812f;
        int i7 = this.f3807a;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f3807a).toString());
        }
        try {
            String strS = ((y) n7.f1006p).s(n7.f1005o);
            n7.f1005o -= (long) strS.length();
            D4.i iVarA0 = M3.a.a0(strS);
            int i8 = iVarA0.f1582p;
            u uVar = new u();
            uVar.f2447b = (s) iVarA0.f1583q;
            uVar.f2448c = i8;
            uVar.f2449d = (String) iVarA0.f1584r;
            uVar.f2451f = n7.r().g();
            if (z6 && i8 == 100) {
                return null;
            }
            if (i8 == 100) {
                this.f3807a = 3;
                return uVar;
            }
            if (102 > i8 || i8 >= 200) {
                this.f3807a = 4;
                return uVar;
            }
            this.f3807a = 3;
            return uVar;
        } catch (EOFException e7) {
            throw new IOException("unexpected end of stream on ".concat(((k) this.f3809c).f3787b.f2473a.h.f()), e7);
        }
    }

    @Override // K5.e
    public k g() {
        return (k) this.f3809c;
    }

    public boolean h() {
        return this.f3807a < ((List) this.f3811e).size() || !((ArrayList) this.f3813g).isEmpty();
    }

    public L5.c i(long j3) {
        if (this.f3807a == 4) {
            this.f3807a = 5;
            return new L5.c(this, j3);
        }
        throw new IllegalStateException(("state: " + this.f3807a).toString());
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.List] */
    public C1.k j() {
        String hostAddress;
        int port;
        List listG;
        boolean zContains;
        if (!h()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f3807a < ((List) this.f3811e).size()) {
            boolean z6 = this.f3807a < ((List) this.f3811e).size();
            F5.a aVar = (F5.a) this.f3808b;
            if (!z6) {
                throw new SocketException("No route to " + aVar.h.f2397d + "; exhausted proxy configurations: " + ((List) this.f3811e));
            }
            List list = (List) this.f3811e;
            int i7 = this.f3807a;
            this.f3807a = i7 + 1;
            Proxy proxy = (Proxy) list.get(i7);
            ArrayList arrayList2 = new ArrayList();
            this.f3812f = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                o oVar = aVar.h;
                hostAddress = oVar.f2397d;
                port = oVar.f2398e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                AbstractC1209k.e(socketAddressAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                AbstractC1209k.f(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    AbstractC1209k.e(hostAddress, "hostName");
                } else {
                    hostAddress = address.getHostAddress();
                    AbstractC1209k.e(hostAddress, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                byte[] bArr = G5.b.f2765a;
                AbstractC1209k.f(hostAddress, "<this>");
                C1543e c1543e = G5.b.f2769e;
                c1543e.getClass();
                if (c1543e.f17323o.matcher(hostAddress).matches()) {
                    listG = I0.c.G(InetAddress.getByName(hostAddress));
                } else {
                    AbstractC1209k.f((h) this.f3810d, "call");
                    aVar.f2312a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        AbstractC1209k.e(allByName, "getAllByName(hostname)");
                        List listP0 = Z4.l.p0(allByName);
                        if (listP0.isEmpty()) {
                            throw new UnknownHostException(aVar.f2312a + " returned no addresses for " + hostAddress);
                        }
                        listG = listP0;
                    } catch (NullPointerException e7) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e7);
                        throw unknownHostException;
                    }
                }
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.f3812f.iterator();
            while (it2.hasNext()) {
                F5.y yVar = new F5.y((F5.a) this.f3808b, proxy, (InetSocketAddress) it2.next());
                A.b bVar = (A.b) this.f3809c;
                synchronized (bVar) {
                    zContains = ((LinkedHashSet) bVar.f3p).contains(yVar);
                }
                if (zContains) {
                    ((ArrayList) this.f3813g).add(yVar);
                } else {
                    arrayList.add(yVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            Z4.t.l0(arrayList, (ArrayList) this.f3813g);
            ((ArrayList) this.f3813g).clear();
        }
        C1.k kVar = new C1.k();
        kVar.f960p = arrayList;
        return kVar;
    }

    public void k(F5.m mVar, String str) {
        AbstractC1209k.f(str, "requestLine");
        if (this.f3807a != 0) {
            throw new IllegalStateException(("state: " + this.f3807a).toString());
        }
        w wVar = (w) this.f3811e;
        wVar.v(str);
        wVar.v("\r\n");
        int size = mVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            wVar.v(mVar.e(i7));
            wVar.v(": ");
            wVar.v(mVar.i(i7));
            wVar.v("\r\n");
        }
        wVar.v("\r\n");
        this.f3807a = 1;
    }

    public n(r rVar, k kVar, y yVar, w wVar) {
        AbstractC1209k.f(kVar, "connection");
        AbstractC1209k.f(yVar, "source");
        AbstractC1209k.f(wVar, "sink");
        this.f3808b = rVar;
        this.f3809c = kVar;
        this.f3810d = yVar;
        this.f3811e = wVar;
        AbstractC1209k.f(yVar, "source");
        N n7 = new N();
        n7.f1006p = yVar;
        n7.f1005o = 262144L;
        this.f3812f = n7;
    }
}
