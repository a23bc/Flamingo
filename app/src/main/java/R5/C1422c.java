package r5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: r5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1422c implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f15784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15787r;

    public C1422c(int i7, int i8, int i9) {
        this.f15784o = i9;
        this.f15785p = i8;
        boolean z6 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z6 = true;
        }
        this.f15786q = z6;
        this.f15787r = z6 ? i7 : i8;
    }

    public final int b() {
        int i7 = this.f15787r;
        if (i7 != this.f15785p) {
            this.f15787r = this.f15784o + i7;
            return i7;
        }
        if (!this.f15786q) {
            throw new NoSuchElementException();
        }
        this.f15786q = false;
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15786q;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
