package E0;

import java.util.Iterator;
import java.util.Map;
import k0.AbstractC1136m;
import k0.C1128e;
import k0.C1129f;
import k0.C1138o;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1655o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Iterator f1656p;

    public G(C1128e c1128e) {
        AbstractC1136m[] abstractC1136mArr = new AbstractC1136m[8];
        for (int i7 = 0; i7 < 8; i7++) {
            abstractC1136mArr[i7] = new C1138o(this);
        }
        this.f1656p = new C1129f(c1128e, abstractC1136mArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1655o) {
            case 0:
                return this.f1656p.hasNext();
            default:
                return ((C1129f) this.f1656p).f13976q;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1655o) {
            case 0:
                return (J) this.f1656p.next();
            default:
                return (Map.Entry) ((C1129f) this.f1656p).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1655o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C1129f) this.f1656p).remove();
                return;
        }
    }

    public G(H h) {
        this.f1656p = h.f1666x.iterator();
    }
}
