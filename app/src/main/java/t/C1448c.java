package t;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1448c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16058p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1450e f16060r;

    public C1448c(C1450e c1450e) {
        this.f16060r = c1450e;
        this.f16057o = c1450e.f16036q - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f16059q) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f16058p;
        C1450e c1450e = this.f16060r;
        return AbstractC1209k.a(key, c1450e.f(i7)) && AbstractC1209k.a(entry.getValue(), c1450e.i(this.f16058p));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f16059q) {
            return this.f16060r.f(this.f16058p);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f16059q) {
            return this.f16060r.i(this.f16058p);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16058p < this.f16057o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f16059q) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f16058p;
        C1450e c1450e = this.f16060r;
        Object objF = c1450e.f(i7);
        Object objI = c1450e.i(this.f16058p);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16058p++;
        this.f16059q = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16059q) {
            throw new IllegalStateException();
        }
        this.f16060r.g(this.f16058p);
        this.f16058p--;
        this.f16057o--;
        this.f16059q = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f16059q) {
            return this.f16060r.h(this.f16058p, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
