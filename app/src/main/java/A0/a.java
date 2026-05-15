package A0;

import m5.AbstractC1209k;
import n1.n;
import x0.C1895e;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public n1.d f44a;

    /* JADX INFO: renamed from: b */
    public n f45b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1985r f46c;

    /* JADX INFO: renamed from: d */
    public long f47d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1209k.a(this.f44a, aVar.f44a) && this.f45b == aVar.f45b && AbstractC1209k.a(this.f46c, aVar.f46c) && C1895e.a(this.f47d, aVar.f47d);
    }

    public final int hashCode() {
        int iHashCode = (this.f46c.hashCode() + ((this.f45b.hashCode() + (this.f44a.hashCode() * 31)) * 31)) * 31;
        long j3 = this.f47d;
        return ((int) (j3 ^ (j3 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f44a + ", layoutDirection=" + this.f45b + ", canvas=" + this.f46c + ", size=" + ((Object) C1895e.f(this.f47d)) + ')';
    }
}
