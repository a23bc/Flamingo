package Q0;

import a5.C0521a;
import a5.C0522b;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import r0.AbstractC1397o;
import t.C1444F;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ListIterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f6068s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(C0363t c0363t, int i7, int i8) {
        this(c0363t, (i8 & 1) != 0 ? 0 : i7, 0, c0363t.f6072o.f15984b);
        this.f6064o = 0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f6064o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                b();
                int i7 = this.f6065p;
                this.f6065p = i7 + 1;
                C0521a c0521a = (C0521a) this.f6068s;
                c0521a.add(i7, obj);
                this.f6066q = -1;
                this.f6067r = ((AbstractList) c0521a).modCount;
                return;
            case 2:
                c();
                int i8 = this.f6065p;
                this.f6065p = i8 + 1;
                C0522b c0522b = (C0522b) this.f6068s;
                c0522b.add(i8, obj);
                this.f6066q = -1;
                this.f6067r = ((AbstractList) c0522b).modCount;
                return;
            default:
                d();
                int i9 = this.f6065p + 1;
                p0.p pVar = (p0.p) this.f6068s;
                pVar.add(i9, obj);
                this.f6066q = -1;
                this.f6065p++;
                this.f6067r = p0.q.f(pVar);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((C0521a) this.f6068s).f8854s).modCount != this.f6067r) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((AbstractList) ((C0522b) this.f6068s)).modCount != this.f6067r) {
            throw new ConcurrentModificationException();
        }
    }

    public void d() {
        if (p0.q.f((p0.p) this.f6068s) != this.f6067r) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6064o) {
            case 0:
                return this.f6065p < this.f6067r;
            case 1:
                return this.f6065p < ((C0521a) this.f6068s).f8852q;
            case 2:
                return this.f6065p < ((C0522b) this.f6068s).f8857p;
            default:
                return this.f6065p < ((p0.p) this.f6068s).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f6064o) {
            case 0:
                if (this.f6065p > this.f6066q) {
                }
                break;
            case 1:
                if (this.f6065p > 0) {
                }
                break;
            case 2:
                if (this.f6065p > 0) {
                }
                break;
            default:
                if (this.f6065p >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f6064o) {
            case 0:
                C1444F c1444f = ((C0363t) this.f6068s).f6072o;
                int i7 = this.f6065p;
                this.f6065p = i7 + 1;
                Object objE = c1444f.e(i7);
                AbstractC1209k.d(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC1397o) objE;
            case 1:
                b();
                int i8 = this.f6065p;
                C0521a c0521a = (C0521a) this.f6068s;
                if (i8 >= c0521a.f8852q) {
                    throw new NoSuchElementException();
                }
                this.f6065p = i8 + 1;
                this.f6066q = i8;
                return c0521a.f8850o[c0521a.f8851p + i8];
            case 2:
                c();
                int i9 = this.f6065p;
                C0522b c0522b = (C0522b) this.f6068s;
                if (i9 >= c0522b.f8857p) {
                    throw new NoSuchElementException();
                }
                this.f6065p = i9 + 1;
                this.f6066q = i9;
                return c0522b.f8856o[i9];
            default:
                d();
                int i10 = this.f6065p + 1;
                this.f6066q = i10;
                p0.p pVar = (p0.p) this.f6068s;
                p0.q.a(i10, pVar.size());
                Object obj = pVar.get(i10);
                this.f6065p = i10;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f6064o) {
            case 0:
                return this.f6065p - this.f6066q;
            case 1:
                return this.f6065p;
            case 2:
                return this.f6065p;
            default:
                return this.f6065p + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f6064o) {
            case 0:
                C1444F c1444f = ((C0363t) this.f6068s).f6072o;
                int i7 = this.f6065p - 1;
                this.f6065p = i7;
                Object objE = c1444f.e(i7);
                AbstractC1209k.d(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC1397o) objE;
            case 1:
                b();
                int i8 = this.f6065p;
                if (i8 <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i8 - 1;
                this.f6065p = i9;
                this.f6066q = i9;
                C0521a c0521a = (C0521a) this.f6068s;
                return c0521a.f8850o[c0521a.f8851p + i9];
            case 2:
                c();
                int i10 = this.f6065p;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f6065p = i11;
                this.f6066q = i11;
                return ((C0522b) this.f6068s).f8856o[i11];
            default:
                d();
                int i12 = this.f6065p;
                p0.p pVar = (p0.p) this.f6068s;
                p0.q.a(i12, pVar.size());
                int i13 = this.f6065p;
                this.f6066q = i13;
                this.f6065p--;
                return pVar.get(i13);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f6064o) {
            case 0:
                return (this.f6065p - this.f6066q) - 1;
            case 1:
                return this.f6065p - 1;
            case 2:
                return this.f6065p - 1;
            default:
                return this.f6065p;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f6064o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                b();
                int i7 = this.f6066q;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C0521a c0521a = (C0521a) this.f6068s;
                c0521a.c(i7);
                this.f6065p = this.f6066q;
                this.f6066q = -1;
                this.f6067r = ((AbstractList) c0521a).modCount;
                return;
            case 2:
                c();
                int i8 = this.f6066q;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C0522b c0522b = (C0522b) this.f6068s;
                c0522b.c(i8);
                this.f6065p = this.f6066q;
                this.f6066q = -1;
                this.f6067r = ((AbstractList) c0522b).modCount;
                return;
            default:
                d();
                int i9 = this.f6066q;
                p0.p pVar = (p0.p) this.f6068s;
                pVar.remove(i9);
                this.f6065p--;
                this.f6066q = -1;
                this.f6067r = p0.q.f(pVar);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f6064o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                b();
                int i7 = this.f6066q;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0521a) this.f6068s).set(i7, obj);
                return;
            case 2:
                c();
                int i8 = this.f6066q;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0522b) this.f6068s).set(i8, obj);
                return;
            default:
                d();
                int i9 = this.f6066q;
                if (i9 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                p0.p pVar = (p0.p) this.f6068s;
                pVar.set(i9, obj);
                this.f6067r = p0.q.f(pVar);
                return;
        }
    }

    public r(C0522b c0522b, int i7) {
        this.f6064o = 2;
        this.f6068s = c0522b;
        this.f6065p = i7;
        this.f6066q = -1;
        this.f6067r = ((AbstractList) c0522b).modCount;
    }

    public r(p0.p pVar, int i7) {
        this.f6064o = 3;
        this.f6068s = pVar;
        this.f6065p = i7 - 1;
        this.f6066q = -1;
        this.f6067r = p0.q.f(pVar);
    }

    public r(C0363t c0363t, int i7, int i8, int i9) {
        this.f6064o = 0;
        this.f6068s = c0363t;
        this.f6065p = i7;
        this.f6066q = i8;
        this.f6067r = i9;
    }

    public r(C0521a c0521a, int i7) {
        this.f6064o = 1;
        this.f6068s = c0521a;
        this.f6065p = i7;
        this.f6066q = -1;
        this.f6067r = ((AbstractList) c0521a).modCount;
    }
}
