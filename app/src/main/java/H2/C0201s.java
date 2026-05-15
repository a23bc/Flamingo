package H2;

import A2.v0;

/* JADX INFO: renamed from: H2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0201s implements InterfaceC0207y, InterfaceC0206x {

    /* JADX INFO: renamed from: o */
    public final A f3227o;

    /* JADX INFO: renamed from: p */
    public final long f3228p;

    /* JADX INFO: renamed from: q */
    public final K2.e f3229q;

    /* JADX INFO: renamed from: r */
    public AbstractC0184a f3230r;

    /* JADX INFO: renamed from: s */
    public InterfaceC0207y f3231s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0206x f3232t;

    /* JADX INFO: renamed from: u */
    public long f3233u = -9223372036854775807L;

    public C0201s(A a4, K2.e eVar, long j3) {
        this.f3227o = a4;
        this.f3229q = eVar;
        this.f3228p = j3;
    }

    @Override // H2.InterfaceC0206x
    public final void a(X x6) {
        InterfaceC0206x interfaceC0206x = this.f3232t;
        int i7 = w2.t.f18881a;
        interfaceC0206x.a(this);
    }

    @Override // H2.InterfaceC0207y
    public final long b() {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        return interfaceC0207y.b();
    }

    @Override // H2.X
    public final boolean c() {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        return interfaceC0207y != null && interfaceC0207y.c();
    }

    @Override // H2.X
    public final boolean d(A2.Z z6) {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        return interfaceC0207y != null && interfaceC0207y.d(z6);
    }

    @Override // H2.X
    public final long e() {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        return interfaceC0207y.e();
    }

    @Override // H2.InterfaceC0207y
    public final long f(long j3, v0 v0Var) {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        return interfaceC0207y.f(j3, v0Var);
    }

    @Override // H2.InterfaceC0207y
    public final void g(InterfaceC0206x interfaceC0206x, long j3) {
        this.f3232t = interfaceC0206x;
        InterfaceC0207y interfaceC0207y = this.f3231s;
        if (interfaceC0207y != null) {
            long j7 = this.f3233u;
            if (j7 == -9223372036854775807L) {
                j7 = this.f3228p;
            }
            interfaceC0207y.g(this, j7);
        }
    }

    @Override // H2.InterfaceC0207y
    public final g0 h() {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        return interfaceC0207y.h();
    }

    @Override // H2.X
    public final long i() {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        return interfaceC0207y.i();
    }

    @Override // H2.InterfaceC0207y
    public final void j() {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        if (interfaceC0207y != null) {
            interfaceC0207y.j();
            return;
        }
        AbstractC0184a abstractC0184a = this.f3230r;
        if (abstractC0184a != null) {
            abstractC0184a.j();
        }
    }

    @Override // H2.InterfaceC0206x
    public final void k(InterfaceC0207y interfaceC0207y) {
        InterfaceC0206x interfaceC0206x = this.f3232t;
        int i7 = w2.t.f18881a;
        interfaceC0206x.k(this);
    }

    public final void l(A a4) {
        long j3 = this.f3233u;
        if (j3 == -9223372036854775807L) {
            j3 = this.f3228p;
        }
        AbstractC0184a abstractC0184a = this.f3230r;
        abstractC0184a.getClass();
        InterfaceC0207y interfaceC0207yB = abstractC0184a.b(a4, this.f3229q, j3);
        this.f3231s = interfaceC0207yB;
        if (this.f3232t != null) {
            interfaceC0207yB.g(this, j3);
        }
    }

    @Override // H2.InterfaceC0207y
    public final long n(J2.q[] qVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j3) {
        long j7 = this.f3233u;
        long j8 = (j7 == -9223372036854775807L || j3 != this.f3228p) ? j3 : j7;
        this.f3233u = -9223372036854775807L;
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        return interfaceC0207y.n(qVarArr, zArr, wArr, zArr2, j8);
    }

    @Override // H2.InterfaceC0207y
    public final long o(long j3) {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        return interfaceC0207y.o(j3);
    }

    @Override // H2.InterfaceC0207y
    public final void p(long j3) {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        interfaceC0207y.p(j3);
    }

    @Override // H2.X
    public final void q(long j3) {
        InterfaceC0207y interfaceC0207y = this.f3231s;
        int i7 = w2.t.f18881a;
        interfaceC0207y.q(j3);
    }
}
