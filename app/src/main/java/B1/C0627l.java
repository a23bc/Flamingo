package b1;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0627l extends AbstractC0629n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0614J f9984b;

    public C0627l(String str, C0614J c0614j) {
        this.f9983a = str;
        this.f9984b = c0614j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0627l)) {
            return false;
        }
        C0627l c0627l = (C0627l) obj;
        if (!AbstractC1209k.a(this.f9983a, c0627l.f9983a)) {
            return false;
        }
        if (!AbstractC1209k.a(this.f9984b, c0627l.f9984b)) {
            return false;
        }
        c0627l.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f9983a.hashCode() * 31;
        C0614J c0614j = this.f9984b;
        return (iHashCode + (c0614j != null ? c0614j.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return Z1.l.s(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f9983a, ')');
    }
}
