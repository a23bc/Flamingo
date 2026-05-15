package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractC1397o implements Q0.A {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f1390C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f1391D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f1392E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f1393F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f1394G;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long B0(O0.InterfaceC0327y r7) {
        /*
            r6 = this;
            float r0 = r6.f1392E
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f1392E
            int r0 = r7.L(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f1393F
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f1393F
            int r3 = r7.L(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f1390C
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f1390C
            int r4 = r7.L(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f1391D
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f1391D
            int r7 = r7.L(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = n1.b.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D.t0.B0(O0.y):long");
    }

    @Override // Q0.A
    public final int c(Q0.T t7, O0.Y y6, int i7) {
        long jB0 = B0(t7);
        if (n1.a.e(jB0)) {
            return n1.a.g(jB0);
        }
        if (!this.f1394G) {
            i7 = n1.b.g(jB0, i7);
        }
        return n1.b.f(jB0, y6.e(i7));
    }

    @Override // Q0.A
    public final int d(Q0.T t7, O0.Y y6, int i7) {
        long jB0 = B0(t7);
        if (n1.a.f(jB0)) {
            return n1.a.h(jB0);
        }
        if (!this.f1394G) {
            i7 = n1.b.f(jB0, i7);
        }
        return n1.b.g(jB0, y6.M(i7));
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        int iJ;
        int iH;
        int i7;
        int iG;
        long jA;
        long jB0 = B0(interfaceC0298b0);
        if (this.f1394G) {
            jA = n1.b.e(j3, jB0);
        } else {
            if (Float.isNaN(this.f1390C)) {
                iJ = n1.a.j(j3);
                int iH2 = n1.a.h(jB0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = n1.a.j(jB0);
            }
            if (Float.isNaN(this.f1392E)) {
                iH = n1.a.h(j3);
                int iJ2 = n1.a.j(jB0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = n1.a.h(jB0);
            }
            if (Float.isNaN(this.f1391D)) {
                i7 = n1.a.i(j3);
                int iG2 = n1.a.g(jB0);
                if (i7 > iG2) {
                    i7 = iG2;
                }
            } else {
                i7 = n1.a.i(jB0);
            }
            if (Float.isNaN(this.f1393F)) {
                iG = n1.a.g(j3);
                int i8 = n1.a.i(jB0);
                if (iG < i8) {
                    iG = i8;
                }
            } else {
                iG = n1.a.g(jB0);
            }
            jA = n1.b.a(iJ, iH, i7, iG);
        }
        O0.m0 m0VarD = y6.d(jA);
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new C0069j(m0VarD, 3));
    }

    @Override // Q0.A
    public final int g(Q0.T t7, O0.Y y6, int i7) {
        long jB0 = B0(t7);
        if (n1.a.e(jB0)) {
            return n1.a.g(jB0);
        }
        if (!this.f1394G) {
            i7 = n1.b.g(jB0, i7);
        }
        return n1.b.f(jB0, y6.Q(i7));
    }

    @Override // Q0.A
    public final int h(Q0.T t7, O0.Y y6, int i7) {
        long jB0 = B0(t7);
        if (n1.a.f(jB0)) {
            return n1.a.h(jB0);
        }
        if (!this.f1394G) {
            i7 = n1.b.f(jB0, i7);
        }
        return n1.b.g(jB0, y6.P(i7));
    }
}
