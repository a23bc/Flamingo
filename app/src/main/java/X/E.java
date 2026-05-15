package X;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f7891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f7892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7893c;

    public E(D d4, D d7, boolean z6) {
        this.f7891a = d4;
        this.f7892b = d7;
        this.f7893c = z6;
    }

    public static E a(E e7, D d4, D d7, boolean z6, int i7) {
        if ((i7 & 1) != 0) {
            d4 = e7.f7891a;
        }
        if ((i7 & 2) != 0) {
            d7 = e7.f7892b;
        }
        if ((i7 & 4) != 0) {
            z6 = e7.f7893c;
        }
        e7.getClass();
        return new E(d4, d7, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return AbstractC1209k.a(this.f7891a, e7.f7891a) && AbstractC1209k.a(this.f7892b, e7.f7892b) && this.f7893c == e7.f7893c;
    }

    public final int hashCode() {
        return ((this.f7892b.hashCode() + (this.f7891a.hashCode() * 31)) * 31) + (this.f7893c ? 1231 : 1237);
    }

    public final String toString() {
        return "Selection(start=" + this.f7891a + ", end=" + this.f7892b + ", handlesCrossed=" + this.f7893c + ')';
    }
}
