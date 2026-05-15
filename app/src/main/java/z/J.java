package z;

import I.C0216h;
import K0.C0245m;
import K0.EnumC0246n;
import Q0.AbstractC0358n;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class J extends AbstractC0358n implements Q0.x0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public EnumC2048l0 f20658E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC1182c f20659F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f20660G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public B.k f20661H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public y5.c f20662I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public B.b f20663J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f20664K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f20665L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public K0.N f20666M;

    public J(InterfaceC1182c interfaceC1182c, boolean z6, B.k kVar, EnumC2048l0 enumC2048l0) {
        this.f20658E = enumC2048l0;
        this.f20659F = interfaceC1182c;
        this.f20660G = z6;
        this.f20661H = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E0(z.J r5, e5.AbstractC0865c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof z.E
            if (r0 == 0) goto L16
            r0 = r6
            z.E r0 = (z.E) r0
            int r1 = r0.f20617q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f20617q = r1
            goto L1b
        L16:
            z.E r0 = new z.E
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f20615o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20617q
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            android.support.v4.media.session.b.K(r6)
            goto L4b
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            android.support.v4.media.session.b.K(r6)
            B.b r6 = r5.f20663J
            if (r6 == 0) goto L4e
            B.k r2 = r5.f20661H
            if (r2 == 0) goto L4b
            B.a r4 = new B.a
            r4.<init>(r6)
            r0.f20617q = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r6 = 0
            r5.f20663J = r6
        L4e:
            r0 = 0
            r5.K0(r0)
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.J.E0(z.J, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F0(z.J r6, z.r r7, e5.AbstractC0865c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof z.F
            if (r0 == 0) goto L16
            r0 = r8
            z.F r0 = (z.F) r0
            int r1 = r0.f20625s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f20625s = r1
            goto L1b
        L16:
            z.F r0 = new z.F
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f20623q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20625s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            B.b r7 = r0.f20622p
            z.r r0 = r0.f20621o
            android.support.v4.media.session.b.K(r8)
            goto L72
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            z.r r7 = r0.f20621o
            android.support.v4.media.session.b.K(r8)
            goto L5a
        L3f:
            android.support.v4.media.session.b.K(r8)
            B.b r8 = r6.f20663J
            if (r8 == 0) goto L5a
            B.k r2 = r6.f20661H
            if (r2 == 0) goto L5a
            B.a r5 = new B.a
            r5.<init>(r8)
            r0.f20621o = r7
            r0.f20625s = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L5a
            goto L6f
        L5a:
            B.b r8 = new B.b
            r8.<init>()
            B.k r2 = r6.f20661H
            if (r2 == 0) goto L74
            r0.f20621o = r7
            r0.f20622p = r8
            r0.f20625s = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L70
        L6f:
            return r1
        L70:
            r0 = r7
            r7 = r8
        L72:
            r8 = r7
            r7 = r0
        L74:
            r6.f20663J = r8
            long r7 = r7.f20946a
            r6.J0(r7)
            Y4.o r6 = Y4.o.f8736a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.J.F0(z.J, z.r, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G0(z.J r5, z.C2060s r6, e5.AbstractC0865c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof z.G
            if (r0 == 0) goto L16
            r0 = r7
            z.G r0 = (z.G) r0
            int r1 = r0.f20633r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f20633r = r1
            goto L1b
        L16:
            z.G r0 = new z.G
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f20631p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20633r
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            z.s r6 = r0.f20630o
            android.support.v4.media.session.b.K(r7)
            goto L4f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            android.support.v4.media.session.b.K(r7)
            B.b r7 = r5.f20663J
            if (r7 == 0) goto L52
            B.k r2 = r5.f20661H
            if (r2 == 0) goto L4f
            B.c r4 = new B.c
            r4.<init>(r7)
            r0.f20630o = r6
            r0.f20633r = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = 0
            r5.f20663J = r7
        L52:
            long r6 = r6.f20950a
            r5.K0(r6)
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.J.G0(z.J, z.s, e5.c):java.lang.Object");
    }

    public final void H0() {
        B.b bVar = this.f20663J;
        if (bVar != null) {
            B.k kVar = this.f20661H;
            if (kVar != null) {
                kVar.b(new B.a(bVar));
            }
            this.f20663J = null;
        }
    }

    public abstract Object I0(H h, I i7);

    public abstract void J0(long j3);

    public abstract void K0(long j3);

    public abstract boolean L0();

    public final void M0(InterfaceC1182c interfaceC1182c, boolean z6, B.k kVar, EnumC2048l0 enumC2048l0, boolean z7) {
        K0.N n7;
        this.f20659F = interfaceC1182c;
        boolean z8 = true;
        if (this.f20660G != z6) {
            this.f20660G = z6;
            if (!z6) {
                H0();
                K0.N n8 = this.f20666M;
                if (n8 != null) {
                    C0(n8);
                }
                this.f20666M = null;
            }
            z7 = true;
        }
        if (!AbstractC1209k.a(this.f20661H, kVar)) {
            H0();
            this.f20661H = kVar;
        }
        if (this.f20658E != enumC2048l0) {
            this.f20658E = enumC2048l0;
        } else {
            z8 = z7;
        }
        if (!z8 || (n7 = this.f20666M) == null) {
            return;
        }
        n7.D0();
    }

    @Override // Q0.x0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // Q0.x0
    public final void X() {
        Z();
    }

    @Override // Q0.x0
    public final void Z() {
        K0.N n7 = this.f20666M;
        if (n7 != null) {
            n7.Z();
        }
    }

    @Override // Q0.x0
    public final /* synthetic */ void g0() {
    }

    @Override // Q0.x0
    public final long q() {
        return Q0.D0.f5781a;
    }

    @Override // r0.AbstractC1397o
    public void s0() {
        Z();
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        this.f20664K = false;
        H0();
        this.f20665L = 0L;
    }

    public void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        if (this.f20660G && this.f20666M == null) {
            K0.N nA = K0.H.a(new C0216h(6, this));
            B0(nA);
            this.f20666M = nA;
        }
        K0.N n7 = this.f20666M;
        if (n7 != null) {
            n7.u(c0245m, enumC0246n, j3);
        }
    }
}
