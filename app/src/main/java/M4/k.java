package M4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f4795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f4796p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f4798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4799s;

    public k(n nVar, int i7) {
        this.f4799s = i7;
        this.f4798r = nVar;
        this.f4795o = nVar.f4817t.f4805r;
        this.f4797q = nVar.f4816s;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.f4795o;
        n nVar = this.f4798r;
        if (mVar == nVar.f4817t) {
            throw new NoSuchElementException();
        }
        if (nVar.f4816s != this.f4797q) {
            throw new ConcurrentModificationException();
        }
        this.f4795o = mVar.f4805r;
        this.f4796p = mVar;
        return mVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4795o != this.f4798r.f4817t;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f4799s) {
            case 1:
                return b().f4807t;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        m mVar = this.f4796p;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        n nVar = this.f4798r;
        nVar.d(mVar, true);
        this.f4796p = null;
        this.f4797q = nVar.f4816s;
    }
}
