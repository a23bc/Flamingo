package O0;

import j5.AbstractC1107a;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import l0.C1159c;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import t.C1445G;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements Collection, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f5285o = 0;

    /* JADX INFO: renamed from: p */
    public final Object f5286p;

    public C0() {
        int i7 = t.P.f16031a;
        this.f5286p = new C1445G(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5285o) {
            case 0:
                return ((C1445G) this.f5286p).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5285o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f5285o) {
            case 0:
                ((C1445G) this.f5286p).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5285o) {
            case 0:
                return ((C1445G) this.f5286p).c(obj);
            default:
                return ((t.J) this.f5286p).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5285o) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((C1445G) this.f5286p).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((t.J) this.f5286p).d(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5285o) {
            case 0:
                return ((C1445G) this.f5286p).f15992g == 0;
            default:
                return ((t.J) this.f5286p).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5285o) {
            case 0:
                C1445G c1445g = (C1445G) this.f5286p;
                c1445g.getClass();
                return new C1159c(new t.I(c1445g));
            default:
                return AbstractC1107a.t(new t.V(this, null));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5285o) {
            case 0:
                return ((C1445G) this.f5286p).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5285o) {
            case 0:
                return ((C1445G) this.f5286p).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f5285o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5285o) {
            case 0:
                return ((C1445G) this.f5286p).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f5285o) {
            case 0:
                return ((C1445G) this.f5286p).f15992g;
            default:
                return ((t.J) this.f5286p).f16007e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f5285o) {
        }
        return AbstractC1208j.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5285o) {
            case 0:
                break;
            default:
                AbstractC1209k.f(objArr, "array");
                break;
        }
        return AbstractC1208j.b(this, objArr);
    }

    public C0(t.J j3) {
        AbstractC1209k.f(j3, "parent");
        this.f5286p = j3;
    }
}
