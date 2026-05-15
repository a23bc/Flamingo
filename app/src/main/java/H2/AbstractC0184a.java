package H2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: H2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3121a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f3122b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4.i f3123c = new D4.i(new CopyOnWriteArrayList(), 0, (A) null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D2.n f3124d = new D2.n(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f3125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t2.h0 f3126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B2.p f3127g;

    public boolean a(t2.G g6) {
        return false;
    }

    public abstract InterfaceC0207y b(A a4, K2.e eVar, long j3);

    public final void c(B b7) {
        HashSet hashSet = this.f3122b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(b7);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(B b7) {
        this.f3125e.getClass();
        HashSet hashSet = this.f3122b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(b7);
        if (zIsEmpty) {
            f();
        }
    }

    public t2.h0 g() {
        return null;
    }

    public abstract t2.G h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(B b7, y2.C c7, B2.p pVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f3125e;
        AbstractC1697a.d(looper == null || looper == looperMyLooper);
        this.f3127g = pVar;
        t2.h0 h0Var = this.f3126f;
        this.f3121a.add(b7);
        if (this.f3125e == null) {
            this.f3125e = looperMyLooper;
            this.f3122b.add(b7);
            l(c7);
        } else if (h0Var != null) {
            e(b7);
            b7.a(this, h0Var);
        }
    }

    public abstract void l(y2.C c7);

    public final void m(t2.h0 h0Var) {
        this.f3126f = h0Var;
        Iterator it = this.f3121a.iterator();
        while (it.hasNext()) {
            ((B) it.next()).a(this, h0Var);
        }
    }

    public abstract void n(InterfaceC0207y interfaceC0207y);

    public final void o(B b7) {
        ArrayList arrayList = this.f3121a;
        arrayList.remove(b7);
        if (!arrayList.isEmpty()) {
            c(b7);
            return;
        }
        this.f3125e = null;
        this.f3126f = null;
        this.f3127g = null;
        this.f3122b.clear();
        p();
    }

    public abstract void p();

    public final void q(D2.o oVar) {
        CopyOnWriteArrayList<D2.m> copyOnWriteArrayList = this.f3124d.f1529c;
        for (D2.m mVar : copyOnWriteArrayList) {
            if (mVar.f1526b == oVar) {
                copyOnWriteArrayList.remove(mVar);
            }
        }
    }

    public final void r(E e7) {
        CopyOnWriteArrayList<D> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f3123c.f1584r;
        for (D d4 : copyOnWriteArrayList) {
            if (d4.f2984b == e7) {
                copyOnWriteArrayList.remove(d4);
            }
        }
    }

    public void s(t2.G g6) {
    }

    public void d() {
    }

    public void f() {
    }
}
