package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: D.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0070k extends AbstractC1397o implements Q0.A {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f1343C;

    public final long B0(long j3, boolean z6) {
        int iRound;
        int iG = n1.a.g(j3);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f1343C)) <= 0) {
            return 0L;
        }
        if (!z6 || androidx.compose.foundation.layout.a.d(iRound, iG, j3)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long C0(long j3, boolean z6) {
        int iRound;
        int iH = n1.a.h(j3);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f1343C)) <= 0) {
            return 0L;
        }
        if (!z6 || androidx.compose.foundation.layout.a.d(iH, iRound, j3)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long D0(long j3, boolean z6) {
        int i7 = n1.a.i(j3);
        int iRound = Math.round(i7 * this.f1343C);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z6 || androidx.compose.foundation.layout.a.d(iRound, i7, j3)) {
            return (((long) iRound) << 32) | (((long) i7) & 4294967295L);
        }
        return 0L;
    }

    public final long E0(long j3, boolean z6) {
        int iJ = n1.a.j(j3);
        int iRound = Math.round(iJ / this.f1343C);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z6 || androidx.compose.foundation.layout.a.d(iJ, iRound, j3)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // Q0.A
    public final int c(Q0.T t7, O0.Y y6, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 / this.f1343C) : y6.e(i7);
    }

    @Override // Q0.A
    public final int d(Q0.T t7, O0.Y y6, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 * this.f1343C) : y6.M(i7);
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        long jC0 = C0(j3, true);
        if (n1.m.b(jC0, 0L)) {
            jC0 = B0(j3, true);
            if (n1.m.b(jC0, 0L)) {
                jC0 = E0(j3, true);
                if (n1.m.b(jC0, 0L)) {
                    jC0 = D0(j3, true);
                    if (n1.m.b(jC0, 0L)) {
                        jC0 = C0(j3, false);
                        if (n1.m.b(jC0, 0L)) {
                            jC0 = B0(j3, false);
                            if (n1.m.b(jC0, 0L)) {
                                jC0 = E0(j3, false);
                                if (n1.m.b(jC0, 0L)) {
                                    jC0 = D0(j3, false);
                                    if (n1.m.b(jC0, 0L)) {
                                        jC0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!n1.m.b(jC0, 0L)) {
            int i7 = (int) (jC0 >> 32);
            int i8 = (int) (jC0 & 4294967295L);
            if (!((i8 >= 0) & (i7 >= 0))) {
                n1.j.a("width and height must be >= 0");
            }
            j3 = n1.b.h(i7, i7, i8, i8);
        }
        O0.m0 m0VarD = y6.d(j3);
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new C0069j(m0VarD, 0));
    }

    @Override // Q0.A
    public final int g(Q0.T t7, O0.Y y6, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 / this.f1343C) : y6.Q(i7);
    }

    @Override // Q0.A
    public final int h(Q0.T t7, O0.Y y6, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 * this.f1343C) : y6.P(i7);
    }
}
