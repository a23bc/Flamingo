package f0;

import java.util.Iterator;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11720o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I0 f11721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11724s;

    public N(I0 i02, int i7, int i8) {
        this.f11721p = i02;
        this.f11722q = i8;
        this.f11723r = i7;
        this.f11724s = i02.f11686v;
        if (i02.f11685u) {
            K0.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11720o) {
            case 0:
                return this.f11723r < this.f11722q;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11720o) {
            case 0:
                I0 i02 = this.f11721p;
                int i7 = i02.f11686v;
                int i8 = this.f11724s;
                if (i7 != i8) {
                    K0.f();
                }
                int i9 = this.f11723r;
                this.f11723r = K0.a(i02.f11679o, i9) + i9;
                return new J0(i02, i9, i8);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11720o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public N(I0 i02, int i7, O o7, C0879c c0879c) {
        this.f11721p = i02;
        this.f11722q = i7;
        this.f11723r = i02.f11686v;
    }
}
