package H2;

import N2.C0293j;
import java.util.List;
import t2.C1486o;
import t2.C1487p;

/* JADX INFO: renamed from: H2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0197n implements N2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3210a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3211b;

    public C0197n(int i7) {
        if ((i7 & 1) != 0) {
            this.f3211b = new N2.D("image/jpeg", 65496, 2);
        } else {
            this.f3211b = new V2.a();
        }
    }

    @Override // N2.m
    public final void a() {
        switch (this.f3210a) {
            case 0:
                break;
            default:
                ((N2.m) this.f3211b).a();
                break;
        }
    }

    @Override // N2.m
    public final N2.m b() {
        int i7 = this.f3210a;
        return this;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        switch (this.f3210a) {
            case 0:
                N2.H hE = oVar.E(0, 3);
                oVar.H(new N2.r(-9223372036854775807L));
                oVar.k();
                C1487p c1487p = (C1487p) this.f3211b;
                C1486o c1486oA = c1487p.a();
                c1486oA.l = t2.M.j("text/x-unknown");
                c1486oA.f16624i = c1487p.f16701m;
                hE.e(new C1487p(c1486oA));
                break;
            default:
                ((N2.m) this.f3211b).c(oVar);
                break;
        }
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        switch (this.f3210a) {
            case 0:
                break;
            default:
                ((N2.m) this.f3211b).e(j3, j7);
                break;
        }
    }

    @Override // N2.m
    public final List f() {
        switch (this.f3210a) {
            case 0:
                E4.G g6 = E4.I.f1870p;
                break;
            default:
                E4.G g7 = E4.I.f1870p;
                break;
        }
        return E4.b0.f1913s;
    }

    @Override // N2.m
    public final int g(N2.n nVar, N2.q qVar) {
        switch (this.f3210a) {
            case 0:
                return ((C0293j) nVar).s(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((N2.m) this.f3211b).g(nVar, qVar);
        }
    }

    @Override // N2.m
    public final boolean m(N2.n nVar) {
        switch (this.f3210a) {
            case 0:
                return true;
            default:
                return ((N2.m) this.f3211b).m(nVar);
        }
    }

    public C0197n(C1487p c1487p) {
        this.f3211b = c1487p;
    }

    private final void d() {
    }

    private final void h(long j3, long j7) {
    }
}
