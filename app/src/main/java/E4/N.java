package E4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class N extends p0 {

    /* JADX INFO: renamed from: o */
    public int f1879o;

    /* JADX INFO: renamed from: p */
    public Object f1880p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f1881q;

    /* JADX INFO: renamed from: r */
    public final Iterator f1882r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f1883s;

    public N() {
        this.f1879o = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i7 = this.f1879o;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int iB = AbstractC1676i.b(i7);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f1879o = 4;
        switch (this.f1881q) {
            case 0:
                do {
                    Iterator it = this.f1882r;
                    if (!it.hasNext()) {
                        this.f1879o = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((D4.f) this.f1883s).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f1882r;
                    if (!it2.hasNext()) {
                        this.f1879o = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((j0) this.f1883s).f1954p.contains(next));
                break;
        }
        this.f1880p = next;
        if (this.f1879o == 3) {
            return false;
        }
        this.f1879o = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1879o = 2;
        Object obj = this.f1880p;
        this.f1880p = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(Iterator it, D4.f fVar) {
        this();
        this.f1881q = 0;
        this.f1882r = it;
        this.f1883s = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(j0 j0Var) {
        this();
        this.f1881q = 1;
        this.f1883s = j0Var;
        this.f1882r = j0Var.f1953o.iterator();
    }
}
