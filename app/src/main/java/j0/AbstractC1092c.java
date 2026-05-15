package j0;

import i0.C1053a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: j0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1092c extends Z4.e implements List, Collection, InterfaceC1237a {
    public abstract AbstractC1092c c(int i7, Object obj);

    @Override // Z4.AbstractC0507a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // Z4.AbstractC0507a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract AbstractC1092c e(Object obj);

    public AbstractC1092c g(Collection collection) {
        C1095f c1095fI = i();
        c1095fI.addAll(collection);
        return c1095fI.e();
    }

    public abstract C1095f i();

    @Override // Z4.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // Z4.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract AbstractC1092c n(C1091b c1091b);

    public abstract AbstractC1092c o(int i7);

    public abstract AbstractC1092c p(int i7, Object obj);

    @Override // Z4.e, java.util.List
    public final List subList(int i7, int i8) {
        return new C1053a(this, i7, i8);
    }
}
