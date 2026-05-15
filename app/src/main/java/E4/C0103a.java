package E4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: E4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0103a implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Iterator f1901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1902p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Collection f1903q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f1904r = O.f1884o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f1905s;

    public C0103a(W w7) {
        this.f1905s = w7;
        this.f1901o = w7.f1895r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1901o.hasNext() || this.f1904r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f1904r.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f1901o.next();
            this.f1902p = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f1903q = collection;
            this.f1904r = collection.iterator();
        }
        return this.f1904r.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1904r.remove();
        Collection collection = this.f1903q;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f1901o.remove();
        }
        W w7 = this.f1905s;
        w7.f1896s--;
    }
}
