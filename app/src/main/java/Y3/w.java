package y3;

import android.os.Bundle;
import d.C0746L;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2009B("navigation")
public class w extends AbstractC2010C {

    /* JADX INFO: renamed from: c */
    public final C2011D f20485c;

    public w(C2011D c2011d) {
        this.f20485c = c2011d;
    }

    @Override // y3.AbstractC2010C
    public final s a() {
        return new u(this);
    }

    @Override // y3.AbstractC2010C
    public final void d(List list, z zVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2019h c2019h = (C2019h) it.next();
            s sVar = c2019h.f20407p;
            AbstractC1209k.d(sVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            u uVar = (u) sVar;
            Bundle bundleC = c2019h.c();
            int i7 = uVar.f20474x;
            String str = uVar.f20476z;
            if (i7 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i8 = uVar.f20467t;
                sb.append(i8 != 0 ? String.valueOf(i8) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            s sVarO = str != null ? uVar.o(str, false) : uVar.n(i7, false);
            if (sVarO == null) {
                if (uVar.f20475y == null) {
                    String strValueOf = uVar.f20476z;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(uVar.f20474x);
                    }
                    uVar.f20475y = strValueOf;
                }
                String str2 = uVar.f20475y;
                AbstractC1209k.c(str2);
                throw new IllegalArgumentException(Z1.l.q("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            AbstractC2010C abstractC2010CB = this.f20485c.b(sVarO.f20462o);
            C2021j c2021jB = b();
            Bundle bundleC2 = sVarO.c(bundleC);
            x xVar = c2021jB.h;
            abstractC2010CB.d(I0.c.G(C0746L.j(xVar.f20491a, sVarO, bundleC2, xVar.f(), xVar.f20505q)), zVar);
        }
    }
}
