package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9452o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Iterator f9454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z f9455r;

    public d0(Z z6) {
        this.f9455r = z6;
    }

    public final Iterator a() {
        if (this.f9454q == null) {
            this.f9454q = this.f9455r.f9438q.entrySet().iterator();
        }
        return this.f9454q;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f9452o + 1;
        Z z6 = this.f9455r;
        return i7 < z6.f9437p.size() || (!z6.f9438q.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f9453p = true;
        int i7 = this.f9452o + 1;
        this.f9452o = i7;
        Z z6 = this.f9455r;
        return i7 < z6.f9437p.size() ? (Map.Entry) z6.f9437p.get(this.f9452o) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9453p) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f9453p = false;
        int i7 = Z.f9435u;
        Z z6 = this.f9455r;
        z6.c();
        if (this.f9452o >= z6.f9437p.size()) {
            a().remove();
            return;
        }
        int i8 = this.f9452o;
        this.f9452o = i8 - 1;
        z6.h(i8);
    }
}
