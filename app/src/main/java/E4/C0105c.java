package E4;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: E4.c */
/* JADX INFO: loaded from: classes.dex */
public class C0105c implements Iterator {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1916o = 0;

    /* JADX INFO: renamed from: p */
    public final Iterator f1917p;

    /* JADX INFO: renamed from: q */
    public Object f1918q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f1919r;

    public C0105c(C0114l c0114l) {
        this.f1919r = c0114l;
        Collection collection = c0114l.f1959p;
        this.f1918q = collection;
        this.f1917p = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C0114l c0114l = (C0114l) this.f1919r;
        c0114l.b();
        if (c0114l.f1959p != ((Collection) this.f1918q)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1916o) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f1917p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1916o) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f1917p.next();
                this.f1918q = (Collection) entry.getValue();
                return ((C0106d) this.f1919r).b(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f1917p.next();
                this.f1918q = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f1917p.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1916o) {
            case 0:
                if (!(((Collection) this.f1918q) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f1917p.remove();
                ((C0106d) this.f1919r).f1924r.f1896s -= ((Collection) this.f1918q).size();
                ((Collection) this.f1918q).clear();
                this.f1918q = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f1918q;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f1917p.remove();
                ((C0107e) this.f1919r).f1930p.f1896s -= collection.size();
                collection.clear();
                this.f1918q = null;
                return;
            default:
                this.f1917p.remove();
                C0114l c0114l = (C0114l) this.f1919r;
                W w7 = c0114l.f1962s;
                w7.f1896s--;
                c0114l.c();
                return;
        }
    }

    public C0105c(C0114l c0114l, ListIterator listIterator) {
        this.f1919r = c0114l;
        this.f1918q = c0114l.f1959p;
        this.f1917p = listIterator;
    }

    public C0105c(C0107e c0107e, Iterator it) {
        this.f1919r = c0107e;
        this.f1917p = it;
    }

    public C0105c(C0106d c0106d) {
        this.f1919r = c0106d;
        this.f1917p = c0106d.f1923q.entrySet().iterator();
    }
}
