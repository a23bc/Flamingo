package androidx.datastore.preferences.protobuf;

import androidx.glance.appwidget.protobuf.C0558f;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0531d implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9448o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9449p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9451r;

    public C0531d(C0558f c0558f) {
        this.f9451r = c0558f;
        this.f9450q = c0558f.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9448o) {
            case 0:
                if (this.f9449p < this.f9450q) {
                }
                break;
            default:
                if (this.f9449p < this.f9450q) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9448o) {
            case 0:
                int i7 = this.f9449p;
                if (i7 >= this.f9450q) {
                    throw new NoSuchElementException();
                }
                this.f9449p = i7 + 1;
                return Byte.valueOf(((C0533f) this.f9451r).f9462p[i7]);
            default:
                int i8 = this.f9449p;
                if (i8 >= this.f9450q) {
                    throw new NoSuchElementException();
                }
                this.f9449p = i8 + 1;
                return Byte.valueOf(((C0558f) this.f9451r).g(i8));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9448o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0531d(C0533f c0533f) {
        this.f9451r = c0533f;
        this.f9450q = c0533f.size();
    }
}
