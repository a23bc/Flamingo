package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC1397o implements Q0.A {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public D f1226C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f1227D;

    @Override // Q0.A
    public final /* synthetic */ int c(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.d(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int d(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.m(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!n1.a.d(j3) || this.f1226C == D.f1213o) {
            iJ = n1.a.j(j3);
            iH = n1.a.h(j3);
        } else {
            int iRound = Math.round(n1.a.h(j3) * this.f1227D);
            int iJ2 = n1.a.j(j3);
            iJ = n1.a.h(j3);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!n1.a.c(j3) || this.f1226C == D.f1214p) {
            int i7 = n1.a.i(j3);
            iG = n1.a.g(j3);
            iG2 = i7;
        } else {
            int iRound2 = Math.round(n1.a.g(j3) * this.f1227D);
            int i8 = n1.a.i(j3);
            iG2 = n1.a.g(j3);
            if (iRound2 < i8) {
                iRound2 = i8;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        O0.m0 m0VarD = y6.d(n1.b.a(iJ, iH, iG2, iG));
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new C0069j(m0VarD, 1));
    }

    @Override // Q0.A
    public final /* synthetic */ int g(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.j(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int h(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.g(this, t7, y6, i7);
    }
}
