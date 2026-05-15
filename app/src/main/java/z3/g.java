package z3;

import Z4.B;
import f0.C0879c;
import f0.C0894j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m5.AbstractC1209k;
import y3.AbstractC2010C;
import y3.C2019h;
import y3.C2021j;
import y3.InterfaceC2009B;
import y3.z;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2009B("composable")
public final class g extends AbstractC2010C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0894j0 f21145c = C0879c.t(Boolean.FALSE);

    @Override // y3.AbstractC2010C
    public final y3.s a() {
        return new f(this, c.f21141a);
    }

    @Override // y3.AbstractC2010C
    public final void d(List list, z zVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2019h c2019h = (C2019h) it.next();
            C2021j c2021jB = b();
            AbstractC1209k.f(c2019h, "backStackEntry");
            J j3 = c2021jB.f20424c;
            Iterable iterable = (Iterable) j3.getValue();
            boolean z6 = iterable instanceof Collection;
            z5.u uVar = c2021jB.f20426e;
            if (!z6 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C2019h) it2.next()) == c2019h) {
                        Iterable iterable2 = (Iterable) ((J) uVar.f21324o).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C2019h) it3.next()) == c2019h) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C2019h c2019h2 = (C2019h) Z4.n.y0((List) ((J) uVar.f21324o).getValue());
            if (c2019h2 != null) {
                j3.j(null, B.Z((Set) j3.getValue(), c2019h2));
            }
            j3.j(null, B.Z((Set) j3.getValue(), c2019h));
            c2021jB.f(c2019h);
        }
        this.f21145c.setValue(Boolean.FALSE);
    }

    @Override // y3.AbstractC2010C
    public final void e(C2019h c2019h, boolean z6) {
        AbstractC1209k.f(c2019h, "popUpTo");
        b().e(c2019h, z6);
        this.f21145c.setValue(Boolean.TRUE);
    }
}
