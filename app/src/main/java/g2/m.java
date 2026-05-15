package g2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Z1.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z1.o f12443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12445e;

    public m() {
        super(0, 3);
        this.f12443c = Z1.m.f8781a;
        this.f12444d = 0;
        this.f12445e = 0;
    }

    @Override // Z1.i
    public final Z1.i a() {
        m mVar = new m();
        mVar.f12443c = this.f12443c;
        mVar.f12444d = this.f12444d;
        mVar.f12445e = this.f12445e;
        ArrayList arrayList = mVar.f8780b;
        ArrayList arrayList2 = this.f8780b;
        ArrayList arrayList3 = new ArrayList(Z4.p.j0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Z1.i) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return mVar;
    }

    @Override // Z1.i
    public final Z1.o b() {
        return this.f12443c;
    }

    @Override // Z1.i
    public final void c(Z1.o oVar) {
        this.f12443c = oVar;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f12443c + ", horizontalAlignment=" + ((Object) C0985a.b(this.f12444d)) + ", verticalAlignment=" + ((Object) C0986b.b(this.f12445e)) + ", children=[\n" + d() + "\n])";
    }
}
