package N2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f5105g;

    public boolean a(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!((i7 & (-2097152)) == -2097152) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.f5099a = i8;
        this.f5105g = AbstractC0285b.f5011s[3 - i9];
        int i12 = AbstractC0285b.f5012t[i11];
        this.f5101c = i12;
        if (i8 == 2) {
            this.f5101c = i12 / 2;
        } else if (i8 == 0) {
            this.f5101c = i12 / 4;
        }
        int i13 = (i7 >>> 9) & 1;
        int i14 = 1152;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalArgumentException();
                }
                i14 = 384;
            }
        } else if (i8 != 3) {
            i14 = 576;
        }
        this.f5104f = i14;
        if (i9 == 3) {
            int i15 = i8 == 3 ? AbstractC0285b.f5013u[i10 - 1] : AbstractC0285b.f5014v[i10 - 1];
            this.f5103e = i15;
            this.f5100b = (((i15 * 12) / this.f5101c) + i13) * 4;
        } else {
            if (i8 == 3) {
                int i16 = i9 == 2 ? AbstractC0285b.f5015w[i10 - 1] : AbstractC0285b.f5016x[i10 - 1];
                this.f5103e = i16;
                this.f5100b = ((i16 * 144) / this.f5101c) + i13;
            } else {
                int i17 = AbstractC0285b.f5017y[i10 - 1];
                this.f5103e = i17;
                this.f5100b = (((i9 == 1 ? 72 : 144) * i17) / this.f5101c) + i13;
            }
        }
        this.f5102d = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
