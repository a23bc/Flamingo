package H5;

import F5.m;
import F5.p;
import F5.s;
import F5.u;
import F5.v;
import F5.x;
import G.t;
import J5.h;
import V.o;
import java.util.ArrayList;
import m5.AbstractC1209k;
import u5.AbstractC1545g;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {
    @Override // F5.p
    public final v a(t tVar) throws Throwable {
        Throwable th;
        int i7;
        System.currentTimeMillis();
        F5.t tVar2 = (F5.t) tVar.f2597i;
        AbstractC1209k.f(tVar2, "request");
        Throwable th2 = null;
        o oVar = new o(tVar2, 17, (Object) null);
        if (tVar2.h().f2334j) {
            oVar = new o((Object) null, 17, (Object) null);
        }
        h hVar = (h) tVar.f2596g;
        boolean z6 = hVar instanceof h;
        F5.t tVar3 = (F5.t) oVar.f7342p;
        v vVar = (v) oVar.f7343q;
        if (tVar3 == null && vVar == null) {
            v vVar2 = new v(tVar2, s.f2433q, "Unsatisfiable Request (only-if-cached)", 504, null, new m((String[]) new ArrayList(20).toArray(new String[0])), G5.b.f2767c, null, null, null, -1L, System.currentTimeMillis(), null);
            AbstractC1209k.f(hVar, "call");
            return vVar2;
        }
        if (tVar3 == null) {
            AbstractC1209k.c(vVar);
            u uVarC = vVar.c();
            v vVarA = a.a(vVar);
            u.b(vVarA, "cacheResponse");
            uVarC.f2453i = vVarA;
            v vVarA2 = uVarC.a();
            AbstractC1209k.f(hVar, "call");
            return vVarA2;
        }
        if (vVar != null) {
            AbstractC1209k.f(hVar, "call");
        }
        v vVarF = tVar.f(tVar3);
        if (vVar != null) {
            if (vVarF.f2462r == 304) {
                u uVarC2 = vVar.c();
                m mVar = vVarF.f2464t;
                ArrayList arrayList = new ArrayList(20);
                m mVar2 = vVar.f2464t;
                int size = mVar2.size();
                int i8 = 0;
                while (true) {
                    th = th2;
                    if (i8 >= size) {
                        break;
                    }
                    String strE = mVar2.e(i8);
                    int i9 = size;
                    String strI = mVar2.i(i8);
                    m mVar3 = mVar2;
                    if ("Warning".equalsIgnoreCase(strE)) {
                        i7 = i8;
                        if (AbstractC1552n.K(strI, "1", false)) {
                        }
                        i8 = i7 + 1;
                        size = i9;
                        th2 = th;
                        mVar2 = mVar3;
                    } else {
                        i7 = i8;
                    }
                    if ("Content-Length".equalsIgnoreCase(strE) || "Content-Encoding".equalsIgnoreCase(strE) || "Content-Type".equalsIgnoreCase(strE) || !a.b(strE) || mVar.b(strE) == null) {
                        AbstractC1209k.f(strE, "name");
                        AbstractC1209k.f(strI, "value");
                        arrayList.add(strE);
                        arrayList.add(AbstractC1545g.u0(strI).toString());
                    }
                    i8 = i7 + 1;
                    size = i9;
                    th2 = th;
                    mVar2 = mVar3;
                }
                int size2 = mVar.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String strE2 = mVar.e(i10);
                    if (!"Content-Length".equalsIgnoreCase(strE2) && !"Content-Encoding".equalsIgnoreCase(strE2) && !"Content-Type".equalsIgnoreCase(strE2) && a.b(strE2)) {
                        String strI2 = mVar.i(i10);
                        AbstractC1209k.f(strE2, "name");
                        AbstractC1209k.f(strI2, "value");
                        arrayList.add(strE2);
                        arrayList.add(AbstractC1545g.u0(strI2).toString());
                    }
                }
                uVarC2.f2451f = new m((String[]) arrayList.toArray(new String[0])).g();
                uVarC2.f2455k = vVarF.f2469y;
                uVarC2.l = vVarF.f2470z;
                v vVarA3 = a.a(vVar);
                u.b(vVarA3, "cacheResponse");
                uVarC2.f2453i = vVarA3;
                v vVarA4 = a.a(vVarF);
                u.b(vVarA4, "networkResponse");
                uVarC2.h = vVarA4;
                uVarC2.a();
                x xVar = vVarF.f2465u;
                AbstractC1209k.c(xVar);
                xVar.close();
                AbstractC1209k.c(th);
                throw th;
            }
            x xVar2 = vVar.f2465u;
            if (xVar2 != null) {
                G5.b.b(xVar2);
            }
        }
        u uVarC3 = vVarF.c();
        v vVarA5 = a.a(vVar);
        u.b(vVarA5, "cacheResponse");
        uVarC3.f2453i = vVarA5;
        v vVarA6 = a.a(vVarF);
        u.b(vVarA6, "networkResponse");
        uVarC3.h = vVarA6;
        return uVarC3.a();
    }
}
