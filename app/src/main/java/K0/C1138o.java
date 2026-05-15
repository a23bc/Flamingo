package k0;

import E0.G;

/* JADX INFO: renamed from: k0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1138o extends AbstractC1136m {

    /* JADX INFO: renamed from: r */
    public final G f14001r;

    public C1138o(G g6) {
        this.f14001r = g6;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f13999q;
        this.f13999q = i7 + 2;
        Object[] objArr = this.f13997o;
        return new C1125b(this.f14001r, objArr[i7], objArr[i7 + 1]);
    }
}
