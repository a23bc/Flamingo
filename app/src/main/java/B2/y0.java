package b2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends Z1.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z1.o f10354d;

    public y0(int i7) {
        super(i7, 2);
        this.f10353c = i7;
        this.f10354d = Z1.m.f8781a;
    }

    @Override // Z1.i
    public final Z1.i a() {
        y0 y0Var = new y0(this.f10353c);
        y0Var.f10354d = this.f10354d;
        ArrayList arrayList = y0Var.f8780b;
        ArrayList arrayList2 = this.f8780b;
        ArrayList arrayList3 = new ArrayList(Z4.p.j0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Z1.i) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return y0Var;
    }

    @Override // Z1.i
    public final Z1.o b() {
        return this.f10354d;
    }

    @Override // Z1.i
    public final void c(Z1.o oVar) {
        this.f10354d = oVar;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f10354d + ", children=[\n" + d() + "\n])";
    }
}
