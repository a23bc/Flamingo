package f0;

import j5.AbstractC1107a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import t.C1444F;
import u5.AbstractC1546h;

/* JADX INFO: renamed from: f0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0899m extends Exception {

    /* JADX INFO: renamed from: o */
    public final C1444F f11836o;

    /* JADX INFO: renamed from: p */
    public final C1444F f11837p;

    /* JADX INFO: renamed from: q */
    public final t.x f11838q;

    /* JADX INFO: renamed from: r */
    public final int f11839r;

    public C0899m(C1444F c1444f, C1444F c1444f2, t.x xVar, int i7, Exception exc) {
        super(exc);
        this.f11836o = c1444f;
        this.f11837p = c1444f2;
        this.f11838q = xVar;
        this.f11839r = i7;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listG;
        List listK0;
        StringBuilder sb = new StringBuilder("\n            |Exception while applying pausable composition. Last 10 operations:\n            |");
        t5.i iVarT = AbstractC1107a.t(new C0897l(this, null));
        if (iVarT.hasNext()) {
            Object next = iVarT.next();
            if (iVarT.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (iVarT.hasNext()) {
                    arrayList.add(iVarT.next());
                }
                listG = arrayList;
            } else {
                listG = I0.c.G(next);
            }
        } else {
            listG = Z4.v.f8818o;
        }
        int size = listG.size();
        if (10 >= size) {
            listK0 = Z4.n.K0(listG);
        } else {
            ArrayList arrayList2 = new ArrayList(10);
            if (listG instanceof RandomAccess) {
                for (int i7 = size - 10; i7 < size; i7++) {
                    arrayList2.add(listG.get(i7));
                }
            } else {
                ListIterator listIterator = listG.listIterator(size - 10);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listK0 = arrayList2;
        }
        sb.append(Z4.n.w0(listK0, "\n", null, null, null, 62));
        sb.append("\n            ");
        return AbstractC1546h.D(sb.toString());
    }
}
