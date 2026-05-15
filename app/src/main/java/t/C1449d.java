package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1449d implements Collection {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1450e f16061o;

    public C1449d(C1450e c1450e) {
        this.f16061o = c1450e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f16061o.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16061o.b(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16061o.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1446a(this.f16061o, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1450e c1450e = this.f16061o;
        int iB = c1450e.b(obj);
        if (iB < 0) {
            return false;
        }
        c1450e.g(iB);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1450e c1450e = this.f16061o;
        int i7 = c1450e.f16036q;
        int i8 = 0;
        boolean z6 = false;
        while (i8 < i7) {
            if (collection.contains(c1450e.i(i8))) {
                c1450e.g(i8);
                i8--;
                i7--;
                z6 = true;
            }
            i8++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1450e c1450e = this.f16061o;
        int i7 = c1450e.f16036q;
        int i8 = 0;
        boolean z6 = false;
        while (i8 < i7) {
            if (!collection.contains(c1450e.i(i8))) {
                c1450e.g(i8);
                i8--;
                i7--;
                z6 = true;
            }
            i8++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16061o.f16036q;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1450e c1450e = this.f16061o;
        int i7 = c1450e.f16036q;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1450e.i(i8);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1450e c1450e = this.f16061o;
        int i7 = c1450e.f16036q;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1450e.i(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
