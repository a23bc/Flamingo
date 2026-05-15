package E4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class K implements Map, Serializable {

    /* JADX INFO: renamed from: o */
    public transient M f1874o;

    /* JADX INFO: renamed from: p */
    public transient M f1875p;

    /* JADX INFO: renamed from: q */
    public transient D f1876q;

    public static K b(Map map) {
        if ((map instanceof K) && !(map instanceof SortedMap)) {
            K k7 = (K) map;
            k7.getClass();
            return k7;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z6 = setEntrySet instanceof Collection;
        D4.i iVar = new D4.i(z6 ? setEntrySet.size() : 4);
        if (z6) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) iVar.f1583q;
            if (size > objArr.length) {
                iVar.f1583q = Arrays.copyOf(objArr, C.d(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            iVar.z(entry.getKey(), entry.getValue());
        }
        return iVar.d();
    }

    public abstract d0 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract e0 d();

    public abstract D e();

    @Override // java.util.Map
    public final Set entrySet() {
        M m7 = this.f1874o;
        if (m7 != null) {
            return m7;
        }
        d0 d0VarC = c();
        this.f1874o = d0VarC;
        return d0VarC;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0119q.g(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f */
    public D values() {
        D d4 = this.f1876q;
        if (d4 != null) {
            return d4;
        }
        D dE = e();
        this.f1876q = dE;
        return dE;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        M mC = this.f1874o;
        if (mC == null) {
            mC = c();
            this.f1874o = mC;
        }
        return AbstractC0119q.l(mC);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        M m7 = this.f1875p;
        if (m7 != null) {
            return m7;
        }
        e0 e0VarD = d();
        this.f1875p = e0VarD;
        return e0VarD;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        AbstractC0119q.d(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
