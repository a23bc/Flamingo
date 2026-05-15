package w;

import H2.C0205w;

/* JADX INFO: renamed from: w.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1657F implements InterfaceC1679l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f18513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18515c;

    public C1657F(n0 n0Var, int i7, long j3) {
        this.f18513a = n0Var;
        this.f18514b = i7;
        this.f18515c = j3;
    }

    @Override // w.InterfaceC1679l
    public final q0 d(o0 o0Var) {
        n0 n0Var = this.f18513a;
        return new C0205w(new M5.y(n0Var.f18717a, n0Var.f18718b, n0Var.f18719c), this.f18514b, this.f18515c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1657F)) {
            return false;
        }
        C1657F c1657f = (C1657F) obj;
        if (c1657f.f18513a.equals(this.f18513a) && c1657f.f18514b == this.f18514b) {
            return c1657f.f18515c == this.f18515c;
        }
        return false;
    }

    public final int hashCode() {
        int iB = (AbstractC1676i.b(this.f18514b) + (this.f18513a.hashCode() * 31)) * 31;
        long j3 = this.f18515c;
        return iB + ((int) (j3 ^ (j3 >>> 32)));
    }
}
