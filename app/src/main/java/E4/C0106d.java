package E4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: E4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0106d extends AbstractMap {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient C0104b f1921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient C0116n f1922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Map f1923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f1924r;

    public C0106d(W w7, Map map) {
        this.f1924r = w7;
        this.f1923q = map;
    }

    public final E b(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        W w7 = this.f1924r;
        List list = (List) collection;
        return new E(key, list instanceof RandomAccess ? new C0110h(w7, key, list, null) : new C0114l(w7, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        W w7 = this.f1924r;
        if (this.f1923q == w7.f1895r) {
            w7.b();
            return;
        }
        C0105c c0105c = new C0105c(this);
        while (c0105c.hasNext()) {
            c0105c.next();
            c0105c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f1923q;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0104b c0104b = this.f1921o;
        if (c0104b != null) {
            return c0104b;
        }
        C0104b c0104b2 = new C0104b(this);
        this.f1921o = c0104b2;
        return c0104b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f1923q.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f1923q;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        W w7 = this.f1924r;
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0110h(w7, obj, list, null) : new C0114l(w7, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f1923q.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        W w7 = this.f1924r;
        C0107e c0107e = w7.f1967o;
        if (c0107e != null) {
            return c0107e;
        }
        Map map = w7.f1895r;
        C0107e c0109g = map instanceof NavigableMap ? new C0109g(w7, (NavigableMap) map) : map instanceof SortedMap ? new C0112j(w7, (SortedMap) map) : new C0107e(w7, map);
        w7.f1967o = c0109g;
        return c0109g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f1923q.remove(obj);
        if (collection == null) {
            return null;
        }
        W w7 = this.f1924r;
        List list = (List) w7.f1897t.get();
        list.addAll(collection);
        w7.f1896s -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1923q.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f1923q.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0116n c0116n = this.f1922p;
        if (c0116n != null) {
            return c0116n;
        }
        C0116n c0116n2 = new C0116n(this);
        this.f1922p = c0116n2;
        return c0116n2;
    }
}
