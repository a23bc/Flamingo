package G;

import D.C0056b;
import D.J;
import F.C0128a;
import H.C0163e;
import H.C0170l;
import H.E;
import H.U;
import H.W;
import H.X;
import Q0.K;
import f0.C0879c;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import o0.AbstractC1256m;
import z.C2053o;
import z.EnumC2048l0;
import z.I0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements I0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final V1.a f2610w = AbstractC1256m.b(new C0056b(3, 0), new F.g(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0128a f2611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f2613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.v f2614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0894j0 f2615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B.k f2616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2617g;
    public final C2053o h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K f2619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final F.x f2620k;
    public final C0163e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f2621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0170l f2622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X f2623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A.b f2624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U f2625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0878b0 f2626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0878b0 f2627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0894j0 f2628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0894j0 f2629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final V.o f2630v;

    public x(int i7, int i8) {
        C0128a c0128a = new C0128a();
        c0128a.f2048a = -1;
        c0128a.f2052e = new h0.e(new W[16]);
        c0128a.f2050c = -1;
        this.f2611a = c0128a;
        this.f2614d = new F.v(i7, i8, 1);
        this.f2615e = new C0894j0(z.f2631a, f0.W.f11764q);
        this.f2616f = new B.k();
        this.h = new C2053o(new J(4, this));
        this.f2618i = true;
        this.f2620k = new F.x(this, 1);
        this.l = new C0163e();
        this.f2621m = new androidx.compose.foundation.lazy.layout.b();
        this.f2622n = new C0170l(0);
        this.f2623o = new X(new F.w(i7, 1, this));
        this.f2624p = new A.b(15, this);
        this.f2625q = new U();
        this.f2626r = E.j();
        this.f2627s = E.j();
        Boolean bool = Boolean.FALSE;
        this.f2628t = C0879c.t(bool);
        this.f2629u = C0879c.t(bool);
        this.f2630v = new V.o(16, (byte) 0);
    }

    @Override // z.I0
    public final boolean a() {
        return ((Boolean) this.f2629u.getValue()).booleanValue();
    }

    @Override // z.I0
    public final boolean b() {
        return this.h.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r5.h.c(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z.I0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(x.EnumC1862l0 r6, l5.e r7, e5.AbstractC0865c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof G.v
            if (r0 == 0) goto L13
            r0 = r8
            G.v r0 = (G.v) r0
            int r1 = r0.f2607s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2607s = r1
            goto L18
        L13:
            G.v r0 = new G.v
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f2605q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f2607s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            android.support.v4.media.session.b.K(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            l5.e r7 = r0.f2604p
            x.l0 r6 = r0.f2603o
            android.support.v4.media.session.b.K(r8)
            goto L4c
        L3a:
            android.support.v4.media.session.b.K(r8)
            r0.f2603o = r6
            r0.f2604p = r7
            r0.f2607s = r4
            H.e r8 = r5.l
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r1) goto L4c
            goto L5b
        L4c:
            r8 = 0
            r0.f2603o = r8
            r0.f2604p = r8
            r0.f2607s = r3
            z.o r8 = r5.h
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            Y4.o r6 = Y4.o.f8736a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G.x.c(x.l0, l5.e, e5.c):java.lang.Object");
    }

    @Override // z.I0
    public final boolean d() {
        return ((Boolean) this.f2628t.getValue()).booleanValue();
    }

    @Override // z.I0
    public final float e(float f7) {
        return this.h.e(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(G.n r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.x.f(G.n, boolean, boolean):void");
    }

    public final n g() {
        return (n) this.f2615e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public final void h(float f7, n nVar) {
        if (this.f2618i) {
            C0128a c0128a = this.f2611a;
            c0128a.getClass();
            if (!nVar.l.isEmpty()) {
                int i7 = 0;
                boolean z6 = f7 < 0.0f;
                int iC = C0128a.c(nVar, z6);
                int iA = C0128a.a(nVar, z6);
                if (iA >= 0 && iA < nVar.f2553o) {
                    int i8 = c0128a.f2048a;
                    h0.e eVar = (h0.e) c0128a.f2052e;
                    if (iC != i8 && iC >= 0) {
                        if (c0128a.f2049b != z6) {
                            Object[] objArr = eVar.f12546o;
                            int i9 = eVar.f12548q;
                            for (int i10 = 0; i10 < i9; i10++) {
                                ((W) objArr[i10]).cancel();
                            }
                        }
                        c0128a.f2049b = z6;
                        c0128a.f2048a = iC;
                        eVar.h();
                        eVar.d(eVar.f12548q, this.f2624p.F(iC));
                    }
                    EnumC2048l0 enumC2048l0 = nVar.f2554p;
                    ?? r42 = nVar.l;
                    if (z6) {
                        o oVar = (o) Z4.n.x0(r42);
                        if (((I0.c.I(oVar, enumC2048l0) + ((int) (enumC2048l0 == EnumC2048l0.f20894o ? oVar.f2573s & 4294967295L : oVar.f2573s >> 32))) + nVar.f2556r) - nVar.f2552n < (-f7)) {
                            Object[] objArr2 = eVar.f12546o;
                            int i11 = eVar.f12548q;
                            while (i7 < i11) {
                                ((W) objArr2[i7]).a();
                                i7++;
                            }
                        }
                    } else if (nVar.f2551m - I0.c.I((o) Z4.n.q0(r42), enumC2048l0) < f7) {
                        Object[] objArr3 = eVar.f12546o;
                        int i12 = eVar.f12548q;
                        while (i7 < i12) {
                            ((W) objArr3[i7]).a();
                            i7++;
                        }
                    }
                }
            }
            c0128a.f2051d = f7;
        }
    }
}
