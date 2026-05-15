package S5;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f6796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f6797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Inflater f6798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f6799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CRC32 f6800s;

    public o(E e7) {
        AbstractC1209k.f(e7, "source");
        y yVar = new y(e7);
        this.f6797p = yVar;
        Inflater inflater = new Inflater(true);
        this.f6798q = inflater;
        this.f6799r = new p(yVar, inflater);
        this.f6800s = new CRC32();
    }

    public static void b(String str, int i7, int i8) throws IOException {
        if (i8 != i7) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i7)}, 3)));
        }
    }

    @Override // S5.E
    public final G a() {
        return this.f6797p.f6822o.a();
    }

    public final void c(C0427g c0427g, long j3, long j7) {
        z zVar = c0427g.f6784o;
        AbstractC1209k.c(zVar);
        while (true) {
            int i7 = zVar.f6827c;
            int i8 = zVar.f6826b;
            if (j3 < i7 - i8) {
                break;
            }
            j3 -= (long) (i7 - i8);
            zVar = zVar.f6830f;
            AbstractC1209k.c(zVar);
        }
        while (j7 > 0) {
            int i9 = (int) (((long) zVar.f6826b) + j3);
            int iMin = (int) Math.min(zVar.f6827c - i9, j7);
            this.f6800s.update(zVar.f6825a, i9, iMin);
            j7 -= (long) iMin;
            zVar = zVar.f6830f;
            AbstractC1209k.c(zVar);
            j3 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6799r.close();
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        o oVar = this;
        AbstractC1209k.f(c0427g, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
        }
        if (j3 == 0) {
            return 0L;
        }
        byte b7 = oVar.f6796o;
        CRC32 crc32 = oVar.f6800s;
        y yVar = oVar.f6797p;
        if (b7 == 0) {
            yVar.t(10L);
            C0427g c0427g2 = yVar.f6823p;
            byte bG = c0427g2.g(3L);
            boolean z6 = ((bG >> 1) & 1) == 1;
            if (z6) {
                oVar.c(c0427g2, 0L, 10L);
            }
            b("ID1ID2", 8075, yVar.o());
            yVar.u(8L);
            if (((bG >> 2) & 1) == 1) {
                yVar.t(2L);
                if (z6) {
                    c(c0427g2, 0L, 2L);
                }
                long jT = c0427g2.t() & 65535;
                yVar.t(jT);
                if (z6) {
                    c(c0427g2, 0L, jT);
                }
                yVar.u(jT);
            }
            if (((bG >> 3) & 1) == 1) {
                long jC = yVar.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    c(c0427g2, 0L, jC + 1);
                }
                yVar.u(jC + 1);
            }
            if (((bG >> 4) & 1) == 1) {
                long jC2 = yVar.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC2 == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    oVar = this;
                    oVar.c(c0427g2, 0L, jC2 + 1);
                } else {
                    oVar = this;
                }
                yVar.u(jC2 + 1);
            } else {
                oVar = this;
            }
            if (z6) {
                b("FHCRC", yVar.q(), (short) crc32.getValue());
                crc32.reset();
            }
            oVar.f6796o = (byte) 1;
        }
        if (oVar.f6796o == 1) {
            long j7 = c0427g.f6785p;
            long jK = oVar.f6799r.k(j3, c0427g);
            if (jK != -1) {
                oVar.c(c0427g, j7, jK);
                return jK;
            }
            oVar.f6796o = (byte) 2;
        }
        if (oVar.f6796o == 2) {
            b("CRC", yVar.j(), (int) crc32.getValue());
            b("ISIZE", yVar.j(), (int) oVar.f6798q.getBytesWritten());
            oVar.f6796o = (byte) 3;
            if (!yVar.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
