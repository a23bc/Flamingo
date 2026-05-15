package h3;

import N2.H;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f12583a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f12586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f12587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12589g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12590i;
    public boolean l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f12584b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f12585c = new w2.m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w2.m f12591j = new w2.m(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w2.m f12592k = new w2.m();

    public i(H h, t tVar, g gVar) {
        this.f12583a = h;
        this.f12586d = tVar;
        this.f12587e = gVar;
        this.f12586d = tVar;
        this.f12587e = gVar;
        h.e(tVar.f12697a.f12672f);
        d();
    }

    public final r a() {
        if (!this.l) {
            return null;
        }
        s sVar = this.f12584b;
        g gVar = sVar.f12682a;
        int i7 = w2.t.f18881a;
        int i8 = gVar.f12576a;
        r rVar = sVar.f12692m;
        if (rVar == null) {
            rVar = this.f12586d.f12697a.f12676k[i8];
        }
        if (rVar == null || !rVar.f12677a) {
            return null;
        }
        return rVar;
    }

    public final boolean b() {
        this.f12588f++;
        if (!this.l) {
            return false;
        }
        int i7 = this.f12589g + 1;
        this.f12589g = i7;
        int[] iArr = this.f12584b.f12688g;
        int i8 = this.h;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.h = i8 + 1;
        this.f12589g = 0;
        return false;
    }

    public final int c(int i7, int i8) {
        w2.m mVar;
        r rVarA = a();
        if (rVarA == null) {
            return 0;
        }
        s sVar = this.f12584b;
        int length = rVarA.f12680d;
        if (length != 0) {
            mVar = sVar.f12693n;
        } else {
            int i9 = w2.t.f18881a;
            byte[] bArr = rVarA.f12681e;
            int length2 = bArr.length;
            w2.m mVar2 = this.f12592k;
            mVar2.E(length2, bArr);
            length = bArr.length;
            mVar = mVar2;
        }
        boolean z6 = sVar.f12691k && sVar.l[this.f12588f];
        boolean z7 = z6 || i8 != 0;
        w2.m mVar3 = this.f12591j;
        mVar3.f18867a[0] = (byte) ((z7 ? 128 : 0) | length);
        mVar3.G(0);
        H h = this.f12583a;
        h.d(mVar3, 1, 1);
        h.d(mVar, length, 1);
        if (!z7) {
            return length + 1;
        }
        w2.m mVar4 = this.f12585c;
        if (!z6) {
            mVar4.D(8);
            byte[] bArr2 = mVar4.f18867a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i8 & 255);
            bArr2[4] = (byte) ((i7 >> 24) & 255);
            bArr2[5] = (byte) ((i7 >> 16) & 255);
            bArr2[6] = (byte) ((i7 >> 8) & 255);
            bArr2[7] = (byte) (i7 & 255);
            h.d(mVar4, 8, 1);
            return length + 9;
        }
        w2.m mVar5 = sVar.f12693n;
        int iA = mVar5.A();
        mVar5.H(-2);
        int i10 = (iA * 6) + 2;
        if (i8 != 0) {
            mVar4.D(i10);
            byte[] bArr3 = mVar4.f18867a;
            mVar5.e(bArr3, 0, i10);
            int i11 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i8;
            bArr3[2] = (byte) ((i11 >> 8) & 255);
            bArr3[3] = (byte) (i11 & 255);
        } else {
            mVar4 = mVar5;
        }
        h.d(mVar4, i10, 1);
        return length + 1 + i10;
    }

    public final void d() {
        s sVar = this.f12584b;
        sVar.f12685d = 0;
        sVar.f12695p = 0L;
        sVar.f12696q = false;
        sVar.f12691k = false;
        sVar.f12694o = false;
        sVar.f12692m = null;
        this.f12588f = 0;
        this.h = 0;
        this.f12589g = 0;
        this.f12590i = 0;
        this.l = false;
    }
}
