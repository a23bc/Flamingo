package z;

import m5.AbstractC1209k;
import w5.AbstractC1764A;
import w5.C1793k;

/* JADX INFO: renamed from: z.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2033e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J.d f20800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1793k f20801b;

    public C2033e(J.d dVar, C1793k c1793k) {
        this.f20800a = dVar;
        this.f20801b = c1793k;
    }

    public final String toString() {
        C1793k c1793k = this.f20801b;
        if (c1793k.f19543s.n(AbstractC1764A.f19462p) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        j0.k.p(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC1209k.e(string, "toString(...)");
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.f20800a.a());
        sb.append(", continuation=");
        sb.append(c1793k);
        sb.append(')');
        return sb.toString();
    }
}
