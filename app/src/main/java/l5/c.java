package L5;

import A0.e;
import J5.k;
import J5.n;
import S5.C0427g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f4323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f4324s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, long j3) {
        super(nVar);
        this.f4324s = nVar;
        this.f4323r = j3;
        if (j3 == 0) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4317p) {
            return;
        }
        if (this.f4323r != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!G5.b.f(this)) {
                ((k) this.f4324s.f3809c).l();
                b();
            }
        }
        this.f4317p = true;
    }

    @Override // L5.a, S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        AbstractC1209k.f(c0427g, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(e.D("byteCount < 0: ", j3).toString());
        }
        if (this.f4317p) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f4323r;
        if (j7 == 0) {
            return -1L;
        }
        long jK = super.k(Math.min(j7, j3), c0427g);
        if (jK == -1) {
            ((k) this.f4324s.f3809c).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j8 = this.f4323r - jK;
        this.f4323r = j8;
        if (j8 == 0) {
            b();
        }
        return jK;
    }
}
