package z3;

import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;
import y3.AbstractC2010C;
import y3.C2019h;
import y3.InterfaceC2009B;
import y3.z;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2009B("dialog")
public final class l extends AbstractC2010C {
    @Override // y3.AbstractC2010C
    public final y3.s a() {
        n0.d dVar = e.f21143a;
        return new k(this);
    }

    @Override // y3.AbstractC2010C
    public final void d(List list, z zVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C2019h) it.next());
        }
    }

    @Override // y3.AbstractC2010C
    public final void e(C2019h c2019h, boolean z6) {
        AbstractC1209k.f(c2019h, "popUpTo");
        b().e(c2019h, z6);
    }
}
