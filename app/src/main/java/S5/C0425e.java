package S5;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: S5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0425e extends G {
    public static final ReentrantLock h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f6778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f6779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f6780k;
    public static C0425e l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0425e f6782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6783g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC1209k.e(conditionNewCondition, "newCondition(...)");
        f6778i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f6779j = millis;
        f6780k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        C0425e c0425e;
        long j3 = this.f6765c;
        boolean z6 = this.f6763a;
        if (j3 != 0 || z6) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f6781e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f6781e = true;
                if (l == null) {
                    l = new C0425e();
                    C0422b c0422b = new C0422b("Okio Watchdog");
                    c0422b.setDaemon(true);
                    c0422b.start();
                }
                long jNanoTime = System.nanoTime();
                if (j3 != 0 && z6) {
                    this.f6783g = Math.min(j3, c() - jNanoTime) + jNanoTime;
                } else if (j3 != 0) {
                    this.f6783g = j3 + jNanoTime;
                } else {
                    if (!z6) {
                        throw new AssertionError();
                    }
                    this.f6783g = c();
                }
                long j7 = this.f6783g - jNanoTime;
                C0425e c0425e2 = l;
                AbstractC1209k.c(c0425e2);
                while (true) {
                    c0425e = c0425e2.f6782f;
                    if (c0425e == null || j7 < c0425e.f6783g - jNanoTime) {
                        break;
                    } else {
                        c0425e2 = c0425e;
                    }
                }
                this.f6782f = c0425e;
                c0425e2.f6782f = this;
                if (c0425e2 == l) {
                    f6778i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.f6781e) {
                return false;
            }
            this.f6781e = false;
            C0425e c0425e = l;
            while (c0425e != null) {
                C0425e c0425e2 = c0425e.f6782f;
                if (c0425e2 == this) {
                    c0425e.f6782f = this.f6782f;
                    this.f6782f = null;
                    return false;
                }
                c0425e = c0425e2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
