package g2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Z1.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z1.o f12438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f12439d;

    public k() {
        super(0, 3);
        this.f12438c = Z1.m.f8781a;
        this.f12439d = c.f12410c;
    }

    @Override // Z1.i
    public final Z1.i a() {
        k kVar = new k();
        kVar.f12438c = this.f12438c;
        kVar.f12439d = this.f12439d;
        ArrayList arrayList = kVar.f8780b;
        ArrayList arrayList2 = this.f8780b;
        ArrayList arrayList3 = new ArrayList(Z4.p.j0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Z1.i) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return kVar;
    }

    @Override // Z1.i
    public final Z1.o b() {
        return this.f12438c;
    }

    @Override // Z1.i
    public final void c(Z1.o oVar) {
        this.f12438c = oVar;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f12438c + ", contentAlignment=" + this.f12439d + "children=[\n" + d() + "\n])";
    }
}
