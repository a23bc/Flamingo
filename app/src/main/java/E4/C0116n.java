package E4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: E4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0116n extends AbstractCollection {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1964o;

    /* JADX INFO: renamed from: p */
    public final Object f1965p;

    public /* synthetic */ C0116n(int i7, Serializable serializable) {
        this.f1964o = i7;
        this.f1965p = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f1964o) {
            case 0:
                ((W) this.f1965p).b();
                break;
            case 1:
                ((C0122u) this.f1965p).clear();
                break;
            default:
                ((C0106d) this.f1965p).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f1964o) {
            case 0:
                Iterator it = ((C0116n) ((W) this.f1965p).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C0106d) this.f1965p).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f1964o) {
            case 2:
                return ((C0106d) this.f1965p).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1964o) {
            case 0:
                return new C0103a((W) this.f1965p);
            case 1:
                C0122u c0122u = (C0122u) this.f1965p;
                Map mapC = c0122u.c();
                return mapC != null ? mapC.values().iterator() : new r(c0122u, 2);
            default:
                return new U(((C0106d) this.f1965p).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f1964o) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0106d c0106d = (C0106d) this.f1965p;
                    for (Map.Entry entry : c0106d.entrySet()) {
                        if (M3.a.L(obj, entry.getValue())) {
                            c0106d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f1964o) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0106d c0106d = (C0106d) this.f1965p;
                    for (Map.Entry entry : c0106d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0106d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f1964o) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0106d c0106d = (C0106d) this.f1965p;
                    for (Map.Entry entry : c0106d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0106d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f1964o) {
            case 0:
                return ((W) this.f1965p).f1896s;
            case 1:
                return ((C0122u) this.f1965p).size();
            default:
                return ((C0106d) this.f1965p).f1923q.size();
        }
    }

    public C0116n(C0106d c0106d) {
        this.f1964o = 2;
        this.f1965p = c0106d;
    }
}
