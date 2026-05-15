package E5;

import B5.s;
import B5.u;
import Y4.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w5.I0;
import w5.InterfaceC1791j;

/* JADX INFO: loaded from: classes.dex */
public class i implements f {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2009c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f2010d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2011e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f2012f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2013g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f2014a;

    /* JADX INFO: renamed from: b */
    public final B0.b f2015b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i7) {
        this.f2014a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(n1.c.s(i7, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(n1.c.s(i7, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i7;
        this.f2015b = new B0.b(2, this);
    }

    public final boolean a(I0 i02) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2011e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f2012f.getAndIncrement(this);
        g gVar = g.f2007w;
        long j3 = andIncrement / ((long) j.f2021f);
        loop0: while (true) {
            objB = B5.a.b(kVar, j3, gVar);
            if (!B5.a.e(objB)) {
                s sVarC = B5.a.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
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
        k kVar2 = (k) B5.a.c(objB);
        int i7 = (int) (andIncrement % ((long) j.f2021f));
        AtomicReferenceArray atomicReferenceArray = kVar2.f2022e;
        while (!atomicReferenceArray.compareAndSet(i7, null, i02)) {
            if (atomicReferenceArray.get(i7) != null) {
                u uVar = j.f2017b;
                u uVar2 = j.f2018c;
                while (!atomicReferenceArray.compareAndSet(i7, uVar, uVar2)) {
                    if (atomicReferenceArray.get(i7) != uVar) {
                        return false;
                    }
                }
                if (i02 instanceof InterfaceC1791j) {
                    ((InterfaceC1791j) i02).e(o.f8736a, this.f2015b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + i02).toString());
            }
        }
        i02.a(kVar2, i7);
        return true;
    }

    public final void b() {
        int i7;
        Object objB;
        boolean z6;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2013g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i8 = this.f2014a;
            if (andIncrement >= i8) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i8) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i8));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i8).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2009c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f2010d.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) j.f2021f);
            h hVar = h.f2008w;
            while (true) {
                objB = B5.a.b(kVar, j3, hVar);
                if (B5.a.e(objB)) {
                    break;
                }
                s sVarC = B5.a.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f916c >= sVarC.f916c) {
                        break;
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
            }
            k kVar2 = (k) B5.a.c(objB);
            kVar2.a();
            z6 = false;
            if (kVar2.f916c <= j3) {
                int i9 = (int) (andIncrement2 % ((long) j.f2021f));
                u uVar = j.f2017b;
                AtomicReferenceArray atomicReferenceArray = kVar2.f2022e;
                Object andSet = atomicReferenceArray.getAndSet(i9, uVar);
                if (andSet == null) {
                    int i10 = j.f2016a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (atomicReferenceArray.get(i9) == j.f2018c) {
                            z6 = true;
                            break;
                        }
                    }
                    u uVar2 = j.f2017b;
                    u uVar3 = j.f2019d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i9, uVar2, uVar3)) {
                            if (atomicReferenceArray.get(i9) != uVar2) {
                                break;
                            }
                        } else {
                            z6 = true;
                            break;
                        }
                    }
                    z6 = !z6;
                } else if (andSet != j.f2020e) {
                    if (!(andSet instanceof InterfaceC1791j)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC1791j interfaceC1791j = (InterfaceC1791j) andSet;
                    u uVarM = interfaceC1791j.m(o.f8736a, this.f2015b);
                    if (uVarM != null) {
                        interfaceC1791j.w(uVarM);
                        z6 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z6);
    }
}
