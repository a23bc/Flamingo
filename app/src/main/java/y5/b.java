package y5;

import B5.t;
import B5.u;
import d5.EnumC0830a;
import e5.AbstractC0865c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import w5.C1793k;
import w5.I0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements I0 {

    /* JADX INFO: renamed from: o */
    public Object f20532o = e.f20559p;

    /* JADX INFO: renamed from: p */
    public C1793k f20533p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ c f20534q;

    public b(c cVar) {
        this.f20534q = cVar;
    }

    @Override // w5.I0
    public final void a(B5.s sVar, int i7) {
        C1793k c1793k = this.f20533p;
        if (c1793k != null) {
            c1793k.a(sVar, i7);
        }
    }

    public final Object b(AbstractC0865c abstractC0865c) throws Throwable {
        k kVarN;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f20540u;
        c cVar = this.f20534q;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.u(c.f20535p.get(cVar), true)) {
                this.f20532o = e.l;
                Throwable thO = cVar.o();
                if (thO == null) {
                    return Boolean.FALSE;
                }
                int i7 = t.f917a;
                throw thO;
            }
            long andIncrement = c.f20536q.getAndIncrement(cVar);
            long j3 = e.f20547b;
            long j7 = andIncrement / j3;
            int i8 = (int) (andIncrement % j3);
            if (kVar.f916c != j7) {
                kVarN = cVar.n(j7, kVar);
                if (kVarN == null) {
                    continue;
                }
            } else {
                kVarN = kVar;
            }
            Object objC = cVar.C(kVarN, i8, andIncrement, null);
            u uVar = e.f20556m;
            if (objC == uVar) {
                throw new IllegalStateException("unreachable");
            }
            u uVar2 = e.f20558o;
            if (objC != uVar2) {
                if (objC != e.f20557n) {
                    kVarN.a();
                    this.f20532o = objC;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f20534q;
                C1793k c1793kO = AbstractC1767D.o(I0.c.D(abstractC0865c));
                try {
                    this.f20533p = c1793kO;
                    Object objC2 = cVar2.C(kVarN, i8, andIncrement, this);
                    if (objC2 == uVar) {
                        a(kVarN, i8);
                    } else {
                        if (objC2 == uVar2) {
                            if (andIncrement < cVar2.s()) {
                                kVarN.a();
                            }
                            k kVar2 = (k) c.f20540u.get(cVar2);
                            while (true) {
                                if (cVar2.u(c.f20535p.get(cVar2), true)) {
                                    C1793k c1793k = this.f20533p;
                                    AbstractC1209k.c(c1793k);
                                    this.f20533p = null;
                                    this.f20532o = e.l;
                                    Throwable thO2 = cVar.o();
                                    if (thO2 == null) {
                                        c1793k.resumeWith(Boolean.FALSE);
                                    } else {
                                        c1793k.resumeWith(android.support.v4.media.session.b.l(thO2));
                                    }
                                } else {
                                    long andIncrement2 = c.f20536q.getAndIncrement(cVar2);
                                    long j8 = e.f20547b;
                                    long j9 = andIncrement2 / j8;
                                    int i9 = (int) (andIncrement2 % j8);
                                    if (kVar2.f916c != j9) {
                                        k kVarN2 = cVar2.n(j9, kVar2);
                                        if (kVarN2 != null) {
                                            kVar2 = kVarN2;
                                        }
                                    }
                                    Object objC3 = cVar2.C(kVar2, i9, andIncrement2, this);
                                    if (objC3 == e.f20556m) {
                                        a(kVar2, i9);
                                        break;
                                    }
                                    if (objC3 == e.f20558o) {
                                        if (andIncrement2 < cVar2.s()) {
                                            kVar2.a();
                                        }
                                    } else {
                                        if (objC3 == e.f20557n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        this.f20532o = objC3;
                                        this.f20533p = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            kVarN.a();
                            this.f20532o = objC2;
                            this.f20533p = null;
                            bool = Boolean.TRUE;
                        }
                        c1793kO.e(bool, null);
                    }
                    Object objQ = c1793kO.q();
                    EnumC0830a enumC0830a = EnumC0830a.f11264o;
                    return objQ;
                } catch (Throwable th) {
                    c1793kO.z();
                    throw th;
                }
            }
            if (andIncrement < cVar.s()) {
                kVarN.a();
            }
            kVar = kVarN;
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f20532o;
        u uVar = e.f20559p;
        if (obj == uVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f20532o = uVar;
        if (obj != e.l) {
            return obj;
        }
        Throwable thQ = this.f20534q.q();
        int i7 = t.f917a;
        throw thQ;
    }
}
