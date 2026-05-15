package w5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: w5.E */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1768E extends V implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: x */
    public static final RunnableC1768E f19483x;

    /* JADX INFO: renamed from: y */
    public static final long f19484y;

    static {
        Long l;
        RunnableC1768E runnableC1768E = new RunnableC1768E();
        f19483x = runnableC1768E;
        runnableC1768E.H(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f19484y = timeUnit.toNanos(l.longValue());
    }

    @Override // w5.W
    public final Thread G() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC1768E.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // w5.W
    public final void K(long j3, T t7) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // w5.V
    public final void L(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.L(runnable);
    }

    public final synchronized void P() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            V.f19508u.set(this, null);
            V.f19509v.set(this, null);
            notifyAll();
        }
    }

    @Override // w5.V, w5.InterfaceC1772I
    public final N g(long j3, D0 d02, c5.i iVar) {
        long j7 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j7 >= 4611686018427387903L) {
            return t0.f19572o;
        }
        long jNanoTime = System.nanoTime();
        S s7 = new S(j7 + jNanoTime, d02);
        O(jNanoTime, s7);
        return s7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zN;
        A0.f19463a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    if (zN) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jI = I();
                    if (jI == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f19484y + jNanoTime;
                        }
                        long j7 = j3 - jNanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            P();
                            if (N()) {
                                return;
                            }
                            G();
                            return;
                        }
                        if (jI > j7) {
                            jI = j7;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (jI > 0) {
                        int i8 = debugStatus;
                        if (i8 == 2 || i8 == 3) {
                            _thread = null;
                            P();
                            if (N()) {
                                return;
                            }
                            G();
                            return;
                        }
                        LockSupport.parkNanos(this, jI);
                    }
                }
            }
        } finally {
            _thread = null;
            P();
            if (!N()) {
                G();
            }
        }
    }

    @Override // w5.V, w5.W
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
