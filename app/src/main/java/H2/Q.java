package H2;

import A2.x0;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import t2.C1469B;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0184a {
    public final V1.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A2.I f3065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final D2.q f3066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0 f3067k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3068m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3069n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y2.C f3072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t2.G f3073r;

    public Q(t2.G g6, V1.a aVar, A2.I i7, D2.q qVar, x0 x0Var, int i8) {
        this.f3073r = g6;
        this.h = aVar;
        this.f3065i = i7;
        this.f3066j = qVar;
        this.f3067k = x0Var;
        this.l = i8;
    }

    @Override // H2.AbstractC0184a
    public final boolean a(t2.G g6) {
        C1469B c1469b = h().f16224b;
        c1469b.getClass();
        C1469B c1469b2 = g6.f16224b;
        return c1469b2 != null && c1469b2.f16185a.equals(c1469b.f16185a) && c1469b2.h == c1469b.h && w2.t.a(c1469b2.f16190f, c1469b.f16190f);
    }

    @Override // H2.AbstractC0184a
    public final InterfaceC0207y b(A a4, K2.e eVar, long j3) {
        y2.h hVarV = this.h.v();
        y2.C c7 = this.f3072q;
        if (c7 != null) {
            ((y2.n) hVarV).a(c7);
        }
        C1469B c1469b = h().f16224b;
        c1469b.getClass();
        AbstractC1697a.j(this.f3127g);
        A0.b bVar = new A0.b((N2.p) this.f3065i.f80p);
        D2.n nVar = new D2.n(this.f3124d.f1529c, 0, a4);
        D4.i iVar = new D4.i((CopyOnWriteArrayList) this.f3123c.f1584r, 0, a4);
        long jD = w2.t.D(c1469b.h);
        return new N(c1469b.f16185a, hVarV, bVar, this.f3066j, nVar, this.f3067k, iVar, this, eVar, c1469b.f16190f, this.l, jD);
    }

    @Override // H2.AbstractC0184a
    public final synchronized t2.G h() {
        return this.f3073r;
    }

    @Override // H2.AbstractC0184a
    public final void l(y2.C c7) {
        this.f3072q = c7;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        B2.p pVar = this.f3127g;
        AbstractC1697a.j(pVar);
        D2.q qVar = this.f3066j;
        qVar.z(looperMyLooper, pVar);
        qVar.b();
        t();
    }

    @Override // H2.AbstractC0184a
    public final void n(InterfaceC0207y interfaceC0207y) {
        N n7 = (N) interfaceC0207y;
        if (n7.f3033K) {
            for (V v3 : n7.f3030H) {
                v3.h();
                D2.k kVar = v3.h;
                if (kVar != null) {
                    kVar.c(v3.f3093e);
                    v3.h = null;
                    v3.f3095g = null;
                }
            }
        }
        K2.m mVar = n7.f3059z;
        K2.j jVar = mVar.f4034b;
        if (jVar != null) {
            jVar.a(true);
        }
        B3.c cVar = new B3.c(3, n7);
        ExecutorService executorService = mVar.f4033a;
        executorService.execute(cVar);
        executorService.shutdown();
        n7.f3027E.removeCallbacksAndMessages(null);
        n7.f3028F = null;
        n7.b0 = true;
    }

    @Override // H2.AbstractC0184a
    public final void p() {
        this.f3066j.a();
    }

    @Override // H2.AbstractC0184a
    public final synchronized void s(t2.G g6) {
        this.f3073r = g6;
    }

    public final void t() {
        t2.h0 z6 = new Z(this.f3069n, this.f3070o, this.f3071p, h());
        if (this.f3068m) {
            z6 = new O(z6);
        }
        m(z6);
    }

    public final void u(long j3, boolean z6, boolean z7) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f3069n;
        }
        if (!this.f3068m && this.f3069n == j3 && this.f3070o == z6 && this.f3071p == z7) {
            return;
        }
        this.f3069n = j3;
        this.f3070o = z6;
        this.f3071p = z7;
        this.f3068m = false;
        t();
    }

    @Override // H2.AbstractC0184a
    public final void j() {
    }
}
