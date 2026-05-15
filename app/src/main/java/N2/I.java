package N2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4979a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4985g;

    public final void a(H h, G g6) {
        if (this.f4981c > 0) {
            h.f(this.f4982d, this.f4983e, this.f4984f, this.f4985g, g6);
            this.f4981c = 0;
        }
    }

    public final void b(H h, long j3, int i7, int i8, int i9, G g6) {
        AbstractC1697a.h("TrueHD chunk samples must be contiguous in the sample queue.", this.f4985g <= i8 + i9);
        if (this.f4980b) {
            int i10 = this.f4981c;
            int i11 = i10 + 1;
            this.f4981c = i11;
            if (i10 == 0) {
                this.f4982d = j3;
                this.f4983e = i7;
                this.f4984f = 0;
            }
            this.f4984f += i8;
            this.f4985g = i9;
            if (i11 >= 16) {
                a(h, g6);
            }
        }
    }

    public final void c(n nVar) {
        if (this.f4980b) {
            return;
        }
        byte[] bArr = this.f4979a;
        int i7 = 0;
        nVar.l(bArr, 0, 10);
        nVar.f();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b7 = bArr[7];
            if ((b7 & 254) == 186) {
                i7 = 40 << ((bArr[(b7 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i7 == 0) {
            return;
        }
        this.f4980b = true;
    }
}
