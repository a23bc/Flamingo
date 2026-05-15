package w;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements InterfaceC1652A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1690x f18719c;

    public n0(int i7, InterfaceC1690x interfaceC1690x, int i8) {
        this((i8 & 1) != 0 ? 300 : i7, 0, (i8 & 4) != 0 ? AbstractC1692z.f18766a : interfaceC1690x);
    }

    @Override // w.InterfaceC1679l
    public final q0 d(o0 o0Var) {
        return new M5.y(this.f18717a, this.f18718b, this.f18719c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (n0Var.f18717a == this.f18717a && n0Var.f18718b == this.f18718b && AbstractC1209k.a(n0Var.f18719c, this.f18719c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18719c.hashCode() + (this.f18717a * 31)) * 31) + this.f18718b;
    }

    public n0(int i7, int i8, InterfaceC1690x interfaceC1690x) {
        this.f18717a = i7;
        this.f18718b = i8;
        this.f18719c = interfaceC1690x;
    }
}
