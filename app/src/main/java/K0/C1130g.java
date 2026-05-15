package k0;

import E0.G;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: k0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1130g extends Z4.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1128e f13988p;

    public /* synthetic */ C1130g(int i7, C1128e c1128e) {
        this.f13987o = i7;
        this.f13988p = c1128e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f13987o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // Z4.h
    public final int b() {
        switch (this.f13987o) {
            case 0:
                C1128e c1128e = this.f13988p;
                c1128e.getClass();
                return c1128e.f13982t;
            default:
                C1128e c1128e2 = this.f13988p;
                c1128e2.getClass();
                return c1128e2.f13982t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f13987o) {
            case 0:
                this.f13988p.clear();
                break;
            default:
                this.f13988p.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f13987o) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!((entry instanceof Object ? entry : null) instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                C1128e c1128e = this.f13988p;
                Object obj2 = c1128e.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c1128e.containsKey(entry.getKey());
            default:
                return this.f13988p.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13987o) {
            case 0:
                return new G(this.f13988p);
            default:
                AbstractC1136m[] abstractC1136mArr = new AbstractC1136m[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    abstractC1136mArr[i7] = new C1137n(1);
                }
                return new C1131h(this.f13988p, abstractC1136mArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f13987o) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
                    return this.f13988p.remove(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                C1128e c1128e = this.f13988p;
                if (!c1128e.containsKey(obj)) {
                    return false;
                }
                c1128e.remove(obj);
                return true;
        }
    }
}
