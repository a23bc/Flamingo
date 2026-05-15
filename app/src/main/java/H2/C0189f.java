package H2;

import java.util.ArrayList;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: H2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189f extends i0 {
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f3174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t2.g0 f3175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0187d f3176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0188e f3177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3178u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3179v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189f(AbstractC0184a abstractC0184a, long j3, long j7, boolean z6, boolean z7, boolean z8) {
        super(abstractC0184a);
        abstractC0184a.getClass();
        AbstractC1697a.d(j3 >= 0);
        this.l = j3;
        this.f3170m = j7;
        this.f3171n = z6;
        this.f3172o = z7;
        this.f3173p = z8;
        this.f3174q = new ArrayList();
        this.f3175r = new t2.g0();
    }

    public final void B(t2.h0 h0Var) {
        long j3;
        long j7;
        long j8;
        t2.g0 g0Var = this.f3175r;
        h0Var.n(0, g0Var);
        long j9 = g0Var.f16466o;
        C0187d c0187d = this.f3176s;
        ArrayList arrayList = this.f3174q;
        long j10 = this.f3170m;
        if (c0187d == null || arrayList.isEmpty() || this.f3172o) {
            boolean z6 = this.f3173p;
            j3 = this.l;
            if (z6) {
                long j11 = g0Var.f16463k;
                j3 += j11;
                j7 = j11 + j10;
            } else {
                j7 = j10;
            }
            this.f3178u = j9 + j3;
            this.f3179v = j10 != Long.MIN_VALUE ? j9 + j7 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0186c c0186c = (C0186c) arrayList.get(i7);
                long j12 = this.f3178u;
                long j13 = this.f3179v;
                c0186c.f3141s = j12;
                c0186c.f3142t = j13;
            }
            j8 = j7;
        } else {
            j3 = this.f3178u - j9;
            j8 = j10 != Long.MIN_VALUE ? this.f3179v - j9 : Long.MIN_VALUE;
        }
        try {
            C0187d c0187d2 = new C0187d(h0Var, j3, j8);
            this.f3176s = c0187d2;
            m(c0187d2);
        } catch (C0188e e7) {
            this.f3177t = e7;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0186c) arrayList.get(i8)).f3143u = this.f3177t;
            }
        }
    }

    @Override // H2.AbstractC0184a
    public final boolean a(t2.G g6) {
        AbstractC0184a abstractC0184a = this.f3195k;
        return abstractC0184a.h().f16227e.equals(g6.f16227e) && abstractC0184a.a(g6);
    }

    @Override // H2.AbstractC0184a
    public final InterfaceC0207y b(A a4, K2.e eVar, long j3) {
        C0186c c0186c = new C0186c(this.f3195k.b(a4, eVar, j3), this.f3171n, this.f3178u, this.f3179v);
        this.f3174q.add(c0186c);
        return c0186c;
    }

    @Override // H2.AbstractC0192i, H2.AbstractC0184a
    public final void j() throws C0188e {
        C0188e c0188e = this.f3177t;
        if (c0188e != null) {
            throw c0188e;
        }
        super.j();
    }

    @Override // H2.AbstractC0184a
    public final void n(InterfaceC0207y interfaceC0207y) {
        ArrayList arrayList = this.f3174q;
        AbstractC1697a.i(arrayList.remove(interfaceC0207y));
        this.f3195k.n(((C0186c) interfaceC0207y).f3137o);
        if (!arrayList.isEmpty() || this.f3172o) {
            return;
        }
        C0187d c0187d = this.f3176s;
        c0187d.getClass();
        B(c0187d.f3220e);
    }

    @Override // H2.AbstractC0192i, H2.AbstractC0184a
    public final void p() {
        super.p();
        this.f3177t = null;
        this.f3176s = null;
    }

    @Override // H2.i0
    public final void z(t2.h0 h0Var) {
        if (this.f3177t != null) {
            return;
        }
        B(h0Var);
    }
}
