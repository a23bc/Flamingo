package X;

import L2.C0247a;
import b1.AbstractC0607C;
import b1.C0613I;
import b1.C0619d;
import b1.C0622g;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.C0894j0;
import java.util.ArrayList;
import java.util.ListIterator;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.AbstractC1461p;
import t.AbstractC1462q;
import t.C1439A;
import t.C1441C;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x0.C1892b;
import x0.C1893c;

/* JADX INFO: renamed from: X.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0495p0 {

    /* JADX INFO: renamed from: a */
    public final u0 f8126a;

    /* JADX INFO: renamed from: e */
    public G0.a f8130e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1182c f8131f;

    /* JADX INFO: renamed from: k */
    public C1892b f8135k;
    public O0.C l;

    /* JADX INFO: renamed from: t */
    public Z f8143t;

    /* JADX INFO: renamed from: u */
    public boolean f8144u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1765B f8145v;

    /* JADX INFO: renamed from: w */
    public C0505y f8146w;

    /* JADX INFO: renamed from: x */
    public boolean f8147x;

    /* JADX INFO: renamed from: b */
    public final C0894j0 f8127b = C0879c.t(null);

    /* JADX INFO: renamed from: c */
    public final C0894j0 f8128c = C0879c.t(Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public InterfaceC1182c f8129d = new J(this, 7);

    /* JADX INFO: renamed from: g */
    public final C0247a f8132g = new C0247a(9, false);
    public final w0.p h = new w0.p();

    /* JADX INFO: renamed from: i */
    public final C0894j0 f8133i = C0879c.t(Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public final f0.G f8134j = C0879c.o(new M(this, 3));

    /* JADX INFO: renamed from: m */
    public final C0894j0 f8136m = new C0894j0(Y4.o.f8736a, f0.W.f11764q);

    /* JADX INFO: renamed from: n */
    public final C0894j0 f8137n = C0879c.t(new C1892b(0));

    /* JADX INFO: renamed from: o */
    public final C0894j0 f8138o = C0879c.t(new C1892b(0));

    /* JADX INFO: renamed from: p */
    public final C0894j0 f8139p = C0879c.t(null);

    /* JADX INFO: renamed from: q */
    public final C0894j0 f8140q = C0879c.t(null);

    /* JADX INFO: renamed from: r */
    public final C0894j0 f8141r = C0879c.t(null);

    /* JADX INFO: renamed from: s */
    public final C0894j0 f8142s = C0879c.t(null);

    public C0495p0(u0 u0Var) {
        this.f8126a = u0Var;
        u0Var.f8177e = new J(this, 8);
        u0Var.f8178f = new C0483j0(0, this);
        u0Var.f8179g = new C0485k0(this);
        u0Var.h = new M(this, 4);
        u0Var.f8180i = new J(this, 1);
        u0Var.f8181j = new J(this, 2);
    }

    public static final Object a(C0495p0 c0495p0, AbstractC0871i abstractC0871i) {
        Object objC;
        Y4.h hVarE = c0495p0.e();
        Y4.o oVar = Y4.o.f8736a;
        if (hVarE != null) {
            C0622g c0622g = (C0622g) hVarE.f8726o;
            long j3 = ((b1.L) hVarE.f8727p).f9945a;
            C0505y c0505y = c0495p0.f8146w;
            if (c0505y != null) {
                if (c0622g.length() == 0 || b1.L.c(j3)) {
                    objC = oVar;
                } else {
                    objC = AbstractC1767D.C(c0505y.f8205a, new C0503w(c0505y, new C0500t(j3, c0505y, null, c0622g), null), abstractC0871i);
                }
                if (objC == EnumC0830a.f11264o) {
                    return objC;
                }
            }
        }
        return oVar;
    }

    public final long b(O0.C c7, long j3) {
        O0.C c8 = this.l;
        if (c8 == null || !c8.y()) {
            return 9205357640488583168L;
        }
        return k().K(c7, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r13 = this;
            X.E r0 = r13.g()
            r1 = 0
            if (r0 == 0) goto La2
            X.u0 r0 = r13.f8126a
            t.C r2 = r0.a()
            int r2 = r2.f15970e
            if (r2 != 0) goto L13
            goto La2
        L13:
            b1.d r2 = new b1.d
            r2.<init>()
            O0.C r3 = r13.k()
            java.util.ArrayList r3 = r0.c(r3)
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L28:
            boolean r5 = r4.hasPrevious()
            r6 = -1
            if (r5 == 0) goto L52
            java.lang.Object r5 = r4.previous()
            X.o r5 = (X.C0492o) r5
            t.C r7 = r0.a()
            long r8 = r5.f8115a
            java.lang.Object r5 = r7.e(r8)
            X.E r5 = (X.E) r5
            if (r5 == 0) goto L28
            X.D r7 = r5.f7891a
            int r7 = r7.f7888b
            X.D r5 = r5.f7892b
            int r5 = r5.f7888b
            if (r7 == r5) goto L28
            int r4 = r4.nextIndex()
            goto L53
        L52:
            r4 = r6
        L53:
            if (r4 == r6) goto L9d
            int r5 = r3.size()
            r6 = 0
            r7 = r6
        L5b:
            if (r7 >= r5) goto L9d
            java.lang.Object r8 = r3.get(r7)
            X.o r8 = (X.C0492o) r8
            t.C r9 = r0.a()
            long r10 = r8.f8115a
            java.lang.Object r9 = r9.e(r10)
            X.E r9 = (X.E) r9
            if (r9 == 0) goto L9a
            b1.g r8 = r8.d()
            X.D r10 = r9.f7891a
            int r10 = r10.f7888b
            X.D r9 = r9.f7892b
            int r9 = r9.f7888b
            long r9 = b1.AbstractC0607C.b(r10, r9)
            if (r7 < r4) goto L85
            r11 = 1
            goto L86
        L85:
            r11 = r6
        L86:
            int r12 = b1.L.f(r9)
            int r9 = b1.L.e(r9)
            r2.b(r8, r12, r9)
            if (r11 != 0) goto L9a
            r8 = 10
            java.lang.StringBuilder r9 = r2.f9962o
            r9.append(r8)
        L9a:
            int r7 = r7 + 1
            goto L5b
        L9d:
            b1.g r0 = r2.c()
            goto La3
        La2:
            r0 = r1
        La3:
            if (r0 == 0) goto Lb7
            java.lang.String r2 = r0.f9970p
            int r2 = r2.length()
            if (r2 <= 0) goto Lae
            r1 = r0
        Lae:
            if (r1 == 0) goto Lb7
            l5.c r0 = r13.f8131f
            if (r0 == 0) goto Lb7
            r0.b(r1)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0495p0.c():void");
    }

    public final C0492o d(D d4) {
        return (C0492o) this.f8126a.f8175c.e(d4.f7889c);
    }

    public final Y4.h e() {
        int iNextIndex;
        int iF;
        int length;
        if (g() == null) {
            return null;
        }
        u0 u0Var = this.f8126a;
        if (u0Var.f8174b.isEmpty()) {
            return null;
        }
        C0619d c0619d = new C0619d();
        ArrayList arrayListC = u0Var.c(k());
        ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            E e7 = (E) u0Var.a().e(((C0492o) listIterator.previous()).f8115a);
            if (e7 != null && e7.f7891a.f7888b != e7.f7892b.f7888b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListC.size();
            int i7 = 0;
            iF = -1;
            length = -1;
            int i8 = 0;
            while (i8 < size) {
                C0492o c0492o = (C0492o) arrayListC.get(i8);
                E e8 = (E) u0Var.a().e(c0492o.f8115a);
                if (e8 != null) {
                    C0622g c0622gD = c0492o.d();
                    long jB = AbstractC0607C.b(e8.f7891a.f7888b, e8.f7892b.f7888b);
                    int i9 = i8 >= iNextIndex ? 1 : i7;
                    if (iF == -1) {
                        iF = b1.L.f(jB);
                        c0619d.b(c0622gD, i7, b1.L.f(jB));
                    }
                    c0619d.b(c0622gD, b1.L.f(jB), b1.L.e(jB));
                    StringBuilder sb = c0619d.f9962o;
                    if (i9 == 0) {
                        sb.append('\n');
                    } else {
                        length = sb.length();
                        c0619d.b(c0622gD, b1.L.e(jB), c0622gD.f9970p.length());
                    }
                }
                i8++;
                i7 = 0;
            }
        } else {
            iF = -1;
            length = -1;
        }
        C0622g c0622gC = c0619d.c();
        if (iF == -1 || length == -1) {
            return null;
        }
        return new Y4.h(c0622gC, new b1.L(AbstractC0607C.b(iF, length)));
    }

    public final M.M f() {
        return (M.M) this.f8141r.getValue();
    }

    public final E g() {
        return (E) this.f8127b.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f8128c.getValue()).booleanValue();
    }

    public final boolean i() {
        E eG = g();
        if (eG != null) {
            D d4 = eG.f7891a;
            D d7 = eG.f7892b;
            if (!AbstractC1209k.a(d4, d7)) {
                if (d4.f7889c == d7.f7889c) {
                    return true;
                }
                O0.C cK = k();
                u0 u0Var = this.f8126a;
                ArrayList arrayListC = u0Var.c(cK);
                int size = arrayListC.size();
                for (int i7 = 0; i7 < size; i7++) {
                    E e7 = (E) u0Var.a().e(((C0492o) arrayListC.get(i7)).f8115a);
                    if (e7 != null && e7.f7891a.f7888b != e7.f7892b.f7888b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j() {
        G0.a aVar;
        C1441C c1441c = AbstractC1462q.f16101a;
        AbstractC1209k.d(c1441c, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f8126a.f8182k.setValue(c1441c);
        this.f8147x = false;
        p();
        if (g() != null) {
            this.f8129d.b(null);
            if (!h() || (aVar = this.f8130e) == null) {
                return;
            }
            aVar.a(9);
        }
    }

    public final O0.C k() {
        O0.C c7 = this.l;
        if (c7 == null) {
            C.b.b("null coordinates");
            throw new A2.W();
        }
        if (!c7.y()) {
            C.b.a("unattached coordinates");
        }
        return c7;
    }

    public final void l(boolean z6) {
        C0894j0 c0894j0 = this.f8128c;
        if (((Boolean) c0894j0.getValue()).booleanValue() != z6) {
            c0894j0.setValue(Boolean.valueOf(z6));
            p();
        }
    }

    public final void m(E e7) {
        this.f8127b.setValue(e7);
        if (e7 != null) {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r20 = this;
            r0 = r20
            X.E r1 = r0.g()
            O0.C r2 = r0.l
            r3 = 0
            if (r1 == 0) goto L14
            X.D r4 = r1.f7891a
            if (r4 == 0) goto L14
            X.o r4 = r0.d(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            X.D r5 = r1.f7892b
            if (r5 == 0) goto L20
            X.o r5 = r0.d(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            O0.C r6 = r4.c()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            O0.C r7 = r5.c()
            goto L31
        L30:
            r7 = r3
        L31:
            f0.j0 r8 = r0.f8140q
            f0.j0 r9 = r0.f8139p
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r10 = r2.y()
            if (r10 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            x0.c r10 = X.AbstractC0498r0.y(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L78
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.a(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7d
        L60:
            long r11 = r2.K(r6, r11)
            x0.b r4 = new x0.b
            r4.<init>(r11)
            M.M r6 = r0.f()
            M.M r15 = M.M.f4422p
            if (r6 == r15) goto L7e
            boolean r6 = X.AbstractC0498r0.p(r10, r11)
            if (r6 == 0) goto L7d
            goto L7e
        L78:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r4 = r3
        L7e:
            r9.setValue(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.a(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            long r1 = r2.K(r7, r4)
            x0.b r4 = new x0.b
            r4.<init>(r1)
            M.M r5 = r0.f()
            M.M r6 = M.M.f4423q
            if (r5 == r6) goto La6
            boolean r1 = X.AbstractC0498r0.p(r10, r1)
            if (r1 == 0) goto La7
        La6:
            r3 = r4
        La7:
            r8.setValue(r3)
            return
        Lab:
            r9.setValue(r3)
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0495p0.n():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [int] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    public final boolean o(long j3, long j7, boolean z6, F f7) {
        ArrayList arrayList;
        Z x0Var;
        C0613I c0613i;
        long j8;
        int i7;
        ArrayList arrayList2;
        boolean z7;
        long j9;
        C0465a0 c0465a0;
        EnumC0484k enumC0484kN;
        EnumC0484k enumC0484k;
        EnumC0484k enumC0484k2;
        int i8;
        int i9;
        EnumC0484k enumC0484k3;
        EnumC0484k enumC0484k4;
        boolean z8;
        EnumC0484k enumC0484k5;
        EnumC0484k enumC0484k6;
        C0465a0 c0465a02;
        int i10;
        ?? r12;
        ?? r24;
        D d4;
        ?? r13;
        ?? r8;
        D d7;
        boolean z9 = false;
        int i11 = 1;
        this.f8141r.setValue(z6 ? M.M.f4422p : M.M.f4423q);
        this.f8142s.setValue(new C1892b(j3));
        O0.C cK = k();
        u0 u0Var = this.f8126a;
        ArrayList arrayListC = u0Var.c(cK);
        int i12 = AbstractC1461p.f16100a;
        C1439A c1439a = new C1439A(6);
        int size = arrayListC.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1439a.e(((C0492o) arrayListC.get(i13)).f8115a, i13);
        }
        long j10 = 9223372034707292159L;
        C0465a0 c0465a03 = new C0465a0(j3, j7, cK, z6, (j7 & 9223372034707292159L) == 9205357640488583168L ? null : g(), new C0489m0(0, c1439a));
        int size2 = arrayListC.size();
        int i14 = 0;
        while (true) {
            arrayList = c0465a03.h;
            if (i14 >= size2) {
                break;
            }
            C0492o c0492o = (C0492o) arrayListC.get(i14);
            O0.C c7 = c0492o.c();
            if (c7 == null || (c0613i = (C0613I) c0492o.f8117c.a()) == null) {
                z7 = z9;
                i7 = i11;
                i8 = size2;
                i9 = i14;
                arrayList2 = arrayListC;
                j8 = j10;
                c0465a02 = c0465a03;
            } else {
                j8 = j10;
                long jK = c0465a03.f8026c.K(c7, 0L);
                boolean z10 = z9;
                long jG = C1892b.g(c0465a03.f8024a, jK);
                i7 = i11;
                arrayList2 = arrayListC;
                long j11 = c0465a03.f8025b;
                long jG2 = (j11 & j8) == 9205357640488583168L ? 9205357640488583168L : C1892b.g(j11, jK);
                long j12 = c0613i.f9931c;
                z7 = z10;
                float f8 = (int) (j12 >> 32);
                float f9 = (int) (j12 & 4294967295L);
                int i15 = (int) (jG >> 32);
                EnumC0484k enumC0484k7 = Float.intBitsToFloat(i15) < 0.0f ? EnumC0484k.f8092o : Float.intBitsToFloat(i15) > f8 ? EnumC0484k.f8094q : EnumC0484k.f8093p;
                int i16 = (int) (jG & 4294967295L);
                EnumC0484k enumC0484k8 = Float.intBitsToFloat(i16) < 0.0f ? EnumC0484k.f8092o : Float.intBitsToFloat(i16) > f9 ? EnumC0484k.f8094q : EnumC0484k.f8093p;
                boolean z11 = c0465a03.f8027d;
                long j13 = c0492o.f8115a;
                E e7 = c0465a03.f8028e;
                if (z11) {
                    c0465a0 = c0465a03;
                    EnumC0484k enumC0484k9 = enumC0484k7;
                    j9 = j13;
                    enumC0484kN = AbstractC0498r0.n(enumC0484k9, enumC0484k8, c0465a0, j9, e7 != null ? e7.f7892b : null);
                    i8 = size2;
                    i9 = i14;
                    enumC0484k5 = enumC0484kN;
                    enumC0484k = enumC0484k9;
                    enumC0484k4 = enumC0484k;
                    enumC0484k3 = enumC0484k8;
                    enumC0484k2 = enumC0484k3;
                    z8 = z11;
                    enumC0484k6 = enumC0484k5;
                } else {
                    EnumC0484k enumC0484k10 = enumC0484k7;
                    j9 = j13;
                    c0465a0 = c0465a03;
                    enumC0484kN = AbstractC0498r0.n(enumC0484k10, enumC0484k8, c0465a0, j9, e7 != null ? e7.f7891a : null);
                    enumC0484k = enumC0484k10;
                    enumC0484k2 = enumC0484k8;
                    i8 = size2;
                    i9 = i14;
                    enumC0484k3 = enumC0484kN;
                    enumC0484k4 = enumC0484k3;
                    z8 = z11;
                    enumC0484k5 = enumC0484k;
                    enumC0484k6 = enumC0484k2;
                }
                c0465a02 = c0465a0;
                EnumC0484k enumC0484kX = AbstractC0498r0.x(enumC0484k, enumC0484k2);
                if (enumC0484kX == EnumC0484k.f8093p || enumC0484kX != enumC0484kN) {
                    int length = c0613i.f9929a.f9920a.f9970p.length();
                    C0489m0 c0489m0 = c0465a02.f8029f;
                    if (z8) {
                        int iS = AbstractC0498r0.s(jG, c0613i);
                        if (e7 == null || (d7 = e7.f7892b) == null) {
                            r8 = iS;
                        } else {
                            int iCompare = c0489m0.compare(Long.valueOf(d7.f7889c), Long.valueOf(j9));
                            r8 = iCompare < 0 ? z7 : iCompare > 0 ? length : d7.f7888b;
                        }
                        r24 = r8;
                        r13 = iS;
                    } else {
                        int iS2 = AbstractC0498r0.s(jG, c0613i);
                        if (e7 == null || (d4 = e7.f7891a) == null) {
                            i10 = iS2;
                            r12 = i10;
                        } else {
                            i10 = iS2;
                            int iCompare2 = c0489m0.compare(Long.valueOf(d4.f7889c), Long.valueOf(j9));
                            r12 = iCompare2 < 0 ? z7 : iCompare2 > 0 ? length : d4.f7888b;
                        }
                        r24 = i10;
                        r13 = r12;
                    }
                    int iS3 = (jG2 & j8) == 9205357640488583168L ? -1 : AbstractC0498r0.s(jG2, c0613i);
                    int i17 = c0465a02.f8033k + 2;
                    c0465a02.f8033k = i17;
                    long j14 = j9;
                    B b7 = new B(j14, i17, r13 == true ? 1 : 0, r24, iS3, c0613i);
                    c0465a02.f8031i = c0465a02.a(c0465a02.f8031i, enumC0484k4, enumC0484k3);
                    c0465a02.f8032j = c0465a02.a(c0465a02.f8032j, enumC0484k5, enumC0484k6);
                    c0465a02.f8030g.e(j14, arrayList.size());
                    arrayList.add(b7);
                }
            }
            i14 = i9 + 1;
            i11 = i7;
            z9 = z7;
            size2 = i8;
            c0465a03 = c0465a02;
            j10 = j8;
            arrayListC = arrayList2;
        }
        boolean z12 = z9;
        int i18 = i11;
        C0465a0 c0465a04 = c0465a03;
        int i19 = c0465a04.f8033k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            x0Var = null;
        } else if (size3 != i18) {
            int i20 = c0465a04.f8031i;
            int i21 = i20 == -1 ? i19 : i20;
            int i22 = c0465a04.f8032j;
            x0Var = new C0490n(c0465a04.f8030g, arrayList, i21, i22 == -1 ? i19 : i22, c0465a04.f8027d, c0465a04.f8028e);
        } else {
            B b8 = (B) Z4.n.F0(arrayList);
            int i23 = c0465a04.f8031i;
            int i24 = i23 == -1 ? i19 : i23;
            int i25 = c0465a04.f8032j;
            x0Var = new x0(c0465a04.f8027d, i24, i25 == -1 ? i19 : i25, c0465a04.f8028e, b8);
        }
        if (x0Var == null || !x0Var.m(this.f8143t)) {
            return z12;
        }
        E eA = f7.a(x0Var);
        if (!AbstractC1209k.a(eA, g())) {
            if (h()) {
                ?? r22 = u0Var.f8174b;
                int size4 = r22.size();
                ?? r62 = z12;
                while (true) {
                    if (r62 >= size4) {
                        break;
                    }
                    if (((C0492o) r22.get(r62)).d().f9970p.length() > 0) {
                        G0.a aVar = this.f8130e;
                        if (aVar != null) {
                            aVar.a(9);
                        }
                    } else {
                        r62++;
                    }
                }
            }
            u0Var.f8182k.setValue(x0Var.d(eA));
            this.f8129d.b(eA);
            this.f8144u = z12;
        }
        this.f8143t = x0Var;
        return true;
    }

    public final void p() {
        w5.w0 w0Var;
        if (((Boolean) this.f8133i.getValue()).booleanValue()) {
            boolean z6 = this.f8147x;
            C0247a c0247a = this.f8132g;
            if (z6 && h()) {
                if (((C1893c) this.f8134j.getValue()) == null) {
                    return;
                }
                c0247a.r();
            } else {
                S.h hVar = (S.h) c0247a.f4105p;
                if (hVar == null || (w0Var = hVar.f6720I) == null) {
                    return;
                }
                w0Var.c(null);
                hVar.f6720I = null;
            }
        }
    }
}
