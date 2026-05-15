package A2;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0006g f411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.o f413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f417g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f418i;

    public r0(p0 p0Var, AbstractC0006g abstractC0006g, t2.h0 h0Var, int i7, w2.o oVar, Looper looper) {
        this.f412b = p0Var;
        this.f411a = abstractC0006g;
        this.f416f = looper;
        this.f413c = oVar;
    }

    public final synchronized void a(long j3) {
        boolean z6;
        AbstractC1697a.i(this.f417g);
        AbstractC1697a.i(this.f416f.getThread() != Thread.currentThread());
        this.f413c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j3;
        while (true) {
            z6 = this.f418i;
            if (z6 || j3 <= 0) {
                break;
            }
            this.f413c.getClass();
            wait(j3);
            this.f413c.getClass();
            j3 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z6) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z6) {
        this.h = z6 | this.h;
        this.f418i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC1697a.i(!this.f417g);
        this.f417g = true;
        V v3 = (V) this.f412b;
        synchronized (v3) {
            if (!v3.f180N && v3.f206x.getThread().isAlive()) {
                v3.f204v.a(14, this).b();
                return;
            }
            AbstractC1697a.w("Ignoring messages sent after release.");
            b(false);
        }
    }
}
