package h4;

import S5.C;
import S5.E;
import S5.l;
import S5.q;
import S5.r;
import S5.u;
import Z4.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m5.AbstractC1209k;
import m5.AbstractC1221w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12721b;

    public d(r rVar) {
        AbstractC1209k.f(rVar, "delegate");
        this.f12721b = rVar;
    }

    @Override // S5.l
    public final void a(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "path");
        this.f12721b.a(uVar);
    }

    @Override // S5.l
    public final List d(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "dir");
        List listD = this.f12721b.d(uVar);
        ArrayList arrayList = new ArrayList();
        for (u uVar2 : (ArrayList) listD) {
            AbstractC1209k.f(uVar2, "path");
            arrayList.add(uVar2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // S5.l
    public final B3.a f(u uVar) {
        AbstractC1209k.f(uVar, "path");
        B3.a aVarF = this.f12721b.f(uVar);
        if (aVarF == null) {
            return null;
        }
        u uVar2 = (u) aVarF.f814d;
        if (uVar2 == null) {
            return aVarF;
        }
        Map map = (Map) aVarF.f818i;
        AbstractC1209k.f(map, "extras");
        return new B3.a(aVarF.f812b, aVarF.f813c, uVar2, (Long) aVarF.f815e, (Long) aVarF.f816f, (Long) aVarF.f817g, (Long) aVarF.h, map);
    }

    @Override // S5.l
    public final q g(u uVar) {
        return this.f12721b.g(uVar);
    }

    @Override // S5.l
    public final C h(u uVar) throws IOException {
        B3.a aVarF;
        u uVarB = uVar.b();
        if (uVarB != null) {
            k<u> kVar = new k();
            while (uVarB != null && !c(uVarB)) {
                kVar.addFirst(uVarB);
                uVarB = uVarB.b();
            }
            for (u uVar2 : kVar) {
                AbstractC1209k.f(uVar2, "dir");
                r rVar = this.f12721b;
                rVar.getClass();
                if (!uVar2.e().mkdir() && ((aVarF = rVar.f(uVar2)) == null || !aVarF.f813c)) {
                    throw new IOException("failed to create directory: " + uVar2);
                }
            }
        }
        return this.f12721b.h(uVar);
    }

    @Override // S5.l
    public final E i(u uVar) {
        AbstractC1209k.f(uVar, "file");
        return this.f12721b.i(uVar);
    }

    public final void j(u uVar, u uVar2) throws IOException {
        AbstractC1209k.f(uVar, "source");
        AbstractC1209k.f(uVar2, "target");
        this.f12721b.j(uVar, uVar2);
    }

    public final String toString() {
        return AbstractC1221w.a(d.class).b() + '(' + this.f12721b + ')';
    }
}
