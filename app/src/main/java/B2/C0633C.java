package b2;

import java.util.ArrayList;
import java.util.Iterator;
import l2.C1164d;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0633C extends Z1.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f10035d;

    public C0633C() {
        super(0, 3);
        this.f10034c = 9205357640488583168L;
        this.f10035d = G0.f10054a;
    }

    @Override // Z1.i
    public final Z1.i a() {
        C0633C c0633c = new C0633C();
        c0633c.f10034c = this.f10034c;
        c0633c.f10035d = this.f10035d;
        ArrayList arrayList = c0633c.f8780b;
        ArrayList arrayList2 = this.f8780b;
        ArrayList arrayList3 = new ArrayList(Z4.p.j0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Z1.i) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return c0633c;
    }

    @Override // Z1.i
    public final Z1.o b() {
        Z1.o oVarB;
        ArrayList arrayList = this.f8780b;
        AbstractC1209k.f(arrayList, "<this>");
        Z1.i iVar = (Z1.i) (arrayList.size() == 1 ? arrayList.get(0) : null);
        if (iVar != null && (oVarB = iVar.b()) != null) {
            return oVarB;
        }
        C1164d c1164d = C1164d.f14164a;
        return new g2.s(c1164d).c(new g2.n(c1164d));
    }

    @Override // Z1.i
    public final void c(Z1.o oVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) n1.i.c(this.f10034c)) + ", sizeMode=" + this.f10035d + ", children=[\n" + d() + "\n])";
    }
}
