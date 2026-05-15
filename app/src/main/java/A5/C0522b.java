package a5;

import Q0.r;
import Z1.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: a5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0522b extends Z4.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0522b f8855r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f8856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8858q;

    static {
        C0522b c0522b = new C0522b(0);
        c0522b.f8858q = true;
        f8855r = c0522b;
    }

    public C0522b(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f8856o = new Object[i7];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        n();
        int i7 = this.f8857p;
        ((AbstractList) this).modCount++;
        o(i7, 1);
        this.f8856o[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        n();
        int size = collection.size();
        g(this.f8857p, collection, size);
        return size > 0;
    }

    @Override // Z4.g
    public final int b() {
        return this.f8857p;
    }

    @Override // Z4.g
    public final Object c(int i7) {
        n();
        int i8 = this.f8857p;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        return p(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        n();
        q(0, this.f8857p);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (AbstractC1267a.h(this.f8856o, 0, this.f8857p, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        o(i7, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f8856o[i7 + i9] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f8857p;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        return this.f8856o[i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f8856o;
        int i7 = this.f8857p;
        int iHashCode = 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[i8];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        o(i7, 1);
        this.f8856o[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f8857p; i7++) {
            if (AbstractC1209k.a(this.f8856o[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f8857p == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f8857p - 1; i7 >= 0; i7--) {
            if (AbstractC1209k.a(this.f8856o[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void n() {
        if (this.f8858q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void o(int i7, int i8) {
        int i9 = this.f8857p + i8;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f8856o;
        if (i9 > objArr.length) {
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                i10 = i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f8856o = objArrCopyOf;
        }
        Object[] objArr2 = this.f8856o;
        Z4.l.W(i7 + i8, i7, this.f8857p, objArr2, objArr2);
        this.f8857p += i8;
    }

    public final Object p(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f8856o;
        Object obj = objArr[i7];
        Z4.l.W(i7, i7 + 1, this.f8857p, objArr, objArr);
        Object[] objArr2 = this.f8856o;
        int i8 = this.f8857p - 1;
        AbstractC1209k.f(objArr2, "<this>");
        objArr2[i8] = null;
        this.f8857p--;
        return obj;
    }

    public final void q(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f8856o;
        Z4.l.W(i7, i7 + i8, this.f8857p, objArr, objArr);
        Object[] objArr2 = this.f8856o;
        int i9 = this.f8857p;
        AbstractC1267a.F(objArr2, i9 - i8, i9);
        this.f8857p -= i8;
    }

    public final int r(int i7, int i8, Collection collection, boolean z6) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + i9;
            if (collection.contains(this.f8856o[i11]) == z6) {
                Object[] objArr = this.f8856o;
                i9++;
                objArr[i10 + i7] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f8856o;
        Z4.l.W(i7 + i10, i8 + i7, this.f8857p, objArr2, objArr2);
        Object[] objArr3 = this.f8856o;
        int i13 = this.f8857p;
        AbstractC1267a.F(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f8857p -= i12;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        n();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        n();
        return r(0, this.f8857p, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        n();
        return r(0, this.f8857p, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        n();
        int i8 = this.f8857p;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        Object[] objArr = this.f8856o;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        android.support.v4.media.session.b.g(i7, i8, this.f8857p);
        return new C0521a(this.f8856o, i7, i8 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1209k.f(objArr, "array");
        int length = objArr.length;
        int i7 = this.f8857p;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f8856o, 0, i7, objArr.getClass());
            AbstractC1209k.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        Z4.l.W(0, 0, i7, this.f8856o, objArr);
        int i8 = this.f8857p;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC1267a.i(this.f8856o, 0, this.f8857p, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        int i8 = this.f8857p;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        return new r(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        AbstractC1209k.f(collection, "elements");
        n();
        int i8 = this.f8857p;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            g(i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        n();
        int i8 = this.f8857p;
        if (i7 >= 0 && i7 <= i8) {
            ((AbstractList) this).modCount++;
            o(i7, 1);
            this.f8856o[i7] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return Z4.l.c0(this.f8856o, 0, this.f8857p);
    }
}
