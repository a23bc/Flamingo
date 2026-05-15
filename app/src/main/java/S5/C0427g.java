package S5;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: S5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0427g implements i, InterfaceC0428h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: o */
    public z f6784o;

    /* JADX INFO: renamed from: p */
    public long f6785p;

    public final void A(int i7, byte[] bArr) {
        AbstractC1209k.f(bArr, "source");
        int i8 = 0;
        long j3 = i7;
        AbstractC1267a.o(bArr.length, 0, j3);
        while (i8 < i7) {
            z zVarZ = z(1);
            int iMin = Math.min(i7 - i8, 8192 - zVarZ.f6827c);
            int i9 = i8 + iMin;
            Z4.l.U(zVarZ.f6827c, i8, i9, bArr, zVarZ.f6825a);
            zVarZ.f6827c += iMin;
            i8 = i9;
        }
        this.f6785p += j3;
    }

    public final void B(j jVar) {
        AbstractC1209k.f(jVar, "byteString");
        jVar.q(this, jVar.c());
    }

    public final void C(E e7) {
        AbstractC1209k.f(e7, "source");
        while (e7.k(8192L, this) != -1) {
        }
    }

    public final void D(int i7) {
        z zVarZ = z(1);
        int i8 = zVarZ.f6827c;
        zVarZ.f6827c = i8 + 1;
        zVarZ.f6825a[i8] = (byte) i7;
        this.f6785p++;
    }

    public final void E(long j3) {
        if (j3 == 0) {
            D(48);
            return;
        }
        long j7 = (j3 >>> 1) | j3;
        long j8 = j7 | (j7 >>> 2);
        long j9 = j8 | (j8 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i7 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        z zVarZ = z(i7);
        int i8 = zVarZ.f6827c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            zVarZ.f6825a[i9] = T5.a.f6985a[(int) (15 & j3)];
            j3 >>>= 4;
        }
        zVarZ.f6827c += i7;
        this.f6785p += (long) i7;
    }

    public final void F(int i7) {
        z zVarZ = z(4);
        int i8 = zVarZ.f6827c;
        byte[] bArr = zVarZ.f6825a;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        zVarZ.f6827c = i8 + 4;
        this.f6785p += 4;
    }

    public final void G(String str) {
        AbstractC1209k.f(str, "string");
        H(str, 0, str.length());
    }

    public final void H(String str, int i7, int i8) {
        char cCharAt;
        AbstractC1209k.f(str, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(n1.c.s(i7, "beginIndex < 0: ").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(Z1.l.p("endIndex < beginIndex: ", i8, i7, " < ").toString());
        }
        if (i8 > str.length()) {
            StringBuilder sbV = n1.c.v(i8, "endIndex > string.length: ", " > ");
            sbV.append(str.length());
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        while (i7 < i8) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128) {
                z zVarZ = z(1);
                int i9 = zVarZ.f6827c - i7;
                int iMin = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                byte[] bArr = zVarZ.f6825a;
                bArr[i7 + i9] = (byte) cCharAt2;
                while (true) {
                    i7 = i10;
                    if (i7 >= iMin || (cCharAt = str.charAt(i7)) >= 128) {
                        break;
                    }
                    i10 = i7 + 1;
                    bArr[i7 + i9] = (byte) cCharAt;
                }
                int i11 = zVarZ.f6827c;
                int i12 = (i9 + i7) - i11;
                zVarZ.f6827c = i11 + i12;
                this.f6785p += (long) i12;
            } else {
                if (cCharAt2 < 2048) {
                    z zVarZ2 = z(2);
                    int i13 = zVarZ2.f6827c;
                    byte[] bArr2 = zVarZ2.f6825a;
                    bArr2[i13] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    zVarZ2.f6827c = i13 + 2;
                    this.f6785p += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    z zVarZ3 = z(3);
                    int i14 = zVarZ3.f6827c;
                    byte[] bArr3 = zVarZ3.f6825a;
                    bArr3[i14] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    zVarZ3.f6827c = i14 + 3;
                    this.f6785p += 3;
                } else {
                    int i15 = i7 + 1;
                    char cCharAt3 = i15 < i8 ? str.charAt(i15) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        D(63);
                        i7 = i15;
                    } else {
                        int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        z zVarZ4 = z(4);
                        int i17 = zVarZ4.f6827c;
                        byte[] bArr4 = zVarZ4.f6825a;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        zVarZ4.f6827c = i17 + 4;
                        this.f6785p += 4;
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
    }

    public final void I(int i7) {
        String str;
        int i8 = 0;
        if (i7 < 128) {
            D(i7);
            return;
        }
        if (i7 < 2048) {
            z zVarZ = z(2);
            int i9 = zVarZ.f6827c;
            byte[] bArr = zVarZ.f6825a;
            bArr[i9] = (byte) ((i7 >> 6) | 192);
            bArr[1 + i9] = (byte) ((i7 & 63) | 128);
            zVarZ.f6827c = i9 + 2;
            this.f6785p += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            D(63);
            return;
        }
        if (i7 < 65536) {
            z zVarZ2 = z(3);
            int i10 = zVarZ2.f6827c;
            byte[] bArr2 = zVarZ2.f6825a;
            bArr2[i10] = (byte) ((i7 >> 12) | 224);
            bArr2[1 + i10] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[2 + i10] = (byte) ((i7 & 63) | 128);
            zVarZ2.f6827c = i10 + 3;
            this.f6785p += 3;
            return;
        }
        if (i7 <= 1114111) {
            z zVarZ3 = z(4);
            int i11 = zVarZ3.f6827c;
            byte[] bArr3 = zVarZ3.f6825a;
            bArr3[i11] = (byte) ((i7 >> 18) | 240);
            bArr3[1 + i11] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[2 + i11] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[3 + i11] = (byte) ((i7 & 63) | 128);
            zVarZ3.f6827c = i11 + 4;
            this.f6785p += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i7 != 0) {
            char[] cArr = T5.b.f6986a;
            char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
            while (i8 < 8 && cArr2[i8] == '0') {
                i8++;
            }
            if (i8 < 0) {
                throw new IndexOutOfBoundsException(Z1.l.o(i8, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i8 > 8) {
                throw new IllegalArgumentException(Z1.l.o(i8, "startIndex: ", " > endIndex: 8"));
            }
            str = new String(cArr2, i8, 8 - i8);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // S5.E
    public final G a() {
        return G.f6762d;
    }

    public final long b() {
        long j3 = this.f6785p;
        if (j3 == 0) {
            return 0L;
        }
        z zVar = this.f6784o;
        AbstractC1209k.c(zVar);
        z zVar2 = zVar.f6831g;
        AbstractC1209k.c(zVar2);
        int i7 = zVar2.f6827c;
        return (i7 >= 8192 || !zVar2.f6829e) ? j3 : j3 - ((long) (i7 - zVar2.f6826b));
    }

    public final void c(C0427g c0427g, long j3, long j7) {
        AbstractC1209k.f(c0427g, "out");
        long j8 = j3;
        AbstractC1267a.o(this.f6785p, j8, j7);
        if (j7 == 0) {
            return;
        }
        c0427g.f6785p += j7;
        z zVar = this.f6784o;
        while (true) {
            AbstractC1209k.c(zVar);
            long j9 = zVar.f6827c - zVar.f6826b;
            if (j8 < j9) {
                break;
            }
            j8 -= j9;
            zVar = zVar.f6830f;
        }
        z zVar2 = zVar;
        long j10 = j7;
        while (j10 > 0) {
            AbstractC1209k.c(zVar2);
            z zVarC = zVar2.c();
            int i7 = zVarC.f6826b + ((int) j8);
            zVarC.f6826b = i7;
            zVarC.f6827c = Math.min(i7 + ((int) j10), zVarC.f6827c);
            z zVar3 = c0427g.f6784o;
            if (zVar3 == null) {
                zVarC.f6831g = zVarC;
                zVarC.f6830f = zVarC;
                c0427g.f6784o = zVarC;
            } else {
                z zVar4 = zVar3.f6831g;
                AbstractC1209k.c(zVar4);
                zVar4.b(zVarC);
            }
            j10 -= (long) (zVarC.f6827c - zVarC.f6826b);
            zVar2 = zVar2.f6830f;
            j8 = 0;
        }
    }

    public final Object clone() {
        C0427g c0427g = new C0427g();
        if (this.f6785p == 0) {
            return c0427g;
        }
        z zVar = this.f6784o;
        AbstractC1209k.c(zVar);
        z zVarC = zVar.c();
        c0427g.f6784o = zVarC;
        zVarC.f6831g = zVarC;
        zVarC.f6830f = zVarC;
        for (z zVar2 = zVar.f6830f; zVar2 != zVar; zVar2 = zVar2.f6830f) {
            z zVar3 = zVarC.f6831g;
            AbstractC1209k.c(zVar3);
            AbstractC1209k.c(zVar2);
            zVar3.b(zVar2.c());
        }
        c0427g.f6785p = this.f6785p;
        return c0427g;
    }

    public final boolean d() {
        return this.f6785p == 0;
    }

    @Override // S5.C
    public final void e(long j3, C0427g c0427g) {
        z zVarB;
        AbstractC1209k.f(c0427g, "source");
        if (c0427g == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1267a.o(c0427g.f6785p, 0L, j3);
        while (j3 > 0) {
            z zVar = c0427g.f6784o;
            AbstractC1209k.c(zVar);
            int i7 = zVar.f6827c;
            z zVar2 = c0427g.f6784o;
            AbstractC1209k.c(zVar2);
            long j7 = i7 - zVar2.f6826b;
            int i8 = 0;
            if (j3 < j7) {
                z zVar3 = this.f6784o;
                z zVar4 = zVar3 != null ? zVar3.f6831g : null;
                if (zVar4 != null && zVar4.f6829e) {
                    if ((((long) zVar4.f6827c) + j3) - ((long) (zVar4.f6828d ? 0 : zVar4.f6826b)) <= 8192) {
                        z zVar5 = c0427g.f6784o;
                        AbstractC1209k.c(zVar5);
                        zVar5.d(zVar4, (int) j3);
                        c0427g.f6785p -= j3;
                        this.f6785p += j3;
                        return;
                    }
                }
                z zVar6 = c0427g.f6784o;
                AbstractC1209k.c(zVar6);
                int i9 = (int) j3;
                if (i9 <= 0 || i9 > zVar6.f6827c - zVar6.f6826b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i9 >= 1024) {
                    zVarB = zVar6.c();
                } else {
                    zVarB = A.b();
                    int i10 = zVar6.f6826b;
                    Z4.l.U(0, i10, i10 + i9, zVar6.f6825a, zVarB.f6825a);
                }
                zVarB.f6827c = zVarB.f6826b + i9;
                zVar6.f6826b += i9;
                z zVar7 = zVar6.f6831g;
                AbstractC1209k.c(zVar7);
                zVar7.b(zVarB);
                c0427g.f6784o = zVarB;
            }
            z zVar8 = c0427g.f6784o;
            AbstractC1209k.c(zVar8);
            long j8 = zVar8.f6827c - zVar8.f6826b;
            c0427g.f6784o = zVar8.a();
            z zVar9 = this.f6784o;
            if (zVar9 == null) {
                this.f6784o = zVar8;
                zVar8.f6831g = zVar8;
                zVar8.f6830f = zVar8;
            } else {
                z zVar10 = zVar9.f6831g;
                AbstractC1209k.c(zVar10);
                zVar10.b(zVar8);
                z zVar11 = zVar8.f6831g;
                if (zVar11 == zVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC1209k.c(zVar11);
                if (zVar11.f6829e) {
                    int i11 = zVar8.f6827c - zVar8.f6826b;
                    z zVar12 = zVar8.f6831g;
                    AbstractC1209k.c(zVar12);
                    int i12 = 8192 - zVar12.f6827c;
                    z zVar13 = zVar8.f6831g;
                    AbstractC1209k.c(zVar13);
                    if (!zVar13.f6828d) {
                        z zVar14 = zVar8.f6831g;
                        AbstractC1209k.c(zVar14);
                        i8 = zVar14.f6826b;
                    }
                    if (i11 <= i12 + i8) {
                        z zVar15 = zVar8.f6831g;
                        AbstractC1209k.c(zVar15);
                        zVar8.d(zVar15, i11);
                        zVar8.a();
                        A.a(zVar8);
                    }
                }
            }
            c0427g.f6785p -= j8;
            this.f6785p += j8;
            j3 -= j8;
        }
    }

    public final boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        boolean z7 = false;
        if (!(obj instanceof C0427g)) {
            return false;
        }
        long j3 = this.f6785p;
        C0427g c0427g = (C0427g) obj;
        if (j3 != c0427g.f6785p) {
            return false;
        }
        if (j3 == 0) {
            return true;
        }
        z zVar = this.f6784o;
        AbstractC1209k.c(zVar);
        z zVar2 = c0427g.f6784o;
        AbstractC1209k.c(zVar2);
        int i7 = zVar.f6826b;
        int i8 = zVar2.f6826b;
        long j7 = 0;
        while (j7 < this.f6785p) {
            long jMin = Math.min(zVar.f6827c - i7, zVar2.f6827c - i8);
            long j8 = 0;
            while (j8 < jMin) {
                int i9 = i7 + 1;
                boolean z8 = z6;
                byte b7 = zVar.f6825a[i7];
                int i10 = i8 + 1;
                boolean z9 = z7;
                if (b7 != zVar2.f6825a[i8]) {
                    return z9;
                }
                j8++;
                i8 = i10;
                i7 = i9;
                z6 = z8;
                z7 = z9;
            }
            boolean z10 = z6;
            boolean z11 = z7;
            if (i7 == zVar.f6827c) {
                z zVar3 = zVar.f6830f;
                AbstractC1209k.c(zVar3);
                i7 = zVar3.f6826b;
                zVar = zVar3;
            }
            if (i8 == zVar2.f6827c) {
                zVar2 = zVar2.f6830f;
                AbstractC1209k.c(zVar2);
                i8 = zVar2.f6826b;
            }
            j7 += jMin;
            z6 = z10;
            z7 = z11;
        }
        return z6;
    }

    @Override // S5.i
    public final boolean f(long j3) {
        return this.f6785p >= j3;
    }

    public final byte g(long j3) {
        AbstractC1267a.o(this.f6785p, j3, 1L);
        z zVar = this.f6784o;
        if (zVar == null) {
            AbstractC1209k.c(null);
            throw null;
        }
        long j7 = this.f6785p;
        if (j7 - j3 < j3) {
            while (j7 > j3) {
                zVar = zVar.f6831g;
                AbstractC1209k.c(zVar);
                j7 -= (long) (zVar.f6827c - zVar.f6826b);
            }
            return zVar.f6825a[(int) ((((long) zVar.f6826b) + j3) - j7)];
        }
        long j8 = 0;
        while (true) {
            int i7 = zVar.f6827c;
            int i8 = zVar.f6826b;
            long j9 = ((long) (i7 - i8)) + j8;
            if (j9 > j3) {
                return zVar.f6825a[(int) ((((long) i8) + j3) - j8)];
            }
            zVar = zVar.f6830f;
            AbstractC1209k.c(zVar);
            j8 = j9;
        }
    }

    public final long h(j jVar) {
        int i7;
        int i8;
        AbstractC1209k.f(jVar, "targetBytes");
        z zVar = this.f6784o;
        if (zVar == null) {
            return -1L;
        }
        long j3 = this.f6785p;
        long j7 = 0;
        byte[] bArr = jVar.f6787o;
        if (j3 < 0) {
            while (j3 > 0) {
                zVar = zVar.f6831g;
                AbstractC1209k.c(zVar);
                j3 -= (long) (zVar.f6827c - zVar.f6826b);
            }
            if (bArr.length == 2) {
                byte b7 = bArr[0];
                byte b8 = bArr[1];
                while (j3 < this.f6785p) {
                    i7 = (int) ((((long) zVar.f6826b) + j7) - j3);
                    int i9 = zVar.f6827c;
                    while (i7 < i9) {
                        byte b9 = zVar.f6825a[i7];
                        if (b9 == b7 || b9 == b8) {
                            i8 = zVar.f6826b;
                        } else {
                            i7++;
                        }
                    }
                    j7 = ((long) (zVar.f6827c - zVar.f6826b)) + j3;
                    zVar = zVar.f6830f;
                    AbstractC1209k.c(zVar);
                    j3 = j7;
                }
                return -1L;
            }
            while (j3 < this.f6785p) {
                i7 = (int) ((((long) zVar.f6826b) + j7) - j3);
                int i10 = zVar.f6827c;
                while (i7 < i10) {
                    byte b10 = zVar.f6825a[i7];
                    for (byte b11 : bArr) {
                        if (b10 == b11) {
                            i8 = zVar.f6826b;
                        }
                    }
                    i7++;
                }
                j7 = ((long) (zVar.f6827c - zVar.f6826b)) + j3;
                zVar = zVar.f6830f;
                AbstractC1209k.c(zVar);
                j3 = j7;
            }
            return -1L;
        }
        j3 = 0;
        while (true) {
            long j8 = ((long) (zVar.f6827c - zVar.f6826b)) + j3;
            if (j8 > 0) {
                break;
            }
            zVar = zVar.f6830f;
            AbstractC1209k.c(zVar);
            j3 = j8;
        }
        if (bArr.length == 2) {
            byte b12 = bArr[0];
            byte b13 = bArr[1];
            while (j3 < this.f6785p) {
                i7 = (int) ((((long) zVar.f6826b) + j7) - j3);
                int i11 = zVar.f6827c;
                while (i7 < i11) {
                    byte b14 = zVar.f6825a[i7];
                    if (b14 == b12 || b14 == b13) {
                        i8 = zVar.f6826b;
                    } else {
                        i7++;
                    }
                }
                j7 = ((long) (zVar.f6827c - zVar.f6826b)) + j3;
                zVar = zVar.f6830f;
                AbstractC1209k.c(zVar);
                j3 = j7;
            }
            return -1L;
        }
        while (j3 < this.f6785p) {
            i7 = (int) ((((long) zVar.f6826b) + j7) - j3);
            int i12 = zVar.f6827c;
            while (i7 < i12) {
                byte b15 = zVar.f6825a[i7];
                for (byte b16 : bArr) {
                    if (b15 == b16) {
                        i8 = zVar.f6826b;
                    }
                }
                i7++;
            }
            j7 = ((long) (zVar.f6827c - zVar.f6826b)) + j3;
            zVar = zVar.f6830f;
            AbstractC1209k.c(zVar);
            j3 = j7;
        }
        return -1L;
        return ((long) (i7 - i8)) + j3;
    }

    public final int hashCode() {
        z zVar = this.f6784o;
        if (zVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = zVar.f6827c;
            for (int i9 = zVar.f6826b; i9 < i8; i9++) {
                i7 = (i7 * 31) + zVar.f6825a[i9];
            }
            zVar = zVar.f6830f;
            AbstractC1209k.c(zVar);
        } while (zVar != this.f6784o);
        return i7;
    }

    public final boolean i(j jVar) {
        AbstractC1209k.f(jVar, "bytes");
        byte[] bArr = jVar.f6787o;
        int length = bArr.length;
        if (length >= 0 && this.f6785p >= length && bArr.length >= length) {
            for (int i7 = 0; i7 < length; i7++) {
                if (g(i7) == bArr[i7]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int j(byte[] bArr, int i7, int i8) {
        AbstractC1267a.o(bArr.length, i7, i8);
        z zVar = this.f6784o;
        if (zVar == null) {
            return -1;
        }
        int iMin = Math.min(i8, zVar.f6827c - zVar.f6826b);
        int i9 = zVar.f6826b;
        Z4.l.U(i7, i9, i9 + iMin, zVar.f6825a, bArr);
        int i10 = zVar.f6826b + iMin;
        zVar.f6826b = i10;
        this.f6785p -= (long) iMin;
        if (i10 == zVar.f6827c) {
            this.f6784o = zVar.a();
            A.a(zVar);
        }
        return iMin;
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) {
        AbstractC1209k.f(c0427g, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
        }
        long j7 = this.f6785p;
        if (j7 == 0) {
            return -1L;
        }
        if (j3 > j7) {
            j3 = j7;
        }
        c0427g.e(j3, this);
        return j3;
    }

    @Override // S5.InterfaceC0428h
    public final /* bridge */ /* synthetic */ InterfaceC0428h m(int i7) {
        D(i7);
        return this;
    }

    public final byte n() throws EOFException {
        if (this.f6785p == 0) {
            throw new EOFException();
        }
        z zVar = this.f6784o;
        AbstractC1209k.c(zVar);
        int i7 = zVar.f6826b;
        int i8 = zVar.f6827c;
        int i9 = i7 + 1;
        byte b7 = zVar.f6825a[i7];
        this.f6785p--;
        if (i9 != i8) {
            zVar.f6826b = i9;
            return b7;
        }
        this.f6784o = zVar.a();
        A.a(zVar);
        return b7;
    }

    public final byte[] o(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(A0.e.D("byteCount: ", j3).toString());
        }
        if (this.f6785p < j3) {
            throw new EOFException();
        }
        int i7 = (int) j3;
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int iJ = j(bArr, i8, i7 - i8);
            if (iJ == -1) {
                throw new EOFException();
            }
            i8 += iJ;
        }
        return bArr;
    }

    @Override // S5.i
    public final long p(w wVar) {
        long j3 = this.f6785p;
        if (j3 > 0) {
            wVar.e(j3, this);
        }
        return j3;
    }

    public final j q(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(A0.e.D("byteCount: ", j3).toString());
        }
        if (this.f6785p < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new j(o(j3));
        }
        j jVarY = y((int) j3);
        w(j3);
        return jVarY;
    }

    public final int r() throws EOFException {
        if (this.f6785p < 4) {
            throw new EOFException();
        }
        z zVar = this.f6784o;
        AbstractC1209k.c(zVar);
        int i7 = zVar.f6826b;
        int i8 = zVar.f6827c;
        if (i8 - i7 < 4) {
            return ((n() & 255) << 24) | ((n() & 255) << 16) | ((n() & 255) << 8) | (n() & 255);
        }
        byte[] bArr = zVar.f6825a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i11 = i7 + 4;
        int i12 = i10 | (bArr[i9] & 255);
        this.f6785p -= 4;
        if (i11 != i8) {
            zVar.f6826b = i11;
            return i12;
        }
        this.f6784o = zVar.a();
        A.a(zVar);
        return i12;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1209k.f(byteBuffer, "sink");
        z zVar = this.f6784o;
        if (zVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), zVar.f6827c - zVar.f6826b);
        byteBuffer.put(zVar.f6825a, zVar.f6826b, iMin);
        int i7 = zVar.f6826b + iMin;
        zVar.f6826b = i7;
        this.f6785p -= (long) iMin;
        if (i7 == zVar.f6827c) {
            this.f6784o = zVar.a();
            A.a(zVar);
        }
        return iMin;
    }

    public final short s() throws EOFException {
        if (this.f6785p < 2) {
            throw new EOFException();
        }
        z zVar = this.f6784o;
        AbstractC1209k.c(zVar);
        int i7 = zVar.f6826b;
        int i8 = zVar.f6827c;
        if (i8 - i7 < 2) {
            return (short) (((n() & 255) << 8) | (n() & 255));
        }
        int i9 = i7 + 1;
        byte[] bArr = zVar.f6825a;
        int i10 = (bArr[i7] & 255) << 8;
        int i11 = i7 + 2;
        int i12 = (bArr[i9] & 255) | i10;
        this.f6785p -= 2;
        if (i11 == i8) {
            this.f6784o = zVar.a();
            A.a(zVar);
        } else {
            zVar.f6826b = i11;
        }
        return (short) i12;
    }

    public final short t() throws EOFException {
        short s7 = s();
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >>> 8));
    }

    public final String toString() {
        long j3 = this.f6785p;
        if (j3 <= 2147483647L) {
            return y((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f6785p).toString());
    }

    public final String u(long j3, Charset charset) throws EOFException {
        AbstractC1209k.f(charset, "charset");
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(A0.e.D("byteCount: ", j3).toString());
        }
        if (this.f6785p < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        z zVar = this.f6784o;
        AbstractC1209k.c(zVar);
        int i7 = zVar.f6826b;
        if (((long) i7) + j3 > zVar.f6827c) {
            return new String(o(j3), charset);
        }
        int i8 = (int) j3;
        String str = new String(zVar.f6825a, i7, i8, charset);
        int i9 = zVar.f6826b + i8;
        zVar.f6826b = i9;
        this.f6785p -= j3;
        if (i9 == zVar.f6827c) {
            this.f6784o = zVar.a();
            A.a(zVar);
        }
        return str;
    }

    @Override // S5.InterfaceC0428h
    public final /* bridge */ /* synthetic */ InterfaceC0428h v(String str) {
        G(str);
        return this;
    }

    public final void w(long j3) throws EOFException {
        while (j3 > 0) {
            z zVar = this.f6784o;
            if (zVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j3, zVar.f6827c - zVar.f6826b);
            long j7 = iMin;
            this.f6785p -= j7;
            j3 -= j7;
            int i7 = zVar.f6826b + iMin;
            zVar.f6826b = i7;
            if (i7 == zVar.f6827c) {
                this.f6784o = zVar.a();
                A.a(zVar);
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1209k.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i7 = iRemaining;
        while (i7 > 0) {
            z zVarZ = z(1);
            int iMin = Math.min(i7, 8192 - zVarZ.f6827c);
            byteBuffer.get(zVarZ.f6825a, zVarZ.f6827c, iMin);
            i7 -= iMin;
            zVarZ.f6827c += iMin;
        }
        this.f6785p += (long) iRemaining;
        return iRemaining;
    }

    public final j y(int i7) {
        if (i7 == 0) {
            return j.f6786r;
        }
        AbstractC1267a.o(this.f6785p, 0L, i7);
        z zVar = this.f6784o;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            AbstractC1209k.c(zVar);
            int i11 = zVar.f6827c;
            int i12 = zVar.f6826b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            zVar = zVar.f6830f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        z zVar2 = this.f6784o;
        int i13 = 0;
        while (i8 < i7) {
            AbstractC1209k.c(zVar2);
            bArr[i13] = zVar2.f6825a;
            i8 += zVar2.f6827c - zVar2.f6826b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = zVar2.f6826b;
            zVar2.f6828d = true;
            i13++;
            zVar2 = zVar2.f6830f;
        }
        return new B(bArr, iArr);
    }

    public final z z(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        z zVar = this.f6784o;
        if (zVar == null) {
            z zVarB = A.b();
            this.f6784o = zVarB;
            zVarB.f6831g = zVarB;
            zVarB.f6830f = zVarB;
            return zVarB;
        }
        z zVar2 = zVar.f6831g;
        AbstractC1209k.c(zVar2);
        if (zVar2.f6827c + i7 <= 8192 && zVar2.f6829e) {
            return zVar2;
        }
        z zVarB2 = A.b();
        zVar2.b(zVarB2);
        return zVarB2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, S5.C
    public final void close() {
    }

    @Override // S5.C, java.io.Flushable
    public final void flush() {
    }

    @Override // S5.i
    public final C0427g l() {
        return this;
    }
}
