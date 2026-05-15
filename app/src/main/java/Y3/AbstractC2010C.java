package y3;

import java.util.List;
import java.util.ListIterator;
import m5.AbstractC1209k;
import t5.C1521e;
import t5.C1522f;
import t5.C1523g;
import v.C1628y;
import z5.J;

/* JADX INFO: renamed from: y3.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2010C {

    /* JADX INFO: renamed from: a */
    public C2021j f20389a;

    /* JADX INFO: renamed from: b */
    public boolean f20390b;

    public abstract s a();

    public final C2021j b() {
        C2021j c2021j = this.f20389a;
        if (c2021j != null) {
            return c2021j;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, z zVar) {
        C1521e c1521e = new C1521e(new C1522f(new C1523g(Z4.n.m0(list), new C1628y(this, zVar), 2), false, t5.m.f17109q));
        while (c1521e.hasNext()) {
            b().f((C2019h) c1521e.next());
        }
    }

    public void e(C2019h c2019h, boolean z6) {
        AbstractC1209k.f(c2019h, "popUpTo");
        List list = (List) ((J) b().f20426e.f21324o).getValue();
        if (!list.contains(c2019h)) {
            throw new IllegalStateException(("popBackStack was called with " + c2019h + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C2019h c2019h2 = null;
        while (f()) {
            c2019h2 = (C2019h) listIterator.previous();
            if (AbstractC1209k.a(c2019h2, c2019h)) {
                break;
            }
        }
        if (c2019h2 != null) {
            b().c(c2019h2);
        }
    }

    public boolean f() {
        return true;
    }

    public s c(s sVar) {
        return sVar;
    }
}
