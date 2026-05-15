package Z4;

import java.util.List;
import java.util.ListIterator;
import m5.C1218t;
import n5.InterfaceC1237a;
import p0.C1281B;
import r5.C1423d;

/* JADX INFO: loaded from: classes.dex */
public final class z implements ListIterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f8821o = 0;

    /* JADX INFO: renamed from: p */
    public final Object f8822p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f8823q;

    public z(A a4, int i7) {
        this.f8823q = a4;
        if (i7 >= 0 && i7 <= a4.b()) {
            this.f8822p = ((List) a4.f8801p).listIterator(a4.b() - i7);
        } else {
            StringBuilder sbV = n1.c.v(i7, "Position index ", " must be in range [");
            sbV.append(new C1423d(0, a4.b(), 1));
            sbV.append("].");
            throw new IndexOutOfBoundsException(sbV.toString());
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8821o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8821o) {
            case 0:
                return ((ListIterator) this.f8822p).hasPrevious();
            default:
                return ((C1218t) this.f8822p).f14437o < ((C1281B) this.f8823q).f14894r - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8821o) {
            case 0:
                return ((ListIterator) this.f8822p).hasNext();
            default:
                return ((C1218t) this.f8822p).f14437o >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8821o) {
            case 0:
                return ((ListIterator) this.f8822p).previous();
            default:
                C1218t c1218t = (C1218t) this.f8822p;
                int i7 = c1218t.f14437o + 1;
                C1281B c1281b = (C1281B) this.f8823q;
                p0.q.a(i7, c1281b.f14894r);
                c1218t.f14437o = i7;
                return c1281b.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8821o) {
            case 0:
                return o.d0((A) this.f8823q) - ((ListIterator) this.f8822p).previousIndex();
            default:
                return ((C1218t) this.f8822p).f14437o + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8821o) {
            case 0:
                return ((ListIterator) this.f8822p).next();
            default:
                C1218t c1218t = (C1218t) this.f8822p;
                int i7 = c1218t.f14437o;
                C1281B c1281b = (C1281B) this.f8823q;
                p0.q.a(i7, c1281b.f14894r);
                c1218t.f14437o = i7 - 1;
                return c1281b.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f8821o) {
            case 0:
                return o.d0((A) this.f8823q) - ((ListIterator) this.f8822p).nextIndex();
            default:
                return ((C1218t) this.f8822p).f14437o;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8821o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8821o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public z(C1218t c1218t, C1281B c1281b) {
        this.f8822p = c1218t;
        this.f8823q = c1281b;
    }
}
