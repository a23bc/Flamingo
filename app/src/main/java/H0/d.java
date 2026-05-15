package h0;

import java.util.List;
import java.util.ListIterator;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ListIterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f12544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12545q;

    public d(int i7, int i8, List list) {
        this.f12543o = i8;
        switch (i8) {
            case 1:
                this.f12544p = list;
                this.f12545q = i7 - 1;
                break;
            default:
                this.f12544p = list;
                this.f12545q = i7;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f12543o) {
            case 0:
                this.f12544p.add(this.f12545q, obj);
                this.f12545q++;
                break;
            default:
                int i7 = this.f12545q + 1;
                this.f12545q = i7;
                this.f12544p.add(i7, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12543o) {
            case 0:
                return this.f12545q < this.f12544p.size();
            default:
                return this.f12545q < this.f12544p.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f12543o) {
            case 0:
                if (this.f12545q > 0) {
                }
                break;
            default:
                if (this.f12545q >= 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f12543o) {
            case 0:
                int i7 = this.f12545q;
                this.f12545q = i7 + 1;
                return this.f12544p.get(i7);
            default:
                int i8 = this.f12545q + 1;
                this.f12545q = i8;
                return this.f12544p.get(i8);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f12543o) {
            case 0:
                return this.f12545q;
            default:
                return this.f12545q + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f12543o) {
            case 0:
                int i7 = this.f12545q - 1;
                this.f12545q = i7;
                return this.f12544p.get(i7);
            default:
                int i8 = this.f12545q;
                this.f12545q = i8 - 1;
                return this.f12544p.get(i8);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f12543o) {
            case 0:
                return this.f12545q - 1;
            default:
                return this.f12545q;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f12543o) {
            case 0:
                int i7 = this.f12545q - 1;
                this.f12545q = i7;
                this.f12544p.remove(i7);
                break;
            default:
                this.f12544p.remove(this.f12545q);
                this.f12545q--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f12543o) {
            case 0:
                this.f12544p.set(this.f12545q, obj);
                break;
            default:
                this.f12544p.set(this.f12545q, obj);
                break;
        }
    }
}
