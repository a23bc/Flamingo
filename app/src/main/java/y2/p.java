package y2;

import E4.AbstractC0119q;
import E4.k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0119q implements Map {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f20364p;

    public p(Map map) {
        this.f20364p = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f20364p.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f20364p.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((k0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC0119q.i(this.f20364p.entrySet(), new o(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC0119q.g(obj, this);
    }

    @Override // E4.AbstractC0119q
    public final Object f() {
        return this.f20364p;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f20364p.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0119q.l(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f20364p;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC0119q.i(this.f20364p.keySet(), new o(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f20364p.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f20364p.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f20364p.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f20364p;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f20364p.values();
    }
}
