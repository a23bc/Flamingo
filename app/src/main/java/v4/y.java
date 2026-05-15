package V4;

import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7601g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7603j;

    public y(long j3, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f7595a = j3;
        this.f7596b = j7;
        this.f7597c = j8;
        this.f7598d = j9;
        this.f7599e = j10;
        this.f7600f = j11;
        this.f7601g = j12;
        this.h = j13;
        this.f7602i = j14;
        this.f7603j = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return C1987t.c(this.f7595a, yVar.f7595a) && C1987t.c(this.f7597c, yVar.f7597c) && C1987t.c(this.f7598d, yVar.f7598d) && C1987t.c(this.f7599e, yVar.f7599e) && C1987t.c(this.f7600f, yVar.f7600f) && C1987t.c(this.f7596b, yVar.f7596b) && C1987t.c(this.f7601g, yVar.f7601g) && C1987t.c(this.h, yVar.h) && C1987t.c(this.f7602i, yVar.f7602i) && C1987t.c(this.f7603j, yVar.f7603j);
    }

    public final int hashCode() {
        return C1987t.i(this.f7603j) + n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(C1987t.i(this.f7595a) * 31, 31, this.f7597c), 31, this.f7598d), 31, this.f7599e), 31, this.f7600f), 31, this.f7596b), 31, this.f7601g), 31, this.h), 31, this.f7602i);
    }
}
