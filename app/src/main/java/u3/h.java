package U3;

import A2.C0001b;
import A2.RunnableC0022x;
import C2.F;
import D2.n;
import D2.o;
import D4.i;
import E0.C0096g;
import E4.I;
import H2.A;
import H2.AbstractC0192i;
import H2.C0205w;
import H2.E;
import H2.r;
import K0.B;
import K0.C0245m;
import K0.t;
import K0.u;
import K0.z;
import M.J;
import O0.C;
import O1.k;
import Q0.C0348f0;
import T1.v;
import Z1.l;
import Z4.w;
import a.AbstractC0509a;
import android.content.Context;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import d2.C0821i;
import f0.C0879c;
import f0.C0894j0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k.AbstractC1113a;
import k3.m;
import m5.AbstractC1209k;
import m5.AbstractC1221w;
import m5.AbstractC1223y;
import m5.C1203e;
import n3.C1229a;
import o.AbstractC1243a;
import p.MenuC1268A;
import p.s;
import p2.AbstractC1292b;
import p2.C1293c;
import r5.C1422c;
import t.C1450e;
import t2.C1487p;
import t2.T;
import w.InterfaceC1653B;
import w.InterfaceC1685s;
import w.q0;
import w2.AbstractC1697a;
import w3.A0;
import w3.C1723f;
import w3.C1747r0;
import w3.InterfaceC1721e;
import w3.RunnableC1715c;
import w3.v1;
import w3.w1;
import w5.AbstractC1767D;
import w5.C1793k;
import w5.InterfaceC1765B;
import z4.InterfaceC2087f;

/* JADX INFO: loaded from: classes.dex */
public final class h implements E, o, m, s0.f, q0, InterfaceC2087f {

    /* JADX INFO: renamed from: s */
    public static h f7041s;

    /* JADX INFO: renamed from: o */
    public Object f7042o;

    /* JADX INFO: renamed from: p */
    public Object f7043p;

    /* JADX INFO: renamed from: q */
    public Object f7044q;

    /* JADX INFO: renamed from: r */
    public Object f7045r;

    public h(int i7) {
        switch (i7) {
            case 2:
                this.f7045r = new LinkedHashMap();
                this.f7043p = "GET";
                this.f7044q = new C0096g(1);
                break;
            case 8:
                this.f7042o = new ArrayList();
                this.f7043p = new HashMap();
                this.f7044q = new HashMap();
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                this.f7042o = new w2.m();
                this.f7043p = new w2.m();
                this.f7044q = new C1229a();
                break;
            default:
                this.f7043p = new ArrayDeque();
                this.f7044q = new ArrayDeque();
                this.f7045r = new ArrayDeque();
                break;
        }
    }

    public static synchronized h V(Context context, A0.b bVar) {
        try {
            if (f7041s == null) {
                h hVar = new h();
                Context applicationContext = context.getApplicationContext();
                hVar.f7042o = new a(applicationContext, bVar);
                hVar.f7043p = new b(applicationContext, bVar);
                hVar.f7044q = new f(applicationContext, bVar);
                hVar.f7045r = new g(applicationContext, bVar);
                f7041s = hVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7041s;
    }

    @Override // D2.o
    public void A(int i7, A a4, int i8) {
        if (d0(i7, a4)) {
            ((n) this.f7044q).c(i8);
        }
    }

    @Override // D2.o
    public void B(int i7, A a4) {
        if (d0(i7, a4)) {
            ((n) this.f7044q).a();
        }
    }

    public void C(F5.c cVar) {
        AbstractC1209k.f(cVar, "cacheControl");
        String string = cVar.toString();
        if (string.length() == 0) {
            ((C0096g) this.f7044q).r("Cache-Control");
        } else {
            Y("Cache-Control", string);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void D(C0245m c0245m, boolean z6) {
        ?? r02 = c0245m.f3896a;
        int size = r02.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((u) r02.get(i7)).b()) {
                m0(c0245m);
                return;
            }
        }
        C c7 = (C) this.f7042o;
        if (c7 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        t.g(c0245m, c7.I(0L), new K0.A(this, 0, (B) this.f7045r), false);
        if (((z) this.f7043p) == z.f3937p) {
            if (z6) {
                int size2 = r02.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((u) r02.get(i8)).a();
                }
            }
            C0001b c0001b = c0245m.f3897b;
            if (c0001b != null) {
                c0001b.f222p = !r5.f3822c;
            }
        }
    }

    public synchronized ExecutorService E() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f7042o) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = G5.b.f2770f + " Dispatcher";
                AbstractC1209k.f(str, "name");
                this.f7042o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new G5.a(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f7042o;
            AbstractC1209k.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void F() {
        Iterator it = ((HashMap) this.f7043p).values().iterator();
        while (it.hasNext()) {
            A0.e.G(it.next());
        }
    }

    public void G(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        j0();
    }

    public void H(J5.e eVar) {
        eVar.f3763p.decrementAndGet();
        G((ArrayDeque) this.f7044q, eVar);
    }

    @Override // H2.E
    public void I(int i7, A a4, r rVar, C0205w c0205w) {
        if (d0(i7, a4)) {
            ((i) this.f7043p).u(rVar, e0(c0205w, a4));
        }
    }

    public void J(C1723f c1723f) {
        A0 a0 = (A0) ((WeakReference) this.f7045r).get();
        if (a0 == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            InterfaceC1721e interfaceC1721e = (InterfaceC1721e) c1723f.f19179c.poll();
            if (interfaceC1721e == null) {
                c1723f.f19182f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            C1723f c1723f2 = c1723f;
            w2.t.G(a0.l, new RunnableC0022x(a0, S(c1723f.f19177a), new F(this, interfaceC1721e, atomicBoolean2, c1723f2, atomicBoolean, 2)));
            atomicBoolean2.set(false);
            c1723f = c1723f2;
        }
    }

    public void K(final C1747r0 c1747r0) {
        synchronized (this.f7042o) {
            try {
                C1723f c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0);
                if (c1723f == null) {
                    return;
                }
                final T t7 = c1723f.f19183g;
                c1723f.f19183g = T.f16353b;
                c1723f.f19179c.add(new InterfaceC1721e() { // from class: w3.b
                    @Override // w3.InterfaceC1721e
                    public final I4.y run() {
                        A0 a0 = (A0) ((WeakReference) this.f19137a.f7045r).get();
                        if (a0 != null) {
                            a0.o(c1747r0, t7);
                        }
                        return I4.v.f3536p;
                    }
                });
                if (c1723f.f19182f) {
                    return;
                }
                c1723f.f19182f = true;
                J(c1723f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o.e L(AbstractC1243a abstractC1243a) {
        ArrayList arrayList = (ArrayList) this.f7044q;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            o.e eVar = (o.e) arrayList.get(i7);
            if (eVar != null && eVar.f14574b == abstractC1243a) {
                return eVar;
            }
        }
        o.e eVar2 = new o.e((Context) this.f7043p, abstractC1243a);
        arrayList.add(eVar2);
        return eVar2;
    }

    @Override // H2.E
    public void M(int i7, A a4, r rVar, C0205w c0205w, IOException iOException, boolean z6) {
        if (d0(i7, a4)) {
            ((i) this.f7043p).v(rVar, e0(c0205w, a4), iOException, z6);
        }
    }

    @Override // D2.o
    public void N(int i7, A a4, Exception exc) {
        if (d0(i7, a4)) {
            ((n) this.f7044q).d(exc);
        }
    }

    public ArrayList O() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) this.f7043p).values().iterator();
        while (it.hasNext()) {
            A0.e.G(it.next());
        }
        return arrayList;
    }

    public T P(C1747r0 c1747r0) {
        synchronized (this.f7042o) {
            try {
                C1723f c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0);
                if (c1723f == null) {
                    return null;
                }
                return c1723f.f19181e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H2.E
    public void Q(int i7, A a4, r rVar, C0205w c0205w) {
        if (d0(i7, a4)) {
            ((i) this.f7043p).t(rVar, e0(c0205w, a4));
        }
    }

    public I R() {
        I iP;
        synchronized (this.f7042o) {
            iP = I.p(((C1450e) this.f7043p).values());
        }
        return iP;
    }

    public C1747r0 S(Object obj) {
        C1747r0 c1747r0;
        synchronized (this.f7042o) {
            c1747r0 = (C1747r0) ((C1450e) this.f7043p).get(obj);
        }
        return c1747r0;
    }

    @Override // D2.o
    public void T(int i7, A a4) {
        if (d0(i7, a4)) {
            ((n) this.f7044q).b();
        }
    }

    public List U() {
        ArrayList arrayList;
        if (((ArrayList) this.f7042o).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f7042o)) {
            arrayList = new ArrayList((ArrayList) this.f7042o);
        }
        return arrayList;
    }

    public C0348f0 W(C1747r0 c1747r0) {
        C1723f c1723f;
        synchronized (this.f7042o) {
            c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0);
        }
        if (c1723f != null) {
            return c1723f.f19178b;
        }
        return null;
    }

    public Q X(C1203e c1203e, String str) {
        Q q7;
        boolean zIsInstance;
        Q qA;
        AbstractC1209k.f(str, "key");
        synchronized (((r2.c) this.f7045r)) {
            try {
                X x6 = (X) this.f7042o;
                x6.getClass();
                q7 = (Q) x6.f9730a.get(str);
                Class clsH = c1203e.f14428a;
                Map map = C1203e.f14425b;
                AbstractC1209k.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(clsH);
                if (num != null) {
                    zIsInstance = AbstractC1223y.d(num.intValue(), q7);
                } else {
                    if (clsH.isPrimitive()) {
                        clsH = AbstractC1113a.H(AbstractC1221w.a(clsH));
                    }
                    zIsInstance = clsH.isInstance(q7);
                }
                if (zIsInstance) {
                    Object obj = (U) this.f7043p;
                    if (obj instanceof V) {
                        AbstractC1209k.c(q7);
                        ((V) obj).d(q7);
                    }
                    AbstractC1209k.d(q7, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C1293c c1293c = new C1293c((AbstractC1292b) this.f7044q);
                    c1293c.f14994a.put(W.f9728b, str);
                    U u7 = (U) this.f7043p;
                    try {
                        try {
                            qA = u7.c(c1203e, c1293c);
                        } catch (AbstractMethodError unused) {
                            qA = u7.a(AbstractC1113a.G(c1203e));
                        }
                    } catch (AbstractMethodError unused2) {
                        qA = u7.b(AbstractC1113a.G(c1203e), c1293c);
                    }
                    q7 = qA;
                    X x7 = (X) this.f7042o;
                    x7.getClass();
                    AbstractC1209k.f(q7, "viewModel");
                    Q q8 = (Q) x7.f9730a.put(str, q7);
                    if (q8 != null) {
                        q8.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q7;
    }

    public void Y(String str, String str2) {
        AbstractC1209k.f(str2, "value");
        C0096g c0096g = (C0096g) this.f7044q;
        c0096g.getClass();
        M3.a.G(str);
        M3.a.H(str2, str);
        c0096g.r(str);
        c0096g.f(str, str2);
    }

    public boolean Z(C1747r0 c1747r0) {
        boolean z6;
        synchronized (this.f7042o) {
            z6 = ((C1450e) this.f7044q).get(c1747r0) != null;
        }
        return z6;
    }

    @Override // w.q0
    public /* synthetic */ boolean a() {
        return false;
    }

    public boolean a0(C1747r0 c1747r0, int i7) {
        C1723f c1723f;
        synchronized (this.f7042o) {
            c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0);
        }
        A0 a0 = (A0) ((WeakReference) this.f7045r).get();
        return c1723f != null && c1723f.f19181e.a(i7) && a0 != null && a0.f18914s.y().a(i7);
    }

    @Override // z4.InterfaceC2087f
    public int b() {
        return ((Number) ((C0894j0) this.f7045r).getValue()).intValue();
    }

    public boolean b0(C1747r0 c1747r0, int i7) {
        C1723f c1723f;
        synchronized (this.f7042o) {
            c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0);
        }
        if (c1723f == null) {
            return false;
        }
        w1 w1Var = c1723f.f19180d;
        w1Var.getClass();
        boolean z6 = false;
        AbstractC1697a.c("Use contains(Command) for custom command", i7 != 0);
        Iterator<E> it = w1Var.f19387a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((v1) it.next()).f19382a == i7) {
                z6 = true;
                break;
            }
        }
        return z6;
    }

    @Override // z4.InterfaceC2087f
    public int c() {
        return ((Number) ((C0894j0) this.f7043p).getValue()).intValue();
    }

    public boolean c0(C1747r0 c1747r0, v1 v1Var) {
        C1723f c1723f;
        synchronized (this.f7042o) {
            c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0);
        }
        if (c1723f == null) {
            return false;
        }
        w1 w1Var = c1723f.f19180d;
        w1Var.getClass();
        v1Var.getClass();
        return w1Var.f19387a.contains(v1Var);
    }

    @Override // k3.m
    public /* synthetic */ void d() {
    }

    public boolean d0(int i7, A a4) {
        A aT;
        AbstractC0192i abstractC0192i = (AbstractC0192i) this.f7045r;
        Object obj = this.f7042o;
        if (a4 != null) {
            aT = abstractC0192i.t(obj, a4);
            if (aT == null) {
                return false;
            }
        } else {
            aT = null;
        }
        int iV = abstractC0192i.v(i7, obj);
        i iVar = (i) this.f7043p;
        if (iVar.f1582p != iV || !w2.t.a((A) iVar.f1583q, aT)) {
            this.f7043p = new i((CopyOnWriteArrayList) abstractC0192i.f3123c.f1584r, iV, aT);
        }
        n nVar = (n) this.f7044q;
        if (nVar.f1527a == iV && w2.t.a(nVar.f1528b, aT)) {
            return true;
        }
        this.f7044q = new n(abstractC0192i.f3124d.f1529c, iV, aT);
        return true;
    }

    @Override // w.q0
    public long e(w.r rVar, w.r rVar2, w.r rVar3) {
        C1422c it = i6.h.M(0, rVar.b()).iterator();
        long jMax = 0;
        while (it.f15786q) {
            int iB = it.b();
            jMax = Math.max(jMax, ((InterfaceC1685s) this.f7042o).get(iB).c(rVar.a(iB), rVar2.a(iB), rVar3.a(iB)));
        }
        return jMax;
    }

    public C0205w e0(C0205w c0205w, A a4) {
        AbstractC0192i abstractC0192i = (AbstractC0192i) this.f7045r;
        Object obj = this.f7042o;
        long j3 = c0205w.f3245p;
        long jU = abstractC0192i.u(j3, obj);
        long j7 = c0205w.f3246q;
        long jU2 = abstractC0192i.u(j7, obj);
        return (jU == j3 && jU2 == j7) ? c0205w : new C0205w(c0205w.f3244o, (C1487p) c0205w.f3247r, jU, jU2);
    }

    @Override // w.q0
    public w.r f(w.r rVar, w.r rVar2, w.r rVar3) {
        if (((w.r) this.f7045r) == null) {
            this.f7045r = rVar3.c();
        }
        w.r rVar4 = (w.r) this.f7045r;
        if (rVar4 == null) {
            AbstractC1209k.m("endVelocityVector");
            throw null;
        }
        int iB = rVar4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            w.r rVar5 = (w.r) this.f7045r;
            if (rVar5 == null) {
                AbstractC1209k.m("endVelocityVector");
                throw null;
            }
            rVar5.e(i7, ((InterfaceC1685s) this.f7042o).get(i7).e(rVar.a(i7), rVar2.a(i7), rVar3.a(i7)));
        }
        w.r rVar6 = (w.r) this.f7045r;
        if (rVar6 != null) {
            return rVar6;
        }
        AbstractC1209k.m("endVelocityVector");
        throw null;
    }

    public void f0(String str, AbstractC0509a abstractC0509a) {
        AbstractC1209k.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC0509a == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(l.q("method ", str, " must have a request body.").toString());
            }
        } else if (!I0.c.J(str)) {
            throw new IllegalArgumentException(l.q("method ", str, " must not have a request body.").toString());
        }
        this.f7043p = str;
    }

    @Override // z4.InterfaceC2087f
    public int g() {
        return ((Number) ((C0894j0) this.f7042o).getValue()).intValue();
    }

    public void g0(O1.n nVar) throws Throwable {
        Object objK = ((y5.c) this.f7044q).k(nVar);
        if (objK instanceof y5.h) {
            y5.h hVar = objK instanceof y5.h ? (y5.h) objK : null;
            Throwable th = hVar != null ? hVar.f20565a : null;
            if (th != null) {
                throw th;
            }
            throw new y5.m("Channel was closed normally");
        }
        if (objK instanceof y5.i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f7045r).getAndIncrement() == 0) {
            AbstractC1767D.t((InterfaceC1765B) this.f7042o, null, new k(this, null), 3);
        }
    }

    public boolean h0(AbstractC1243a abstractC1243a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f7042o).onActionItemClicked(L(abstractC1243a), new s((Context) this.f7043p, (A1.a) menuItem));
    }

    @Override // k3.m
    public /* synthetic */ k3.d i(byte[] bArr, int i7, int i8) {
        return l.e(this, bArr, i8);
    }

    public boolean i0(AbstractC1243a abstractC1243a, p.l lVar) {
        o.e eVarL = L(abstractC1243a);
        t.T t7 = (t.T) this.f7045r;
        Menu menuC1268A = (Menu) t7.get(lVar);
        if (menuC1268A == null) {
            menuC1268A = new MenuC1268A((Context) this.f7043p, lVar);
            t7.put(lVar, menuC1268A);
        }
        return ((ActionMode.Callback) this.f7042o).onCreateActionMode(eVarL, menuC1268A);
    }

    public void j0() {
        byte[] bArr = G5.b.f2765a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f7043p).iterator();
                AbstractC1209k.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    J5.e eVar = (J5.e) it.next();
                    if (((ArrayDeque) this.f7044q).size() >= 64) {
                        break;
                    }
                    if (eVar.f3763p.get() < 5) {
                        it.remove();
                        eVar.f3763p.incrementAndGet();
                        arrayList.add(eVar);
                        ((ArrayDeque) this.f7044q).add(eVar);
                    }
                }
                l0();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            J5.e eVar2 = (J5.e) arrayList.get(i7);
            ExecutorService executorServiceE = E();
            eVar2.getClass();
            J5.h hVar = eVar2.f3764q;
            h hVar2 = hVar.f3770o.f2420o;
            byte[] bArr2 = G5.b.f2765a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceE).execute(eVar2);
                } catch (Throwable th2) {
                    hVar.f3770o.f2420o.H(eVar2);
                    throw th2;
                }
            } catch (RejectedExecutionException e7) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e7);
                hVar.h(interruptedIOException);
                J j3 = eVar2.f3762o;
                if (!hVar.f3767A) {
                    ((C1793k) j3.f4417q).resumeWith(android.support.v4.media.session.b.l(interruptedIOException));
                }
                hVar.f3770o.f2420o.H(eVar2);
            }
        }
    }

    @Override // D2.o
    public void k(int i7, A a4) {
        if (d0(i7, a4)) {
            ((n) this.f7044q).e();
        }
    }

    public void k0(C1747r0 c1747r0) {
        synchronized (this.f7042o) {
            try {
                C1723f c1723f = (C1723f) ((C1450e) this.f7044q).remove(c1747r0);
                if (c1723f == null) {
                    return;
                }
                ((C1450e) this.f7043p).remove(c1723f.f19177a);
                c1723f.f19178b.c();
                A0 a0 = (A0) ((WeakReference) this.f7045r).get();
                if (a0 == null || a0.h()) {
                    return;
                }
                w2.t.G(a0.l, new RunnableC1715c(a0, c1747r0, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x007c, code lost:
    
        r9.F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x007f, code lost:
    
        r10.reset();
        r6.E(r9.f18869c, r9.f18867a);
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00f2  */
    @Override // k3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(byte[] r40, int r41, int r42, k3.l r43, w2.c r44) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.h.l(byte[], int, int, k3.l, w2.c):void");
    }

    public synchronized int l0() {
        return ((ArrayDeque) this.f7044q).size() + ((ArrayDeque) this.f7045r).size();
    }

    @Override // H2.E
    public void m(int i7, A a4, C0205w c0205w) {
        if (d0(i7, a4)) {
            ((i) this.f7043p).h(e0(c0205w, a4));
        }
    }

    public void m0(C0245m c0245m) {
        if (((z) this.f7043p) == z.f3937p) {
            C c7 = (C) this.f7042o;
            if (c7 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            t.g(c0245m, c7.I(0L), new B0.b(3, (B) this.f7045r), true);
        }
        this.f7043p = z.f3938q;
    }

    @Override // w.q0
    public w.r o(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        if (((w.r) this.f7043p) == null) {
            this.f7043p = rVar.c();
        }
        w.r rVar4 = (w.r) this.f7043p;
        if (rVar4 == null) {
            AbstractC1209k.m("valueVector");
            throw null;
        }
        int iB = rVar4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            w.r rVar5 = (w.r) this.f7043p;
            if (rVar5 == null) {
                AbstractC1209k.m("valueVector");
                throw null;
            }
            rVar5.e(i7, ((InterfaceC1685s) this.f7042o).get(i7).a(j3, rVar.a(i7), rVar2.a(i7), rVar3.a(i7)));
        }
        w.r rVar6 = (w.r) this.f7043p;
        if (rVar6 != null) {
            return rVar6;
        }
        AbstractC1209k.m("valueVector");
        throw null;
    }

    @Override // z4.InterfaceC2087f
    public int q() {
        return ((Number) ((C0894j0) this.f7044q).getValue()).intValue();
    }

    @Override // k3.m
    public /* synthetic */ void r(byte[] bArr, k3.l lVar, A2.I i7) {
        l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public int s() {
        return 2;
    }

    @Override // H2.E
    public void u(int i7, A a4, r rVar, C0205w c0205w) {
        if (d0(i7, a4)) {
            ((i) this.f7043p).x(rVar, e0(c0205w, a4));
        }
    }

    @Override // w.q0
    public w.r w(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        if (((w.r) this.f7044q) == null) {
            this.f7044q = rVar3.c();
        }
        w.r rVar4 = (w.r) this.f7044q;
        if (rVar4 == null) {
            AbstractC1209k.m("velocityVector");
            throw null;
        }
        int iB = rVar4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            w.r rVar5 = (w.r) this.f7044q;
            if (rVar5 == null) {
                AbstractC1209k.m("velocityVector");
                throw null;
            }
            rVar5.e(i7, ((InterfaceC1685s) this.f7042o).get(i7).b(j3, rVar.a(i7), rVar2.a(i7), rVar3.a(i7)));
        }
        w.r rVar6 = (w.r) this.f7044q;
        if (rVar6 != null) {
            return rVar6;
        }
        AbstractC1209k.m("velocityVector");
        throw null;
    }

    public void x(Object obj, C1747r0 c1747r0, w1 w1Var, T t7) {
        synchronized (this.f7042o) {
            try {
                C1747r0 c1747r0S = S(obj);
                if (c1747r0S == null) {
                    ((C1450e) this.f7043p).put(obj, c1747r0);
                    ((C1450e) this.f7044q).put(c1747r0, new C1723f(obj, new C0348f0(), w1Var, t7));
                } else {
                    C1723f c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0S);
                    AbstractC1697a.j(c1723f);
                    c1723f.f19180d = w1Var;
                    c1723f.f19181e = t7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(C1747r0 c1747r0, int i7, InterfaceC1721e interfaceC1721e) {
        synchronized (this.f7042o) {
            try {
                C1723f c1723f = (C1723f) ((C1450e) this.f7044q).get(c1747r0);
                if (c1723f != null) {
                    T t7 = c1723f.f19183g;
                    t7.getClass();
                    B3.l lVar = new B3.l();
                    lVar.b(t7.f16355a);
                    lVar.a(i7);
                    c1723f.f19183g = new T(lVar.d());
                    c1723f.f19179c.add(interfaceC1721e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public F5.t z() {
        Map mapUnmodifiableMap;
        F5.o oVar = (F5.o) this.f7042o;
        if (oVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f7043p;
        F5.m mVarH = ((C0096g) this.f7044q).h();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7045r;
        byte[] bArr = G5.b.f2765a;
        AbstractC1209k.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = w.f8819o;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1209k.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new F5.t(oVar, str, mVarH, (AbstractC0509a) null, mapUnmodifiableMap);
    }

    public h(A0 a0) {
        this.f7043p = new C1450e(0);
        this.f7044q = new C1450e(0);
        this.f7042o = new Object();
        this.f7045r = new WeakReference(a0);
    }

    public h(Typeface typeface, U1.b bVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        this.f7045r = typeface;
        this.f7042o = bVar;
        this.f7044q = new T1.s(1024);
        int iB = bVar.b(6);
        if (iB != 0) {
            int i11 = iB + bVar.f2742o;
            i7 = ((ByteBuffer) bVar.f2745r).getInt(((ByteBuffer) bVar.f2745r).getInt(i11) + i11);
        } else {
            i7 = 0;
        }
        this.f7043p = new char[i7 * 2];
        int iB2 = bVar.b(6);
        if (iB2 != 0) {
            int i12 = iB2 + bVar.f2742o;
            i8 = ((ByteBuffer) bVar.f2745r).getInt(((ByteBuffer) bVar.f2745r).getInt(i12) + i12);
        } else {
            i8 = 0;
        }
        for (int i13 = 0; i13 < i8; i13++) {
            v vVar = new v(this, i13);
            U1.a aVarB = vVar.b();
            int iB3 = aVarB.b(4);
            Character.toChars(iB3 != 0 ? ((ByteBuffer) aVarB.f2745r).getInt(iB3 + aVarB.f2742o) : 0, (char[]) this.f7043p, i13 * 2);
            U1.a aVarB2 = vVar.b();
            int iB4 = aVarB2.b(16);
            if (iB4 != 0) {
                int i14 = iB4 + aVarB2.f2742o;
                i9 = ((ByteBuffer) aVarB2.f2745r).getInt(((ByteBuffer) aVarB2.f2745r).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                U1.a aVarB3 = vVar.b();
                int iB5 = aVarB3.b(16);
                if (iB5 != 0) {
                    int i15 = iB5 + aVarB3.f2742o;
                    i10 = ((ByteBuffer) aVarB3.f2745r).getInt(((ByteBuffer) aVarB3.f2745r).getInt(i15) + i15);
                } else {
                    i10 = 0;
                }
                ((T1.s) this.f7044q).a(vVar, 0, i10 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public h(int i7, int i8, int i9, int i10) {
        this.f7042o = C0879c.t(Integer.valueOf(i7));
        this.f7043p = C0879c.t(Integer.valueOf(i8));
        this.f7044q = C0879c.t(Integer.valueOf(i9));
        this.f7045r = C0879c.t(Integer.valueOf(i10));
    }

    public h(InterfaceC1685s interfaceC1685s) {
        this.f7042o = interfaceC1685s;
    }

    public h(InterfaceC1653B interfaceC1653B) {
        this(new k.I(16, interfaceC1653B));
    }
}
