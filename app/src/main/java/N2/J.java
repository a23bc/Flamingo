package N2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f4989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4990e;

    public J() {
        this.f4986a = 2;
        this.f4989d = w2.t.f18886f;
    }

    public void a() {
        int i7;
        int i8;
        switch (this.f4986a) {
            case 2:
                int i9 = this.f4987b;
                AbstractC1697a.i(i9 >= 0 && (i9 < (i7 = this.f4990e) || (i9 == i7 && this.f4988c == 0)));
                break;
            default:
                int i10 = this.f4988c;
                AbstractC1697a.i(i10 >= 0 && (i10 < (i8 = this.f4987b) || (i10 == i8 && this.f4990e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f4990e - this.f4987b) * 8) - this.f4988c;
    }

    public void c() {
        if (this.f4988c == 0) {
            return;
        }
        this.f4988c = 0;
        this.f4987b++;
        a();
    }

    public boolean d(int i7) {
        int i8 = this.f4988c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f4990e + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f4987b) {
                break;
            }
            if (r(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f4987b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public boolean e() {
        int i7 = this.f4988c;
        int i8 = this.f4990e;
        int i9 = 0;
        while (this.f4988c < this.f4987b && !h()) {
            i9++;
        }
        boolean z6 = this.f4988c == this.f4987b;
        this.f4988c = i7;
        this.f4990e = i8;
        return !z6 && d((i9 * 2) + 1);
    }

    public int f() {
        AbstractC1697a.i(this.f4988c == 0);
        return this.f4987b;
    }

    public int g() {
        return (this.f4987b * 8) + this.f4988c;
    }

    public boolean h() {
        switch (this.f4986a) {
            case 0:
                boolean z6 = (((this.f4989d[this.f4988c] & 255) >> this.f4990e) & 1) == 1;
                t(1);
                return z6;
            case 1:
            default:
                boolean z7 = (this.f4989d[this.f4988c] & (128 >> this.f4990e)) != 0;
                s();
                return z7;
            case 2:
                boolean z8 = (this.f4989d[this.f4987b] & (128 >> this.f4988c)) != 0;
                s();
                return z8;
        }
    }

    public int i(int i7) {
        switch (this.f4986a) {
            case 0:
                int i8 = this.f4988c;
                int iMin = Math.min(i7, 8 - this.f4990e);
                int i9 = i8 + 1;
                byte[] bArr = this.f4989d;
                int i10 = ((bArr[i8] & 255) >> this.f4990e) & (255 >> (8 - iMin));
                while (iMin < i7) {
                    i10 |= (bArr[i9] & 255) << iMin;
                    iMin += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i7));
                t(i7);
                return i11;
            case 1:
            default:
                this.f4990e += i7;
                int i12 = 0;
                while (true) {
                    int i13 = this.f4990e;
                    if (i13 <= 8) {
                        byte[] bArr2 = this.f4989d;
                        int i14 = this.f4988c;
                        int i15 = ((-1) >>> (32 - i7)) & (i12 | ((bArr2[i14] & 255) >> (8 - i13)));
                        if (i13 == 8) {
                            this.f4990e = 0;
                            this.f4988c = i14 + (r(i14 + 1) ? 2 : 1);
                        }
                        a();
                        return i15;
                    }
                    int i16 = i13 - 8;
                    this.f4990e = i16;
                    byte[] bArr3 = this.f4989d;
                    int i17 = this.f4988c;
                    i12 |= (bArr3[i17] & 255) << i16;
                    if (!r(i17 + 1)) {
                        i = 1;
                    }
                    this.f4988c = i17 + i;
                }
                break;
            case 2:
                if (i7 == 0) {
                    return 0;
                }
                this.f4988c += i7;
                int i18 = 0;
                while (true) {
                    int i19 = this.f4988c;
                    if (i19 <= 8) {
                        byte[] bArr4 = this.f4989d;
                        int i20 = this.f4987b;
                        int i21 = ((-1) >>> (32 - i7)) & (i18 | ((bArr4[i20] & 255) >> (8 - i19)));
                        if (i19 == 8) {
                            this.f4988c = 0;
                            this.f4987b = i20 + 1;
                        }
                        a();
                        return i21;
                    }
                    int i22 = i19 - 8;
                    this.f4988c = i22;
                    byte[] bArr5 = this.f4989d;
                    int i23 = this.f4987b;
                    this.f4987b = i23 + 1;
                    i18 |= (bArr5[i23] & 255) << i22;
                }
                break;
        }
    }

    public void j(int i7, byte[] bArr) {
        int i8 = i7 >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            byte[] bArr2 = this.f4989d;
            int i10 = this.f4987b;
            int i11 = i10 + 1;
            this.f4987b = i11;
            byte b7 = bArr2[i10];
            int i12 = this.f4988c;
            byte b8 = (byte) (b7 << i12);
            bArr[i9] = b8;
            bArr[i9] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b8);
        }
        int i13 = i7 & 7;
        if (i13 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i8] & (255 >> i13));
        bArr[i8] = b9;
        int i14 = this.f4988c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f4989d;
            int i15 = this.f4987b;
            this.f4987b = i15 + 1;
            bArr[i8] = (byte) (b9 | ((bArr3[i15] & 255) << i14));
            this.f4988c = i14 - 8;
        }
        int i16 = this.f4988c + i13;
        this.f4988c = i16;
        byte[] bArr4 = this.f4989d;
        int i17 = this.f4987b;
        bArr[i8] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i8]);
        if (i16 == 8) {
            this.f4988c = 0;
            this.f4987b = i17 + 1;
        }
        a();
    }

    public long k(int i7) {
        if (i7 <= 32) {
            int i8 = i(i7);
            int i9 = w2.t.f18881a;
            return 4294967295L & ((long) i8);
        }
        int i10 = i(i7 - 32);
        int i11 = i(32);
        int i12 = w2.t.f18881a;
        return (4294967295L & ((long) i11)) | ((((long) i10) & 4294967295L) << 32);
    }

    public void l(int i7, byte[] bArr) {
        AbstractC1697a.i(this.f4988c == 0);
        System.arraycopy(this.f4989d, this.f4987b, bArr, 0, i7);
        this.f4987b += i7;
        a();
    }

    public int m() {
        int i7 = 0;
        while (!h()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? i(i7) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(int i7, byte[] bArr) {
        this.f4989d = bArr;
        this.f4987b = 0;
        this.f4988c = 0;
        this.f4990e = i7;
    }

    public void p(w2.m mVar) {
        o(mVar.f18869c, mVar.f18867a);
        q(mVar.f18868b * 8);
    }

    public void q(int i7) {
        int i8 = i7 / 8;
        this.f4987b = i8;
        this.f4988c = i7 - (i8 * 8);
        a();
    }

    public boolean r(int i7) {
        if (2 > i7 || i7 >= this.f4987b) {
            return false;
        }
        byte[] bArr = this.f4989d;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 - 1] == 0;
    }

    public void s() {
        switch (this.f4986a) {
            case 2:
                int i7 = this.f4988c + 1;
                this.f4988c = i7;
                if (i7 == 8) {
                    this.f4988c = 0;
                    this.f4987b++;
                }
                a();
                break;
            default:
                int i8 = this.f4990e + 1;
                this.f4990e = i8;
                if (i8 == 8) {
                    this.f4990e = 0;
                    int i9 = this.f4988c;
                    this.f4988c = i9 + (r(i9 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i7) {
        int i8;
        switch (this.f4986a) {
            case 0:
                int i9 = i7 / 8;
                int i10 = this.f4988c + i9;
                this.f4988c = i10;
                int i11 = (i7 - (i9 * 8)) + this.f4990e;
                this.f4990e = i11;
                boolean z6 = true;
                if (i11 > 7) {
                    this.f4988c = i10 + 1;
                    this.f4990e = i11 - 8;
                }
                int i12 = this.f4988c;
                if (i12 < 0 || (i12 >= (i8 = this.f4987b) && (i12 != i8 || this.f4990e != 0))) {
                    z6 = false;
                }
                AbstractC1697a.i(z6);
                break;
            case 1:
            default:
                int i13 = this.f4988c;
                int i14 = i7 / 8;
                int i15 = i13 + i14;
                this.f4988c = i15;
                int i16 = (i7 - (i14 * 8)) + this.f4990e;
                this.f4990e = i16;
                if (i16 > 7) {
                    this.f4988c = i15 + 1;
                    this.f4990e = i16 - 8;
                }
                while (true) {
                    i13++;
                    if (i13 > this.f4988c) {
                        a();
                        break;
                    } else if (r(i13)) {
                        this.f4988c++;
                        i13 += 2;
                    }
                }
                break;
            case 2:
                int i17 = i7 / 8;
                int i18 = this.f4987b + i17;
                this.f4987b = i18;
                int i19 = (i7 - (i17 * 8)) + this.f4988c;
                this.f4988c = i19;
                if (i19 > 7) {
                    this.f4987b = i18 + 1;
                    this.f4988c = i19 - 8;
                }
                a();
                break;
        }
    }

    public void u(int i7) {
        AbstractC1697a.i(this.f4988c == 0);
        this.f4987b += i7;
        a();
    }

    public J(byte[] bArr) {
        this.f4986a = 0;
        this.f4989d = bArr;
        this.f4987b = bArr.length;
    }

    public J(byte[] bArr, int i7, int i8) {
        this.f4986a = 3;
        this.f4989d = bArr;
        this.f4988c = i7;
        this.f4987b = i8;
        this.f4990e = 0;
        a();
    }

    public J(int i7, byte[] bArr) {
        this.f4986a = 2;
        this.f4989d = bArr;
        this.f4990e = i7;
    }

    public J(int i7, int i8) {
        this.f4986a = 1;
        this.f4987b = i7;
        this.f4988c = i8;
        this.f4989d = new byte[(i8 * 2) - 1];
        this.f4990e = 0;
    }
}
