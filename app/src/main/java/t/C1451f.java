package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import m5.AbstractC1209k;
import n5.InterfaceC1238b;
import n5.InterfaceC1242f;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1451f implements Collection, Set, InterfaceC1238b, InterfaceC1242f {

    /* JADX INFO: renamed from: o */
    public int[] f16065o = AbstractC1525a.f17126a;

    /* JADX INFO: renamed from: p */
    public Object[] f16066p = AbstractC1525a.f17128c;

    /* JADX INFO: renamed from: q */
    public int f16067q;

    public C1451f(int i7) {
        if (i7 > 0) {
            AbstractC1464t.b(this, i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int iC;
        int i8 = this.f16067q;
        if (obj == null) {
            iC = AbstractC1464t.c(this, null, 0);
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iC = AbstractC1464t.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i9 = ~iC;
        int[] iArr = this.f16065o;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f16066p;
            AbstractC1464t.b(this, i10);
            if (i8 != this.f16067q) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f16065o;
            if (iArr2.length != 0) {
                Z4.l.Z(0, iArr.length, 6, iArr, iArr2);
                Z4.l.a0(0, objArr.length, 6, objArr, this.f16066p);
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f16065o;
            int i11 = i9 + 1;
            Z4.l.V(i11, i9, i8, iArr3, iArr3);
            Object[] objArr2 = this.f16066p;
            Z4.l.W(i11, i9, i8, objArr2, objArr2);
        }
        int i12 = this.f16067q;
        if (i8 == i12) {
            int[] iArr4 = this.f16065o;
            if (i9 < iArr4.length) {
                iArr4[i9] = i7;
                this.f16066p[i9] = obj;
                this.f16067q = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        int size = collection.size() + this.f16067q;
        int i7 = this.f16067q;
        int[] iArr = this.f16065o;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f16066p;
            AbstractC1464t.b(this, size);
            int i8 = this.f16067q;
            if (i8 > 0) {
                Z4.l.Z(0, i8, 6, iArr, this.f16065o);
                Z4.l.a0(0, this.f16067q, 6, objArr, this.f16066p);
            }
        }
        if (this.f16067q != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i7) {
        int i8 = this.f16067q;
        Object[] objArr = this.f16066p;
        Object obj = objArr[i7];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i9 = i8 - 1;
        int[] iArr = this.f16065o;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (i7 < i9) {
                int i10 = i7 + 1;
                Z4.l.V(i7, i10, i8, iArr, iArr);
                Object[] objArr2 = this.f16066p;
                Z4.l.W(i7, i10, i8, objArr2, objArr2);
            }
            this.f16066p[i9] = null;
        } else {
            AbstractC1464t.b(this, i8 > 8 ? i8 + (i8 >> 1) : 8);
            if (i7 > 0) {
                Z4.l.Z(0, i7, 6, iArr, this.f16065o);
                Z4.l.a0(0, i7, 6, objArr, this.f16066p);
            }
            if (i7 < i9) {
                int i11 = i7 + 1;
                Z4.l.V(i7, i11, i8, iArr, this.f16065o);
                Z4.l.W(i7, i11, i8, objArr, this.f16066p);
            }
        }
        if (i8 != this.f16067q) {
            throw new ConcurrentModificationException();
        }
        this.f16067q = i9;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f16067q != 0) {
            this.f16065o = AbstractC1525a.f17126a;
            this.f16066p = AbstractC1525a.f17128c;
            this.f16067q = 0;
        }
        if (this.f16067q != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1464t.c(this, null, 0) : AbstractC1464t.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f16067q != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.f16067q;
            for (int i8 = 0; i8 < i7; i8++) {
                if (!((Set) obj).contains(this.f16066p[i8])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f16065o;
        int i7 = this.f16067q;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16067q <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1446a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? AbstractC1464t.c(this, null, 0) : AbstractC1464t.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        b(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC1209k.f(collection, "elements");
        boolean z6 = false;
        for (int i7 = this.f16067q - 1; -1 < i7; i7--) {
            if (!Z4.n.n0(collection, this.f16066p[i7])) {
                b(i7);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f16067q;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return Z4.l.c0(this.f16066p, 0, this.f16067q);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16067q * 14);
        sb.append('{');
        int i7 = this.f16067q;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f16066p[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC1209k.f(objArr, "array");
        int i7 = this.f16067q;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        } else if (objArr.length > i7) {
            objArr[i7] = null;
        }
        Z4.l.W(0, 0, this.f16067q, this.f16066p, objArr);
        return objArr;
    }
}
