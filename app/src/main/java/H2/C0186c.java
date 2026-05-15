package H2;

import A2.v0;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: H2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0186c implements InterfaceC0207y, InterfaceC0206x {

    /* JADX INFO: renamed from: o */
    public final InterfaceC0207y f3137o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0206x f3138p;

    /* JADX INFO: renamed from: q */
    public C0185b[] f3139q = new C0185b[0];

    /* JADX INFO: renamed from: r */
    public long f3140r;

    /* JADX INFO: renamed from: s */
    public long f3141s;

    /* JADX INFO: renamed from: t */
    public long f3142t;

    /* JADX INFO: renamed from: u */
    public C0188e f3143u;

    public C0186c(InterfaceC0207y interfaceC0207y, boolean z6, long j3, long j7) {
        this.f3137o = interfaceC0207y;
        this.f3140r = z6 ? j3 : -9223372036854775807L;
        this.f3141s = j3;
        this.f3142t = j7;
    }

    @Override // H2.InterfaceC0206x
    public final void a(X x6) {
        InterfaceC0206x interfaceC0206x = this.f3138p;
        interfaceC0206x.getClass();
        interfaceC0206x.a(this);
    }

    @Override // H2.InterfaceC0207y
    public final long b() {
        if (l()) {
            long j3 = this.f3140r;
            this.f3140r = -9223372036854775807L;
            long jB = b();
            return jB != -9223372036854775807L ? jB : j3;
        }
        long jB2 = this.f3137o.b();
        if (jB2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1697a.i(jB2 >= this.f3141s);
        long j7 = this.f3142t;
        AbstractC1697a.i(j7 == Long.MIN_VALUE || jB2 <= j7);
        return jB2;
    }

    @Override // H2.X
    public final boolean c() {
        return this.f3137o.c();
    }

    @Override // H2.X
    public final boolean d(A2.Z z6) {
        return this.f3137o.d(z6);
    }

    @Override // H2.X
    public final long e() {
        long jE = this.f3137o.e();
        if (jE != Long.MIN_VALUE) {
            long j3 = this.f3142t;
            if (j3 == Long.MIN_VALUE || jE < j3) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // H2.InterfaceC0207y
    public final long f(long j3, v0 v0Var) {
        long j7 = this.f3141s;
        if (j3 == j7) {
            return j7;
        }
        long jH = w2.t.h(v0Var.f459a, 0L, j3 - j7);
        long j8 = this.f3142t;
        long jH2 = w2.t.h(v0Var.f460b, 0L, j8 == Long.MIN_VALUE ? Long.MAX_VALUE : j8 - j3);
        if (jH != v0Var.f459a || jH2 != v0Var.f460b) {
            v0Var = new v0(jH, jH2);
        }
        return this.f3137o.f(j3, v0Var);
    }

    @Override // H2.InterfaceC0207y
    public final void g(InterfaceC0206x interfaceC0206x, long j3) {
        this.f3138p = interfaceC0206x;
        this.f3137o.g(this, j3);
    }

    @Override // H2.InterfaceC0207y
    public final g0 h() {
        return this.f3137o.h();
    }

    @Override // H2.X
    public final long i() {
        long jI = this.f3137o.i();
        if (jI != Long.MIN_VALUE) {
            long j3 = this.f3142t;
            if (j3 == Long.MIN_VALUE || jI < j3) {
                return jI;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // H2.InterfaceC0207y
    public final void j() throws C0188e {
        C0188e c0188e = this.f3143u;
        if (c0188e != null) {
            throw c0188e;
        }
        this.f3137o.j();
    }

    @Override // H2.InterfaceC0206x
    public final void k(InterfaceC0207y interfaceC0207y) {
        if (this.f3143u != null) {
            return;
        }
        InterfaceC0206x interfaceC0206x = this.f3138p;
        interfaceC0206x.getClass();
        interfaceC0206x.k(this);
    }

    public final boolean l() {
        return this.f3140r != -9223372036854775807L;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:195:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0122  */
    @Override // H2.InterfaceC0207y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n(J2.q[] r17, boolean[] r18, H2.W[] r19, boolean[] r20, long r21) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0186c.n(J2.q[], boolean[], H2.W[], boolean[], long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    @Override // H2.InterfaceC0207y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f3140r = r0
            H2.b[] r0 = r5.f3139q
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f3132p = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            H2.y r0 = r5.f3137o
            long r0 = r0.o(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f3141s
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f3142t
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            w2.AbstractC1697a.i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0186c.o(long):long");
    }

    @Override // H2.InterfaceC0207y
    public final void p(long j3) {
        this.f3137o.p(j3);
    }

    @Override // H2.X
    public final void q(long j3) {
        this.f3137o.q(j3);
    }
}
