package k0;

import java.util.Iterator;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: k0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1136m implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public Object[] f13997o = C1135l.f13992e.f13996d;

    /* JADX INFO: renamed from: p */
    public int f13998p;

    /* JADX INFO: renamed from: q */
    public int f13999q;

    public final void b(Object[] objArr, int i7, int i8) {
        this.f13997o = objArr;
        this.f13998p = i7;
        this.f13999q = i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13999q < this.f13998p;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
