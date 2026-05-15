package S5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class p implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y f6801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Inflater f6802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6804r;

    public p(y yVar, Inflater inflater) {
        this.f6801o = yVar;
        this.f6802p = inflater;
    }

    @Override // S5.E
    public final G a() {
        return this.f6801o.f6822o.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6804r) {
            return;
        }
        this.f6802p.end();
        this.f6804r = true;
        this.f6801o.close();
    }

    @Override // S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        long j7;
        AbstractC1209k.f(c0427g, "sink");
        while (j3 >= 0) {
            if (this.f6804r) {
                throw new IllegalStateException("closed");
            }
            y yVar = this.f6801o;
            Inflater inflater = this.f6802p;
            if (j3 == 0) {
                j7 = 0;
            } else {
                try {
                    z zVarZ = c0427g.z(1);
                    int iMin = (int) Math.min(j3, 8192 - zVarZ.f6827c);
                    if (inflater.needsInput() && !yVar.b()) {
                        z zVar = yVar.f6823p.f6784o;
                        AbstractC1209k.c(zVar);
                        int i7 = zVar.f6827c;
                        int i8 = zVar.f6826b;
                        int i9 = i7 - i8;
                        this.f6803q = i9;
                        inflater.setInput(zVar.f6825a, i8, i9);
                    }
                    int iInflate = inflater.inflate(zVarZ.f6825a, zVarZ.f6827c, iMin);
                    int i10 = this.f6803q;
                    if (i10 != 0) {
                        int remaining = i10 - inflater.getRemaining();
                        this.f6803q -= remaining;
                        yVar.u(remaining);
                    }
                    if (iInflate > 0) {
                        zVarZ.f6827c += iInflate;
                        j7 = iInflate;
                        c0427g.f6785p += j7;
                    } else {
                        if (zVarZ.f6826b == zVarZ.f6827c) {
                            c0427g.f6784o = zVarZ.a();
                            A.a(zVarZ);
                        }
                        j7 = 0;
                    }
                } catch (DataFormatException e7) {
                    throw new IOException(e7);
                }
            }
            if (j7 > 0) {
                return j7;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (yVar.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(A0.e.D("byteCount < 0: ", j3).toString());
    }
}
