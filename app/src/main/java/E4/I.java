package E4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends D implements List, RandomAccess {

    /* JADX INFO: renamed from: p */
    public static final G f1870p = new G(b0.f1913s, 0);

    public static b0 n(int i7, Object[] objArr) {
        return i7 == 0 ? b0.f1913s : new b0(i7, objArr);
    }

    public static F o() {
        return new F(4);
    }

    public static I p(Collection collection) {
        if (!(collection instanceof D)) {
            Object[] array = collection.toArray();
            AbstractC0119q.c(array.length, array);
            return n(array.length, array);
        }
        I iA = ((D) collection).a();
        if (!iA.i()) {
            return iA;
        }
        Object[] array2 = iA.toArray(D.f1861o);
        return n(array2.length, array2);
    }

    public static b0 q(Object[] objArr) {
        if (objArr.length == 0) {
            return b0.f1913s;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC0119q.c(objArr2.length, objArr2);
        return n(objArr2.length, objArr2);
    }

    public static b0 s(Long l, Long l7, Long l8, Long l9, Long l10) {
        Object[] objArr = {l, l7, l8, l9, l10};
        AbstractC0119q.c(5, objArr);
        return n(5, objArr);
    }

    public static b0 t(Object obj) {
        Object[] objArr = {obj};
        AbstractC0119q.c(1, objArr);
        return n(1, objArr);
    }

    public static b0 u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC0119q.c(2, objArr);
        return n(2, objArr);
    }

    public static b0 v(Z z6, List list) {
        z6.getClass();
        if (!(list instanceof Collection)) {
            list = AbstractC0119q.o(list.iterator());
        }
        Object[] array = list.toArray();
        AbstractC0119q.c(array.length, array);
        Arrays.sort(array, z6);
        return n(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // E4.D
    public int b(int i7, Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // E4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && M3.a.L(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i7 = 0; i7 < size; i7++) {
                        if (M3.a.L(get(i7), list.get(i7))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~(get(i8).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // E4.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // E4.D
    /* JADX INFO: renamed from: k */
    public final p0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r */
    public final G listIterator(int i7) {
        N5.d.s(i7, size());
        return isEmpty() ? f1870p : new G(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: w */
    public I subList(int i7, int i8) {
        N5.d.t(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? b0.f1913s : new H(this, i7, i9);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // E4.D
    public final I a() {
        return this;
    }
}
