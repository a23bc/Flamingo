package a5;

import Q0.r;
import Z1.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: a5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0521a extends Z4.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: o */
    public Object[] f8850o;

    /* JADX INFO: renamed from: p */
    public final int f8851p;

    /* JADX INFO: renamed from: q */
    public int f8852q;

    /* JADX INFO: renamed from: r */
    public final C0521a f8853r;

    /* JADX INFO: renamed from: s */
    public final C0522b f8854s;

    public C0521a(Object[] objArr, int i7, int i8, C0521a c0521a, C0522b c0522b) {
        AbstractC1209k.f(objArr, "backing");
        AbstractC1209k.f(c0522b, "root");
        this.f8850o = objArr;
        this.f8851p = i7;
        this.f8852q = i8;
        this.f8853r = c0521a;
        this.f8854s = c0522b;
        ((AbstractList) this).modCount = ((AbstractList) c0522b).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        o();
        n();
        i(this.f8851p + this.f8852q, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        o();
        n();
        int size = collection.size();
        g(this.f8851p + this.f8852q, collection, size);
        return size > 0;
    }

    @Override // Z4.g
    public final int b() {
        n();
        return this.f8852q;
    }

    @Override // Z4.g
    public final Object c(int i7) {
        o();
        n();
        int i8 = this.f8852q;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        return p(this.f8851p + i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        n();
        q(this.f8851p, this.f8852q);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        n();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return AbstractC1267a.h(this.f8850o, this.f8851p, this.f8852q, (List) obj);
        }
        return false;
    }

    public final void g(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        C0522b c0522b = this.f8854s;
        C0521a c0521a = this.f8853r;
        if (c0521a != null) {
            c0521a.g(i7, collection, i8);
        } else {
            C0522b c0522b2 = C0522b.f8855r;
            c0522b.g(i7, collection, i8);
        }
        this.f8850o = c0522b.f8856o;
        this.f8852q += i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        n();
        int i8 = this.f8852q;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        return this.f8850o[this.f8851p + i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        n();
        Object[] objArr = this.f8850o;
        int i7 = this.f8852q;
        int iHashCode = 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[this.f8851p + i8];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        C0522b c0522b = this.f8854s;
        C0521a c0521a = this.f8853r;
        if (c0521a != null) {
            c0521a.i(i7, obj);
        } else {
            C0522b c0522b2 = C0522b.f8855r;
            c0522b.i(i7, obj);
        }
        this.f8850o = c0522b.f8856o;
        this.f8852q++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        n();
        for (int i7 = 0; i7 < this.f8852q; i7++) {
            if (AbstractC1209k.a(this.f8850o[this.f8851p + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        n();
        return this.f8852q == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        n();
        for (int i7 = this.f8852q - 1; i7 >= 0; i7--) {
            if (AbstractC1209k.a(this.f8850o[this.f8851p + i7], obj)) {
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
        if (((AbstractList) this.f8854s).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void o() {
        if (this.f8854s.f8858q) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object p(int i7) {
        Object objP;
        ((AbstractList) this).modCount++;
        C0521a c0521a = this.f8853r;
        if (c0521a != null) {
            objP = c0521a.p(i7);
        } else {
            C0522b c0522b = C0522b.f8855r;
            objP = this.f8854s.p(i7);
        }
        this.f8852q--;
        return objP;
    }

    public final void q(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0521a c0521a = this.f8853r;
        if (c0521a != null) {
            c0521a.q(i7, i8);
        } else {
            C0522b c0522b = C0522b.f8855r;
            this.f8854s.q(i7, i8);
        }
        this.f8852q -= i8;
    }

    public final int r(int i7, int i8, Collection collection, boolean z6) {
        int iR;
        C0521a c0521a = this.f8853r;
        if (c0521a != null) {
            iR = c0521a.r(i7, i8, collection, z6);
        } else {
            C0522b c0522b = C0522b.f8855r;
            iR = this.f8854s.r(i7, i8, collection, z6);
        }
        if (iR > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f8852q -= iR;
        return iR;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        o();
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
        o();
        n();
        return r(this.f8851p, this.f8852q, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        o();
        n();
        return r(this.f8851p, this.f8852q, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        o();
        n();
        int i8 = this.f8852q;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        Object[] objArr = this.f8850o;
        int i9 = this.f8851p;
        Object obj2 = objArr[i9 + i7];
        objArr[i9 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        android.support.v4.media.session.b.g(i7, i8, this.f8852q);
        return new C0521a(this.f8850o, this.f8851p + i7, i8 - i7, this, this.f8854s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1209k.f(objArr, "array");
        n();
        int length = objArr.length;
        int i7 = this.f8852q;
        int i8 = this.f8851p;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f8850o, i8, i7 + i8, objArr.getClass());
            AbstractC1209k.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        Z4.l.W(0, i8, i7 + i8, this.f8850o, objArr);
        int i9 = this.f8852q;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        n();
        return AbstractC1267a.i(this.f8850o, this.f8851p, this.f8852q, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        n();
        int i8 = this.f8852q;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
        return new r(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        o();
        n();
        int i8 = this.f8852q;
        if (i7 >= 0 && i7 <= i8) {
            i(this.f8851p + i7, obj);
            return;
        }
        throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        AbstractC1209k.f(collection, "elements");
        o();
        n();
        int i8 = this.f8852q;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            g(this.f8851p + i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        n();
        Object[] objArr = this.f8850o;
        int i7 = this.f8852q;
        int i8 = this.f8851p;
        return Z4.l.c0(objArr, i8, i7 + i8);
    }
}
