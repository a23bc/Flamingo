package Z1;

import f0.AbstractC0875a;
import java.util.ArrayList;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0875a {
    @Override // f0.AbstractC0875a
    public final void c() {
        Object obj = this.f11786o;
        AbstractC1209k.d(obj, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((k) obj).f8780b.clear();
    }

    public final ArrayList d() {
        i iVar = (i) this.f11788q;
        if (iVar instanceof k) {
            return ((k) iVar).f8780b;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }

    @Override // f0.InterfaceC0881d
    public final /* bridge */ /* synthetic */ void i(int i7, Object obj) {
    }

    @Override // f0.InterfaceC0881d
    public final void p(int i7, Object obj) {
        i iVar = (i) obj;
        Object obj2 = this.f11788q;
        AbstractC1209k.d(obj2, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        int i8 = ((k) obj2).f8779a;
        if (i8 <= 0) {
            StringBuilder sb = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
            Object obj3 = this.f11786o;
            AbstractC1209k.d(obj3, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
            sb.append(((k) obj3).f8779a);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (iVar instanceof k) {
            k kVar = (k) iVar;
            kVar.getClass();
            kVar.f8779a = i8 - 1;
        }
        d().add(i7, iVar);
    }

    @Override // f0.InterfaceC0881d
    public final void r(int i7, int i8, int i9) {
        ArrayList arrayListD = d();
        int i10 = i7 > i8 ? i8 : i8 - i9;
        if (i9 != 1) {
            List listSubList = arrayListD.subList(i7, i9 + i7);
            ArrayList arrayListL0 = Z4.n.L0(listSubList);
            listSubList.clear();
            arrayListD.addAll(i10, arrayListL0);
            return;
        }
        if (i7 == i8 + 1 || i7 == i8 - 1) {
            arrayListD.set(i7, arrayListD.set(i8, arrayListD.get(i7)));
        } else {
            arrayListD.add(i10, arrayListD.remove(i7));
        }
    }

    @Override // f0.InterfaceC0881d
    public final void t(int i7, int i8) {
        ArrayList arrayListD = d();
        if (i8 == 1) {
            arrayListD.remove(i7);
        } else {
            arrayListD.subList(i7, i8 + i7).clear();
        }
    }
}
