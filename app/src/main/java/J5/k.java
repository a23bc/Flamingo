package J5;

import E0.C0096g;
import F5.r;
import F5.s;
import F5.t;
import F5.u;
import F5.v;
import F5.y;
import M5.B;
import M5.o;
import M5.p;
import M5.x;
import S5.G;
import S5.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m5.AbstractC1209k;
import u5.AbstractC1546h;

/* JADX INFO: loaded from: classes.dex */
public final class k extends M5.h {

    /* JADX INFO: renamed from: b */
    public final y f3787b;

    /* JADX INFO: renamed from: c */
    public Socket f3788c;

    /* JADX INFO: renamed from: d */
    public Socket f3789d;

    /* JADX INFO: renamed from: e */
    public F5.l f3790e;

    /* JADX INFO: renamed from: f */
    public s f3791f;

    /* JADX INFO: renamed from: g */
    public o f3792g;
    public S5.y h;

    /* JADX INFO: renamed from: i */
    public w f3793i;

    /* JADX INFO: renamed from: j */
    public boolean f3794j;

    /* JADX INFO: renamed from: k */
    public boolean f3795k;
    public int l;

    /* JADX INFO: renamed from: m */
    public int f3796m;

    /* JADX INFO: renamed from: n */
    public int f3797n;

    /* JADX INFO: renamed from: o */
    public int f3798o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f3799p;

    /* JADX INFO: renamed from: q */
    public long f3800q;

    public k(l lVar, y yVar) {
        AbstractC1209k.f(lVar, "connectionPool");
        AbstractC1209k.f(yVar, "route");
        this.f3787b = yVar;
        this.f3798o = 1;
        this.f3799p = new ArrayList();
        this.f3800q = Long.MAX_VALUE;
    }

    public static void d(r rVar, y yVar, IOException iOException) {
        AbstractC1209k.f(rVar, "client");
        AbstractC1209k.f(yVar, "failedRoute");
        AbstractC1209k.f(iOException, "failure");
        if (yVar.f2474b.type() != Proxy.Type.DIRECT) {
            F5.a aVar = yVar.f2473a;
            aVar.f2318g.connectFailed(aVar.h.g(), yVar.f2474b.address(), iOException);
        }
        A.b bVar = rVar.f2419M;
        synchronized (bVar) {
            ((LinkedHashSet) bVar.f3p).add(yVar);
        }
    }

    @Override // M5.h
    public final synchronized void a(o oVar, B b7) {
        AbstractC1209k.f(oVar, "connection");
        AbstractC1209k.f(b7, "settings");
        this.f3798o = (b7.f4827a & 16) != 0 ? b7.f4828b[4] : Integer.MAX_VALUE;
    }

    @Override // M5.h
    public final void b(M5.w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i7, int i8, int i9, boolean z6, h hVar) throws Throwable {
        y yVar;
        AbstractC1209k.f(hVar, "call");
        if (this.f3791f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3787b.f2473a.f2320j;
        b bVar = new b(list);
        F5.a aVar = this.f3787b.f2473a;
        if (aVar.f2314c == null) {
            if (!list.contains(F5.i.f2363f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3787b.f2473a.h.f2397d;
            N5.n nVar = N5.n.f5271a;
            if (!N5.n.f5271a.h(str)) {
                throw new m(new UnknownServiceException(Z1.l.q("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f2319i.contains(s.f2436t)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                y yVar2 = this.f3787b;
                if (yVar2.f2473a.f2314c != null && yVar2.f2474b.type() == Proxy.Type.HTTP) {
                    f(i7, i8, i9, hVar);
                    if (this.f3788c == null) {
                    }
                    yVar = this.f3787b;
                    if (yVar.f2473a.f2314c == null && yVar.f2474b.type() == Proxy.Type.HTTP && this.f3788c == null) {
                        throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f3800q = System.nanoTime();
                    return;
                }
                e(i7, i8, hVar);
                g(bVar, hVar);
                AbstractC1209k.f(this.f3787b.f2475c, "inetSocketAddress");
                yVar = this.f3787b;
                if (yVar.f2473a.f2314c == null) {
                }
                this.f3800q = System.nanoTime();
                return;
            } catch (IOException e7) {
                Socket socket = this.f3789d;
                if (socket != null) {
                    G5.b.c(socket);
                }
                Socket socket2 = this.f3788c;
                if (socket2 != null) {
                    G5.b.c(socket2);
                }
                this.f3789d = null;
                this.f3788c = null;
                this.h = null;
                this.f3793i = null;
                this.f3790e = null;
                this.f3791f = null;
                this.f3792g = null;
                this.f3798o = 1;
                AbstractC1209k.f(this.f3787b.f2475c, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new m(e7);
                } else {
                    N5.l.k(mVar.f3805o, e7);
                    mVar.f3806p = e7;
                }
                if (!z6) {
                    throw mVar;
                }
                bVar.f3747d = true;
                if (!bVar.f3746c) {
                    throw mVar;
                }
                if (e7 instanceof ProtocolException) {
                    throw mVar;
                }
                if (e7 instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e7 instanceof SSLHandshakeException) && (e7.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e7 instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e7 instanceof SSLException);
        throw mVar;
    }

    public final void e(int i7, int i8, h hVar) throws IOException {
        Socket socketCreateSocket;
        y yVar = this.f3787b;
        Proxy proxy = yVar.f2474b;
        F5.a aVar = yVar.f2473a;
        Proxy.Type type = proxy.type();
        int i9 = type == null ? -1 : i.f3782a[type.ordinal()];
        if (i9 == 1 || i9 == 2) {
            socketCreateSocket = aVar.f2313b.createSocket();
            AbstractC1209k.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f3788c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f3787b.f2475c;
        AbstractC1209k.f(hVar, "call");
        AbstractC1209k.f(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i8);
        try {
            N5.n nVar = N5.n.f5271a;
            N5.n.f5271a.e(socketCreateSocket, this.f3787b.f2475c, i7);
            try {
                this.h = M3.a.E(M3.a.h0(socketCreateSocket));
                this.f3793i = M3.a.D(M3.a.f0(socketCreateSocket));
            } catch (NullPointerException e7) {
                if (AbstractC1209k.a(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3787b.f2475c);
            connectException.initCause(e8);
            throw connectException;
        }
    }

    public final void f(int i7, int i8, int i9, h hVar) throws IOException {
        U3.h hVar2 = new U3.h(2);
        y yVar = this.f3787b;
        F5.o oVar = yVar.f2473a.h;
        AbstractC1209k.f(oVar, "url");
        hVar2.f7042o = oVar;
        hVar2.f0("CONNECT", null);
        F5.a aVar = yVar.f2473a;
        hVar2.Y("Host", G5.b.t(aVar.h, true));
        hVar2.Y("Proxy-Connection", "Keep-Alive");
        hVar2.Y("User-Agent", "okhttp/4.12.0");
        t tVarZ = hVar2.z();
        C0096g c0096g = new C0096g(1);
        M3.a.G("Proxy-Authenticate");
        M3.a.H("OkHttp-Preemptive", "Proxy-Authenticate");
        c0096g.r("Proxy-Authenticate");
        c0096g.f("Proxy-Authenticate", "OkHttp-Preemptive");
        c0096g.h();
        aVar.f2317f.getClass();
        e(i7, i8, hVar);
        String str = "CONNECT " + G5.b.t((F5.o) tVarZ.f2441p, true) + " HTTP/1.1";
        S5.y yVar2 = this.h;
        AbstractC1209k.c(yVar2);
        w wVar = this.f3793i;
        AbstractC1209k.c(wVar);
        n nVar = new n(null, this, yVar2, wVar);
        G gA = yVar2.f6822o.a();
        long j3 = i8;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gA.g(j3);
        wVar.f6818o.a().g(i9);
        nVar.k((F5.m) tVarZ.f2443r, str);
        nVar.b();
        u uVarF = nVar.f(false);
        AbstractC1209k.c(uVarF);
        uVarF.f2446a = tVarZ;
        v vVarA = uVarF.a();
        long jI = G5.b.i(vVarA);
        if (jI != -1) {
            L5.c cVarI = nVar.i(jI);
            G5.b.r(cVarI, Integer.MAX_VALUE);
            cVarI.close();
        }
        int i10 = vVarA.f2462r;
        if (i10 != 200) {
            if (i10 != 407) {
                throw new IOException(n1.c.s(i10, "Unexpected response code for CONNECT: "));
            }
            aVar.f2317f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!yVar2.f6823p.d() || !wVar.f6819p.d()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, h hVar) throws Throwable {
        SSLSocket sSLSocket;
        F5.a aVar = this.f3787b.f2473a;
        SSLSocketFactory sSLSocketFactory = aVar.f2314c;
        s sVarY = s.f2433q;
        if (sSLSocketFactory == null) {
            List list = aVar.f2319i;
            s sVar = s.f2436t;
            if (!list.contains(sVar)) {
                this.f3789d = this.f3788c;
                this.f3791f = sVarY;
                return;
            } else {
                this.f3789d = this.f3788c;
                this.f3791f = sVar;
                m();
                return;
            }
        }
        AbstractC1209k.f(hVar, "call");
        F5.a aVar2 = this.f3787b.f2473a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f2314c;
        SSLSocket sSLSocket2 = null;
        String strF = null;
        try {
            AbstractC1209k.c(sSLSocketFactory2);
            Socket socket = this.f3788c;
            F5.o oVar = aVar2.h;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, oVar.f2397d, oVar.f2398e, true);
            AbstractC1209k.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            F5.i iVarA = bVar.a(sSLSocket);
            if (iVarA.f2365b) {
                N5.n nVar = N5.n.f5271a;
                N5.n.f5271a.d(sSLSocket, aVar2.h.f2397d, aVar2.f2319i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            AbstractC1209k.e(session, "sslSocketSession");
            F5.l lVarY = I0.c.y(session);
            HostnameVerifier hostnameVerifier = aVar2.f2315d;
            AbstractC1209k.c(hostnameVerifier);
            if (!hostnameVerifier.verify(aVar2.h.f2397d, session)) {
                List listA = lVarY.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.f2397d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                AbstractC1209k.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.f2397d);
                sb.append(" not verified:\n              |    certificate: ");
                F5.e eVar = F5.e.f2337c;
                sb.append(android.support.v4.media.session.b.C(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(Z4.n.B0(R5.c.a(x509Certificate, 7), R5.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC1546h.D(sb.toString()));
            }
            F5.e eVar2 = aVar2.f2316e;
            AbstractC1209k.c(eVar2);
            this.f3790e = new F5.l(lVarY.f2381a, lVarY.f2382b, lVarY.f2383c, new j(eVar2, lVarY, aVar2, 0));
            AbstractC1209k.f(aVar2.h.f2397d, "hostname");
            Iterator it = eVar2.f2338a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (iVarA.f2365b) {
                N5.n nVar2 = N5.n.f5271a;
                strF = N5.n.f5271a.f(sSLSocket);
            }
            this.f3789d = sSLSocket;
            this.h = M3.a.E(M3.a.h0(sSLSocket));
            this.f3793i = M3.a.D(M3.a.f0(sSLSocket));
            if (strF != null) {
                sVarY = N5.l.y(strF);
            }
            this.f3791f = sVarY;
            N5.n nVar3 = N5.n.f5271a;
            N5.n.f5271a.a(sSLSocket);
            if (this.f3791f == s.f2435s) {
                m();
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                N5.n nVar4 = N5.n.f5271a;
                N5.n.f5271a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                G5.b.c(sSLSocket2);
            }
            throw th;
        }
    }

    public final synchronized void h() {
        this.f3796m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(F5.a r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.k.i(F5.a, java.util.List):boolean");
    }

    public final boolean j(boolean z6) {
        long j3;
        byte[] bArr = G5.b.f2765a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f3788c;
        AbstractC1209k.c(socket);
        Socket socket2 = this.f3789d;
        AbstractC1209k.c(socket2);
        AbstractC1209k.c(this.h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o oVar = this.f3792g;
        if (oVar != null) {
            return oVar.d(jNanoTime);
        }
        synchronized (this) {
            j3 = jNanoTime - this.f3800q;
        }
        if (j3 < 10000000000L || !z6) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final K5.e k(r rVar, G.t tVar) {
        AbstractC1209k.f(rVar, "client");
        Socket socket = this.f3789d;
        AbstractC1209k.c(socket);
        S5.y yVar = this.h;
        AbstractC1209k.c(yVar);
        w wVar = this.f3793i;
        AbstractC1209k.c(wVar);
        o oVar = this.f3792g;
        if (oVar != null) {
            return new p(rVar, this, tVar, oVar);
        }
        int i7 = tVar.f2593d;
        socket.setSoTimeout(i7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.f6822o.a().g(i7);
        wVar.f6818o.a().g(tVar.f2594e);
        return new n(rVar, this, yVar, wVar);
    }

    public final synchronized void l() {
        this.f3794j = true;
    }

    public final void m() throws SocketException {
        Socket socket = this.f3789d;
        AbstractC1209k.c(socket);
        S5.y yVar = this.h;
        AbstractC1209k.c(yVar);
        w wVar = this.f3793i;
        AbstractC1209k.c(wVar);
        socket.setSoTimeout(0);
        I5.d dVar = I5.d.f3554i;
        B2.h hVar = new B2.h(dVar);
        String str = this.f3787b.f2473a.h.f2397d;
        AbstractC1209k.f(str, "peerName");
        hVar.f750b = socket;
        String str2 = G5.b.f2770f + ' ' + str;
        AbstractC1209k.f(str2, "<set-?>");
        hVar.f751c = str2;
        hVar.f752d = yVar;
        hVar.f753e = wVar;
        hVar.f754f = this;
        o oVar = new o(hVar);
        this.f3792g = oVar;
        B b7 = o.f4877N;
        this.f3798o = (b7.f4827a & 16) != 0 ? b7.f4828b[4] : Integer.MAX_VALUE;
        x xVar = oVar.f4888K;
        synchronized (xVar) {
            try {
                if (xVar.f4947r) {
                    throw new IOException("closed");
                }
                Logger logger = x.f4943t;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(G5.b.g(">> CONNECTION " + M5.f.f4854a.d(), new Object[0]));
                }
                w wVar2 = xVar.f4944o;
                S5.j jVar = M5.f.f4854a;
                wVar2.getClass();
                AbstractC1209k.f(jVar, "byteString");
                if (wVar2.f6820q) {
                    throw new IllegalStateException("closed");
                }
                wVar2.f6819p.B(jVar);
                wVar2.b();
                xVar.f4944o.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        oVar.f4888K.n(oVar.f4881D);
        if (oVar.f4881D.a() != 65535) {
            oVar.f4888K.o(r1 - 65535, 0);
        }
        dVar.e().c(new I5.b(oVar.f4893q, oVar.f4889L, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        y yVar = this.f3787b;
        sb.append(yVar.f2473a.h.f2397d);
        sb.append(':');
        sb.append(yVar.f2473a.h.f2398e);
        sb.append(", proxy=");
        sb.append(yVar.f2474b);
        sb.append(" hostAddress=");
        sb.append(yVar.f2475c);
        sb.append(" cipherSuite=");
        F5.l lVar = this.f3790e;
        if (lVar == null || (obj = lVar.f2382b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3791f);
        sb.append('}');
        return sb.toString();
    }
}
