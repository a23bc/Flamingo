package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f9484o;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9484o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f9484o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
