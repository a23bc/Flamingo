package w5;

import d5.EnumC0830a;
import e5.AbstractC0863a;
import e5.AbstractC0865c;
import e5.AbstractC0871i;
import e5.InterfaceC0866d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: renamed from: w5.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1767D {

    /* JADX INFO: renamed from: a */
    public static final B5.u f19473a = new B5.u("RESUME_TOKEN", 0);

    /* JADX INFO: renamed from: b */
    public static final B5.u f19474b = new B5.u("REMOVED_TASK", 0);

    /* JADX INFO: renamed from: c */
    public static final B5.u f19475c = new B5.u("CLOSED_EMPTY", 0);

    /* JADX INFO: renamed from: d */
    public static final B5.u f19476d = new B5.u("COMPLETING_ALREADY", 0);

    /* JADX INFO: renamed from: e */
    public static final B5.u f19477e = new B5.u("COMPLETING_WAITING_CHILDREN", 0);

    /* JADX INFO: renamed from: f */
    public static final B5.u f19478f = new B5.u("COMPLETING_RETRY", 0);

    /* JADX INFO: renamed from: g */
    public static final B5.u f19479g = new B5.u("TOO_LATE_TO_CANCEL", 0);
    public static final B5.u h = new B5.u("SEALED", 0);

    /* JADX INFO: renamed from: i */
    public static final P f19480i = new P(false);

    /* JADX INFO: renamed from: j */
    public static final P f19481j = new P(true);

    public static final Object A(Object obj) {
        InterfaceC1774a0 interfaceC1774a0;
        C1776b0 c1776b0 = obj instanceof C1776b0 ? (C1776b0) obj : null;
        return (c1776b0 == null || (interfaceC1774a0 = c1776b0.f19519a) == null) ? obj : interfaceC1774a0;
    }

    public static final G0 B(c5.d dVar, c5.i iVar, Object obj) {
        G0 g02 = null;
        if ((dVar instanceof InterfaceC0866d) && iVar.n(H0.f19491o) != null) {
            InterfaceC0866d callerFrame = (InterfaceC0866d) dVar;
            while (true) {
                if ((callerFrame instanceof K) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof G0) {
                    g02 = (G0) callerFrame;
                    break;
                }
            }
            if (g02 != null) {
                g02.j0(iVar, obj);
            }
        }
        return g02;
    }

    public static final Object C(c5.i iVar, l5.e eVar, c5.d dVar) {
        Object objA;
        c5.i context = dVar.getContext();
        c5.i iVarH = !((Boolean) iVar.y(Boolean.FALSE, C1802u.f19574r)).booleanValue() ? context.h(iVar) : k(context, iVar, false);
        j(iVarH);
        if (iVarH == context) {
            B5.r rVar = new B5.r(dVar, iVarH);
            objA = N5.d.V(rVar, rVar, eVar);
        } else {
            c5.e eVar2 = c5.e.f10684o;
            if (AbstractC1209k.a(iVarH.n(eVar2), context.n(eVar2))) {
                G0 g02 = new G0(dVar, iVarH);
                c5.i iVar2 = g02.f19517q;
                Object objM = B5.a.m(iVar2, null);
                try {
                    Object objV = N5.d.V(g02, g02, eVar);
                    B5.a.g(iVar2, objM);
                    objA = objV;
                } catch (Throwable th) {
                    B5.a.g(iVar2, objM);
                    throw th;
                }
            } else {
                K k7 = new K(dVar, iVarH);
                M3.a.i0(eVar, k7, k7);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = K.f19495s;
                    int i7 = atomicIntegerFieldUpdater.get(k7);
                    if (i7 != 0) {
                        if (i7 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objA = A(k7.O());
                        if (objA instanceof C1800s) {
                            throw ((C1800s) objA).f19570a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(k7, 0, 1)) {
                        objA = EnumC0830a.f11264o;
                        break;
                    }
                }
            }
        }
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(long r6, l5.e r8, e5.AbstractC0865c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof w5.E0
            if (r0 == 0) goto L13
            r0 = r9
            w5.E0 r0 = (w5.E0) r0
            int r1 = r0.f19487q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19487q = r1
            goto L18
        L13:
            w5.E0 r0 = new w5.E0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19486p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f19487q
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            m5.v r6 = r0.f19485o
            android.support.v4.media.session.b.K(r9)     // Catch: w5.C0 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            android.support.v4.media.session.b.K(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5d
        L3d:
            m5.v r9 = new m5.v
            r9.<init>()
            r0.f19485o = r9     // Catch: w5.C0 -> L55
            r0.f19487q = r3     // Catch: w5.C0 -> L55
            w5.D0 r2 = new w5.D0     // Catch: w5.C0 -> L55
            r2.<init>(r6, r0)     // Catch: w5.C0 -> L55
            r9.f14439o = r2     // Catch: w5.C0 -> L55
            java.lang.Object r6 = y(r2, r8)     // Catch: w5.C0 -> L55
            if (r6 != r1) goto L54
            return r1
        L54:
            return r6
        L55:
            r7 = move-exception
            r6 = r9
        L57:
            w5.D0 r8 = r7.f19472o
            java.lang.Object r6 = r6.f14439o
            if (r8 != r6) goto L5f
        L5d:
            r6 = 0
            return r6
        L5f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.AbstractC1767D.D(long, l5.e, e5.c):java.lang.Object");
    }

    public static final B5.d a(c5.i iVar) {
        if (iVar.n(C1806y.f19581p) == null) {
            iVar = iVar.h(b());
        }
        return new B5.d(iVar);
    }

    public static C1792j0 b() {
        return new C1792j0(null);
    }

    public static y0 c() {
        return new y0(null);
    }

    public static C1771H d(InterfaceC1765B interfaceC1765B, x5.d dVar, l5.e eVar, int i7) {
        c5.i iVar = dVar;
        if ((i7 & 1) != 0) {
            iVar = c5.j.f10685o;
        }
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        c5.i iVarU = u(interfaceC1765B, iVar);
        EnumC1766C enumC1766C2 = EnumC1766C.f19467o;
        C1771H c1771h = new C1771H(iVarU, true);
        c1771h.h0(enumC1766C, c1771h, eVar);
        return c1771h;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(e5.AbstractC0865c r4) {
        /*
            boolean r0 = r4 instanceof w5.J
            if (r0 == 0) goto L13
            r0 = r4
            w5.J r0 = (w5.J) r0
            int r1 = r0.f19493p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19493p = r1
            goto L18
        L13:
            w5.J r0 = new w5.J
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f19492o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f19493p
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            android.support.v4.media.session.b.K(r4)
            goto L47
        L2f:
            android.support.v4.media.session.b.K(r4)
            r0.f19493p = r3
            w5.k r4 = new w5.k
            c5.d r0 = I0.c.D(r0)
            r4.<init>(r3, r0)
            r4.r()
            java.lang.Object r4 = r4.q()
            if (r4 != r1) goto L47
            return
        L47:
            A2.W r4 = new A2.W
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.AbstractC1767D.e(e5.c):void");
    }

    public static final void f(InterfaceC1765B interfaceC1765B, CancellationException cancellationException) {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) interfaceC1765B.g().n(C1806y.f19581p);
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC1765B).toString());
        }
    }

    public static final Object g(InterfaceC1786g0 interfaceC1786g0, AbstractC0871i abstractC0871i) {
        interfaceC1786g0.c(null);
        Object objJ = interfaceC1786g0.j(abstractC0871i);
        return objJ == EnumC0830a.f11264o ? objJ : Y4.o.f8736a;
    }

    public static final Object h(l5.e eVar, c5.d dVar) {
        B5.r rVar = new B5.r(dVar, dVar.getContext());
        Object objV = N5.d.V(rVar, rVar, eVar);
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return objV;
    }

    public static final Object i(long j3, c5.d dVar) {
        Y4.o oVar = Y4.o.f8736a;
        if (j3 > 0) {
            C1793k c1793k = new C1793k(1, I0.c.D(dVar));
            c1793k.r();
            if (j3 < Long.MAX_VALUE) {
                l(c1793k.f19543s).w(j3, c1793k);
            }
            Object objQ = c1793k.q();
            if (objQ == EnumC0830a.f11264o) {
                return objQ;
            }
        }
        return oVar;
    }

    public static final void j(c5.i iVar) {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) iVar.n(C1806y.f19581p);
        if (interfaceC1786g0 != null && !interfaceC1786g0.b()) {
            throw interfaceC1786g0.q();
        }
    }

    public static final c5.i k(c5.i iVar, c5.i iVar2, boolean z6) {
        Boolean bool = Boolean.FALSE;
        C1802u c1802u = C1802u.f19574r;
        boolean zBooleanValue = ((Boolean) iVar.y(bool, c1802u)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.y(bool, c1802u)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.h(iVar2);
        }
        c5.j jVar = c5.j.f10685o;
        c5.i iVar3 = (c5.i) iVar.y(jVar, new C1802u(2, 2));
        Object objY = iVar2;
        if (zBooleanValue2) {
            objY = iVar2.y(jVar, C1802u.f19573q);
        }
        return iVar3.h((c5.i) objY);
    }

    public static final InterfaceC1772I l(c5.i iVar) {
        c5.g gVarN = iVar.n(c5.e.f10684o);
        InterfaceC1772I interfaceC1772I = gVarN instanceof InterfaceC1772I ? (InterfaceC1772I) gVarN : null;
        return interfaceC1772I == null ? AbstractC1769F.f19488a : interfaceC1772I;
    }

    public static final String m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC1786g0 n(c5.i iVar) {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) iVar.n(C1806y.f19581p);
        if (interfaceC1786g0 != null) {
            return interfaceC1786g0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C1793k o(c5.d dVar) {
        C1793k c1793k;
        C1793k c1793k2;
        if (!(dVar instanceof B5.g)) {
            return new C1793k(1, dVar);
        }
        B5.g gVar = (B5.g) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B5.g.f888v;
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            B5.u uVar = B5.a.f879d;
            c1793k = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, uVar);
                c1793k2 = null;
                break;
            }
            if (obj instanceof C1793k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                c1793k2 = (C1793k) obj;
                break loop0;
            }
            if (obj != uVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1793k2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1793k.f19540u;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1793k2);
            if (!(obj2 instanceof r) || ((r) obj2).f19567d == null) {
                C1793k.f19539t.set(c1793k2, 536870911);
                atomicReferenceFieldUpdater2.set(c1793k2, C1775b.f19518a);
                c1793k = c1793k2;
            } else {
                c1793k2.n();
            }
            if (c1793k != null) {
                return c1793k;
            }
        }
        return new C1793k(2, dVar);
    }

    public static final void p(c5.i iVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            InterfaceC1807z interfaceC1807z = (InterfaceC1807z) iVar.n(C1806y.f19580o);
            if (interfaceC1807z != null) {
                interfaceC1807z.z(iVar, th);
            } else {
                B5.a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                N5.l.k(runtimeException, th);
                th = runtimeException;
            }
            B5.a.d(iVar, th);
        }
    }

    public static N q(InterfaceC1786g0 interfaceC1786g0, boolean z6, k0 k0Var, int i7) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        boolean z7 = (i7 & 2) != 0;
        return interfaceC1786g0 instanceof p0 ? ((p0) interfaceC1786g0).S(z6, z7, k0Var) : interfaceC1786g0.o(z6, z7, new M.r0(1, k0Var, InterfaceC1780d0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 3));
    }

    public static final boolean r(c5.i iVar) {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) iVar.n(C1806y.f19581p);
        if (interfaceC1786g0 != null) {
            return interfaceC1786g0.b();
        }
        return true;
    }

    public static final boolean s(InterfaceC1765B interfaceC1765B) {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) interfaceC1765B.g().n(C1806y.f19581p);
        if (interfaceC1786g0 != null) {
            return interfaceC1786g0.b();
        }
        return true;
    }

    public static w0 t(InterfaceC1765B interfaceC1765B, c5.g gVar, l5.e eVar, int i7) {
        EnumC1766C enumC1766C = EnumC1766C.f19470r;
        c5.i iVar = gVar;
        if ((i7 & 1) != 0) {
            iVar = c5.j.f10685o;
        }
        if ((i7 & 2) != 0) {
            enumC1766C = EnumC1766C.f19467o;
        }
        c5.i iVarU = u(interfaceC1765B, iVar);
        w0 q0Var = enumC1766C == EnumC1766C.f19468p ? new q0(iVarU, eVar) : new w0(iVarU, true);
        q0Var.h0(enumC1766C, q0Var, eVar);
        return q0Var;
    }

    public static final c5.i u(InterfaceC1765B interfaceC1765B, c5.i iVar) {
        c5.i iVarK = k(interfaceC1765B.g(), iVar, true);
        D5.e eVar = M.f19497a;
        return (iVarK == eVar || iVarK.n(c5.e.f10684o) != null) ? iVarK : iVarK.h(eVar);
    }

    public static final Object v(Object obj) {
        return obj instanceof C1800s ? android.support.v4.media.session.b.l(((C1800s) obj).f19570a) : obj;
    }

    public static final void w(C1793k c1793k, c5.d dVar, boolean z6) {
        Object obj = C1793k.f19540u.get(c1793k);
        Throwable thD = c1793k.d(obj);
        Object objL = thD != null ? android.support.v4.media.session.b.l(thD) : c1793k.f(obj);
        if (!z6) {
            dVar.resumeWith(objL);
            return;
        }
        AbstractC1209k.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        B5.g gVar = (B5.g) dVar;
        AbstractC0865c abstractC0865c = gVar.f890s;
        c5.i context = abstractC0865c.getContext();
        Object objM = B5.a.m(context, gVar.f892u);
        G0 g0B = objM != B5.a.f881f ? B(abstractC0865c, context, objM) : null;
        try {
            abstractC0865c.resumeWith(objL);
            if (g0B == null || g0B.i0()) {
                B5.a.g(context, objM);
            }
        } catch (Throwable th) {
            if (g0B == null || g0B.i0()) {
                B5.a.g(context, objM);
            }
            throw th;
        }
    }

    public static final Object x(c5.i iVar, l5.e eVar) throws Throwable {
        W wA;
        c5.i iVarK;
        Thread threadCurrentThread = Thread.currentThread();
        c5.h hVar = c5.e.f10684o;
        c5.f fVar = (c5.f) iVar.n(hVar);
        c5.j jVar = c5.j.f10685o;
        if (fVar == null) {
            wA = A0.a();
            iVarK = k(jVar, iVar.h(wA), true);
            D5.e eVar2 = M.f19497a;
            if (iVarK != eVar2 && iVarK.n(hVar) == null) {
                iVarK = iVarK.h(eVar2);
            }
        } else {
            if (fVar instanceof W) {
            }
            wA = (W) A0.f19463a.get();
            iVarK = k(jVar, iVar, true);
            D5.e eVar3 = M.f19497a;
            if (iVarK != eVar3 && iVarK.n(hVar) == null) {
                iVarK = iVarK.h(eVar3);
            }
        }
        C1783f c1783f = new C1783f(iVarK, threadCurrentThread, wA);
        c1783f.h0(EnumC1766C.f19467o, c1783f, eVar);
        W w7 = c1783f.f19531s;
        if (w7 != null) {
            int i7 = W.f19511t;
            w7.H(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jI = w7 != null ? w7.I() : Long.MAX_VALUE;
                if (!(c1783f.O() instanceof InterfaceC1774a0)) {
                    if (w7 != null) {
                        int i8 = W.f19511t;
                        w7.E(false);
                    }
                    Object objA = A(c1783f.O());
                    C1800s c1800s = objA instanceof C1800s ? (C1800s) objA : null;
                    if (c1800s == null) {
                        return objA;
                    }
                    throw c1800s.f19570a;
                }
                LockSupport.parkNanos(c1783f, jI);
            } catch (Throwable th) {
                if (w7 != null) {
                    int i9 = W.f19511t;
                    w7.E(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1783f.C(interruptedException);
        throw interruptedException;
    }

    public static final Object y(D0 d02, l5.e eVar) throws Throwable {
        Object c1800s;
        Object objV;
        q(d02, false, new O(0, l(d02.f914r.getContext()).g(d02.f19482s, d02, d02.f19517q)), 3);
        try {
            if (eVar instanceof AbstractC0863a) {
                AbstractC1223y.c(2, eVar);
                c1800s = eVar.invoke(d02, d02);
            } else {
                c1800s = I0.c.Z(eVar, d02, d02);
            }
        } catch (Throwable th) {
            c1800s = new C1800s(th, false);
        }
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        if (c1800s == enumC0830a || (objV = d02.V(c1800s)) == f19477e) {
            return enumC0830a;
        }
        if (objV instanceof C1800s) {
            Throwable th2 = ((C1800s) objV).f19570a;
            if (!(th2 instanceof C0) || ((C0) th2).f19472o != d02) {
                throw th2;
            }
            if (c1800s instanceof C1800s) {
                throw ((C1800s) c1800s).f19570a;
            }
        } else {
            c1800s = A(objV);
        }
        return c1800s;
    }

    public static final String z(c5.d dVar) {
        Object objL;
        if (dVar instanceof B5.g) {
            return dVar.toString();
        }
        try {
            objL = dVar + '@' + m(dVar);
        } catch (Throwable th) {
            objL = android.support.v4.media.session.b.l(th);
        }
        if (Y4.k.a(objL) != null) {
            objL = dVar.getClass().getName() + '@' + m(dVar);
        }
        return (String) objL;
    }
}
