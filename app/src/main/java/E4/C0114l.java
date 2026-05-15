package E4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: E4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0114l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Collection f1959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0114l f1960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Collection f1961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f1962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f1963t;

    public C0114l(W w7, Object obj, List list, C0114l c0114l) {
        this.f1963t = w7;
        this.f1962s = w7;
        this.f1958o = obj;
        this.f1959p = list;
        this.f1960q = c0114l;
        this.f1961r = c0114l == null ? null : c0114l.f1959p;
    }

    public final void a() {
        C0114l c0114l = this.f1960q;
        if (c0114l != null) {
            c0114l.a();
        } else {
            this.f1962s.f1895r.put(this.f1958o, this.f1959p);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f1959p.isEmpty();
        boolean zAdd = this.f1959p.add(obj);
        if (zAdd) {
            this.f1962s.f1896s++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f1959p.addAll(collection);
        if (zAddAll) {
            this.f1962s.f1896s += this.f1959p.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        C0114l c0114l = this.f1960q;
        if (c0114l != null) {
            c0114l.b();
            if (c0114l.f1959p != this.f1961r) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f1959p.isEmpty() || (collection = (Collection) this.f1962s.f1895r.get(this.f1958o)) == null) {
                return;
            }
            this.f1959p = collection;
        }
    }

    public final void c() {
        C0114l c0114l = this.f1960q;
        if (c0114l != null) {
            c0114l.c();
        } else if (this.f1959p.isEmpty()) {
            this.f1962s.f1895r.remove(this.f1958o);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f1959p.clear();
        this.f1962s.f1896s -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f1959p.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f1959p.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f1959p.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        b();
        return ((List) this.f1959p).get(i7);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f1959p.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f1959p).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new C0105c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f1959p).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new C0113k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f1959p.remove(obj);
        if (zRemove) {
            W w7 = this.f1962s;
            w7.f1896s--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f1959p.removeAll(collection);
        if (zRemoveAll) {
            this.f1962s.f1896s += this.f1959p.size() - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f1959p.retainAll(collection);
        if (zRetainAll) {
            this.f1962s.f1896s += this.f1959p.size() - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        b();
        return ((List) this.f1959p).set(i7, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f1959p.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        b();
        List listSubList = ((List) this.f1959p).subList(i7, i8);
        C0114l c0114l = this.f1960q;
        if (c0114l == null) {
            c0114l = this;
        }
        W w7 = this.f1963t;
        w7.getClass();
        boolean z6 = listSubList instanceof RandomAccess;
        Object obj = this.f1958o;
        return z6 ? new C0110h(w7, obj, listSubList, c0114l) : new C0114l(w7, obj, listSubList, c0114l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f1959p.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        b();
        return new C0113k(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        b();
        Object objRemove = ((List) this.f1959p).remove(i7);
        W w7 = this.f1963t;
        w7.f1896s--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        b();
        boolean zIsEmpty = this.f1959p.isEmpty();
        ((List) this.f1959p).add(i7, obj);
        this.f1963t.f1896s++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f1959p).addAll(i7, collection);
        if (zAddAll) {
            this.f1963t.f1896s += this.f1959p.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
