package V2;

import C2.N;
import E4.G;
import E4.I;
import E4.b0;
import N2.C0293j;
import N2.m;
import N2.n;
import N2.o;
import N2.r;
import c3.C0733a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f7412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7415e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0733a f7417g;
    public C0293j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N f7418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h3.m f7419j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.m f7411a = new w2.m(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7416f = -1;

    @Override // N2.m
    public final void a() {
        h3.m mVar = this.f7419j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f7412b = oVar;
    }

    public final void d() {
        o oVar = this.f7412b;
        oVar.getClass();
        oVar.k();
        this.f7412b.H(new r(-9223372036854775807L));
        this.f7413c = 6;
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        if (j3 == 0) {
            this.f7413c = 0;
            this.f7419j = null;
        } else if (this.f7413c == 5) {
            h3.m mVar = this.f7419j;
            mVar.getClass();
            mVar.e(j3, j7);
        }
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r29, N2.q r30) throws t2.N {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.a.g(N2.n, N2.q):int");
    }

    @Override // N2.m
    public final boolean m(n nVar) throws EOFException, InterruptedIOException {
        C0293j c0293j = (C0293j) nVar;
        w2.m mVar = this.f7411a;
        mVar.D(2);
        c0293j.i(mVar.f18867a, 0, 2, false);
        if (mVar.A() == 65496) {
            mVar.D(2);
            c0293j.i(mVar.f18867a, 0, 2, false);
            int iA = mVar.A();
            this.f7414d = iA;
            if (iA == 65504) {
                mVar.D(2);
                c0293j.i(mVar.f18867a, 0, 2, false);
                c0293j.k(mVar.A() - 2, false);
                mVar.D(2);
                c0293j.i(mVar.f18867a, 0, 2, false);
                this.f7414d = mVar.A();
            }
            if (this.f7414d == 65505) {
                c0293j.k(2, false);
                mVar.D(6);
                c0293j.i(mVar.f18867a, 0, 6, false);
                if (mVar.w() == 1165519206 && mVar.A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
