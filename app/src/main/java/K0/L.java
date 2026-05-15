package K0;

import Q0.AbstractC0347f;
import R0.S0;
import d5.EnumC0830a;
import e5.AbstractC0863a;
import w5.C1793k;

/* JADX INFO: loaded from: classes.dex */
public final class L implements n1.d, c5.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f3841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1793k f3842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1793k f3843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EnumC0246n f3844r = EnumC0246n.f3902p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c5.j f3845s = c5.j.f10685o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f3846t;

    public L(N n7, C1793k c1793k) {
        this.f3846t = n7;
        this.f3841o = n7;
        this.f3842p = c1793k;
    }

    @Override // n1.d
    public final float E(long j3) {
        N n7 = this.f3841o;
        n7.getClass();
        return n1.c.h(j3, n7);
    }

    @Override // n1.d
    public final int L(float f7) {
        N n7 = this.f3841o;
        n7.getClass();
        return n1.c.f(f7, n7);
    }

    @Override // n1.d
    public final long V(long j3) {
        N n7 = this.f3841o;
        n7.getClass();
        return n1.c.k(j3, n7);
    }

    @Override // n1.d
    public final float Y(long j3) {
        N n7 = this.f3841o;
        n7.getClass();
        return n1.c.j(j3, n7);
    }

    public final Object a(EnumC0246n enumC0246n, AbstractC0863a abstractC0863a) {
        C1793k c1793k = new C1793k(1, I0.c.D(abstractC0863a));
        c1793k.r();
        this.f3844r = enumC0246n;
        this.f3843q = c1793k;
        Object objQ = c1793k.q();
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return objQ;
    }

    @Override // n1.d
    public final float b() {
        return this.f3841o.b();
    }

    public final long c() {
        N n7 = this.f3846t;
        n7.getClass();
        long jK = n1.c.k(AbstractC0347f.x(n7).f5816O.g(), n7);
        long j3 = n7.f3859M;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK >> 32)) - ((int) (j3 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final S0 d() {
        N n7 = this.f3846t;
        n7.getClass();
        return AbstractC0347f.x(n7).f5816O;
    }

    @Override // n1.d
    public final long e0(float f7) {
        return this.f3841o.e0(f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [w5.g0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [w5.g0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [l5.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r7, l5.e r9, e5.AbstractC0865c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof K0.I
            if (r0 == 0) goto L13
            r0 = r10
            K0.I r0 = (K0.I) r0
            int r1 = r0.f3834r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3834r = r1
            goto L18
        L13:
            K0.I r0 = new K0.I
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f3832p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f3834r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            w5.w0 r7 = r0.f3831o
            android.support.v4.media.session.b.K(r10)     // Catch: java.lang.Throwable -> L29
            goto L68
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            android.support.v4.media.session.b.K(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            w5.k r10 = r6.f3843q
            if (r10 == 0) goto L4c
            K0.o r2 = new K0.o
            r2.<init>(r7)
            Y4.j r2 = android.support.v4.media.session.b.l(r2)
            r10.resumeWith(r2)
        L4c:
            K0.N r10 = r6.f3846t
            w5.B r10 = r10.n0()
            K0.J r2 = new K0.J
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            w5.w0 r7 = w5.AbstractC1767D.t(r10, r4, r2, r7)
            r0.f3831o = r7     // Catch: java.lang.Throwable -> L29
            r0.f3834r = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L68
            return r1
        L68:
            K0.b r8 = K0.C0234b.f3861p
            r7.c(r8)
            return r10
        L6e:
            K0.b r9 = K0.C0234b.f3861p
            r7.c(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.L.g(long, l5.e, e5.c):java.lang.Object");
    }

    @Override // c5.d
    public final c5.i getContext() {
        return this.f3845s;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r5, z.S0 r7, e5.AbstractC0863a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof K0.K
            if (r0 == 0) goto L13
            r0 = r8
            K0.K r0 = (K0.K) r0
            int r1 = r0.f3840q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3840q = r1
            goto L18
        L13:
            K0.K r0 = new K0.K
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f3838o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f3840q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            android.support.v4.media.session.b.K(r8)     // Catch: K0.o -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            android.support.v4.media.session.b.K(r8)
            r0.f3840q = r3     // Catch: K0.o -> L3c
            java.lang.Object r5 = r4.g(r5, r7, r0)     // Catch: K0.o -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.L.h(long, z.S0, e5.a):java.lang.Object");
    }

    @Override // n1.d
    public final float i0(int i7) {
        return this.f3841o.i0(i7);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / this.f3841o.b();
    }

    @Override // n1.d
    public final float n() {
        return this.f3841o.n();
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        N n7 = this.f3846t;
        synchronized (n7.f3856J) {
            n7.f3855I.k(this);
        }
        this.f3842p.resumeWith(obj);
    }

    @Override // n1.d
    public final long t(long j3) {
        N n7 = this.f3841o;
        n7.getClass();
        return n1.c.i(j3, n7);
    }

    @Override // n1.d
    public final float v(float f7) {
        return this.f3841o.b() * f7;
    }
}
