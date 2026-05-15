package E4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: o */
    public final AbstractCollection f1892o;

    /* JADX INFO: renamed from: p */
    public final D4.e f1893p;

    /* JADX WARN: Multi-variable type inference failed */
    public T(D4.e eVar, List list) {
        list.getClass();
        this.f1892o = (AbstractCollection) list;
        this.f1893p = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new Q(this, this.f1892o.listIterator(i7), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        this.f1892o.subList(i7, i8).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1892o.size();
    }
}
