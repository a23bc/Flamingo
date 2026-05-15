package S5;

import java.io.EOFException;
import java.nio.ByteBuffer;
import m5.AbstractC1209k;
import u5.AbstractC1539a;

/* JADX INFO: loaded from: classes.dex */
public final class y implements i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E f6822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0427g f6823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6824q;

    public y(E e7) {
        AbstractC1209k.f(e7, "source");
        this.f6822o = e7;
        this.f6823p = new C0427g();
    }

    @Override // S5.E
    public final G a() {
        return this.f6822o.a();
    }

    public final boolean b() {
        if (this.f6824q) {
            throw new IllegalStateException("closed");
        }
        C0427g c0427g = this.f6823p;
        return c0427g.d() && this.f6822o.k(8192L, c0427g) == -1;
    }

    public final long c(byte b7, long j3, long j7) {
        z zVar;
        long j8;
        long j9;
        if (this.f6824q) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (0 > j7) {
            throw new IllegalArgumentException(A0.e.D("fromIndex=0 toIndex=", j7).toString());
        }
        while (jMax < j7) {
            C0427g c0427g = this.f6823p;
            c0427g.getClass();
            long j10 = 0;
            if (0 > jMax || jMax > j7) {
                throw new IllegalArgumentException(("size=" + c0427g.f6785p + " fromIndex=" + jMax + " toIndex=" + j7).toString());
            }
            long j11 = c0427g.f6785p;
            long j12 = j7 > j11 ? j11 : j7;
            if (jMax == j12 || (zVar = c0427g.f6784o) == null) {
                j8 = -1;
                j9 = -1;
            } else if (j11 - jMax < jMax) {
                while (j11 > jMax) {
                    zVar = zVar.f6831g;
                    AbstractC1209k.c(zVar);
                    j11 -= (long) (zVar.f6827c - zVar.f6826b);
                }
                long j13 = jMax;
                while (j11 < j12) {
                    j8 = -1;
                    int iMin = (int) Math.min(zVar.f6827c, (((long) zVar.f6826b) + j12) - j11);
                    for (int i7 = (int) ((((long) zVar.f6826b) + j13) - j11); i7 < iMin; i7++) {
                        if (zVar.f6825a[i7] == b7) {
                            j9 = ((long) (i7 - zVar.f6826b)) + j11;
                            break;
                        }
                    }
                    j13 = j11 + ((long) (zVar.f6827c - zVar.f6826b));
                    zVar = zVar.f6830f;
                    AbstractC1209k.c(zVar);
                    j11 = j13;
                }
                j8 = -1;
                j9 = -1;
            } else {
                j8 = -1;
                while (true) {
                    long j14 = ((long) (zVar.f6827c - zVar.f6826b)) + j10;
                    if (j14 > jMax) {
                        break;
                    }
                    zVar = zVar.f6830f;
                    AbstractC1209k.c(zVar);
                    j10 = j14;
                }
                long j15 = jMax;
                while (j10 < j12) {
                    long j16 = j15;
                    int iMin2 = (int) Math.min(zVar.f6827c, (((long) zVar.f6826b) + j12) - j10);
                    for (int i8 = (int) ((((long) zVar.f6826b) + j16) - j10); i8 < iMin2; i8++) {
                        if (zVar.f6825a[i8] == b7) {
                            j9 = ((long) (i8 - zVar.f6826b)) + j10;
                            break;
                        }
                    }
                    j15 = ((long) (zVar.f6827c - zVar.f6826b)) + j10;
                    zVar = zVar.f6830f;
                    AbstractC1209k.c(zVar);
                    j10 = j15;
                }
                j9 = -1;
            }
            if (j9 != j8) {
                return j9;
            }
            long j17 = c0427g.f6785p;
            if (j17 >= j7 || this.f6822o.k(8192L, c0427g) == j8) {
                return j8;
            }
            jMax = Math.max(jMax, j17);
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f6824q) {
            return;
        }
        this.f6824q = true;
        this.f6822o.close();
        C0427g c0427g = this.f6823p;
        c0427g.w(c0427g.f6785p);
    }

    public final byte d() {
        t(1L);
        return this.f6823p.n();
    }

    @Override // S5.i
    public final boolean f(long j3) {
        C0427g c0427g;
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
        }
        if (this.f6824q) {
            throw new IllegalStateException("closed");
        }
        do {
            c0427g = this.f6823p;
            if (c0427g.f6785p >= j3) {
                return true;
            }
        } while (this.f6822o.k(8192L, c0427g) != -1);
        return false;
    }

    public final j g(long j3) {
        t(j3);
        return this.f6823p.q(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (r13 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        r17 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        r3 = T5.b.f6986a;
        r4 = r3[(r15 >> 4) & 15];
        r3 = r3[r15 & 15];
        r5 = new char[2];
        r5[r21] = r4;
        r5[r16] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new java.lang.String(r5)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.y.h():long");
    }

    public final int i() {
        t(4L);
        return this.f6823p.r();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6824q;
    }

    public final int j() {
        t(4L);
        int iR = this.f6823p.r();
        return ((iR & 255) << 24) | (((-16777216) & iR) >>> 24) | ((16711680 & iR) >>> 8) | ((65280 & iR) << 8);
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) {
        AbstractC1209k.f(c0427g, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
        }
        if (this.f6824q) {
            throw new IllegalStateException("closed");
        }
        C0427g c0427g2 = this.f6823p;
        if (c0427g2.f6785p == 0 && this.f6822o.k(8192L, c0427g2) == -1) {
            return -1L;
        }
        return c0427g2.k(Math.min(j3, c0427g2.f6785p), c0427g);
    }

    @Override // S5.i
    public final C0427g l() {
        return this.f6823p;
    }

    public final long n() throws EOFException {
        char c7;
        char c8;
        char c9;
        char c10;
        long jR;
        t(8L);
        C0427g c0427g = this.f6823p;
        if (c0427g.f6785p < 8) {
            throw new EOFException();
        }
        z zVar = c0427g.f6784o;
        AbstractC1209k.c(zVar);
        int i7 = zVar.f6826b;
        int i8 = zVar.f6827c;
        if (i8 - i7 < 8) {
            jR = ((((long) c0427g.r()) & 4294967295L) << 32) | (4294967295L & ((long) c0427g.r()));
            c9 = '(';
            c10 = '8';
            c7 = '\b';
            c8 = 24;
        } else {
            byte[] bArr = zVar.f6825a;
            c7 = '\b';
            c8 = 24;
            c9 = '(';
            c10 = '8';
            int i9 = i7 + 7;
            long j3 = ((((long) bArr[i7]) & 255) << 56) | ((((long) bArr[i7 + 1]) & 255) << 48) | ((((long) bArr[i7 + 2]) & 255) << 40) | ((((long) bArr[i7 + 3]) & 255) << 32) | ((((long) bArr[i7 + 4]) & 255) << 24) | ((((long) bArr[i7 + 5]) & 255) << 16) | ((((long) bArr[i7 + 6]) & 255) << 8);
            int i10 = i7 + 8;
            long j7 = j3 | (((long) bArr[i9]) & 255);
            c0427g.f6785p -= 8;
            if (i10 == i8) {
                c0427g.f6784o = zVar.a();
                A.a(zVar);
            } else {
                zVar.f6826b = i10;
            }
            jR = j7;
        }
        return ((jR & 255) << c10) | (((-72057594037927936L) & jR) >>> c10) | ((71776119061217280L & jR) >>> c9) | ((280375465082880L & jR) >>> c8) | ((1095216660480L & jR) >>> c7) | ((4278190080L & jR) << c7) | ((16711680 & jR) << c8) | ((65280 & jR) << c9);
    }

    public final short o() {
        t(2L);
        return this.f6823p.s();
    }

    @Override // S5.i
    public final long p(w wVar) {
        C0427g c0427g;
        long j3 = 0;
        while (true) {
            c0427g = this.f6823p;
            if (this.f6822o.k(8192L, c0427g) == -1) {
                break;
            }
            long jB = c0427g.b();
            if (jB > 0) {
                j3 += jB;
                wVar.e(jB, c0427g);
            }
        }
        long j7 = c0427g.f6785p;
        if (j7 <= 0) {
            return j3;
        }
        long j8 = j3 + j7;
        wVar.e(j7, c0427g);
        return j8;
    }

    public final short q() {
        t(2L);
        return this.f6823p.t();
    }

    public final String r(long j3) {
        t(j3);
        C0427g c0427g = this.f6823p;
        c0427g.getClass();
        return c0427g.u(j3, AbstractC1539a.f17313a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1209k.f(byteBuffer, "sink");
        C0427g c0427g = this.f6823p;
        if (c0427g.f6785p == 0 && this.f6822o.k(8192L, c0427g) == -1) {
            return -1;
        }
        return c0427g.read(byteBuffer);
    }

    public final String s(long j3) throws EOFException {
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("limit < 0: ", j3).toString());
        }
        long j7 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long jC = c((byte) 10, 0L, j7);
        C0427g c0427g = this.f6823p;
        if (jC != -1) {
            return T5.a.a(jC, c0427g);
        }
        if (j7 < Long.MAX_VALUE && f(j7) && c0427g.g(j7 - 1) == 13 && f(j7 + 1) && c0427g.g(j7) == 10) {
            return T5.a.a(j7, c0427g);
        }
        C0427g c0427g2 = new C0427g();
        c0427g.c(c0427g2, 0L, Math.min(32, c0427g.f6785p));
        throw new EOFException("\\n not found: limit=" + Math.min(c0427g.f6785p, j3) + " content=" + c0427g2.q(c0427g2.f6785p).d() + (char) 8230);
    }

    public final void t(long j3) {
        if (!f(j3)) {
            throw new EOFException();
        }
    }

    public final String toString() {
        return "buffer(" + this.f6822o + ')';
    }

    public final void u(long j3) {
        if (this.f6824q) {
            throw new IllegalStateException("closed");
        }
        while (j3 > 0) {
            C0427g c0427g = this.f6823p;
            if (c0427g.f6785p == 0 && this.f6822o.k(8192L, c0427g) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j3, c0427g.f6785p);
            c0427g.w(jMin);
            j3 -= jMin;
        }
    }
}
