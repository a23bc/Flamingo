package Y0;

import X.C0489m0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import t.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f8560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f8561b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i7 = 0;
        while (i7 < 2) {
            comparatorArr[i7] = new C0489m0(2, new C0489m0(i7 == 0 ? e.f8438q : e.f8437p));
            i7++;
        }
        f8560a = comparatorArr;
        f8561b = s.f8503I;
    }

    public static final void a(o oVar, ArrayList arrayList, B0.b bVar, B0.b bVar2, y yVar) {
        j jVar = oVar.f8484d;
        Object objG = jVar.f8473o.g(t.f8540m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) bVar2.b(oVar)).booleanValue()) && ((Boolean) bVar.b(oVar)).booleanValue()) {
            arrayList.add(oVar);
        }
        if (zBooleanValue) {
            yVar.h(oVar.f8487g, b(oVar, bVar, bVar2, o.j(7, oVar)));
            return;
        }
        List listJ = o.j(7, oVar);
        int size = listJ.size();
        for (int i7 = 0; i7 < size; i7++) {
            a((o) listJ.get(i7), arrayList, bVar, bVar2, yVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList b(Y0.o r20, B0.b r21, B0.b r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.x.b(Y0.o, B0.b, B0.b, java.util.List):java.util.ArrayList");
    }
}
