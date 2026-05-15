package s;

import java.util.Iterator;

/* JADX INFO: renamed from: s.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1425b extends AbstractC1428e implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1426c f15806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1426c f15807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15808q;

    public C1425b(C1426c c1426c, C1426c c1426c2, int i7) {
        this.f15808q = i7;
        this.f15806o = c1426c2;
        this.f15807p = c1426c;
    }

    @Override // s.AbstractC1428e
    public final void a(C1426c c1426c) {
        C1426c c1426c2;
        C1426c c1426cB = null;
        if (this.f15806o == c1426c && c1426c == this.f15807p) {
            this.f15807p = null;
            this.f15806o = null;
        }
        C1426c c1426c3 = this.f15806o;
        if (c1426c3 == c1426c) {
            switch (this.f15808q) {
                case 0:
                    c1426c2 = c1426c3.f15812r;
                    break;
                default:
                    c1426c2 = c1426c3.f15811q;
                    break;
            }
            this.f15806o = c1426c2;
        }
        C1426c c1426c4 = this.f15807p;
        if (c1426c4 == c1426c) {
            C1426c c1426c5 = this.f15806o;
            if (c1426c4 != c1426c5 && c1426c5 != null) {
                c1426cB = b(c1426c4);
            }
            this.f15807p = c1426cB;
        }
    }

    public final C1426c b(C1426c c1426c) {
        switch (this.f15808q) {
            case 0:
                return c1426c.f15811q;
            default:
                return c1426c.f15812r;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15807p != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1426c c1426c = this.f15807p;
        C1426c c1426c2 = this.f15806o;
        this.f15807p = (c1426c == c1426c2 || c1426c2 == null) ? null : b(c1426c);
        return c1426c;
    }
}
