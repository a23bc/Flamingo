package q0;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: q0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1358g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f15446b;

    public C1358g(int i7, Integer num) {
        this.f15445a = i7;
        this.f15446b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358g)) {
            return false;
        }
        C1358g c1358g = (C1358g) obj;
        return this.f15445a == c1358g.f15445a && AbstractC1209k.a(this.f15446b, c1358g.f15446b);
    }

    public final int hashCode() {
        int i7 = this.f15445a * 31;
        Integer num = this.f15446b;
        return i7 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f15445a + ", dataOffset=" + this.f15446b + ')';
    }
}
