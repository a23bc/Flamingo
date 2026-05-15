package D5;

import B5.q;
import B5.u;
import N3.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m5.AbstractC1209k;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicLongFieldUpdater f1606v = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicLongFieldUpdater f1607w = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1608x = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: y */
    public static final u f1609y = new u("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: o */
    public final int f1610o;

    /* JADX INFO: renamed from: p */
    public final int f1611p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: q */
    public final long f1612q;

    /* JADX INFO: renamed from: r */
    public final String f1613r;

    /* JADX INFO: renamed from: s */
    public final f f1614s;

    /* JADX INFO: renamed from: t */
    public final f f1615t;

    /* JADX INFO: renamed from: u */
    public final q f1616u;

    public c(long j3, String str, int i7, int i8) {
        this.f1610o = i7;
        this.f1611p = i8;
        this.f1612q = j3;
        this.f1613r = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(Z1.l.o(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(Z1.l.p("Max pool size ", i8, i7, " should be greater than or equals to core pool size ").toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(Z1.l.o(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f1614s = new f();
        this.f1615t = new f();
        this.f1616u = new q((i7 + 1) * 2);
        this.controlState$volatile = ((long) i7) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void d(c cVar, Runnable runnable, int i7) {
        cVar.c(runnable, k.f1631g, (i7 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f1616u) {
            try {
                if (f1608x.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1607w;
                long j3 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j3 & 2097151);
                int i8 = i7 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f1610o) {
                    return 0;
                }
                if (i7 >= this.f1611p) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f1616u.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f1616u.c(i9, aVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = i8 + 1;
                aVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, p pVar, boolean z6) {
        i jVar;
        b bVar;
        k.f1630f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f1622o = jNanoTime;
            jVar.f1623p = pVar;
        } else {
            jVar = new j(runnable, jNanoTime, pVar);
        }
        boolean z7 = false;
        boolean z8 = jVar.f1623p.f5144o == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1607w;
        long jAddAndGet = z8 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !AbstractC1209k.a(aVar.f1599v, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f1594q) != b.f1604s && (jVar.f1623p.f5144o != 0 || bVar != b.f1601p)) {
            aVar.f1598u = true;
            m mVar = aVar.f1592o;
            if (z6) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f1633b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f1623p.f5144o == 1 ? this.f1615t.a(jVar) : this.f1614s.a(jVar))) {
                throw new RejectedExecutionException(Z1.l.t(new StringBuilder(), this.f1613r, " was terminated"));
            }
        }
        if (z6 && aVar != null) {
            z7 = true;
        }
        if (z8) {
            if (z7 || i() || h(jAddAndGet)) {
                return;
            }
            i();
            return;
        }
        if (z7 || i() || h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = D5.c.f1608x
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof D5.a
            r3 = 0
            if (r1 == 0) goto L17
            D5.a r0 = (D5.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            D5.c r1 = r0.f1599v
            boolean r1 = m5.AbstractC1209k.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            B5.q r1 = r8.f1616u
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = D5.c.f1607w     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            B5.q r5 = r8.f1616u
            java.lang.Object r5 = r5.b(r1)
            m5.AbstractC1209k.c(r5)
            D5.a r5 = (D5.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            D5.m r5 = r5.f1592o
            D5.f r6 = r8.f1615t
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = D5.m.f1633b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            D5.i r7 = (D5.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            D5.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            D5.f r1 = r8.f1615t
            r1.b()
            D5.f r1 = r8.f1614s
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            D5.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            D5.f r1 = r8.f1614s
            java.lang.Object r1 = r1.d()
            D5.i r1 = (D5.i) r1
            if (r1 != 0) goto Lb2
            D5.f r1 = r8.f1615t
            java.lang.Object r1 = r1.d()
            D5.i r1 = (D5.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            D5.b r1 = D5.b.f1604s
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = D5.c.f1606v
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = D5.c.f1607w
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, 6);
    }

    public final void g(a aVar, int i7, int i8) {
        while (true) {
            long j3 = f1606v.get(this);
            int i9 = (int) (2097151 & j3);
            long j7 = (2097152 + j3) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f1609y) {
                            i9 = -1;
                            break;
                        }
                        if (objC == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i9 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f1606v.compareAndSet(this, j3, ((long) i9) | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean h(long j3) {
        int i7 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f1610o;
        if (i7 < i8) {
            int iB = b();
            if (iB == 1 && i8 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        u uVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1606v;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1616u.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j7 = (2097152 + j3) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    uVar = f1609y;
                    if (objC == uVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j7 | ((long) iB))) {
                    aVar.g(uVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1591w.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f1616u;
        int iA = qVar.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < iA; i12++) {
            a aVar = (a) qVar.b(i12);
            if (aVar != null) {
                m mVar = aVar.f1592o;
                mVar.getClass();
                int i13 = m.f1633b.get(mVar) != null ? (m.f1634c.get(mVar) - m.f1635d.get(mVar)) + 1 : m.f1634c.get(mVar) - m.f1635d.get(mVar);
                int iOrdinal = aVar.f1594q.ordinal();
                if (iOrdinal == 0) {
                    i7++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i9++;
                } else if (iOrdinal == 3) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i11++;
                }
            }
        }
        long j3 = f1607w.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1613r);
        sb4.append('@');
        sb4.append(AbstractC1767D.m(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f1610o;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f1611p);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i7);
        sb4.append(", blocking = ");
        sb4.append(i8);
        sb4.append(", parked = ");
        sb4.append(i9);
        sb4.append(", dormant = ");
        sb4.append(i10);
        sb4.append(", terminated = ");
        sb4.append(i11);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1614s.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1615t.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
