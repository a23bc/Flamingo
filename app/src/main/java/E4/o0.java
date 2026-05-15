package E4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Iterator f1970o;

    public o0(Iterator it) {
        it.getClass();
        this.f1970o = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1970o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f1970o.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1970o.remove();
    }
}
