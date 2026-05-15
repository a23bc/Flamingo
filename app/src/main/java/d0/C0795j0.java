package d0;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: d0.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.e f11025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L.e f11026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L.e f11027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L.e f11028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L.e f11029e;

    public C0795j0() {
        L.e eVar = AbstractC0793i0.f11016a;
        L.e eVar2 = AbstractC0793i0.f11017b;
        L.e eVar3 = AbstractC0793i0.f11018c;
        L.e eVar4 = AbstractC0793i0.f11019d;
        L.e eVar5 = AbstractC0793i0.f11020e;
        this.f11025a = eVar;
        this.f11026b = eVar2;
        this.f11027c = eVar3;
        this.f11028d = eVar4;
        this.f11029e = eVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0795j0)) {
            return false;
        }
        C0795j0 c0795j0 = (C0795j0) obj;
        return AbstractC1209k.a(this.f11025a, c0795j0.f11025a) && AbstractC1209k.a(this.f11026b, c0795j0.f11026b) && AbstractC1209k.a(this.f11027c, c0795j0.f11027c) && AbstractC1209k.a(this.f11028d, c0795j0.f11028d) && AbstractC1209k.a(this.f11029e, c0795j0.f11029e);
    }

    public final int hashCode() {
        return this.f11029e.hashCode() + ((this.f11028d.hashCode() + ((this.f11027c.hashCode() + ((this.f11026b.hashCode() + (this.f11025a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f11025a + ", small=" + this.f11026b + ", medium=" + this.f11027c + ", large=" + this.f11028d + ", extraLarge=" + this.f11029e + ')';
    }
}
