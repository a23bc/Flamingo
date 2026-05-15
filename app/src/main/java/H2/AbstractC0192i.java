package H2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: H2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0192i extends AbstractC0184a {
    public final HashMap h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Handler f3193i;

    /* JADX INFO: renamed from: j */
    public y2.C f3194j;

    @Override // H2.AbstractC0184a
    public final void d() {
        for (C0191h c0191h : this.h.values()) {
            c0191h.f3190a.c(c0191h.f3191b);
        }
    }

    @Override // H2.AbstractC0184a
    public final void f() {
        for (C0191h c0191h : this.h.values()) {
            c0191h.f3190a.e(c0191h.f3191b);
        }
    }

    @Override // H2.AbstractC0184a
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((C0191h) it.next()).f3190a.j();
        }
    }

    @Override // H2.AbstractC0184a
    public void p() {
        HashMap map = this.h;
        for (C0191h c0191h : map.values()) {
            c0191h.f3190a.o(c0191h.f3191b);
            U3.h hVar = c0191h.f3192c;
            AbstractC0184a abstractC0184a = c0191h.f3190a;
            abstractC0184a.r(hVar);
            abstractC0184a.q(hVar);
        }
        map.clear();
    }

    public abstract A t(Object obj, A a4);

    public abstract void w(Object obj, AbstractC0184a abstractC0184a, t2.h0 h0Var);

    public final void x(Object obj, AbstractC0184a abstractC0184a) {
        HashMap map = this.h;
        AbstractC1697a.d(!map.containsKey(obj));
        C0190g c0190g = new B() { // from class: H2.g

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f3184b;

            public /* synthetic */ C0190g(Object obj2) {
                obj = obj2;
            }

            @Override // H2.B
            public final void a(AbstractC0184a abstractC0184a2, t2.h0 h0Var) {
                this.f3183a.w(obj, abstractC0184a2, h0Var);
            }
        };
        U3.h hVar = new U3.h();
        hVar.f7045r = this;
        hVar.f7043p = new D4.i((CopyOnWriteArrayList) this.f3123c.f1584r, 0, (A) null);
        hVar.f7044q = new D2.n(this.f3124d.f1529c, 0, null);
        hVar.f7042o = obj2;
        map.put(obj2, new C0191h(abstractC0184a, c0190g, hVar));
        Handler handler = this.f3193i;
        handler.getClass();
        abstractC0184a.getClass();
        D4.i iVar = abstractC0184a.f3123c;
        iVar.getClass();
        D d4 = new D();
        d4.f2983a = handler;
        d4.f2984b = hVar;
        ((CopyOnWriteArrayList) iVar.f1584r).add(d4);
        Handler handler2 = this.f3193i;
        handler2.getClass();
        D2.n nVar = abstractC0184a.f3124d;
        nVar.getClass();
        D2.m mVar = new D2.m();
        mVar.f1525a = handler2;
        mVar.f1526b = hVar;
        nVar.f1529c.add(mVar);
        y2.C c7 = this.f3194j;
        B2.p pVar = this.f3127g;
        AbstractC1697a.j(pVar);
        abstractC0184a.k(c0190g, c7, pVar);
        if (this.f3122b.isEmpty()) {
            abstractC0184a.c(c0190g);
        }
    }

    public long u(long j3, Object obj) {
        return j3;
    }

    public int v(int i7, Object obj) {
        return i7;
    }
}
