package Y3;

import I4.y;
import Z1.l;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f8712r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f8713s = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final N5.d f8714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f8715u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Object f8716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile c f8717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile g f8718q;

    static {
        N5.d fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "q"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "p"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f8714t = fVar;
        if (th != null) {
            f8713s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8715u = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f8718q;
            if (f8714t.n(hVar, gVar, g.f8709c)) {
                while (gVar != null) {
                    Thread thread = gVar.f8710a;
                    if (thread != null) {
                        gVar.f8710a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f8711b;
                }
                do {
                    cVar = hVar.f8717p;
                } while (!f8714t.l(hVar, cVar, c.f8698d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f8701c;
                    cVar3.f8701c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f8701c;
                    Runnable runnable = cVar2.f8699a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f8707o;
                        if (hVar.f8716o == eVar) {
                            if (f8714t.m(hVar, eVar, f(eVar.f8708p))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f8700b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f8713s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f8695b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f8697a);
        }
        if (obj == f8715u) {
            return null;
        }
        return obj;
    }

    public static Object f(y yVar) {
        if (yVar instanceof h) {
            Object obj = ((h) yVar).f8716o;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar = (a) obj;
            return aVar.f8694a ? aVar.f8695b != null ? new a(false, aVar.f8695b) : a.f8693d : obj;
        }
        boolean zIsCancelled = yVar.isCancelled();
        if ((!f8712r) && zIsCancelled) {
            return a.f8693d;
        }
        try {
            Object objG = g(yVar);
            return objG == null ? f8715u : objG;
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new a(false, e7);
            }
            return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + yVar, e7));
        } catch (ExecutionException e8) {
            return new b(e8.getCause());
        } catch (Throwable th) {
            return new b(th);
        }
    }

    public static Object g(y yVar) {
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
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
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
        c cVar = this.f8717p;
        c cVar2 = c.f8698d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f8701c = cVar;
                if (f8714t.l(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f8717p;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f8716o
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof Y3.e
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = Y3.h.f8712r
            if (r3 == 0) goto L1f
            Y3.a r3 = new Y3.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            Y3.a r3 = Y3.a.f8692c
            goto L26
        L24:
            Y3.a r3 = Y3.a.f8693d
        L26:
            r4 = r7
            r5 = r2
        L28:
            N5.d r6 = Y3.h.f8714t
            boolean r6 = r6.m(r4, r0, r3)
            if (r6 == 0) goto L54
            c(r4)
            boolean r4 = r0 instanceof Y3.e
            if (r4 == 0) goto L53
            Y3.e r0 = (Y3.e) r0
            I4.y r0 = r0.f8708p
            boolean r4 = r0 instanceof Y3.h
            if (r4 == 0) goto L50
            r4 = r0
            Y3.h r4 = (Y3.h) r4
            java.lang.Object r0 = r4.f8716o
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof Y3.e
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f8716o
            boolean r6 = r0 instanceof Y3.e
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.h.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z6;
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8716o;
        if ((obj != null) && (!(obj instanceof e))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f8718q;
            g gVar2 = g.f8709c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                z6 = true;
                do {
                    N5.d dVar = f8714t;
                    dVar.R(gVar3, gVar);
                    if (dVar.n(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8716o;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(gVar3);
                    } else {
                        gVar = this.f8718q;
                    }
                } while (gVar != gVar2);
            }
            return e(this.f8716o);
        }
        z6 = true;
        while (nanos > 0) {
            Object obj3 = this.f8716o;
            if ((obj3 != null ? z6 : false) && (!(obj3 instanceof e))) {
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
            boolean z7 = (jConvert == 0 || nanos2 > 1000) ? z6 : false;
            if (jConvert > 0) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f8716o;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            y yVar = ((e) obj).f8708p;
            return l.t(sb, yVar == this ? "this future" : String.valueOf(yVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(g gVar) {
        gVar.f8710a = null;
        while (true) {
            g gVar2 = this.f8718q;
            if (gVar2 == g.f8709c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f8711b;
                if (gVar2.f8710a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f8711b = gVar4;
                    if (gVar3.f8710a == null) {
                        break;
                    }
                } else if (!f8714t.n(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8716o instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f8716o != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f8716o instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e7) {
                strH = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
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
            Object obj2 = this.f8716o;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar = this.f8718q;
            g gVar2 = g.f8709c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    N5.d dVar = f8714t;
                    dVar.R(gVar3, gVar);
                    if (dVar.n(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8716o;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar = this.f8718q;
                } while (gVar != gVar2);
            }
            return e(this.f8716o);
        }
        throw new InterruptedException();
    }
}
