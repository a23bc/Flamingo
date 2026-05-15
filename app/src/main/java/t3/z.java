package t3;

/* JADX INFO: loaded from: classes.dex */
public final class z implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f17062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.m f17063b = new w2.m(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17067f;

    public z(y yVar) {
        this.f17062a = yVar;
    }

    @Override // t3.E
    public final void a() {
        this.f17067f = true;
    }

    @Override // t3.E
    public final void b(int i7, w2.m mVar) {
        boolean z6 = (i7 & 1) != 0;
        int iU = z6 ? mVar.f18868b + mVar.u() : -1;
        if (this.f17067f) {
            if (!z6) {
                return;
            }
            this.f17067f = false;
            mVar.G(iU);
            this.f17065d = 0;
        }
        while (mVar.a() > 0) {
            int i8 = this.f17065d;
            w2.m mVar2 = this.f17063b;
            if (i8 < 3) {
                if (i8 == 0) {
                    int iU2 = mVar.u();
                    mVar.G(mVar.f18868b - 1);
                    if (iU2 == 255) {
                        this.f17067f = true;
                        return;
                    }
                }
                int iMin = Math.min(mVar.a(), 3 - this.f17065d);
                mVar.e(mVar2.f18867a, this.f17065d, iMin);
                int i9 = this.f17065d + iMin;
                this.f17065d = i9;
                if (i9 == 3) {
                    mVar2.G(0);
                    mVar2.F(3);
                    mVar2.H(1);
                    int iU3 = mVar2.u();
                    int iU4 = mVar2.u();
                    this.f17066e = (iU3 & 128) != 0;
                    int i10 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f17064c = i10;
                    byte[] bArr = mVar2.f18867a;
                    if (bArr.length < i10) {
                        mVar2.b(Math.min(4098, Math.max(i10, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(mVar.a(), this.f17064c - this.f17065d);
                mVar.e(mVar2.f18867a, this.f17065d, iMin2);
                int i11 = this.f17065d + iMin2;
                this.f17065d = i11;
                int i12 = this.f17064c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f17066e) {
                        mVar2.F(i12);
                    } else {
                        if (w2.t.i(0, i12, -1, mVar2.f18867a) != 0) {
                            this.f17067f = true;
                            return;
                        }
                        mVar2.F(this.f17064c - 4);
                    }
                    mVar2.G(0);
                    this.f17062a.b(mVar2);
                    this.f17065d = 0;
                }
            }
        }
    }

    @Override // t3.E
    public final void c(w2.r rVar, N2.o oVar, C1500D c1500d) {
        this.f17062a.c(rVar, oVar, c1500d);
        this.f17067f = true;
    }
}
