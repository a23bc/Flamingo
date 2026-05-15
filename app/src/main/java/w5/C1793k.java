package w5;

import d5.EnumC0830a;
import e5.InterfaceC0866d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: w5.k */
/* JADX INFO: loaded from: classes.dex */
public class C1793k extends L implements InterfaceC1791j, InterfaceC0866d, I0 {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19539t = AtomicIntegerFieldUpdater.newUpdater(C1793k.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19540u = AtomicReferenceFieldUpdater.newUpdater(C1793k.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19541v = AtomicReferenceFieldUpdater.newUpdater(C1793k.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: r */
    public final c5.d f19542r;

    /* JADX INFO: renamed from: s */
    public final c5.i f19543s;

    public C1793k(int i7, c5.d dVar) {
        super(i7);
        this.f19542r = dVar;
        this.f19543s = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1775b.f19518a;
    }

    public static Object C(u0 u0Var, Object obj, int i7, InterfaceC1182c interfaceC1182c) {
        if (obj instanceof C1800s) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (interfaceC1182c != null || (u0Var instanceof InterfaceC1789i)) {
            return new r(obj, u0Var instanceof InterfaceC1789i ? (InterfaceC1789i) u0Var : null, interfaceC1182c, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(u0 u0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + u0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i7, InterfaceC1182c interfaceC1182c) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19540u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof u0) {
                Object objC = C((u0) obj2, obj, i7, interfaceC1182c);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                o(i7);
                return;
            }
            if (obj2 instanceof C1794l) {
                C1794l c1794l = (C1794l) obj2;
                c1794l.getClass();
                if (C1794l.f19545c.compareAndSet(c1794l, 0, 1)) {
                    if (interfaceC1182c != null) {
                        j(interfaceC1182c, c1794l.f19570a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC1805x abstractC1805x) {
        Y4.o oVar = Y4.o.f8736a;
        c5.d dVar = this.f19542r;
        B5.g gVar = dVar instanceof B5.g ? (B5.g) dVar : null;
        A(oVar, (gVar != null ? gVar.f889r : null) == abstractC1805x ? 4 : this.f19496q, null);
    }

    public final B5.u D(Object obj, InterfaceC1182c interfaceC1182c) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19540u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj2 instanceof u0;
            B5.u uVar = AbstractC1767D.f19473a;
            if (!z6) {
                boolean z7 = obj2 instanceof r;
                return null;
            }
            Object objC = C((u0) obj2, obj, this.f19496q, interfaceC1182c);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                n();
            }
            return uVar;
        }
    }

    @Override // w5.I0
    public final void a(B5.s sVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f19539t;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        u(sVar);
    }

    @Override // w5.L
    public final void b(Object obj, CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19540u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof u0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C1800s) {
                return;
            }
            if (!(obj2 instanceof r)) {
                cancellationException2 = cancellationException;
                r rVar = new r(obj2, (InterfaceC1789i) null, (InterfaceC1182c) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            r rVar2 = (r) obj2;
            if (rVar2.f19568e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            r rVarA = r.a(rVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC1789i interfaceC1789i = rVar2.f19565b;
            if (interfaceC1789i != null) {
                i(interfaceC1789i, cancellationException);
            }
            InterfaceC1182c interfaceC1182c = rVar2.f19566c;
            if (interfaceC1182c != null) {
                j(interfaceC1182c, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // w5.L
    public final c5.d c() {
        return this.f19542r;
    }

    @Override // w5.L
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // w5.InterfaceC1791j
    public final void e(Object obj, InterfaceC1182c interfaceC1182c) {
        A(obj, this.f19496q, interfaceC1182c);
    }

    @Override // w5.L
    public final Object f(Object obj) {
        return obj instanceof r ? ((r) obj).f19564a : obj;
    }

    @Override // e5.InterfaceC0866d
    public final InterfaceC0866d getCallerFrame() {
        c5.d dVar = this.f19542r;
        if (dVar instanceof InterfaceC0866d) {
            return (InterfaceC0866d) dVar;
        }
        return null;
    }

    @Override // c5.d
    public final c5.i getContext() {
        return this.f19543s;
    }

    @Override // w5.L
    public final Object h() {
        return f19540u.get(this);
    }

    public final void i(InterfaceC1789i interfaceC1789i, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            interfaceC1789i.c(th);
        } catch (Throwable th2) {
            AbstractC1767D.p(this.f19543s, new A2.W("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(InterfaceC1182c interfaceC1182c, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            interfaceC1182c.b(th);
        } catch (Throwable th2) {
            AbstractC1767D.p(this.f19543s, new A2.W("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(B5.s sVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        c5.i iVar = this.f19543s;
        int i7 = f19539t.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.h(i7, iVar);
        } catch (Throwable th2) {
            AbstractC1767D.p(iVar, new A2.W("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // w5.InterfaceC1791j
    public final boolean l(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19540u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof u0)) {
                return false;
            }
            C1794l c1794l = new C1794l(this, th, (obj instanceof InterfaceC1789i) || (obj instanceof B5.s));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1794l)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            u0 u0Var = (u0) obj;
            if (u0Var instanceof InterfaceC1789i) {
                i((InterfaceC1789i) obj, th);
            } else if (u0Var instanceof B5.s) {
                k((B5.s) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.f19496q);
            return true;
        }
    }

    @Override // w5.InterfaceC1791j
    public final B5.u m(Object obj, InterfaceC1182c interfaceC1182c) {
        return D(obj, interfaceC1182c);
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19541v;
        N n7 = (N) atomicReferenceFieldUpdater.get(this);
        if (n7 == null) {
            return;
        }
        n7.a();
        atomicReferenceFieldUpdater.set(this, t0.f19572o);
    }

    public final void o(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f19539t;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z6 = i7 == 4;
                c5.d dVar = this.f19542r;
                if (!z6 && (dVar instanceof B5.g)) {
                    boolean z7 = i7 == 1 || i7 == 2;
                    int i10 = this.f19496q;
                    if (z7 == (i10 == 1 || i10 == 2)) {
                        AbstractC1805x abstractC1805x = ((B5.g) dVar).f889r;
                        c5.i context = ((B5.g) dVar).f890s.getContext();
                        if (abstractC1805x.C()) {
                            abstractC1805x.A(context, this);
                            return;
                        }
                        W wA = A0.a();
                        if (wA.f19512q >= 4294967296L) {
                            wA.F(this);
                            return;
                        }
                        wA.H(true);
                        try {
                            AbstractC1767D.w(this, dVar, true);
                            do {
                            } while (wA.J());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC1767D.w(this, dVar, z6);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    public Throwable p(p0 p0Var) {
        return p0Var.q();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        boolean zV = v();
        do {
            atomicIntegerFieldUpdater = f19539t;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zV) {
                    z();
                }
                Object obj = f19540u.get(this);
                if (obj instanceof C1800s) {
                    throw ((C1800s) obj).f19570a;
                }
                int i9 = this.f19496q;
                if (i9 == 1 || i9 == 2) {
                    InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) this.f19543s.n(C1806y.f19581p);
                    if (interfaceC1786g0 != null && !interfaceC1786g0.b()) {
                        CancellationException cancellationExceptionQ = interfaceC1786g0.q();
                        b(obj, cancellationExceptionQ);
                        throw cancellationExceptionQ;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((N) f19541v.get(this)) == null) {
            s();
        }
        if (zV) {
            z();
        }
        return EnumC0830a.f11264o;
    }

    public final void r() {
        N nS = s();
        if (nS == null || (f19540u.get(this) instanceof u0)) {
            return;
        }
        nS.a();
        f19541v.set(this, t0.f19572o);
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        Throwable thA = Y4.k.a(obj);
        if (thA != null) {
            obj = new C1800s(thA, false);
        }
        A(obj, this.f19496q, null);
    }

    public final N s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) this.f19543s.n(C1806y.f19581p);
        if (interfaceC1786g0 == null) {
            return null;
        }
        N nQ = AbstractC1767D.q(interfaceC1786g0, true, new C1795m(this), 2);
        do {
            atomicReferenceFieldUpdater = f19541v;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, nQ)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return nQ;
    }

    public final void t(InterfaceC1182c interfaceC1182c) {
        u(new C1787h(0, interfaceC1182c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC1767D.z(this.f19542r));
        sb.append("){");
        Object obj = f19540u.get(this);
        sb.append(obj instanceof u0 ? "Active" : obj instanceof C1794l ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1767D.m(this));
        return sb.toString();
    }

    public final void u(u0 u0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19540u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1775b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof InterfaceC1789i ? true : obj instanceof B5.s) {
                x(u0Var, obj);
                throw null;
            }
            if (obj instanceof C1800s) {
                C1800s c1800s = (C1800s) obj;
                c1800s.getClass();
                if (!C1800s.f19569b.compareAndSet(c1800s, 0, 1)) {
                    x(u0Var, obj);
                    throw null;
                }
                if (obj instanceof C1794l) {
                    if (!(obj instanceof C1800s)) {
                        c1800s = null;
                    }
                    Throwable th = c1800s != null ? c1800s.f19570a : null;
                    if (u0Var instanceof InterfaceC1789i) {
                        i((InterfaceC1789i) u0Var, th);
                        return;
                    } else {
                        k((B5.s) u0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof r)) {
                if (u0Var instanceof B5.s) {
                    return;
                }
                r rVar = new r(obj, (InterfaceC1789i) u0Var, (InterfaceC1182c) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            r rVar2 = (r) obj;
            if (rVar2.f19565b != null) {
                x(u0Var, obj);
                throw null;
            }
            if (u0Var instanceof B5.s) {
                return;
            }
            InterfaceC1789i interfaceC1789i = (InterfaceC1789i) u0Var;
            Throwable th2 = rVar2.f19568e;
            if (th2 != null) {
                i(interfaceC1789i, th2);
                return;
            }
            r rVarA = r.a(rVar2, interfaceC1789i, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.f19496q != 2) {
            return false;
        }
        c5.d dVar = this.f19542r;
        AbstractC1209k.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return B5.g.f888v.get((B5.g) dVar) != null;
    }

    @Override // w5.InterfaceC1791j
    public final void w(Object obj) {
        o(this.f19496q);
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        c5.d dVar = this.f19542r;
        Throwable th = null;
        B5.g gVar = dVar instanceof B5.g ? (B5.g) dVar : null;
        if (gVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B5.g.f888v;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                B5.u uVar = B5.a.f879d;
                if (obj == uVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != uVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            l(th);
        }
    }
}
