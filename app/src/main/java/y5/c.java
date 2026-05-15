package y5;

import B5.t;
import B5.u;
import d5.EnumC0830a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import w5.AbstractC1767D;
import w5.C1793k;
import w5.I0;
import w5.InterfaceC1791j;

/* JADX INFO: loaded from: classes.dex */
public class c implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20535p = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20536q = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20537r = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20538s = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20539t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20540u = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20541v = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20542w = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20543x = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20544o;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i7) {
        this.f20544o = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(Z1.l.o(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f20546a;
        this.bufferEnd$volatile = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f20537r.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (w()) {
            kVar2 = e.f20546a;
            AbstractC1209k.d(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f20562s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof InterfaceC1791j)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1791j interfaceC1791j = (InterfaceC1791j) obj;
        k kVar = e.f20546a;
        u uVarM = interfaceC1791j.m(Y4.o.f8736a, null);
        if (uVarM == null) {
            return false;
        }
        interfaceC1791j.w(uVarM);
        return true;
    }

    public static final k b(c cVar, long j3, k kVar) {
        Object objB;
        c cVar2;
        cVar.getClass();
        k kVar2 = e.f20546a;
        d dVar = d.f20545w;
        loop0: while (true) {
            objB = B5.a.b(kVar, j3, dVar);
            if (!B5.a.e(objB)) {
                B5.s sVarC = B5.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20539t;
                    B5.s sVar = (B5.s) atomicReferenceFieldUpdater.get(cVar);
                    if (sVar.f916c >= sVarC.f916c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = B5.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20536q;
        if (zE) {
            cVar.j();
            if (kVar.f916c * ((long) e.f20547b) < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) B5.a.c(objB);
            long j7 = kVar3.f916c;
            if (j7 <= j3) {
                return kVar3;
            }
            long j8 = ((long) e.f20547b) * j7;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20535p;
                long j9 = atomicLongFieldUpdater2.get(cVar);
                long j10 = 1152921504606846975L & j9;
                if (j10 >= j8) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (atomicLongFieldUpdater2.compareAndSet(cVar2, j9, j10 + (((long) ((int) (j9 >> 60))) << 60))) {
                    break;
                }
                cVar = cVar2;
            }
            if (j7 * ((long) e.f20547b) < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, C1793k c1793k) {
        cVar.getClass();
        c1793k.resumeWith(android.support.v4.media.session.b.l(cVar.r()));
    }

    public static final int e(c cVar, k kVar, int i7, Object obj, long j3, Object obj2, boolean z6) {
        cVar.getClass();
        kVar.n(i7, obj);
        if (z6) {
            return cVar.D(kVar, i7, obj, j3, obj2, z6);
        }
        Object objL = kVar.l(i7);
        if (objL == null) {
            if (cVar.g(j3)) {
                if (kVar.k(null, i7, e.f20549d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.k(null, i7, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof I0) {
            kVar.n(i7, null);
            if (cVar.A(objL, obj)) {
                kVar.o(i7, e.f20553i);
                return 0;
            }
            u uVar = e.f20555k;
            if (kVar.f20568f.getAndSet((i7 * 2) + 1, uVar) == uVar) {
                return 5;
            }
            kVar.m(i7, true);
            return 5;
        }
        return cVar.D(kVar, i7, obj, j3, obj2, z6);
    }

    public static void t(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20538s;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC1791j)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1791j interfaceC1791j = (InterfaceC1791j) obj;
            k kVar = e.f20546a;
            u uVarM = interfaceC1791j.m(obj2, null);
            if (uVarM == null) {
                return false;
            }
            interfaceC1791j.w(uVarM);
            return true;
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C1793k c1793k = bVar.f20533p;
        AbstractC1209k.c(c1793k);
        bVar.f20533p = null;
        bVar.f20532o = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f20534q.getClass();
        k kVar2 = e.f20546a;
        u uVarM2 = c1793k.m(bool, null);
        if (uVarM2 == null) {
            return false;
        }
        c1793k.w(uVarM2);
        return true;
    }

    public final Object C(k kVar, int i7, long j3, Object obj) {
        Object objL = kVar.l(i7);
        AtomicReferenceArray atomicReferenceArray = kVar.f20568f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20535p;
        if (objL == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f20557n;
                }
                if (kVar.k(objL, i7, obj)) {
                    m();
                    return e.f20556m;
                }
            }
        } else if (objL == e.f20549d && kVar.k(objL, i7, e.f20553i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            kVar.n(i7, null);
            return obj2;
        }
        while (true) {
            Object objL2 = kVar.l(i7);
            if (objL2 == null || objL2 == e.f20550e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.k(objL2, i7, e.h)) {
                        m();
                        return e.f20558o;
                    }
                } else {
                    if (obj == null) {
                        return e.f20557n;
                    }
                    if (kVar.k(objL2, i7, obj)) {
                        m();
                        return e.f20556m;
                    }
                }
            } else if (objL2 != e.f20549d) {
                u uVar = e.f20554j;
                if (objL2 == uVar) {
                    return e.f20558o;
                }
                if (objL2 == e.h) {
                    return e.f20558o;
                }
                if (objL2 == e.l) {
                    m();
                    return e.f20558o;
                }
                if (objL2 != e.f20552g && kVar.k(objL2, i7, e.f20551f)) {
                    boolean z6 = objL2 instanceof s;
                    if (z6) {
                        objL2 = ((s) objL2).f20571a;
                    }
                    if (B(objL2)) {
                        kVar.o(i7, e.f20553i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        kVar.n(i7, null);
                        return obj3;
                    }
                    kVar.o(i7, uVar);
                    kVar.i();
                    if (z6) {
                        m();
                    }
                    return e.f20558o;
                }
            } else if (kVar.k(objL2, i7, e.f20553i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                kVar.n(i7, null);
                return obj4;
            }
        }
    }

    public final int D(k kVar, int i7, Object obj, long j3, Object obj2, boolean z6) {
        while (true) {
            Object objL = kVar.l(i7);
            if (objL == null) {
                if (!g(j3) || z6) {
                    if (z6) {
                        if (kVar.k(null, i7, e.f20554j)) {
                            kVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.k(null, i7, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.k(null, i7, e.f20549d)) {
                    break;
                }
            } else {
                if (objL != e.f20550e) {
                    u uVar = e.f20555k;
                    if (objL == uVar) {
                        kVar.n(i7, null);
                        return 5;
                    }
                    if (objL == e.h) {
                        kVar.n(i7, null);
                        return 5;
                    }
                    if (objL == e.l) {
                        kVar.n(i7, null);
                        j();
                        return 4;
                    }
                    kVar.n(i7, null);
                    if (objL instanceof s) {
                        objL = ((s) objL).f20571a;
                    }
                    if (A(objL, obj)) {
                        kVar.o(i7, e.f20553i);
                        return 0;
                    }
                    if (kVar.f20568f.getAndSet((i7 * 2) + 1, uVar) != uVar) {
                        kVar.m(i7, true);
                    }
                    return 5;
                }
                if (kVar.k(objL, i7, e.f20549d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f20537r;
            if (atomicLongFieldUpdater.get(cVar) > j3) {
                break;
            } else {
                cVar = this;
            }
        }
        int i7 = e.f20548c;
        int i8 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20538s;
            if (i8 < i7) {
                long j7 = atomicLongFieldUpdater.get(cVar);
                if (j7 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j7 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i8++;
                }
            } else {
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j8, (j8 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater.get(cVar);
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    long j11 = j10 & 4611686018427387903L;
                    boolean z6 = (j10 & 4611686018427387904L) != 0;
                    if (j9 == j11 && j9 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (!z6) {
                        atomicLongFieldUpdater2.compareAndSet(this, j10, 4611686018427387904L + j11);
                    }
                    cVar = this;
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j12, j12 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // y5.q
    public final Object a(c5.d dVar) throws Throwable {
        k kVarN;
        c cVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20540u;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20535p;
            if (cVar.u(atomicLongFieldUpdater.get(cVar), true)) {
                Throwable thQ = q();
                int i7 = t.f917a;
                throw thQ;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20536q;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
            long j3 = e.f20547b;
            long j7 = andIncrement / j3;
            int i8 = (int) (andIncrement % j3);
            if (kVar.f916c != j7) {
                k kVarN2 = cVar.n(j7, kVar);
                if (kVarN2 == null) {
                    continue;
                } else {
                    kVar = kVarN2;
                }
            }
            Object objC = cVar.C(kVar, i8, andIncrement, null);
            u uVar = e.f20556m;
            if (objC == uVar) {
                throw new IllegalStateException("unexpected");
            }
            u uVar2 = e.f20558o;
            if (objC != uVar2) {
                if (objC != e.f20557n) {
                    kVar.a();
                    return objC;
                }
                C1793k c1793kO = AbstractC1767D.o(I0.c.D(dVar));
                c cVar2 = this;
                try {
                    Object objC2 = cVar2.C(kVar, i8, andIncrement, c1793kO);
                    if (objC2 == uVar) {
                        c1793kO.a(kVar, i8);
                    } else if (objC2 == uVar2) {
                        if (andIncrement < cVar2.s()) {
                            kVar.a();
                        }
                        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
                        while (true) {
                            if (cVar2.u(atomicLongFieldUpdater.get(cVar2), true)) {
                                c1793kO.resumeWith(android.support.v4.media.session.b.l(cVar2.q()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar2);
                            long j8 = e.f20547b;
                            long j9 = andIncrement2 / j8;
                            int i9 = (int) (andIncrement2 % j8);
                            if (kVar2.f916c != j9) {
                                kVarN = cVar2.n(j9, kVar2);
                                if (kVarN == null) {
                                }
                            } else {
                                kVarN = kVar2;
                            }
                            Object objC3 = cVar2.C(kVarN, i9, andIncrement2, c1793kO);
                            if (objC3 == e.f20556m) {
                                c1793kO.a(kVarN, i9);
                                break;
                            }
                            if (objC3 == e.f20558o) {
                                if (andIncrement2 < s()) {
                                    kVarN.a();
                                }
                                cVar2 = this;
                                kVar2 = kVarN;
                            } else {
                                if (objC3 == e.f20557n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVarN.a();
                                c1793kO.e(objC3, null);
                            }
                        }
                    } else {
                        kVar.a();
                        c1793kO.e(objC2, null);
                    }
                    Object objQ = c1793kO.q();
                    EnumC0830a enumC0830a = EnumC0830a.f11264o;
                    return objQ;
                } catch (Throwable th) {
                    c1793kO.z();
                    throw th;
                }
            }
            if (andIncrement < s()) {
                kVar.a();
            }
            cVar = this;
        }
    }

    @Override // y5.q
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // y5.q
    public final Object f() {
        k kVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20536q;
        long j3 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20535p;
        long j7 = atomicLongFieldUpdater2.get(this);
        if (u(j7, true)) {
            return new h(o());
        }
        long j8 = j7 & 1152921504606846975L;
        i iVar = j.f20566a;
        if (j3 >= j8) {
            return iVar;
        }
        Object obj = e.f20555k;
        k kVar2 = (k) f20540u.get(this);
        while (!u(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = e.f20547b;
            long j10 = andIncrement / j9;
            int i7 = (int) (andIncrement % j9);
            if (kVar2.f916c != j10) {
                k kVarN = n(j10, kVar2);
                if (kVarN == null) {
                    continue;
                } else {
                    kVar = kVarN;
                }
            } else {
                kVar = kVar2;
            }
            Object objC = C(kVar, i7, andIncrement, obj);
            k kVar3 = kVar;
            if (objC == e.f20556m) {
                I0 i02 = obj instanceof I0 ? (I0) obj : null;
                if (i02 != null) {
                    i02.a(kVar3, i7);
                }
                E(andIncrement);
                kVar3.i();
                return iVar;
            }
            if (objC != e.f20558o) {
                if (objC == e.f20557n) {
                    throw new IllegalStateException("unexpected");
                }
                kVar3.a();
                return objC;
            }
            if (andIncrement < s()) {
                kVar3.a();
            }
            kVar2 = kVar3;
        }
        return new h(o());
    }

    public final boolean g(long j3) {
        return j3 < f20537r.get(this) || j3 < f20536q.get(this) + ((long) this.f20544o);
    }

    public final boolean h(Throwable th, boolean z6) {
        c cVar;
        boolean z7;
        long j3;
        long j7;
        long j8;
        Object obj;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20535p;
        if (!z6) {
            cVar = this;
            break;
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                cVar = this;
                break;
            }
            k kVar = e.f20546a;
            cVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j10, (j10 & 1152921504606846975L) + (((long) 1) << 60)));
        u uVar = e.f20562s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20542w;
            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, th)) {
                z7 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                z7 = false;
                break;
            }
        }
        if (z6) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j9, (((long) 3) << 60) + (j9 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j3 >> 60);
                if (i7 == 0) {
                    j7 = j3 & 1152921504606846975L;
                    j8 = 2;
                } else {
                    if (i7 != 1) {
                        break;
                    }
                    j7 = j3 & 1152921504606846975L;
                    j8 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, (j8 << 60) + j7));
        }
        j();
        if (z7) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20543x;
                obj = atomicReferenceFieldUpdater2.get(this);
                u uVar2 = obj == null ? e.f20560q : e.f20561r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, uVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                AbstractC1223y.c(1, obj);
                ((InterfaceC1182c) obj).b(o());
                return z7;
            }
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (y5.k) ((B5.c) B5.c.f884b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y5.k i(long r13) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.i(long):y5.k");
    }

    @Override // y5.q
    public final b iterator() {
        return new b(this);
    }

    public final void j() {
        u(f20535p.get(this), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // y5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = y5.c.f20535p
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.u(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.g(r1)
            r1 = r1 ^ r10
        L1b:
            y5.i r13 = y5.j.f20566a
            if (r1 == 0) goto L20
            return r13
        L20:
            B5.u r6 = y5.e.f20554j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = y5.c.f20539t
            java.lang.Object r1 = r1.get(r15)
            y5.k r1 = (y5.k) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.u(r2, r9)
            int r14 = y5.e.f20547b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f916c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            y5.k r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.r()
            y5.h r2 = new y5.h
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = e(r0, r1, r2, r3, r4, r6, r7)
            Y4.o r3 = Y4.o.f8736a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = y5.c.f20536q
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.r()
            y5.h r2 = new y5.h
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.i()
            java.lang.Throwable r1 = r15.r()
            y5.h r2 = new y5.h
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof w5.I0
            if (r3 == 0) goto Lb2
            w5.I0 r6 = (w5.I0) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.k(java.lang.Object):java.lang.Object");
    }

    public final void l(long j3) {
        k kVar = (k) f20540u.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20536q;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(((long) this.f20544o) + j7, f20537r.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, 1 + j7)) {
                long j8 = e.f20547b;
                long j9 = j7 / j8;
                int i7 = (int) (j7 % j8);
                if (kVar.f916c != j9) {
                    k kVarN = n(j9, kVar);
                    if (kVarN != null) {
                        kVar = kVarN;
                    }
                }
                k kVar2 = kVar;
                if (C(kVar2, i7, j7, null) != e.f20558o || j7 < s()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        t(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.m():void");
    }

    public final k n(long j3, k kVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        k kVar2 = e.f20546a;
        d dVar = d.f20545w;
        loop0: while (true) {
            objB = B5.a.b(kVar, j3, dVar);
            if (!B5.a.e(objB)) {
                B5.s sVarC = B5.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20540u;
                    B5.s sVar = (B5.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f916c >= sVarC.f916c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (B5.a.e(objB)) {
            j();
            if (kVar.f916c * ((long) e.f20547b) < s()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) B5.a.c(objB);
            boolean zW = w();
            long j8 = kVar3.f916c;
            if (!zW && j3 <= f20537r.get(this) / ((long) e.f20547b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20541v;
                    B5.s sVar2 = (B5.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f916c >= j8 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (sVar2.f()) {
                        sVar2.e();
                    }
                }
            }
            if (j8 <= j3) {
                return kVar3;
            }
            long j9 = j8 * ((long) e.f20547b);
            do {
                atomicLongFieldUpdater = f20536q;
                j7 = atomicLongFieldUpdater.get(this);
                if (j7 >= j9) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j9));
            if (j8 * ((long) e.f20547b) < s()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable o() {
        return (Throwable) f20542w.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0173 A[RETURN] */
    @Override // y5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(c5.d r24, java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.p(c5.d, java.lang.Object):java.lang.Object");
    }

    public final Throwable q() {
        Throwable thO = o();
        return thO == null ? new l("Channel was closed") : thO;
    }

    public final Throwable r() {
        Throwable thO = o();
        return thO == null ? new m("Channel was closed") : thO;
    }

    public final long s() {
        return f20535p.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
    
        r16 = r7;
        r3 = (y5.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (y5.k) ((B5.c) B5.c.f884b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(long r15, boolean r17) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.u(long, boolean):boolean");
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j3 = f20537r.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(long r5, y5.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f916c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            B5.c r0 = r7.b()
            y5.k r0 = (y5.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            B5.c r5 = r7.b()
            y5.k r5 = (y5.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = y5.c.f20541v
            java.lang.Object r6 = r5.get(r4)
            B5.s r6 = (B5.s) r6
            long r0 = r6.f916c
            long r2 = r7.f916c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.x(long, y5.k):void");
    }

    public final Object y(c5.d dVar, Object obj) {
        C1793k c1793k = new C1793k(1, I0.c.D(dVar));
        c1793k.r();
        c1793k.resumeWith(android.support.v4.media.session.b.l(r()));
        Object objQ = c1793k.q();
        return objQ == EnumC0830a.f11264o ? objQ : Y4.o.f8736a;
    }

    public final void z(I0 i02, boolean z6) {
        if (i02 instanceof InterfaceC1791j) {
            ((c5.d) i02).resumeWith(android.support.v4.media.session.b.l(z6 ? q() : r()));
            return;
        }
        if (!(i02 instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + i02).toString());
        }
        b bVar = (b) i02;
        C1793k c1793k = bVar.f20533p;
        AbstractC1209k.c(c1793k);
        bVar.f20533p = null;
        bVar.f20532o = e.l;
        Throwable thO = bVar.f20534q.o();
        if (thO == null) {
            c1793k.resumeWith(Boolean.FALSE);
        } else {
            c1793k.resumeWith(android.support.v4.media.session.b.l(thO));
        }
    }
}
