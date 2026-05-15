package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.C1455j;

/* JADX INFO: loaded from: classes.dex */
public final class S implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0064f f1268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0067h f1269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f1271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P f1273f;

    public S(InterfaceC0064f interfaceC0064f, InterfaceC0067h interfaceC0067h, float f7, C c7, float f8, P p7) {
        this.f1268a = interfaceC0064f;
        this.f1269b = interfaceC0067h;
        this.f1270c = f7;
        this.f1271d = c7;
        this.f1272e = f8;
        this.f1273f = p7;
    }

    public static int a(List list, int i7, int i8, int i9, P p7) {
        boolean z6;
        boolean z7;
        C1455j c1455j;
        boolean z8 = true;
        boolean zIsEmpty = list.isEmpty();
        long jA = C1455j.a(0, 0);
        if (!zIsEmpty) {
            int i10 = Integer.MAX_VALUE;
            I i11 = new I(p7, n1.b.a(0, i7, 0, Integer.MAX_VALUE), i8, i9);
            O0.Y y6 = (O0.Y) Z4.n.s0(0, list);
            int iQ = y6 != null ? y6.Q(i7) : 0;
            int iM = y6 != null ? y6.M(iQ) : 0;
            int i12 = 0;
            if (i11.b(list.size() > 1, 0, C1455j.a(i7, Integer.MAX_VALUE), y6 == null ? null : new C1455j(C1455j.a(iM, iQ)), 0, 0, 0, false, false).f1231b) {
                p7.getClass();
                N n7 = N.f1254o;
                jA = jA;
            } else {
                int size = list.size();
                int i13 = i7;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (i16 >= size) {
                        break;
                    }
                    int i19 = i13 - iM;
                    int i20 = i16 + 1;
                    int iMax = Math.max(i15, iQ);
                    O0.Y y7 = (O0.Y) Z4.n.s0(i20, list);
                    iQ = y7 != null ? y7.Q(i7) : 0;
                    int iM2 = y7 != null ? y7.M(iQ) + i8 : 0;
                    if (i16 + 2 < list.size()) {
                        i16 = i20;
                        z6 = z8;
                    } else {
                        i16 = i20;
                        z6 = false;
                    }
                    int i21 = i16 - i18;
                    int i22 = i14;
                    long jA2 = C1455j.a(i19, i10);
                    if (y7 == null) {
                        z7 = z8;
                        c1455j = null;
                    } else {
                        z7 = z8;
                        c1455j = new C1455j(C1455j.a(iM2, iQ));
                    }
                    C1455j c1455j2 = c1455j;
                    int i23 = iM2;
                    H hB = i11.b(z6, i21, jA2, c1455j2, i22, i12, iMax, false, false);
                    if (hB.f1230a) {
                        int i24 = iMax + i9 + i12;
                        i11.a(hB, y7 != null ? z7 : false, i22, i24, i19, i21);
                        int i25 = i23 - i8;
                        i14 = i22 + 1;
                        if (hB.f1231b) {
                            i17 = i16;
                            i12 = i24;
                            break;
                        }
                        i13 = i7;
                        i18 = i16;
                        iM = i25;
                        i12 = i24;
                        i15 = 0;
                    } else {
                        iM = i23;
                        i13 = i19;
                        i14 = i22;
                        i15 = iMax;
                    }
                    i17 = i16;
                    z8 = z7;
                    i10 = Integer.MAX_VALUE;
                }
                jA = C1455j.a(i12 - i9, i17);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // D.m0
    public final long c(int i7, int i8, int i9, boolean z6) {
        q0 q0Var = o0.f1362a;
        return !z6 ? n1.b.a(i7, i8, 0, i9) : AbstractC1110d.y(i7, i8, 0, i9);
    }

    @Override // D.m0
    public final void e(int i7, int[] iArr, int[] iArr2, InterfaceC0298b0 interfaceC0298b0) {
        this.f1268a.c(interfaceC0298b0, i7, iArr, interfaceC0298b0.getLayoutDirection(), iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s7 = (S) obj;
        s7.getClass();
        return this.f1268a.equals(s7.f1268a) && this.f1269b.equals(s7.f1269b) && n1.g.a(this.f1270c, s7.f1270c) && this.f1271d.equals(s7.f1271d) && n1.g.a(this.f1272e, s7.f1272e) && AbstractC1209k.a(this.f1273f, s7.f1273f);
    }

    @Override // D.m0
    public final int h(O0.m0 m0Var) {
        return m0Var.S();
    }

    public final int hashCode() {
        return this.f1273f.hashCode() + ((((((Float.floatToIntBits(this.f1272e) + ((this.f1271d.hashCode() + n1.c.n(this.f1270c, (this.f1269b.hashCode() + ((this.f1268a.hashCode() + 38161) * 31)) * 31, 31)) * 31)) * 31) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31);
    }

    @Override // D.m0
    public final InterfaceC0296a0 i(final O0.m0[] m0VarArr, InterfaceC0298b0 interfaceC0298b0, final int[] iArr, int i7, final int i8, final int[] iArr2, final int i9, final int i10, final int i11) {
        final n1.n nVar = n1.n.f14521o;
        return interfaceC0298b0.k(i7, i8, Z4.w.f8819o, new InterfaceC1182c() { // from class: D.Q
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                AbstractC0060d abstractC0060d;
                O0.l0 l0Var = (O0.l0) obj;
                int[] iArr3 = iArr2;
                int i12 = iArr3 != null ? iArr3[i9] : 0;
                int i13 = i10;
                for (int i14 = i13; i14 < i11; i14++) {
                    O0.m0 m0Var = m0VarArr[i14];
                    AbstractC1209k.c(m0Var);
                    S s7 = this;
                    s7.getClass();
                    Object objI = m0Var.i();
                    n0 n0Var = objI instanceof n0 ? (n0) objI : null;
                    if (n0Var == null || (abstractC0060d = n0Var.f1357c) == null) {
                        abstractC0060d = s7.f1271d;
                    }
                    O0.l0.h(l0Var, m0Var, iArr[i14 - i13], abstractC0060d.e(i8 - m0Var.S(), nVar) + i12);
                }
                return Y4.o.f8736a;
            }
        });
    }

    @Override // D.m0
    public final int j(O0.m0 m0Var) {
        return m0Var.T();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f1268a + ", verticalArrangement=" + this.f1269b + ", mainAxisSpacing=" + ((Object) n1.g.b(this.f1270c)) + ", crossAxisAlignment=" + this.f1271d + ", crossAxisArrangementSpacing=" + ((Object) n1.g.b(this.f1272e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f1273f + ')';
    }
}
