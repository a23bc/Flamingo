package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import l0.C1159c;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import n5.InterfaceC1242f;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC1242f, Set, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final K f16026o;

    /* JADX INFO: renamed from: p */
    public final K f16027p;

    public M(K k7) {
        this.f16026o = k7;
        this.f16027p = k7;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f16027p.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        K k7 = this.f16027p;
        int i7 = k7.f16012d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k7.j(it.next());
        }
        return i7 != k7.f16012d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f16027p.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16026o.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f16026o.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        return AbstractC1209k.a(this.f16026o, ((M) obj).f16026o);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f16026o.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f16026o.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1159c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f16027p.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        K k7 = this.f16027p;
        k7.getClass();
        int i7 = k7.f16012d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k7.i(it.next());
        }
        return i7 != k7.f16012d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z6;
        AbstractC1209k.f(collection, "elements");
        K k7 = this.f16027p;
        k7.getClass();
        Object[] objArr = k7.f16010b;
        int i7 = k7.f16012d;
        long[] jArr = k7.f16009a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j3 = jArr[i8];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j3) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (!Z4.n.n0(collection, objArr[i11])) {
                                k7.m(i11);
                            }
                        }
                        j3 >>= 8;
                    }
                    z6 = false;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    z6 = false;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        } else {
            z6 = false;
        }
        if (i7 != k7.f16012d) {
            return true;
        }
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f16026o.f16012d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1208j.a(this);
    }

    public final String toString() {
        return this.f16026o.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1209k.f(objArr, "array");
        return AbstractC1208j.b(this, objArr);
    }
}
