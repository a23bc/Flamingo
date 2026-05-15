package t5;

import java.util.Iterator;
import l5.InterfaceC1182c;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Iterator f17111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1523g f17112p;

    public n(C1523g c1523g) {
        this.f17112p = c1523g;
        this.f17111o = ((InterfaceC1524h) c1523g.f17103b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17111o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((InterfaceC1182c) this.f17112p.f17104c).b(this.f17111o.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
