package w5;

import d5.EnumC0830a;
import e5.AbstractC0863a;
import java.lang.reflect.InvocationTargetException;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: renamed from: w5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1773a extends p0 implements c5.d, InterfaceC1765B {

    /* JADX INFO: renamed from: q */
    public final c5.i f19517q;

    public AbstractC1773a(c5.i iVar, boolean z6) {
        super(z6);
        R((InterfaceC1786g0) iVar.n(C1806y.f19581p));
        this.f19517q = iVar.h(this);
    }

    @Override // w5.p0
    public final String F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // w5.p0
    public final void Q(A2.W w7) throws IllegalAccessException, InvocationTargetException {
        AbstractC1767D.p(this.f19517q, w7);
    }

    @Override // w5.p0
    public final void Z(Object obj) {
        if (!(obj instanceof C1800s)) {
            g0(obj);
        } else {
            C1800s c1800s = (C1800s) obj;
            f0(c1800s.f19570a, C1800s.f19569b.get(c1800s) != 0);
        }
    }

    @Override // w5.InterfaceC1765B
    public final c5.i g() {
        return this.f19517q;
    }

    @Override // c5.d
    public final c5.i getContext() {
        return this.f19517q;
    }

    public final void h0(EnumC1766C enumC1766C, AbstractC1773a abstractC1773a, l5.e eVar) {
        Object objInvoke;
        int iOrdinal = enumC1766C.ordinal();
        if (iOrdinal == 0) {
            M3.a.i0(eVar, abstractC1773a, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC1209k.f(eVar, "<this>");
                I0.c.D(I0.c.p(abstractC1773a, this, eVar)).resumeWith(Y4.o.f8736a);
                return;
            }
            if (iOrdinal != 3) {
                throw new A2.W();
            }
            try {
                c5.i iVar = this.f19517q;
                Object objM = B5.a.m(iVar, null);
                try {
                    if (eVar instanceof AbstractC0863a) {
                        AbstractC1223y.c(2, eVar);
                        objInvoke = eVar.invoke(abstractC1773a, this);
                    } else {
                        objInvoke = I0.c.Z(eVar, abstractC1773a, this);
                    }
                    B5.a.g(iVar, objM);
                    if (objInvoke != EnumC0830a.f11264o) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    B5.a.g(iVar, objM);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(android.support.v4.media.session.b.l(th2));
            }
        }
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        Throwable thA = Y4.k.a(obj);
        if (thA != null) {
            obj = new C1800s(thA, false);
        }
        Object objV = V(obj);
        if (objV == AbstractC1767D.f19477e) {
            return;
        }
        A(objV);
    }

    public void g0(Object obj) {
    }

    public void f0(Throwable th, boolean z6) {
    }
}
