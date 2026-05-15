package E4;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends M {

    /* JADX INFO: renamed from: r */
    public final transient K f1925r;

    /* JADX INFO: renamed from: s */
    public final transient Object[] f1926s;

    /* JADX INFO: renamed from: t */
    public final transient int f1927t;

    /* JADX INFO: renamed from: u */
    public final transient int f1928u;

    public d0(K k7, Object[] objArr, int i7, int i8) {
        this.f1925r = k7;
        this.f1926s = objArr;
        this.f1927t = i7;
        this.f1928u = i8;
    }

    @Override // E4.D
    public final int b(int i7, Object[] objArr) {
        return a().b(i7, objArr);
    }

    @Override // E4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f1925r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // E4.D
    public final boolean i() {
        return true;
    }

    @Override // E4.D
    /* JADX INFO: renamed from: k */
    public final p0 iterator() {
        return a().listIterator(0);
    }

    @Override // E4.M
    public final I q() {
        return new c0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1928u;
    }
}
