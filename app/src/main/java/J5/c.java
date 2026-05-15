package J5;

import S5.C0427g;
import S5.E;
import java.io.IOException;
import java.net.ProtocolException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends S5.m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B0.a f3753u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B0.a aVar, E e7, long j3) {
        super(e7);
        AbstractC1209k.f(e7, "delegate");
        this.f3753u = aVar;
        this.f3748p = j3;
        this.f3750r = true;
        if (j3 == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f3751s) {
            return iOException;
        }
        this.f3751s = true;
        B0.a aVar = this.f3753u;
        if (iOException == null && this.f3750r) {
            this.f3750r = false;
            aVar.getClass();
            AbstractC1209k.f((h) aVar.f606b, "call");
        }
        if (iOException != null) {
            aVar.i(iOException);
        }
        h hVar = (h) aVar.f606b;
        if (iOException != null) {
            AbstractC1209k.f(hVar, "call");
        } else {
            AbstractC1209k.f(hVar, "call");
        }
        return hVar.g(aVar, false, true, iOException);
    }

    @Override // S5.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3752t) {
            return;
        }
        this.f3752t = true;
        try {
            super.close();
            b(null);
        } catch (IOException e7) {
            throw b(e7);
        }
    }

    @Override // S5.m, S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        AbstractC1209k.f(c0427g, "sink");
        if (this.f3752t) {
            throw new IllegalStateException("closed");
        }
        try {
            long jK = this.f6794o.k(j3, c0427g);
            if (this.f3750r) {
                this.f3750r = false;
                B0.a aVar = this.f3753u;
                aVar.getClass();
                AbstractC1209k.f((h) aVar.f606b, "call");
            }
            if (jK == -1) {
                b(null);
                return -1L;
            }
            long j7 = this.f3749q + jK;
            long j8 = this.f3748p;
            if (j8 == -1 || j7 <= j8) {
                this.f3749q = j7;
                if (j7 == j8) {
                    b(null);
                }
                return jK;
            }
            throw new ProtocolException("expected " + j8 + " bytes but received " + j7);
        } catch (IOException e7) {
            throw b(e7);
        }
    }
}
