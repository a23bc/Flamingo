package g2;

import Z4.v;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12448b;

    static {
        new o(3, 0.0f);
    }

    public o(float f7, List list) {
        this.f12447a = f7;
        this.f12448b = list;
    }

    public final o a(o oVar) {
        return new o(this.f12447a + oVar.f12447a, Z4.n.B0(this.f12448b, oVar.f12448b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return n1.g.a(this.f12447a, oVar.f12447a) && AbstractC1209k.a(this.f12448b, oVar.f12448b);
    }

    public final int hashCode() {
        return this.f12448b.hashCode() + (Float.floatToIntBits(this.f12447a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) n1.g.b(this.f12447a)) + ", resourceIds=" + this.f12448b + ')';
    }

    public o(int i7, float f7) {
        this((i7 & 1) != 0 ? 0 : f7, v.f8818o);
    }
}
