package u5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import n5.InterfaceC1237a;
import r5.C1423d;
import t5.C1523g;

/* JADX INFO: renamed from: u5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1540b implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17314o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1423d f17317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1523g f17318s;

    public C1540b(C1523g c1523g) {
        this.f17318s = c1523g;
        c1523g.getClass();
        int iQ = i6.h.q(0, 0, ((String) c1523g.f17104c).length());
        this.f17315p = iQ;
        this.f17316q = iQ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l5.e, m5.l] */
    public final void b() {
        Y4.h hVar;
        int i7 = this.f17316q;
        if (i7 < 0) {
            this.f17314o = 0;
            this.f17317r = null;
            return;
        }
        C1523g c1523g = this.f17318s;
        c1523g.getClass();
        String str = (String) c1523g.f17104c;
        if (i7 <= str.length() && (hVar = (Y4.h) ((AbstractC1210l) c1523g.f17103b).invoke(str, Integer.valueOf(this.f17316q))) != null) {
            int iIntValue = ((Number) hVar.f8726o).intValue();
            int iIntValue2 = ((Number) hVar.f8727p).intValue();
            this.f17317r = i6.h.M(this.f17315p, iIntValue);
            int i8 = iIntValue + iIntValue2;
            this.f17315p = i8;
            this.f17316q = i8 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f17317r = new C1423d(this.f17315p, AbstractC1545g.T(str), 1);
            this.f17316q = -1;
        }
        this.f17314o = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f17314o == -1) {
            b();
        }
        return this.f17314o == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17314o == -1) {
            b();
        }
        if (this.f17314o == 0) {
            throw new NoSuchElementException();
        }
        C1423d c1423d = this.f17317r;
        AbstractC1209k.d(c1423d, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f17317r = null;
        this.f17314o = -1;
        return c1423d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
