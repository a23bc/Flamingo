package b1;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0628m extends AbstractC0629n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0614J f9986b;

    public C0628m(String str, C0614J c0614j) {
        this.f9985a = str;
        this.f9986b = c0614j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0628m)) {
            return false;
        }
        C0628m c0628m = (C0628m) obj;
        if (!AbstractC1209k.a(this.f9985a, c0628m.f9985a)) {
            return false;
        }
        if (!AbstractC1209k.a(this.f9986b, c0628m.f9986b)) {
            return false;
        }
        c0628m.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f9985a.hashCode() * 31;
        C0614J c0614j = this.f9986b;
        return (iHashCode + (c0614j != null ? c0614j.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return Z1.l.s(new StringBuilder("LinkAnnotation.Url(url="), this.f9985a, ')');
    }
}
