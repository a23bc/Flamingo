package I;

import H.C0163e;
import H.C0170l;
import H.S;
import H.U;
import H.V;
import H.W;
import H.X;
import H2.C0196m;
import d.C0746L;
import d5.EnumC0830a;
import e5.AbstractC0865c;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import o5.AbstractC1267a;
import p0.AbstractC1289f;
import x.EnumC1862l0;
import x0.C1892b;
import z.C2053o;
import z.I0;

/* JADX INFO: loaded from: classes.dex */
public abstract class K implements I0 {

    /* JADX INFO: renamed from: A */
    public final U f3284A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC0878b0 f3285B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC0878b0 f3286C;

    /* JADX INFO: renamed from: D */
    public final C0894j0 f3287D;

    /* JADX INFO: renamed from: E */
    public final C0894j0 f3288E;

    /* JADX INFO: renamed from: F */
    public final C0894j0 f3289F;

    /* JADX INFO: renamed from: G */
    public final C0894j0 f3290G;

    /* JADX INFO: renamed from: a */
    public boolean f3291a;

    /* JADX INFO: renamed from: b */
    public z f3292b;

    /* JADX INFO: renamed from: c */
    public final C0894j0 f3293c;

    /* JADX INFO: renamed from: d */
    public final C0196m f3294d;

    /* JADX INFO: renamed from: e */
    public int f3295e;

    /* JADX INFO: renamed from: f */
    public int f3296f;

    /* JADX INFO: renamed from: g */
    public long f3297g;
    public long h;

    /* JADX INFO: renamed from: i */
    public float f3298i;

    /* JADX INFO: renamed from: j */
    public float f3299j;

    /* JADX INFO: renamed from: k */
    public final C2053o f3300k;
    public final boolean l;

    /* JADX INFO: renamed from: m */
    public int f3301m;

    /* JADX INFO: renamed from: n */
    public W f3302n;

    /* JADX INFO: renamed from: o */
    public boolean f3303o;

    /* JADX INFO: renamed from: p */
    public final C0894j0 f3304p;

    /* JADX INFO: renamed from: q */
    public n1.d f3305q;

    /* JADX INFO: renamed from: r */
    public final B.k f3306r;

    /* JADX INFO: renamed from: s */
    public final C0888g0 f3307s;

    /* JADX INFO: renamed from: t */
    public final C0888g0 f3308t;

    /* JADX INFO: renamed from: u */
    public final X f3309u;

    /* JADX INFO: renamed from: v */
    public final C0170l f3310v;

    /* JADX INFO: renamed from: w */
    public final C0163e f3311w;

    /* JADX INFO: renamed from: x */
    public final C0894j0 f3312x;

    /* JADX INFO: renamed from: y */
    public final F.x f3313y;

    /* JADX INFO: renamed from: z */
    public long f3314z;

    public K(int i7, float f7) {
        double d4 = f7;
        if (-0.5d > d4 || d4 > 0.5d) {
            C.b.a("currentPageOffsetFraction " + f7 + " is not within the range -0.5 to 0.5");
        }
        this.f3293c = C0879c.t(new C1892b(0L));
        this.f3294d = new C0196m(i7, f7, this);
        this.f3295e = i7;
        this.f3297g = Long.MAX_VALUE;
        final int i8 = 0;
        this.f3300k = new C2053o(new InterfaceC1182c(this) { // from class: I.D

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ K f3259p;

            {
                this.f3259p = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                z zVar;
                switch (i8) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        K k7 = this.f3259p;
                        k7.getClass();
                        long jN = android.support.v4.media.session.b.n(k7);
                        float f8 = k7.f3298i + fFloatValue;
                        long jI = AbstractC1267a.I(f8);
                        k7.f3298i = f8 - jI;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j3 = jN + jI;
                            long jR = i6.h.r(j3, k7.h, k7.f3297g);
                            boolean z6 = j3 != jR;
                            long j7 = jR - jN;
                            float f9 = j7;
                            k7.f3299j = f9;
                            if (Math.abs(j7) != 0) {
                                k7.f3289F.setValue(Boolean.valueOf(f9 > 0.0f));
                                k7.f3290G.setValue(Boolean.valueOf(f9 < 0.0f));
                            }
                            int i9 = (int) j7;
                            int i10 = -i9;
                            z zVarF = ((z) k7.f3304p.getValue()).f(i10);
                            if (zVarF != null && (zVar = k7.f3292b) != null) {
                                z zVarF2 = zVar.f(i10);
                                if (zVarF2 != null) {
                                    k7.f3292b = zVarF2;
                                } else {
                                    zVarF = null;
                                }
                            }
                            if (zVarF != null) {
                                k7.h(zVarF, k7.f3291a, true);
                                k7.f3285B.setValue(Y4.o.f8736a);
                            } else {
                                C0196m c0196m = k7.f3294d;
                                float fO = ((K) c0196m.f3205c).o() != 0 ? i9 / r6.o() : 0.0f;
                                C0886f0 c0886f0 = (C0886f0) c0196m.f3207e;
                                c0886f0.j(c0886f0.h() + fO);
                                Q0.K k8 = (Q0.K) k7.f3312x.getValue();
                                if (k8 != null) {
                                    k8.l();
                                }
                            }
                            if (z6) {
                                ValueOf = Long.valueOf(j7);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        K k9 = this.f3259p;
                        V v3 = (V) obj;
                        AbstractC1289f abstractC1289fQ = C0746L.q();
                        InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
                        AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
                        try {
                            v3.a(k9.f3295e);
                            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                            return Y4.o.f8736a;
                        } catch (Throwable th) {
                            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                            throw th;
                        }
                }
            }
        });
        this.l = true;
        this.f3301m = -1;
        this.f3304p = new C0894j0(O.f3318b, f0.W.f11764q);
        this.f3305q = O.f3319c;
        this.f3306r = new B.k();
        this.f3307s = new C0888g0(-1);
        this.f3308t = new C0888g0(i7);
        f0.W w7 = f0.W.f11767t;
        final int i9 = 0;
        C0879c.n(w7, new InterfaceC1180a(this) { // from class: I.E

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ K f3261p;

            {
                this.f3261p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                int iH;
                switch (i9) {
                    case 0:
                        K k7 = this.f3261p;
                        return Integer.valueOf(k7.f3300k.b() ? k7.f3308t.h() : k7.k());
                    default:
                        K k8 = this.f3261p;
                        if (k8.f3300k.b()) {
                            C0888g0 c0888g0 = k8.f3307s;
                            iH = c0888g0.h() != -1 ? c0888g0.h() : Math.abs(((C0886f0) k8.f3294d.f3207e).h()) >= Math.abs(Math.min(k8.f3305q.v(O.f3317a), ((float) k8.n()) / 2.0f) / ((float) k8.n())) ? ((Boolean) k8.f3289F.getValue()).booleanValue() ? k8.f3295e + 1 : k8.f3295e : k8.k();
                        } else {
                            iH = k8.k();
                        }
                        return Integer.valueOf(k8.j(iH));
                }
            }
        });
        final int i10 = 1;
        C0879c.n(w7, new InterfaceC1180a(this) { // from class: I.E

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ K f3261p;

            {
                this.f3261p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                int iH;
                switch (i10) {
                    case 0:
                        K k7 = this.f3261p;
                        return Integer.valueOf(k7.f3300k.b() ? k7.f3308t.h() : k7.k());
                    default:
                        K k8 = this.f3261p;
                        if (k8.f3300k.b()) {
                            C0888g0 c0888g0 = k8.f3307s;
                            iH = c0888g0.h() != -1 ? c0888g0.h() : Math.abs(((C0886f0) k8.f3294d.f3207e).h()) >= Math.abs(Math.min(k8.f3305q.v(O.f3317a), ((float) k8.n()) / 2.0f) / ((float) k8.n())) ? ((Boolean) k8.f3289F.getValue()).booleanValue() ? k8.f3295e + 1 : k8.f3295e : k8.k();
                        } else {
                            iH = k8.k();
                        }
                        return Integer.valueOf(k8.j(iH));
                }
            }
        });
        this.f3309u = new X(new InterfaceC1182c(this) { // from class: I.D

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ K f3259p;

            {
                this.f3259p = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                z zVar;
                switch (i10) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        K k7 = this.f3259p;
                        k7.getClass();
                        long jN = android.support.v4.media.session.b.n(k7);
                        float f8 = k7.f3298i + fFloatValue;
                        long jI = AbstractC1267a.I(f8);
                        k7.f3298i = f8 - jI;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j3 = jN + jI;
                            long jR = i6.h.r(j3, k7.h, k7.f3297g);
                            boolean z6 = j3 != jR;
                            long j7 = jR - jN;
                            float f9 = j7;
                            k7.f3299j = f9;
                            if (Math.abs(j7) != 0) {
                                k7.f3289F.setValue(Boolean.valueOf(f9 > 0.0f));
                                k7.f3290G.setValue(Boolean.valueOf(f9 < 0.0f));
                            }
                            int i92 = (int) j7;
                            int i102 = -i92;
                            z zVarF = ((z) k7.f3304p.getValue()).f(i102);
                            if (zVarF != null && (zVar = k7.f3292b) != null) {
                                z zVarF2 = zVar.f(i102);
                                if (zVarF2 != null) {
                                    k7.f3292b = zVarF2;
                                } else {
                                    zVarF = null;
                                }
                            }
                            if (zVarF != null) {
                                k7.h(zVarF, k7.f3291a, true);
                                k7.f3285B.setValue(Y4.o.f8736a);
                            } else {
                                C0196m c0196m = k7.f3294d;
                                float fO = ((K) c0196m.f3205c).o() != 0 ? i92 / r6.o() : 0.0f;
                                C0886f0 c0886f0 = (C0886f0) c0196m.f3207e;
                                c0886f0.j(c0886f0.h() + fO);
                                Q0.K k8 = (Q0.K) k7.f3312x.getValue();
                                if (k8 != null) {
                                    k8.l();
                                }
                            }
                            if (z6) {
                                ValueOf = Long.valueOf(j7);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        K k9 = this.f3259p;
                        V v3 = (V) obj;
                        AbstractC1289f abstractC1289fQ = C0746L.q();
                        InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
                        AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
                        try {
                            v3.a(k9.f3295e);
                            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                            return Y4.o.f8736a;
                        } catch (Throwable th) {
                            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                            throw th;
                        }
                }
            }
        });
        this.f3310v = new C0170l(0);
        this.f3311w = new C0163e();
        this.f3312x = C0879c.t(null);
        this.f3313y = new F.x(this, 2);
        this.f3314z = n1.b.b(0, 0, 15);
        this.f3284A = new U();
        this.f3285B = H.E.j();
        this.f3286C = H.E.j();
        Boolean bool = Boolean.FALSE;
        this.f3287D = C0879c.t(bool);
        this.f3288E = C0879c.t(bool);
        this.f3289F = C0879c.t(bool);
        this.f3290G = C0879c.t(bool);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public static int i(boolean z6, z zVar) {
        ?? r02 = zVar.f3408a;
        int i7 = zVar.h;
        if (!z6) {
            return (((C0218j) Z4.n.q0(r02)).f3361a - i7) - 1;
        }
        int i8 = i7 + 1;
        if (i8 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((C0218j) Z4.n.x0(r02)).f3361a + i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0078, code lost:
    
        if (r6.f3300k.c(r7, r8, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object s(I.K r6, x.EnumC1862l0 r7, l5.e r8, e5.AbstractC0865c r9) {
        /*
            boolean r0 = r9 instanceof I.I
            if (r0 == 0) goto L13
            r0 = r9
            I.I r0 = (I.I) r0
            int r1 = r0.f3280t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3280t = r1
            goto L18
        L13:
            I.I r0 = new I.I
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f3278r
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f3280t
            Y4.o r3 = Y4.o.f8736a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            I.K r6 = r0.f3275o
            android.support.v4.media.session.b.K(r9)
            goto L7b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            l5.e r8 = r0.f3277q
            x.l0 r7 = r0.f3276p
            I.K r6 = r0.f3275o
            android.support.v4.media.session.b.K(r9)
            goto L58
        L40:
            android.support.v4.media.session.b.K(r9)
            r0.f3275o = r6
            r0.f3276p = r7
            r0.f3277q = r8
            r0.f3280t = r5
            H.e r9 = r6.f3311w
            java.lang.Object r9 = r9.k(r0)
            if (r9 != r1) goto L54
            goto L55
        L54:
            r9 = r3
        L55:
            if (r9 != r1) goto L58
            goto L7a
        L58:
            z.o r9 = r6.f3300k
            boolean r9 = r9.b()
            if (r9 != 0) goto L69
            int r9 = r6.k()
            f0.g0 r2 = r6.f3308t
            r2.j(r9)
        L69:
            r0.f3275o = r6
            r9 = 0
            r0.f3276p = r9
            r0.f3277q = r9
            r0.f3280t = r4
            z.o r9 = r6.f3300k
            java.lang.Object r7 = r9.c(r7, r8, r0)
            if (r7 != r1) goto L7b
        L7a:
            return r1
        L7b:
            f0.g0 r6 = r6.f3307s
            r7 = -1
            r6.j(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I.K.s(I.K, x.l0, l5.e, e5.c):java.lang.Object");
    }

    public static Object t(C0211c c0211c, int i7, AbstractC0871i abstractC0871i) {
        c0211c.getClass();
        Object objC = c0211c.c(EnumC1862l0.f19772o, new J(c0211c, i7, null), abstractC0871i);
        return objC == EnumC0830a.f11264o ? objC : Y4.o.f8736a;
    }

    @Override // z.I0
    public final boolean a() {
        return ((Boolean) this.f3288E.getValue()).booleanValue();
    }

    @Override // z.I0
    public final boolean b() {
        return this.f3300k.b();
    }

    @Override // z.I0
    public final Object c(EnumC1862l0 enumC1862l0, l5.e eVar, AbstractC0865c abstractC0865c) {
        return s(this, enumC1862l0, eVar, abstractC0865c);
    }

    @Override // z.I0
    public final boolean d() {
        return ((Boolean) this.f3287D.getValue()).booleanValue();
    }

    @Override // z.I0
    public final float e(float f7) {
        return this.f3300k.e(f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [w.l] */
    /* JADX WARN: Type inference failed for: r12v0, types: [I.K] */
    /* JADX WARN: Type inference failed for: r14v0, types: [w.S, w.l] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6, types: [w.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(int r13, w.S r14, e5.AbstractC0865c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof I.F
            if (r0 == 0) goto L13
            r0 = r15
            I.F r0 = (I.F) r0
            int r1 = r0.f3266s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3266s = r1
            goto L18
        L13:
            I.F r0 = new I.F
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f3264q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f3266s
            Y4.o r3 = Y4.o.f8736a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            android.support.v4.media.session.b.K(r15)
            return r3
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r0.f3262o
            w.l r14 = r0.f3263p
            android.support.v4.media.session.b.K(r15)
        L3c:
            r10 = r14
            goto L72
        L3e:
            android.support.v4.media.session.b.K(r15)
            int r15 = r12.k()
            if (r13 != r15) goto L57
            H2.m r15 = r12.f3294d
            java.lang.Object r15 = r15.f3207e
            f0.f0 r15 = (f0.C0886f0) r15
            float r15 = r15.h()
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 != 0) goto L57
        L55:
            r7 = r12
            goto Lb6
        L57:
            int r15 = r12.m()
            if (r15 != 0) goto L5e
            goto L55
        L5e:
            r0.f3263p = r14
            r0.f3262o = r13
            r0.f3266s = r6
            H.e r15 = r12.f3311w
            java.lang.Object r15 = r15.k(r0)
            if (r15 != r1) goto L6d
            goto L6e
        L6d:
            r15 = r3
        L6e:
            if (r15 != r1) goto L3c
            r7 = r12
            goto Lb5
        L72:
            double r14 = (double) r4
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 > 0) goto L80
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto L80
            goto L96
        L80:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r4)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            C.b.a(r14)
        L96:
            int r8 = r12.j(r13)
            int r13 = r12.o()
            float r13 = (float) r13
            float r9 = r4 * r13
            I.G r6 = new I.G
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 0
            r0.f3263p = r13
            r0.f3266s = r5
            x.l0 r13 = x.EnumC1862l0.f19772o
            java.lang.Object r13 = r12.c(r13, r6, r0)
            if (r13 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I.K.f(int, w.S, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x011c A[Catch: all -> 0x0128, TryCatch #0 {all -> 0x0128, blocks: (B:141:0x00bb, B:145:0x00ca, B:148:0x00d3, B:151:0x00e0, B:153:0x00ec, B:161:0x0122, B:159:0x011c, B:156:0x0104), top: B:174:0x00bb }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(I.z r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I.K.h(I.z, boolean, boolean):void");
    }

    public final int j(int i7) {
        if (m() > 0) {
            return i6.h.q(i7, 0, m() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((C0888g0) this.f3294d.f3206d).h();
    }

    public final z l() {
        return (z) this.f3304p.getValue();
    }

    public abstract int m();

    public final int n() {
        return ((z) this.f3304p.getValue()).f3409b;
    }

    public final int o() {
        return ((z) this.f3304p.getValue()).f3410c + n();
    }

    public final long p() {
        return ((C1892b) this.f3293c.getValue()).f19867a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void r(float f7, z zVar) {
        W w7;
        W w8;
        W w9;
        if (this.l) {
            if (zVar.f3408a.isEmpty()) {
                return;
            }
            boolean z6 = f7 > 0.0f;
            int i7 = i(z6, zVar);
            if (i7 < 0 || i7 >= m()) {
                return;
            }
            if (i7 != this.f3301m) {
                if (this.f3303o != z6 && (w9 = this.f3302n) != null) {
                    w9.cancel();
                }
                this.f3303o = z6;
                this.f3301m = i7;
                this.f3302n = this.f3309u.a(i7, this.f3314z, true, null);
            }
            if (z6) {
                if ((((C0218j) Z4.n.x0(r0)).f3369j + (zVar.f3409b + zVar.f3410c)) - zVar.f3414g >= f7 || (w8 = this.f3302n) == null) {
                    return;
                }
                w8.a();
                return;
            }
            if (zVar.f3413f - ((C0218j) Z4.n.q0(r0)).f3369j >= (-f7) || (w7 = this.f3302n) == null) {
                return;
            }
            w7.a();
        }
    }

    public final void u(float f7, int i7, boolean z6) {
        C0196m c0196m = this.f3294d;
        ((C0888g0) c0196m.f3206d).j(i7);
        ((S) c0196m.f3209g).b(i7);
        ((C0886f0) c0196m.f3207e).j(f7);
        c0196m.f3208f = null;
        if (!z6) {
            this.f3286C.setValue(Y4.o.f8736a);
        } else {
            Q0.K k7 = (Q0.K) this.f3312x.getValue();
            if (k7 != null) {
                k7.l();
            }
        }
    }
}
