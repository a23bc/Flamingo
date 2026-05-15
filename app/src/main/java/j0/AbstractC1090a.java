package j0;

import java.util.ListIterator;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1090a implements ListIterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13619p;

    public AbstractC1090a(int i7, int i8) {
        this.f13618o = i7;
        this.f13619p = i8;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13618o < this.f13619p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13618o > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13618o;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13618o - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
