package S5;

import java.io.IOException;
import java.io.InputStream;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class x extends InputStream {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y f6821o;

    public x(y yVar) {
        this.f6821o = yVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        y yVar = this.f6821o;
        if (yVar.f6824q) {
            throw new IOException("closed");
        }
        return (int) Math.min(yVar.f6823p.f6785p, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6821o.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        y yVar = this.f6821o;
        if (yVar.f6824q) {
            throw new IOException("closed");
        }
        C0427g c0427g = yVar.f6823p;
        if (c0427g.f6785p == 0 && yVar.f6822o.k(8192L, c0427g) == -1) {
            return -1;
        }
        return c0427g.n() & 255;
    }

    public final String toString() {
        return this.f6821o + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        AbstractC1209k.f(bArr, "data");
        y yVar = this.f6821o;
        if (!yVar.f6824q) {
            AbstractC1267a.o(bArr.length, i7, i8);
            C0427g c0427g = yVar.f6823p;
            if (c0427g.f6785p == 0 && yVar.f6822o.k(8192L, c0427g) == -1) {
                return -1;
            }
            return c0427g.j(bArr, i7, i8);
        }
        throw new IOException("closed");
    }
}
