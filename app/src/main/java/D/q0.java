package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import j5.AbstractC1110d;
import java.util.List;
import m5.AbstractC1209k;
import r0.C1389g;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements O0.Z, m0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0064f f1382a;

    /* JADX INFO: renamed from: b */
    public final C1389g f1383b;

    public q0(InterfaceC0064f interfaceC0064f, C1389g c1389g) {
        this.f1382a = interfaceC0064f;
        this.f1383b = c1389g;
    }

    @Override // O0.Z
    public final int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1382a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iL, i7);
        int size = list.size();
        int iMax = 0;
        float f7 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            O0.Y y6 = (O0.Y) list.get(i8);
            float fI = AbstractC0060d.i(AbstractC0060d.h(y6));
            if (fI == 0.0f) {
                int iMin2 = Math.min(y6.P(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, y6.Q(iMin2));
            } else if (fI > 0.0f) {
                f7 += fI;
            }
        }
        int iRound = f7 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - iMin, 0) / f7);
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            O0.Y y7 = (O0.Y) list.get(i9);
            float fI2 = AbstractC0060d.i(AbstractC0060d.h(y7));
            if (fI2 > 0.0f) {
                iMax = Math.max(iMax, y7.Q(iRound != Integer.MAX_VALUE ? Math.round(iRound * fI2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // O0.Z
    public final int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1382a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i8 = 0;
        float f7 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            O0.Y y6 = (O0.Y) list.get(i9);
            float fI = AbstractC0060d.i(AbstractC0060d.h(y6));
            int iM = y6.M(i7);
            if (fI == 0.0f) {
                i8 += iM;
            } else if (fI > 0.0f) {
                f7 += fI;
                iMax = Math.max(iMax, Math.round(iM / fI));
            }
        }
        return ((list.size() - 1) * iL) + Math.round(iMax * f7) + i8;
    }

    @Override // D.m0
    public final long c(int i7, int i8, int i9, boolean z6) {
        return !z6 ? n1.b.a(i7, i8, 0, i9) : AbstractC1110d.y(i7, i8, 0, i9);
    }

    @Override // O0.Z
    public final int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1382a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i8 = 0;
        float f7 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            O0.Y y6 = (O0.Y) list.get(i9);
            float fI = AbstractC0060d.i(AbstractC0060d.h(y6));
            int iP = y6.P(i7);
            if (fI == 0.0f) {
                i8 += iP;
            } else if (fI > 0.0f) {
                f7 += fI;
                iMax = Math.max(iMax, Math.round(iP / fI));
            }
        }
        return ((list.size() - 1) * iL) + Math.round(iMax * f7) + i8;
    }

    @Override // D.m0
    public final void e(int i7, int[] iArr, int[] iArr2, InterfaceC0298b0 interfaceC0298b0) {
        this.f1382a.c(interfaceC0298b0, i7, iArr, interfaceC0298b0.getLayoutDirection(), iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return AbstractC1209k.a(this.f1382a, q0Var.f1382a) && AbstractC1209k.a(this.f1383b, q0Var.f1383b);
    }

    @Override // O0.Z
    public final int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1382a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iL, i7);
        int size = list.size();
        int iMax = 0;
        float f7 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            O0.Y y6 = (O0.Y) list.get(i8);
            float fI = AbstractC0060d.i(AbstractC0060d.h(y6));
            if (fI == 0.0f) {
                int iMin2 = Math.min(y6.P(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, y6.e(iMin2));
            } else if (fI > 0.0f) {
                f7 += fI;
            }
        }
        int iRound = f7 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - iMin, 0) / f7);
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            O0.Y y7 = (O0.Y) list.get(i9);
            float fI2 = AbstractC0060d.i(AbstractC0060d.h(y7));
            if (fI2 > 0.0f) {
                iMax = Math.max(iMax, y7.e(iRound != Integer.MAX_VALUE ? Math.round(iRound * fI2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        return AbstractC0060d.j(this, n1.a.j(j3), n1.a.i(j3), n1.a.h(j3), n1.a.g(j3), interfaceC0298b0.L(this.f1382a.a()), interfaceC0298b0, list, new O0.m0[list.size()], 0, list.size(), null, 0);
    }

    @Override // D.m0
    public final int h(O0.m0 m0Var) {
        return m0Var.f5417p;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1383b.f15626a) + (this.f1382a.hashCode() * 31);
    }

    @Override // D.m0
    public final InterfaceC0296a0 i(O0.m0[] m0VarArr, InterfaceC0298b0 interfaceC0298b0, int[] iArr, int i7, int i8, int[] iArr2, int i9, int i10, int i11) {
        return interfaceC0298b0.k(i7, i8, Z4.w.f8819o, new p0(m0VarArr, this, i8, iArr));
    }

    @Override // D.m0
    public final int j(O0.m0 m0Var) {
        return m0Var.f5416o;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f1382a + ", verticalAlignment=" + this.f1383b + ')';
    }
}
