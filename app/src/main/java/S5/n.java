package S5;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class n extends G {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f6795e;

    @Override // S5.G
    public final G a() {
        return this.f6795e.a();
    }

    @Override // S5.G
    public final G b() {
        return this.f6795e.b();
    }

    @Override // S5.G
    public final long c() {
        return this.f6795e.c();
    }

    @Override // S5.G
    public final G d(long j3) {
        return this.f6795e.d(j3);
    }

    @Override // S5.G
    public final boolean e() {
        return this.f6795e.e();
    }

    @Override // S5.G
    public final void f() throws InterruptedIOException {
        this.f6795e.f();
    }

    @Override // S5.G
    public final G g(long j3) {
        AbstractC1209k.f(TimeUnit.MILLISECONDS, "unit");
        return this.f6795e.g(j3);
    }
}
