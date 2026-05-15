package K5;

import F5.m;
import F5.p;
import F5.u;
import F5.v;
import F5.x;
import G.t;
import J5.h;
import J5.k;
import M5.C0281a;
import N5.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {
    @Override // F5.p
    public final v a(t tVar) throws IllegalAccessException, IOException, InvocationTargetException {
        IOException iOException;
        IOException iOException2;
        B0.a aVar = (B0.a) tVar.h;
        AbstractC1209k.c(aVar);
        h hVar = (h) aVar.f606b;
        e eVar = (e) aVar.f608d;
        k kVar = (k) aVar.f609e;
        F5.t tVar2 = (F5.t) tVar.f2597i;
        tVar2.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                AbstractC1209k.f(hVar, "call");
                eVar.a(tVar2);
                I0.c.J((String) tVar2.f2442q);
                hVar.g(aVar, true, false, null);
                try {
                    eVar.b();
                    iOException = null;
                } catch (IOException e7) {
                    aVar.i(e7);
                    throw e7;
                }
            } catch (IOException e8) {
                if ((e8 instanceof C0281a) || !aVar.f605a) {
                    throw e8;
                }
                iOException = e8;
            }
            try {
                u uVarH = aVar.h(false);
                AbstractC1209k.c(uVarH);
                AbstractC1209k.f(hVar, "call");
                uVarH.f2446a = tVar2;
                uVarH.f2450e = kVar.f3790e;
                uVarH.f2455k = jCurrentTimeMillis;
                iOException2 = iOException;
                try {
                    uVarH.l = System.currentTimeMillis();
                    v vVarA = uVarH.a();
                    int i7 = vVarA.f2462r;
                    if (i7 == 100 || (102 <= i7 && i7 < 200)) {
                        u uVarH2 = aVar.h(false);
                        AbstractC1209k.c(uVarH2);
                        uVarH2.f2446a = tVar2;
                        uVarH2.f2450e = kVar.f3790e;
                        uVarH2.f2455k = jCurrentTimeMillis;
                        uVarH2.l = System.currentTimeMillis();
                        vVarA = uVarH2.a();
                        i7 = vVarA.f2462r;
                    }
                    AbstractC1209k.f(hVar, "call");
                    u uVarC = vVarA.c();
                    uVarC.f2452g = aVar.f(vVarA);
                    v vVarA2 = uVarC.a();
                    if ("close".equalsIgnoreCase(((m) vVarA2.f2459o.f2443r).b("Connection")) || "close".equalsIgnoreCase(v.b(vVarA2, "Connection"))) {
                        eVar.g().l();
                    }
                    if (i7 == 204 || i7 == 205) {
                        x xVar = vVarA2.f2465u;
                        if ((xVar != null ? xVar.b() : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i7);
                            sb.append(" had non-zero Content-Length: ");
                            sb.append(xVar != null ? Long.valueOf(xVar.b()) : null);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return vVarA2;
                } catch (IOException e9) {
                    e = e9;
                    if (iOException2 == null) {
                        throw e;
                    }
                    l.k(iOException2, e);
                    throw iOException2;
                }
            } catch (IOException e10) {
                e = e10;
                iOException2 = iOException;
            }
        } catch (IOException e11) {
            AbstractC1209k.f(hVar, "call");
            aVar.i(e11);
            throw e11;
        }
    }
}
