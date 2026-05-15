package V4;

import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0878b0;
import y0.C1987t;

/* JADX INFO: renamed from: V4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0458e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7489g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7491j;

    public C0458e(long j3, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f7483a = j3;
        this.f7484b = j7;
        this.f7485c = j8;
        this.f7486d = j9;
        this.f7487e = j10;
        this.f7488f = j11;
        this.f7489g = j12;
        this.h = j13;
        this.f7490i = j14;
        this.f7491j = j15;
    }

    public final InterfaceC0878b0 a(boolean z6, C0912t c0912t) {
        c0912t.Y(1252117114);
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(new C1987t(z6 ? this.f7485c : this.f7487e), c0912t);
        c0912t.p(false);
        return interfaceC0878b0X;
    }

    public final InterfaceC0878b0 b(boolean z6, C0912t c0912t) {
        c0912t.Y(1879884620);
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(new C1987t(z6 ? this.f7484b : this.f7486d), c0912t);
        c0912t.p(false);
        return interfaceC0878b0X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0458e)) {
            return false;
        }
        C0458e c0458e = (C0458e) obj;
        return C1987t.c(this.f7483a, c0458e.f7483a) && C1987t.c(this.f7484b, c0458e.f7484b) && C1987t.c(this.f7485c, c0458e.f7485c) && C1987t.c(this.f7486d, c0458e.f7486d) && C1987t.c(this.f7487e, c0458e.f7487e) && C1987t.c(this.f7488f, c0458e.f7488f) && C1987t.c(this.f7489g, c0458e.f7489g) && C1987t.c(this.h, c0458e.h) && C1987t.c(this.f7490i, c0458e.f7490i) && C1987t.c(this.f7491j, c0458e.f7491j);
    }

    public final int hashCode() {
        return C1987t.i(this.f7491j) + n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(n1.c.o(C1987t.i(this.f7483a) * 31, 31, this.f7484b), 31, this.f7485c), 31, this.f7486d), 31, this.f7487e), 31, this.f7488f), 31, this.f7489g), 31, this.h), 31, this.f7490i);
    }
}
