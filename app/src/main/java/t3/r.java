package t3;

import N2.H;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class r implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.m f16994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N2.y f16995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H f16998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17000g = 0;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17003k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17004m;

    public r(String str, int i7) {
        w2.m mVar = new w2.m(4);
        this.f16994a = mVar;
        mVar.f18867a[0] = -1;
        this.f16995b = new N2.y();
        this.f17004m = -9223372036854775807L;
        this.f16996c = str;
        this.f16997d = i7;
    }

    @Override // t3.f
    public final void a() {
        this.f17000g = 0;
        this.h = 0;
        this.f17002j = false;
        this.f17004m = -9223372036854775807L;
    }

    @Override // t3.f
    public final void b(w2.m mVar) {
        AbstractC1697a.j(this.f16998e);
        while (mVar.a() > 0) {
            int i7 = this.f17000g;
            w2.m mVar2 = this.f16994a;
            if (i7 == 0) {
                byte[] bArr = mVar.f18867a;
                int i8 = mVar.f18868b;
                int i9 = mVar.f18869c;
                while (true) {
                    if (i8 >= i9) {
                        mVar.G(i9);
                        break;
                    }
                    byte b7 = bArr[i8];
                    boolean z6 = (b7 & 255) == 255;
                    boolean z7 = this.f17002j && (b7 & 224) == 224;
                    this.f17002j = z6;
                    if (z7) {
                        mVar.G(i8 + 1);
                        this.f17002j = false;
                        mVar2.f18867a[1] = bArr[i8];
                        this.h = 2;
                        this.f17000g = 1;
                        break;
                    }
                    i8++;
                }
            } else if (i7 == 1) {
                int iMin = Math.min(mVar.a(), 4 - this.h);
                mVar.e(mVar2.f18867a, this.h, iMin);
                int i10 = this.h + iMin;
                this.h = i10;
                if (i10 >= 4) {
                    mVar2.G(0);
                    int iG = mVar2.g();
                    N2.y yVar = this.f16995b;
                    if (yVar.a(iG)) {
                        this.l = yVar.f5100b;
                        if (!this.f17001i) {
                            this.f17003k = (((long) yVar.f5104f) * 1000000) / ((long) yVar.f5101c);
                            C1486o c1486o = new C1486o();
                            c1486o.f16617a = this.f16999f;
                            c1486o.l = M.j((String) yVar.f5105g);
                            c1486o.f16627m = 4096;
                            c1486o.f16640z = yVar.f5102d;
                            c1486o.f16608A = yVar.f5101c;
                            c1486o.f16620d = this.f16996c;
                            c1486o.f16622f = this.f16997d;
                            this.f16998e.e(new C1487p(c1486o));
                            this.f17001i = true;
                        }
                        mVar2.G(0);
                        this.f16998e.c(4, mVar2);
                        this.f17000g = 2;
                    } else {
                        this.h = 0;
                        this.f17000g = 1;
                    }
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(mVar.a(), this.l - this.h);
                this.f16998e.c(iMin2, mVar);
                int i11 = this.h + iMin2;
                this.h = i11;
                if (i11 >= this.l) {
                    AbstractC1697a.i(this.f17004m != -9223372036854775807L);
                    this.f16998e.f(this.f17004m, 1, this.l, 0, null);
                    this.f17004m += this.f17003k;
                    this.h = 0;
                    this.f17000g = 0;
                }
            }
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.f17004m = j3;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f16999f = c1500d.f16801e;
        c1500d.b();
        this.f16998e = oVar.E(c1500d.f16800d, 1);
    }

    @Override // t3.f
    public final void c(boolean z6) {
    }
}
