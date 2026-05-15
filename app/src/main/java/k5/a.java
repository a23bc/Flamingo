package K5;

import E0.C0096g;
import F5.m;
import F5.o;
import F5.p;
import F5.r;
import F5.u;
import F5.v;
import F5.x;
import G.t;
import J5.l;
import M5.C0281a;
import U3.h;
import Z4.n;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4071a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f4072b;

    public a(F5.b bVar) {
        AbstractC1209k.f(bVar, "cookieJar");
        this.f4072b = bVar;
    }

    public static int d(v vVar, int i7) {
        String strB = v.b(vVar, "Retry-After");
        if (strB == null) {
            return i7;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC1209k.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        AbstractC1209k.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // F5.p
    public final v a(t tVar) {
        x xVar;
        SSLSocketFactory sSLSocketFactory;
        R5.c cVar;
        F5.e eVar;
        switch (this.f4071a) {
            case 0:
                F5.t tVar2 = (F5.t) tVar.f2597i;
                h hVarP = tVar2.p();
                m mVar = (m) tVar2.f2443r;
                String strB = mVar.b("Host");
                boolean z6 = false;
                o oVar = (o) tVar2.f2441p;
                if (strB == null) {
                    hVarP.Y("Host", G5.b.t(oVar, false));
                }
                if (mVar.b("Connection") == null) {
                    hVarP.Y("Connection", "Keep-Alive");
                }
                if (mVar.b("Accept-Encoding") == null && mVar.b("Range") == null) {
                    hVarP.Y("Accept-Encoding", "gzip");
                    z6 = true;
                }
                F5.b bVar = (F5.b) this.f4072b;
                bVar.getClass();
                AbstractC1209k.f(oVar, "url");
                if (mVar.b("User-Agent") == null) {
                    hVarP.Y("User-Agent", "okhttp/4.12.0");
                }
                v vVarF = tVar.f(hVarP.z());
                m mVar2 = vVarF.f2464t;
                f.b(bVar, oVar, mVar2);
                u uVarC = vVarF.c();
                uVarC.f2446a = tVar2;
                if (z6 && "gzip".equalsIgnoreCase(v.b(vVarF, "Content-Encoding")) && f.a(vVarF) && (xVar = vVarF.f2465u) != null) {
                    S5.o oVar2 = new S5.o(xVar.g());
                    C0096g c0096gG = mVar2.g();
                    c0096gG.r("Content-Encoding");
                    c0096gG.r("Content-Length");
                    uVarC.f2451f = c0096gG.h().g();
                    uVarC.f2452g = new g(v.b(vVarF, "Content-Type"), -1L, M3.a.E(oVar2));
                }
                return uVarC.a();
            default:
                F5.t tVar3 = (F5.t) tVar.f2597i;
                J5.h hVar = (J5.h) tVar.f2596g;
                List listC0 = Z4.v.f8818o;
                v vVar = null;
                int i7 = 0;
                F5.t tVarB = tVar3;
                while (true) {
                    boolean z7 = true;
                    while (true) {
                        hVar.getClass();
                        AbstractC1209k.f(tVarB, "request");
                        if (hVar.f3778w != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (hVar) {
                            try {
                                if (hVar.f3780y) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (hVar.f3779x) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z7) {
                            l lVar = hVar.f3772q;
                            o oVar3 = (o) tVarB.f2441p;
                            boolean z8 = oVar3.f2401i;
                            r rVar = hVar.f3770o;
                            if (z8) {
                                SSLSocketFactory sSLSocketFactory2 = rVar.f2409C;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                R5.c cVar2 = rVar.f2413G;
                                eVar = rVar.f2414H;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                eVar = null;
                            }
                            hVar.f3776u = new J5.d(lVar, new F5.a(oVar3.f2397d, oVar3.f2398e, rVar.f2430y, rVar.f2408B, sSLSocketFactory, cVar, eVar, rVar.f2407A, rVar.f2412F, rVar.f2411E, rVar.f2431z), hVar);
                        }
                        try {
                            if (hVar.f3767A) {
                                throw new IOException("Canceled");
                            }
                            try {
                                v vVarF2 = tVar.f(tVarB);
                                if (vVar != null) {
                                    u uVarC2 = vVarF2.c();
                                    u uVarC3 = vVar.c();
                                    uVarC3.f2452g = null;
                                    v vVarA = uVarC3.a();
                                    if (vVarA.f2465u != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    uVarC2.f2454j = vVarA;
                                    vVarF2 = uVarC2.a();
                                }
                                vVar = vVarF2;
                                tVarB = b(vVar, hVar.f3778w);
                                if (tVarB == null) {
                                    hVar.e(false);
                                    return vVar;
                                }
                                x xVar2 = vVar.f2465u;
                                if (xVar2 != null) {
                                    G5.b.b(xVar2);
                                }
                                i7++;
                                if (i7 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i7);
                                }
                                hVar.e(true);
                            } catch (J5.m e7) {
                                if (!c(e7.f3806p, hVar, tVarB, false)) {
                                    IOException iOException = e7.f3805o;
                                    AbstractC1209k.f(iOException, "<this>");
                                    Iterator it = listC0.iterator();
                                    while (it.hasNext()) {
                                        N5.l.k(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                listC0 = n.C0(listC0, e7.f3805o);
                                hVar.e(true);
                                z7 = false;
                            } catch (IOException e8) {
                                if (!c(e8, hVar, tVarB, !(e8 instanceof C0281a))) {
                                    Iterator it2 = listC0.iterator();
                                    while (it2.hasNext()) {
                                        N5.l.k(e8, (Exception) it2.next());
                                    }
                                    throw e8;
                                }
                                listC0 = n.C0(listC0, e8);
                                hVar.e(true);
                                z7 = false;
                            }
                        } catch (Throwable th2) {
                            hVar.e(true);
                            throw th2;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F5.t b(F5.v r12, B0.a r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.a.b(F5.v, B0.a):F5.t");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(java.io.IOException r4, J5.h r5, F5.t r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r6 = r3.f4072b
            F5.r r6 = (F5.r) r6
            boolean r6 = r6.f2425t
            r0 = 0
            if (r6 != 0) goto Lb
            goto L9d
        Lb:
            if (r7 == 0) goto L12
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L12
            return r0
        L12:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L17
            return r0
        L17:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L22
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L9d
            if (r7 != 0) goto L9d
            goto L35
        L22:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L30
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L30
            goto L9d
        L30:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L35
            return r0
        L35:
            J5.d r4 = r5.f3776u
            m5.AbstractC1209k.c(r4)
            int r5 = r4.f3759f
            r6 = 1
            if (r5 != 0) goto L49
            int r7 = r4.f3760g
            if (r7 != 0) goto L49
            int r7 = r4.h
            if (r7 != 0) goto L49
            r4 = r0
            goto L9b
        L49:
            F5.y r7 = r4.f3761i
            if (r7 == 0) goto L4e
            goto L96
        L4e:
            r7 = 0
            if (r5 > r6) goto L81
            int r5 = r4.f3760g
            if (r5 > r6) goto L81
            int r5 = r4.h
            if (r5 <= 0) goto L5a
            goto L81
        L5a:
            J5.h r5 = r4.f3756c
            J5.k r5 = r5.f3777v
            if (r5 != 0) goto L61
            goto L81
        L61:
            monitor-enter(r5)
            int r1 = r5.l     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L68
            monitor-exit(r5)
            goto L81
        L68:
            F5.y r1 = r5.f3787b     // Catch: java.lang.Throwable -> L7e
            F5.a r1 = r1.f2473a     // Catch: java.lang.Throwable -> L7e
            F5.o r1 = r1.h     // Catch: java.lang.Throwable -> L7e
            F5.a r2 = r4.f3755b     // Catch: java.lang.Throwable -> L7e
            F5.o r2 = r2.h     // Catch: java.lang.Throwable -> L7e
            boolean r1 = G5.b.a(r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L7a
            monitor-exit(r5)
            goto L81
        L7a:
            F5.y r7 = r5.f3787b     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r5)
            goto L81
        L7e:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L81:
            if (r7 == 0) goto L87
            r4.f3761i = r7
        L85:
            r4 = r6
            goto L9b
        L87:
            C1.k r5 = r4.f3757d
            if (r5 == 0) goto L92
            boolean r5 = r5.f()
            if (r5 != r6) goto L92
            goto L96
        L92:
            J5.n r4 = r4.f3758e
            if (r4 != 0) goto L97
        L96:
            goto L85
        L97:
            boolean r4 = r4.h()
        L9b:
            if (r4 != 0) goto L9e
        L9d:
            return r0
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.a.c(java.io.IOException, J5.h, F5.t, boolean):boolean");
    }

    public a(r rVar) {
        AbstractC1209k.f(rVar, "client");
        this.f4072b = rVar;
    }
}
