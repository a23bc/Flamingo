package A2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.A f238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f244g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f245i;

    public c0(H2.A a4, long j3, long j7, long j8, long j9, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean z10 = true;
        AbstractC1697a.d(!z9 || z7);
        AbstractC1697a.d(!z8 || z7);
        if (z6 && (z7 || z8 || z9)) {
            z10 = false;
        }
        AbstractC1697a.d(z10);
        this.f238a = a4;
        this.f239b = j3;
        this.f240c = j7;
        this.f241d = j8;
        this.f242e = j9;
        this.f243f = z6;
        this.f244g = z7;
        this.h = z8;
        this.f245i = z9;
    }

    public final c0 a(long j3) {
        if (j3 == this.f240c) {
            return this;
        }
        return new c0(this.f238a, this.f239b, j3, this.f241d, this.f242e, this.f243f, this.f244g, this.h, this.f245i);
    }

    public final c0 b(long j3) {
        if (j3 == this.f239b) {
            return this;
        }
        return new c0(this.f238a, j3, this.f240c, this.f241d, this.f242e, this.f243f, this.f244g, this.h, this.f245i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f239b == c0Var.f239b && this.f240c == c0Var.f240c && this.f241d == c0Var.f241d && this.f242e == c0Var.f242e && this.f243f == c0Var.f243f && this.f244g == c0Var.f244g && this.h == c0Var.h && this.f245i == c0Var.f245i && w2.t.a(this.f238a, c0Var.f238a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f238a.hashCode() + 527) * 31) + ((int) this.f239b)) * 31) + ((int) this.f240c)) * 31) + ((int) this.f241d)) * 31) + ((int) this.f242e)) * 31) + (this.f243f ? 1 : 0)) * 31) + (this.f244g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f245i ? 1 : 0);
    }
}
