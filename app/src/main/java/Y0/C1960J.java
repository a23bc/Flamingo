package y0;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: y0.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1960J implements n1.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC1963M f20184A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f20185B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f20186C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f20187D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public n1.d f20188E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public n1.n f20189F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C1982o f20190G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f20191H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AbstractC1959I f20192I;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f20194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f20195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f20197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f20198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f20199u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20200v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f20202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f20203y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f20204z;

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return n1.c.h(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return n1.c.f(f7, this);
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return n1.c.k(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return n1.c.j(j3, this);
    }

    public final void a(float f7) {
        if (this.f20196r == f7) {
            return;
        }
        this.f20193o |= 4;
        this.f20196r = f7;
    }

    @Override // n1.d
    public final float b() {
        return this.f20188E.b();
    }

    public final void c(long j3) {
        if (C1987t.c(this.f20200v, j3)) {
            return;
        }
        this.f20193o |= 64;
        this.f20200v = j3;
    }

    public final void d(boolean z6) {
        if (this.f20185B != z6) {
            this.f20193o |= 16384;
            this.f20185B = z6;
        }
    }

    public final void e(int i7) {
        if (this.f20186C == i7) {
            return;
        }
        this.f20193o |= 32768;
        this.f20186C = i7;
    }

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
    }

    public final void g(H.P p7) {
        if (AbstractC1209k.a(this.f20190G, p7)) {
            return;
        }
        this.f20193o |= 131072;
        this.f20190G = (C1982o) p7;
    }

    public final void h(float f7) {
        if (this.f20202x == f7) {
            return;
        }
        this.f20193o |= 1024;
        this.f20202x = f7;
    }

    public final void i(float f7) {
        if (this.f20194p == f7) {
            return;
        }
        this.f20193o |= 1;
        this.f20194p = f7;
    }

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    public final void j(float f7) {
        if (this.f20195q == f7) {
            return;
        }
        this.f20193o |= 2;
        this.f20195q = f7;
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
    }

    public final void l(float f7) {
        if (this.f20199u == f7) {
            return;
        }
        this.f20193o |= 32;
        this.f20199u = f7;
    }

    public final void m(InterfaceC1963M interfaceC1963M) {
        if (AbstractC1209k.a(this.f20184A, interfaceC1963M)) {
            return;
        }
        this.f20193o |= 8192;
        this.f20184A = interfaceC1963M;
    }

    @Override // n1.d
    public final float n() {
        return this.f20188E.n();
    }

    public final void o(long j3) {
        if (C1987t.c(this.f20201w, j3)) {
            return;
        }
        this.f20193o |= 128;
        this.f20201w = j3;
    }

    public final void q(long j3) {
        if (C1967Q.a(this.f20204z, j3)) {
            return;
        }
        this.f20193o |= 4096;
        this.f20204z = j3;
    }

    public final void r(float f7) {
        if (this.f20197s == f7) {
            return;
        }
        this.f20193o |= 8;
        this.f20197s = f7;
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return n1.c.i(j3, this);
    }

    public final void u(float f7) {
        if (this.f20198t == f7) {
            return;
        }
        this.f20193o |= 16;
        this.f20198t = f7;
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
