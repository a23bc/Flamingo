package t3;

import E4.G;
import E4.I;
import E4.b0;
import N2.C0293j;
import N2.J;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: t3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1502b implements N2.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f16816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f16817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public N2.o f16818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16819f;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16821i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1503c f16814a = new C1503c(0, null, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.m f16815b = new w2.m(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16820g = -1;

    public C1502b() {
        w2.m mVar = new w2.m(10);
        this.f16816c = mVar;
        byte[] bArr = mVar.f18867a;
        this.f16817d = new J(bArr.length, bArr);
    }

    @Override // N2.m
    public final N2.m b() {
        return this;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        this.f16818e = oVar;
        this.f16814a.e(oVar, new C1500D(0, 1));
        oVar.k();
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        this.h = false;
        this.f16814a.a();
        this.f16819f = j7;
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    @Override // N2.m
    public final int g(N2.n nVar, N2.q qVar) throws N, EOFException, InterruptedIOException {
        AbstractC1697a.j(this.f16818e);
        long j3 = ((C0293j) nVar).f5053q;
        w2.m mVar = this.f16815b;
        int iN = ((C0293j) nVar).n(mVar.f18867a, 0, 2048);
        boolean z6 = iN == -1;
        if (!this.f16821i) {
            this.f16818e.H(new N2.r(-9223372036854775807L));
            this.f16821i = true;
        }
        if (z6) {
            return -1;
        }
        mVar.G(0);
        mVar.F(iN);
        boolean z7 = this.h;
        C1503c c1503c = this.f16814a;
        if (!z7) {
            c1503c.f16840t = this.f16819f;
            this.h = true;
        }
        c1503c.b(mVar);
        return 0;
    }

    @Override // N2.m
    public final boolean m(N2.n nVar) throws EOFException, InterruptedIOException {
        C0293j c0293j = (C0293j) nVar;
        int i7 = 0;
        while (true) {
            w2.m mVar = this.f16816c;
            c0293j.i(mVar.f18867a, 0, 10, false);
            mVar.G(0);
            if (mVar.x() != 4801587) {
                break;
            }
            mVar.H(3);
            int iT = mVar.t();
            i7 += iT + 10;
            c0293j.k(iT, false);
        }
        c0293j.f5056t = 0;
        c0293j.k(i7, false);
        if (this.f16820g == -1) {
            this.f16820g = i7;
        }
        int i8 = i7;
        int i9 = 0;
        int i10 = 0;
        do {
            w2.m mVar2 = this.f16816c;
            c0293j.i(mVar2.f18867a, 0, 2, false);
            mVar2.G(0);
            if ((mVar2.A() & 65526) == 65520) {
                i9++;
                if (i9 >= 4 && i10 > 188) {
                    return true;
                }
                c0293j.i(mVar2.f18867a, 0, 4, false);
                J j3 = this.f16817d;
                j3.q(14);
                int i11 = j3.i(13);
                if (i11 <= 6) {
                    i8++;
                    c0293j.f5056t = 0;
                    c0293j.k(i8, false);
                } else {
                    c0293j.k(i11 - 6, false);
                    i10 += i11;
                }
            } else {
                i8++;
                c0293j.f5056t = 0;
                c0293j.k(i8, false);
            }
            i9 = 0;
            i10 = 0;
        } while (i8 - i7 < 8192);
        return false;
    }

    @Override // N2.m
    public final void a() {
    }
}
