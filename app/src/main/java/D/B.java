package D;

import m5.AbstractC1209k;
import r0.C1388f;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0060d {

    /* JADX INFO: renamed from: i */
    public final C1388f f1208i;

    public B(C1388f c1388f) {
        this.f1208i = c1388f;
    }

    @Override // D.AbstractC0060d
    public final int e(int i7, n1.n nVar) {
        return this.f1208i.a(0, i7, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && AbstractC1209k.a(this.f1208i, ((B) obj).f1208i);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1208i.f15625a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f1208i + ')';
    }
}
