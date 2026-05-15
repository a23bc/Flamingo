package s;

import java.util.Iterator;

/* JADX INFO: renamed from: s.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1427d extends AbstractC1428e implements Iterator {

    /* JADX INFO: renamed from: o */
    public C1426c f15813o;

    /* JADX INFO: renamed from: p */
    public boolean f15814p = true;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1429f f15815q;

    public C1427d(C1429f c1429f) {
        this.f15815q = c1429f;
    }

    @Override // s.AbstractC1428e
    public final void a(C1426c c1426c) {
        C1426c c1426c2 = this.f15813o;
        if (c1426c == c1426c2) {
            C1426c c1426c3 = c1426c2.f15812r;
            this.f15813o = c1426c3;
            this.f15814p = c1426c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15814p) {
            return this.f15815q.f15816o != null;
        }
        C1426c c1426c = this.f15813o;
        return (c1426c == null || c1426c.f15811q == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15814p) {
            this.f15814p = false;
            this.f15813o = this.f15815q.f15816o;
        } else {
            C1426c c1426c = this.f15813o;
            this.f15813o = c1426c != null ? c1426c.f15811q : null;
        }
        return this.f15813o;
    }
}
