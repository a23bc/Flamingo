package D;

import m5.AbstractC1209k;
import r0.C1389g;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0060d {

    /* JADX INFO: renamed from: i */
    public final C1389g f1211i;

    public C(C1389g c1389g) {
        this.f1211i = c1389g;
    }

    @Override // D.AbstractC0060d
    public final int e(int i7, n1.n nVar) {
        return this.f1211i.a(0, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && AbstractC1209k.a(this.f1211i, ((C) obj).f1211i);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1211i.f15626a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f1211i + ')';
    }
}
