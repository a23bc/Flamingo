package F;

import D.C0056b;
import D.J;
import H.C0163e;
import H.C0170l;
import H.E;
import H.U;
import H.X;
import Q0.K;
import d.C0746L;
import f0.C0879c;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import f0.W;
import j5.AbstractC1110d;
import l5.InterfaceC1182c;
import o0.AbstractC1256m;
import p0.AbstractC1289f;
import w.C1680m;
import w.p0;
import w5.w0;
import z.C2053o;
import z.I0;

/* JADX INFO: loaded from: classes.dex */
public final class A implements I0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final V1.a f2023x = AbstractC1256m.b(new C0056b(1, 0), new g(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0128a f2024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f2026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f2028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0894j0 f2029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B.k f2030g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2053o f2031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public K f2033k;
    public final x l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0163e f2034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f2035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0170l f2036o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final X f2037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A.b f2038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U f2039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0878b0 f2040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0894j0 f2041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0894j0 f2042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC0878b0 f2043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final V.o f2044w;

    public A(int i7, int i8) {
        C0128a c0128a = new C0128a();
        c0128a.f2048a = -1;
        c0128a.f2050c = -1;
        this.f2024a = c0128a;
        this.f2028e = new v(i7, i8, 0);
        this.f2029f = new C0894j0(D.f2047a, W.f11764q);
        this.f2030g = new B.k();
        this.f2031i = new C2053o(new J(3, this));
        this.f2032j = true;
        this.l = new x(this, 0);
        this.f2034m = new C0163e();
        this.f2035n = new androidx.compose.foundation.lazy.layout.b();
        this.f2036o = new C0170l(0);
        this.f2037p = new X(new w(i7, 0, this));
        this.f2038q = new A.b(11, this);
        this.f2039r = new U();
        this.f2040s = E.j();
        Boolean bool = Boolean.FALSE;
        this.f2041t = C0879c.t(bool);
        this.f2042u = C0879c.t(bool);
        this.f2043v = E.j();
        this.f2044w = new V.o(16, (byte) 0);
    }

    @Override // z.I0
    public final boolean a() {
        return ((Boolean) this.f2042u.getValue()).booleanValue();
    }

    @Override // z.I0
    public final boolean b() {
        return this.f2031i.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r5.f2031i.c(r6, r7, r0) == r1) goto L21;
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
            boolean r0 = r8 instanceof F.y
            if (r0 == 0) goto L13
            r0 = r8
            F.y r0 = (F.y) r0
            int r1 = r0.f2165s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2165s = r1
            goto L18
        L13:
            F.y r0 = new F.y
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f2163q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f2165s
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
            l5.e r7 = r0.f2162p
            x.l0 r6 = r0.f2161o
            android.support.v4.media.session.b.K(r8)
            goto L4c
        L3a:
            android.support.v4.media.session.b.K(r8)
            r0.f2161o = r6
            r0.f2162p = r7
            r0.f2165s = r4
            H.e r8 = r5.f2034m
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r1) goto L4c
            goto L5b
        L4c:
            r8 = 0
            r0.f2161o = r8
            r0.f2162p = r8
            r0.f2165s = r3
            z.o r8 = r5.f2031i
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            Y4.o r6 = Y4.o.f8736a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F.A.c(x.l0, l5.e, e5.c):java.lang.Object");
    }

    @Override // z.I0
    public final boolean d() {
        return ((Boolean) this.f2041t.getValue()).booleanValue();
    }

    @Override // z.I0
    public final float e(float f7) {
        return this.f2031i.e(f7);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(r rVar, boolean z6, boolean z7) {
        String str;
        long j3;
        ?? r22 = rVar.f2124k;
        this.f2037p.f2833e = r22.size();
        V.o oVar = this.f2044w;
        v vVar = this.f2028e;
        int i7 = rVar.f2116b;
        s sVar = rVar.f2115a;
        if (!z6 && this.f2025b) {
            this.f2026c = rVar;
            AbstractC1289f abstractC1289fQ = C0746L.q();
            InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
            AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
            try {
                if (((Number) ((C1680m) oVar.f7343q).f18710p.getValue()).floatValue() != 0.0f && sVar != null && sVar.f2130a == vVar.f2151b.h() && i7 == vVar.f2152c.h()) {
                    w0 w0Var = (w0) oVar.f7342p;
                    if (w0Var != null) {
                        w0Var.c(null);
                    }
                    oVar.f7343q = new C1680m(p0.f18727a, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
            }
        }
        if (z6) {
            this.f2025b = true;
        }
        this.f2042u.setValue(Boolean.valueOf(((sVar != null ? sVar.f2130a : 0) == 0 && i7 == 0) ? false : true));
        this.f2041t.setValue(Boolean.valueOf(rVar.f2117c));
        this.h -= rVar.f2118d;
        this.f2029f.setValue(rVar);
        if (z7) {
            vVar.getClass();
            if (!(((float) i7) >= 0.0f)) {
                C.b.c("scrollOffset should be non-negative");
            }
            vVar.f2152c.j(i7);
        } else {
            s sVar2 = (s) Z4.n.r0(r22);
            s sVar3 = (s) Z4.n.y0(r22);
            if (sVar2 != null) {
                str = "scrollOffset should be non-negative";
                j3 = sVar2.f2130a;
            } else {
                str = "scrollOffset should be non-negative";
                j3 = -1;
            }
            AbstractC1110d.K("firstVisibleItem:index", j3);
            AbstractC1110d.K("lastVisibleItem:index", sVar3 != null ? sVar3.f2130a : -1L);
            vVar.getClass();
            vVar.f2154e = sVar != null ? sVar.f2137i : null;
            boolean z8 = vVar.f2153d;
            int i8 = rVar.f2126n;
            if (z8 || i8 > 0) {
                vVar.f2153d = true;
                if (!(((float) i7) >= 0.0f)) {
                    C.b.c(str);
                }
                vVar.a(sVar != null ? sVar.f2130a : 0, i7);
            }
            if (this.f2032j) {
                C0128a c0128a = this.f2024a;
                int i9 = c0128a.f2048a;
                boolean z9 = c0128a.f2049b;
                if (i9 != -1 && !r22.isEmpty() && i9 != C0128a.b(rVar, z9)) {
                    c0128a.f2048a = -1;
                    H.W w7 = (H.W) c0128a.f2052e;
                    if (w7 != null) {
                        w7.cancel();
                    }
                    c0128a.f2052e = null;
                }
                int i10 = c0128a.f2050c;
                if (i10 != -1 && c0128a.f2051d != 0.0f && i10 != i8 && !r22.isEmpty()) {
                    int iB = C0128a.b(rVar, c0128a.f2051d < 0.0f);
                    if (iB >= 0 && iB < i8) {
                        c0128a.f2048a = iB;
                        c0128a.f2052e = A0.e.L(this.f2038q, iB);
                    }
                }
                c0128a.f2050c = i8;
            }
        }
        if (z6) {
            oVar.L(rVar.f2120f, rVar.f2122i, rVar.h);
        }
    }

    public final r g() {
        return (r) this.f2029f.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void h(float f7, r rVar) {
        H.W w7;
        H.W w8;
        if (this.f2032j) {
            C0128a c0128a = this.f2024a;
            if (!rVar.f2124k.isEmpty()) {
                boolean z6 = f7 < 0.0f;
                int iB = C0128a.b(rVar, z6);
                if (iB >= 0 && iB < rVar.f2126n) {
                    if (iB != c0128a.f2048a) {
                        if (c0128a.f2049b != z6) {
                            c0128a.f2048a = -1;
                            H.W w9 = (H.W) c0128a.f2052e;
                            if (w9 != null) {
                                w9.cancel();
                            }
                            c0128a.f2052e = null;
                        }
                        c0128a.f2049b = z6;
                        c0128a.f2048a = iB;
                        c0128a.f2052e = A0.e.L(this.f2038q, iB);
                    }
                    ?? r22 = rVar.f2124k;
                    if (z6) {
                        s sVar = (s) Z4.n.x0(r22);
                        if (((sVar.f2140m + sVar.f2141n) + rVar.f2129q) - rVar.f2125m < (-f7) && (w8 = (H.W) c0128a.f2052e) != null) {
                            w8.a();
                        }
                    } else if (rVar.l - ((s) Z4.n.q0(r22)).f2140m < f7 && (w7 = (H.W) c0128a.f2052e) != null) {
                        w7.a();
                    }
                }
            }
            c0128a.f2051d = f7;
        }
    }
}
