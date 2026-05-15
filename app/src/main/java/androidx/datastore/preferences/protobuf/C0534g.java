package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0534g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0535h f9470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f9471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9475g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9477j = Integer.MAX_VALUE;

    public C0534g(FileInputStream fileInputStream) {
        Charset charset = AbstractC0548v.f9521a;
        this.f9471c = fileInputStream;
        this.f9472d = new byte[4096];
        this.f9473e = 0;
        this.f9475g = 0;
        this.f9476i = 0;
    }

    public final int A() {
        return s();
    }

    public final long B() {
        return t();
    }

    public final void C() {
        int i7 = this.f9473e + this.f9474f;
        this.f9473e = i7;
        int i8 = this.f9476i + i7;
        int i9 = this.f9477j;
        if (i8 <= i9) {
            this.f9474f = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f9474f = i10;
        this.f9473e = i7 - i10;
    }

    public final void D(int i7) {
        if (G(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f9476i) - this.f9475g) {
            throw C0550x.f();
        }
        throw new C0550x("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i7) throws C0550x {
        int iZ;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            int i10 = this.f9473e - this.f9475g;
            byte[] bArr = this.f9472d;
            if (i10 >= 10) {
                while (i9 < 10) {
                    int i11 = this.f9475g;
                    this.f9475g = i11 + 1;
                    if (bArr[i11] < 0) {
                        i9++;
                    }
                }
                throw C0550x.c();
            }
            while (i9 < 10) {
                if (this.f9475g == this.f9473e) {
                    D(1);
                }
                int i12 = this.f9475g;
                this.f9475g = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            }
            throw C0550x.c();
            return true;
        }
        if (i8 == 1) {
            F(8);
            return true;
        }
        if (i8 == 2) {
            F(s());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw C0550x.b();
            }
            F(4);
            return true;
        }
        do {
            iZ = z();
            if (iZ == 0) {
                break;
            }
        } while (E(iZ));
        a(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final void F(int i7) throws C0550x {
        int i8 = this.f9473e;
        int i9 = this.f9475g;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.f9475g = i9 + i7;
            return;
        }
        FileInputStream fileInputStream = this.f9471c;
        if (i7 < 0) {
            throw C0550x.d();
        }
        int i11 = this.f9476i;
        int i12 = i11 + i9;
        int i13 = i12 + i7;
        int i14 = this.f9477j;
        if (i13 > i14) {
            F((i14 - i11) - i9);
            throw C0550x.f();
        }
        this.f9476i = i12;
        this.f9473e = 0;
        this.f9475g = 0;
        while (i10 < i7) {
            long j3 = i7 - i10;
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
            } finally {
                this.f9476i += i10;
                C();
            }
        }
        if (i10 >= i7) {
            return;
        }
        int i15 = this.f9473e;
        int i16 = i15 - this.f9475g;
        this.f9475g = i15;
        D(1);
        while (true) {
            int i17 = i7 - i16;
            int i18 = this.f9473e;
            if (i17 <= i18) {
                this.f9475g = i17;
                return;
            } else {
                i16 += i18;
                this.f9475g = i18;
                D(1);
            }
        }
    }

    public final boolean G(int i7) throws IOException {
        int i8 = this.f9475g;
        int i9 = i8 + i7;
        int i10 = this.f9473e;
        if (i9 <= i10) {
            throw new IllegalStateException(Z1.l.o(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i11 = this.f9476i;
        if (i7 <= (Integer.MAX_VALUE - i11) - i8 && i11 + i8 + i7 <= this.f9477j) {
            byte[] bArr = this.f9472d;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f9476i += i8;
                this.f9473e -= i8;
                this.f9475g = 0;
            }
            int i12 = this.f9473e;
            int iMin = Math.min(bArr.length - i12, (Integer.MAX_VALUE - this.f9476i) - i12);
            FileInputStream fileInputStream = this.f9471c;
            int i13 = fileInputStream.read(bArr, i12, iMin);
            if (i13 == 0 || i13 < -1 || i13 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i13 + "\nThe InputStream implementation is buggy.");
            }
            if (i13 > 0) {
                this.f9473e += i13;
                C();
                if (this.f9473e >= i7) {
                    return true;
                }
                return G(i7);
            }
        }
        return false;
    }

    public final void a(int i7) {
        if (this.h != i7) {
            throw new C0550x("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.f9476i + this.f9475g;
    }

    public final boolean c() {
        return this.f9475g == this.f9473e && !G(1);
    }

    public final void d(int i7) {
        this.f9477j = i7;
        C();
    }

    public final int e(int i7) {
        if (i7 < 0) {
            throw C0550x.d();
        }
        int i8 = this.f9476i + this.f9475g + i7;
        int i9 = this.f9477j;
        if (i8 > i9) {
            throw C0550x.f();
        }
        this.f9477j = i8;
        C();
        return i9;
    }

    public final boolean f() {
        return t() != 0;
    }

    public final double g() {
        return Double.longBitsToDouble(r());
    }

    public final int h() {
        return s();
    }

    public final int i() {
        return q();
    }

    public final long j() {
        return r();
    }

    public final float k() {
        return Float.intBitsToFloat(q());
    }

    public final int l() {
        return s();
    }

    public final long m() {
        return t();
    }

    public final byte[] n(int i7) {
        byte[] bArrO = o(i7);
        if (bArrO != null) {
            return bArrO;
        }
        int i8 = this.f9475g;
        int i9 = this.f9473e;
        int length = i9 - i8;
        this.f9476i += i9;
        this.f9475g = 0;
        this.f9473e = 0;
        ArrayList<byte[]> arrayListP = p(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f9472d, i8, bArr, 0, length);
        for (byte[] bArr2 : arrayListP) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] o(int i7) {
        if (i7 == 0) {
            return AbstractC0548v.f9522b;
        }
        if (i7 < 0) {
            throw C0550x.d();
        }
        int i8 = this.f9476i;
        int i9 = this.f9475g;
        int i10 = i8 + i9 + i7;
        if (i10 - Integer.MAX_VALUE > 0) {
            throw new C0550x("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i11 = this.f9477j;
        if (i10 > i11) {
            F((i11 - i8) - i9);
            throw C0550x.f();
        }
        int i12 = this.f9473e - i9;
        int i13 = i7 - i12;
        FileInputStream fileInputStream = this.f9471c;
        if (i13 >= 4096 && i13 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f9472d, this.f9475g, bArr, 0, i12);
        this.f9476i += this.f9473e;
        this.f9475g = 0;
        this.f9473e = 0;
        while (i12 < i7) {
            int i14 = fileInputStream.read(bArr, i12, i7 - i12);
            if (i14 == -1) {
                throw C0550x.f();
            }
            this.f9476i += i14;
            i12 += i14;
        }
        return bArr;
    }

    public final ArrayList p(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = this.f9471c.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    throw C0550x.f();
                }
                this.f9476i += i9;
                i8 += i9;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int q() {
        int i7 = this.f9475g;
        if (this.f9473e - i7 < 4) {
            D(4);
            i7 = this.f9475g;
        }
        this.f9475g = i7 + 4;
        byte[] bArr = this.f9472d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long r() {
        int i7 = this.f9475g;
        if (this.f9473e - i7 < 8) {
            D(8);
            i7 = this.f9475g;
        }
        this.f9475g = i7 + 8;
        byte[] bArr = this.f9472d;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int s() {
        int i7;
        int i8 = this.f9475g;
        int i9 = this.f9473e;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f9472d;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f9475g = i10;
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
                this.f9475g = i11;
                return i7;
            }
        }
        return (int) u();
    }

    public final long t() {
        long j3;
        long j7;
        long j8;
        long j9;
        int i7 = this.f9475g;
        int i8 = this.f9473e;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f9472d;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f9475g = i9;
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
                this.f9475g = i10;
                return j3;
            }
        }
        return u();
    }

    public final long u() throws C0550x {
        long j3 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f9475g == this.f9473e) {
                D(1);
            }
            int i8 = this.f9475g;
            this.f9475g = i8 + 1;
            byte b7 = this.f9472d[i8];
            j3 |= ((long) (b7 & 127)) << i7;
            if ((b7 & 128) == 0) {
                return j3;
            }
        }
        throw C0550x.c();
    }

    public final int v() {
        return q();
    }

    public final long w() {
        return r();
    }

    public final int x() {
        int iS = s();
        return (-(iS & 1)) ^ (iS >>> 1);
    }

    public final long y() {
        long jT = t();
        return (-(jT & 1)) ^ (jT >>> 1);
    }

    public final int z() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int iS = s();
        this.h = iS;
        if ((iS >>> 3) != 0) {
            return iS;
        }
        throw new C0550x("Protocol message contained an invalid tag (zero).");
    }
}
