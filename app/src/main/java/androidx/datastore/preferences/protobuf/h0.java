package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ListIterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListIterator f9483o;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9483o.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9483o.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f9483o.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9483o.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f9483o.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9483o.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
