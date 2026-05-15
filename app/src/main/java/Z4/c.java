package Z4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0508b implements ListIterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f8805r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i7) {
        super(0, eVar);
        this.f8805r = eVar;
        int iB = eVar.b();
        if (i7 < 0 || i7 > iB) {
            throw new IndexOutOfBoundsException(Z1.l.p("index: ", i7, iB, ", size: "));
        }
        this.f8803p = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8803p > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8803p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f8803p - 1;
        this.f8803p = i7;
        return this.f8805r.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8803p - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
