package S2;

import D4.i;
import E4.G;
import E4.I;
import E4.b0;
import N2.AbstractC0285b;
import N2.B;
import N2.C0293j;
import N2.H;
import N2.J;
import N2.m;
import N2.n;
import N2.o;
import N2.q;
import N2.r;
import N2.s;
import N2.w;
import b3.C0692h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import t2.L;
import t2.N;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f6731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f6732f;
    public L h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f6734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6736k;
    public a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6738n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6727a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.m f6728b = new w2.m(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6729c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f6730d = new q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6733g = 0;

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f6731e = oVar;
        this.f6732f = oVar.E(0, 1);
        oVar.k();
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        if (j3 == 0) {
            this.f6733g = 0;
        } else {
            a aVar = this.l;
            if (aVar != null) {
                aVar.d(j7);
            }
        }
        this.f6738n = j7 != 0 ? -1L : 0L;
        this.f6737m = 0;
        this.f6728b.D(0);
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    @Override // N2.m
    public final int g(n nVar, q qVar) throws N, EOFException, InterruptedIOException {
        s sVar;
        int i7;
        B rVar;
        long j3;
        long j7;
        boolean z6;
        long j8;
        boolean zB;
        boolean z7 = true;
        int i8 = this.f6733g;
        L l = null;
        if (i8 == 0) {
            ((C0293j) nVar).f5056t = 0;
            C0293j c0293j = (C0293j) nVar;
            long j9 = c0293j.j();
            L lA = new w(0).a(c0293j, !this.f6729c ? null : C0692h.f10383b);
            if (lA != null && lA.f16328o.length != 0) {
                l = lA;
            }
            c0293j.g((int) (c0293j.j() - j9));
            this.h = l;
            this.f6733g = 1;
            return 0;
        }
        byte[] bArr = this.f6727a;
        if (i8 == 1) {
            ((C0293j) nVar).i(bArr, 0, bArr.length, false);
            ((C0293j) nVar).f5056t = 0;
            this.f6733g = 2;
            return 0;
        }
        int i9 = 3;
        if (i8 == 2) {
            w2.m mVar = new w2.m(4);
            ((C0293j) nVar).b(mVar.f18867a, 0, 4, false);
            if (mVar.w() != 1716281667) {
                throw N.a(null, "Failed to read FLAC stream marker.");
            }
            this.f6733g = 3;
            return 0;
        }
        if (i8 == 3) {
            ?? r12 = 0;
            s sVar2 = this.f6734i;
            boolean z8 = false;
            while (!z8) {
                ((C0293j) nVar).f5056t = r12;
                byte[] bArr2 = new byte[4];
                J j10 = new J(4, bArr2);
                C0293j c0293j2 = (C0293j) nVar;
                c0293j2.i(bArr2, r12, 4, r12);
                boolean zH = j10.h();
                int i10 = j10.i(i);
                int i11 = j10.i(24) + 4;
                if (i10 == 0) {
                    byte[] bArr3 = new byte[38];
                    c0293j2.b(bArr3, r12, 38, r12);
                    sVar2 = new s(4, bArr3);
                } else {
                    if (sVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i10 == i9) {
                        w2.m mVar2 = new w2.m(i11);
                        c0293j2.b(mVar2.f18867a, 0, i11, false);
                        sVar2 = new s(sVar2.f5071a, sVar2.f5072b, sVar2.f5073c, sVar2.f5074d, sVar2.f5075e, sVar2.f5077g, sVar2.h, sVar2.f5079j, AbstractC0285b.r(mVar2), sVar2.l);
                    } else {
                        L l7 = sVar2.l;
                        if (i10 == 4) {
                            w2.m mVar3 = new w2.m(i11);
                            c0293j2.b(mVar3.f18867a, 0, i11, false);
                            mVar3.H(4);
                            L lP = AbstractC0285b.p(Arrays.asList((String[]) AbstractC0285b.s(mVar3, false, false).f4105p));
                            if (l7 != null) {
                                lP = l7.c(lP);
                            }
                            sVar = new s(sVar2.f5071a, sVar2.f5072b, sVar2.f5073c, sVar2.f5074d, sVar2.f5075e, sVar2.f5077g, sVar2.h, sVar2.f5079j, sVar2.f5080k, lP);
                        } else if (i10 == 6) {
                            w2.m mVar4 = new w2.m(i11);
                            c0293j2.b(mVar4.f18867a, 0, i11, false);
                            mVar4.H(4);
                            L l8 = new L(I.t(Z2.a.a(mVar4)));
                            if (l7 != null) {
                                l8 = l7.c(l8);
                            }
                            sVar = new s(sVar2.f5071a, sVar2.f5072b, sVar2.f5073c, sVar2.f5074d, sVar2.f5075e, sVar2.f5077g, sVar2.h, sVar2.f5079j, sVar2.f5080k, l8);
                        } else {
                            c0293j2.g(i11);
                        }
                        sVar2 = sVar;
                    }
                }
                int i12 = t.f18881a;
                this.f6734i = sVar2;
                z8 = zH;
                r12 = 0;
                i9 = 3;
                i = 7;
            }
            this.f6734i.getClass();
            this.f6735j = Math.max(this.f6734i.f5073c, 6);
            H h = this.f6732f;
            int i13 = t.f18881a;
            h.e(this.f6734i.c(bArr, this.h));
            this.f6733g = 4;
            return 0;
        }
        long j11 = 0;
        if (i8 == 4) {
            ((C0293j) nVar).f5056t = 0;
            w2.m mVar5 = new w2.m(2);
            C0293j c0293j3 = (C0293j) nVar;
            c0293j3.i(mVar5.f18867a, 0, 2, false);
            int iA = mVar5.A();
            if ((iA >> 2) != 16382) {
                c0293j3.f5056t = 0;
                throw N.a(null, "First frame does not start with sync code.");
            }
            c0293j3.f5056t = 0;
            this.f6736k = iA;
            o oVar = this.f6731e;
            int i14 = t.f18881a;
            long j12 = c0293j3.f5054r;
            this.f6734i.getClass();
            s sVar3 = this.f6734i;
            if (sVar3.f5080k != null) {
                rVar = new r(0, j12, sVar3);
                i7 = 0;
            } else {
                long j13 = c0293j3.f5053q;
                if (j13 == -1 || sVar3.f5079j <= 0) {
                    i7 = 0;
                    rVar = new r(sVar3.b());
                } else {
                    int i15 = this.f6736k;
                    A2.I i16 = new A2.I(13, sVar3);
                    i iVar = new i(sVar3, i15);
                    long jB = sVar3.b();
                    int i17 = sVar3.f5073c;
                    int i18 = sVar3.f5074d;
                    if (i18 > 0) {
                        i7 = 0;
                        j3 = j12;
                        j7 = ((((long) i18) + ((long) i17)) / 2) + 1;
                    } else {
                        i7 = 0;
                        j3 = j12;
                        int i19 = sVar3.f5072b;
                        int i20 = sVar3.f5071a;
                        j7 = 64 + (((((i20 != i19 || i20 <= 0) ? 4096L : i20) * ((long) sVar3.f5077g)) * ((long) sVar3.h)) / 8);
                    }
                    a aVar = new a(i16, iVar, jB, sVar3.f5079j, j3, j13, j7, Math.max(6, i17));
                    this.l = aVar;
                    rVar = aVar.f6723a;
                }
            }
            oVar.H(rVar);
            this.f6733g = 5;
            return i7;
        }
        if (i8 != 5) {
            throw new IllegalStateException();
        }
        this.f6732f.getClass();
        this.f6734i.getClass();
        a aVar2 = this.l;
        if (aVar2 != null && aVar2.f6725c != null) {
            return aVar2.b((C0293j) nVar, qVar);
        }
        if (this.f6738n == -1) {
            s sVar4 = this.f6734i;
            ((C0293j) nVar).f5056t = 0;
            C0293j c0293j4 = (C0293j) nVar;
            c0293j4.k(1, false);
            byte[] bArr4 = new byte[1];
            c0293j4.i(bArr4, 0, 1, false);
            boolean z9 = (bArr4[0] & 1) == 1;
            c0293j4.k(2, false);
            i = z9 ? 7 : 6;
            w2.m mVar6 = new w2.m(i);
            byte[] bArr5 = mVar6.f18867a;
            int i21 = 0;
            while (i21 < i) {
                int iQ = c0293j4.q(bArr5, i21, i - i21);
                if (iQ == -1) {
                    break;
                }
                i21 += iQ;
            }
            mVar6.F(i21);
            c0293j4.f5056t = 0;
            try {
                long jB2 = mVar6.B();
                if (!z9) {
                    jB2 *= (long) sVar4.f5072b;
                }
                j11 = jB2;
            } catch (NumberFormatException unused) {
                z7 = false;
            }
            if (!z7) {
                throw N.a(null, null);
            }
            this.f6738n = j11;
        } else {
            w2.m mVar7 = this.f6728b;
            int i22 = mVar7.f18869c;
            if (i22 < 32768) {
                int iN = ((C0293j) nVar).n(mVar7.f18867a, i22, 32768 - i22);
                z6 = iN == -1;
                if (!z6) {
                    mVar7.F(i22 + iN);
                } else if (mVar7.a() == 0) {
                    long j14 = this.f6738n * 1000000;
                    s sVar5 = this.f6734i;
                    int i23 = t.f18881a;
                    this.f6732f.f(j14 / ((long) sVar5.f5075e), 1, this.f6737m, 0, null);
                    return -1;
                }
            } else {
                z6 = false;
            }
            int i24 = mVar7.f18868b;
            int i25 = this.f6737m;
            int i26 = this.f6735j;
            if (i25 < i26) {
                mVar7.H(Math.min(i26 - i25, mVar7.a()));
            }
            this.f6734i.getClass();
            int i27 = mVar7.f18868b;
            while (true) {
                int i28 = mVar7.f18869c - 16;
                q qVar2 = this.f6730d;
                if (i27 <= i28) {
                    mVar7.G(i27);
                    if (AbstractC0285b.b(mVar7, this.f6734i, this.f6736k, qVar2)) {
                        mVar7.G(i27);
                        j8 = qVar2.f5067a;
                        break;
                    }
                    i27++;
                } else {
                    if (z6) {
                        while (true) {
                            int i29 = mVar7.f18869c;
                            if (i27 > i29 - this.f6735j) {
                                mVar7.G(i29);
                                break;
                            }
                            mVar7.G(i27);
                            try {
                                zB = AbstractC0285b.b(mVar7, this.f6734i, this.f6736k, qVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zB = false;
                            }
                            if (mVar7.f18868b > mVar7.f18869c) {
                                zB = false;
                            }
                            if (zB) {
                                mVar7.G(i27);
                                j8 = qVar2.f5067a;
                                break;
                            }
                            i27++;
                        }
                    } else {
                        mVar7.G(i27);
                    }
                    j8 = -1;
                }
            }
            int i30 = mVar7.f18868b - i24;
            mVar7.G(i24);
            this.f6732f.c(i30, mVar7);
            int i31 = this.f6737m + i30;
            this.f6737m = i31;
            if (j8 != -1) {
                long j15 = this.f6738n * 1000000;
                s sVar6 = this.f6734i;
                int i32 = t.f18881a;
                this.f6732f.f(j15 / ((long) sVar6.f5075e), 1, i31, 0, null);
                this.f6737m = 0;
                this.f6738n = j8;
            }
            if (mVar7.a() < 16) {
                int iA2 = mVar7.a();
                byte[] bArr6 = mVar7.f18867a;
                System.arraycopy(bArr6, mVar7.f18868b, bArr6, 0, iA2);
                mVar7.G(0);
                mVar7.F(iA2);
            }
        }
        return 0;
    }

    @Override // N2.m
    public final boolean m(n nVar) {
        C0293j c0293j = (C0293j) nVar;
        L lA = new w(0).a(c0293j, C0692h.f10383b);
        if (lA != null) {
            int length = lA.f16328o.length;
        }
        w2.m mVar = new w2.m(4);
        c0293j.i(mVar.f18867a, 0, 4, false);
        return mVar.w() == 1716281667;
    }

    @Override // N2.m
    public final void a() {
    }
}
