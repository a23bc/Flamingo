package p0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final s f14986o;

    /* JADX INFO: renamed from: p */
    public final Iterator f14987p;

    /* JADX INFO: renamed from: q */
    public int f14988q;

    /* JADX INFO: renamed from: r */
    public Map.Entry f14989r;

    /* JADX INFO: renamed from: s */
    public Map.Entry f14990s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f14991t;

    public x(s sVar, Iterator it, int i7) {
        this.f14991t = i7;
        this.f14986o = sVar;
        this.f14987p = it;
        this.f14988q = sVar.f().f14956d;
        b();
    }

    public final void b() {
        this.f14989r = this.f14990s;
        Iterator it = this.f14987p;
        this.f14990s = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14990s != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14991t) {
            case 0:
                b();
                if (this.f14989r != null) {
                    return new w(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f14990s;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                b();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f14990s;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                b();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        s sVar = this.f14986o;
        if (sVar.f().f14956d != this.f14988q) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f14989r;
        if (entry == null) {
            throw new IllegalStateException();
        }
        sVar.remove(entry.getKey());
        this.f14989r = null;
        this.f14988q = sVar.f().f14956d;
    }
}
