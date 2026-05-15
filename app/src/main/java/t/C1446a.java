package t;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1446a implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16055s;

    public C1446a(int i7) {
        this.f16051o = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16052p < this.f16051o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f16052p;
        switch (this.f16054r) {
            case 0:
                objF = ((C1450e) this.f16055s).f(i7);
                break;
            case 1:
                objF = ((C1450e) this.f16055s).i(i7);
                break;
            default:
                objF = ((C1451f) this.f16055s).f16066p[i7];
                break;
        }
        this.f16052p++;
        this.f16053q = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16053q) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f16052p - 1;
        this.f16052p = i7;
        switch (this.f16054r) {
            case 0:
                ((C1450e) this.f16055s).g(i7);
                break;
            case 1:
                ((C1450e) this.f16055s).g(i7);
                break;
            default:
                ((C1451f) this.f16055s).b(i7);
                break;
        }
        this.f16051o--;
        this.f16053q = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1446a(C1451f c1451f) {
        this(c1451f.f16067q);
        this.f16054r = 2;
        this.f16055s = c1451f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1446a(C1450e c1450e, int i7) {
        this(c1450e.f16036q);
        this.f16054r = i7;
        switch (i7) {
            case 1:
                this.f16055s = c1450e;
                this(c1450e.f16036q);
                break;
            default:
                this.f16055s = c1450e;
                break;
        }
    }
}
