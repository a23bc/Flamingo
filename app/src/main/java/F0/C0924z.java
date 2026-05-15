package f0;

import D.C0078t;
import L2.C0247a;
import android.os.Trace;
import g0.C0943a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: f0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0924z implements InterfaceC0916v {

    /* JADX INFO: renamed from: A */
    public final t.J f11956A;

    /* JADX INFO: renamed from: B */
    public t.J f11957B;

    /* JADX INFO: renamed from: C */
    public boolean f11958C;

    /* JADX INFO: renamed from: D */
    public B2.g f11959D;

    /* JADX INFO: renamed from: E */
    public C0898l0 f11960E;

    /* JADX INFO: renamed from: F */
    public C0924z f11961F;

    /* JADX INFO: renamed from: G */
    public int f11962G;

    /* JADX INFO: renamed from: H */
    public final C0247a f11963H;

    /* JADX INFO: renamed from: I */
    public final n0.j f11964I;

    /* JADX INFO: renamed from: J */
    public final C0912t f11965J;

    /* JADX INFO: renamed from: K */
    public int f11966K;

    /* JADX INFO: renamed from: o */
    public final AbstractC0918w f11967o;

    /* JADX INFO: renamed from: p */
    public final AbstractC0875a f11968p;

    /* JADX INFO: renamed from: q */
    public final AtomicReference f11969q = new AtomicReference(null);

    /* JADX INFO: renamed from: r */
    public final Object f11970r = new Object();

    /* JADX INFO: renamed from: s */
    public final t.M f11971s;

    /* JADX INFO: renamed from: t */
    public final I0 f11972t;

    /* JADX INFO: renamed from: u */
    public final t.J f11973u;

    /* JADX INFO: renamed from: v */
    public final t.K f11974v;

    /* JADX INFO: renamed from: w */
    public final t.K f11975w;

    /* JADX INFO: renamed from: x */
    public final t.J f11976x;

    /* JADX INFO: renamed from: y */
    public final C0943a f11977y;

    /* JADX INFO: renamed from: z */
    public final C0943a f11978z;

    public C0924z(AbstractC0918w abstractC0918w, AbstractC0875a abstractC0875a) {
        this.f11967o = abstractC0918w;
        this.f11968p = abstractC0875a;
        t.M m7 = new t.M(new t.K());
        this.f11971s = m7;
        I0 i02 = new I0();
        if (abstractC0918w.d()) {
            i02.f11689y = new t.y();
        }
        if (abstractC0918w.f()) {
            i02.c();
        }
        this.f11972t = i02;
        this.f11973u = android.support.v4.media.session.b.i();
        this.f11974v = new t.K();
        this.f11975w = new t.K();
        this.f11976x = android.support.v4.media.session.b.i();
        C0943a c0943a = new C0943a();
        this.f11977y = c0943a;
        C0943a c0943a2 = new C0943a();
        this.f11978z = c0943a2;
        this.f11956A = android.support.v4.media.session.b.i();
        this.f11957B = android.support.v4.media.session.b.i();
        C0247a c0247a = new C0247a(22, abstractC0918w);
        this.f11963H = c0247a;
        this.f11964I = new n0.j();
        C0912t c0912t = new C0912t(abstractC0875a, abstractC0918w, i02, m7, c0943a, c0943a2, c0247a, this);
        abstractC0918w.o(c0912t);
        this.f11965J = c0912t;
        boolean z6 = abstractC0918w instanceof B0;
        int i7 = AbstractC0893j.f11813a;
    }

    @Override // f0.InterfaceC0916v
    public final void a() {
        synchronized (this.f11970r) {
            try {
                if (this.f11965J.f11877F) {
                    AbstractC0908q0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f11966K != 2) {
                    this.f11966K = 2;
                    int i7 = AbstractC0893j.f11813a;
                    C0943a c0943a = this.f11965J.f11883L;
                    if (c0943a != null) {
                        f(c0943a);
                    }
                    boolean z6 = this.f11972t.f11680p > 0;
                    if (z6 || !this.f11971s.f16026o.g()) {
                        n0.j jVar = this.f11964I;
                        try {
                            jVar.g(this.f11971s, this.f11965J.y());
                            if (z6) {
                                L0 l0G = this.f11972t.g();
                                try {
                                    l0G.n(l0G.f11711t, new D.D0(9, this.f11964I));
                                    l0G.G();
                                    l0G.e(true);
                                    this.f11968p.a();
                                    this.f11968p.q();
                                    jVar.c();
                                } catch (Throwable th) {
                                    l0G.e(false);
                                    throw th;
                                }
                            }
                            jVar.b();
                            jVar.a();
                        } catch (Throwable th2) {
                            jVar.a();
                            throw th2;
                        }
                    }
                    C0912t c0912t = this.f11965J;
                    c0912t.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0912t.f11894b.s(c0912t);
                        c0912t.f11876E.clear();
                        c0912t.f11909s.clear();
                        c0912t.f11897e.f12279u.c0();
                        c0912t.f11912v = null;
                        c0912t.f11893a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f11967o.t(this);
    }

    public final void b() {
        this.f11969q.set(null);
        this.f11977y.f12279u.c0();
        this.f11978z.f12279u.c0();
        t.M m7 = this.f11971s;
        if (m7.f16026o.g()) {
            return;
        }
        n0.j jVar = this.f11964I;
        try {
            jVar.g(m7, this.f11965J.y());
            jVar.b();
        } finally {
            jVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            t.J r2 = r0.f11973u
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9a
            boolean r3 = r2 instanceof t.K
            t.K r4 = r0.f11974v
            t.K r5 = r0.f11975w
            t.J r6 = r0.f11956A
            if (r3 == 0) goto L7d
            t.K r2 = (t.K) r2
            java.lang.Object[] r3 = r2.f16010b
            long[] r2 = r2.f16009a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6c
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            f0.u0 r15 = (f0.C0915u0) r15
            boolean r16 = android.support.v4.media.session.b.E(r6, r1, r15)
            if (r16 != 0) goto L6c
            f0.Q r8 = r15.c(r1)
            r17 = r13
            f0.Q r13 = f0.Q.f11732o
            if (r8 == r13) goto L6e
            t.J r8 = r15.f11935g
            if (r8 == 0) goto L68
            if (r21 != 0) goto L68
            r5.a(r15)
            goto L6e
        L68:
            r4.a(r15)
            goto L6e
        L6c:
            r17 = r13
        L6e:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L75:
            r8 = r13
            if (r12 != r8) goto L9a
        L78:
            if (r9 == r7) goto L9a
            int r9 = r9 + 1
            goto L22
        L7d:
            f0.u0 r2 = (f0.C0915u0) r2
            boolean r3 = android.support.v4.media.session.b.E(r6, r1, r2)
            if (r3 != 0) goto L9a
            f0.Q r1 = r2.c(r1)
            f0.Q r3 = f0.Q.f11732o
            if (r1 == r3) goto L9a
            t.J r1 = r2.f11935g
            if (r1 == 0) goto L97
            if (r21 != 0) goto L97
            r5.a(r2)
            return
        L97:
            r4.a(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.c(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:303:0x0183 A[EDGE_INSN: B:303:0x0183->B:454:0x0122 BREAK  A[LOOP:13: B:293:0x0151->B:304:0x0185]] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.Set r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.d(java.util.Set, boolean):void");
    }

    public final void e() {
        synchronized (this.f11970r) {
            try {
                f(this.f11977y);
                n();
            } catch (Throwable th) {
                try {
                    if (!this.f11971s.f16026o.g()) {
                        n0.j jVar = this.f11964I;
                        try {
                            jVar.g(this.f11971s, this.f11965J.y());
                            jVar.b();
                            jVar.a();
                        } catch (Throwable th2) {
                            jVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    b();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(g0.C0943a r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.f(g0.a):void");
    }

    public final void g() {
        synchronized (this.f11970r) {
            try {
                if (this.f11978z.f12279u.f0()) {
                    f(this.f11978z);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f11971s.f16026o.g()) {
                        n0.j jVar = this.f11964I;
                        try {
                            jVar.g(this.f11971s, this.f11965J.y());
                            jVar.b();
                            jVar.a();
                        } catch (Throwable th2) {
                            jVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void h() {
        n0.j jVar;
        synchronized (this.f11970r) {
            try {
                this.f11965J.f11912v = null;
                if (!this.f11971s.f16026o.g()) {
                    jVar = this.f11964I;
                    try {
                        jVar.g(this.f11971s, this.f11965J.y());
                        jVar.b();
                        jVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f11971s.f16026o.g()) {
                        jVar = this.f11964I;
                        try {
                            jVar.g(this.f11971s, this.f11965J.y());
                            jVar.b();
                            jVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    b();
                    throw th2;
                }
            }
        }
    }

    public final void i() {
        int i7 = this.f11966K;
        if (i7 != 0) {
            AbstractC0908q0.b(i7 != 1 ? i7 != 2 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed.");
        }
        if (this.f11960E == null) {
            return;
        }
        AbstractC0908q0.b("A pausable composition is in progress");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.j():void");
    }

    public final void k(l5.e eVar) {
        try {
            synchronized (this.f11970r) {
                m();
                t.J j3 = this.f11957B;
                this.f11957B = android.support.v4.media.session.b.i();
                try {
                    C0912t c0912t = this.f11965J;
                    B2.g gVar = this.f11959D;
                    if (!c0912t.f11897e.f12279u.e0()) {
                        AbstractC0914u.c("Expected applyChanges() to have been called");
                    }
                    c0912t.f11887P = gVar;
                    try {
                        c0912t.n(j3, eVar);
                    } finally {
                        c0912t.f11887P = null;
                    }
                } catch (Throwable th) {
                    this.f11957B = j3;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f11971s.f16026o.g()) {
                    n0.j jVar = this.f11964I;
                    try {
                        jVar.g(this.f11971s, this.f11965J.y());
                        jVar.b();
                        jVar.a();
                    } catch (Throwable th3) {
                        jVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                b();
                throw th4;
            }
        }
    }

    public final void l() {
        synchronized (this.f11970r) {
            try {
                if (this.f11960E != null) {
                    AbstractC0908q0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z6 = this.f11972t.f11680p > 0;
                if (z6 || !this.f11971s.f16026o.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        n0.j jVar = this.f11964I;
                        try {
                            jVar.g(this.f11971s, this.f11965J.y());
                            if (z6) {
                                L0 l0G = this.f11972t.g();
                                try {
                                    l0G.n(l0G.f11711t, new C0078t(this.f11964I, 12, l0G));
                                    l0G.e(true);
                                    this.f11968p.q();
                                    jVar.c();
                                } catch (Throwable th) {
                                    l0G.e(false);
                                    throw th;
                                }
                            }
                            jVar.b();
                            jVar.a();
                        } catch (Throwable th2) {
                            jVar.a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f11973u.a();
                this.f11976x.a();
                this.f11957B.a();
                this.f11977y.f12279u.c0();
                this.f11978z.f12279u.c0();
                C0912t c0912t = this.f11965J;
                c0912t.f11876E.clear();
                c0912t.f11909s.clear();
                c0912t.f11897e.f12279u.c0();
                c0912t.f11912v = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m() {
        AtomicReference atomicReference = this.f11969q;
        Object obj = C0879c.f11791a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0914u.d("pending composition has not been applied");
                throw new A2.W();
            }
            if (andSet instanceof Set) {
                d((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0914u.d("corrupt pendingModifications drain: " + atomicReference);
                throw new A2.W();
            }
            for (Set set : (Set[]) andSet) {
                d(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f11969q;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC1209k.a(andSet, C0879c.f11791a)) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                d(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC0914u.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new A2.W();
        }
        AbstractC0914u.d("corrupt pendingModifications drain: " + atomicReference);
        throw new A2.W();
    }

    public final void o() {
        AtomicReference atomicReference = this.f11969q;
        Object andSet = atomicReference.getAndSet(Z4.x.f8820o);
        if (AbstractC1209k.a(andSet, C0879c.f11791a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0914u.d("corrupt pendingModifications drain: " + atomicReference);
            throw new A2.W();
        }
        for (Set set : (Set[]) andSet) {
            d(set, false);
        }
    }

    public final void p(ArrayList arrayList) {
        C0912t c0912t = this.f11965J;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                ((AbstractC0876a0) ((Y4.h) arrayList.get(i7)).f8726o).getClass();
                if (!AbstractC1209k.a(null, this)) {
                    AbstractC0914u.c("Check failed");
                    break;
                }
                i7++;
            }
        }
        try {
            c0912t.getClass();
            try {
                c0912t.A(arrayList);
                c0912t.i();
            } catch (Throwable th) {
                c0912t.a();
                throw th;
            }
        } catch (Throwable th2) {
            t.M m7 = this.f11971s;
            try {
                if (!m7.f16026o.g()) {
                    n0.j jVar = this.f11964I;
                    try {
                        jVar.g(m7, c0912t.y());
                        jVar.b();
                        jVar.a();
                    } catch (Throwable th3) {
                        jVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                b();
                throw th4;
            }
        }
    }

    public final Q q(C0915u0 c0915u0, Object obj) {
        C0924z c0924z;
        int i7 = c0915u0.f11930b;
        if ((i7 & 2) != 0) {
            c0915u0.f11930b = i7 | 4;
        }
        C0877b c0877b = c0915u0.f11931c;
        if (c0877b == null || !c0877b.a()) {
            return Q.f11732o;
        }
        if (this.f11972t.i(c0877b)) {
            if (c0915u0.f11932d == null) {
                return Q.f11732o;
            }
            Q qS = s(c0915u0, c0877b, obj);
            if (qS != Q.f11732o) {
                this.f11963H.h();
            }
            return qS;
        }
        synchronized (this.f11970r) {
            c0924z = this.f11961F;
        }
        if (c0924z != null) {
            C0912t c0912t = c0924z.f11965J;
            if (c0912t.f11877F && c0912t.d0(c0915u0, obj)) {
                return Q.f11735r;
            }
        }
        return Q.f11732o;
    }

    public final void r() {
        C0924z c0924z;
        synchronized (this.f11970r) {
            try {
                for (Object obj : this.f11972t.f11681q) {
                    C0915u0 c0915u0 = obj instanceof C0915u0 ? (C0915u0) obj : null;
                    if (c0915u0 != null && (c0924z = c0915u0.f11929a) != null) {
                        c0924z.q(c0915u0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:165:0x00d5->B:150:0x00d5 BREAK  A[LOOP:0: B:132:0x008c->B:146:0x00cd], EDGE_INSN: B:166:0x00d5->B:150:0x00d5 BREAK  A[LOOP:0: B:132:0x008c->B:146:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:89:0x000b, B:91:0x0010, B:93:0x0018, B:95:0x001f, B:99:0x0029, B:101:0x002f, B:98:0x0024, B:110:0x0047, B:112:0x004d, B:117:0x0058, B:121:0x005e, B:122:0x0067, B:124:0x006b, B:125:0x0074, B:127:0x007c, B:129:0x0080, B:132:0x008c, B:134:0x009c, B:136:0x00a8, B:138:0x00b2, B:142:0x00c1, B:146:0x00cd, B:147:0x00d0, B:150:0x00d5), top: B:163:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f0.Q s(f0.C0915u0 r21, f0.C0877b r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.s(f0.u0, f0.b, java.lang.Object):f0.Q");
    }

    public final void t(Object obj) {
        Object objG = this.f11973u.g(obj);
        if (objG == null) {
            return;
        }
        boolean z6 = objG instanceof t.K;
        t.J j3 = this.f11956A;
        if (!z6) {
            C0915u0 c0915u0 = (C0915u0) objG;
            if (c0915u0.c(obj) == Q.f11735r) {
                android.support.v4.media.session.b.e(j3, obj, c0915u0);
                return;
            }
            return;
        }
        t.K k7 = (t.K) objG;
        Object[] objArr = k7.f16010b;
        long[] jArr = k7.f16009a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        C0915u0 c0915u02 = (C0915u0) objArr[(i7 << 3) + i9];
                        if (c0915u02.c(obj) == Q.f11735r) {
                            android.support.v4.media.session.b.e(j3, obj, c0915u02);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof h0.h
            t.J r3 = r0.f11976x
            t.J r4 = r0.f11973u
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            h0.h r1 = (h0.h) r1
            t.K r1 = r1.f12559o
            java.lang.Object[] r2 = r1.f16010b
            long[] r1 = r1.f16009a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.u(java.util.Set):boolean");
    }

    public final boolean v() {
        synchronized (this.f11970r) {
            C0898l0 c0898l0 = this.f11960E;
            boolean zF0 = false;
            if (c0898l0 != null && c0898l0.h.get() != EnumC0900m0.f11844s) {
                c0898l0.e();
                return false;
            }
            m();
            try {
                t.J j3 = this.f11957B;
                this.f11957B = android.support.v4.media.session.b.i();
                try {
                    C0912t c0912t = this.f11965J;
                    B2.g gVar = this.f11959D;
                    g0.L l = c0912t.f11897e.f12279u;
                    if (!l.e0()) {
                        AbstractC0914u.c("Expected applyChanges() to have been called");
                    }
                    if (j3.f16007e > 0 || !c0912t.f11909s.isEmpty()) {
                        c0912t.f11887P = gVar;
                        try {
                            c0912t.n(j3, null);
                            c0912t.f11887P = null;
                            zF0 = l.f0();
                        } catch (Throwable th) {
                            c0912t.f11887P = null;
                            throw th;
                        }
                    }
                    if (!zF0) {
                        n();
                    }
                    return zF0;
                } catch (Throwable th2) {
                    this.f11957B = j3;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f11971s.f16026o.g()) {
                        n0.j jVar = this.f11964I;
                        try {
                            jVar.g(this.f11971s, this.f11965J.y());
                            jVar.b();
                            jVar.a();
                        } catch (Throwable th4) {
                            jVar.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    b();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(h0.h hVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f11969q.get();
            if (obj2 == null || obj2.equals(C0879c.f11791a)) {
                obj = hVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, hVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f11969q).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f11969q;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f11970r) {
                    n();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.x(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f11970r
            monitor-enter(r0)
            r14.t(r15)     // Catch: java.lang.Throwable -> L4f
            t.J r1 = r14.f11976x     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof t.K     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            t.K r15 = (t.K) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f16010b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f16009a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            f0.G r10 = (f0.G) r10     // Catch: java.lang.Throwable -> L4f
            r14.t(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            f0.G r15 = (f0.G) r15     // Catch: java.lang.Throwable -> L4f
            r14.t(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0924z.y(java.lang.Object):void");
    }

    public final void z(l5.e eVar) {
        i();
        this.f11967o.a(this, eVar);
    }
}
