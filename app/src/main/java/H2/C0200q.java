package H2;

import android.net.Uri;
import java.util.Map;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: H2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0200q implements y2.h {

    /* JADX INFO: renamed from: o */
    public final y2.h f3221o;

    /* JADX INFO: renamed from: p */
    public final int f3222p;

    /* JADX INFO: renamed from: q */
    public final K f3223q;

    /* JADX INFO: renamed from: r */
    public final byte[] f3224r;

    /* JADX INFO: renamed from: s */
    public int f3225s;

    public C0200q(y2.h hVar, int i7, K k7) {
        AbstractC1697a.d(i7 > 0);
        this.f3221o = hVar;
        this.f3222p = i7;
        this.f3223q = k7;
        this.f3224r = new byte[1];
        this.f3225s = i7;
    }

    @Override // y2.h
    public final void a(y2.C c7) {
        c7.getClass();
        this.f3221o.a(c7);
    }

    @Override // y2.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // y2.h
    public final Map d() {
        return this.f3221o.d();
    }

    @Override // y2.h
    public final long e(y2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // y2.h
    public final Uri h() {
        return this.f3221o.h();
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) {
        int i9 = this.f3225s;
        y2.h hVar = this.f3221o;
        if (i9 == 0) {
            byte[] bArr2 = this.f3224r;
            int i10 = 0;
            if (hVar.n(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int iN = hVar.n(bArr3, i10, i12);
                        if (iN != -1) {
                            i10 += iN;
                            i12 -= iN;
                        }
                    }
                    while (i11 > 0 && bArr3[i11 - 1] == 0) {
                        i11--;
                    }
                    if (i11 > 0) {
                        w2.m mVar = new w2.m(i11, bArr3);
                        K k7 = this.f3223q;
                        long jMax = !k7.l ? k7.f3013i : Math.max(k7.f3016m.t(true), k7.f3013i);
                        int iA = mVar.a();
                        N2.H h = k7.f3015k;
                        h.getClass();
                        h.c(iA, mVar);
                        h.f(jMax, 1, iA, 0, null);
                        k7.l = true;
                    }
                }
                this.f3225s = this.f3222p;
            }
            return -1;
        }
        int iN2 = hVar.n(bArr, i7, Math.min(this.f3225s, i8));
        if (iN2 != -1) {
            this.f3225s -= iN2;
        }
        return iN2;
    }
}
