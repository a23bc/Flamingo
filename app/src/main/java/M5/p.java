package M5;

import E0.C0096g;
import S5.E;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class p implements K5.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f4903g = G5.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = G5.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J5.k f4904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G.t f4905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f4906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile w f4907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F5.s f4908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f4909f;

    public p(F5.r rVar, J5.k kVar, G.t tVar, o oVar) {
        AbstractC1209k.f(rVar, "client");
        AbstractC1209k.f(kVar, "connection");
        AbstractC1209k.f(oVar, "http2Connection");
        this.f4904a = kVar;
        this.f4905b = tVar;
        this.f4906c = oVar;
        F5.s sVar = F5.s.f2436t;
        this.f4908e = rVar.f2412F.contains(sVar) ? sVar : F5.s.f2435s;
    }

    @Override // K5.e
    public final void a(F5.t tVar) throws IOException {
        int i7;
        w wVar;
        AbstractC1209k.f(tVar, "request");
        if (this.f4907d != null) {
            return;
        }
        tVar.getClass();
        F5.m mVar = (F5.m) tVar.f2443r;
        ArrayList arrayList = new ArrayList(mVar.size() + 4);
        arrayList.add(new C0282b(C0282b.f4832f, (String) tVar.f2442q));
        S5.j jVar = C0282b.f4833g;
        F5.o oVar = (F5.o) tVar.f2441p;
        AbstractC1209k.f(oVar, "url");
        String strB = oVar.b();
        String strD = oVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new C0282b(jVar, strB));
        String strB2 = ((F5.m) tVar.f2443r).b("Host");
        if (strB2 != null) {
            arrayList.add(new C0282b(C0282b.f4834i, strB2));
        }
        arrayList.add(new C0282b(C0282b.h, oVar.f2394a));
        int size = mVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            String strE = mVar.e(i8);
            Locale locale = Locale.US;
            AbstractC1209k.e(locale, "US");
            String lowerCase = strE.toLowerCase(locale);
            AbstractC1209k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f4903g.contains(lowerCase) || (lowerCase.equals("te") && AbstractC1209k.a(mVar.i(i8), "trailers"))) {
                arrayList.add(new C0282b(lowerCase, mVar.i(i8)));
            }
        }
        o oVar2 = this.f4906c;
        oVar2.getClass();
        boolean z6 = !false;
        synchronized (oVar2.f4888K) {
            synchronized (oVar2) {
                try {
                    if (oVar2.f4895s > 1073741823) {
                        oVar2.h(8);
                    }
                    if (oVar2.f4896t) {
                        throw new C0281a();
                    }
                    i7 = oVar2.f4895s;
                    oVar2.f4895s = i7 + 2;
                    wVar = new w(i7, oVar2, z6, false, null);
                    if (wVar.h()) {
                        oVar2.f4892p.put(Integer.valueOf(i7), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar2.f4888K.h(z6, i7, arrayList);
        }
        oVar2.f4888K.flush();
        this.f4907d = wVar;
        if (this.f4909f) {
            w wVar2 = this.f4907d;
            AbstractC1209k.c(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.f4907d;
        AbstractC1209k.c(wVar3);
        v vVar = wVar3.f4940k;
        long j3 = this.f4905b.f2593d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j3);
        w wVar4 = this.f4907d;
        AbstractC1209k.c(wVar4);
        wVar4.l.g(this.f4905b.f2594e);
    }

    @Override // K5.e
    public final void b() throws SocketTimeoutException {
        w wVar = this.f4907d;
        AbstractC1209k.c(wVar);
        synchronized (wVar) {
            if (!wVar.h && !wVar.g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        wVar.f4939j.close();
    }

    @Override // K5.e
    public final void c() {
        this.f4906c.flush();
    }

    @Override // K5.e
    public final void cancel() {
        this.f4909f = true;
        w wVar = this.f4907d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // K5.e
    public final E d(F5.v vVar) {
        w wVar = this.f4907d;
        AbstractC1209k.c(wVar);
        return wVar.f4938i;
    }

    @Override // K5.e
    public final long e(F5.v vVar) {
        if (K5.f.a(vVar)) {
            return G5.b.i(vVar);
        }
        return 0L;
    }

    @Override // K5.e
    public final F5.u f(boolean z6) throws IOException {
        F5.m mVar;
        w wVar = this.f4907d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f4940k.h();
            while (wVar.f4937g.isEmpty() && wVar.f4941m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f4940k.k();
                    throw th;
                }
            }
            wVar.f4940k.k();
            if (wVar.f4937g.isEmpty()) {
                IOException iOException = wVar.f4942n;
                if (iOException != null) {
                    throw iOException;
                }
                int i7 = wVar.f4941m;
                Z1.l.v(i7);
                throw new C(i7);
            }
            Object objRemoveFirst = wVar.f4937g.removeFirst();
            AbstractC1209k.e(objRemoveFirst, "headersQueue.removeFirst()");
            mVar = (F5.m) objRemoveFirst;
        }
        F5.s sVar = this.f4908e;
        AbstractC1209k.f(sVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = mVar.size();
        D4.i iVarA0 = null;
        for (int i8 = 0; i8 < size; i8++) {
            String strE = mVar.e(i8);
            String strI = mVar.i(i8);
            if (AbstractC1209k.a(strE, ":status")) {
                iVarA0 = M3.a.a0("HTTP/1.1 " + strI);
            } else if (!h.contains(strE)) {
                AbstractC1209k.f(strE, "name");
                AbstractC1209k.f(strI, "value");
                arrayList.add(strE);
                arrayList.add(AbstractC1545g.u0(strI).toString());
            }
        }
        if (iVarA0 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        F5.u uVar = new F5.u();
        uVar.f2447b = sVar;
        uVar.f2448c = iVarA0.f1582p;
        uVar.f2449d = (String) iVarA0.f1584r;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0096g c0096g = new C0096g(1);
        ArrayList arrayList2 = c0096g.f1743o;
        AbstractC1209k.f(arrayList2, "<this>");
        AbstractC1209k.f(strArr, "elements");
        arrayList2.addAll(Z4.l.S(strArr));
        uVar.f2451f = c0096g;
        if (z6 && uVar.f2448c == 100) {
            return null;
        }
        return uVar;
    }

    @Override // K5.e
    public final J5.k g() {
        return this.f4904a;
    }
}
