package f0;

import L2.C0247a;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import h0.C0993a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l0.C1158b;
import m5.AbstractC1209k;
import p0.AbstractC1289f;
import p0.C1285b;
import p0.C1290g;
import t.C1444F;
import w5.AbstractC1767D;
import w5.C1792j0;
import w5.C1793k;
import w5.C1806y;
import w5.InterfaceC1786g0;
import w5.InterfaceC1791j;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractC0918w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0887g f11622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1786g0 f11624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f11625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f11626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11627g;
    public t.K h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0.e f11628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f11629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f11630k;
    public final t.J l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V1.a f11631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t.J f11632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t.J f11633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f11634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinkedHashSet f11635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1793k f11636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0247a f11637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z5.J f11639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A0.b f11640v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1792j0 f11641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c5.i f11642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final W f11643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z5.J f11620z = z5.z.b(C1158b.f14148r);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AtomicReference f11619A = new AtomicReference(Boolean.FALSE);

    public B0(c5.i iVar) {
        C0887g c0887g = new C0887g(new E3.e(19, this));
        this.f11622b = c0887g;
        this.f11623c = new Object();
        this.f11626f = new ArrayList();
        this.h = new t.K();
        this.f11628i = new h0.e(new C0924z[16]);
        this.f11629j = new ArrayList();
        this.f11630k = new ArrayList();
        this.l = new t.J();
        this.f11631m = new V1.a(8);
        this.f11632n = new t.J();
        this.f11633o = new t.J();
        this.f11639u = z5.z.b(EnumC0917v0.f11938q);
        this.f11640v = new A0.b(27);
        C1792j0 c1792j0 = new C1792j0((InterfaceC1786g0) iVar.n(C1806y.f19581p));
        c1792j0.t(new D.J(23, this));
        this.f11641w = c1792j0;
        this.f11642x = iVar.h(c0887g).h(c1792j0);
        this.f11643y = new W(8);
    }

    public static final void H(ArrayList arrayList, B0 b0, C0924z c0924z) {
        arrayList.clear();
        synchronized (b0.f11623c) {
            Iterator it = b0.f11630k.iterator();
            while (it.hasNext()) {
                AbstractC0876a0 abstractC0876a0 = (AbstractC0876a0) it.next();
                abstractC0876a0.getClass();
                if (AbstractC1209k.a(null, c0924z)) {
                    arrayList.add(abstractC0876a0);
                    it.remove();
                }
            }
        }
    }

    public static final Object u(B0 b0, A0 a0) {
        C1793k c1793k;
        if (b0.D()) {
            return Y4.o.f8736a;
        }
        C1793k c1793k2 = new C1793k(1, I0.c.D(a0));
        c1793k2.r();
        synchronized (b0.f11623c) {
            if (b0.D()) {
                c1793k = c1793k2;
            } else {
                b0.f11636r = c1793k2;
                c1793k = null;
            }
        }
        if (c1793k != null) {
            c1793k.resumeWith(Y4.o.f8736a);
        }
        Object objQ = c1793k2.q();
        return objQ == EnumC0830a.f11264o ? objQ : Y4.o.f8736a;
    }

    public static final void v(B0 b0) {
        int i7;
        C1444F c1444f;
        synchronized (b0.f11623c) {
            try {
                if (b0.l.j()) {
                    C1444F c1444fB = C0993a.b(b0.l);
                    b0.l.a();
                    V1.a aVar = b0.f11631m;
                    ((t.J) aVar.f7389o).a();
                    ((t.J) aVar.f7390p).a();
                    b0.f11633o.a();
                    c1444f = new C1444F(c1444fB.f15984b);
                    Object[] objArr = c1444fB.f15983a;
                    int i8 = c1444fB.f15984b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        AbstractC0876a0 abstractC0876a0 = (AbstractC0876a0) objArr[i9];
                        c1444f.a(new Y4.h(abstractC0876a0, b0.f11632n.g(abstractC0876a0)));
                    }
                    b0.f11632n.a();
                } else {
                    c1444f = t.O.f16030b;
                    AbstractC1209k.d(c1444f, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = c1444f.f15983a;
        int i10 = c1444f.f15984b;
        for (i7 = 0; i7 < i10; i7++) {
            Y4.h hVar = (Y4.h) objArr2[i7];
        }
    }

    public static final boolean w(B0 b0) {
        boolean zC;
        synchronized (b0.f11623c) {
            zC = b0.C();
        }
        return zC;
    }

    public static final List x(B0 b0) {
        List listE;
        synchronized (b0.f11623c) {
            listE = b0.E();
        }
        return listE;
    }

    public static final void y(B0 b0, InterfaceC1786g0 interfaceC1786g0) {
        synchronized (b0.f11623c) {
            Throwable th = b0.f11625e;
            if (th != null) {
                throw th;
            }
            if (((EnumC0917v0) b0.f11639u.getValue()).compareTo(EnumC0917v0.f11937p) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (b0.f11624d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            b0.f11624d = interfaceC1786g0;
            b0.B();
        }
    }

    public static void z(C1285b c1285b) {
        try {
            if (c1285b.w() instanceof C1290g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c1285b.c();
        }
    }

    public final void A() {
        synchronized (this.f11623c) {
            if (((EnumC0917v0) this.f11639u.getValue()).compareTo(EnumC0917v0.f11940s) >= 0) {
                z5.J j3 = this.f11639u;
                EnumC0917v0 enumC0917v0 = EnumC0917v0.f11937p;
                j3.getClass();
                j3.j(null, enumC0917v0);
            }
        }
        this.f11641w.c(null);
    }

    public final InterfaceC1791j B() {
        EnumC0917v0 enumC0917v0;
        z5.J j3 = this.f11639u;
        int iCompareTo = ((EnumC0917v0) j3.getValue()).compareTo(EnumC0917v0.f11937p);
        ArrayList arrayList = this.f11630k;
        ArrayList arrayList2 = this.f11629j;
        h0.e eVar = this.f11628i;
        if (iCompareTo <= 0) {
            this.f11626f.clear();
            this.f11627g = Z4.v.f8818o;
            this.h = new t.K();
            eVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f11634p = null;
            C1793k c1793k = this.f11636r;
            if (c1793k != null) {
                c1793k.l(null);
            }
            this.f11636r = null;
            this.f11637s = null;
            return null;
        }
        if (this.f11637s != null) {
            enumC0917v0 = EnumC0917v0.f11938q;
        } else if (this.f11624d == null) {
            this.h = new t.K();
            eVar.h();
            enumC0917v0 = C() ? EnumC0917v0.f11939r : EnumC0917v0.f11938q;
        } else {
            enumC0917v0 = (eVar.f12548q == 0 && !this.h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !C() && !this.l.j()) ? EnumC0917v0.f11940s : EnumC0917v0.f11941t;
        }
        j3.getClass();
        j3.j(null, enumC0917v0);
        if (enumC0917v0 != EnumC0917v0.f11941t) {
            return null;
        }
        C1793k c1793k2 = this.f11636r;
        this.f11636r = null;
        return c1793k2;
    }

    public final boolean C() {
        return !this.f11638t && (this.f11622b.f11804r.get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11623c
            monitor-enter(r0)
            t.K r1 = r2.h     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            h0.e r1 = r2.f11628i     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f12548q     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.C()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.B0.D():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List E() {
        ?? r02 = this.f11627g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f11626f;
        List arrayList2 = arrayList.isEmpty() ? Z4.v.f8818o : new ArrayList(arrayList);
        this.f11627g = arrayList2;
        return arrayList2;
    }

    public final void F() {
        synchronized (this.f11623c) {
            this.f11638t = true;
        }
    }

    public final void G(C0924z c0924z) {
        synchronized (this.f11623c) {
            ArrayList arrayList = this.f11630k;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC0876a0) arrayList.get(i7)).getClass();
                if (AbstractC1209k.a(null, c0924z)) {
                    ArrayList arrayList2 = new ArrayList();
                    H(arrayList2, this, c0924z);
                    while (!arrayList2.isEmpty()) {
                        I(arrayList2, null);
                        H(arrayList2, this, c0924z);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        if (((Y4.h) r10.get(r4)).f8727p == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014d, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015e, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        r11 = (Y4.h) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
    
        if (r11.f8727p != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016a, code lost:
    
        r11 = (f0.AbstractC0876a0) r11.f8726o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        r4 = r17.f11623c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        Z4.t.l0(r17.f11630k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018d, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
    
        if (((Y4.h) r11).f8727p == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I(java.util.List r18, t.K r19) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.B0.I(java.util.List, t.K):java.util.List");
    }

    public final C0924z J(C0924z c0924z, t.K k7) {
        C1285b c1285bD;
        if (c0924z.f11965J.f11877F || c0924z.f11966K == 2) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f11635q;
        if (linkedHashSet == null || !linkedHashSet.contains(c0924z)) {
            D.J j3 = new D.J(22, c0924z);
            D.h0 h0Var = new D.h0(c0924z, 17, k7);
            AbstractC1289f abstractC1289fK = p0.l.k();
            C1285b c1285b = abstractC1289fK instanceof C1285b ? (C1285b) abstractC1289fK : null;
            if (c1285b == null || (c1285bD = c1285b.D(j3, h0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC1289f abstractC1289fJ = c1285bD.j();
                if (k7 != null) {
                    try {
                        if (k7.h()) {
                            G.i iVar = new G.i(k7, 12, c0924z);
                            C0912t c0912t = c0924z.f11965J;
                            if (c0912t.f11877F) {
                                AbstractC0914u.c("Preparing a composition while composing is not supported");
                            }
                            c0912t.f11877F = true;
                            try {
                                iVar.a();
                                c0912t.f11877F = false;
                            } catch (Throwable th) {
                                c0912t.f11877F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC1289f.q(abstractC1289fJ);
                        throw th2;
                    }
                }
                boolean zV = c0924z.v();
                AbstractC1289f.q(abstractC1289fJ);
                if (zV) {
                    return c0924z;
                }
            } finally {
                z(c1285bD);
            }
        }
        return null;
    }

    public final void K(Throwable th, C0924z c0924z) throws Throwable {
        if (!((Boolean) f11619A.get()).booleanValue() || (th instanceof C0901n)) {
            synchronized (this.f11623c) {
                C0247a c0247a = this.f11637s;
                if (c0247a != null) {
                    throw ((Throwable) c0247a.f4105p);
                }
                this.f11637s = new C0247a(23, th);
            }
            throw th;
        }
        synchronized (this.f11623c) {
            try {
                this.f11629j.clear();
                this.f11628i.h();
                this.h = new t.K();
                this.f11630k.clear();
                this.l.a();
                this.f11632n.a();
                this.f11637s = new C0247a(23, th);
                if (c0924z != null) {
                    M(c0924z);
                }
                B();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean L() {
        synchronized (this.f11623c) {
            boolean z6 = true;
            if (this.h.g()) {
                if (this.f11628i.f12548q == 0 && !C() && !this.l.j()) {
                    z6 = false;
                }
                return z6;
            }
            List listE = E();
            h0.h hVar = new h0.h(this.h);
            this.h = new t.K();
            try {
                int size = listE.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((C0924z) listE.get(i7)).w(hVar);
                    if (((EnumC0917v0) this.f11639u.getValue()).compareTo(EnumC0917v0.f11937p) <= 0) {
                        break;
                    }
                }
                synchronized (this.f11623c) {
                    if (B() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f11628i.f12548q == 0 && !C() && !this.l.j()) {
                        z6 = false;
                    }
                }
                return z6;
            } catch (Throwable th) {
                synchronized (this.f11623c) {
                    t.K k7 = this.h;
                    k7.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        k7.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void M(C0924z c0924z) {
        ArrayList arrayList = this.f11634p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f11634p = arrayList;
        }
        if (!arrayList.contains(c0924z)) {
            arrayList.add(c0924z);
        }
        if (this.f11626f.remove(c0924z)) {
            this.f11627g = null;
        }
    }

    public final void N() {
        InterfaceC1791j interfaceC1791jB;
        synchronized (this.f11623c) {
            if (this.f11638t) {
                this.f11638t = false;
                interfaceC1791jB = B();
            } else {
                interfaceC1791jB = null;
            }
        }
        if (interfaceC1791jB != null) {
            ((C1793k) interfaceC1791jB).resumeWith(Y4.o.f8736a);
        }
    }

    public final Object O(AbstractC0871i abstractC0871i) {
        Object objC = AbstractC1767D.C(this.f11622b, new C0923y0(this, new A0(this, null), C0879c.q(abstractC0871i.getContext()), null), abstractC0871i);
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        Y4.o oVar = Y4.o.f8736a;
        if (objC != enumC0830a) {
            objC = oVar;
        }
        return objC == enumC0830a ? objC : oVar;
    }

    @Override // f0.AbstractC0918w
    public final void a(C0924z c0924z, l5.e eVar) throws Throwable {
        C1285b c1285bD;
        boolean z6 = c0924z.f11965J.f11877F;
        try {
            D.J j3 = new D.J(22, c0924z);
            D.h0 h0Var = new D.h0(c0924z, 17, null);
            AbstractC1289f abstractC1289fK = p0.l.k();
            C1285b c1285b = abstractC1289fK instanceof C1285b ? (C1285b) abstractC1289fK : null;
            if (c1285b == null || (c1285bD = c1285b.D(j3, h0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC1289f abstractC1289fJ = c1285bD.j();
                try {
                    c0924z.k(eVar);
                    if (!z6) {
                        p0.l.k().m();
                    }
                    synchronized (this.f11623c) {
                        if (((EnumC0917v0) this.f11639u.getValue()).compareTo(EnumC0917v0.f11937p) > 0 && !E().contains(c0924z)) {
                            this.f11626f.add(c0924z);
                            this.f11627g = null;
                        }
                    }
                    try {
                        G(c0924z);
                        try {
                            c0924z.e();
                            c0924z.g();
                            if (z6) {
                                return;
                            }
                            p0.l.k().m();
                        } catch (Throwable th) {
                            K(th, null);
                        }
                    } catch (Throwable th2) {
                        K(th2, c0924z);
                    }
                } finally {
                    AbstractC1289f.q(abstractC1289fJ);
                }
            } finally {
                z(c1285bD);
            }
        } catch (Throwable th3) {
            K(th3, c0924z);
        }
    }

    @Override // f0.AbstractC0918w
    public final t.K b(C0924z c0924z, B2.g gVar, l5.e eVar) {
        A0.b bVar = this.f11640v;
        try {
            B2.g gVar2 = c0924z.f11959D;
            c0924z.f11959D = gVar;
            try {
                a(c0924z, eVar);
                t.K k7 = (t.K) bVar.R();
                if (k7 == null) {
                    t.K k8 = t.S.f16033a;
                    AbstractC1209k.d(k8, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    k7 = k8;
                }
                return k7;
            } finally {
                c0924z.f11959D = gVar2;
            }
        } finally {
            bVar.l0(null);
        }
    }

    @Override // f0.AbstractC0918w
    public final boolean d() {
        return ((Boolean) f11619A.get()).booleanValue();
    }

    @Override // f0.AbstractC0918w
    public final boolean e() {
        return false;
    }

    @Override // f0.AbstractC0918w
    public final boolean f() {
        return false;
    }

    @Override // f0.AbstractC0918w
    public final long g() {
        return 1000;
    }

    @Override // f0.AbstractC0918w
    public final InterfaceC0916v h() {
        return null;
    }

    @Override // f0.AbstractC0918w
    public final c5.i j() {
        return this.f11642x;
    }

    @Override // f0.AbstractC0918w
    public final void k(C0924z c0924z) {
        InterfaceC1791j interfaceC1791jB;
        synchronized (this.f11623c) {
            if (this.f11628i.i(c0924z)) {
                interfaceC1791jB = null;
            } else {
                this.f11628i.b(c0924z);
                interfaceC1791jB = B();
            }
        }
        if (interfaceC1791jB != null) {
            ((C1793k) interfaceC1791jB).resumeWith(Y4.o.f8736a);
        }
    }

    @Override // f0.AbstractC0918w
    public final Z l(AbstractC0876a0 abstractC0876a0) {
        Z z6;
        synchronized (this.f11623c) {
            z6 = (Z) this.f11632n.k(abstractC0876a0);
        }
        return z6;
    }

    @Override // f0.AbstractC0918w
    public final t.K m(C0924z c0924z, B2.g gVar, t.K k7) {
        A0.b bVar = this.f11640v;
        try {
            L();
            c0924z.w(new h0.h(k7));
            B2.g gVar2 = c0924z.f11959D;
            c0924z.f11959D = gVar;
            try {
                C0924z c0924zJ = J(c0924z, null);
                if (c0924zJ != null) {
                    G(c0924z);
                    c0924zJ.e();
                    c0924zJ.g();
                }
                t.K k8 = (t.K) bVar.R();
                if (k8 == null) {
                    t.K k9 = t.S.f16033a;
                    AbstractC1209k.d(k9, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    k8 = k9;
                }
                return k8;
            } finally {
                c0924z.f11959D = gVar2;
            }
        } finally {
            bVar.l0(null);
        }
    }

    @Override // f0.AbstractC0918w
    public final void p(C0915u0 c0915u0) {
        A0.b bVar = this.f11640v;
        t.K k7 = (t.K) bVar.R();
        if (k7 == null) {
            t.K k8 = t.S.f16033a;
            k7 = new t.K();
            bVar.l0(k7);
        }
        k7.a(c0915u0);
    }

    @Override // f0.AbstractC0918w
    public final void q(C0924z c0924z) {
        synchronized (this.f11623c) {
            try {
                LinkedHashSet linkedHashSet = this.f11635q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f11635q = linkedHashSet;
                }
                linkedHashSet.add(c0924z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f0.AbstractC0918w
    public final void t(C0924z c0924z) {
        synchronized (this.f11623c) {
            if (this.f11626f.remove(c0924z)) {
                this.f11627g = null;
            }
            this.f11628i.k(c0924z);
            this.f11629j.remove(c0924z);
        }
    }

    @Override // f0.AbstractC0918w
    public final void n(Set set) {
    }
}
