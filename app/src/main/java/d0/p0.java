package d0;

import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11073g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11075j;

    public p0(long j3, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f11067a = j3;
        this.f11068b = j7;
        this.f11069c = j8;
        this.f11070d = j9;
        this.f11071e = j10;
        this.f11072f = j11;
        this.f11073g = j12;
        this.h = j13;
        this.f11074i = j14;
        this.f11075j = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return C1987t.c(this.f11067a, p0Var.f11067a) && C1987t.c(this.f11068b, p0Var.f11068b) && C1987t.c(this.f11069c, p0Var.f11069c) && C1987t.c(this.f11070d, p0Var.f11070d) && C1987t.c(this.f11071e, p0Var.f11071e) && C1987t.c(this.f11072f, p0Var.f11072f) && C1987t.c(this.f11073g, p0Var.f11073g) && C1987t.c(this.h, p0Var.h) && C1987t.c(this.f11074i, p0Var.f11074i) && C1987t.c(this.f11075j, p0Var.f11075j);
    }

    public final int hashCode() {
        return C1987t.i(this.f11075j) + n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(C1987t.i(this.f11067a) * 31, 31, this.f11068b), 31, this.f11069c), 31, this.f11070d), 31, this.f11071e), 31, this.f11072f), 31, this.f11073g), 31, this.h), 31, this.f11074i);
    }
}
