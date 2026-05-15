package androidx.glance.appwidget.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0560h extends G1.P {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FileInputStream f9628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f9629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9633v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9635x = Integer.MAX_VALUE;

    public C0560h(FileInputStream fileInputStream) {
        Charset charset = AbstractC0572u.f9656a;
        this.f9628q = fileInputStream;
        this.f9629r = new byte[4096];
        this.f9630s = 0;
        this.f9632u = 0;
        this.f9634w = 0;
    }

    @Override // G1.P
    public final int A() {
        return H();
    }

    @Override // G1.P
    public final long B() {
        return I();
    }

    public final byte[] C(int i7) throws IOException {
        byte[] bArrD = D(i7);
        if (bArrD != null) {
            return bArrD;
        }
        int i8 = this.f9632u;
        int i9 = this.f9630s;
        int length = i9 - i8;
        this.f9634w += i9;
        this.f9632u = 0;
        this.f9630s = 0;
        ArrayList<byte[]> arrayListE = E(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f9629r, i8, bArr, 0, length);
        for (byte[] bArr2 : arrayListE) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] D(int i7) throws IOException {
        if (i7 == 0) {
            return AbstractC0572u.f9657b;
        }
        if (i7 < 0) {
            throw C0574w.d();
        }
        int i8 = this.f9634w;
        int i9 = this.f9632u;
        int i10 = i8 + i9 + i7;
        if (i10 - Integer.MAX_VALUE > 0) {
            throw new C0574w("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i11 = this.f9635x;
        if (i10 > i11) {
            M((i11 - i8) - i9);
            throw C0574w.e();
        }
        int i12 = this.f9630s - i9;
        int i13 = i7 - i12;
        FileInputStream fileInputStream = this.f9628q;
        if (i13 >= 4096) {
            try {
                if (i13 > fileInputStream.available()) {
                    return null;
                }
            } catch (C0574w e7) {
                e7.f9658o = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f9629r, this.f9632u, bArr, 0, i12);
        this.f9634w += this.f9630s;
        this.f9632u = 0;
        this.f9630s = 0;
        while (i12 < i7) {
            try {
                int i14 = fileInputStream.read(bArr, i12, i7 - i12);
                if (i14 == -1) {
                    throw C0574w.e();
                }
                this.f9634w += i14;
                i12 += i14;
            } catch (C0574w e8) {
                e8.f9658o = true;
                throw e8;
            }
        }
        return bArr;
    }

    public final ArrayList E(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = this.f9628q.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    throw C0574w.e();
                }
                this.f9634w += i9;
                i8 += i9;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int F() throws C0574w {
        int i7 = this.f9632u;
        if (this.f9630s - i7 < 4) {
            L(4);
            i7 = this.f9632u;
        }
        this.f9632u = i7 + 4;
        byte[] bArr = this.f9629r;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long G() throws C0574w {
        int i7 = this.f9632u;
        if (this.f9630s - i7 < 8) {
            L(8);
            i7 = this.f9632u;
        }
        this.f9632u = i7 + 8;
        byte[] bArr = this.f9629r;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int H() {
        int i7;
        int i8 = this.f9632u;
        int i9 = this.f9630s;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f9629r;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f9632u = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i15];
                            int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f9632u = i11;
                return i7;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j3;
        long j7;
        long j8;
        long j9;
        int i7 = this.f9632u;
        int i8 = this.f9630s;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f9629r;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f9632u = i9;
                return b7;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    j3 = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j3 = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j9 = (-2080896) ^ i15;
                        } else {
                            long j10 = i15;
                            i10 = i7 + 5;
                            long j11 = j10 ^ (((long) bArr[i14]) << 28);
                            if (j11 >= 0) {
                                j8 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j12 = j11 ^ (((long) bArr[i10]) << 35);
                                if (j12 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j11 = j12 ^ (((long) bArr[i14]) << 42);
                                    if (j11 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j12 = j11 ^ (((long) bArr[i10]) << 49);
                                        if (j12 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j13 = (j12 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i16 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j3 = j13;
                                        }
                                    }
                                }
                                j9 = j7 ^ j12;
                            }
                            j3 = j8 ^ j11;
                        }
                        i10 = i14;
                        j3 = j9;
                    }
                }
                this.f9632u = i10;
                return j3;
            }
        }
        return J();
    }

    public final long J() throws C0574w {
        long j3 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f9632u == this.f9630s) {
                L(1);
            }
            int i8 = this.f9632u;
            this.f9632u = i8 + 1;
            byte b7 = this.f9629r[i8];
            j3 |= ((long) (b7 & 127)) << i7;
            if ((b7 & 128) == 0) {
                return j3;
            }
        }
        throw C0574w.c();
    }

    public final void K() {
        int i7 = this.f9630s + this.f9631t;
        this.f9630s = i7;
        int i8 = this.f9634w + i7;
        int i9 = this.f9635x;
        if (i8 <= i9) {
            this.f9631t = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f9631t = i10;
        this.f9630s = i7 - i10;
    }

    public final void L(int i7) throws C0574w {
        if (N(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f9634w) - this.f9632u) {
            throw C0574w.e();
        }
        throw new C0574w("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void M(int i7) throws C0574w {
        int i8 = this.f9630s;
        int i9 = this.f9632u;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.f9632u = i9 + i7;
            return;
        }
        FileInputStream fileInputStream = this.f9628q;
        if (i7 < 0) {
            throw C0574w.d();
        }
        int i11 = this.f9634w;
        int i12 = i11 + i9;
        int i13 = i12 + i7;
        int i14 = this.f9635x;
        if (i13 > i14) {
            M((i14 - i11) - i9);
            throw C0574w.e();
        }
        this.f9634w = i12;
        this.f9630s = 0;
        this.f9632u = 0;
        while (i10 < i7) {
            long j3 = i7 - i10;
            try {
                try {
                    long jSkip = fileInputStream.skip(j3);
                    if (jSkip < 0 || jSkip > j3) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i10 += (int) jSkip;
                    }
                } catch (C0574w e7) {
                    e7.f9658o = true;
                    throw e7;
                }
            } catch (Throwable th) {
                this.f9634w += i10;
                K();
                throw th;
            }
        }
        this.f9634w += i10;
        K();
        if (i10 >= i7) {
            return;
        }
        int i15 = this.f9630s;
        int i16 = i15 - this.f9632u;
        this.f9632u = i15;
        L(1);
        while (true) {
            int i17 = i7 - i16;
            int i18 = this.f9630s;
            if (i17 <= i18) {
                this.f9632u = i17;
                return;
            } else {
                i16 += i18;
                this.f9632u = i18;
                L(1);
            }
        }
    }

    public final boolean N(int i7) throws IOException {
        int i8 = this.f9632u;
        int i9 = i8 + i7;
        int i10 = this.f9630s;
        if (i9 <= i10) {
            throw new IllegalStateException(Z1.l.o(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i11 = this.f9634w;
        if (i7 <= (Integer.MAX_VALUE - i11) - i8 && i11 + i8 + i7 <= this.f9635x) {
            byte[] bArr = this.f9629r;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f9634w += i8;
                this.f9630s -= i8;
                this.f9632u = 0;
            }
            int i12 = this.f9630s;
            int iMin = Math.min(bArr.length - i12, (Integer.MAX_VALUE - this.f9634w) - i12);
            FileInputStream fileInputStream = this.f9628q;
            try {
                int i13 = fileInputStream.read(bArr, i12, iMin);
                if (i13 == 0 || i13 < -1 || i13 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i13 + "\nThe InputStream implementation is buggy.");
                }
                if (i13 > 0) {
                    this.f9630s += i13;
                    K();
                    if (this.f9630s >= i7) {
                        return true;
                    }
                    return N(i7);
                }
            } catch (C0574w e7) {
                e7.f9658o = true;
                throw e7;
            }
        }
        return false;
    }

    @Override // G1.P
    public final void a(int i7) throws C0574w {
        if (this.f9633v != i7) {
            throw new C0574w("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // G1.P
    public final int b() {
        return this.f9634w + this.f9632u;
    }

    @Override // G1.P
    public final boolean c() {
        return this.f9632u == this.f9630s && !N(1);
    }

    @Override // G1.P
    public final void h(int i7) {
        this.f9635x = i7;
        K();
    }

    @Override // G1.P
    public final int i(int i7) throws C0574w {
        if (i7 < 0) {
            throw C0574w.d();
        }
        int i8 = this.f9634w + this.f9632u + i7;
        if (i8 < 0) {
            throw new C0574w("Failed to parse the message.");
        }
        int i9 = this.f9635x;
        if (i8 > i9) {
            throw C0574w.e();
        }
        this.f9635x = i8;
        K();
        return i9;
    }

    @Override // G1.P
    public final boolean k() {
        return I() != 0;
    }

    @Override // G1.P
    public final C0558f l() throws IOException {
        int iH = H();
        int i7 = this.f9630s;
        int i8 = this.f9632u;
        int i9 = i7 - i8;
        byte[] bArr = this.f9629r;
        if (iH <= i9 && iH > 0) {
            C0558f c0558fC = C0558f.c(bArr, i8, iH);
            this.f9632u += iH;
            return c0558fC;
        }
        if (iH == 0) {
            return C0558f.f9617q;
        }
        if (iH < 0) {
            throw C0574w.d();
        }
        byte[] bArrD = D(iH);
        if (bArrD != null) {
            return C0558f.c(bArrD, 0, bArrD.length);
        }
        int i10 = this.f9632u;
        int i11 = this.f9630s;
        int length = i11 - i10;
        this.f9634w += i11;
        this.f9632u = 0;
        this.f9630s = 0;
        ArrayList<byte[]> arrayListE = E(iH - length);
        byte[] bArr2 = new byte[iH];
        System.arraycopy(bArr, i10, bArr2, 0, length);
        for (byte[] bArr3 : arrayListE) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0558f c0558f = C0558f.f9617q;
        return new C0558f(bArr2);
    }

    @Override // G1.P
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // G1.P
    public final int n() {
        return H();
    }

    @Override // G1.P
    public final int o() {
        return F();
    }

    @Override // G1.P
    public final long p() {
        return G();
    }

    @Override // G1.P
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // G1.P
    public final int r() {
        return H();
    }

    @Override // G1.P
    public final long s() {
        return I();
    }

    @Override // G1.P
    public final int t() {
        return F();
    }

    @Override // G1.P
    public final long u() {
        return G();
    }

    @Override // G1.P
    public final int v() {
        int iH = H();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    @Override // G1.P
    public final long w() {
        long jI = I();
        return (-(jI & 1)) ^ (jI >>> 1);
    }

    @Override // G1.P
    public final String x() throws C0574w {
        int iH = H();
        byte[] bArr = this.f9629r;
        if (iH > 0) {
            int i7 = this.f9630s;
            int i8 = this.f9632u;
            if (iH <= i7 - i8) {
                String str = new String(bArr, i8, iH, AbstractC0572u.f9656a);
                this.f9632u += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw C0574w.d();
        }
        if (iH > this.f9630s) {
            return new String(C(iH), AbstractC0572u.f9656a);
        }
        L(iH);
        String str2 = new String(bArr, this.f9632u, iH, AbstractC0572u.f9656a);
        this.f9632u += iH;
        return str2;
    }

    @Override // G1.P
    public final String y() throws IOException {
        int iH = H();
        int i7 = this.f9632u;
        int i8 = this.f9630s;
        int i9 = i8 - i7;
        byte[] bArrC = this.f9629r;
        if (iH <= i9 && iH > 0) {
            this.f9632u = i7 + iH;
        } else {
            if (iH == 0) {
                return "";
            }
            if (iH < 0) {
                throw C0574w.d();
            }
            i7 = 0;
            if (iH <= i8) {
                L(iH);
                this.f9632u = iH;
            } else {
                bArrC = C(iH);
            }
        }
        return c0.f9613a.t(bArrC, i7, iH);
    }

    @Override // G1.P
    public final int z() throws C0574w {
        if (c()) {
            this.f9633v = 0;
            return 0;
        }
        int iH = H();
        this.f9633v = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw new C0574w("Protocol message contained an invalid tag (zero).");
    }
}
