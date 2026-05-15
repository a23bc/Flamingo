package g2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Z1.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z1.o f12440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12442e;

    public l() {
        super(0, 3);
        this.f12440c = Z1.m.f8781a;
        this.f12441d = 0;
        this.f12442e = 0;
    }

    @Override // Z1.i
    public final Z1.i a() {
        l lVar = new l();
        lVar.f12440c = this.f12440c;
        lVar.f12441d = this.f12441d;
        lVar.f12442e = this.f12442e;
        ArrayList arrayList = lVar.f8780b;
        ArrayList arrayList2 = this.f8780b;
        ArrayList arrayList3 = new ArrayList(Z4.p.j0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Z1.i) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return lVar;
    }

    @Override // Z1.i
    public final Z1.o b() {
        return this.f12440c;
    }

    @Override // Z1.i
    public final void c(Z1.o oVar) {
        this.f12440c = oVar;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f12440c + ", verticalAlignment=" + ((Object) C0986b.b(this.f12441d)) + ", horizontalAlignment=" + ((Object) C0985a.b(this.f12442e)) + ", children=[\n" + d() + "\n])";
    }
}
