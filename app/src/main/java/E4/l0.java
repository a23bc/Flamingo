package E4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f1956o).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f1956o.iterator();
        it.getClass();
        D4.f fVar = this.f1957p;
        fVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (fVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new l0(((SortedSet) this.f1956o).headSet(obj), this.f1957p);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f1956o;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f1957p.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new l0(((SortedSet) this.f1956o).subSet(obj, obj2), this.f1957p);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new l0(((SortedSet) this.f1956o).tailSet(obj), this.f1957p);
    }
}
