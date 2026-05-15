package t;

import O0.C0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: t.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1466v implements Map, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J f16116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1453h f16117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1453h f16118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0 f16119r;

    public C1466v(J j3) {
        AbstractC1209k.f(j3, "parent");
        this.f16116o = j3;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f16116o.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f16116o.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1453h c1453h = this.f16117p;
        if (c1453h != null) {
            return c1453h;
        }
        C1453h c1453h2 = new C1453h(this.f16116o, 0);
        this.f16117p = c1453h2;
        return c1453h2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1466v.class != obj.getClass()) {
            return false;
        }
        return AbstractC1209k.a(this.f16116o, ((C1466v) obj).f16116o);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f16116o.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f16116o.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f16116o.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1453h c1453h = this.f16118q;
        if (c1453h != null) {
            return c1453h;
        }
        C1453h c1453h2 = new C1453h(this.f16116o, 1);
        this.f16118q = c1453h2;
        return c1453h2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f16116o.f16007e;
    }

    public final String toString() {
        return this.f16116o.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C0 c02 = this.f16119r;
        if (c02 != null) {
            return c02;
        }
        C0 c03 = new C0(this.f16116o);
        this.f16119r = c03;
        return c03;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
