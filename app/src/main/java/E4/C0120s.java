package E4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: E4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120s extends AbstractSet {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0122u f1981p;

    public /* synthetic */ C0120s(C0122u c0122u, int i7) {
        this.f1980o = i7;
        this.f1981p = c0122u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1980o) {
            case 0:
                this.f1981p.clear();
                break;
            default:
                this.f1981p.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f1980o) {
            case 0:
                C0122u c0122u = this.f1981p;
                Map mapC = c0122u.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = c0122u.e(entry.getKey());
                    if (iE != -1 && M3.a.L(c0122u.l()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f1981p.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1980o) {
            case 0:
                C0122u c0122u = this.f1981p;
                Map mapC = c0122u.c();
                return mapC != null ? mapC.entrySet().iterator() : new r(c0122u, 1);
            default:
                C0122u c0122u2 = this.f1981p;
                Map mapC2 = c0122u2.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new r(c0122u2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f1980o) {
            case 0:
                C0122u c0122u = this.f1981p;
                Map mapC = c0122u.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0122u.g()) {
                        int iD = c0122u.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0122u.f1986o;
                        Objects.requireNonNull(obj2);
                        int iP = AbstractC0119q.p(key, value, iD, obj2, c0122u.i(), c0122u.j(), c0122u.l());
                        if (iP != -1) {
                            c0122u.f(iP, iD);
                            c0122u.f1991t--;
                            c0122u.f1990s += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0122u c0122u2 = this.f1981p;
                Map mapC2 = c0122u2.c();
                return mapC2 != null ? mapC2.keySet().remove(obj) : c0122u2.h(obj) != C0122u.f1985x;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1980o) {
        }
        return this.f1981p.size();
    }
}
