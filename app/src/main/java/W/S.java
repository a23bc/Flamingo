package w;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC1652A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18557c;

    public S(float f7, float f8, Object obj) {
        this.f18555a = f7;
        this.f18556b = f8;
        this.f18557c = obj;
    }

    @Override // w.InterfaceC1679l
    public final q0 d(o0 o0Var) {
        Object obj = this.f18557c;
        return new k.I(this.f18555a, this.f18556b, obj == null ? null : (r) o0Var.f18722a.b(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            S s7 = (S) obj;
            if (s7.f18555a == this.f18555a && s7.f18556b == this.f18556b && AbstractC1209k.a(s7.f18557c, this.f18557c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f18557c;
        return Float.floatToIntBits(this.f18556b) + n1.c.n(this.f18555a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ S(int i7, Object obj) {
        this(1.0f, 1500.0f, (i7 & 4) != 0 ? null : obj);
    }
}
