package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends W implements InterfaceC1772I {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19508u = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19509v = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19510w = AtomicIntegerFieldUpdater.newUpdater(V.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // w5.AbstractC1805x
    public final void A(c5.i iVar, Runnable runnable) {
        L(runnable);
    }

    @Override // w5.W
    public final long I() {
        T tB;
        T tD;
        if (!J()) {
            U u7 = (U) f19509v.get(this);
            Runnable runnable = null;
            if (u7 != null && B5.x.f925b.get(u7) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (u7) {
                        try {
                            T[] tArr = u7.f926a;
                            T t7 = tArr != null ? tArr[0] : null;
                            if (t7 == null) {
                                tD = null;
                            } else {
                                tD = ((jNanoTime - t7.f19505o) > 0L ? 1 : ((jNanoTime - t7.f19505o) == 0L ? 0 : -1)) >= 0 ? M(t7) : false ? u7.d(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (tD != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19508u;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof B5.m)) {
                    if (obj != AbstractC1767D.f19475c) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop1;
                    }
                    break;
                }
                B5.m mVar = (B5.m) obj;
                Object objD = mVar.d();
                if (objD != B5.m.f907g) {
                    runnable = (Runnable) objD;
                    break;
                }
                B5.m mVarC = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            Z4.k kVar = this.f19514s;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f19508u.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof B5.m) {
                        long j3 = B5.m.f906f.get((B5.m) obj2);
                        if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == AbstractC1767D.f19475c) {
                        return Long.MAX_VALUE;
                    }
                }
                U u8 = (U) f19509v.get(this);
                if (u8 != null && (tB = u8.b()) != null) {
                    long jNanoTime2 = tB.f19505o - System.nanoTime();
                    if (jNanoTime2 >= 0) {
                        return jNanoTime2;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void L(Runnable runnable) {
        if (!M(runnable)) {
            RunnableC1768E.f19483x.L(runnable);
            return;
        }
        Thread threadG = G();
        if (Thread.currentThread() != threadG) {
            LockSupport.unpark(threadG);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0050, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = w5.V.f19508u
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = w5.V.f19510w
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L50
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L67
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof B5.m
            if (r2 == 0) goto L4c
            r2 = r1
            B5.m r2 = (B5.m) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L67
            if (r5 == r4) goto L3a
            r0 = 2
            if (r5 == r0) goto L50
            goto L0
        L3a:
            B5.m r2 = r2.c()
        L3e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L45
            goto L0
        L45:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L3e
            goto L0
        L4c:
            B5.u r2 = w5.AbstractC1767D.f19475c
            if (r1 != r2) goto L51
        L50:
            return r3
        L51:
            B5.m r2 = new B5.m
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L61:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L68
        L67:
            return r4
        L68:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L61
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.V.M(java.lang.Runnable):boolean");
    }

    public final boolean N() {
        U u7;
        Z4.k kVar = this.f19514s;
        if (!(kVar != null ? kVar.isEmpty() : true) || ((u7 = (U) f19509v.get(this)) != null && B5.x.f925b.get(u7) != 0)) {
            return false;
        }
        Object obj = f19508u.get(this);
        if (obj != null) {
            if (obj instanceof B5.m) {
                long j3 = B5.m.f906f.get((B5.m) obj);
                return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
            }
            if (obj != AbstractC1767D.f19475c) {
                return false;
            }
        }
        return true;
    }

    public final void O(long j3, T t7) {
        int iC;
        Thread threadG;
        boolean z6 = f19510w.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19509v;
        if (z6) {
            iC = 1;
        } else {
            U u7 = (U) atomicReferenceFieldUpdater.get(this);
            if (u7 == null) {
                U u8 = new U();
                u8.f19507c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, u8) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC1209k.c(obj);
                u7 = (U) obj;
            }
            iC = t7.c(j3, u7, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                K(j3, t7);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        U u9 = (U) atomicReferenceFieldUpdater.get(this);
        if ((u9 != null ? u9.b() : null) != t7 || Thread.currentThread() == (threadG = G())) {
            return;
        }
        LockSupport.unpark(threadG);
    }

    public N g(long j3, D0 d02, c5.i iVar) {
        return AbstractC1769F.f19488a.g(j3, d02, iVar);
    }

    @Override // w5.W
    public void shutdown() {
        T tD;
        A0.f19463a.set(null);
        f19510w.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19508u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            B5.u uVar = AbstractC1767D.f19475c;
            if (obj != null) {
                if (!(obj instanceof B5.m)) {
                    if (obj != uVar) {
                        B5.m mVar = new B5.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((B5.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (I() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            U u7 = (U) f19509v.get(this);
            if (u7 == null) {
                return;
            }
            synchronized (u7) {
                tD = B5.x.f925b.get(u7) > 0 ? u7.d(0) : null;
            }
            if (tD == null) {
                return;
            } else {
                K(jNanoTime, tD);
            }
        }
    }

    @Override // w5.InterfaceC1772I
    public final void w(long j3, C1793k c1793k) {
        long j7 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j7 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            Q q7 = new Q(this, j7 + jNanoTime, c1793k);
            O(jNanoTime, q7);
            c1793k.u(new C1787h(1, q7));
        }
    }
}
