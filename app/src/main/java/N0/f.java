package n0;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14486a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f14486a);
        sb.append(")@");
        int iHashCode = hashCode();
        j0.k.p(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC1209k.e(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
