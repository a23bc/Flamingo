package D;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1355a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1356b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0060d f1357c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Float.compare(this.f1355a, n0Var.f1355a) == 0 && this.f1356b == n0Var.f1356b && AbstractC1209k.a(this.f1357c, n0Var.f1357c);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f1355a) * 31) + (this.f1356b ? 1231 : 1237)) * 31;
        AbstractC0060d abstractC0060d = this.f1357c;
        return (iFloatToIntBits + (abstractC0060d == null ? 0 : abstractC0060d.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f1355a + ", fill=" + this.f1356b + ", crossAxisAlignment=" + this.f1357c + ", flowLayoutData=null)";
    }
}
