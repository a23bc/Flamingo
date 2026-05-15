package x;

import m5.AbstractC1209k;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: renamed from: x.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1876s0 {

    /* JADX INFO: renamed from: a */
    public final long f19837a;

    /* JADX INFO: renamed from: b */
    public final D.k0 f19838b;

    public C1876s0() {
        long jD = AbstractC1959I.d(4284900966L);
        float f7 = 0;
        D.k0 k0Var = new D.k0(f7, f7, f7, f7);
        this.f19837a = jD;
        this.f19838b = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1876s0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C1876s0 c1876s0 = (C1876s0) obj;
        return C1987t.c(this.f19837a, c1876s0.f19837a) && AbstractC1209k.a(this.f19838b, c1876s0.f19838b);
    }

    public final int hashCode() {
        return this.f19838b.hashCode() + (C1987t.i(this.f19837a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        n1.c.z(this.f19837a, sb, ", drawPadding=");
        sb.append(this.f19838b);
        sb.append(')');
        return sb.toString();
    }
}
