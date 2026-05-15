package androidx.compose.foundation.lazy.layout;

import B0.d;
import D4.i;
import H.B;
import H.C;
import H.C0178u;
import H.C0183z;
import H.O;
import Q0.AbstractC0344d0;
import java.util.ArrayList;
import m5.AbstractC1209k;
import n1.k;
import r0.AbstractC1397o;
import r0.InterfaceC1398p;
import t.J;
import t.K;
import t.Q;
import t.S;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public final J f9216a;

    /* JADX INFO: renamed from: b */
    public i f9217b;

    /* JADX INFO: renamed from: c */
    public int f9218c;

    /* JADX INFO: renamed from: d */
    public final K f9219d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f9220e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f9221f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f9222g;
    public final ArrayList h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f9223i;

    /* JADX INFO: renamed from: j */
    public B f9224j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1398p f9225k;

    public b() {
        long[] jArr = Q.f16032a;
        this.f9216a = new J();
        K k7 = S.f16033a;
        this.f9219d = new K();
        this.f9220e = new ArrayList();
        this.f9221f = new ArrayList();
        this.f9222g = new ArrayList();
        this.h = new ArrayList();
        this.f9223i = new ArrayList();
        this.f9225k = new AbstractC0344d0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f9210a;

            {
                this.f9210a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && AbstractC1209k.a(this.f9210a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f9210a);
            }

            public final int hashCode() {
                return this.f9210a.hashCode();
            }

            @Override // Q0.AbstractC0344d0
            public final AbstractC1397o k() {
                B b7 = new B();
                b7.f2772C = this.f9210a;
                return b7;
            }

            @Override // Q0.AbstractC0344d0
            public final void m(AbstractC1397o abstractC1397o) {
                B b7 = (B) abstractC1397o;
                b bVar = b7.f2772C;
                b bVar2 = this.f9210a;
                if (AbstractC1209k.a(bVar, bVar2) || !b7.f15637o.f15636B) {
                    return;
                }
                b bVar3 = b7.f2772C;
                bVar3.e();
                bVar3.f9217b = null;
                bVar3.f9218c = -1;
                bVar2.f9224j = b7;
                b7.f2772C = bVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f9210a + ')';
            }
        };
    }

    public static void c(O o7, int i7, C c7) {
        int i8 = 0;
        long jF = o7.f(0);
        long jA = o7.c() ? k.a(0, i7, 1, jF) : k.a(i7, 0, 2, jF);
        C0183z[] c0183zArr = c7.f2773a;
        int length = c0183zArr.length;
        int i9 = 0;
        while (i8 < length) {
            C0183z c0183z = c0183zArr[i8];
            int i10 = i9 + 1;
            if (c0183z != null) {
                c0183z.f2948j = k.d(jA, k.c(o7.f(i9), jF));
            }
            i8++;
            i9 = i10;
        }
    }

    public static int h(int[] iArr, O o7) {
        int i7 = o7.i();
        int iG = o7.g() + i7;
        int iMax = 0;
        while (i7 < iG) {
            int iE = o7.e() + iArr[i7];
            iArr[i7] = iE;
            iMax = Math.max(iMax, iE);
            i7++;
        }
        return iMax;
    }

    public final C0183z a(int i7, Object obj) {
        C c7 = (C) this.f9216a.g(obj);
        if (c7 != null) {
            return c7.f2773a[i7];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.f9223i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C0183z c0183z = (C0183z) arrayList.get(i7);
            d dVar = c0183z.l;
            if (dVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (c0183z.f2948j >> 32)) + ((int) (dVar.f633u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (c0183z.f2948j & 4294967295L)) + ((int) (dVar.f633u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:333:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r50, int r51, int r52, java.util.ArrayList r53, D4.i r54, H.P r55, boolean r56, int r57, boolean r58, int r59, int r60, w5.InterfaceC1765B r61, y0.y r62) {
        /*
            Method dump skipped, instruction units count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.d(int, int, int, java.util.ArrayList, D4.i, H.P, boolean, int, boolean, int, int, w5.B, y0.y):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r15 = this;
            t.J r0 = r15.f9216a
            boolean r1 = r0.j()
            if (r1 == 0) goto L5d
            java.lang.Object[] r1 = r0.f16005c
            long[] r2 = r0.f16003a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L13:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            H.C r11 = (H.C) r11
            H.z[] r11 = r11.f2773a
            int r12 = r11.length
            r13 = r4
        L43:
            if (r13 >= r12) goto L4f
            r14 = r11[r13]
            if (r14 == 0) goto L4c
            r14.c()
        L4c:
            int r13 = r13 + 1
            goto L43
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L13
        L5a:
            r0.a()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.e():void");
    }

    public final void f(Object obj) {
        C0183z[] c0183zArr;
        C c7 = (C) this.f9216a.k(obj);
        if (c7 == null || (c0183zArr = c7.f2773a) == null) {
            return;
        }
        for (C0183z c0183z : c0183zArr) {
            if (c0183z != null) {
                c0183z.c();
            }
        }
    }

    public final void g(O o7, boolean z6) {
        Object objG = this.f9216a.g(o7.getKey());
        AbstractC1209k.c(objG);
        C0183z[] c0183zArr = ((C) objG).f2773a;
        int length = c0183zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            C0183z c0183z = c0183zArr[i7];
            int i9 = i8 + 1;
            if (c0183z != null) {
                long jF = o7.f(i8);
                long j3 = c0183z.f2948j;
                if (!k.b(j3, C0183z.f2938q) && !k.b(j3, jF)) {
                    long jC = k.c(jF, j3);
                    w.S s7 = c0183z.f2943d;
                    if (s7 != null) {
                        long jC2 = k.c(((k) c0183z.f2952o.getValue()).f14514a, jC);
                        c0183z.e(jC2);
                        c0183z.d(true);
                        c0183z.f2944e = z6;
                        AbstractC1767D.t(c0183z.f2940a, null, new C0178u(c0183z, s7, jC2, null), 3);
                    }
                }
                c0183z.f2948j = jF;
            }
            i7++;
            i8 = i9;
        }
    }
}
