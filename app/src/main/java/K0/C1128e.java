package k0;

import a5.C0527g;
import i0.InterfaceC1055c;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m0.C1189a;
import m0.C1190b;
import m5.AbstractC1209k;
import n5.InterfaceC1241e;

/* JADX INFO: renamed from: k0.e */
/* JADX INFO: loaded from: classes.dex */
public class C1128e extends AbstractMap implements InterfaceC1055c, Map, InterfaceC1241e {

    /* JADX INFO: renamed from: o */
    public C1126c f13977o;

    /* JADX INFO: renamed from: p */
    public C1190b f13978p = new C1190b();

    /* JADX INFO: renamed from: q */
    public C1135l f13979q;

    /* JADX INFO: renamed from: r */
    public Object f13980r;

    /* JADX INFO: renamed from: s */
    public int f13981s;

    /* JADX INFO: renamed from: t */
    public int f13982t;

    public C1128e(C1126c c1126c) {
        this.f13977o = c1126c;
        this.f13979q = c1126c.f13972o;
        c1126c.getClass();
        this.f13982t = c1126c.f13973p;
    }

    @Override // i0.InterfaceC1055c
    /* JADX INFO: renamed from: b */
    public C1126c a() {
        C1135l c1135l = this.f13979q;
        C1126c c1126c = this.f13977o;
        if (c1135l != c1126c.f13972o) {
            this.f13978p = new C1190b();
            c1126c = new C1126c(this.f13979q, this.f13982t);
        }
        this.f13977o = c1126c;
        return c1126c;
    }

    public final void c(int i7) {
        this.f13982t = i7;
        this.f13981s++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13979q = C1135l.f13992e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13979q.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C1130g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f13979q.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C1130g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f13980r = null;
        this.f13979q = this.f13979q.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f13980r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C1126c c1126cA = null;
        C1126c c1126c = map instanceof C1126c ? (C1126c) map : null;
        if (c1126c == null) {
            C1128e c1128e = map instanceof C1128e ? (C1128e) map : null;
            if (c1128e != null) {
                c1126cA = c1128e.a();
            }
        } else {
            c1126cA = c1126c;
        }
        if (c1126cA == null) {
            super.putAll(map);
            return;
        }
        C1189a c1189a = new C1189a();
        c1189a.f14324a = 0;
        int i7 = this.f13982t;
        C1135l c1135l = this.f13979q;
        C1135l c1135l2 = c1126cA.f13972o;
        AbstractC1209k.d(c1135l2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f13979q = c1135l.m(c1135l2, 0, c1189a, this);
        int i8 = (c1126cA.f13973p + i7) - c1189a.f14324a;
        if (i7 != i8) {
            c(i8);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i7 = this.f13982t;
        C1135l c1135lO = this.f13979q.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c1135lO == null) {
            c1135lO = C1135l.f13992e;
        }
        this.f13979q = c1135lO;
        return i7 != this.f13982t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13982t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C0527g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f13980r = null;
        C1135l c1135lN = this.f13979q.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c1135lN == null) {
            c1135lN = C1135l.f13992e;
        }
        this.f13979q = c1135lN;
        return this.f13980r;
    }
}
