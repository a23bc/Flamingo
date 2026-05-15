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
import t.C1440B;
import t.C1444F;
import u.AbstractC1525a;

/* JADX INFO: renamed from: Q0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0363t implements List, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final C1444F f6072o = new C1444F(16);

    /* JADX INFO: renamed from: p */
    public final C1440B f6073p = new C1440B(16);

    /* JADX INFO: renamed from: q */
    public int f6074q = -1;

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

    /* JADX WARN: Code restructure failed: missing block: B:47:0x003d, code lost:
    
        u.AbstractC1525a.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0043, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = Q0.AbstractC0347f.a(r0, r1, r1)
            int r2 = r7.f6074q
            int r2 = r2 + 1
            int r3 = Z4.o.d0(r7)
            if (r2 > r3) goto L44
        L11:
            t.B r4 = r7.f6073p
            if (r2 < 0) goto L3a
            int r5 = r4.f15965b
            if (r2 >= r5) goto L3d
            long[] r4 = r4.f15964a
            r5 = r4[r2]
            int r4 = Q0.AbstractC0347f.h(r5, r0)
            if (r4 >= 0) goto L24
            r0 = r5
        L24:
            float r4 = Q0.AbstractC0347f.l(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = Q0.AbstractC0347f.q(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r0 = "Index must be between 0 and size"
            u.AbstractC1525a.d(r0)
            r0 = 0
            throw r0
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0363t.b():long");
    }

    public final void c(int i7, int i8) {
        if (i7 >= i8) {
            return;
        }
        this.f6072o.k(i7, i8);
        C1440B c1440b = this.f6073p;
        if (i7 >= 0) {
            int i9 = c1440b.f15965b;
            if (i7 <= i9 && i8 >= 0 && i8 <= i9) {
                if (i8 < i7) {
                    AbstractC1525a.c("The end index must be < start index");
                    throw null;
                }
                if (i8 != i7) {
                    if (i8 < i9) {
                        long[] jArr = c1440b.f15964a;
                        Z4.l.Y(jArr, jArr, i7, i8, i9);
                    }
                    c1440b.f15965b -= i8 - i7;
                    return;
                }
                return;
            }
        } else {
            c1440b.getClass();
        }
        AbstractC1525a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f6074q = -1;
        this.f6072o.c();
        this.f6073p.f15965b = 0;
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
        Object objE = this.f6072o.e(i7);
        AbstractC1209k.d(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC1397o) objE;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC1397o)) {
            return -1;
        }
        AbstractC1397o abstractC1397o = (AbstractC1397o) obj;
        int iD0 = Z4.o.d0(this);
        if (iD0 >= 0) {
            int i7 = 0;
            while (!AbstractC1209k.a(this.f6072o.e(i7), abstractC1397o)) {
                if (i7 != iD0) {
                    i7++;
                }
            }
            return i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f6072o.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC1397o)) {
            return -1;
        }
        AbstractC1397o abstractC1397o = (AbstractC1397o) obj;
        for (int iD0 = Z4.o.d0(this); -1 < iD0; iD0--) {
            if (AbstractC1209k.a(this.f6072o.e(iD0), abstractC1397o)) {
                return iD0;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new r(this, 0, 7);
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
        return this.f6072o.f15984b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        return new C0362s(this, i7, i8);
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
        return new r(this, i7, 6);
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
