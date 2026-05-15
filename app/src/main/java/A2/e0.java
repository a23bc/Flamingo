package A2;

import android.util.Pair;
import java.util.ArrayList;
import t2.C1473b;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B2.i f257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w2.q f258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f261g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f264k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f266n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.e0 f255a = new t2.e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2.g0 f256b = new t2.g0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f267o = new ArrayList();

    public e0(B2.i iVar, w2.q qVar, I i7) {
        this.f257c = iVar;
        this.f258d = qVar;
        this.f259e = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static H2.A m(t2.h0 r14, java.lang.Object r15, long r16, long r18, t2.g0 r20, t2.e0 r21) {
        /*
            r0 = r16
            r2 = r20
            r4 = r21
            r14.g(r15, r4)
            int r5 = r4.f16428c
            r14.n(r5, r2)
            int r5 = r14.b(r15)
            r7 = r15
        L13:
            t2.b r3 = r4.f16432g
            int r3 = r3.f16403a
            r6 = -1
            if (r3 == 0) goto L6d
            r8 = 1
            r9 = 0
            if (r3 != r8) goto L24
            boolean r10 = r4.g(r9)
            if (r10 != 0) goto L6d
        L24:
            t2.b r10 = r4.f16432g
            int r10 = r10.f16406d
            boolean r10 = r4.h(r10)
            if (r10 == 0) goto L6d
            r10 = 0
            int r12 = r4.c(r10)
            if (r12 == r6) goto L37
            goto L6d
        L37:
            long r12 = r4.f16429d
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 != 0) goto L3e
            goto L5e
        L3e:
            int r12 = r3 + (-1)
            boolean r12 = r4.g(r12)
            if (r12 == 0) goto L48
            r12 = 2
            goto L49
        L48:
            r12 = r8
        L49:
            int r3 = r3 - r12
        L4a:
            if (r9 > r3) goto L58
            t2.b r12 = r4.f16432g
            t2.a r12 = r12.a(r9)
            long r12 = r12.h
            long r10 = r10 + r12
            int r9 = r9 + 1
            goto L4a
        L58:
            long r12 = r4.f16429d
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 > 0) goto L6d
        L5e:
            int r3 = r2.f16465n
            if (r5 > r3) goto L6d
            r14.f(r5, r4, r8)
            java.lang.Object r7 = r4.f16427b
            r7.getClass()
            int r5 = r5 + 1
            goto L13
        L6d:
            r14.g(r7, r4)
            int r8 = r4.c(r0)
            if (r8 != r6) goto L82
            int r14 = r4.b(r0)
            H2.A r0 = new H2.A
            r10 = r18
            r0.<init>(r14, r10, r7)
            return r0
        L82:
            r10 = r18
            int r9 = r4.f(r8)
            H2.A r6 = new H2.A
            r12 = -1
            r6.<init>(r7, r8, r9, r10, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.e0.m(t2.h0, java.lang.Object, long, long, t2.g0, t2.e0):H2.A");
    }

    public final b0 a() {
        b0 b0Var = this.f262i;
        if (b0Var == null) {
            return null;
        }
        if (b0Var == this.f263j) {
            this.f263j = b0Var.l;
        }
        b0Var.g();
        int i7 = this.l - 1;
        this.l = i7;
        if (i7 == 0) {
            this.f264k = null;
            b0 b0Var2 = this.f262i;
            this.f265m = b0Var2.f226b;
            this.f266n = b0Var2.f230f.f238a.f2976d;
        }
        this.f262i = this.f262i.l;
        k();
        return this.f262i;
    }

    public final void b() {
        if (this.l == 0) {
            return;
        }
        b0 b0Var = this.f262i;
        AbstractC1697a.j(b0Var);
        this.f265m = b0Var.f226b;
        this.f266n = b0Var.f230f.f238a.f2976d;
        while (b0Var != null) {
            b0Var.g();
            b0Var = b0Var.l;
        }
        this.f262i = null;
        this.f264k = null;
        this.f263j = null;
        this.l = 0;
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A2.c0 c(t2.h0 r21, A2.b0 r22, long r23) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.e0.c(t2.h0, A2.b0, long):A2.c0");
    }

    public final c0 d(t2.h0 h0Var, b0 b0Var, long j3) {
        t2.h0 h0Var2;
        c0 c0Var = b0Var.f230f;
        long j7 = (b0Var.f237o + c0Var.f242e) - j3;
        if (c0Var.f244g) {
            return c(h0Var, b0Var, j7);
        }
        H2.A a4 = c0Var.f238a;
        Object obj = a4.f2973a;
        t2.e0 e0Var = this.f255a;
        h0Var.g(obj, e0Var);
        boolean zB = a4.b();
        Object obj2 = a4.f2973a;
        if (!zB) {
            int i7 = a4.f2977e;
            if (i7 != -1 && e0Var.g(i7)) {
                return c(h0Var, b0Var, j7);
            }
            int iF = e0Var.f(i7);
            boolean z6 = e0Var.h(i7) && e0Var.e(i7, iF) == 3;
            if (iF != e0Var.f16432g.a(i7).f16385b && !z6) {
                return f(h0Var, a4.f2973a, a4.f2977e, iF, c0Var.f242e, a4.f2976d);
            }
            h0Var.g(obj2, e0Var);
            long jD = e0Var.d(i7);
            return g(h0Var, a4.f2973a, jD == Long.MIN_VALUE ? e0Var.f16429d : e0Var.f16432g.a(i7).h + jD, c0Var.f242e, a4.f2976d);
        }
        C1473b c1473b = e0Var.f16432g;
        int i8 = a4.f2974b;
        int i9 = c1473b.a(i8).f16385b;
        if (i9 == -1) {
            return null;
        }
        int iA = e0Var.f16432g.a(i8).a(a4.f2975c);
        if (iA < i9) {
            return f(h0Var, a4.f2973a, i8, iA, c0Var.f240c, a4.f2976d);
        }
        long jLongValue = c0Var.f240c;
        if (jLongValue == -9223372036854775807L) {
            h0Var2 = h0Var;
            Pair pairJ = h0Var2.j(this.f256b, e0Var, e0Var.f16428c, -9223372036854775807L, Math.max(0L, j7));
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            h0Var2 = h0Var;
        }
        h0Var2.g(obj2, e0Var);
        int i10 = a4.f2974b;
        long jD2 = e0Var.d(i10);
        return g(h0Var2, a4.f2973a, Math.max(jD2 == Long.MIN_VALUE ? e0Var.f16429d : e0Var.f16432g.a(i10).h + jD2, jLongValue), c0Var.f240c, a4.f2976d);
    }

    public final c0 e(t2.h0 h0Var, H2.A a4, long j3, long j7) {
        h0Var.g(a4.f2973a, this.f255a);
        if (!a4.b()) {
            return g(h0Var, a4.f2973a, j7, j3, a4.f2976d);
        }
        return f(h0Var, a4.f2973a, a4.f2974b, a4.f2975c, j3, a4.f2976d);
    }

    public final c0 f(t2.h0 h0Var, Object obj, int i7, int i8, long j3, long j7) {
        H2.A a4 = new H2.A(obj, i7, i8, j7, -1);
        t2.e0 e0Var = this.f255a;
        long jA = h0Var.g(obj, e0Var).a(i7, i8);
        long jMax = i8 == e0Var.f(i7) ? e0Var.f16432g.f16404b : 0L;
        boolean zH = e0Var.h(i7);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new c0(a4, jMax, j3, -9223372036854775807L, jA, zH, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A2.c0 g(t2.h0 r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.e0.g(t2.h0, java.lang.Object, long, long, long):A2.c0");
    }

    public final c0 h(t2.h0 h0Var, c0 c0Var) {
        H2.A a4 = c0Var.f238a;
        boolean zB = a4.b();
        boolean zH = false;
        int i7 = a4.f2977e;
        boolean z6 = !zB && i7 == -1;
        boolean zJ = j(h0Var, a4);
        boolean zI = i(h0Var, a4, z6);
        Object obj = a4.f2973a;
        t2.e0 e0Var = this.f255a;
        h0Var.g(obj, e0Var);
        long jD = (a4.b() || i7 == -1) ? -9223372036854775807L : e0Var.d(i7);
        boolean zB2 = a4.b();
        int i8 = a4.f2974b;
        long jA = zB2 ? e0Var.a(i8, a4.f2975c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? e0Var.f16429d : jD;
        if (a4.b()) {
            zH = e0Var.h(i8);
        } else if (i7 != -1 && e0Var.h(i7)) {
            zH = true;
        }
        return new c0(a4, c0Var.f239b, c0Var.f240c, jD, jA, zH, z6, zJ, zI);
    }

    public final boolean i(t2.h0 h0Var, H2.A a4, boolean z6) {
        int iB = h0Var.b(a4.f2973a);
        if (!h0Var.m(h0Var.f(iB, this.f255a, false).f16428c, this.f256b, 0L).h) {
            if (h0Var.d(iB, this.f255a, this.f256b, this.f261g, this.h) == -1 && z6) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(t2.h0 h0Var, H2.A a4) {
        if (!a4.b() && a4.f2977e == -1) {
            Object obj = a4.f2973a;
            if (h0Var.m(h0Var.g(obj, this.f255a).f16428c, this.f256b, 0L).f16465n == h0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        E4.F fO = E4.I.o();
        for (b0 b0Var = this.f262i; b0Var != null; b0Var = b0Var.l) {
            fO.a(b0Var.f230f.f238a);
        }
        b0 b0Var2 = this.f263j;
        this.f258d.c(new d0(this, fO, b0Var2 == null ? null : b0Var2.f230f.f238a, 0));
    }

    public final boolean l(b0 b0Var) {
        AbstractC1697a.j(b0Var);
        boolean z6 = false;
        if (b0Var.equals(this.f264k)) {
            return false;
        }
        this.f264k = b0Var;
        while (true) {
            b0Var = b0Var.l;
            if (b0Var == null) {
                break;
            }
            if (b0Var == this.f263j) {
                this.f263j = this.f262i;
                z6 = true;
            }
            b0Var.g();
            this.l--;
        }
        b0 b0Var2 = this.f264k;
        b0Var2.getClass();
        if (b0Var2.l != null) {
            b0Var2.b();
            b0Var2.l = null;
            b0Var2.c();
        }
        k();
        return z6;
    }

    public final H2.A n(t2.h0 h0Var, Object obj, long j3) {
        long jO;
        int iB;
        Object obj2 = obj;
        t2.e0 e0Var = this.f255a;
        int i7 = h0Var.g(obj2, e0Var).f16428c;
        Object obj3 = this.f265m;
        if (obj3 == null || (iB = h0Var.b(obj3)) == -1 || h0Var.f(iB, e0Var, false).f16428c != i7) {
            b0 b0Var = this.f262i;
            while (true) {
                if (b0Var == null) {
                    b0 b0Var2 = this.f262i;
                    while (true) {
                        if (b0Var2 != null) {
                            int iB2 = h0Var.b(b0Var2.f226b);
                            if (iB2 != -1 && h0Var.f(iB2, e0Var, false).f16428c == i7) {
                                jO = b0Var2.f230f.f238a.f2976d;
                                break;
                            }
                            b0Var2 = b0Var2.l;
                        } else {
                            jO = o(obj2);
                            if (jO == -1) {
                                jO = this.f260f;
                                this.f260f = 1 + jO;
                                if (this.f262i == null) {
                                    this.f265m = obj2;
                                    this.f266n = jO;
                                }
                            }
                        }
                    }
                } else {
                    if (b0Var.f226b.equals(obj2)) {
                        jO = b0Var.f230f.f238a.f2976d;
                        break;
                    }
                    b0Var = b0Var.l;
                }
            }
        } else {
            jO = this.f266n;
        }
        h0Var.g(obj2, e0Var);
        int i8 = e0Var.f16428c;
        t2.g0 g0Var = this.f256b;
        h0Var.n(i8, g0Var);
        boolean z6 = false;
        for (int iB3 = h0Var.b(obj); iB3 >= g0Var.f16464m; iB3--) {
            h0Var.f(iB3, e0Var, true);
            boolean z7 = e0Var.f16432g.f16403a > 0;
            z6 |= z7;
            if (e0Var.c(e0Var.f16429d) != -1) {
                obj2 = e0Var.f16427b;
                obj2.getClass();
            }
            if (z6 && (!z7 || e0Var.f16429d != 0)) {
                break;
            }
        }
        return m(h0Var, obj2, j3, jO, this.f256b, this.f255a);
    }

    public final long o(Object obj) {
        for (int i7 = 0; i7 < this.f267o.size(); i7++) {
            b0 b0Var = (b0) this.f267o.get(i7);
            if (b0Var.f226b.equals(obj)) {
                return b0Var.f230f.f238a.f2976d;
            }
        }
        return -1L;
    }

    public final boolean p(t2.h0 h0Var) {
        t2.h0 h0Var2;
        b0 b0Var;
        b0 b0Var2 = this.f262i;
        if (b0Var2 == null) {
            return true;
        }
        int iB = h0Var.b(b0Var2.f226b);
        while (true) {
            h0Var2 = h0Var;
            iB = h0Var2.d(iB, this.f255a, this.f256b, this.f261g, this.h);
            while (true) {
                b0Var2.getClass();
                b0Var = b0Var2.l;
                if (b0Var == null || b0Var2.f230f.f244g) {
                    break;
                }
                b0Var2 = b0Var;
            }
            if (iB == -1 || b0Var == null || h0Var2.b(b0Var.f226b) != iB) {
                break;
            }
            b0Var2 = b0Var;
            h0Var = h0Var2;
        }
        boolean zL = l(b0Var2);
        b0Var2.f230f = h(h0Var2, b0Var2.f230f);
        return !zL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        return !l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(t2.h0 r11, long r12, long r14) {
        /*
            r10 = this;
            A2.b0 r0 = r10.f262i
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L86
            A2.c0 r3 = r0.f230f
            if (r1 != 0) goto Lf
            A2.c0 r1 = r10.h(r11, r3)
            goto L2e
        Lf:
            A2.c0 r4 = r10.d(r11, r1, r12)
            if (r4 != 0) goto L1b
            boolean r11 = r10.l(r1)
            r11 = r11 ^ r2
            return r11
        L1b:
            long r5 = r3.f239b
            long r7 = r4.f239b
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L80
            H2.A r5 = r3.f238a
            H2.A r6 = r4.f238a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L80
            r1 = r4
        L2e:
            long r4 = r3.f240c
            A2.c0 r4 = r1.a(r4)
            r0.f230f = r4
            long r3 = r3.f242e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L7a
            long r7 = r1.f242e
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L48
            goto L7a
        L48:
            r0.i()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L55
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L58
        L55:
            long r11 = r0.f237o
            long r11 = r11 + r7
        L58:
            A2.b0 r13 = r10.f263j
            r1 = 0
            if (r0 != r13) goto L6f
            A2.c0 r13 = r0.f230f
            boolean r13 = r13.f243f
            if (r13 != 0) goto L6f
            r3 = -9223372036854775808
            int r13 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r13 == 0) goto L6d
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L6f
        L6d:
            r11 = r2
            goto L70
        L6f:
            r11 = r1
        L70:
            boolean r12 = r10.l(r0)
            if (r12 != 0) goto L79
            if (r11 != 0) goto L79
            goto L86
        L79:
            return r1
        L7a:
            A2.b0 r1 = r0.l
            r9 = r1
            r1 = r0
            r0 = r9
            goto L3
        L80:
            boolean r11 = r10.l(r1)
            r11 = r11 ^ r2
            return r11
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.e0.q(t2.h0, long, long):boolean");
    }
}
