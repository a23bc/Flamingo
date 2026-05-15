package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractMap {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f9435u = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f9437p = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map f9438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile e0 f9440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f9441t;

    public Z(int i7) {
        this.f9436o = i7;
        Map map = Collections.EMPTY_MAP;
        this.f9438q = map;
        this.f9441t = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f9437p
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f9437p
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.c0 r2 = (androidx.datastore.preferences.protobuf.c0) r2
            java.lang.Comparable r2 = r2.f9445o
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f9437p
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.c0 r3 = (androidx.datastore.preferences.protobuf.c0) r3
            java.lang.Comparable r3 = r3.f9445o
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Z.b(java.lang.Comparable):int");
    }

    public final void c() {
        if (this.f9439r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f9437p.isEmpty()) {
            this.f9437p.clear();
        }
        if (this.f9438q.isEmpty()) {
            return;
        }
        this.f9438q.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f9438q.containsKey(comparable);
    }

    public final Map.Entry d(int i7) {
        return (Map.Entry) this.f9437p.get(i7);
    }

    public final Iterable e() {
        return this.f9438q.isEmpty() ? M.f9401b : this.f9438q.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9440s == null) {
            this.f9440s = new e0(this, 0);
        }
        return this.f9440s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return super.equals(obj);
        }
        Z z6 = (Z) obj;
        int size = size();
        if (size == z6.size()) {
            int size2 = this.f9437p.size();
            if (size2 != z6.f9437p.size()) {
                return ((AbstractSet) entrySet()).equals(z6.entrySet());
            }
            for (int i7 = 0; i7 < size2; i7++) {
                if (d(i7).equals(z6.d(i7))) {
                }
            }
            if (size2 != size) {
                return this.f9438q.equals(z6.f9438q);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.f9438q.isEmpty() && !(this.f9438q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9438q = treeMap;
            this.f9441t = treeMap.descendingMap();
        }
        return (SortedMap) this.f9438q;
    }

    public final Object g(Comparable comparable, Object obj) {
        c();
        int iB = b(comparable);
        if (iB >= 0) {
            return ((c0) this.f9437p.get(iB)).setValue(obj);
        }
        c();
        boolean zIsEmpty = this.f9437p.isEmpty();
        int i7 = this.f9436o;
        if (zIsEmpty && !(this.f9437p instanceof ArrayList)) {
            this.f9437p = new ArrayList(i7);
        }
        int i8 = -(iB + 1);
        if (i8 >= i7) {
            return f().put(comparable, obj);
        }
        if (this.f9437p.size() == i7) {
            c0 c0Var = (c0) this.f9437p.remove(i7 - 1);
            f().put(c0Var.f9445o, c0Var.f9446p);
        }
        this.f9437p.add(i8, new c0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? ((c0) this.f9437p.get(iB)).f9446p : this.f9438q.get(comparable);
    }

    public final Object h(int i7) {
        c();
        Object obj = ((c0) this.f9437p.remove(i7)).f9446p;
        if (!this.f9438q.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f9437p;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new c0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f9437p.size();
        int iHashCode = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode += ((c0) this.f9437p.get(i7)).hashCode();
        }
        return this.f9438q.size() > 0 ? this.f9438q.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return g(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return h(iB);
        }
        if (this.f9438q.isEmpty()) {
            return null;
        }
        return this.f9438q.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9438q.size() + this.f9437p.size();
    }
}
