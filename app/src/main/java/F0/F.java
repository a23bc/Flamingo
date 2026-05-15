package f0;

import m5.AbstractC1209k;
import p0.AbstractC1280A;
import p0.AbstractC1289f;
import t.C1443E;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC1280A {
    public static final Object h = new Object();

    /* JADX INFO: renamed from: c */
    public long f11652c;

    /* JADX INFO: renamed from: d */
    public int f11653d;

    /* JADX INFO: renamed from: e */
    public C1443E f11654e;

    /* JADX INFO: renamed from: f */
    public Object f11655f;

    /* JADX INFO: renamed from: g */
    public int f11656g;

    public F(long j3) {
        super(j3);
        C1443E c1443e = t.N.f16028a;
        AbstractC1209k.d(c1443e, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f11654e = c1443e;
        this.f11655f = h;
    }

    @Override // p0.AbstractC1280A
    public final void a(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        F f7 = (F) abstractC1280A;
        this.f11654e = f7.f11654e;
        this.f11655f = f7.f11655f;
        this.f11656g = f7.f11656g;
    }

    @Override // p0.AbstractC1280A
    public final AbstractC1280A b(long j3) {
        return new F(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(f0.G r7, p0.AbstractC1289f r8) {
        /*
            r6 = this;
            java.lang.Object r0 = p0.l.f14941c
            monitor-enter(r0)
            long r1 = r6.f11652c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f11653d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f11655f
            java.lang.Object r5 = f0.F.h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f11656g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.f11652c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.f11653d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.F.c(f0.G, p0.f):boolean");
    }

    public final int d(G g6, AbstractC1289f abstractC1289f) throws Throwable {
        C1443E c1443e;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        AbstractC1280A abstractC1280AJ;
        synchronized (p0.l.f14941c) {
            c1443e = this.f11654e;
        }
        int i12 = 1;
        int i13 = 7;
        if (!(c1443e.f15981e != 0)) {
            return 7;
        }
        h0.e eVarM = C0879c.m();
        Object[] objArr = eVarM.f12546o;
        int i14 = eVarM.f12548q;
        for (int i15 = 0; i15 < i14; i15++) {
            ((C0910s) objArr[i15]).b();
        }
        try {
            Object[] objArr2 = c1443e.f15978b;
            int[] iArr = c1443e.f15979c;
            long[] jArr = c1443e.f15977a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i9 = 7;
                int i16 = 0;
                while (true) {
                    long j3 = jArr[i16];
                    if ((((~j3) << i13) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        i10 = i13;
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j3 & 255) < 128) {
                                int i20 = (i16 << 3) + i19;
                                i11 = i17;
                                p0.y yVar = (p0.y) objArr2[i20];
                                if (iArr[i20] == i12) {
                                    if (yVar instanceof G) {
                                        G g7 = (G) yVar;
                                        i7 = 0;
                                        try {
                                            abstractC1280AJ = g7.h((F) p0.l.j(g7.f11663r, abstractC1289f), abstractC1289f, false, g7.f11661p);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = eVarM.f12546o;
                                            int i21 = eVarM.f12548q;
                                            for (int i22 = i7; i22 < i21; i22++) {
                                                ((C0910s) objArr3[i22]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i7 = 0;
                                        abstractC1280AJ = p0.l.j(yVar.c(), abstractC1289f);
                                    }
                                    int iIdentityHashCode = ((i9 * 31) + System.identityHashCode(abstractC1280AJ)) * 31;
                                    long j7 = abstractC1280AJ.f14889a;
                                    i9 = iIdentityHashCode + ((int) (j7 ^ (j7 >>> 32)));
                                    j3 >>= i11;
                                    i19++;
                                    i17 = i11;
                                    i12 = 1;
                                }
                            } else {
                                i11 = i17;
                            }
                            j3 >>= i11;
                            i19++;
                            i17 = i11;
                            i12 = 1;
                        }
                        i8 = 0;
                        if (i18 != i17) {
                            break;
                        }
                    } else {
                        i10 = i13;
                        i8 = 0;
                    }
                    if (i16 == length) {
                        i13 = i9;
                        break;
                    }
                    i16++;
                    i13 = i10;
                    i12 = 1;
                }
            } else {
                i8 = 0;
            }
            i9 = i13;
            Object[] objArr4 = eVarM.f12546o;
            int i23 = eVarM.f12548q;
            for (int i24 = i8; i24 < i23; i24++) {
                ((C0910s) objArr4[i24]).a();
            }
            return i9;
        } catch (Throwable th2) {
            th = th2;
            i7 = 0;
        }
    }
}
