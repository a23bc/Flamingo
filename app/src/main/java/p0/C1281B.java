package p0;

import f0.AbstractC0908q0;
import j0.AbstractC1092c;
import j0.C1095f;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import m5.C1218t;
import n5.InterfaceC1239c;
import r5.C1422c;

/* JADX INFO: renamed from: p0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1281B implements List, InterfaceC1239c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f14891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14894r;

    public C1281B(p pVar, int i7, int i8) {
        this.f14891o = pVar;
        this.f14892p = i7;
        this.f14893q = q.f(pVar);
        this.f14894r = i8 - i7;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i7 = this.f14892p + this.f14894r;
        p pVar = this.f14891o;
        pVar.add(i7, obj);
        this.f14894r++;
        this.f14893q = q.f(pVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f14894r, collection);
    }

    public final void b() {
        if (q.f(this.f14891o) != this.f14893q) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f14894r > 0) {
            b();
            int i7 = this.f14894r;
            int i8 = this.f14892p;
            p pVar = this.f14891o;
            pVar.o(i8, i7 + i8);
            this.f14894r = 0;
            this.f14893q = q.f(pVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        b();
        q.a(i7, this.f14894r);
        return this.f14891o.get(this.f14892p + i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i7 = this.f14894r;
        int i8 = this.f14892p;
        Iterator it = i6.h.M(i8, i7 + i8).iterator();
        while (it.hasNext()) {
            int iB = ((C1422c) it).b();
            if (AbstractC1209k.a(obj, this.f14891o.get(iB))) {
                return iB - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f14894r == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i7 = this.f14894r;
        int i8 = this.f14892p;
        for (int i9 = (i7 + i8) - 1; i9 >= i8; i9--) {
            if (AbstractC1209k.a(obj, this.f14891o.get(i9))) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z6 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z6) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        b();
        p pVar = this.f14891o;
        int i8 = this.f14892p;
        int i9 = this.f14894r + i8;
        int size = pVar.size();
        do {
            synchronized (q.f14953a) {
                v vVar = pVar.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i7 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            C1095f c1095fI = abstractC1092c.i();
            c1095fI.subList(i8, i9).retainAll(collection);
            AbstractC1092c abstractC1092cE = c1095fI.e();
            if (AbstractC1209k.a(abstractC1092cE, abstractC1092c)) {
                break;
            }
            v vVar3 = pVar.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, pVar, abstractC1289fK), i7, abstractC1092cE, true);
            }
            l.o(abstractC1289fK, pVar);
        } while (!zB);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.f14893q = q.f(this.f14891o);
            this.f14894r -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        q.a(i7, this.f14894r);
        b();
        int i8 = i7 + this.f14892p;
        p pVar = this.f14891o;
        Object obj2 = pVar.set(i8, obj);
        this.f14893q = q.f(pVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14894r;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        if (!(i7 >= 0 && i7 <= i8 && i8 <= this.f14894r)) {
            AbstractC0908q0.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i9 = this.f14892p;
        return new C1281B(this.f14891o, i7 + i9, i8 + i9);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1208j.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        b();
        C1218t c1218t = new C1218t();
        c1218t.f14437o = i7 - 1;
        return new Z4.z(c1218t, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1208j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        b();
        int i8 = i7 + this.f14892p;
        p pVar = this.f14891o;
        boolean zAddAll = pVar.addAll(i8, collection);
        if (zAddAll) {
            this.f14894r = collection.size() + this.f14894r;
            this.f14893q = q.f(pVar);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        b();
        int i8 = this.f14892p + i7;
        p pVar = this.f14891o;
        Object objRemove = pVar.remove(i8);
        this.f14894r--;
        this.f14893q = q.f(pVar);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        b();
        int i8 = this.f14892p + i7;
        p pVar = this.f14891o;
        pVar.add(i8, obj);
        this.f14894r++;
        this.f14893q = q.f(pVar);
    }
}
