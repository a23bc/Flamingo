package E4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p0 implements ListIterator {

    /* JADX INFO: renamed from: o */
    public final int f1864o;

    /* JADX INFO: renamed from: p */
    public int f1865p;

    /* JADX INFO: renamed from: q */
    public final I f1866q;

    public G(I i7, int i8) {
        int size = i7.size();
        N5.d.s(i8, size);
        this.f1864o = size;
        this.f1865p = i8;
        this.f1866q = i7;
    }

    public final Object a(int i7) {
        return this.f1866q.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1865p < this.f1864o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1865p > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1865p;
        this.f1865p = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1865p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1865p - 1;
        this.f1865p = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1865p - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
