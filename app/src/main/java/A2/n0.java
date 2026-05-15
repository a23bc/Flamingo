package A2;

import H2.AbstractC0184a;
import H2.C0201s;
import H2.C0204v;
import H2.InterfaceC0207y;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B2.p f376a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f380e;
    public final B2.i h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w2.q f383i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f385k;
    public y2.C l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H2.Y f384j = new H2.Y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f378c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f379d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f377b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f381f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f382g = new HashSet();

    public n0(V v3, B2.i iVar, w2.q qVar, B2.p pVar) {
        this.f376a = pVar;
        this.f380e = v3;
        this.h = iVar;
        this.f383i = qVar;
    }

    public final t2.h0 a(int i7, ArrayList arrayList, H2.Y y6) {
        if (!arrayList.isEmpty()) {
            this.f384j = y6;
            for (int i8 = i7; i8 < arrayList.size() + i7; i8++) {
                m0 m0Var = (m0) arrayList.get(i8 - i7);
                ArrayList arrayList2 = this.f377b;
                if (i8 > 0) {
                    m0 m0Var2 = (m0) arrayList2.get(i8 - 1);
                    m0Var.f361d = m0Var2.f358a.f3239o.f3220e.o() + m0Var2.f361d;
                    m0Var.f362e = false;
                    m0Var.f360c.clear();
                } else {
                    m0Var.f361d = 0;
                    m0Var.f362e = false;
                    m0Var.f360c.clear();
                }
                int iO = m0Var.f358a.f3239o.f3220e.o();
                for (int i9 = i8; i9 < arrayList2.size(); i9++) {
                    ((m0) arrayList2.get(i9)).f361d += iO;
                }
                arrayList2.add(i8, m0Var);
                this.f379d.put(m0Var.f359b, m0Var);
                if (this.f385k) {
                    e(m0Var);
                    if (this.f378c.isEmpty()) {
                        this.f382g.add(m0Var);
                    } else {
                        l0 l0Var = (l0) this.f381f.get(m0Var);
                        if (l0Var != null) {
                            l0Var.f349a.c(l0Var.f350b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final t2.h0 b() {
        ArrayList arrayList = this.f377b;
        if (arrayList.isEmpty()) {
            return t2.h0.f16472a;
        }
        int iO = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            m0 m0Var = (m0) arrayList.get(i7);
            m0Var.f361d = iO;
            iO += m0Var.f358a.f3239o.f3220e.o();
        }
        return new t0(arrayList, this.f384j);
    }

    public final void c() {
        Iterator it = this.f382g.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (m0Var.f360c.isEmpty()) {
                l0 l0Var = (l0) this.f381f.get(m0Var);
                if (l0Var != null) {
                    l0Var.f349a.c(l0Var.f350b);
                }
                it.remove();
            }
        }
    }

    public final void d(m0 m0Var) {
        if (m0Var.f362e && m0Var.f360c.isEmpty()) {
            l0 l0Var = (l0) this.f381f.remove(m0Var);
            l0Var.getClass();
            g0 g0Var = l0Var.f350b;
            AbstractC0184a abstractC0184a = l0Var.f349a;
            abstractC0184a.o(g0Var);
            V.o oVar = l0Var.f351c;
            abstractC0184a.r(oVar);
            abstractC0184a.q(oVar);
            this.f382g.remove(m0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [A2.g0, H2.B] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(m0 m0Var) {
        C0204v c0204v = m0Var.f358a;
        ?? r12 = new H2.B() { // from class: A2.g0
            @Override // H2.B
            public final void a(AbstractC0184a abstractC0184a, t2.h0 h0Var) {
                w2.q qVar = this.f292a.f380e.f204v;
                qVar.d(2);
                qVar.e(22);
            }
        };
        V.o oVar = new V.o(this, m0Var);
        this.f381f.put(m0Var, new l0(c0204v, r12, oVar));
        Handler handler = new Handler(w2.t.o(), null);
        c0204v.getClass();
        D4.i iVar = c0204v.f3123c;
        iVar.getClass();
        H2.D d4 = new H2.D();
        d4.f2983a = handler;
        d4.f2984b = oVar;
        ((CopyOnWriteArrayList) iVar.f1584r).add(d4);
        Handler handler2 = new Handler(w2.t.o(), null);
        D2.n nVar = c0204v.f3124d;
        nVar.getClass();
        D2.m mVar = new D2.m();
        mVar.f1525a = handler2;
        mVar.f1526b = oVar;
        nVar.f1529c.add(mVar);
        c0204v.k(r12, this.l, this.f376a);
    }

    public final void f(InterfaceC0207y interfaceC0207y) {
        IdentityHashMap identityHashMap = this.f378c;
        m0 m0Var = (m0) identityHashMap.remove(interfaceC0207y);
        m0Var.getClass();
        m0Var.f358a.n(interfaceC0207y);
        m0Var.f360c.remove(((C0201s) interfaceC0207y).f3227o);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(m0Var);
    }

    public final void g(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            ArrayList arrayList = this.f377b;
            m0 m0Var = (m0) arrayList.remove(i9);
            this.f379d.remove(m0Var.f359b);
            int i10 = -m0Var.f358a.f3239o.f3220e.o();
            for (int i11 = i9; i11 < arrayList.size(); i11++) {
                ((m0) arrayList.get(i11)).f361d += i10;
            }
            m0Var.f362e = true;
            if (this.f385k) {
                d(m0Var);
            }
        }
    }
}
