package s1;

import I4.y;
import java.util.Locale;
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
import k.AbstractC1113a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f15856r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f15857s = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC1113a f15858t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f15859u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Object f15860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile c f15861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile f f15862q;

    static {
        AbstractC1113a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "q"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "p"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f15858t = eVar;
        if (th != null) {
            f15857s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15859u = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f15862q;
        } while (!f15858t.v(gVar, fVar, f.f15853c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f15854a;
            if (thread != null) {
                fVar.f15854a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f15855b;
        }
        do {
            cVar2 = gVar.f15861p;
        } while (!f15858t.t(gVar, cVar2, c.f15844d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f15847c;
            cVar.f15847c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f15847c;
            d(cVar3.f15845a, cVar3.f15846b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f15857s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f15843a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f15859u) {
            return null;
        }
        return obj;
    }

    public static Object f(y yVar) {
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
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // I4.y
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f15861p;
        c cVar2 = c.f15844d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f15847c = cVar;
                if (f15858t.t(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f15861p;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f15860o;
        if (obj != null) {
            return false;
        }
        if (!f15858t.u(this, obj, f15856r ? new a(z6, new CancellationException("Future.cancel() was called.")) : z6 ? a.f15841b : a.f15842c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void g(f fVar) {
        fVar.f15854a = null;
        while (true) {
            f fVar2 = this.f15862q;
            if (fVar2 == f.f15853c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f15855b;
                if (fVar2.f15854a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f15855b = fVar4;
                    if (fVar3.f15854a == null) {
                        break;
                    }
                } else if (!f15858t.v(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15860o;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f15862q;
            f fVar2 = f.f15853c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC1113a abstractC1113a = f15858t;
                    abstractC1113a.K(fVar3, fVar);
                    if (abstractC1113a.v(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15860o;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(fVar3);
                    } else {
                        fVar = this.f15862q;
                    }
                } while (fVar != fVar2);
            }
            return e(this.f15860o);
        }
        while (nanos > 0) {
            Object obj3 = this.f15860o;
            if (obj3 != null) {
                return e(obj3);
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
        if (nanos + 1000 < 0) {
            String strT2 = n1.c.t(strT, " (plus ");
            long j7 = -nanos;
            long jConvert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strT3 = strT2 + jConvert + " " + lowerCase;
                if (z6) {
                    strT3 = n1.c.t(strT3, ",");
                }
                strT2 = n1.c.t(strT3, " ");
            }
            if (z6) {
                strT2 = strT2 + nanos2 + " nanoseconds ";
            }
            strT = n1.c.t(strT2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(n1.c.t(strT, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strT + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15860o instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15860o != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15860o instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15860o;
            if (obj2 != null) {
                return e(obj2);
            }
            f fVar = this.f15862q;
            f fVar2 = f.f15853c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC1113a abstractC1113a = f15858t;
                    abstractC1113a.K(fVar3, fVar);
                    if (abstractC1113a.v(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15860o;
                            } else {
                                g(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    fVar = this.f15862q;
                } while (fVar != fVar2);
            }
            return e(this.f15860o);
        }
        throw new InterruptedException();
    }
}
