package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: t.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1447b implements Set {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1450e f16056o;

    public C1447b(C1450e c1450e) {
        this.f16056o = c1450e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f16056o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16056o.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f16056o.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C1450e c1450e = this.f16056o;
        try {
            if (c1450e.f16036q == set.size()) {
                return c1450e.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1450e c1450e = this.f16056o;
        int iHashCode = 0;
        for (int i7 = c1450e.f16036q - 1; i7 >= 0; i7--) {
            Object objF = c1450e.f(i7);
            iHashCode += objF == null ? 0 : objF.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f16056o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1446a(this.f16056o, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1450e c1450e = this.f16056o;
        int iD = c1450e.d(obj);
        if (iD < 0) {
            return false;
        }
        c1450e.g(iD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f16056o.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1450e c1450e = this.f16056o;
        int i7 = c1450e.f16036q;
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (!collection.contains(c1450e.f(i8))) {
                c1450e.g(i8);
            }
        }
        return i7 != c1450e.f16036q;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f16056o.f16036q;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1450e c1450e = this.f16056o;
        int i7 = c1450e.f16036q;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1450e.f(i8);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1450e c1450e = this.f16056o;
        int i7 = c1450e.f16036q;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1450e.f(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
