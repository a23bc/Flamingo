package f0;

import L2.C0247a;
import Q0.C0366w;
import android.os.Trace;
import g0.C0941A;
import g0.C0943a;
import g0.C0944b;
import g0.C0945c;
import g0.C0947e;
import j5.AbstractC1110d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import q0.AbstractC1354c;
import q0.AbstractC1356e;
import q0.C1353b;
import q0.C1359h;
import t.C1444F;
import u.AbstractC1525a;

/* JADX INFO: renamed from: f0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0912t {

    /* JADX INFO: renamed from: A */
    public int f11872A;

    /* JADX INFO: renamed from: B */
    public int f11873B;

    /* JADX INFO: renamed from: C */
    public boolean f11874C;

    /* JADX INFO: renamed from: D */
    public final C0910s f11875D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f11876E;

    /* JADX INFO: renamed from: F */
    public boolean f11877F;

    /* JADX INFO: renamed from: G */
    public H0 f11878G;

    /* JADX INFO: renamed from: H */
    public I0 f11879H;

    /* JADX INFO: renamed from: I */
    public L0 f11880I;

    /* JADX INFO: renamed from: J */
    public boolean f11881J;

    /* JADX INFO: renamed from: K */
    public InterfaceC0906p0 f11882K;

    /* JADX INFO: renamed from: L */
    public C0943a f11883L;

    /* JADX INFO: renamed from: M */
    public final C0944b f11884M;

    /* JADX INFO: renamed from: N */
    public C0877b f11885N;

    /* JADX INFO: renamed from: O */
    public C0945c f11886O;

    /* JADX INFO: renamed from: P */
    public B2.g f11887P;

    /* JADX INFO: renamed from: Q */
    public final C1353b f11888Q;

    /* JADX INFO: renamed from: R */
    public final c5.i f11889R;

    /* JADX INFO: renamed from: S */
    public boolean f11890S;

    /* JADX INFO: renamed from: T */
    public long f11891T;

    /* JADX INFO: renamed from: U */
    public C0922y f11892U;

    /* JADX INFO: renamed from: a */
    public final AbstractC0875a f11893a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0918w f11894b;

    /* JADX INFO: renamed from: c */
    public final I0 f11895c;

    /* JADX INFO: renamed from: d */
    public final t.M f11896d;

    /* JADX INFO: renamed from: e */
    public final C0943a f11897e;

    /* JADX INFO: renamed from: f */
    public final C0943a f11898f;

    /* JADX INFO: renamed from: g */
    public final C0247a f11899g;
    public final C0924z h;

    /* JADX INFO: renamed from: j */
    public C0904o0 f11901j;

    /* JADX INFO: renamed from: k */
    public int f11902k;
    public int l;

    /* JADX INFO: renamed from: m */
    public int f11903m;

    /* JADX INFO: renamed from: o */
    public int[] f11905o;

    /* JADX INFO: renamed from: p */
    public t.w f11906p;

    /* JADX INFO: renamed from: q */
    public boolean f11907q;

    /* JADX INFO: renamed from: r */
    public boolean f11908r;

    /* JADX INFO: renamed from: v */
    public t.y f11912v;

    /* JADX INFO: renamed from: w */
    public boolean f11913w;

    /* JADX INFO: renamed from: y */
    public boolean f11915y;

    /* JADX INFO: renamed from: i */
    public final ArrayList f11900i = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final C0366w f11904n = new C0366w();

    /* JADX INFO: renamed from: s */
    public final ArrayList f11909s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final C0366w f11910t = new C0366w();

    /* JADX INFO: renamed from: u */
    public InterfaceC0906p0 f11911u = n0.i.f14490r;

    /* JADX INFO: renamed from: x */
    public final C0366w f11914x = new C0366w();

    /* JADX INFO: renamed from: z */
    public int f11916z = -1;

    public C0912t(AbstractC0875a abstractC0875a, AbstractC0918w abstractC0918w, I0 i02, t.M m7, C0943a c0943a, C0943a c0943a2, C0247a c0247a, C0924z c0924z) {
        this.f11893a = abstractC0875a;
        this.f11894b = abstractC0918w;
        this.f11895c = i02;
        this.f11896d = m7;
        this.f11897e = c0943a;
        this.f11898f = c0943a2;
        this.f11899g = c0247a;
        this.h = c0924z;
        this.f11874C = abstractC0918w.f() || abstractC0918w.d();
        this.f11875D = new C0910s(0, this);
        this.f11876E = new ArrayList();
        H0 h0E = i02.e();
        h0E.c();
        this.f11878G = h0E;
        I0 i03 = new I0();
        if (abstractC0918w.f()) {
            i03.c();
        }
        if (abstractC0918w.d()) {
            i03.f11689y = new t.y();
        }
        this.f11879H = i03;
        L0 l0G = i03.g();
        l0G.e(true);
        this.f11880I = l0G;
        this.f11884M = new C0944b(this, c0943a);
        H0 h0E2 = this.f11879H.e();
        try {
            C0877b c0877bA = h0E2.a(0);
            h0E2.c();
            this.f11885N = c0877bA;
            this.f11886O = new C0945c();
            this.f11888Q = new C1353b(this);
            c5.i iVarJ = abstractC0918w.j();
            c5.i iVarY = y();
            this.f11889R = iVarJ.h(iVarY == null ? c5.j.f10685o : iVarY);
        } catch (Throwable th) {
            h0E2.c();
            throw th;
        }
    }

    public static final int M(C0912t c0912t, int i7, boolean z6, int i8) {
        H0 h02 = c0912t.f11878G;
        boolean zJ = h02.j(i7);
        int[] iArr = h02.f11668b;
        if (zJ) {
            int i9 = h02.i(i7);
            Object objP = h02.p(iArr, i7);
            if (i9 == 206 && AbstractC1209k.a(objP, AbstractC0914u.f11927e)) {
                Object objH = h02.h(i7, 0);
                C0907q c0907q = objH instanceof C0907q ? (C0907q) objH : null;
                if (c0907q != null) {
                    for (C0912t c0912t2 : c0907q.f11859o.f11864e) {
                        I0 i02 = c0912t2.f11895c;
                        if (i02.f11680p > 0 && (i02.f11679o[1] & 67108864) != 0) {
                            C0924z c0924z = c0912t2.h;
                            synchronized (c0924z.f11970r) {
                                c0924z.o();
                                t.J j3 = c0924z.f11957B;
                                c0924z.f11957B = android.support.v4.media.session.b.i();
                                try {
                                    c0924z.f11965J.e0(j3);
                                } finally {
                                }
                            }
                            C0943a c0943a = new C0943a();
                            c0912t2.f11883L = c0943a;
                            H0 h0E = c0912t2.f11895c.e();
                            try {
                                c0912t2.f11878G = h0E;
                                C0944b c0944b = c0912t2.f11884M;
                                C0943a c0943a2 = c0944b.f12281b;
                                try {
                                    c0944b.f12281b = c0943a;
                                    c0912t2.L(0);
                                    C0944b c0944b2 = c0912t2.f11884M;
                                    c0944b2.c();
                                    if (c0944b2.f12282c) {
                                        C0943a c0943a3 = c0944b2.f12281b;
                                        c0943a3.getClass();
                                        c0943a3.f12279u.g0(g0.C.f12264c);
                                        if (c0944b2.f12282c) {
                                            c0944b2.e(false);
                                            c0944b2.e(false);
                                            C0943a c0943a4 = c0944b2.f12281b;
                                            c0943a4.getClass();
                                            c0943a4.f12279u.g0(g0.m.f12301c);
                                            c0944b2.f12282c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                h0E.c();
                            }
                        }
                        c0912t.f11894b.q(c0912t2.h);
                    }
                }
                return h02.o(i7);
            }
            if (!h02.l(i7)) {
                return h02.o(i7);
            }
        } else if (h02.d(i7)) {
            int i10 = iArr[(i7 * 5) + 3] + i7;
            int iM = 0;
            for (int i11 = i7 + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
                boolean zL = h02.l(i11);
                C0944b c0944b3 = c0912t.f11884M;
                if (zL) {
                    c0944b3.d();
                    Object objN = h02.n(i11);
                    c0944b3.d();
                    c0944b3.h.add(objN);
                }
                iM += M(c0912t, i11, zL || z6, zL ? 0 : i8 + iM);
                if (zL) {
                    c0944b3.d();
                    c0944b3.b();
                }
            }
            if (!h02.l(i7)) {
                return iM;
            }
        } else if (!h02.l(i7)) {
            return h02.o(i7);
        }
        return 1;
    }

    public final void A(ArrayList arrayList) {
        C0943a c0943a = this.f11898f;
        C0944b c0944b = this.f11884M;
        C0943a c0943a2 = c0944b.f12281b;
        try {
            c0944b.f12281b = c0943a;
            c0943a.f12279u.g0(C0941A.f12262c);
            if (arrayList.size() > 0) {
                Y4.h hVar = (Y4.h) arrayList.get(0);
                AbstractC0876a0 abstractC0876a0 = (AbstractC0876a0) hVar.f8726o;
                abstractC0876a0.getClass();
                throw null;
            }
            C0943a c0943a3 = c0944b.f12281b;
            c0943a3.getClass();
            c0943a3.f12279u.g0(g0.n.f12302c);
            c0944b.f12285f = 0;
        } finally {
            c0944b.f12281b = c0943a2;
        }
    }

    public final void B(InterfaceC0906p0 interfaceC0906p0, Object obj) {
        U(126665345, null);
        C();
        j0(obj);
        long j3 = this.f11891T;
        try {
            this.f11891T = 126665345;
            if (this.f11890S) {
                L0.y(this.f11880I);
            }
            boolean z6 = (this.f11890S || AbstractC1209k.a(this.f11878G.f(), interfaceC0906p0)) ? false : true;
            if (z6) {
                I(interfaceC0906p0);
            }
            R(202, AbstractC0914u.f11925c, interfaceC0906p0, 0);
            this.f11882K = null;
            boolean z7 = this.f11913w;
            this.f11913w = z6;
            n0.e.d(this, new n0.d(316014703, new R.n(3, obj), true));
            this.f11913w = z7;
        } finally {
        }
    }

    public final Object C() {
        boolean z6 = this.f11890S;
        W w7 = C0903o.f11850a;
        if (!z6) {
            Object objM = this.f11878G.m();
            if (!this.f11915y || (objM instanceof C0907q)) {
                return objM;
            }
        } else if (this.f11908r) {
            AbstractC0914u.c("A call to createNode(), emitNode() or useNode() expected");
            return w7;
        }
        return w7;
    }

    public final List D() {
        AbstractC0918w abstractC0918w = this.f11894b;
        InterfaceC0916v interfaceC0916vH = abstractC0918w.h();
        C0924z c0924z = interfaceC0916vH instanceof C0924z ? (C0924z) interfaceC0916vH : null;
        Z4.v vVar = Z4.v.f8818o;
        if (c0924z != null) {
            I0 i02 = c0924z.f11972t;
            H0 h0E = i02.e();
            try {
                Integer numW = AbstractC1110d.w(h0E, abstractC0918w, 0, h0E.f11669c);
                if (numW != null) {
                    try {
                        return AbstractC1110d.J(i02.e(), numW.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return vVar;
    }

    public final int E(int i7) {
        int iQ = this.f11878G.q(i7) + 1;
        int i8 = 0;
        while (iQ < i7) {
            if (!this.f11878G.k(iQ)) {
                i8++;
            }
            iQ += K0.a(this.f11878G.f11668b, iQ);
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:43:0x0005, B:46:0x0012, B:48:0x0020, B:52:0x0029, B:51:0x0026, B:55:0x0030, B:58:0x0038, B:61:0x0040, B:63:0x0048, B:65:0x004e, B:66:0x0052, B:67:0x0053, B:69:0x0059, B:62:0x0044), top: B:74:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(f0.C0924z r9, f0.C0924z r10, java.lang.Integer r11, java.util.List r12, l5.InterfaceC1180a r13) {
        /*
            r8 = this;
            boolean r0 = r8.f11877F
            int r1 = r8.f11902k
            r2 = 1
            r8.f11877F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f11902k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            Y4.h r6 = (Y4.h) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f8726o     // Catch: java.lang.Throwable -> L24
            f0.u0 r7 = (f0.C0915u0) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f8727p     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.d0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.d0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.f11961F = r10     // Catch: java.lang.Throwable -> L24
            r9.f11962G = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L4d
            r9.f11961F = r5     // Catch: java.lang.Throwable -> L24
            r9.f11962G = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.f11961F = r5     // Catch: java.lang.Throwable -> L24
            r9.f11962G = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.f11877F = r0
            r8.f11902k = r1
            return r10
        L62:
            r8.f11877F = r0
            r8.f11902k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.F(f0.z, f0.z, java.lang.Integer, java.util.List, l5.a):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x032d  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.G():void");
    }

    public final void H() {
        L(this.f11878G.f11673g);
        C0944b c0944b = this.f11884M;
        c0944b.e(false);
        C0912t c0912t = c0944b.f12280a;
        H0 h02 = c0912t.f11878G;
        if (h02.f11669c > 0) {
            int i7 = h02.f11674i;
            C0366w c0366w = c0944b.f12283d;
            if (c0366w.a(-2) != i7) {
                if (!c0944b.f12282c && c0944b.f12284e) {
                    c0944b.e(false);
                    C0943a c0943a = c0944b.f12281b;
                    c0943a.getClass();
                    c0943a.f12279u.g0(g0.q.f12305c);
                    c0944b.f12282c = true;
                }
                if (i7 > 0) {
                    C0877b c0877bA = h02.a(i7);
                    c0366w.c(i7);
                    c0944b.e(false);
                    C0943a c0943a2 = c0944b.f12281b;
                    c0943a2.getClass();
                    g0.p pVar = g0.p.f12304c;
                    g0.L l = c0943a2.f12279u;
                    l.g0(pVar);
                    N5.l.P(l, 0, c0877bA);
                    c0944b.f12282c = true;
                }
            }
        }
        C0943a c0943a3 = c0944b.f12281b;
        c0943a3.getClass();
        c0943a3.f12279u.g0(g0.y.f12317c);
        int i8 = c0944b.f12285f;
        H0 h03 = c0912t.f11878G;
        c0944b.f12285f = h03.f11668b[(h03.f11673g * 5) + 3] + i8;
    }

    public final void I(InterfaceC0906p0 interfaceC0906p0) {
        t.y yVar = this.f11912v;
        if (yVar == null) {
            yVar = new t.y();
            this.f11912v = yVar;
        }
        yVar.h(this.f11878G.f11673g, interfaceC0906p0);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(int r7, int r8, int r9) {
        /*
            r6 = this;
            f0.H0 r0 = r6.f11878G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            g0.b r1 = r6.f11884M
            r1.b()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.J(int, int, int):void");
    }

    public final Object K() {
        boolean z6 = this.f11890S;
        W w7 = C0903o.f11850a;
        if (!z6) {
            Object objM = this.f11878G.m();
            if (!this.f11915y || (objM instanceof C0907q)) {
                return objM instanceof D0 ? ((D0) objM).f11647a : objM;
            }
        } else if (this.f11908r) {
            AbstractC0914u.c("A call to createNode(), emitNode() or useNode() expected");
            return w7;
        }
        return w7;
    }

    public final void L(int i7) {
        boolean zL = this.f11878G.l(i7);
        C0944b c0944b = this.f11884M;
        if (zL) {
            c0944b.d();
            Object objN = this.f11878G.n(i7);
            c0944b.d();
            c0944b.h.add(objN);
        }
        M(this, i7, zL, 0);
        c0944b.d();
        if (zL) {
            c0944b.b();
        }
    }

    public final boolean N(int i7, boolean z6) {
        if ((i7 & 1) == 0 && (this.f11890S || this.f11915y)) {
            B2.g gVar = this.f11887P;
            if (gVar != null && w() != null) {
                gVar.getClass();
            }
        } else if (!z6 && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.O():void");
    }

    public final void P() {
        int i7;
        H0 h02 = this.f11878G;
        int i8 = h02.f11674i;
        if (i8 >= 0) {
            i7 = h02.f11668b[(i8 * 5) + 1] & 67108863;
        } else {
            i7 = 0;
        }
        this.l = i7;
        h02.t();
    }

    public final void Q() {
        if (this.l != 0) {
            AbstractC0914u.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f11890S) {
            return;
        }
        C0915u0 c0915u0W = w();
        if (c0915u0W != null) {
            int i7 = c0915u0W.f11930b;
            if ((i7 & 128) == 0) {
                c0915u0W.f11930b = i7 | 16;
            }
        }
        if (this.f11909s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(int r27, java.lang.Object r28, java.lang.Object r29, int r30) {
        /*
            Method dump skipped, instruction units count: 951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.R(int, java.lang.Object, java.lang.Object, int):void");
    }

    public final void S() {
        R(-127, null, null, 0);
    }

    public final void T(int i7, C0882d0 c0882d0) {
        R(i7, c0882d0, null, 0);
    }

    public final void U(int i7, Object obj) {
        R(i7, obj, null, 0);
    }

    public final void V() {
        R(125, null, null, 1);
        this.f11908r = true;
    }

    public final void W(Object obj, boolean z6) {
        if (z6) {
            H0 h02 = this.f11878G;
            if (h02.f11676k <= 0) {
                if ((h02.f11668b[(h02.f11673g * 5) + 1] & 1073741824) == 0) {
                    AbstractC0908q0.a("Expected a node group");
                }
                h02.u();
                return;
            }
            return;
        }
        if (obj != null && this.f11878G.f() != obj) {
            C0944b c0944b = this.f11884M;
            c0944b.getClass();
            c0944b.e(false);
            C0943a c0943a = c0944b.f12281b;
            c0943a.getClass();
            g0.F f7 = g0.F.f12267c;
            g0.L l = c0943a.f12279u;
            l.g0(f7);
            N5.l.P(l, 0, obj);
        }
        this.f11878G.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0058, code lost:
    
        if ((r0.f11668b[(r4 * 5) + 1] & 536870912) != 0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(int r10) {
        /*
            r9 = this;
            f0.o0 r0 = r9.f11901j
            r1 = 0
            r2 = 0
            if (r0 == 0) goto La
            r9.R(r10, r2, r2, r1)
            return
        La:
            boolean r0 = r9.f11908r
            if (r0 == 0) goto L13
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected"
            f0.AbstractC0914u.c(r0)
        L13:
            int r0 = r9.f11903m
            long r3 = r9.f11891T
            r5 = 3
            long r3 = java.lang.Long.rotateLeft(r3, r5)
            long r6 = (long) r10
            long r3 = r3 ^ r6
            long r3 = java.lang.Long.rotateLeft(r3, r5)
            long r5 = (long) r0
            long r3 = r3 ^ r5
            r9.f11891T = r3
            int r0 = r9.f11903m
            r3 = 1
            int r0 = r0 + r3
            r9.f11903m = r0
            f0.H0 r0 = r9.f11878G
            boolean r4 = r9.f11890S
            f0.W r5 = f0.C0903o.f11850a
            if (r4 == 0) goto L42
            int r4 = r0.f11676k
            int r4 = r4 + r3
            r0.f11676k = r4
            f0.L0 r0 = r9.f11880I
            r0.P(r10, r5, r5, r1)
            r9.u(r1, r2)
            return
        L42:
            int r4 = r0.g()
            if (r4 != r10) goto L62
            int r4 = r0.f11673g
            int r6 = r0.h
            if (r4 >= r6) goto L5b
            int r4 = r4 * 5
            int r4 = r4 + r3
            int[] r6 = r0.f11668b
            r4 = r6[r4]
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r6
            if (r4 == 0) goto L5b
            goto L62
        L5b:
            r0.u()
            r9.u(r1, r2)
            return
        L62:
            int r4 = r0.f11676k
            if (r4 <= 0) goto L67
            goto L83
        L67:
            int r4 = r0.f11673g
            int r6 = r0.h
            if (r4 != r6) goto L6e
            goto L83
        L6e:
            int r6 = r9.f11902k
            r9.H()
            int r7 = r0.s()
            g0.b r8 = r9.f11884M
            r8.f(r6, r7)
            java.util.ArrayList r6 = r9.f11909s
            int r7 = r0.f11673g
            f0.AbstractC0914u.a(r6, r4, r7)
        L83:
            int r4 = r0.f11676k
            int r4 = r4 + r3
            r0.f11676k = r4
            r9.f11890S = r3
            r9.f11882K = r2
            f0.L0 r0 = r9.f11880I
            boolean r0 = r0.f11714w
            if (r0 == 0) goto La1
            f0.I0 r0 = r9.f11879H
            f0.L0 r0 = r0.g()
            r9.f11880I = r0
            r0.L()
            r9.f11881J = r1
            r9.f11882K = r2
        La1:
            f0.L0 r0 = r9.f11880I
            r0.d()
            int r3 = r0.f11711t
            r0.P(r10, r5, r5, r1)
            f0.b r10 = r0.b(r3)
            r9.f11885N = r10
            r9.u(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.X(int):void");
    }

    public final void Y(int i7) {
        R(i7, null, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f0.C0912t Z(int r7) {
        /*
            r6 = this;
            r6.X(r7)
            boolean r7 = r6.f11890S
            L2.a r0 = r6.f11899g
            java.util.ArrayList r1 = r6.f11876E
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            f0.z r3 = r6.h
            if (r7 == 0) goto L2b
            f0.u0 r7 = new f0.u0
            m5.AbstractC1209k.d(r3, r2)
            r7.<init>(r3)
            r1.add(r7)
            r6.j0(r7)
            int r1 = r6.f11873B
            r7.f11933e = r1
            int r1 = r7.f11930b
            r1 = r1 & (-17)
            r7.f11930b = r1
            r0.h()
            return r6
        L2b:
            java.util.ArrayList r7 = r6.f11909s
            f0.H0 r4 = r6.f11878G
            int r4 = r4.f11674i
            int r4 = f0.AbstractC0914u.e(r4, r7)
            if (r4 < 0) goto L3e
            java.lang.Object r7 = r7.remove(r4)
            f0.P r7 = (f0.P) r7
            goto L3f
        L3e:
            r7 = 0
        L3f:
            f0.H0 r4 = r6.f11878G
            java.lang.Object r4 = r4.m()
            f0.W r5 = f0.C0903o.f11850a
            boolean r5 = m5.AbstractC1209k.a(r4, r5)
            if (r5 == 0) goto L59
            f0.u0 r4 = new f0.u0
            m5.AbstractC1209k.d(r3, r2)
            r4.<init>(r3)
            r6.j0(r4)
            goto L60
        L59:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            m5.AbstractC1209k.d(r4, r2)
            f0.u0 r4 = (f0.C0915u0) r4
        L60:
            r2 = 0
            r3 = 1
            if (r7 != 0) goto L78
            int r7 = r4.f11930b
            r5 = r7 & 64
            if (r5 == 0) goto L6c
            r5 = r3
            goto L6d
        L6c:
            r5 = r2
        L6d:
            if (r5 == 0) goto L73
            r7 = r7 & (-65)
            r4.f11930b = r7
        L73:
            if (r5 == 0) goto L76
            goto L78
        L76:
            r7 = r2
            goto L79
        L78:
            r7 = r3
        L79:
            int r5 = r4.f11930b
            if (r7 == 0) goto L80
            r7 = r5 | 8
            goto L82
        L80:
            r7 = r5 & (-9)
        L82:
            r4.f11930b = r7
            r1.add(r4)
            int r7 = r6.f11873B
            r4.f11933e = r7
            int r7 = r4.f11930b
            r7 = r7 & (-17)
            r4.f11930b = r7
            r0.h()
            int r7 = r4.f11930b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lc1
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r4.f11930b = r7
            g0.b r7 = r6.f11884M
            g0.a r7 = r7.f12281b
            r7.getClass()
            g0.D r0 = g0.D.f12265c
            g0.L r7 = r7.f12279u
            r7.g0(r0)
            N5.l.P(r7, r2, r4)
            boolean r7 = r6.f11915y
            if (r7 != 0) goto Lc1
            int r7 = r4.f11930b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lc1
            r6.f11915y = r3
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r4.f11930b = r7
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.Z(int):f0.t");
    }

    public final void a() {
        i();
        this.f11900i.clear();
        this.f11904n.f6086b = 0;
        this.f11910t.f6086b = 0;
        this.f11914x.f6086b = 0;
        this.f11912v = null;
        C0945c c0945c = this.f11886O;
        c0945c.f12291v.c0();
        c0945c.f12290u.c0();
        this.f11891T = 0;
        this.f11872A = 0;
        this.f11908r = false;
        this.f11890S = false;
        this.f11915y = false;
        this.f11877F = false;
        this.f11916z = -1;
        H0 h02 = this.f11878G;
        if (!h02.f11672f) {
            h02.c();
        }
        if (this.f11880I.f11714w) {
            return;
        }
        v();
    }

    public final void a0(Object obj) {
        if (!this.f11890S && this.f11878G.g() == 207 && !AbstractC1209k.a(this.f11878G.f(), obj) && this.f11916z < 0) {
            this.f11916z = this.f11878G.f11673g;
            this.f11915y = true;
        }
        R(207, null, obj, 0);
    }

    public final void b(Object obj, l5.e eVar) {
        if (this.f11890S) {
            C0945c c0945c = this.f11886O;
            c0945c.getClass();
            g0.G g6 = g0.G.f12268c;
            g0.L l = c0945c.f12290u;
            l.g0(g6);
            N5.l.P(l, 0, obj);
            AbstractC1209k.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            AbstractC1223y.c(2, eVar);
            N5.l.P(l, 1, eVar);
            return;
        }
        C0944b c0944b = this.f11884M;
        c0944b.c();
        C0943a c0943a = c0944b.f12281b;
        c0943a.getClass();
        g0.G g7 = g0.G.f12268c;
        g0.L l7 = c0943a.f12279u;
        l7.g0(g7);
        AbstractC1209k.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        AbstractC1223y.c(2, eVar);
        N5.l.Q(l7, 0, obj, 1, eVar);
    }

    public final void b0() {
        R(125, null, null, 2);
        this.f11908r = true;
    }

    public final boolean c(float f7) {
        Object objC = C();
        if ((objC instanceof Float) && f7 == ((Number) objC).floatValue()) {
            return false;
        }
        j0(Float.valueOf(f7));
        return true;
    }

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
    public final void c0() {
        this.f11903m = 0;
        this.f11878G = this.f11895c.e();
        R(100, null, null, 0);
        AbstractC0918w abstractC0918w = this.f11894b;
        abstractC0918w.r();
        InterfaceC0906p0 interfaceC0906p0I = abstractC0918w.i();
        this.f11914x.c(this.f11913w ? 1 : 0);
        this.f11913w = f(interfaceC0906p0I);
        this.f11882K = null;
        if (!this.f11907q) {
            this.f11907q = abstractC0918w.e();
        }
        if (!this.f11874C) {
            this.f11874C = abstractC0918w.f();
        }
        if (this.f11874C) {
            a1 a1Var = AbstractC1354c.f15442a;
            AbstractC1209k.d(a1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            interfaceC0906p0I = ((n0.i) interfaceC0906p0I).d(a1Var, new b1(y()));
        }
        this.f11911u = interfaceC0906p0I;
        Set set = (Set) C0879c.v(interfaceC0906p0I, AbstractC1356e.f15444a);
        if (set != null) {
            C0922y c0922y = this.f11892U;
            if (c0922y == null) {
                c0922y = new C0922y(this.h);
                this.f11892U = c0922y;
            }
            set.add(c0922y);
            abstractC0918w.n(set);
        }
        long jG = abstractC0918w.g();
        R((int) (jG ^ (jG >>> 32)), null, null, 0);
    }

    public final boolean d(int i7) {
        Object objC = C();
        if ((objC instanceof Integer) && i7 == ((Number) objC).intValue()) {
            return false;
        }
        j0(Integer.valueOf(i7));
        return true;
    }

    public final boolean d0(C0915u0 c0915u0, Object obj) {
        C0877b c0877b = c0915u0.f11931c;
        if (c0877b == null) {
            return false;
        }
        int iB = this.f11878G.f11667a.b(c0877b);
        if (!this.f11877F || iB < this.f11878G.f11673g) {
            return false;
        }
        ArrayList arrayList = this.f11909s;
        int iE = AbstractC0914u.e(iB, arrayList);
        if (iE < 0) {
            int i7 = -(iE + 1);
            if (!(obj instanceof G)) {
                obj = null;
            }
            arrayList.add(i7, new P(c0915u0, iB, obj));
            return true;
        }
        P p7 = (P) arrayList.get(iE);
        if (!(obj instanceof G)) {
            p7.f11730c = null;
            return true;
        }
        Object obj2 = p7.f11730c;
        if (obj2 == null) {
            p7.f11730c = obj;
            return true;
        }
        if (obj2 instanceof t.K) {
            ((t.K) obj2).a(obj);
            return true;
        }
        t.K k7 = t.S.f16033a;
        t.K k8 = new t.K(2);
        k8.j(obj2);
        k8.j(obj);
        p7.f11730c = k8;
        return true;
    }

    public final boolean e(long j3) {
        Object objC = C();
        if ((objC instanceof Long) && j3 == ((Number) objC).longValue()) {
            return false;
        }
        j0(Long.valueOf(j3));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(t.J r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.f11909s
            int r3 = Z4.o.d0(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L2e
            java.lang.Object r4 = r2.get(r3)
            f0.P r4 = (f0.P) r4
            f0.u0 r5 = r4.f11728a
            f0.b r5 = r5.f11931c
            if (r5 == 0) goto L28
            boolean r6 = r5.a()
            if (r6 == 0) goto L28
            int r6 = r4.f11729b
            int r5 = r5.f11789a
            if (r6 == r5) goto L2b
            r4.f11729b = r5
            goto L2b
        L28:
            r2.remove(r3)
        L2b:
            int r3 = r3 + (-1)
            goto La
        L2e:
            java.lang.Object[] r3 = r1.f16004b
            java.lang.Object[] r4 = r1.f16005c
            long[] r1 = r1.f16003a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8b
            r7 = 0
        L3a:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L86
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L54:
            if (r12 >= r10) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L80
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            m5.AbstractC1209k.d(r14, r15)
            f0.u0 r14 = (f0.C0915u0) r14
            f0.b r15 = r14.f11931c
            if (r15 == 0) goto L80
            int r15 = r15.f11789a
            f0.W r6 = f0.W.f11766s
            if (r13 != r6) goto L78
            r13 = 0
        L78:
            f0.P r6 = new f0.P
            r6.<init>(r14, r15, r13)
            r2.add(r6)
        L80:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L54
        L84:
            if (r10 != r11) goto L8b
        L86:
            if (r7 == r5) goto L8b
            int r7 = r7 + 1
            goto L3a
        L8b:
            C1.b r1 = f0.AbstractC0914u.f11928f
            Z4.s.k0(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.e0(t.J):void");
    }

    public final boolean f(Object obj) {
        if (AbstractC1209k.a(C(), obj)) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final void f0(int i7, int i8) {
        if (k0(i7) != i8) {
            if (i7 < 0) {
                t.w wVar = this.f11906p;
                if (wVar == null) {
                    wVar = new t.w();
                    this.f11906p = wVar;
                }
                wVar.f(i7, i8);
                return;
            }
            int[] iArr = this.f11905o;
            if (iArr == null) {
                int i9 = this.f11878G.f11669c;
                int[] iArr2 = new int[i9];
                Arrays.fill(iArr2, 0, i9, -1);
                this.f11905o = iArr2;
                iArr = iArr2;
            }
            iArr[i7] = i8;
        }
    }

    public final boolean g(boolean z6) {
        Object objC = C();
        if ((objC instanceof Boolean) && z6 == ((Boolean) objC).booleanValue()) {
            return false;
        }
        j0(Boolean.valueOf(z6));
        return true;
    }

    public final void g0(int i7, int i8) {
        int iK0 = k0(i7);
        if (iK0 != i8) {
            int i9 = i8 - iK0;
            ArrayList arrayList = this.f11900i;
            int size = arrayList.size() - 1;
            while (i7 != -1) {
                int iK02 = k0(i7) + i9;
                f0(i7, iK02);
                int i10 = size;
                while (true) {
                    if (-1 < i10) {
                        C0904o0 c0904o0 = (C0904o0) arrayList.get(i10);
                        if (c0904o0 != null && c0904o0.a(i7, iK02)) {
                            size = i10 - 1;
                            break;
                        }
                        i10--;
                    } else {
                        break;
                    }
                }
                if (i7 < 0) {
                    i7 = this.f11878G.f11674i;
                } else if (this.f11878G.l(i7)) {
                    return;
                } else {
                    i7 = this.f11878G.q(i7);
                }
            }
        }
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final n0.i h0(InterfaceC0906p0 interfaceC0906p0, n0.i iVar) {
        n0.i iVar2 = (n0.i) interfaceC0906p0;
        iVar2.getClass();
        n0.h hVar = new n0.h(iVar2);
        hVar.f14489u = iVar2;
        hVar.putAll(iVar);
        n0.i iVarA = hVar.a();
        T(204, AbstractC0914u.f11926d);
        C();
        j0(iVarA);
        C();
        j0(iVar);
        p(false);
        return iVarA;
    }

    public final void i() {
        this.f11901j = null;
        this.f11902k = 0;
        this.l = 0;
        this.f11891T = 0L;
        this.f11908r = false;
        C0944b c0944b = this.f11884M;
        c0944b.f12282c = false;
        c0944b.f12283d.f6086b = 0;
        c0944b.f12285f = 0;
        this.f11876E.clear();
        this.f11905o = null;
        this.f11906p = null;
    }

    public final void i0(Object obj) {
        int i7;
        H0 h02;
        int i8;
        L0 l02;
        if (obj instanceof C0) {
            C0 c02 = (C0) obj;
            C0877b c0877bA = null;
            if (this.f11890S) {
                L0 l03 = this.f11880I;
                int i9 = l03.f11711t;
                if (i9 > l03.f11713v + 1) {
                    int i10 = i9 - 1;
                    int iD = l03.D(l03.f11695b, i10);
                    while (true) {
                        i8 = i10;
                        i10 = iD;
                        l02 = this.f11880I;
                        if (i10 == l02.f11713v || i10 < 0) {
                            break;
                        } else {
                            iD = l02.D(l02.f11695b, i10);
                        }
                    }
                    c0877bA = l02.b(i8);
                }
            } else {
                H0 h03 = this.f11878G;
                int i11 = h03.f11673g;
                if (i11 > h03.f11674i + 1) {
                    int i12 = i11 - 1;
                    int iQ = h03.q(i12);
                    while (true) {
                        i7 = i12;
                        i12 = iQ;
                        h02 = this.f11878G;
                        if (i12 == h02.f11674i || i12 < 0) {
                            break;
                        } else {
                            iQ = h02.q(i12);
                        }
                    }
                    c0877bA = h02.a(i7);
                }
            }
            D0 d02 = new D0(c02, c0877bA);
            if (this.f11890S) {
                C0943a c0943a = this.f11884M.f12281b;
                c0943a.getClass();
                g0.w wVar = g0.w.f12315c;
                g0.L l = c0943a.f12279u;
                l.g0(wVar);
                N5.l.P(l, 0, d02);
            }
            this.f11896d.add(obj);
            obj = d02;
        }
        j0(obj);
    }

    public final Object j(AbstractC0911s0 abstractC0911s0) {
        return C0879c.v(l(), abstractC0911s0);
    }

    public final void j0(Object obj) {
        if (this.f11890S) {
            L0 l02 = this.f11880I;
            if (l02.f11705n <= 0 || l02.f11701i == l02.f11703k) {
                l02.E(obj);
                return;
            }
            t.y yVar = l02.f11710s;
            if (yVar == null) {
                yVar = new t.y();
            }
            l02.f11710s = yVar;
            int i7 = l02.f11713v;
            Object objB = yVar.b(i7);
            if (objB == null) {
                objB = new C1444F();
                yVar.h(i7, objB);
            }
            ((C1444F) objB).a(obj);
            return;
        }
        H0 h02 = this.f11878G;
        boolean z6 = h02.f11678n;
        C0944b c0944b = this.f11884M;
        if (!z6) {
            C0877b c0877bA = h02.a(h02.f11674i);
            C0943a c0943a = c0944b.f12281b;
            c0943a.getClass();
            C0947e c0947e = C0947e.f12293c;
            g0.L l = c0943a.f12279u;
            l.g0(c0947e);
            N5.l.Q(l, 0, c0877bA, 1, obj);
            return;
        }
        int iC = (h02.l - K0.c(h02.f11668b, h02.f11674i)) - 1;
        if (c0944b.f12280a.f11878G.f11674i - c0944b.f12285f >= 0) {
            c0944b.e(true);
            C0943a c0943a2 = c0944b.f12281b;
            g0.r rVar = g0.r.f12309g;
            g0.L l7 = c0943a2.f12279u;
            l7.g0(rVar);
            N5.l.P(l7, 0, obj);
            l7.f12275w[l7.f12276x - l7.f12273u[l7.f12274v - 1].f12271a] = iC;
            return;
        }
        H0 h03 = this.f11878G;
        C0877b c0877bA2 = h03.a(h03.f11674i);
        C0943a c0943a3 = c0944b.f12281b;
        g0.r rVar2 = g0.r.f12308f;
        g0.L l8 = c0943a3.f12279u;
        l8.g0(rVar2);
        N5.l.Q(l8, 0, obj, 1, c0877bA2);
        l8.f12275w[l8.f12276x - l8.f12273u[l8.f12274v - 1].f12271a] = iC;
    }

    public final void k(InterfaceC1180a interfaceC1180a) {
        if (!this.f11908r) {
            AbstractC0914u.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f11908r = false;
        if (!this.f11890S) {
            AbstractC0914u.c("createNode() can only be called when inserting");
        }
        C0366w c0366w = this.f11904n;
        int i7 = c0366w.f6085a[c0366w.f6086b - 1];
        L0 l02 = this.f11880I;
        C0877b c0877bB = l02.b(l02.f11713v);
        this.l++;
        C0945c c0945c = this.f11886O;
        g0.r rVar = g0.r.f12306d;
        g0.L l = c0945c.f12290u;
        l.g0(rVar);
        N5.l.P(l, 0, interfaceC1180a);
        l.f12275w[l.f12276x - l.f12273u[l.f12274v - 1].f12271a] = i7;
        N5.l.P(l, 1, c0877bB);
        g0.r rVar2 = g0.r.f12307e;
        g0.L l7 = c0945c.f12291v;
        l7.g0(rVar2);
        l7.f12275w[l7.f12276x - l7.f12273u[l7.f12274v - 1].f12271a] = i7;
        N5.l.P(l7, 0, c0877bB);
    }

    public final int k0(int i7) {
        int i8;
        if (i7 >= 0) {
            int[] iArr = this.f11905o;
            return (iArr == null || (i8 = iArr[i7]) < 0) ? this.f11878G.o(i7) : i8;
        }
        t.w wVar = this.f11906p;
        if (wVar == null || wVar.c(i7) < 0) {
            return 0;
        }
        int iC = wVar.c(i7);
        if (iC >= 0) {
            return wVar.f16122c[iC];
        }
        AbstractC1525a.e("Cannot find value for key " + i7);
        throw null;
    }

    public final InterfaceC0906p0 l() {
        InterfaceC0906p0 interfaceC0906p0;
        InterfaceC0906p0 interfaceC0906p02 = this.f11882K;
        if (interfaceC0906p02 != null) {
            return interfaceC0906p02;
        }
        int iQ = this.f11878G.f11674i;
        boolean z6 = this.f11890S;
        C0882d0 c0882d0 = AbstractC0914u.f11925c;
        if (z6 && this.f11881J) {
            int iD = this.f11880I.f11713v;
            while (iD > 0) {
                L0 l02 = this.f11880I;
                if (l02.f11695b[l02.r(iD) * 5] == 202 && AbstractC1209k.a(this.f11880I.s(iD), c0882d0)) {
                    Object objQ = this.f11880I.q(iD);
                    AbstractC1209k.d(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC0906p0 interfaceC0906p03 = (InterfaceC0906p0) objQ;
                    this.f11882K = interfaceC0906p03;
                    return interfaceC0906p03;
                }
                L0 l03 = this.f11880I;
                iD = l03.D(l03.f11695b, iD);
            }
        }
        if (this.f11878G.f11669c > 0) {
            while (iQ > 0) {
                if (this.f11878G.i(iQ) == 202) {
                    H0 h02 = this.f11878G;
                    if (AbstractC1209k.a(h02.p(h02.f11668b, iQ), c0882d0)) {
                        t.y yVar = this.f11912v;
                        if (yVar == null || (interfaceC0906p0 = (InterfaceC0906p0) yVar.b(iQ)) == null) {
                            H0 h03 = this.f11878G;
                            Object objB = h03.b(h03.f11668b, iQ);
                            AbstractC1209k.d(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            interfaceC0906p0 = (InterfaceC0906p0) objB;
                        }
                        this.f11882K = interfaceC0906p0;
                        return interfaceC0906p0;
                    }
                }
                iQ = this.f11878G.q(iQ);
            }
        }
        InterfaceC0906p0 interfaceC0906p04 = this.f11911u;
        this.f11882K = interfaceC0906p04;
        return interfaceC0906p04;
    }

    public final void l0() {
        if (!this.f11908r) {
            AbstractC0914u.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f11908r = false;
        if (this.f11890S) {
            AbstractC0914u.c("useNode() called while inserting");
        }
        H0 h02 = this.f11878G;
        Object objN = h02.n(h02.f11674i);
        C0944b c0944b = this.f11884M;
        c0944b.d();
        c0944b.h.add(objN);
        if (this.f11915y && (objN instanceof InterfaceC0895k)) {
            c0944b.c();
            C0943a c0943a = c0944b.f12281b;
            c0943a.getClass();
            if (objN instanceof InterfaceC0895k) {
                c0943a.f12279u.g0(g0.I.f12270c);
            }
        }
    }

    public final List m() {
        boolean z6 = this.f11874C;
        List list = Z4.v.f8818o;
        if (!z6) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        L0 l02 = this.f11880I;
        arrayList.addAll(AbstractC1110d.q(l02, null, l02.f11711t, null));
        H0 h02 = this.f11878G;
        if (!h02.f11672f && h02.f11669c != 0) {
            C1359h c1359h = new C1359h(h02);
            int iQ = h02.f11674i;
            Object objValueOf = Integer.valueOf(h02.l - K0.c(h02.f11668b, iQ));
            while (iQ >= 0) {
                c1359h.X0(h02.f11667a.n(iQ), objValueOf);
                objValueOf = h02.a(iQ);
                iQ = h02.q(iQ);
            }
            list = (ArrayList) c1359h.f2813b;
        }
        arrayList.addAll(list);
        arrayList.addAll(D());
        return arrayList;
    }

    public final void n(t.J j3, l5.e eVar) {
        ArrayList arrayList = this.f11909s;
        if (this.f11877F) {
            AbstractC0914u.c("Reentrant composition is not supported");
        }
        this.f11899g.h();
        Trace.beginSection("Compose:recompose");
        try {
            long jG = p0.l.k().g();
            this.f11873B = (int) (jG ^ (jG >>> 32));
            this.f11912v = null;
            e0(j3);
            this.f11902k = 0;
            this.f11877F = true;
            try {
                c0();
                Object objC = C();
                if (objC != eVar && eVar != null) {
                    j0(eVar);
                }
                C0910s c0910s = this.f11875D;
                h0.e eVarM = C0879c.m();
                try {
                    eVarM.b(c0910s);
                    C0882d0 c0882d0 = AbstractC0914u.f11923a;
                    if (eVar != null) {
                        T(200, c0882d0);
                        n0.e.d(this, eVar);
                        p(false);
                    } else if (!this.f11913w || objC == null || objC.equals(C0903o.f11850a)) {
                        O();
                    } else {
                        T(200, c0882d0);
                        AbstractC1223y.c(2, objC);
                        n0.e.d(this, (l5.e) objC);
                        p(false);
                    }
                    eVarM.l(eVarM.f12548q - 1);
                    t();
                    this.f11877F = false;
                    arrayList.clear();
                    if (!this.f11880I.f11714w) {
                        AbstractC0914u.c("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    eVarM.l(eVarM.f12548q - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i7, int i8) {
        if (i7 <= 0 || i7 == i8) {
            return;
        }
        o(this.f11878G.q(i7), i8);
        if (this.f11878G.l(i7)) {
            Object objN = this.f11878G.n(i7);
            C0944b c0944b = this.f11884M;
            c0944b.d();
            c0944b.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:406:0x038e  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(boolean r42) {
        /*
            Method dump skipped, instruction units count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.p(boolean):void");
    }

    public final void q() {
        p(false);
        C0915u0 c0915u0W = w();
        if (c0915u0W != null) {
            int i7 = c0915u0W.f11930b;
            if ((i7 & 1) != 0) {
                c0915u0W.f11930b = i7 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0083 A[EDGE_INSN: B:123:0x0083->B:92:0x0083 BREAK  A[LOOP:0: B:79:0x003e->B:91:0x0080], EDGE_INSN: B:124:0x0083->B:92:0x0083 BREAK  A[LOOP:0: B:79:0x003e->B:91:0x0080]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f0.C0915u0 r() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0912t.r():f0.u0");
    }

    public final void s() {
        if (this.f11877F || this.f11916z != 100) {
            AbstractC0908q0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f11916z = -1;
        this.f11915y = false;
    }

    public final void t() {
        p(false);
        this.f11894b.c();
        p(false);
        C0944b c0944b = this.f11884M;
        if (c0944b.f12282c) {
            c0944b.e(false);
            c0944b.e(false);
            C0943a c0943a = c0944b.f12281b;
            c0943a.getClass();
            c0943a.f12279u.g0(g0.m.f12301c);
            c0944b.f12282c = false;
        }
        c0944b.c();
        if (c0944b.f12283d.f6086b != 0) {
            AbstractC0914u.c("Missed recording an endGroup()");
        }
        if (!this.f11900i.isEmpty()) {
            AbstractC0914u.c("Start/end imbalance");
        }
        i();
        this.f11878G.c();
        this.f11913w = this.f11914x.b() != 0;
    }

    public final void u(boolean z6, C0904o0 c0904o0) {
        this.f11900i.add(this.f11901j);
        this.f11901j = c0904o0;
        int i7 = this.l;
        C0366w c0366w = this.f11904n;
        c0366w.c(i7);
        c0366w.c(this.f11903m);
        c0366w.c(this.f11902k);
        if (z6) {
            this.f11902k = 0;
        }
        this.l = 0;
        this.f11903m = 0;
    }

    public final void v() {
        I0 i02 = new I0();
        if (this.f11874C) {
            i02.c();
        }
        if (this.f11894b.d()) {
            i02.f11689y = new t.y();
        }
        this.f11879H = i02;
        L0 l0G = i02.g();
        l0G.e(true);
        this.f11880I = l0G;
    }

    public final C0915u0 w() {
        if (this.f11872A != 0) {
            return null;
        }
        ArrayList arrayList = this.f11876E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C0915u0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.f11913w) {
            return true;
        }
        C0915u0 c0915u0W = w();
        return (c0915u0W == null || (c0915u0W.f11930b & 4) == 0) ? false : true;
    }

    public final C1353b y() {
        if (this.f11874C) {
            return this.f11888Q;
        }
        return null;
    }

    public final boolean z() {
        C0915u0 c0915u0W;
        return (this.f11890S || this.f11915y || this.f11913w || (c0915u0W = w()) == null || (c0915u0W.f11930b & 8) != 0) ? false : true;
    }
}
