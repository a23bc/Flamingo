package E4;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class H extends I {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f1867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient int f1868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f1869s;

    public H(I i7, int i8, int i9) {
        this.f1869s = i7;
        this.f1867q = i8;
        this.f1868r = i9;
    }

    @Override // E4.D
    public final Object[] c() {
        return this.f1869s.c();
    }

    @Override // E4.D
    public final int e() {
        return this.f1869s.g() + this.f1867q + this.f1868r;
    }

    @Override // E4.D
    public final int g() {
        return this.f1869s.g() + this.f1867q;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        N5.d.p(i7, this.f1868r);
        return this.f1869s.get(i7 + this.f1867q);
    }

    @Override // E4.D
    public final boolean i() {
        return true;
    }

    @Override // E4.I, E4.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // E4.I, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1868r;
    }

    @Override // E4.I, java.util.List
    /* JADX INFO: renamed from: w */
    public final I subList(int i7, int i8) {
        N5.d.t(i7, i8, this.f1868r);
        int i9 = this.f1867q;
        return this.f1869s.subList(i7 + i9, i8 + i9);
    }

    @Override // E4.I, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
