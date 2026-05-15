package z5;

import A5.AbstractC0026b;
import A5.AbstractC0027c;
import A5.AbstractC0028d;
import d5.EnumC0830a;
import java.util.Arrays;
import m5.AbstractC1209k;
import w5.C1787h;
import w5.C1793k;

/* JADX INFO: loaded from: classes.dex */
public class y extends AbstractC0026b implements r, InterfaceC2110e, A5.r {

    /* JADX INFO: renamed from: s */
    public final int f21336s;

    /* JADX INFO: renamed from: t */
    public final int f21337t;

    /* JADX INFO: renamed from: u */
    public final y5.a f21338u;

    /* JADX INFO: renamed from: v */
    public Object[] f21339v;

    /* JADX INFO: renamed from: w */
    public long f21340w;

    /* JADX INFO: renamed from: x */
    public long f21341x;

    /* JADX INFO: renamed from: y */
    public int f21342y;

    /* JADX INFO: renamed from: z */
    public int f21343z;

    public y(int i7, int i8, y5.a aVar) {
        this.f21336s = i7;
        this.f21337t = i8;
        this.f21338u = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:61|63|(2:65|(1:67)(1:68))(0)|69|113|(2:71|(1:(1:(7:75|76|77|92|119|(4:93|(9:118|(2:102|103)|104|(1:121)|77|92|119|93|(0)(1:95))(0)|109|110)|106)(2:80|81))(5:82|83|119|(4:93|(0)(0)|109|110)|106))(4:85|115|86|87))(1:90)|111|91|92|119|(4:93|(0)(0)|109|110)|106) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00b1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00b2, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:76:0x0031, B:93:0x0079, B:95:0x0081, B:99:0x0094, B:102:0x009b, B:103:0x009f, B:104:0x00a0, B:83:0x004b), top: B:113:0x0020 }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [z5.f] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [A5.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [z5.y] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [z5.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [A5.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [z5.A] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [z5.A] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x00ae -> B:77:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(z5.y r8, z5.InterfaceC2111f r9, c5.d r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof z5.x
            if (r0 == 0) goto L13
            r0 = r10
            z5.x r0 = (z5.x) r0
            int r1 = r0.f21335u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21335u = r1
            goto L18
        L13:
            z5.x r0 = new z5.x
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f21333s
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f21335u
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            w5.g0 r8 = r0.f21332r
            z5.A r9 = r0.f21331q
            z5.f r2 = r0.f21330p
            z5.y r5 = r0.f21329o
            android.support.v4.media.session.b.K(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            w5.g0 r8 = r0.f21332r
            z5.A r9 = r0.f21331q
            z5.f r2 = r0.f21330p
            z5.y r5 = r0.f21329o
            android.support.v4.media.session.b.K(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            z5.A r9 = r0.f21331q
            z5.f r8 = r0.f21330p
            z5.y r2 = r0.f21329o
            android.support.v4.media.session.b.K(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            android.support.v4.media.session.b.K(r10)
            A5.d r10 = r8.c()
            z5.A r10 = (z5.C2103A) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            c5.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            w5.y r5 = w5.C1806y.f19581p     // Catch: java.lang.Throwable -> Lb1
            c5.g r2 = r2.n(r5)     // Catch: java.lang.Throwable -> Lb1
            w5.g0 r2 = (w5.InterfaceC1786g0) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.t(r9)     // Catch: java.lang.Throwable -> L38
            B5.u r6 = z5.z.f21344a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f21329o = r5     // Catch: java.lang.Throwable -> L38
            r0.f21330p = r2     // Catch: java.lang.Throwable -> L38
            r0.f21331q = r9     // Catch: java.lang.Throwable -> L38
            r0.f21332r = r8     // Catch: java.lang.Throwable -> L38
            r0.f21335u = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.i(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.q()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f21329o = r5     // Catch: java.lang.Throwable -> L38
            r0.f21330p = r2     // Catch: java.lang.Throwable -> L38
            r0.f21331q = r9     // Catch: java.lang.Throwable -> L38
            r0.f21332r = r8     // Catch: java.lang.Throwable -> L38
            r0.f21335u = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.f(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.y.k(z5.y, z5.f, c5.d):void");
    }

    @Override // A5.r
    public final InterfaceC2110e a(c5.i iVar, int i7, y5.a aVar) {
        return z.i(this, iVar, i7, aVar);
    }

    @Override // z5.InterfaceC2110e
    public final Object b(InterfaceC2111f interfaceC2111f, c5.d dVar) throws Throwable {
        k(this, interfaceC2111f, dVar);
        return EnumC0830a.f11264o;
    }

    @Override // A5.AbstractC0026b
    public final AbstractC0028d d() {
        C2103A c2103a = new C2103A();
        c2103a.f21246a = -1L;
        return c2103a;
    }

    @Override // A5.AbstractC0026b
    public final AbstractC0028d[] e() {
        return new C2103A[2];
    }

    @Override // z5.InterfaceC2111f
    public final Object f(Object obj, c5.d dVar) throws Throwable {
        Throwable th;
        c5.d[] dVarArrN;
        w wVar;
        if (q(obj)) {
            return Y4.o.f8736a;
        }
        C1793k c1793k = new C1793k(1, I0.c.D(dVar));
        c1793k.r();
        c5.d[] dVarArrN2 = AbstractC0027c.f537a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        c1793k.resumeWith(Y4.o.f8736a);
                        dVarArrN = n(dVarArrN2);
                        wVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        w wVar2 = new w(this, o() + ((long) (this.f21342y + this.f21343z)), obj, c1793k);
                        m(wVar2);
                        this.f21343z++;
                        if (this.f21337t == 0) {
                            dVarArrN2 = n(dVarArrN2);
                        }
                        dVarArrN = dVarArrN2;
                        wVar = wVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (wVar != null) {
                    c1793k.u(new C1787h(1, wVar));
                }
                for (c5.d dVar2 : dVarArrN) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(Y4.o.f8736a);
                    }
                }
                Object objQ = c1793k.q();
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                if (objQ != enumC0830a) {
                    objQ = Y4.o.f8736a;
                }
                return objQ == enumC0830a ? objQ : Y4.o.f8736a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object i(C2103A c2103a, x xVar) {
        C1793k c1793k = new C1793k(1, I0.c.D(xVar));
        c1793k.r();
        synchronized (this) {
            if (s(c2103a) < 0) {
                c2103a.f21247b = c1793k;
            } else {
                c1793k.resumeWith(Y4.o.f8736a);
            }
        }
        Object objQ = c1793k.q();
        return objQ == EnumC0830a.f11264o ? objQ : Y4.o.f8736a;
    }

    public final void j() {
        if (this.f21337t != 0 || this.f21343z > 1) {
            Object[] objArr = this.f21339v;
            AbstractC1209k.c(objArr);
            while (this.f21343z > 0) {
                long jO = o();
                int i7 = this.f21342y;
                int i8 = this.f21343z;
                if (objArr[((int) ((jO + ((long) (i7 + i8))) - 1)) & (objArr.length - 1)] != z.f21344a) {
                    return;
                }
                this.f21343z = i8 - 1;
                z.c(objArr, o() + ((long) (this.f21342y + this.f21343z)), null);
            }
        }
    }

    public final void l() {
        AbstractC0028d[] abstractC0028dArr;
        Object[] objArr = this.f21339v;
        AbstractC1209k.c(objArr);
        z.c(objArr, o(), null);
        this.f21342y--;
        long jO = o() + 1;
        if (this.f21340w < jO) {
            this.f21340w = jO;
        }
        if (this.f21341x < jO) {
            if (this.f534p != 0 && (abstractC0028dArr = this.f533o) != null) {
                for (AbstractC0028d abstractC0028d : abstractC0028dArr) {
                    if (abstractC0028d != null) {
                        C2103A c2103a = (C2103A) abstractC0028d;
                        long j3 = c2103a.f21246a;
                        if (j3 >= 0 && j3 < jO) {
                            c2103a.f21246a = jO;
                        }
                    }
                }
            }
            this.f21341x = jO;
        }
    }

    public final void m(Object obj) {
        int i7 = this.f21342y + this.f21343z;
        Object[] objArrP = this.f21339v;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i7 >= objArrP.length) {
            objArrP = p(objArrP, i7, objArrP.length * 2);
        }
        z.c(objArrP, o() + ((long) i7), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [c5.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final c5.d[] n(c5.d[] dVarArr) {
        AbstractC0028d[] abstractC0028dArr;
        C2103A c2103a;
        C1793k c1793k;
        int length = dVarArr.length;
        if (this.f534p != 0 && (abstractC0028dArr = this.f533o) != null) {
            int length2 = abstractC0028dArr.length;
            int i7 = 0;
            dVarArr = dVarArr;
            while (i7 < length2) {
                AbstractC0028d abstractC0028d = abstractC0028dArr[i7];
                if (abstractC0028d != null && (c1793k = (c2103a = (C2103A) abstractC0028d).f21247b) != null && s(c2103a) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
                        dVarArr = objArrCopyOf;
                    }
                    ((c5.d[]) dVarArr)[length] = c1793k;
                    c2103a.f21247b = null;
                    length++;
                }
                i7++;
                dVarArr = dVarArr;
            }
        }
        return (c5.d[]) dVarArr;
    }

    public final long o() {
        return Math.min(this.f21341x, this.f21340w);
    }

    public final Object[] p(Object[] objArr, int i7, int i8) {
        if (i8 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i8];
        this.f21339v = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i9 = 0; i9 < i7; i9++) {
                long j3 = ((long) i9) + jO;
                z.c(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i7;
        boolean z6;
        c5.d[] dVarArrN = AbstractC0027c.f537a;
        synchronized (this) {
            if (r(obj)) {
                dVarArrN = n(dVarArrN);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (c5.d dVar : dVarArrN) {
            if (dVar != null) {
                dVar.resumeWith(Y4.o.f8736a);
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f534p
            int r2 = r12.f21336s
            r9 = 1
            if (r1 != 0) goto L22
            if (r2 != 0) goto La
            goto L76
        La:
            r12.m(r13)
            int r1 = r12.f21342y
            int r1 = r1 + r9
            r12.f21342y = r1
            if (r1 <= r2) goto L17
            r12.l()
        L17:
            long r1 = r12.o()
            int r3 = r12.f21342y
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f21341x = r1
            return r9
        L22:
            int r1 = r12.f21342y
            int r3 = r12.f21337t
            if (r1 < r3) goto L3e
            long r4 = r12.f21341x
            long r6 = r12.f21340w
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L3e
            y5.a r1 = r12.f21338u
            int r1 = r1.ordinal()
            if (r1 == 0) goto L3c
            r4 = 2
            if (r1 == r4) goto L76
            goto L3e
        L3c:
            r1 = 0
            return r1
        L3e:
            r12.m(r13)
            int r1 = r12.f21342y
            int r1 = r1 + r9
            r12.f21342y = r1
            if (r1 <= r3) goto L4b
            r12.l()
        L4b:
            long r3 = r12.o()
            int r1 = r12.f21342y
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f21340w
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L76
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f21341x
            long r5 = r12.o()
            int r7 = r12.f21342y
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.f21342y
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f21343z
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.y.r(java.lang.Object):boolean");
    }

    public final long s(C2103A c2103a) {
        long j3 = c2103a.f21246a;
        if (j3 < o() + ((long) this.f21342y)) {
            return j3;
        }
        if (this.f21337t <= 0 && j3 <= o() && this.f21343z != 0) {
            return j3;
        }
        return -1L;
    }

    public final Object t(C2103A c2103a) {
        Object obj;
        c5.d[] dVarArrV = AbstractC0027c.f537a;
        synchronized (this) {
            try {
                long jS = s(c2103a);
                if (jS < 0) {
                    obj = z.f21344a;
                } else {
                    long j3 = c2103a.f21246a;
                    Object[] objArr = this.f21339v;
                    AbstractC1209k.c(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof w) {
                        obj2 = ((w) obj2).f21327q;
                    }
                    c2103a.f21246a = jS + 1;
                    Object obj3 = obj2;
                    dVarArrV = v(j3);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c5.d dVar : dVarArrV) {
            if (dVar != null) {
                dVar.resumeWith(Y4.o.f8736a);
            }
        }
        return obj;
    }

    public final void u(long j3, long j7, long j8, long j9) {
        long jMin = Math.min(j7, j3);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.f21339v;
            AbstractC1209k.c(objArr);
            z.c(objArr, jO, null);
        }
        this.f21340w = j3;
        this.f21341x = j7;
        this.f21342y = (int) (j8 - jMin);
        this.f21343z = (int) (j9 - j8);
    }

    public final c5.d[] v(long j3) {
        long j7;
        long j8;
        long j9;
        int i7;
        c5.d[] dVarArr;
        AbstractC0028d[] abstractC0028dArr;
        long j10 = this.f21341x;
        c5.d[] dVarArr2 = AbstractC0027c.f537a;
        if (j3 <= j10) {
            long jO = o();
            long j11 = ((long) this.f21342y) + jO;
            int i8 = this.f21337t;
            if (i8 == 0 && this.f21343z > 0) {
                j11++;
            }
            int i9 = 0;
            if (this.f534p != 0 && (abstractC0028dArr = this.f533o) != null) {
                for (AbstractC0028d abstractC0028d : abstractC0028dArr) {
                    if (abstractC0028d != null) {
                        long j12 = ((C2103A) abstractC0028d).f21246a;
                        if (j12 >= 0 && j12 < j11) {
                            j11 = j12;
                        }
                    }
                }
            }
            if (j11 > this.f21341x) {
                long jO2 = o() + ((long) this.f21342y);
                int iMin = this.f534p > 0 ? Math.min(this.f21343z, i8 - ((int) (jO2 - j11))) : this.f21343z;
                long j13 = ((long) this.f21343z) + jO2;
                B5.u uVar = z.f21344a;
                if (iMin > 0) {
                    c5.d[] dVarArr3 = new c5.d[iMin];
                    j9 = 1;
                    Object[] objArr = this.f21339v;
                    AbstractC1209k.c(objArr);
                    i7 = i8;
                    long j14 = jO2;
                    while (true) {
                        if (jO2 >= j13) {
                            j7 = jO;
                            j8 = j11;
                            break;
                        }
                        j7 = jO;
                        Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != uVar) {
                            AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            w wVar = (w) obj;
                            int i10 = i9 + 1;
                            j8 = j11;
                            dVarArr3[i9] = wVar.f21328r;
                            z.c(objArr, jO2, uVar);
                            z.c(objArr, j14, wVar.f21327q);
                            j14++;
                            if (i10 >= iMin) {
                                break;
                            }
                            i9 = i10;
                        } else {
                            j8 = j11;
                        }
                        jO2++;
                        jO = j7;
                        j11 = j8;
                    }
                    jO2 = j14;
                    dVarArr = dVarArr3;
                } else {
                    j7 = jO;
                    j8 = j11;
                    j9 = 1;
                    i7 = i8;
                    dVarArr = dVarArr2;
                }
                int i11 = (int) (jO2 - j7);
                long j15 = this.f534p == 0 ? jO2 : j8;
                long jMax = Math.max(this.f21340w, jO2 - ((long) Math.min(this.f21336s, i11)));
                if (i7 == 0 && jMax < j13) {
                    Object[] objArr2 = this.f21339v;
                    AbstractC1209k.c(objArr2);
                    if (AbstractC1209k.a(objArr2[((int) jMax) & (objArr2.length - 1)], uVar)) {
                        jO2 += j9;
                        jMax += j9;
                    }
                }
                u(jMax, j15, jO2, j13);
                j();
                return dVarArr.length == 0 ? dVarArr : n(dVarArr);
            }
        }
        return dVarArr2;
    }
}
