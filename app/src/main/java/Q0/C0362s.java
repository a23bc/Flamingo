package Q0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: Q0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0362s implements List, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0363t f6071q;

    public C0362s(C0363t c0363t, int i7, int i8) {
        this.f6071q = c0363t;
        this.f6069o = i7;
        this.f6070p = i8;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC1397o) && indexOf((AbstractC1397o) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC1397o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object objE = this.f6071q.f6072o.e(i7 + this.f6069o);
        AbstractC1209k.d(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC1397o) objE;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC1397o)) {
            return -1;
        }
        AbstractC1397o abstractC1397o = (AbstractC1397o) obj;
        int i7 = this.f6069o;
        int i8 = this.f6070p;
        if (i7 <= i8) {
            int i9 = i7;
            while (!AbstractC1209k.a(this.f6071q.f6072o.e(i9), abstractC1397o)) {
                if (i9 != i8) {
                    i9++;
                }
            }
            return i9 - i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i7 = this.f6069o;
        return new r(this.f6071q, i7, i7, this.f6070p);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC1397o)) {
            return -1;
        }
        AbstractC1397o abstractC1397o = (AbstractC1397o) obj;
        int i7 = this.f6070p;
        int i8 = this.f6069o;
        if (i8 <= i7) {
            while (!AbstractC1209k.a(this.f6071q.f6072o.e(i7), abstractC1397o)) {
                if (i7 != i8) {
                    i7--;
                }
            }
            return i7 - i8;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i7 = this.f6069o;
        return new r(this.f6071q, i7, i7, this.f6070p);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f6070p - this.f6069o;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        int i9 = this.f6069o;
        return new C0362s(this.f6071q, i7 + i9, i9 + i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1208j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        int i8 = this.f6069o;
        int i9 = this.f6070p;
        return new r(this.f6071q, i7 + i8, i8, i9);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1208j.b(this, objArr);
    }
}
