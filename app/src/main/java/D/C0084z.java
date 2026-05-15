package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1388f;

/* JADX INFO: renamed from: D.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0084z implements O0.Z, m0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0067h f1420a;

    /* JADX INFO: renamed from: b */
    public final C1388f f1421b;

    public C0084z(InterfaceC0067h interfaceC0067h, C1388f c1388f) {
        this.f1420a = interfaceC0067h;
        this.f1421b = c1388f;
    }

    @Override // O0.Z
    public final int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1420a.a());
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
            int iQ = y6.Q(i7);
            if (fI == 0.0f) {
                i8 += iQ;
            } else if (fI > 0.0f) {
                f7 += fI;
                iMax = Math.max(iMax, Math.round(iQ / fI));
            }
        }
        return ((list.size() - 1) * iL) + Math.round(iMax * f7) + i8;
    }

    @Override // O0.Z
    public final int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1420a.a());
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
                int iMin2 = Math.min(y6.e(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, y6.M(iMin2));
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
                iMax = Math.max(iMax, y7.M(iRound != Integer.MAX_VALUE ? Math.round(iRound * fI2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // D.m0
    public final long c(int i7, int i8, int i9, boolean z6) {
        return !z6 ? n1.b.a(0, i9, i7, i8) : AbstractC1110d.x(0, i9, i7, i8);
    }

    @Override // O0.Z
    public final int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1420a.a());
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
                int iMin2 = Math.min(y6.e(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, y6.P(iMin2));
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
                iMax = Math.max(iMax, y7.P(iRound != Integer.MAX_VALUE ? Math.round(iRound * fI2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // D.m0
    public final void e(int i7, int[] iArr, int[] iArr2, InterfaceC0298b0 interfaceC0298b0) {
        this.f1420a.b(interfaceC0298b0, i7, iArr, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0084z)) {
            return false;
        }
        C0084z c0084z = (C0084z) obj;
        return AbstractC1209k.a(this.f1420a, c0084z.f1420a) && AbstractC1209k.a(this.f1421b, c0084z.f1421b);
    }

    @Override // O0.Z
    public final int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int iL = interfaceC0327y.L(this.f1420a.a());
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
            int iE = y6.e(i7);
            if (fI == 0.0f) {
                i8 += iE;
            } else if (fI > 0.0f) {
                f7 += fI;
                iMax = Math.max(iMax, Math.round(iE / fI));
            }
        }
        return ((list.size() - 1) * iL) + Math.round(iMax * f7) + i8;
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        return AbstractC0060d.j(this, n1.a.i(j3), n1.a.j(j3), n1.a.g(j3), n1.a.h(j3), interfaceC0298b0.L(this.f1420a.a()), interfaceC0298b0, list, new O0.m0[list.size()], 0, list.size(), null, 0);
    }

    @Override // D.m0
    public final int h(O0.m0 m0Var) {
        return m0Var.f5416o;
    }

    public final int hashCode() {
        return this.f1421b.hashCode() + (this.f1420a.hashCode() * 31);
    }

    @Override // D.m0
    public final InterfaceC0296a0 i(final O0.m0[] m0VarArr, final InterfaceC0298b0 interfaceC0298b0, final int[] iArr, int i7, final int i8, int[] iArr2, int i9, int i10, int i11) {
        return interfaceC0298b0.k(i8, i7, Z4.w.f8819o, new InterfaceC1182c() { // from class: D.y
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                O0.l0 l0Var = (O0.l0) obj;
                O0.m0[] m0VarArr2 = m0VarArr;
                int length = m0VarArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    O0.m0 m0Var = m0VarArr2[i12];
                    int i14 = i13 + 1;
                    AbstractC1209k.c(m0Var);
                    Object objI = m0Var.i();
                    n0 n0Var = objI instanceof n0 ? (n0) objI : null;
                    n1.n layoutDirection = interfaceC0298b0.getLayoutDirection();
                    C0084z c0084z = this;
                    c0084z.getClass();
                    AbstractC0060d abstractC0060d = n0Var != null ? n0Var.f1357c : null;
                    int i15 = i8;
                    O0.l0.h(l0Var, m0Var, abstractC0060d != null ? abstractC0060d.e(i15 - m0Var.f5416o, layoutDirection) : c0084z.f1421b.a(0, i15 - m0Var.f5416o, layoutDirection), iArr[i13]);
                    i12++;
                    i13 = i14;
                }
                return Y4.o.f8736a;
            }
        });
    }

    @Override // D.m0
    public final int j(O0.m0 m0Var) {
        return m0Var.f5417p;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f1420a + ", horizontalAlignment=" + this.f1421b + ')';
    }
}
