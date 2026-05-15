package N2;

import E4.b0;
import java.util.List;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class D implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f4973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H f4974g;

    public D(String str, int i7, int i8) {
        this.f4968a = i7;
        this.f4969b = i8;
        this.f4970c = str;
    }

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f4973f = oVar;
        H hE = oVar.E(1024, 4);
        this.f4974g = hE;
        C1486o c1486o = new C1486o();
        c1486o.l = M.j(this.f4970c);
        hE.e(new C1487p(c1486o));
        this.f4973f.k();
        this.f4973f.H(new E());
        this.f4972e = 1;
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        if (j3 == 0 || this.f4972e == 1) {
            this.f4972e = 1;
            this.f4971d = 0;
        }
    }

    @Override // N2.m
    public final List f() {
        E4.G g6 = E4.I.f1870p;
        return b0.f1913s;
    }

    @Override // N2.m
    public final int g(n nVar, q qVar) {
        int i7 = this.f4972e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        H h = this.f4974g;
        h.getClass();
        int iA = h.a(nVar, 1024, true);
        if (iA != -1) {
            this.f4971d += iA;
            return 0;
        }
        this.f4972e = 2;
        this.f4974g.f(0L, 1, this.f4971d, 0, null);
        this.f4971d = 0;
        return 0;
    }

    @Override // N2.m
    public final boolean m(n nVar) {
        int i7 = this.f4969b;
        int i8 = this.f4968a;
        AbstractC1697a.i((i8 == -1 || i7 == -1) ? false : true);
        w2.m mVar = new w2.m(i7);
        ((C0293j) nVar).i(mVar.f18867a, 0, i7, false);
        return mVar.A() == i8;
    }

    @Override // N2.m
    public final void a() {
    }
}
