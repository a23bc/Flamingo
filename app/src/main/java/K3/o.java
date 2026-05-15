package k3;

import N2.G;
import N2.H;
import java.io.EOFException;
import t2.C1486o;
import t2.C1487p;
import t2.InterfaceC1481j;
import t2.M;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class o implements H {

    /* JADX INFO: renamed from: a */
    public final H f14050a;

    /* JADX INFO: renamed from: b */
    public final k f14051b;

    /* JADX INFO: renamed from: g */
    public m f14056g;
    public C1487p h;

    /* JADX INFO: renamed from: d */
    public int f14053d = 0;

    /* JADX INFO: renamed from: e */
    public int f14054e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f14055f = t.f18886f;

    /* JADX INFO: renamed from: c */
    public final w2.m f14052c = new w2.m();

    public o(H h, k kVar) {
        this.f14050a = h;
        this.f14051b = kVar;
    }

    @Override // N2.H
    public final int a(InterfaceC1481j interfaceC1481j, int i7, boolean z6) {
        return b(interfaceC1481j, i7, z6);
    }

    @Override // N2.H
    public final int b(InterfaceC1481j interfaceC1481j, int i7, boolean z6) throws EOFException {
        if (this.f14056g == null) {
            return this.f14050a.b(interfaceC1481j, i7, z6);
        }
        g(i7);
        int iN = interfaceC1481j.n(this.f14055f, this.f14054e, i7);
        if (iN != -1) {
            this.f14054e += iN;
            return iN;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // N2.H
    public final void c(int i7, w2.m mVar) {
        d(mVar, i7, 0);
    }

    @Override // N2.H
    public final void d(w2.m mVar, int i7, int i8) {
        if (this.f14056g == null) {
            this.f14050a.d(mVar, i7, i8);
            return;
        }
        g(i7);
        mVar.e(this.f14055f, this.f14054e, i7);
        this.f14054e += i7;
    }

    @Override // N2.H
    public final void e(C1487p c1487p) {
        c1487p.f16701m.getClass();
        String str = c1487p.f16701m;
        AbstractC1697a.d(M.e(str) == 3);
        boolean zEquals = c1487p.equals(this.h);
        k kVar = this.f14051b;
        if (!zEquals) {
            this.h = c1487p;
            this.f14056g = kVar.g(c1487p) ? kVar.d(c1487p) : null;
        }
        m mVar = this.f14056g;
        H h = this.f14050a;
        if (mVar == null) {
            h.e(c1487p);
            return;
        }
        C1486o c1486oA = c1487p.a();
        c1486oA.l = M.j("application/x-media3-cues");
        c1486oA.f16624i = str;
        c1486oA.f16631q = Long.MAX_VALUE;
        c1486oA.f16613F = kVar.c(c1487p);
        h.e(new C1487p(c1486oA));
    }

    @Override // N2.H
    public final void f(long j3, int i7, int i8, int i9, G g6) {
        if (this.f14056g == null) {
            this.f14050a.f(j3, i7, i8, i9, g6);
            return;
        }
        AbstractC1697a.c("DRM on subtitles is not supported", g6 == null);
        int i10 = (this.f14054e - i9) - i8;
        this.f14056g.l(this.f14055f, i10, i8, l.f14044c, new B2.f(this, j3, i7));
        int i11 = i10 + i8;
        this.f14053d = i11;
        if (i11 == this.f14054e) {
            this.f14053d = 0;
            this.f14054e = 0;
        }
    }

    public final void g(int i7) {
        int length = this.f14055f.length;
        int i8 = this.f14054e;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.f14053d;
        int iMax = Math.max(i9 * 2, i7 + i9);
        byte[] bArr = this.f14055f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f14053d, bArr2, 0, i9);
        this.f14053d = 0;
        this.f14054e = i9;
        this.f14055f = bArr2;
    }
}
