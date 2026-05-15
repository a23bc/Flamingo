package Q2;

import E4.G;
import E4.I;
import E4.b0;
import N2.C0293j;
import N2.D;
import N2.m;
import N2.n;
import N2.o;
import N2.q;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.m f6108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f6109c;

    public a(int i7) {
        this.f6107a = i7;
        switch (i7) {
            case 1:
                this.f6108b = new w2.m(4);
                this.f6109c = new D("image/heif", -1, -1);
                break;
            case 2:
                this.f6108b = new w2.m(4);
                this.f6109c = new D("image/webp", -1, -1);
                break;
            default:
                this.f6108b = new w2.m(4);
                this.f6109c = new D("image/avif", -1, -1);
                break;
        }
    }

    @Override // N2.m
    public final void a() {
        int i7 = this.f6107a;
    }

    @Override // N2.m
    public final m b() {
        int i7 = this.f6107a;
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        switch (this.f6107a) {
            case 0:
                this.f6109c.c(oVar);
                break;
            case 1:
                this.f6109c.c(oVar);
                break;
            default:
                this.f6109c.c(oVar);
                break;
        }
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        switch (this.f6107a) {
            case 0:
                this.f6109c.e(j3, j7);
                break;
            case 1:
                this.f6109c.e(j3, j7);
                break;
            default:
                this.f6109c.e(j3, j7);
                break;
        }
    }

    @Override // N2.m
    public final List f() {
        switch (this.f6107a) {
            case 0:
                G g6 = I.f1870p;
                break;
            case 1:
                G g7 = I.f1870p;
                break;
            default:
                G g8 = I.f1870p;
                break;
        }
        return b0.f1913s;
    }

    @Override // N2.m
    public final int g(n nVar, q qVar) {
        switch (this.f6107a) {
        }
        return this.f6109c.g(nVar, qVar);
    }

    @Override // N2.m
    public final boolean m(n nVar) throws EOFException, InterruptedIOException {
        switch (this.f6107a) {
            case 0:
                C0293j c0293j = (C0293j) nVar;
                c0293j.k(4, false);
                w2.m mVar = this.f6108b;
                mVar.D(4);
                c0293j.i(mVar.f18867a, 0, 4, false);
                if (mVar.w() == 1718909296) {
                    mVar.D(4);
                    c0293j.i(mVar.f18867a, 0, 4, false);
                    if (mVar.w() == 1635150182) {
                    }
                }
                break;
            case 1:
                C0293j c0293j2 = (C0293j) nVar;
                c0293j2.k(4, false);
                w2.m mVar2 = this.f6108b;
                mVar2.D(4);
                c0293j2.i(mVar2.f18867a, 0, 4, false);
                if (mVar2.w() == 1718909296) {
                    mVar2.D(4);
                    c0293j2.i(mVar2.f18867a, 0, 4, false);
                    if (mVar2.w() == 1751476579) {
                    }
                }
                break;
            default:
                w2.m mVar3 = this.f6108b;
                mVar3.D(4);
                C0293j c0293j3 = (C0293j) nVar;
                c0293j3.i(mVar3.f18867a, 0, 4, false);
                if (mVar3.w() == 1380533830) {
                    c0293j3.k(4, false);
                    mVar3.D(4);
                    c0293j3.i(mVar3.f18867a, 0, 4, false);
                    if (mVar3.w() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    private final void d() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
