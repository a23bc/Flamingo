package S5;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: d */
    public static final F f6762d = new F();

    /* JADX INFO: renamed from: a */
    public boolean f6763a;

    /* JADX INFO: renamed from: b */
    public long f6764b;

    /* JADX INFO: renamed from: c */
    public long f6765c;

    public G a() {
        this.f6763a = false;
        return this;
    }

    public G b() {
        this.f6765c = 0L;
        return this;
    }

    public long c() {
        if (this.f6763a) {
            return this.f6764b;
        }
        throw new IllegalStateException("No deadline");
    }

    public G d(long j3) {
        this.f6763a = true;
        this.f6764b = j3;
        return this;
    }

    public boolean e() {
        return this.f6763a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f6763a && this.f6764b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public G g(long j3) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1209k.f(timeUnit, "unit");
        if (j3 < 0) {
            throw new IllegalArgumentException(A0.e.D("timeout < 0: ", j3).toString());
        }
        this.f6765c = timeUnit.toNanos(j3);
        return this;
    }
}
