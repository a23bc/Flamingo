package A2;

import t2.C1486o;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: A2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006g implements q0 {

    /* JADX INFO: renamed from: B */
    public boolean f276B;

    /* JADX INFO: renamed from: C */
    public boolean f277C;

    /* JADX INFO: renamed from: E */
    public J2.o f279E;

    /* JADX INFO: renamed from: p */
    public final int f281p;

    /* JADX INFO: renamed from: r */
    public u0 f283r;

    /* JADX INFO: renamed from: s */
    public int f284s;

    /* JADX INFO: renamed from: t */
    public B2.p f285t;

    /* JADX INFO: renamed from: u */
    public w2.o f286u;

    /* JADX INFO: renamed from: v */
    public int f287v;

    /* JADX INFO: renamed from: w */
    public H2.W f288w;

    /* JADX INFO: renamed from: x */
    public C1487p[] f289x;

    /* JADX INFO: renamed from: y */
    public long f290y;

    /* JADX INFO: renamed from: z */
    public long f291z;

    /* JADX INFO: renamed from: o */
    public final Object f280o = new Object();

    /* JADX INFO: renamed from: q */
    public final V.o f282q = new V.o((char) 0, 2);

    /* JADX INFO: renamed from: A */
    public long f275A = Long.MIN_VALUE;

    /* JADX INFO: renamed from: D */
    public t2.h0 f278D = t2.h0.f16472a;

    public AbstractC0006g(int i7) {
        this.f281p = i7;
    }

    public abstract int A(C1487p c1487p);

    public int B() {
        return 0;
    }

    public final C0013n b(Throwable th, C1487p c1487p, boolean z6, int i7) {
        int iA;
        if (c1487p == null || this.f277C) {
            iA = 4;
        } else {
            this.f277C = true;
            try {
                iA = A(c1487p) & 7;
            } catch (C0013n unused) {
                iA = 4;
            } finally {
                this.f277C = false;
            }
        }
        return new C0013n(1, th, i7, e(), this.f284s, c1487p, c1487p == null ? 4 : iA, z6);
    }

    public void c() {
    }

    public a0 d() {
        return null;
    }

    public abstract String e();

    public final boolean f() {
        return this.f275A == Long.MIN_VALUE;
    }

    public abstract boolean g();

    public abstract boolean i();

    public final boolean m() {
        if (f()) {
            return this.f276B;
        }
        H2.W w7 = this.f288w;
        w7.getClass();
        return w7.w();
    }

    public abstract void n();

    public abstract void p(long j3, boolean z6);

    public abstract void u(C1487p[] c1487pArr, long j3, long j7);

    public final int v(V.o oVar, z2.f fVar, int i7) {
        H2.W w7 = this.f288w;
        w7.getClass();
        int iF = w7.f(oVar, fVar, i7);
        if (iF == -4) {
            if (fVar.c(4)) {
                this.f275A = Long.MIN_VALUE;
                return this.f276B ? -4 : -3;
            }
            long j3 = fVar.f21117u + this.f290y;
            fVar.f21117u = j3;
            this.f275A = Math.max(this.f275A, j3);
            return iF;
        }
        if (iF == -5) {
            C1487p c1487p = (C1487p) oVar.f7343q;
            c1487p.getClass();
            long j7 = c1487p.f16706r;
            if (j7 != Long.MAX_VALUE) {
                C1486o c1486oA = c1487p.a();
                c1486oA.f16631q = j7 + this.f290y;
                oVar.f7343q = new C1487p(c1486oA);
            }
        }
        return iF;
    }

    public abstract void w(long j3, long j7);

    public final void x(C1487p[] c1487pArr, H2.W w7, long j3, long j7, H2.A a4) {
        AbstractC1697a.i(!this.f276B);
        this.f288w = w7;
        if (this.f275A == Long.MIN_VALUE) {
            this.f275A = j3;
        }
        this.f289x = c1487pArr;
        this.f290y = j7;
        u(c1487pArr, j3, j7);
    }

    public final void y() {
        AbstractC1697a.i(this.f287v == 0);
        this.f282q.e();
        r();
    }

    public void z(float f7, float f8) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    @Override // A2.q0
    public void a(int i7, Object obj) {
    }

    public void o(boolean z6, boolean z7) {
    }
}
