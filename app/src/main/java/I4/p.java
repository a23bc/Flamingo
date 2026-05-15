package I4;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends J4.a implements y {

    /* JADX INFO: renamed from: r */
    public static final boolean f3524r;

    /* JADX INFO: renamed from: s */
    public static final x f3525s;

    /* JADX INFO: renamed from: t */
    public static final I0.c f3526t;

    /* JADX INFO: renamed from: u */
    public static final Object f3527u;

    /* JADX INFO: renamed from: o */
    public volatile Object f3528o;

    /* JADX INFO: renamed from: p */
    public volatile C0229d f3529p;

    /* JADX INFO: renamed from: q */
    public volatile o f3530q;

    static {
        boolean z6;
        Throwable th;
        I0.c c0232g;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f3524r = z6;
        f3525s = new x(p.class);
        Throwable th2 = null;
        try {
            c0232g = new n();
            th = null;
        } catch (Error | Exception e7) {
            th = e7;
            try {
                c0232g = new C0230e(AtomicReferenceFieldUpdater.newUpdater(o.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(o.class, o.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p.class, o.class, "q"), AtomicReferenceFieldUpdater.newUpdater(p.class, C0229d.class, "p"), AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "o"));
            } catch (Error | Exception e8) {
                th2 = e8;
                c0232g = new C0232g();
            }
        }
        f3526t = c0232g;
        if (th2 != null) {
            x xVar = f3525s;
            Logger loggerA = xVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            xVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f3527u = new Object();
    }

    public static void e(p pVar, boolean z6) {
        C0229d c0229d = null;
        while (true) {
            pVar.getClass();
            for (o oVarX = f3526t.x(pVar); oVarX != null; oVarX = oVarX.f3523b) {
                Thread thread = oVarX.f3522a;
                if (thread != null) {
                    oVarX.f3522a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z6) {
                z6 = false;
            }
            pVar.c();
            C0229d c0229d2 = c0229d;
            C0229d c0229dW = f3526t.w(pVar);
            C0229d c0229d3 = c0229d2;
            while (c0229dW != null) {
                C0229d c0229d4 = c0229dW.f3508c;
                c0229dW.f3508c = c0229d3;
                c0229d3 = c0229dW;
                c0229dW = c0229d4;
            }
            while (c0229d3 != null) {
                c0229d = c0229d3.f3508c;
                Runnable runnable = c0229d3.f3506a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0231f) {
                    RunnableC0231f runnableC0231f = (RunnableC0231f) runnable;
                    pVar = runnableC0231f.f3514o;
                    if (pVar.f3528o == runnableC0231f) {
                        if (f3526t.m(pVar, runnableC0231f, h(runnableC0231f.f3515p))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0229d3.f3507b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                c0229d3 = c0229d;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            f3525s.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof C0226a) {
            RuntimeException runtimeException = ((C0226a) obj).f3501b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C0228c) {
            throw new ExecutionException(((C0228c) obj).f3504a);
        }
        if (obj == f3527u) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(I4.y r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.p.h(I4.y):java.lang.Object");
    }

    public static Object i(y yVar) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = yVar.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            d(sb, objI);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        } catch (Exception e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // I4.y
    public void b(Runnable runnable, Executor executor) {
        C0229d c0229d;
        C0229d c0229d2;
        N5.d.q(executor, "Executor was null.");
        if (!isDone() && (c0229d = this.f3529p) != (c0229d2 = C0229d.f3505d)) {
            C0229d c0229d3 = new C0229d(runnable, executor);
            do {
                c0229d3.f3508c = c0229d;
                if (f3526t.l(this, c0229d, c0229d3)) {
                    return;
                } else {
                    c0229d = this.f3529p;
                }
            } while (c0229d != c0229d2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        C0226a c0226a;
        Object obj = this.f3528o;
        if (!(obj == null) && !(obj instanceof RunnableC0231f)) {
            return false;
        }
        if (f3524r) {
            c0226a = new C0226a(z6, new CancellationException("Future.cancel() was called."));
        } else {
            c0226a = z6 ? C0226a.f3498c : C0226a.f3499d;
            Objects.requireNonNull(c0226a);
        }
        p pVar = this;
        boolean z7 = false;
        while (true) {
            if (f3526t.m(pVar, obj, c0226a)) {
                e(pVar, z6);
                if (!(obj instanceof RunnableC0231f)) {
                    break;
                }
                y yVar = ((RunnableC0231f) obj).f3515p;
                if (!(yVar instanceof h)) {
                    yVar.cancel(z6);
                    break;
                }
                pVar = (p) yVar;
                obj = pVar.f3528o;
                if (!(obj == null) && !(obj instanceof RunnableC0231f)) {
                    break;
                }
                z7 = true;
            } else {
                obj = pVar.f3528o;
                if (!(obj instanceof RunnableC0231f)) {
                    return z7;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z6;
        long j7;
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3528o;
        if ((obj != null) && (!(obj instanceof RunnableC0231f))) {
            return g(obj);
        }
        long j8 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o oVar = this.f3530q;
            o oVar2 = o.f3521c;
            if (oVar != oVar2) {
                o oVar3 = new o();
                z6 = true;
                while (true) {
                    I0.c cVar = f3526t;
                    cVar.M(oVar3, oVar);
                    if (cVar.n(this, oVar, oVar3)) {
                        j7 = j8;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(oVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3528o;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0231f))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(oVar3);
                    } else {
                        long j9 = j8;
                        oVar = this.f3530q;
                        if (oVar == oVar2) {
                            break;
                        }
                        j8 = j9;
                    }
                }
            }
            Object obj3 = this.f3528o;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z6 = true;
        j7 = 0;
        while (nanos > j7) {
            Object obj4 = this.f3528o;
            if ((obj4 != null ? z6 : false) && (!(obj4 instanceof RunnableC0231f))) {
                return g(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strT = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j7) {
            String strT2 = n1.c.t(strT, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z7 = (jConvert == j7 || nanos2 > 1000) ? z6 : false;
            if (jConvert > j7) {
                String strT3 = strT2 + jConvert + " " + lowerCase;
                if (z7) {
                    strT3 = n1.c.t(strT3, ",");
                }
                strT2 = n1.c.t(strT3, " ");
            }
            if (z7) {
                strT2 = strT2 + nanos2 + " nanoseconds ";
            }
            strT = n1.c.t(strT2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(n1.c.t(strT, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strT + " for " + string);
    }

    public boolean isCancelled() {
        return this.f3528o instanceof C0226a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof RunnableC0231f)) & (this.f3528o != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(o oVar) {
        oVar.f3522a = null;
        while (true) {
            o oVar2 = this.f3530q;
            if (oVar2 == o.f3521c) {
                return;
            }
            o oVar3 = null;
            while (oVar2 != null) {
                o oVar4 = oVar2.f3523b;
                if (oVar2.f3522a != null) {
                    oVar3 = oVar2;
                } else if (oVar3 != null) {
                    oVar3.f3523b = oVar4;
                    if (oVar3.f3522a == null) {
                        break;
                    }
                } else if (!f3526t.n(this, oVar2, oVar4)) {
                    break;
                }
                oVar2 = oVar4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = f3527u;
        }
        if (!f3526t.m(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        if (!f3526t.m(this, null, new C0228c(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.p.toString():java.lang.String");
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3528o;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0231f))) {
                return g(obj2);
            }
            o oVar = this.f3530q;
            o oVar2 = o.f3521c;
            if (oVar != oVar2) {
                o oVar3 = new o();
                do {
                    I0.c cVar = f3526t;
                    cVar.M(oVar3, oVar);
                    if (cVar.n(this, oVar, oVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3528o;
                            } else {
                                k(oVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0231f))));
                        return g(obj);
                    }
                    oVar = this.f3530q;
                } while (oVar != oVar2);
            }
            Object obj3 = this.f3528o;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
