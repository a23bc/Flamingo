package E4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0122u f1977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0122u f1979t;

    public r(C0122u c0122u, int i7) {
        this.f1978s = i7;
        this.f1979t = c0122u;
        this.f1977r = c0122u;
        this.f1974o = c0122u.f1990s;
        this.f1975p = c0122u.isEmpty() ? -1 : 0;
        this.f1976q = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1975p >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c0121t;
        C0122u c0122u = this.f1977r;
        if (c0122u.f1990s != this.f1974o) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1975p;
        this.f1976q = i7;
        switch (this.f1978s) {
            case 0:
                c0121t = this.f1979t.j()[i7];
                break;
            case 1:
                c0121t = new C0121t(this.f1979t, i7);
                break;
            default:
                c0121t = this.f1979t.l()[i7];
                break;
        }
        int i8 = this.f1975p + 1;
        if (i8 >= c0122u.f1991t) {
            i8 = -1;
        }
        this.f1975p = i8;
        return c0121t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0122u c0122u = this.f1977r;
        int i7 = c0122u.f1990s;
        int i8 = this.f1974o;
        if (i7 != i8) {
            throw new ConcurrentModificationException();
        }
        int i9 = this.f1976q;
        if (i9 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f1974o = i8 + 32;
        c0122u.remove(c0122u.j()[i9]);
        this.f1975p--;
        this.f1976q = -1;
    }
}
