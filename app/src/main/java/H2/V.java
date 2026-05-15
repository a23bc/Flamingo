package H2;

import android.util.SparseArray;
import java.io.EOFException;
import t2.C1484m;
import t2.C1486o;
import t2.C1487p;
import t2.InterfaceC1481j;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class V implements N2.H {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3088B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f3089a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D2.q f3092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D2.n f3093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public N f3094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1487p f3095g;
    public D2.k h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3105s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3109w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1487p f3112z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E2.g f3090b = new E2.g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3096i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f3097j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f3098k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f3100n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f3099m = new int[1000];
    public int[] l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public N2.G[] f3101o = new N2.G[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4.i f3091c = new D4.i(new B2.g(11));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3106t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3107u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3108v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3111y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3110x = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f3087A = true;

    public V(K2.e eVar, D2.q qVar, D2.n nVar) {
        this.f3092d = qVar;
        this.f3093e = nVar;
        this.f3089a = new T(eVar);
    }

    @Override // N2.H
    public final int a(InterfaceC1481j interfaceC1481j, int i7, boolean z6) {
        return b(interfaceC1481j, i7, z6);
    }

    @Override // N2.H
    public final int b(InterfaceC1481j interfaceC1481j, int i7, boolean z6) throws EOFException {
        T t7 = this.f3089a;
        int iB = t7.b(i7);
        S s7 = t7.f3083f;
        K2.a aVar = (K2.a) s7.f3076q;
        int iN = interfaceC1481j.n(aVar.f3986a, ((int) (t7.f3084g - s7.f3074o)) + aVar.f3987b, iB);
        if (iN == -1) {
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = t7.f3084g + ((long) iN);
        t7.f3084g = j3;
        S s8 = t7.f3083f;
        if (j3 == s8.f3075p) {
            t7.f3083f = (S) s8.f3077r;
        }
        return iN;
    }

    @Override // N2.H
    public final void c(int i7, w2.m mVar) {
        d(mVar, i7, 0);
    }

    @Override // N2.H
    public final void d(w2.m mVar, int i7, int i8) {
        while (true) {
            T t7 = this.f3089a;
            if (i7 <= 0) {
                t7.getClass();
                return;
            }
            int iB = t7.b(i7);
            S s7 = t7.f3083f;
            K2.a aVar = (K2.a) s7.f3076q;
            mVar.e(aVar.f3986a, ((int) (t7.f3084g - s7.f3074o)) + aVar.f3987b, iB);
            i7 -= iB;
            long j3 = t7.f3084g + ((long) iB);
            t7.f3084g = j3;
            S s8 = t7.f3083f;
            if (j3 == s8.f3075p) {
                t7.f3083f = (S) s8.f3077r;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0003, B:8:0x0011, B:13:0x0022, B:15:0x003b, B:19:0x0056, B:81:0x010c, B:73:0x00f9, B:76:0x0101, B:18:0x0054), top: B:90:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    @Override // N2.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(t2.C1487p r7) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.V.e(t2.p):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0043, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0125, B:66:0x012e, B:43:0x00c4, B:45:0x00cd, B:47:0x00d6, B:49:0x00eb, B:53:0x00f4, B:54:0x00f9, B:56:0x00ff, B:60:0x010d, B:62:0x0112, B:63:0x0122, B:46:0x00d4), top: B:71:0x0043 }] */
    @Override // N2.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r10, int r12, int r13, int r14, N2.G r15) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.V.f(long, int, int, int, N2.G):void");
    }

    public final long g(int i7) {
        long j3 = this.f3107u;
        long jMax = Long.MIN_VALUE;
        if (i7 != 0) {
            int iK = k(i7 - 1);
            for (int i8 = 0; i8 < i7; i8++) {
                jMax = Math.max(jMax, this.f3100n[iK]);
                if ((this.f3099m[iK] & 1) != 0) {
                    break;
                }
                iK--;
                if (iK == -1) {
                    iK = this.f3096i - 1;
                }
            }
        }
        this.f3107u = Math.max(j3, jMax);
        this.f3102p -= i7;
        int i9 = this.f3103q + i7;
        this.f3103q = i9;
        int i10 = this.f3104r + i7;
        this.f3104r = i10;
        int i11 = this.f3096i;
        if (i10 >= i11) {
            this.f3104r = i10 - i11;
        }
        int i12 = this.f3105s - i7;
        this.f3105s = i12;
        int i13 = 0;
        if (i12 < 0) {
            this.f3105s = 0;
        }
        while (true) {
            D4.i iVar = this.f3091c;
            SparseArray sparseArray = (SparseArray) iVar.f1583q;
            if (i13 >= sparseArray.size() - 1) {
                break;
            }
            int i14 = i13 + 1;
            if (i9 < sparseArray.keyAt(i14)) {
                break;
            }
            ((B2.g) iVar.f1584r).c(sparseArray.valueAt(i13));
            sparseArray.removeAt(i13);
            int i15 = iVar.f1582p;
            if (i15 > 0) {
                iVar.f1582p = i15 - 1;
            }
            i13 = i14;
        }
        if (this.f3102p != 0) {
            return this.f3098k[this.f3104r];
        }
        int i16 = this.f3104r;
        if (i16 == 0) {
            i16 = this.f3096i;
        }
        int i17 = i16 - 1;
        return this.f3098k[i17] + ((long) this.l[i17]);
    }

    public final void h() {
        long jG;
        T t7 = this.f3089a;
        synchronized (this) {
            int i7 = this.f3102p;
            jG = i7 == 0 ? -1L : g(i7);
        }
        t7.a(jG);
    }

    public final int i(int i7, int i8, long j3, boolean z6) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j7 = this.f3100n[i7];
            if (j7 > j3) {
                break;
            }
            if (!z6 || (this.f3099m[i7] & 1) != 0) {
                if (j7 == j3) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.f3096i) {
                i7 = 0;
            }
        }
        return i9;
    }

    public final synchronized long j() {
        return this.f3108v;
    }

    public final int k(int i7) {
        int i8 = this.f3104r + i7;
        int i9 = this.f3096i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    public final synchronized C1487p l() {
        return this.f3111y ? null : this.f3112z;
    }

    public final synchronized boolean m(boolean z6) {
        C1487p c1487p;
        int i7 = this.f3105s;
        boolean z7 = false;
        if (i7 != this.f3102p) {
            if (((U) this.f3091c.k(this.f3103q + i7)).f3085a != this.f3095g) {
                return true;
            }
            return n(k(this.f3105s));
        }
        if (z6 || this.f3109w || ((c1487p = this.f3112z) != null && c1487p != this.f3095g)) {
            z7 = true;
        }
        return z7;
    }

    public final boolean n(int i7) {
        D2.k kVar = this.h;
        if (kVar == null || kVar.d() == 4) {
            return true;
        }
        return (this.f3099m[i7] & 1073741824) == 0 && this.h.a();
    }

    public final void o(C1487p c1487p, V.o oVar) {
        C1487p c1487p2;
        C1487p c1487p3 = this.f3095g;
        boolean z6 = c1487p3 == null;
        C1484m c1484m = c1487p3 == null ? null : c1487p3.f16705q;
        this.f3095g = c1487p;
        C1484m c1484m2 = c1487p.f16705q;
        D2.q qVar = this.f3092d;
        if (qVar != null) {
            int iC = qVar.c(c1487p);
            C1486o c1486oA = c1487p.a();
            c1486oA.f16616I = iC;
            c1487p2 = new C1487p(c1486oA);
        } else {
            c1487p2 = c1487p;
        }
        oVar.f7343q = c1487p2;
        oVar.f7342p = this.h;
        if (qVar == null) {
            return;
        }
        if (z6 || !w2.t.a(c1484m, c1484m2)) {
            D2.k kVar = this.h;
            D2.n nVar = this.f3093e;
            D2.k kVarM = qVar.m(nVar, c1487p);
            this.h = kVarM;
            oVar.f7342p = kVarM;
            if (kVar != null) {
                kVar.c(nVar);
            }
        }
    }

    public final void p(boolean z6) {
        SparseArray sparseArray;
        T t7 = this.f3089a;
        S s7 = t7.f3081d;
        if (((K2.a) s7.f3076q) != null) {
            K2.e eVar = t7.f3078a;
            synchronized (eVar) {
                S s8 = s7;
                while (s8 != null) {
                    try {
                        K2.a[] aVarArr = eVar.f4000f;
                        int i7 = eVar.f3999e;
                        eVar.f3999e = i7 + 1;
                        K2.a aVar = (K2.a) s8.f3076q;
                        aVar.getClass();
                        aVarArr[i7] = aVar;
                        eVar.f3998d--;
                        s8 = (S) s8.f3077r;
                        if (s8 == null || ((K2.a) s8.f3076q) == null) {
                            s8 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                eVar.notifyAll();
            }
            s7.f3076q = null;
            s7.f3077r = null;
        }
        S s9 = t7.f3081d;
        int i8 = t7.f3079b;
        int i9 = 0;
        AbstractC1697a.i(((K2.a) s9.f3076q) == null);
        s9.f3074o = 0L;
        s9.f3075p = i8;
        S s10 = t7.f3081d;
        t7.f3082e = s10;
        t7.f3083f = s10;
        t7.f3084g = 0L;
        t7.f3078a.b();
        this.f3102p = 0;
        this.f3103q = 0;
        this.f3104r = 0;
        this.f3105s = 0;
        this.f3110x = true;
        this.f3106t = Long.MIN_VALUE;
        this.f3107u = Long.MIN_VALUE;
        this.f3108v = Long.MIN_VALUE;
        this.f3109w = false;
        D4.i iVar = this.f3091c;
        while (true) {
            sparseArray = (SparseArray) iVar.f1583q;
            if (i9 >= sparseArray.size()) {
                break;
            }
            ((B2.g) iVar.f1584r).c(sparseArray.valueAt(i9));
            i9++;
        }
        iVar.f1582p = -1;
        sparseArray.clear();
        if (z6) {
            this.f3112z = null;
            this.f3111y = true;
            this.f3087A = true;
        }
    }

    public final synchronized void q() {
        this.f3105s = 0;
        T t7 = this.f3089a;
        t7.f3082e = t7.f3081d;
    }

    public final synchronized boolean r(long j3, boolean z6) {
        Throwable th;
        V v3;
        long j7;
        int i7;
        try {
            try {
                q();
                int iK = k(this.f3105s);
                int i8 = this.f3105s;
                int i9 = this.f3102p;
                if (!(i8 != i9) || j3 < this.f3100n[iK] || (j3 > this.f3108v && !z6)) {
                    return false;
                }
                if (this.f3087A) {
                    int i10 = i9 - i8;
                    int i11 = 0;
                    while (true) {
                        if (i11 < i10) {
                            try {
                                if (this.f3100n[iK] >= j3) {
                                    i10 = i11;
                                    break;
                                }
                                iK++;
                                if (iK == this.f3096i) {
                                    iK = 0;
                                }
                                i11++;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else if (!z6) {
                            i10 = -1;
                        }
                    }
                    j7 = j3;
                    i7 = i10;
                    v3 = this;
                } else {
                    int i12 = i9 - i8;
                    v3 = this;
                    j7 = j3;
                    i7 = v3.i(iK, i12, j7, true);
                }
                if (i7 == -1) {
                    return false;
                }
                v3.f3106t = j7;
                v3.f3105s += i7;
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void s(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f3105s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f3102p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            w2.AbstractC1697a.d(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f3105s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f3105s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.V.s(int):void");
    }
}
