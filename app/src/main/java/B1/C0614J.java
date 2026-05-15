package b1;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0614J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0608D f9935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0608D f9936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0608D f9937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0608D f9938d;

    public C0614J(C0608D c0608d, C0608D c0608d2, C0608D c0608d3, C0608D c0608d4) {
        this.f9935a = c0608d;
        this.f9936b = c0608d2;
        this.f9937c = c0608d3;
        this.f9938d = c0608d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0614J)) {
            return false;
        }
        C0614J c0614j = (C0614J) obj;
        return AbstractC1209k.a(this.f9935a, c0614j.f9935a) && AbstractC1209k.a(this.f9936b, c0614j.f9936b) && AbstractC1209k.a(this.f9937c, c0614j.f9937c) && AbstractC1209k.a(this.f9938d, c0614j.f9938d);
    }

    public final int hashCode() {
        C0608D c0608d = this.f9935a;
        int iHashCode = (c0608d != null ? c0608d.hashCode() : 0) * 31;
        C0608D c0608d2 = this.f9936b;
        int iHashCode2 = (iHashCode + (c0608d2 != null ? c0608d2.hashCode() : 0)) * 31;
        C0608D c0608d3 = this.f9937c;
        int iHashCode3 = (iHashCode2 + (c0608d3 != null ? c0608d3.hashCode() : 0)) * 31;
        C0608D c0608d4 = this.f9938d;
        return iHashCode3 + (c0608d4 != null ? c0608d4.hashCode() : 0);
    }
}
