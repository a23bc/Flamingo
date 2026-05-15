package p0;

import f0.AbstractC0908q0;
import java.util.ArrayList;
import java.util.HashMap;
import l5.InterfaceC1182c;
import t.K;
import t.S;

/* JADX INFO: renamed from: p0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1285b extends AbstractC1289f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f14905n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1182c f14906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1182c f14907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14908g;
    public K h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f14909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f14910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f14911k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14912m;

    public C1285b(long j3, j jVar, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) {
        super(j3, jVar);
        this.f14906e = interfaceC1182c;
        this.f14907f = interfaceC1182c2;
        this.f14910j = j.f14931s;
        this.f14911k = f14905n;
        this.l = 1;
    }

    public final void A(long j3) {
        synchronized (l.f14941c) {
            this.f14910j = this.f14910j.i(j3);
        }
    }

    public final void B(j jVar) {
        synchronized (l.f14941c) {
            this.f14910j = this.f14910j.g(jVar);
        }
    }

    public void C(K k7) {
        this.h = k7;
    }

    public C1285b D(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) throws Throwable {
        long j3;
        long j7;
        j jVarD;
        if (this.f14921c) {
            AbstractC0908q0.a("Cannot use a disposed snapshot");
        }
        if (this.f14912m && this.f14922d < 0) {
            AbstractC0908q0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f14941c;
        synchronized (obj) {
            try {
                j3 = l.f14943e;
                j7 = 1;
                l.f14943e = j3 + j7;
                l.f14942d = l.f14942d.i(j3);
                jVarD = d();
                r(jVarD.i(j3));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C1286c c1286c = new C1286c(j3, l.e(jVarD, g() + j7, j3), l.l(interfaceC1182c, e(), true), l.b(interfaceC1182c2, i()), this);
                if (this.f14912m || this.f14921c) {
                    return c1286c;
                }
                long jG = g();
                synchronized (obj) {
                    long j8 = l.f14943e;
                    l.f14943e = j8 + j7;
                    s(j8);
                    l.f14942d = l.f14942d.i(g());
                }
                r(l.e(d(), jG + j7, g()));
                return c1286c;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // p0.AbstractC1289f
    public final void b() {
        l.f14942d = l.f14942d.c(g()).b(this.f14910j);
    }

    @Override // p0.AbstractC1289f
    public void c() {
        if (this.f14921c) {
            return;
        }
        this.f14921c = true;
        synchronized (l.f14941c) {
            o();
        }
        l();
    }

    @Override // p0.AbstractC1289f
    public boolean f() {
        return false;
    }

    @Override // p0.AbstractC1289f
    public int h() {
        return this.f14908g;
    }

    @Override // p0.AbstractC1289f
    public InterfaceC1182c i() {
        return this.f14907f;
    }

    @Override // p0.AbstractC1289f
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // p0.AbstractC1289f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            f0.AbstractC0908q0.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f14912m
            if (r1 != 0) goto L94
            t.K r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f14912m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            f0.AbstractC0908q0.b(r2)
        L27:
            r2 = 0
            r0.C(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f16010b
            long[] r1 = r1.f16009a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            p0.y r13 = (p0.y) r13
            p0.A r13 = r13.c()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f14889a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            p0.j r6 = r0.f14910j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = Z4.n.n0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            o0.d r6 = p0.l.f14939a
            r14 = 0
            r13.f14889a = r14
        L83:
            p0.A r13 = r13.f14890b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1285b.l():void");
    }

    @Override // p0.AbstractC1289f
    public void m() {
        if (this.f14912m || this.f14921c) {
            return;
        }
        v();
    }

    @Override // p0.AbstractC1289f
    public void n(y yVar) {
        K kX = x();
        if (kX == null) {
            K k7 = S.f16033a;
            kX = new K();
            C(kX);
        }
        kX.a(yVar);
    }

    @Override // p0.AbstractC1289f
    public final void p() {
        int length = this.f14911k.length;
        for (int i7 = 0; i7 < length; i7++) {
            l.v(this.f14911k[i7]);
        }
        o();
    }

    @Override // p0.AbstractC1289f
    public void t(int i7) {
        this.f14908g = i7;
    }

    @Override // p0.AbstractC1289f
    public AbstractC1289f u(InterfaceC1182c interfaceC1182c) throws Throwable {
        long j3;
        long j7;
        if (this.f14921c) {
            AbstractC0908q0.a("Cannot use a disposed snapshot");
        }
        if (this.f14912m && this.f14922d < 0) {
            AbstractC0908q0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        boolean z6 = this instanceof C1284a;
        A(g());
        Object obj = l.f14941c;
        synchronized (obj) {
            try {
                j3 = l.f14943e;
                j7 = 1;
                l.f14943e = j3 + j7;
                l.f14942d = l.f14942d.i(j3);
            } catch (Throwable th) {
                th = th;
            }
            try {
                C1287d c1287d = new C1287d(j3, l.e(d(), jG + j7, j3), l.l(interfaceC1182c, e(), true), this);
                if (this.f14912m || this.f14921c) {
                    return c1287d;
                }
                long jG2 = g();
                synchronized (obj) {
                    long j8 = l.f14943e;
                    l.f14943e = j8 + j7;
                    s(j8);
                    l.f14942d = l.f14942d.i(g());
                }
                r(l.e(d(), jG2 + j7, g()));
                return c1287d;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void v() {
        long j3;
        A(g());
        if (this.f14912m || this.f14921c) {
            return;
        }
        long jG = g();
        synchronized (l.f14941c) {
            long j7 = l.f14943e;
            j3 = 1;
            l.f14943e = j7 + j3;
            s(j7);
            l.f14942d = l.f14942d.i(g());
        }
        r(l.e(d(), jG + j3, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p0.q w() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1285b.w():p0.q");
    }

    public K x() {
        return this.h;
    }

    @Override // p0.AbstractC1289f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC1182c e() {
        return this.f14906e;
    }

    public final q z(long j3, K k7, HashMap map, j jVar) {
        ArrayList arrayList;
        ArrayList arrayListB0;
        ArrayList arrayList2;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i7;
        long j7;
        ArrayList arrayList3;
        AbstractC1280A abstractC1280AE;
        j jVarG = d().i(g()).g(this.f14910j);
        Object[] objArr3 = k7.f16010b;
        long[] jArr3 = k7.f16009a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i8 = 0;
            arrayList2 = null;
            arrayListB0 = null;
            while (true) {
                long j8 = jArr3[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j8 & 255) < 128) {
                            objArr2 = objArr3;
                            y yVar = (y) objArr3[(i8 << 3) + i10];
                            jArr2 = jArr3;
                            AbstractC1280A abstractC1280AC = yVar.c();
                            i7 = i10;
                            ArrayList arrayList4 = arrayList2;
                            AbstractC1280A abstractC1280AT = l.t(abstractC1280AC, j3, jVar);
                            if (abstractC1280AT == null) {
                                jVar3 = jVarG;
                                arrayList3 = arrayListB0;
                                j7 = j8;
                            } else {
                                arrayList3 = arrayListB0;
                                j7 = j8;
                                AbstractC1280A abstractC1280AT2 = l.t(abstractC1280AC, g(), jVarG);
                                if (abstractC1280AT2 == null) {
                                    jVar3 = jVarG;
                                } else {
                                    jVar3 = jVarG;
                                    if (abstractC1280AT2.f14889a != 1 && !abstractC1280AT.equals(abstractC1280AT2)) {
                                        AbstractC1280A abstractC1280AT3 = l.t(abstractC1280AC, g(), d());
                                        if (abstractC1280AT3 == null) {
                                            l.s();
                                            throw null;
                                        }
                                        if (map == null || (abstractC1280AE = (AbstractC1280A) map.get(abstractC1280AT)) == null) {
                                            abstractC1280AE = yVar.e(abstractC1280AT2, abstractC1280AT, abstractC1280AT3);
                                        }
                                        if (abstractC1280AE == null) {
                                            return new C1290g(this);
                                        }
                                        if (!abstractC1280AE.equals(abstractC1280AT3)) {
                                            if (abstractC1280AE.equals(abstractC1280AT)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new Y4.h(yVar, abstractC1280AT.b(g())));
                                                arrayListB0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListB0.add(yVar);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!abstractC1280AE.equals(abstractC1280AT2) ? new Y4.h(yVar, abstractC1280AE) : new Y4.h(yVar, abstractC1280AT2.b(g())));
                                            }
                                        }
                                        arrayListB0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListB0 = arrayList3;
                        } else {
                            jVar3 = jVarG;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i7 = i10;
                            j7 = j8;
                        }
                        j8 = j7 >> 8;
                        i10 = i7 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarG = jVar3;
                    }
                    jVar2 = jVarG;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarG;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i8 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i8++;
                jArr3 = jArr;
                objArr3 = objArr;
                jVarG = jVar2;
            }
        } else {
            arrayList = null;
            arrayListB0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                Y4.h hVar = (Y4.h) arrayList2.get(i11);
                y yVar2 = (y) hVar.f8726o;
                AbstractC1280A abstractC1280A = (AbstractC1280A) hVar.f8727p;
                abstractC1280A.f14889a = j3;
                synchronized (l.f14941c) {
                    abstractC1280A.f14890b = yVar2.c();
                    yVar2.g(abstractC1280A);
                }
            }
        }
        if (arrayListB0 != null) {
            int size2 = arrayListB0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                k7.l((y) arrayListB0.get(i12));
            }
            ArrayList arrayList6 = this.f14909i;
            if (arrayList6 != null) {
                arrayListB0 = Z4.n.B0(arrayList6, arrayListB0);
            }
            this.f14909i = arrayListB0;
        }
        return h.f14924c;
    }
}
