package p0;

import G1.C0137d;
import f0.G;
import java.util.HashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n0.C1226a;
import o0.C1247d;
import t.K;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a */
    public static final C1247d f14939a = new C1247d(4);

    /* JADX INFO: renamed from: b */
    public static final A0.b f14940b = new A0.b(27);

    /* JADX INFO: renamed from: c */
    public static final Object f14941c = new Object();

    /* JADX INFO: renamed from: d */
    public static j f14942d;

    /* JADX INFO: renamed from: e */
    public static long f14943e;

    /* JADX INFO: renamed from: f */
    public static final C0137d f14944f;

    /* JADX INFO: renamed from: g */
    public static final D4.i f14945g;
    public static Object h;

    /* JADX INFO: renamed from: i */
    public static Object f14946i;

    /* JADX INFO: renamed from: j */
    public static final C1284a f14947j;

    /* JADX INFO: renamed from: k */
    public static final C1226a f14948k;

    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.lang.Cloneable] */
    static {
        j jVar = j.f14931s;
        f14942d = jVar;
        long j3 = 1;
        f14943e = j3 + j3;
        C0137d c0137d = new C0137d(2);
        c0137d.f2693p = new long[16];
        c0137d.f2696s = new int[16];
        ?? r52 = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i8 = i7 + 1;
            r52[i7] = i8;
            i7 = i8;
        }
        c0137d.f2697t = r52;
        f14944f = c0137d;
        D4.i iVar = new D4.i(12, (byte) 0);
        iVar.f1583q = new int[16];
        iVar.f1584r = new n0.m[16];
        f14945g = iVar;
        Z4.v vVar = Z4.v.f8818o;
        h = vVar;
        f14946i = vVar;
        long j7 = f14943e;
        f14943e = j3 + j7;
        C1284a c1284a = new C1284a(j7, jVar, null, new C1247d(3));
        f14942d = f14942d.i(c1284a.f14920b);
        f14947j = c1284a;
        f14948k = new C1226a(0);
    }

    public static final void a() {
        f(f14939a);
    }

    public static final InterfaceC1182c b(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) {
        return (interfaceC1182c == null || interfaceC1182c2 == null || interfaceC1182c == interfaceC1182c2) ? interfaceC1182c == null ? interfaceC1182c2 : interfaceC1182c : new k(interfaceC1182c, interfaceC1182c2, 1);
    }

    public static final HashMap c(long j3, C1285b c1285b, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        j jVar3;
        int i7;
        AbstractC1280A abstractC1280AT;
        long j7 = j3;
        K kX = c1285b.x();
        if (kX != null) {
            j jVarG = c1285b.d().i(c1285b.g()).g(c1285b.f14910j);
            Object[] objArr = kX.f16010b;
            long[] jArr3 = kX.f16009a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                HashMap map = null;
                while (true) {
                    long j8 = jArr3[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j8 & 255) < 128) {
                                y yVar = (y) objArr[(i8 << 3) + i11];
                                AbstractC1280A abstractC1280AC = yVar.c();
                                jArr2 = jArr3;
                                i7 = i9;
                                AbstractC1280A abstractC1280AT2 = t(abstractC1280AC, j7, jVar);
                                if (abstractC1280AT2 == null || (abstractC1280AT = t(abstractC1280AC, j7, jVarG)) == null || abstractC1280AT2.equals(abstractC1280AT)) {
                                    jVar3 = jVarG;
                                } else {
                                    jVar3 = jVarG;
                                    AbstractC1280A abstractC1280AT3 = t(abstractC1280AC, c1285b.g(), c1285b.d());
                                    if (abstractC1280AT3 == null) {
                                        s();
                                        throw null;
                                    }
                                    AbstractC1280A abstractC1280AE = yVar.e(abstractC1280AT, abstractC1280AT2, abstractC1280AT3);
                                    if (abstractC1280AE == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC1280AT2, abstractC1280AE);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                jVar3 = jVarG;
                                i7 = i9;
                            }
                            j8 >>= i7;
                            i11++;
                            j7 = j3;
                            i9 = i7;
                            jArr3 = jArr2;
                            jVarG = jVar3;
                        }
                        jArr = jArr3;
                        jVar2 = jVarG;
                        if (i10 != i9) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = jVarG;
                    }
                    if (i8 == length) {
                        return map;
                    }
                    i8++;
                    j7 = j3;
                    jArr3 = jArr;
                    jVarG = jVar2;
                }
            }
        }
        return null;
    }

    public static final void d(AbstractC1289f abstractC1289f) {
        long j3;
        if (f14942d.e(abstractC1289f.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC1289f.g());
        sb.append(", disposed=");
        sb.append(abstractC1289f.f14921c);
        sb.append(", applied=");
        C1285b c1285b = abstractC1289f instanceof C1285b ? (C1285b) abstractC1289f : null;
        sb.append(c1285b != null ? Boolean.valueOf(c1285b.f14912m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f14941c) {
            C0137d c0137d = f14944f;
            j3 = c0137d.f2694q > 0 ? ((long[]) c0137d.f2693p)[0] : -1L;
        }
        sb.append(j3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final j e(j jVar, long j3, long j7) {
        while (AbstractC1209k.h(j3, j7) < 0) {
            jVar = jVar.i(j3);
            j3 += (long) 1;
        }
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(l5.InterfaceC1182c r15) {
        /*
            p0.a r0 = p0.l.f14947j
            java.lang.Object r1 = p0.l.f14941c
            monitor-enter(r1)
            t.K r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            n0.a r3 = p0.l.f14948k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = w(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = p0.l.h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            l5.e r7 = (l5.e) r7     // Catch: java.lang.Throwable -> L36
            h0.h r8 = new h0.h     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            n0.a r0 = p0.l.f14948k
            r0.addAndGet(r3)
            goto L44
        L3e:
            n0.a r0 = p0.l.f14948k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = p0.l.f14941c
            monitor-enter(r0)
            g()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f16010b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f16009a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            p0.y r11 = (p0.y) r11     // Catch: java.lang.Throwable -> L86
            r(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.l.f(l5.c):java.lang.Object");
    }

    public static final void g() {
        D4.i iVar = f14945g;
        int i7 = iVar.f1582p;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            n0.m mVar = ((n0.m[]) iVar.f1584r)[i8];
            Object obj = mVar != null ? mVar.get() : null;
            if (obj != null && q((y) obj)) {
                if (i9 != i8) {
                    ((n0.m[]) iVar.f1584r)[i9] = mVar;
                    int[] iArr = (int[]) iVar.f1583q;
                    iArr[i9] = iArr[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < i7; i10++) {
            ((n0.m[]) iVar.f1584r)[i10] = null;
            ((int[]) iVar.f1583q)[i10] = 0;
        }
        if (i9 != i7) {
            iVar.f1582p = i9;
        }
    }

    public static final AbstractC1289f h(AbstractC1289f abstractC1289f, InterfaceC1182c interfaceC1182c, boolean z6) {
        boolean z7 = abstractC1289f instanceof C1285b;
        if (z7 || abstractC1289f == null) {
            return new C1282C(z7 ? (C1285b) abstractC1289f : null, interfaceC1182c, null, false, z6);
        }
        return new C1283D(abstractC1289f, interfaceC1182c, false, z6);
    }

    public static final AbstractC1280A i(AbstractC1280A abstractC1280A) {
        AbstractC1280A abstractC1280AT;
        AbstractC1289f abstractC1289fK = k();
        AbstractC1280A abstractC1280AT2 = t(abstractC1280A, abstractC1289fK.g(), abstractC1289fK.d());
        if (abstractC1280AT2 != null) {
            return abstractC1280AT2;
        }
        synchronized (f14941c) {
            AbstractC1289f abstractC1289fK2 = k();
            abstractC1280AT = t(abstractC1280A, abstractC1289fK2.g(), abstractC1289fK2.d());
        }
        if (abstractC1280AT != null) {
            return abstractC1280AT;
        }
        s();
        throw null;
    }

    public static final AbstractC1280A j(AbstractC1280A abstractC1280A, AbstractC1289f abstractC1289f) {
        AbstractC1280A abstractC1280AT;
        AbstractC1280A abstractC1280AT2 = t(abstractC1280A, abstractC1289f.g(), abstractC1289f.d());
        if (abstractC1280AT2 != null) {
            return abstractC1280AT2;
        }
        synchronized (f14941c) {
            abstractC1280AT = t(abstractC1280A, abstractC1289f.g(), abstractC1289f.d());
        }
        if (abstractC1280AT != null) {
            return abstractC1280AT;
        }
        s();
        throw null;
    }

    public static final AbstractC1289f k() {
        AbstractC1289f abstractC1289f = (AbstractC1289f) f14940b.R();
        return abstractC1289f == null ? f14947j : abstractC1289f;
    }

    public static final InterfaceC1182c l(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, boolean z6) {
        if (!z6) {
            interfaceC1182c2 = null;
        }
        return (interfaceC1182c == null || interfaceC1182c2 == null || interfaceC1182c == interfaceC1182c2) ? interfaceC1182c == null ? interfaceC1182c2 : interfaceC1182c : new k(interfaceC1182c, interfaceC1182c2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0044, code lost:
    
        r4 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p0.AbstractC1280A m(p0.AbstractC1280A r11, p0.y r12) {
        /*
            p0.A r0 = r12.c()
            long r1 = p0.l.f14943e
            G1.d r3 = p0.l.f14944f
            int r4 = r3.f2694q
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f2693p
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            p0.j r3 = p0.j.f14931s
            r4 = 0
            r5 = r4
        L1b:
            if (r0 == 0) goto L4b
            long r6 = r0.f14889a
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L26
            goto L44
        L26:
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L48
            int r8 = m5.AbstractC1209k.h(r6, r1)
            if (r8 > 0) goto L48
            boolean r6 = r3.e(r6)
            if (r6 != 0) goto L48
            if (r5 != 0) goto L3a
            r5 = r0
            goto L48
        L3a:
            long r1 = r0.f14889a
            long r3 = r5.f14889a
            int r1 = m5.AbstractC1209k.h(r1, r3)
            if (r1 >= 0) goto L46
        L44:
            r4 = r0
            goto L4b
        L46:
            r4 = r5
            goto L4b
        L48:
            p0.A r0 = r0.f14890b
            goto L1b
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 == 0) goto L55
            r4.f14889a = r0
            return r4
        L55:
            p0.A r11 = r11.b(r0)
            p0.A r0 = r12.c()
            r11.f14890b = r0
            r12.g(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.l.m(p0.A, p0.y):p0.A");
    }

    public static final AbstractC1280A n(AbstractC1280A abstractC1280A, G g6, AbstractC1289f abstractC1289f) {
        AbstractC1280A abstractC1280AM;
        synchronized (f14941c) {
            abstractC1280AM = m(abstractC1280A, g6);
            abstractC1280AM.a(abstractC1280A);
            abstractC1280AM.f14889a = abstractC1289f.g();
        }
        return abstractC1280AM;
    }

    public static final void o(AbstractC1289f abstractC1289f, y yVar) {
        abstractC1289f.t(abstractC1289f.h() + 1);
        InterfaceC1182c interfaceC1182cI = abstractC1289f.i();
        if (interfaceC1182cI != null) {
            interfaceC1182cI.b(yVar);
        }
    }

    public static final AbstractC1280A p(AbstractC1280A abstractC1280A, z zVar, AbstractC1289f abstractC1289f, AbstractC1280A abstractC1280A2) {
        AbstractC1280A abstractC1280AM;
        if (abstractC1289f.f()) {
            abstractC1289f.n(zVar);
        }
        long jG = abstractC1289f.g();
        if (abstractC1280A2.f14889a == jG) {
            return abstractC1280A2;
        }
        synchronized (f14941c) {
            abstractC1280AM = m(abstractC1280A, zVar);
        }
        abstractC1280AM.f14889a = jG;
        if (abstractC1280A2.f14889a != 1) {
            abstractC1289f.n(zVar);
        }
        return abstractC1280AM;
    }

    public static final boolean q(y yVar) {
        AbstractC1280A abstractC1280A;
        long j3 = f14943e;
        C0137d c0137d = f14944f;
        if (c0137d.f2694q > 0) {
            j3 = ((long[]) c0137d.f2693p)[0];
        }
        AbstractC1280A abstractC1280A2 = null;
        AbstractC1280A abstractC1280AC = null;
        int i7 = 0;
        for (AbstractC1280A abstractC1280AC2 = yVar.c(); abstractC1280AC2 != null; abstractC1280AC2 = abstractC1280AC2.f14890b) {
            long j7 = abstractC1280AC2.f14889a;
            if (j7 != 0) {
                if (AbstractC1209k.h(j7, j3) >= 0) {
                    i7++;
                } else if (abstractC1280A2 == null) {
                    i7++;
                    abstractC1280A2 = abstractC1280AC2;
                } else {
                    if (AbstractC1209k.h(abstractC1280AC2.f14889a, abstractC1280A2.f14889a) < 0) {
                        abstractC1280A = abstractC1280A2;
                        abstractC1280A2 = abstractC1280AC2;
                    } else {
                        abstractC1280A = abstractC1280AC2;
                    }
                    if (abstractC1280AC == null) {
                        abstractC1280AC = yVar.c();
                        AbstractC1280A abstractC1280A3 = abstractC1280AC;
                        while (true) {
                            if (abstractC1280AC == null) {
                                abstractC1280AC = abstractC1280A3;
                                break;
                            }
                            if (AbstractC1209k.h(abstractC1280AC.f14889a, j3) >= 0) {
                                break;
                            }
                            if (AbstractC1209k.h(abstractC1280A3.f14889a, abstractC1280AC.f14889a) < 0) {
                                abstractC1280A3 = abstractC1280AC;
                            }
                            abstractC1280AC = abstractC1280AC.f14890b;
                        }
                    }
                    abstractC1280A2.f14889a = 0L;
                    abstractC1280A2.a(abstractC1280AC);
                    abstractC1280A2 = abstractC1280A;
                }
            }
        }
        return i7 > 1;
    }

    public static final void r(y yVar) {
        if (q(yVar)) {
            D4.i iVar = f14945g;
            int i7 = iVar.f1582p;
            int iIdentityHashCode = System.identityHashCode(yVar);
            int i8 = -1;
            if (i7 > 0) {
                int i9 = iVar.f1582p - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > i9) {
                        i8 = -(i10 + 1);
                        break;
                    }
                    int i11 = (i10 + i9) >>> 1;
                    int i12 = ((int[]) iVar.f1583q)[i11];
                    if (i12 < iIdentityHashCode) {
                        i10 = i11 + 1;
                    } else if (i12 > iIdentityHashCode) {
                        i9 = i11 - 1;
                    } else {
                        n0.m mVar = ((n0.m[]) iVar.f1584r)[i11];
                        if (yVar == (mVar != null ? mVar.get() : null)) {
                            i8 = i11;
                        } else {
                            for (int i13 = i11 - 1; -1 < i13 && ((int[]) iVar.f1583q)[i13] == iIdentityHashCode; i13--) {
                                n0.m mVar2 = ((n0.m[]) iVar.f1584r)[i13];
                                if ((mVar2 != null ? mVar2.get() : null) == yVar) {
                                    i8 = i13;
                                    break;
                                }
                            }
                            i11++;
                            int i14 = iVar.f1582p;
                            while (true) {
                                if (i11 >= i14) {
                                    i8 = -(iVar.f1582p + 1);
                                    break;
                                } else {
                                    if (((int[]) iVar.f1583q)[i11] != iIdentityHashCode) {
                                        i8 = -(i11 + 1);
                                        break;
                                    }
                                    n0.m mVar3 = ((n0.m[]) iVar.f1584r)[i11];
                                    if ((mVar3 != null ? mVar3.get() : null) == yVar) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            i8 = i11;
                        }
                    }
                }
                if (i8 >= 0) {
                    return;
                }
            }
            int i15 = -(i8 + 1);
            n0.m[] mVarArr = (n0.m[]) iVar.f1584r;
            int length = mVarArr.length;
            if (i7 == length) {
                int i16 = length * 2;
                n0.m[] mVarArr2 = new n0.m[i16];
                int[] iArr = new int[i16];
                int i17 = i15 + 1;
                System.arraycopy(mVarArr, i15, mVarArr2, i17, i7 - i15);
                System.arraycopy((n0.m[]) iVar.f1584r, 0, mVarArr2, 0, i15);
                Z4.l.V(i17, i15, i7, (int[]) iVar.f1583q, iArr);
                Z4.l.Z(0, i15, 6, (int[]) iVar.f1583q, iArr);
                iVar.f1584r = mVarArr2;
                iVar.f1583q = iArr;
            } else {
                int i18 = i15 + 1;
                System.arraycopy(mVarArr, i15, mVarArr, i18, i7 - i15);
                int[] iArr2 = (int[]) iVar.f1583q;
                Z4.l.V(i18, i15, i7, iArr2, iArr2);
            }
            ((n0.m[]) iVar.f1584r)[i15] = new n0.m(yVar);
            ((int[]) iVar.f1583q)[i15] = iIdentityHashCode;
            iVar.f1582p++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AbstractC1280A t(AbstractC1280A abstractC1280A, long j3, j jVar) {
        AbstractC1280A abstractC1280A2 = null;
        while (abstractC1280A != null) {
            long j7 = abstractC1280A.f14889a;
            if (j7 != 0 && AbstractC1209k.h(j7, j3) <= 0 && !jVar.e(j7) && (abstractC1280A2 == null || AbstractC1209k.h(abstractC1280A2.f14889a, abstractC1280A.f14889a) < 0)) {
                abstractC1280A2 = abstractC1280A;
            }
            abstractC1280A = abstractC1280A.f14890b;
        }
        if (abstractC1280A2 != null) {
            return abstractC1280A2;
        }
        return null;
    }

    public static final AbstractC1280A u(AbstractC1280A abstractC1280A, y yVar) {
        AbstractC1280A abstractC1280AT;
        AbstractC1289f abstractC1289fK = k();
        InterfaceC1182c interfaceC1182cE = abstractC1289fK.e();
        if (interfaceC1182cE != null) {
            interfaceC1182cE.b(yVar);
        }
        AbstractC1280A abstractC1280AT2 = t(abstractC1280A, abstractC1289fK.g(), abstractC1289fK.d());
        if (abstractC1280AT2 != null) {
            return abstractC1280AT2;
        }
        synchronized (f14941c) {
            AbstractC1289f abstractC1289fK2 = k();
            AbstractC1280A abstractC1280AC = yVar.c();
            AbstractC1209k.d(abstractC1280AC, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            abstractC1280AT = t(abstractC1280AC, abstractC1289fK2.g(), abstractC1289fK2.d());
            if (abstractC1280AT == null) {
                s();
                throw null;
            }
        }
        return abstractC1280AT;
    }

    public static final void v(int i7) {
        C0137d c0137d = f14944f;
        int i8 = ((int[]) c0137d.f2697t)[i7];
        c0137d.c(i8, c0137d.f2694q - 1);
        c0137d.f2694q--;
        long[] jArr = (long[]) c0137d.f2693p;
        long j3 = jArr[i8];
        int i9 = i8;
        while (i9 > 0) {
            int i10 = ((i9 + 1) >> 1) - 1;
            if (AbstractC1209k.h(jArr[i10], j3) <= 0) {
                break;
            }
            c0137d.c(i10, i9);
            i9 = i10;
        }
        long[] jArr2 = (long[]) c0137d.f2693p;
        int i11 = c0137d.f2694q >> 1;
        while (i8 < i11) {
            int i12 = (i8 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 < c0137d.f2694q && AbstractC1209k.h(jArr2[i12], jArr2[i13]) < 0) {
                if (AbstractC1209k.h(jArr2[i12], jArr2[i8]) >= 0) {
                    break;
                }
                c0137d.c(i12, i8);
                i8 = i12;
            } else {
                if (AbstractC1209k.h(jArr2[i13], jArr2[i8]) >= 0) {
                    break;
                }
                c0137d.c(i13, i8);
                i8 = i13;
            }
        }
        ((int[]) c0137d.f2697t)[i7] = c0137d.f2695r;
        c0137d.f2695r = i7;
    }

    public static final Object w(C1284a c1284a, InterfaceC1182c interfaceC1182c) {
        long j3 = c1284a.f14920b;
        Object objB = interfaceC1182c.b(f14942d.c(j3));
        long j7 = f14943e;
        f14943e = ((long) 1) + j7;
        j jVarC = f14942d.c(j3);
        f14942d = jVarC;
        c1284a.f14920b = j7;
        c1284a.f14919a = jVarC;
        c1284a.f14908g = 0;
        c1284a.h = null;
        c1284a.o();
        f14942d = f14942d.i(j7);
        return objB;
    }

    public static final AbstractC1280A x(AbstractC1280A abstractC1280A, y yVar, AbstractC1289f abstractC1289f) {
        AbstractC1280A abstractC1280AT;
        if (abstractC1289f.f()) {
            abstractC1289f.n(yVar);
        }
        long jG = abstractC1289f.g();
        AbstractC1280A abstractC1280AT2 = t(abstractC1280A, jG, abstractC1289f.d());
        if (abstractC1280AT2 == null) {
            s();
            throw null;
        }
        if (abstractC1280AT2.f14889a == abstractC1289f.g()) {
            return abstractC1280AT2;
        }
        synchronized (f14941c) {
            abstractC1280AT = t(yVar.c(), jG, abstractC1289f.d());
            if (abstractC1280AT == null) {
                s();
                throw null;
            }
            if (abstractC1280AT.f14889a != jG) {
                AbstractC1280A abstractC1280AM = m(abstractC1280AT, yVar);
                abstractC1280AM.a(abstractC1280AT);
                abstractC1280AM.f14889a = abstractC1289f.g();
                abstractC1280AT = abstractC1280AM;
            }
        }
        if (abstractC1280AT2.f14889a != 1) {
            abstractC1289f.n(yVar);
        }
        return abstractC1280AT;
    }
}
