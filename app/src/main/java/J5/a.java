package J5;

import F5.p;
import F5.r;
import F5.v;
import G.t;
import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a */
    public static final a f3743a = new a();

    @Override // F5.p
    public final v a(t tVar) throws IOException {
        h hVar = (h) tVar.f2596g;
        hVar.getClass();
        synchronized (hVar) {
            try {
                if (!hVar.f3781z) {
                    throw new IllegalStateException("released");
                }
                if (hVar.f3780y) {
                    throw new IllegalStateException("Check failed.");
                }
                if (hVar.f3779x) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar = hVar.f3776u;
        AbstractC1209k.c(dVar);
        r rVar = hVar.f3770o;
        AbstractC1209k.f(rVar, "client");
        try {
            K5.e eVarK = dVar.a(tVar.f2592c, tVar.f2593d, tVar.f2594e, rVar.f2425t, !AbstractC1209k.a((String) ((F5.t) tVar.f2597i).f2442q, "GET")).k(rVar, tVar);
            AbstractC1209k.f(hVar, "call");
            AbstractC1209k.f(dVar, "finder");
            B0.a aVar = new B0.a();
            aVar.f606b = hVar;
            aVar.f607c = dVar;
            aVar.f608d = eVarK;
            aVar.f609e = eVarK.g();
            hVar.f3778w = aVar;
            hVar.f3768B = aVar;
            synchronized (hVar) {
                hVar.f3779x = true;
                hVar.f3780y = true;
            }
            if (hVar.f3767A) {
                throw new IOException("Canceled");
            }
            return t.a(tVar, 0, aVar, null, 61).f((F5.t) tVar.f2597i);
        } catch (m e7) {
            dVar.c(e7.f3806p);
            throw e7;
        } catch (IOException e8) {
            dVar.c(e8);
            throw new m(e8);
        }
    }
}
