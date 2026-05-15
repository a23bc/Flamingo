package i3;

import E4.G;
import E4.I;
import E4.b0;
import N2.AbstractC0285b;
import N2.C0293j;
import N2.m;
import N2.n;
import N2.o;
import N2.r;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import t2.N;
import t3.C1500D;
import t3.C1501a;
import w2.t;

/* JADX INFO: renamed from: i3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1083d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13467d;

    public C1083d(int i7) {
        this.f13464a = i7;
        switch (i7) {
            case 1:
                this.f13466c = new C1501a();
                this.f13467d = new w2.m(2786);
                break;
            case 2:
                this.f13466c = new C1501a(null, 0, 1);
                this.f13467d = new w2.m(16384);
                break;
        }
    }

    @Override // N2.m
    public final void a() {
        int i7 = this.f13464a;
    }

    @Override // N2.m
    public final m b() {
        int i7 = this.f13464a;
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        switch (this.f13464a) {
            case 0:
                this.f13466c = oVar;
                break;
            case 1:
                ((C1501a) this.f13466c).e(oVar, new C1500D(0, 1));
                oVar.k();
                oVar.H(new r(-9223372036854775807L));
                break;
            default:
                ((C1501a) this.f13466c).e(oVar, new C1500D(0, 1));
                oVar.k();
                oVar.H(new r(-9223372036854775807L));
                break;
        }
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        switch (this.f13464a) {
            case 0:
                i iVar = (i) this.f13467d;
                if (iVar != null) {
                    C1084e c1084e = iVar.f13483a;
                    C1085f c1085f = c1084e.f13468a;
                    c1085f.f13473a = 0;
                    c1085f.f13474b = 0L;
                    c1085f.f13475c = 0;
                    c1085f.f13476d = 0;
                    c1085f.f13477e = 0;
                    c1084e.f13469b.D(0);
                    c1084e.f13470c = -1;
                    c1084e.f13472e = false;
                    if (j3 == 0) {
                        iVar.d(!iVar.l);
                    } else if (iVar.h != 0) {
                        long j8 = (((long) iVar.f13490i) * j7) / 1000000;
                        iVar.f13487e = j8;
                        g gVar = iVar.f13486d;
                        int i7 = t.f18881a;
                        gVar.h(j8);
                        iVar.h = 2;
                    }
                }
                break;
            case 1:
                this.f13465b = false;
                ((C1501a) this.f13466c).a();
                break;
            default:
                this.f13465b = false;
                ((C1501a) this.f13466c).a();
                break;
        }
    }

    @Override // N2.m
    public final List f() {
        switch (this.f13464a) {
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

    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5  */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r21, N2.q r22) throws t2.N, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C1083d.g(N2.n, N2.q):int");
    }

    public boolean j(C0293j c0293j) {
        boolean zT;
        C1085f c1085f = new C1085f();
        if (c1085f.a(c0293j, true) && (c1085f.f13473a & 2) == 2) {
            int iMin = Math.min(c1085f.f13477e, 8);
            w2.m mVar = new w2.m(iMin);
            c0293j.i(mVar.f18867a, 0, iMin, false);
            mVar.G(0);
            if (mVar.a() >= 5 && mVar.u() == 127 && mVar.w() == 1179402563) {
                this.f13467d = new C1082c();
                return true;
            }
            mVar.G(0);
            try {
                zT = AbstractC0285b.t(1, mVar, true);
            } catch (N unused) {
                zT = false;
            }
            if (zT) {
                this.f13467d = new k();
            } else {
                mVar.G(0);
                if (h.e(mVar, h.f13480o)) {
                    this.f13467d = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // N2.m
    public final boolean m(n nVar) throws EOFException, InterruptedIOException {
        int iF;
        int i7;
        switch (this.f13464a) {
            case 0:
                try {
                }
                break;
            case 1:
                w2.m mVar = new w2.m(10);
                int i8 = 0;
                while (true) {
                    C0293j c0293j = (C0293j) nVar;
                    c0293j.i(mVar.f18867a, 0, 10, false);
                    mVar.G(0);
                    if (mVar.x() != 4801587) {
                        c0293j.f5056t = 0;
                        c0293j.k(i8, false);
                        int i9 = 0;
                        int i10 = i8;
                        while (true) {
                            c0293j.i(mVar.f18867a, 0, 6, false);
                            mVar.G(0);
                            if (mVar.A() != 2935) {
                                c0293j.f5056t = 0;
                                i10++;
                                if (i10 - i8 < 8192) {
                                    c0293j.k(i10, false);
                                    i9 = 0;
                                }
                            } else {
                                i9++;
                                if (i9 < 4) {
                                    byte[] bArr = mVar.f18867a;
                                    if (bArr.length < 6) {
                                        iF = -1;
                                    } else if (((bArr[5] & 248) >> 3) > 10) {
                                        iF = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                                    } else {
                                        byte b7 = bArr[4];
                                        iF = AbstractC0285b.f((b7 & 192) >> 6, b7 & 63);
                                    }
                                    if (iF != -1) {
                                        c0293j.k(iF - 6, false);
                                    }
                                }
                            }
                        }
                    } else {
                        mVar.H(3);
                        int iT = mVar.t();
                        i8 += iT + 10;
                        c0293j.k(iT, false);
                    }
                    break;
                }
                break;
            default:
                w2.m mVar2 = new w2.m(10);
                int i11 = 0;
                while (true) {
                    C0293j c0293j2 = (C0293j) nVar;
                    c0293j2.i(mVar2.f18867a, 0, 10, false);
                    mVar2.G(0);
                    if (mVar2.x() != 4801587) {
                        c0293j2.f5056t = 0;
                        c0293j2.k(i11, false);
                        int i12 = 0;
                        int i13 = i11;
                        while (true) {
                            int i14 = 7;
                            c0293j2.i(mVar2.f18867a, 0, 7, false);
                            mVar2.G(0);
                            int iA = mVar2.A();
                            if (iA == 44096 || iA == 44097) {
                                i12++;
                                if (i12 < 4) {
                                    byte[] bArr2 = mVar2.f18867a;
                                    if (bArr2.length < 7) {
                                        i7 = -1;
                                    } else {
                                        int i15 = ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
                                        if (i15 == 65535) {
                                            i15 = ((bArr2[4] & 255) << 16) | ((bArr2[5] & 255) << 8) | (bArr2[6] & 255);
                                        } else {
                                            i14 = 4;
                                        }
                                        if (iA == 44097) {
                                            i14 += 2;
                                        }
                                        i7 = i15 + i14;
                                    }
                                    if (i7 != -1) {
                                        c0293j2.k(i7 - 7, false);
                                    }
                                }
                            } else {
                                c0293j2.f5056t = 0;
                                i13++;
                                if (i13 - i11 < 8192) {
                                    c0293j2.k(i13, false);
                                    i12 = 0;
                                }
                            }
                        }
                    } else {
                        mVar2.H(3);
                        int iT2 = mVar2.t();
                        i11 += iT2 + 10;
                        c0293j2.k(iT2, false);
                    }
                    break;
                }
                break;
        }
        return true;
    }

    private final void d() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
