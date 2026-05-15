package t5;

import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0870h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, c5.d, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public int f17105o;

    /* JADX INFO: renamed from: p */
    public Object f17106p;

    /* JADX INFO: renamed from: q */
    public c5.d f17107q;

    public final RuntimeException b() {
        int i7 = this.f17105o;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f17105o);
    }

    public final void c(Object obj, AbstractC0870h abstractC0870h) {
        this.f17106p = obj;
        this.f17105o = 3;
        this.f17107q = abstractC0870h;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
    }

    @Override // c5.d
    public final c5.i getContext() {
        return c5.j.f10685o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.f17105o;
            if (i7 != 0) {
                break;
            }
            this.f17105o = 5;
            c5.d dVar = this.f17107q;
            AbstractC1209k.c(dVar);
            this.f17107q = null;
            dVar.resumeWith(o.f8736a);
        }
        if (i7 == 1) {
            AbstractC1209k.c(null);
            throw null;
        }
        if (i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f17105o;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f17105o = 1;
            AbstractC1209k.c(null);
            throw null;
        }
        if (i7 != 3) {
            throw b();
        }
        this.f17105o = 0;
        Object obj = this.f17106p;
        this.f17106p = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        android.support.v4.media.session.b.K(obj);
        this.f17105o = 4;
    }
}
