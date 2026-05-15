package t3;

import N2.AbstractC0285b;
import N2.C0284a;
import N2.H;
import N2.J;
import java.util.Collections;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class q implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f16976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f16977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H f16978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1487p f16980g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16983k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f16989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f16993v;

    public q(String str, int i7) {
        this.f16974a = str;
        this.f16975b = i7;
        w2.m mVar = new w2.m(1024);
        this.f16976c = mVar;
        byte[] bArr = mVar.f18867a;
        this.f16977d = new J(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override // t3.f
    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.f16984m = false;
    }

    @Override // t3.f
    public final void b(w2.m mVar) throws N {
        int i7;
        boolean zH;
        AbstractC1697a.j(this.f16978e);
        while (mVar.a() > 0) {
            int i8 = this.h;
            if (i8 != 0) {
                if (i8 != 1) {
                    w2.m mVar2 = this.f16976c;
                    J j3 = this.f16977d;
                    if (i8 == 2) {
                        int iU = ((this.f16983k & (-225)) << 8) | mVar.u();
                        this.f16982j = iU;
                        if (iU > mVar2.f18867a.length) {
                            mVar2.D(iU);
                            byte[] bArr = mVar2.f18867a;
                            j3.getClass();
                            j3.o(bArr.length, bArr);
                        }
                        this.f16981i = 0;
                        this.h = 3;
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(mVar.a(), this.f16982j - this.f16981i);
                        mVar.e(j3.f4989d, this.f16981i, iMin);
                        int i9 = this.f16981i + iMin;
                        this.f16981i = i9;
                        if (i9 == this.f16982j) {
                            j3.q(0);
                            if (j3.h()) {
                                if (this.f16984m) {
                                }
                                this.h = 0;
                            } else {
                                this.f16984m = true;
                                int i10 = j3.i(1);
                                int i11 = i10 == 1 ? j3.i(1) : 0;
                                this.f16985n = i11;
                                if (i11 != 0) {
                                    throw N.a(null, null);
                                }
                                if (i10 == 1) {
                                    j3.i((j3.i(2) + 1) * 8);
                                }
                                if (!j3.h()) {
                                    throw N.a(null, null);
                                }
                                this.f16986o = j3.i(6);
                                int i12 = j3.i(4);
                                int i13 = j3.i(3);
                                if (i12 != 0 || i13 != 0) {
                                    throw N.a(null, null);
                                }
                                if (i10 == 0) {
                                    int iG = j3.g();
                                    int iB = j3.b();
                                    C0284a c0284aN = AbstractC0285b.n(j3, true);
                                    this.f16993v = c0284aN.f4992a;
                                    this.f16990s = c0284aN.f4993b;
                                    this.f16992u = c0284aN.f4994c;
                                    int iB2 = iB - j3.b();
                                    j3.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    j3.j(iB2, bArr2);
                                    C1486o c1486o = new C1486o();
                                    c1486o.f16617a = this.f16979f;
                                    c1486o.l = M.j("audio/mp4a-latm");
                                    c1486o.f16624i = this.f16993v;
                                    c1486o.f16640z = this.f16992u;
                                    c1486o.f16608A = this.f16990s;
                                    c1486o.f16629o = Collections.singletonList(bArr2);
                                    c1486o.f16620d = this.f16974a;
                                    c1486o.f16622f = this.f16975b;
                                    C1487p c1487p = new C1487p(c1486o);
                                    if (!c1487p.equals(this.f16980g)) {
                                        this.f16980g = c1487p;
                                        this.f16991t = 1024000000 / ((long) c1487p.f16681B);
                                        this.f16978e.e(c1487p);
                                    }
                                } else {
                                    int iB3 = j3.b();
                                    C0284a c0284aN2 = AbstractC0285b.n(j3, true);
                                    this.f16993v = c0284aN2.f4992a;
                                    this.f16990s = c0284aN2.f4993b;
                                    this.f16992u = c0284aN2.f4994c;
                                    j3.t(j3.i((j3.i(2) + 1) * 8) - (iB3 - j3.b()));
                                }
                                int i14 = j3.i(3);
                                this.f16987p = i14;
                                if (i14 == 0) {
                                    j3.t(8);
                                } else if (i14 == 1) {
                                    j3.t(9);
                                } else if (i14 == 3 || i14 == 4 || i14 == 5) {
                                    j3.t(6);
                                } else {
                                    if (i14 != 6 && i14 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    j3.t(1);
                                }
                                boolean zH2 = j3.h();
                                this.f16988q = zH2;
                                this.f16989r = 0L;
                                if (zH2) {
                                    if (i10 == 1) {
                                        this.f16989r = j3.i((j3.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = j3.h();
                                            this.f16989r = (this.f16989r << 8) + ((long) j3.i(8));
                                        } while (zH);
                                    }
                                }
                                if (j3.h()) {
                                    j3.t(8);
                                }
                            }
                            if (this.f16985n != 0) {
                                throw N.a(null, null);
                            }
                            if (this.f16986o != 0) {
                                throw N.a(null, null);
                            }
                            if (this.f16987p != 0) {
                                throw N.a(null, null);
                            }
                            int i15 = 0;
                            do {
                                i7 = j3.i(8);
                                i15 += i7;
                            } while (i7 == 255);
                            int iG2 = j3.g();
                            if ((iG2 & 7) == 0) {
                                mVar2.G(iG2 >> 3);
                            } else {
                                j3.j(i15 * 8, mVar2.f18867a);
                                mVar2.G(0);
                            }
                            this.f16978e.c(i15, mVar2);
                            AbstractC1697a.i(this.l != -9223372036854775807L);
                            this.f16978e.f(this.l, 1, i15, 0, null);
                            this.l += this.f16991t;
                            if (this.f16988q) {
                                j3.t((int) this.f16989r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = mVar.u();
                    if ((iU2 & 224) == 224) {
                        this.f16983k = iU2;
                        this.h = 2;
                    } else if (iU2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (mVar.u() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.l = j3;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f16978e = oVar.E(c1500d.f16800d, 1);
        c1500d.b();
        this.f16979f = c1500d.f16801e;
    }

    @Override // t3.f
    public final void c(boolean z6) {
    }
}
