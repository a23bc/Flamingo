package E4;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends o0 implements ListIterator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractList f1889q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f1888p = i7;
        this.f1889q = abstractList;
    }

    @Override // E4.o0
    public final Object a(Object obj) {
        switch (this.f1888p) {
            case 0:
                return ((S) this.f1889q).f1891p.apply(obj);
            default:
                return ((T) this.f1889q).f1893p.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f1970o).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f1970o).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f1970o).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f1970o).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
