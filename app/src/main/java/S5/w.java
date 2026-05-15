package S5;

import java.nio.ByteBuffer;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC0428h {

    /* JADX INFO: renamed from: o */
    public final C f6818o;

    /* JADX INFO: renamed from: p */
    public final C0427g f6819p;

    /* JADX INFO: renamed from: q */
    public boolean f6820q;

    public w(C c7) {
        AbstractC1209k.f(c7, "sink");
        this.f6818o = c7;
        this.f6819p = new C0427g();
    }

    @Override // S5.C
    public final G a() {
        return this.f6818o.a();
    }

    public final InterfaceC0428h b() {
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        C0427g c0427g = this.f6819p;
        long jB = c0427g.b();
        if (jB > 0) {
            this.f6818o.e(jB, c0427g);
        }
        return this;
    }

    public final InterfaceC0428h c(long j3) {
        boolean z6;
        byte[] bArr;
        long j7 = j3;
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        C0427g c0427g = this.f6819p;
        c0427g.getClass();
        long j8 = 0;
        if (j7 == 0) {
            c0427g.D(48);
        } else {
            int i7 = 1;
            if (j7 < 0) {
                j7 = -j7;
                if (j7 < 0) {
                    c0427g.G("-9223372036854775808");
                } else {
                    z6 = true;
                }
            } else {
                z6 = false;
            }
            if (j7 >= 100000000) {
                i7 = j7 < 1000000000000L ? j7 < 10000000000L ? j7 < 1000000000 ? 9 : 10 : j7 < 100000000000L ? 11 : 12 : j7 < 1000000000000000L ? j7 < 10000000000000L ? 13 : j7 < 100000000000000L ? 14 : 15 : j7 < 100000000000000000L ? j7 < 10000000000000000L ? 16 : 17 : j7 < 1000000000000000000L ? 18 : 19;
            } else if (j7 >= 10000) {
                i7 = j7 < 1000000 ? j7 < 100000 ? 5 : 6 : j7 < 10000000 ? 7 : 8;
            } else if (j7 >= 100) {
                i7 = j7 < 1000 ? 3 : 4;
            } else if (j7 >= 10) {
                i7 = 2;
            }
            if (z6) {
                i7++;
            }
            z zVarZ = c0427g.z(i7);
            int i8 = zVarZ.f6827c + i7;
            while (true) {
                bArr = zVarZ.f6825a;
                if (j7 == j8) {
                    break;
                }
                long j9 = 10;
                i8--;
                bArr[i8] = T5.a.f6985a[(int) (j7 % j9)];
                j7 /= j9;
                j8 = 0;
            }
            if (z6) {
                bArr[i8 - 1] = 45;
            }
            zVarZ.f6827c += i7;
            c0427g.f6785p += (long) i7;
        }
        b();
        return this;
    }

    @Override // S5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C c7 = this.f6818o;
        if (this.f6820q) {
            return;
        }
        try {
            C0427g c0427g = this.f6819p;
            long j3 = c0427g.f6785p;
            if (j3 > 0) {
                c7.e(j3, c0427g);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c7.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f6820q = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC0428h d(int i7) {
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        this.f6819p.F(i7);
        b();
        return this;
    }

    @Override // S5.C
    public final void e(long j3, C0427g c0427g) {
        AbstractC1209k.f(c0427g, "source");
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        this.f6819p.e(j3, c0427g);
        b();
    }

    @Override // S5.C, java.io.Flushable
    public final void flush() {
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        C0427g c0427g = this.f6819p;
        long j3 = c0427g.f6785p;
        C c7 = this.f6818o;
        if (j3 > 0) {
            c7.e(j3, c0427g);
        }
        c7.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6820q;
    }

    @Override // S5.InterfaceC0428h
    public final InterfaceC0428h m(int i7) {
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        this.f6819p.D(i7);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f6818o + ')';
    }

    @Override // S5.InterfaceC0428h
    public final InterfaceC0428h v(String str) {
        AbstractC1209k.f(str, "string");
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        this.f6819p.G(str);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1209k.f(byteBuffer, "source");
        if (this.f6820q) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f6819p.write(byteBuffer);
        b();
        return iWrite;
    }
}
