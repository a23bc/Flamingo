package H2;

import A2.v0;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements InterfaceC0207y, InterfaceC0206x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0207y f3180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC0206x f3182q;

    public f0(InterfaceC0207y interfaceC0207y, long j3) {
        this.f3180o = interfaceC0207y;
        this.f3181p = j3;
    }

    @Override // H2.InterfaceC0206x
    public final void a(X x6) {
        InterfaceC0206x interfaceC0206x = this.f3182q;
        interfaceC0206x.getClass();
        interfaceC0206x.a(this);
    }

    @Override // H2.InterfaceC0207y
    public final long b() {
        long jB = this.f3180o.b();
        if (jB == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jB + this.f3181p;
    }

    @Override // H2.X
    public final boolean c() {
        return this.f3180o.c();
    }

    @Override // H2.X
    public final boolean d(A2.Z z6) {
        A2.Y y6 = new A2.Y();
        y6.f213b = z6.f216b;
        y6.f214c = z6.f217c;
        y6.f212a = z6.f215a - this.f3181p;
        return this.f3180o.d(new A2.Z(y6));
    }

    @Override // H2.X
    public final long e() {
        long jE = this.f3180o.e();
        if (jE == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jE + this.f3181p;
    }

    @Override // H2.InterfaceC0207y
    public final long f(long j3, v0 v0Var) {
        long j7 = this.f3181p;
        return this.f3180o.f(j3 - j7, v0Var) + j7;
    }

    @Override // H2.InterfaceC0207y
    public final void g(InterfaceC0206x interfaceC0206x, long j3) {
        this.f3182q = interfaceC0206x;
        this.f3180o.g(this, j3 - this.f3181p);
    }

    @Override // H2.InterfaceC0207y
    public final g0 h() {
        return this.f3180o.h();
    }

    @Override // H2.X
    public final long i() {
        long jI = this.f3180o.i();
        if (jI == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jI + this.f3181p;
    }

    @Override // H2.InterfaceC0207y
    public final void j() {
        this.f3180o.j();
    }

    @Override // H2.InterfaceC0206x
    public final void k(InterfaceC0207y interfaceC0207y) {
        InterfaceC0206x interfaceC0206x = this.f3182q;
        interfaceC0206x.getClass();
        interfaceC0206x.k(this);
    }

    @Override // H2.InterfaceC0207y
    public final long n(J2.q[] qVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j3) {
        W[] wArr2 = new W[wArr.length];
        int i7 = 0;
        while (true) {
            W w7 = null;
            if (i7 >= wArr.length) {
                break;
            }
            e0 e0Var = (e0) wArr[i7];
            if (e0Var != null) {
                w7 = e0Var.f3168o;
            }
            wArr2[i7] = w7;
            i7++;
        }
        long j7 = this.f3181p;
        long jN = this.f3180o.n(qVarArr, zArr, wArr2, zArr2, j3 - j7);
        for (int i8 = 0; i8 < wArr.length; i8++) {
            W w8 = wArr2[i8];
            if (w8 == null) {
                wArr[i8] = null;
            } else {
                W w9 = wArr[i8];
                if (w9 == null || ((e0) w9).f3168o != w8) {
                    wArr[i8] = new e0(w8, j7);
                }
            }
        }
        return jN + j7;
    }

    @Override // H2.InterfaceC0207y
    public final long o(long j3) {
        long j7 = this.f3181p;
        return this.f3180o.o(j3 - j7) + j7;
    }

    @Override // H2.InterfaceC0207y
    public final void p(long j3) {
        this.f3180o.p(j3 - this.f3181p);
    }

    @Override // H2.X
    public final void q(long j3) {
        this.f3180o.q(j3 - this.f3181p);
    }
}
