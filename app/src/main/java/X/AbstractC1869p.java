package x;

import K0.C0245m;
import K0.EnumC0246n;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0357m;
import X.C0467b0;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.C1216r;
import s5.InterfaceC1438c;
import t.AbstractC1462q;
import t.C1441C;
import w5.AbstractC1767D;
import z.C2059r0;

/* JADX INFO: renamed from: x.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1869p extends AbstractC0358n implements Q0.x0, I0.d, Q0.A0, Q0.F0, InterfaceC0356l, Q0.n0 {

    /* JADX INFO: renamed from: X */
    public static final C1874r0 f19789X = new C1874r0();

    /* JADX INFO: renamed from: E */
    public B.k f19790E;

    /* JADX INFO: renamed from: F */
    public InterfaceC1852g0 f19791F;

    /* JADX INFO: renamed from: G */
    public boolean f19792G;

    /* JADX INFO: renamed from: H */
    public String f19793H;

    /* JADX INFO: renamed from: I */
    public Y0.g f19794I;

    /* JADX INFO: renamed from: J */
    public boolean f19795J;

    /* JADX INFO: renamed from: K */
    public InterfaceC1180a f19796K;

    /* JADX INFO: renamed from: L */
    public final C1829P f19797L;

    /* JADX INFO: renamed from: M */
    public InterfaceC1852g0 f19798M;

    /* JADX INFO: renamed from: N */
    public K0.N f19799N;

    /* JADX INFO: renamed from: O */
    public InterfaceC0357m f19800O;

    /* JADX INFO: renamed from: P */
    public B.m f19801P;

    /* JADX INFO: renamed from: Q */
    public B.h f19802Q;

    /* JADX INFO: renamed from: R */
    public final C1441C f19803R;

    /* JADX INFO: renamed from: S */
    public long f19804S;

    /* JADX INFO: renamed from: T */
    public B.k f19805T;

    /* JADX INFO: renamed from: U */
    public boolean f19806U;

    /* JADX INFO: renamed from: V */
    public w5.w0 f19807V;

    /* JADX INFO: renamed from: W */
    public final C1874r0 f19808W;

    public AbstractC1869p(B.k kVar, InterfaceC1852g0 interfaceC1852g0, boolean z6, boolean z7, String str, Y0.g gVar, InterfaceC1180a interfaceC1180a) {
        this.f19790E = kVar;
        this.f19791F = interfaceC1852g0;
        this.f19792G = z6;
        this.f19793H = str;
        this.f19794I = gVar;
        this.f19795J = z7;
        this.f19796K = interfaceC1180a;
        this.f19797L = new C1829P(kVar, 0, new M.r0(1, this, AbstractC1869p.class, "onFocusChange", "onFocusChange(Z)V", 0, 4));
        C1441C c1441c = AbstractC1462q.f16101a;
        this.f19803R = new C1441C();
        this.f19804S = 0L;
        B.k kVar2 = this.f19790E;
        this.f19805T = kVar2;
        this.f19806U = kVar2 == null;
        this.f19808W = f19789X;
    }

    @Override // Q0.n0
    public final void F() {
        if (this.f19792G) {
            AbstractC0347f.t(this, new C1839a(this, 0));
        }
    }

    public abstract K0.N F0();

    public final boolean G0() {
        C1216r c1216r = new C1216r();
        AbstractC0347f.A(this, C2059r0.f20947D, new C0467b0(c1216r, 2));
        if (c1216r.f14435o) {
            return true;
        }
        int i7 = AbstractC1887y.f19858b;
        ViewParent parent = AbstractC0347f.z(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H0() {
        /*
            r17 = this;
            r0 = r17
            B.k r1 = r0.f19790E
            t.C r2 = r0.f19803R
            if (r1 == 0) goto L6a
            B.m r3 = r0.f19801P
            if (r3 == 0) goto L14
            B.l r4 = new B.l
            r4.<init>(r3)
            r1.b(r4)
        L14:
            B.h r3 = r0.f19802Q
            if (r3 == 0) goto L20
            B.i r4 = new B.i
            r4.<init>(r3)
            r1.b(r4)
        L20:
            java.lang.Object[] r3 = r2.f15968c
            long[] r4 = r2.f15966a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6a
            r6 = 0
            r7 = r6
        L2b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L65
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L45:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            B.m r13 = (B.m) r13
            B.l r14 = new B.l
            r14.<init>(r13)
            r1.b(r14)
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r5) goto L6a
            int r7 = r7 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.f19801P = r1
            r0.f19802Q = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1869p.H0():void");
    }

    public final void I0() {
        B.k kVar = this.f19790E;
        if (kVar != null) {
            w5.w0 w0Var = this.f19807V;
            if (w0Var == null || !w0Var.b()) {
                B.m mVar = this.f19801P;
                if (mVar != null) {
                    AbstractC1767D.t(n0(), null, new C1849f(kVar, mVar, null), 3);
                }
            } else {
                w5.w0 w0Var2 = this.f19807V;
                if (w0Var2 != null) {
                    w0Var2.c(null);
                }
            }
            this.f19801P = null;
        }
    }

    public final void J0() {
        if (this.f19800O != null) {
            return;
        }
        InterfaceC1852g0 interfaceC1852g0 = this.f19792G ? this.f19798M : this.f19791F;
        if (interfaceC1852g0 != null) {
            if (this.f19790E == null) {
                this.f19790E = new B.k();
            }
            this.f19797L.G0(this.f19790E);
            B.k kVar = this.f19790E;
            AbstractC1209k.c(kVar);
            InterfaceC0357m interfaceC0357mB = interfaceC1852g0.b(kVar);
            B0(interfaceC0357mB);
            this.f19800O = interfaceC0357mB;
        }
    }

    public abstract boolean L0(KeyEvent keyEvent);

    public abstract void M0(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:66:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // I0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.J0()
            long r0 = I0.c.A(r11)
            boolean r2 = r10.f19795J
            r3 = 3
            r4 = 0
            t.C r5 = r10.f19803R
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = I0.c.B(r11)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = androidx.compose.foundation.a.h(r11)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            B.m r2 = new B.m
            long r8 = r10.f19804S
            r2.<init>(r8)
            r5.h(r0, r2)
            B.k r0 = r10.f19790E
            if (r0 == 0) goto L3e
            w5.B r0 = r10.n0()
            x.l r1 = new x.l
            r1.<init>(r10, r2, r4)
            w5.AbstractC1767D.t(r0, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r10.L0(r11)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r10.f19795J
            if (r2 == 0) goto L78
            int r2 = I0.c.B(r11)
            if (r2 != r6) goto L78
            boolean r2 = androidx.compose.foundation.a.h(r11)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.g(r0)
            B.m r0 = (B.m) r0
            if (r0 == 0) goto L75
            B.k r1 = r10.f19790E
            if (r1 == 0) goto L72
            w5.B r1 = r10.n0()
            x.m r2 = new x.m
            r2.<init>(r10, r0, r4)
            w5.AbstractC1767D.t(r1, r4, r2, r3)
        L72:
            r10.M0(r11)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1869p.N(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(B.k r4, x.InterfaceC1852g0 r5, boolean r6, boolean r7, java.lang.String r8, Y0.g r9, l5.InterfaceC1180a r10) {
        /*
            r3 = this;
            B.k r0 = r3.f19805T
            boolean r0 = m5.AbstractC1209k.a(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L13
            r3.H0()
            r3.f19805T = r4
            r3.f19790E = r4
            r4 = r2
            goto L14
        L13:
            r4 = r1
        L14:
            x.g0 r0 = r3.f19791F
            boolean r0 = m5.AbstractC1209k.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f19791F = r5
            r4 = r2
        L1f:
            boolean r5 = r3.f19792G
            if (r5 == r6) goto L2b
            r3.f19792G = r6
            if (r6 == 0) goto L2a
            r3.F()
        L2a:
            r4 = r2
        L2b:
            boolean r5 = r3.f19795J
            x.P r6 = r3.f19797L
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.B0(r6)
            goto L3d
        L37:
            r3.C0(r6)
            r3.H0()
        L3d:
            Q0.AbstractC0347f.o(r3)
            r3.f19795J = r7
        L42:
            java.lang.String r5 = r3.f19793H
            boolean r5 = m5.AbstractC1209k.a(r5, r8)
            if (r5 != 0) goto L4f
            r3.f19793H = r8
            Q0.AbstractC0347f.o(r3)
        L4f:
            Y0.g r5 = r3.f19794I
            boolean r5 = m5.AbstractC1209k.a(r5, r9)
            if (r5 != 0) goto L5c
            r3.f19794I = r9
            Q0.AbstractC0347f.o(r3)
        L5c:
            r3.f19796K = r10
            boolean r5 = r3.f19806U
            B.k r7 = r3.f19805T
            if (r7 != 0) goto L66
            r8 = r2
            goto L67
        L66:
            r8 = r1
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r1 = r2
        L6c:
            r3.f19806U = r1
            if (r1 != 0) goto L75
            Q0.m r5 = r3.f19800O
            if (r5 != 0) goto L75
            goto L76
        L75:
            r2 = r4
        L76:
            if (r2 == 0) goto L8b
            Q0.m r4 = r3.f19800O
            if (r4 != 0) goto L80
            boolean r5 = r3.f19806U
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.C0(r4)
        L85:
            r4 = 0
            r3.f19800O = r4
            r3.J0()
        L8b:
            B.k r4 = r3.f19790E
            r6.G0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1869p.N0(B.k, x.g0, boolean, boolean, java.lang.String, Y0.g, l5.a):void");
    }

    @Override // Q0.x0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        Y0.g gVar = this.f19794I;
        if (gVar != null) {
            Y0.v.c(jVar, gVar.f8444a);
        }
        String str = this.f19793H;
        C1839a c1839a = new C1839a(this, 1);
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        jVar.i(Y0.i.f8450b, new Y0.a(str, c1839a));
        if (this.f19795J) {
            this.f19797L.T(jVar);
        } else {
            jVar.i(Y0.t.f8537i, Y4.o.f8736a);
        }
        E0(jVar);
    }

    @Override // Q0.x0
    public final void X() {
        Z();
    }

    @Override // Q0.x0
    public void Z() {
        B.h hVar;
        B.k kVar = this.f19790E;
        if (kVar != null && (hVar = this.f19802Q) != null) {
            kVar.b(new B.i(hVar));
        }
        this.f19802Q = null;
        K0.N n7 = this.f19799N;
        if (n7 != null) {
            n7.Z();
        }
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A0
    public final boolean d0() {
        return true;
    }

    @Override // Q0.x0
    public final /* synthetic */ void g0() {
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // I0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // Q0.F0
    public final Object o() {
        return this.f19808W;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // Q0.x0
    public final long q() {
        return Q0.D0.f5781a;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        F();
        if (!this.f19806U) {
            J0();
        }
        if (this.f19795J) {
            B0(this.f19797L);
        }
    }

    @Override // r0.AbstractC1397o
    public final void s0() {
        Z();
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        H0();
        if (this.f19805T == null) {
            this.f19790E = null;
        }
        InterfaceC0357m interfaceC0357m = this.f19800O;
        if (interfaceC0357m != null) {
            C0(interfaceC0357m);
        }
        this.f19800O = null;
    }

    @Override // Q0.x0
    public void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        K0.N nF0;
        long j7 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        this.f19804S = (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32);
        J0();
        if (this.f19795J && enumC0246n == EnumC0246n.f3902p) {
            int i7 = c0245m.f3900e;
            if (i7 == 4) {
                AbstractC1767D.t(n0(), null, new C1865n(this, null), 3);
            } else if (i7 == 5) {
                AbstractC1767D.t(n0(), null, new C1867o(this, null), 3);
            }
        }
        if (this.f19799N == null && (nF0 = F0()) != null) {
            B0(nF0);
            this.f19799N = nF0;
        }
        K0.N n7 = this.f19799N;
        if (n7 != null) {
            n7.u(c0245m, enumC0246n, j3);
        }
    }

    public void K0() {
    }

    public void E0(Y0.j jVar) {
    }
}
