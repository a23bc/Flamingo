package w5;

import d5.EnumC0830a;
import e5.AbstractC0865c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public class p0 implements InterfaceC1786g0, v0 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19561o = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19562p = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public p0(boolean z6) {
        this._state$volatile = z6 ? AbstractC1767D.f19481j : AbstractC1767D.f19480i;
    }

    public static C1797o X(B5.j jVar) {
        while (jVar.j()) {
            B5.j jVarF = jVar.f();
            if (jVarF == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B5.j.f901p;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (B5.j) obj;
                    if (!jVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.i();
            if (!jVar.j()) {
                if (jVar instanceof C1797o) {
                    return (C1797o) jVar;
                }
                if (jVar instanceof r0) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof n0)) {
            return obj instanceof InterfaceC1774a0 ? ((InterfaceC1774a0) obj).b() ? "Active" : "New" : obj instanceof C1800s ? "Cancelled" : "Completed";
        }
        n0 n0Var = (n0) obj;
        return n0Var.d() ? "Cancelling" : n0Var.f() ? "Completing" : "Active";
    }

    public void A(Object obj) {
        x(obj);
    }

    public final Object B(AbstractC0865c abstractC0865c) throws Throwable {
        Object objO;
        do {
            objO = O();
            if (!(objO instanceof InterfaceC1774a0)) {
                if (objO instanceof C1800s) {
                    throw ((C1800s) objO).f19570a;
                }
                return AbstractC1767D.A(objO);
            }
        } while (c0(objO) < 0);
        l0 l0Var = new l0(I0.c.D(abstractC0865c), this);
        l0Var.r();
        l0Var.u(new C1787h(1, AbstractC1767D.q(this, false, new O(2, l0Var), 3)));
        Object objQ = l0Var.q();
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return objQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:102:0x0008, B:115:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.p0.C(java.lang.Object):boolean");
    }

    public void D(CancellationException cancellationException) {
        C(cancellationException);
    }

    public final boolean E(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        InterfaceC1796n interfaceC1796n = (InterfaceC1796n) f19562p.get(this);
        return (interfaceC1796n == null || interfaceC1796n == t0.f19572o) ? z6 : interfaceC1796n.d(th) || z6;
    }

    public String F() {
        return "Job was cancelled";
    }

    public boolean G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return C(th) && L();
    }

    public final void H(InterfaceC1774a0 interfaceC1774a0, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19562p;
        InterfaceC1796n interfaceC1796n = (InterfaceC1796n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1796n != null) {
            interfaceC1796n.a();
            atomicReferenceFieldUpdater.set(this, t0.f19572o);
        }
        A2.W w7 = null;
        C1800s c1800s = obj instanceof C1800s ? (C1800s) obj : null;
        Throwable th = c1800s != null ? c1800s.f19570a : null;
        if (interfaceC1774a0 instanceof k0) {
            try {
                ((k0) interfaceC1774a0).c(th);
                return;
            } catch (Throwable th2) {
                Q(new A2.W("Exception in completion handler " + interfaceC1774a0 + " for " + this, th2));
                return;
            }
        }
        r0 r0VarE = interfaceC1774a0.e();
        if (r0VarE != null) {
            Object objH = r0VarE.h();
            AbstractC1209k.d(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (B5.j jVarI = (B5.j) objH; !jVarI.equals(r0VarE); jVarI = jVarI.i()) {
                if (jVarI instanceof k0) {
                    k0 k0Var = (k0) jVarI;
                    try {
                        k0Var.c(th);
                    } catch (Throwable th3) {
                        if (w7 != null) {
                            N5.l.k(w7, th3);
                        } else {
                            w7 = new A2.W("Exception in completion handler " + k0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (w7 != null) {
                Q(w7);
            }
        }
    }

    public final Throwable I(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        p0 p0Var = (p0) ((v0) obj);
        Object objO = p0Var.O();
        if (objO instanceof n0) {
            thC = ((n0) objO).c();
        } else if (objO instanceof C1800s) {
            thC = ((C1800s) objO).f19570a;
        } else {
            if (objO instanceof InterfaceC1774a0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objO).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new C1788h0("Parent job is ".concat(d0(objO)), thC, p0Var) : cancellationException;
    }

    public final Object J(n0 n0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thK;
        C1800s c1800s = obj instanceof C1800s ? (C1800s) obj : null;
        Throwable th = c1800s != null ? c1800s.f19570a : null;
        synchronized (n0Var) {
            n0Var.d();
            ArrayList<Throwable> arrayListG = n0Var.g(th);
            thK = K(n0Var, arrayListG);
            if (thK != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != thK && th2 != thK && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        N5.l.k(thK, th2);
                    }
                }
            }
        }
        if (thK != null && thK != th) {
            obj = new C1800s(thK, false);
        }
        if (thK != null && (E(thK) || P(thK))) {
            AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C1800s.f19569b.compareAndSet((C1800s) obj, 0, 1);
        }
        Z(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19561o;
        Object c1776b0 = obj instanceof InterfaceC1774a0 ? new C1776b0((InterfaceC1774a0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n0Var, c1776b0) && atomicReferenceFieldUpdater.get(this) == n0Var) {
        }
        H(n0Var, obj);
        return obj;
    }

    public final Throwable K(n0 n0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (n0Var.d()) {
                return new C1788h0(F(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return this instanceof C1799q;
    }

    public final r0 N(InterfaceC1774a0 interfaceC1774a0) {
        r0 r0VarE = interfaceC1774a0.e();
        if (r0VarE != null) {
            return r0VarE;
        }
        if (interfaceC1774a0 instanceof P) {
            return new r0();
        }
        if (interfaceC1774a0 instanceof k0) {
            b0((k0) interfaceC1774a0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1774a0).toString());
    }

    public final Object O() {
        while (true) {
            Object obj = f19561o.get(this);
            if (!(obj instanceof B5.o)) {
                return obj;
            }
            ((B5.o) obj).a(this);
        }
    }

    public boolean P(Throwable th) {
        return false;
    }

    public final void R(InterfaceC1786g0 interfaceC1786g0) {
        t0 t0Var = t0.f19572o;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19562p;
        if (interfaceC1786g0 == null) {
            atomicReferenceFieldUpdater.set(this, t0Var);
            return;
        }
        interfaceC1786g0.start();
        InterfaceC1796n interfaceC1796nI = interfaceC1786g0.i(this);
        atomicReferenceFieldUpdater.set(this, interfaceC1796nI);
        if (O() instanceof InterfaceC1774a0) {
            return;
        }
        interfaceC1796nI.a();
        atomicReferenceFieldUpdater.set(this, t0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w5.N S(boolean r8, boolean r9, w5.InterfaceC1780d0 r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.p0.S(boolean, boolean, w5.d0):w5.N");
    }

    public boolean T() {
        return this instanceof C1783f;
    }

    public final boolean U(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objE0;
        do {
            objE0 = e0(O(), obj);
            if (objE0 == AbstractC1767D.f19476d) {
                return false;
            }
            if (objE0 == AbstractC1767D.f19477e) {
                return true;
            }
        } while (objE0 == AbstractC1767D.f19478f);
        x(objE0);
        return true;
    }

    public final Object V(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objE0;
        do {
            objE0 = e0(O(), obj);
            if (objE0 == AbstractC1767D.f19476d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1800s c1800s = obj instanceof C1800s ? (C1800s) obj : null;
                throw new IllegalStateException(str, c1800s != null ? c1800s.f19570a : null);
            }
        } while (objE0 == AbstractC1767D.f19478f);
        return objE0;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    public final void Y(r0 r0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objH = r0Var.h();
        AbstractC1209k.d(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        A2.W w7 = null;
        for (B5.j jVarI = (B5.j) objH; !jVarI.equals(r0Var); jVarI = jVarI.i()) {
            if (jVarI instanceof AbstractC1790i0) {
                k0 k0Var = (k0) jVarI;
                try {
                    k0Var.c(th);
                } catch (Throwable th2) {
                    if (w7 != null) {
                        N5.l.k(w7, th2);
                    } else {
                        w7 = new A2.W("Exception in completion handler " + k0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (w7 != null) {
            Q(w7);
        }
        E(th);
    }

    @Override // w5.InterfaceC1786g0
    public boolean b() {
        Object objO = O();
        return (objO instanceof InterfaceC1774a0) && ((InterfaceC1774a0) objO).b();
    }

    public final void b0(k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var = new r0();
        k0Var.getClass();
        B5.j.f901p.set(r0Var, k0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B5.j.f900o;
        atomicReferenceFieldUpdater2.set(r0Var, k0Var);
        loop0: while (true) {
            if (k0Var.h() == k0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(k0Var, k0Var, r0Var)) {
                    if (atomicReferenceFieldUpdater2.get(k0Var) != k0Var) {
                        break;
                    }
                }
                r0Var.g(k0Var);
                break loop0;
            }
            break;
        }
        B5.j jVarI = k0Var.i();
        do {
            atomicReferenceFieldUpdater = f19561o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, jVarI)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k0Var);
    }

    @Override // w5.InterfaceC1786g0
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1788h0(F(), null, this);
        }
        D(cancellationException);
    }

    public final int c0(Object obj) {
        boolean z6 = obj instanceof P;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19561o;
        if (z6) {
            if (((P) obj).f19501o) {
                return 0;
            }
            P p7 = AbstractC1767D.f19481j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            a0();
            return 1;
        }
        if (!(obj instanceof Z)) {
            return 0;
        }
        r0 r0Var = ((Z) obj).f19516o;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        a0();
        return 1;
    }

    public final Object e0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC1774a0)) {
            return AbstractC1767D.f19476d;
        }
        if (((obj instanceof P) || (obj instanceof k0)) && !(obj instanceof C1797o) && !(obj2 instanceof C1800s)) {
            InterfaceC1774a0 interfaceC1774a0 = (InterfaceC1774a0) obj;
            Object c1776b0 = obj2 instanceof InterfaceC1774a0 ? new C1776b0((InterfaceC1774a0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f19561o;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1774a0, c1776b0)) {
                    Z(obj2);
                    H(interfaceC1774a0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC1774a0);
            return AbstractC1767D.f19478f;
        }
        InterfaceC1774a0 interfaceC1774a02 = (InterfaceC1774a0) obj;
        r0 r0VarN = N(interfaceC1774a02);
        if (r0VarN == null) {
            return AbstractC1767D.f19478f;
        }
        C1797o c1797oX = null;
        n0 n0Var = interfaceC1774a02 instanceof n0 ? (n0) interfaceC1774a02 : null;
        if (n0Var == null) {
            n0Var = new n0(r0VarN, null);
        }
        synchronized (n0Var) {
            try {
                if (n0Var.f()) {
                    return AbstractC1767D.f19476d;
                }
                n0.f19552p.set(n0Var, 1);
                if (n0Var != interfaceC1774a02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19561o;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1774a02, n0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC1774a02) {
                            return AbstractC1767D.f19478f;
                        }
                    }
                }
                boolean zD = n0Var.d();
                C1800s c1800s = obj2 instanceof C1800s ? (C1800s) obj2 : null;
                if (c1800s != null) {
                    n0Var.a(c1800s.f19570a);
                }
                Throwable thC = n0Var.c();
                if (zD) {
                    thC = null;
                }
                if (thC != null) {
                    Y(r0VarN, thC);
                }
                C1797o c1797o = interfaceC1774a02 instanceof C1797o ? (C1797o) interfaceC1774a02 : null;
                if (c1797o == null) {
                    r0 r0VarE = interfaceC1774a02.e();
                    if (r0VarE != null) {
                        c1797oX = X(r0VarE);
                    }
                } else {
                    c1797oX = c1797o;
                }
                if (c1797oX != null) {
                    while (AbstractC1767D.q(c1797oX.f19556s, false, new m0(this, n0Var, c1797oX, obj2), 1) == t0.f19572o) {
                        c1797oX = X(c1797oX);
                        if (c1797oX == null) {
                        }
                    }
                    return AbstractC1767D.f19477e;
                }
                return J(n0Var, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c5.g
    public final c5.h getKey() {
        return C1806y.f19581p;
    }

    @Override // w5.InterfaceC1786g0
    public final InterfaceC1786g0 getParent() {
        InterfaceC1796n interfaceC1796n = (InterfaceC1796n) f19562p.get(this);
        if (interfaceC1796n != null) {
            return interfaceC1796n.getParent();
        }
        return null;
    }

    @Override // c5.i
    public final c5.i h(c5.i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // w5.InterfaceC1786g0
    public final InterfaceC1796n i(p0 p0Var) {
        return (InterfaceC1796n) AbstractC1767D.q(this, true, new C1797o(p0Var), 2);
    }

    @Override // w5.InterfaceC1786g0
    public final Object j(AbstractC0865c abstractC0865c) {
        Object objO;
        Y4.o oVar;
        do {
            objO = O();
            boolean z6 = objO instanceof InterfaceC1774a0;
            oVar = Y4.o.f8736a;
            if (!z6) {
                AbstractC1767D.j(abstractC0865c.getContext());
                return oVar;
            }
        } while (c0(objO) < 0);
        C1793k c1793k = new C1793k(1, I0.c.D(abstractC0865c));
        c1793k.r();
        c1793k.u(new C1787h(1, AbstractC1767D.q(this, false, new O(3, c1793k), 3)));
        Object objQ = c1793k.q();
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        if (objQ != enumC0830a) {
            objQ = oVar;
        }
        return objQ == enumC0830a ? objQ : oVar;
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // w5.InterfaceC1786g0
    public final N o(boolean z6, boolean z7, M.r0 r0Var) {
        return S(z6, z7, new C1778c0(r0Var));
    }

    @Override // w5.InterfaceC1786g0
    public final CancellationException q() {
        CancellationException c1788h0;
        Object objO = O();
        if (!(objO instanceof n0)) {
            if (objO instanceof InterfaceC1774a0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objO instanceof C1800s)) {
                return new C1788h0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1800s) objO).f19570a;
            c1788h0 = th instanceof CancellationException ? (CancellationException) th : null;
            return c1788h0 == null ? new C1788h0(F(), th, this) : c1788h0;
        }
        Throwable thC = ((n0) objO).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        c1788h0 = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (c1788h0 == null) {
            if (strConcat == null) {
                strConcat = F();
            }
            c1788h0 = new C1788h0(strConcat, thC, this);
        }
        return c1788h0;
    }

    @Override // w5.InterfaceC1786g0
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(O());
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    @Override // w5.InterfaceC1786g0
    public final N t(InterfaceC1182c interfaceC1182c) {
        return S(false, true, new C1778c0(interfaceC1182c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(W() + '{' + d0(O()) + '}');
        sb.append('@');
        sb.append(AbstractC1767D.m(this));
        return sb.toString();
    }

    @Override // c5.i
    public final c5.i u(c5.h hVar) {
        return I0.c.H(this, hVar);
    }

    public final boolean v(InterfaceC1774a0 interfaceC1774a0, r0 r0Var, k0 k0Var) {
        char c7;
        o0 o0Var = new o0(k0Var, this, interfaceC1774a0);
        do {
            B5.j jVarF = r0Var.f();
            if (jVarF == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B5.j.f901p;
                Object obj = atomicReferenceFieldUpdater.get(r0Var);
                while (true) {
                    jVarF = (B5.j) obj;
                    if (!jVarF.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVarF);
                }
            }
            B5.j.f901p.set(k0Var, jVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B5.j.f900o;
            atomicReferenceFieldUpdater2.set(k0Var, r0Var);
            o0Var.f19558c = r0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(jVarF, r0Var, o0Var)) {
                    c7 = o0Var.a(jVarF) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(jVarF) != r0Var) {
                    c7 = 0;
                    break;
                }
            }
            if (c7 == 1) {
                return true;
            }
        } while (c7 != 2);
        return false;
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    public void a0() {
    }

    public void Q(A2.W w7) {
        throw w7;
    }

    public void Z(Object obj) {
    }

    public void x(Object obj) {
    }
}
