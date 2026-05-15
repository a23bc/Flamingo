package h0;

import Z4.l;
import Z4.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1239c;
import t.C1444F;
import t.O;
import u.AbstractC1525a;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0994b implements List, InterfaceC1239c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f12537o = 0;

    /* JADX INFO: renamed from: p */
    public final Object f12538p;

    public C0994b(e eVar) {
        this.f12538p = eVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        switch (this.f12537o) {
            case 0:
                ((e) this.f12538p).a(i7, obj);
                return;
            default:
                C1444F c1444f = (C1444F) this.f12538p;
                if (i7 < 0 || i7 > (i8 = c1444f.f15984b)) {
                    c1444f.getClass();
                    AbstractC1525a.d("Index " + i7 + " must be in 0.." + c1444f.f15984b);
                    throw null;
                }
                int i9 = i8 + 1;
                Object[] objArr = c1444f.f15983a;
                if (objArr.length < i9) {
                    c1444f.l(i9, objArr);
                }
                Object[] objArr2 = c1444f.f15983a;
                int i10 = c1444f.f15984b;
                if (i7 != i10) {
                    l.W(i7 + 1, i7, i10, objArr2, objArr2);
                }
                objArr2[i7] = obj;
                c1444f.f15984b++;
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        switch (this.f12537o) {
            case 0:
                return ((e) this.f12538p).e(i7, collection);
            default:
                AbstractC1209k.f(collection, "elements");
                C1444F c1444f = (C1444F) this.f12538p;
                c1444f.getClass();
                if (i7 < 0 || i7 > c1444f.f15984b) {
                    StringBuilder sbV = n1.c.v(i7, "Index ", " must be in 0..");
                    sbV.append(c1444f.f15984b);
                    AbstractC1525a.d(sbV.toString());
                    throw null;
                }
                int i8 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + c1444f.f15984b;
                Object[] objArr = c1444f.f15983a;
                if (objArr.length < size) {
                    c1444f.l(size, objArr);
                }
                Object[] objArr2 = c1444f.f15983a;
                if (i7 != c1444f.f15984b) {
                    l.W(collection.size() + i7, i7, c1444f.f15984b, objArr2, objArr2);
                }
                for (Object obj : collection) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        o.i0();
                        throw null;
                    }
                    objArr2[i8 + i7] = obj;
                    i8 = i9;
                }
                c1444f.f15984b = collection.size() + c1444f.f15984b;
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f12537o) {
            case 0:
                ((e) this.f12538p).h();
                break;
            default:
                ((C1444F) this.f12538p).c();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f12537o) {
            case 0:
                return ((e) this.f12538p).i(obj);
            default:
                return ((C1444F) this.f12538p).f(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12537o) {
            case 0:
                e eVar = (e) this.f12538p;
                eVar.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!eVar.i(it.next())) {
                        break;
                    }
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                C1444F c1444f = (C1444F) this.f12538p;
                c1444f.getClass();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (c1444f.f(it2.next()) < 0) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f12537o) {
            case 0:
                f.a(i7, this);
                return ((e) this.f12538p).f12546o[i7];
            default:
                O.a(i7, this);
                return ((C1444F) this.f12538p).e(i7);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f12537o) {
            case 0:
                return ((e) this.f12538p).j(obj);
            default:
                return ((C1444F) this.f12538p).f(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f12537o) {
            case 0:
                return ((e) this.f12538p).f12548q == 0;
            default:
                return ((C1444F) this.f12538p).g();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12537o) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        switch (this.f12537o) {
            case 0:
                e eVar = (e) this.f12538p;
                Object[] objArr = eVar.f12546o;
                for (int i8 = eVar.f12548q - 1; i8 >= 0; i8--) {
                    if (AbstractC1209k.a(obj, objArr[i8])) {
                        return i8;
                    }
                }
                return -1;
            default:
                C1444F c1444f = (C1444F) this.f12538p;
                if (obj == null) {
                    Object[] objArr2 = c1444f.f15983a;
                    i7 = c1444f.f15984b - 1;
                    while (-1 < i7) {
                        if (objArr2[i7] != null) {
                            i7--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = c1444f.f15983a;
                i7 = c1444f.f15984b - 1;
                while (-1 < i7) {
                    if (!obj.equals(objArr3[i7])) {
                        i7--;
                    }
                }
                return -1;
                return i7;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f12537o) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12537o) {
            case 0:
                return ((e) this.f12538p).k(obj);
            default:
                return ((C1444F) this.f12538p).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12537o) {
            case 0:
                e eVar = (e) this.f12538p;
                eVar.getClass();
                if (!collection.isEmpty()) {
                    int i7 = eVar.f12548q;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eVar.k(it.next());
                    }
                    if (i7 != eVar.f12548q) {
                    }
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                C1444F c1444f = (C1444F) this.f12538p;
                c1444f.getClass();
                int i8 = c1444f.f15984b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    c1444f.i(it2.next());
                }
                if (i8 != c1444f.f15984b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12537o) {
            case 0:
                e eVar = (e) this.f12538p;
                int i7 = eVar.f12548q;
                for (int i8 = i7 - 1; -1 < i8; i8--) {
                    if (!collection.contains(eVar.f12546o[i8])) {
                        eVar.l(i8);
                    }
                }
                if (i7 != eVar.f12548q) {
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                C1444F c1444f = (C1444F) this.f12538p;
                c1444f.getClass();
                int i9 = c1444f.f15984b;
                Object[] objArr = c1444f.f15983a;
                for (int i10 = i9 - 1; -1 < i10; i10--) {
                    if (!collection.contains(objArr[i10])) {
                        c1444f.j(i10);
                    }
                }
                if (i9 != c1444f.f15984b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        switch (this.f12537o) {
            case 0:
                f.a(i7, this);
                Object[] objArr = ((e) this.f12538p).f12546o;
                Object obj2 = objArr[i7];
                objArr[i7] = obj;
                return obj2;
            default:
                O.a(i7, this);
                C1444F c1444f = (C1444F) this.f12538p;
                if (i7 < 0 || i7 >= c1444f.f15984b) {
                    c1444f.m(i7);
                    throw null;
                }
                Object[] objArr2 = c1444f.f15983a;
                Object obj3 = objArr2[i7];
                objArr2[i7] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f12537o) {
            case 0:
                return ((e) this.f12538p).f12548q;
            default:
                return ((C1444F) this.f12538p).f15984b;
        }
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        switch (this.f12537o) {
            case 0:
                f.b(i7, i8, this);
                return new C0995c(this, i7, i8, 0);
            default:
                O.b(i7, i8, this);
                return new C0995c(this, i7, i8, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f12537o) {
        }
        return AbstractC1208j.a(this);
    }

    public C0994b(C1444F c1444f) {
        AbstractC1209k.f(c1444f, "objectList");
        this.f12538p = c1444f;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        switch (this.f12537o) {
            case 0:
                return new d(i7, 0, this);
            default:
                return new d(i7, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        switch (this.f12537o) {
            case 0:
                f.a(i7, this);
                return ((e) this.f12538p).l(i7);
            default:
                O.a(i7, this);
                return ((C1444F) this.f12538p).j(i7);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12537o) {
            case 0:
                break;
            default:
                AbstractC1209k.f(objArr, "array");
                break;
        }
        return AbstractC1208j.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12537o) {
            case 0:
                ((e) this.f12538p).b(obj);
                break;
            default:
                ((C1444F) this.f12538p).a(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12537o) {
            case 0:
                e eVar = (e) this.f12538p;
                return eVar.e(eVar.f12548q, collection);
            default:
                AbstractC1209k.f(collection, "elements");
                C1444F c1444f = (C1444F) this.f12538p;
                c1444f.getClass();
                int i7 = c1444f.f15984b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c1444f.a(it.next());
                }
                return i7 != c1444f.f15984b;
        }
    }
}
