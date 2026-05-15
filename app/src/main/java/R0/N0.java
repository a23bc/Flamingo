package R0;

import java.util.List;
import t.AbstractC1457l;

/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y0.j f6361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.z f6362b;

    public N0(Y0.o oVar, AbstractC1457l abstractC1457l) {
        this.f6361a = oVar.f8484d;
        this.f6362b = new t.z(Y0.o.j(4, oVar).size());
        List listJ = Y0.o.j(4, oVar);
        int size = listJ.size();
        for (int i7 = 0; i7 < size; i7++) {
            Y0.o oVar2 = (Y0.o) listJ.get(i7);
            if (abstractC1457l.a(oVar2.f8487g)) {
                this.f6362b.a(oVar2.f8487g);
            }
        }
    }
}
