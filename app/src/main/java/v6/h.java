package v6;

import m5.AbstractC1209k;
import w.InterfaceC1690x;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1.n f18370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1690x f18371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18373g;

    public h(int i7, boolean z6, long j3, n1.n nVar, InterfaceC1690x interfaceC1690x, long j7, float f7) {
        AbstractC1209k.f(nVar, "direction");
        AbstractC1209k.f(interfaceC1690x, "easing");
        this.f18367a = i7;
        this.f18368b = z6;
        this.f18369c = j3;
        this.f18370d = nVar;
        this.f18371e = interfaceC1690x;
        this.f18372f = j7;
        this.f18373g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f18367a == hVar.f18367a && this.f18368b == hVar.f18368b && C1987t.c(this.f18369c, hVar.f18369c) && this.f18370d == hVar.f18370d && AbstractC1209k.a(this.f18371e, hVar.f18371e) && this.f18372f == hVar.f18372f && n1.g.a(this.f18373g, hVar.f18373g);
    }

    public final int hashCode() {
        int iHashCode = (this.f18371e.hashCode() + ((this.f18370d.hashCode() + n1.c.o(((this.f18367a * 31) + (this.f18368b ? 1231 : 1237)) * 31, 31, this.f18369c)) * 31)) * 31;
        long j3 = this.f18372f;
        return Float.floatToIntBits(this.f18373g) + ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarqueeParams(period=");
        sb.append(this.f18367a);
        sb.append(", gradientEnabled=");
        sb.append(this.f18368b);
        sb.append(", gradientEdgeColor=");
        n1.c.z(this.f18369c, sb, ", direction=");
        sb.append(this.f18370d);
        sb.append(", easing=");
        sb.append(this.f18371e);
        sb.append(", waitTimeMillis=");
        sb.append(this.f18372f);
        sb.append(", initialLeftMargin=");
        sb.append((Object) n1.g.b(this.f18373g));
        sb.append(')');
        return sb.toString();
    }
}
