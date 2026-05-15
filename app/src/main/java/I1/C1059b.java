package i1;

import Z4.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: i1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1059b implements Collection, InterfaceC1237a {

    /* JADX INFO: renamed from: q */
    public static final C1059b f13289q = new C1059b(v.f8818o);

    /* JADX INFO: renamed from: o */
    public final List f13290o;

    /* JADX INFO: renamed from: p */
    public final int f13291p;

    public C1059b(List list) {
        this.f13290o = list;
        this.f13291p = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final C1058a b() {
        return (C1058a) this.f13290o.get(0);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C1058a)) {
            return false;
        }
        return this.f13290o.contains((C1058a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f13290o.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1059b) {
            return AbstractC1209k.a(this.f13290o, ((C1059b) obj).f13290o);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f13290o.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f13290o.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f13290o.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13291p;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1208j.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f13290o + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1208j.b(this, objArr);
    }
}
