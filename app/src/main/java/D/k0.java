package D;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1347d;

    public k0(float f7, float f8, float f9, float f10) {
        this.f1344a = f7;
        this.f1345b = f8;
        this.f1346c = f9;
        this.f1347d = f10;
        if (!((f7 >= 0.0f) & (f8 >= 0.0f) & (f9 >= 0.0f)) || !(f10 >= 0.0f)) {
            E.a.a("Padding must be non-negative");
        }
    }

    public final float a(n1.n nVar) {
        return nVar == n1.n.f14521o ? this.f1344a : this.f1346c;
    }

    public final float b(n1.n nVar) {
        return nVar == n1.n.f14521o ? this.f1346c : this.f1344a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return n1.g.a(this.f1344a, k0Var.f1344a) && n1.g.a(this.f1345b, k0Var.f1345b) && n1.g.a(this.f1346c, k0Var.f1346c) && n1.g.a(this.f1347d, k0Var.f1347d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1347d) + n1.c.n(this.f1346c, n1.c.n(this.f1345b, Float.floatToIntBits(this.f1344a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) n1.g.b(this.f1344a)) + ", top=" + ((Object) n1.g.b(this.f1345b)) + ", end=" + ((Object) n1.g.b(this.f1346c)) + ", bottom=" + ((Object) n1.g.b(this.f1347d)) + ')';
    }
}
