package E4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: E4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0107e extends m0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f1929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W f1930p;

    public C0107e(W w7, Map map) {
        this.f1930p = w7;
        map.getClass();
        this.f1929o = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0105c c0105c = (C0105c) it;
            if (!c0105c.hasNext()) {
                return;
            }
            c0105c.next();
            c0105c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1929o.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f1929o.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f1929o.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1929o.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1929o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0105c(this, this.f1929o.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f1929o.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f1930p.f1896s -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1929o.size();
    }
}
