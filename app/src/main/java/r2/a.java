package R2;

import E4.G;
import E4.I;
import E4.b0;
import N2.D;
import N2.m;
import N2.n;
import N2.o;
import N2.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f6664b;

    public a(int i7) {
        this.f6663a = i7;
        switch (i7) {
            case 1:
                this.f6664b = new D("image/png", 35152, 2);
                break;
            default:
                this.f6664b = new D("image/bmp", 16973, 2);
                break;
        }
    }

    @Override // N2.m
    public final void a() {
        int i7 = this.f6663a;
    }

    @Override // N2.m
    public final m b() {
        int i7 = this.f6663a;
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        switch (this.f6663a) {
            case 0:
                this.f6664b.c(oVar);
                break;
            default:
                this.f6664b.c(oVar);
                break;
        }
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        switch (this.f6663a) {
            case 0:
                this.f6664b.e(j3, j7);
                break;
            default:
                this.f6664b.e(j3, j7);
                break;
        }
    }

    @Override // N2.m
    public final List f() {
        switch (this.f6663a) {
            case 0:
                G g6 = I.f1870p;
                break;
            default:
                G g7 = I.f1870p;
                break;
        }
        return b0.f1913s;
    }

    @Override // N2.m
    public final int g(n nVar, q qVar) {
        switch (this.f6663a) {
        }
        return this.f6664b.g(nVar, qVar);
    }

    @Override // N2.m
    public final boolean m(n nVar) {
        switch (this.f6663a) {
        }
        return this.f6664b.m(nVar);
    }

    private final void d() {
    }

    private final void h() {
    }
}
