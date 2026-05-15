package Z4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import t.U;
import t5.C1518b;

/* JADX INFO: renamed from: Z4.b */
/* JADX INFO: loaded from: classes.dex */
public class C0508b implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f8802o;

    /* JADX INFO: renamed from: p */
    public int f8803p;

    /* JADX INFO: renamed from: q */
    public final Object f8804q;

    public /* synthetic */ C0508b(int i7, Object obj) {
        this.f8802o = i7;
        this.f8804q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f8802o) {
            case 0:
                return this.f8803p < ((e) this.f8804q).b();
            case 1:
                return this.f8803p < ((Object[]) this.f8804q).length;
            case 2:
                return this.f8803p < ((U) this.f8804q).h();
        }
        while (true) {
            int i7 = this.f8803p;
            it = (Iterator) this.f8804q;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f8803p--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f8802o) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f8803p;
                this.f8803p = i7 + 1;
                return ((e) this.f8804q).get(i7);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f8804q;
                    int i8 = this.f8803p;
                    this.f8803p = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f8803p--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            case 2:
                int i9 = this.f8803p;
                this.f8803p = i9 + 1;
                return ((U) this.f8804q).i(i9);
        }
        while (true) {
            int i10 = this.f8803p;
            it = (Iterator) this.f8804q;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f8803p--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8802o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0508b(Object[] objArr) {
        this.f8802o = 1;
        AbstractC1209k.f(objArr, "array");
        this.f8804q = objArr;
    }

    public C0508b(C1518b c1518b) {
        this.f8802o = 3;
        this.f8804q = c1518b.f17091a.iterator();
        this.f8803p = c1518b.f17092b;
    }
}
