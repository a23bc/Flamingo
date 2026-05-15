package d0;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import V4.C0463j;
import java.util.List;
import java.util.NoSuchElementException;
import o5.AbstractC1267a;
import r5.C1420a;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements O0.Z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ D0 f11149a;

    public u0(D0 d02) {
        this.f11149a = d02;
    }

    @Override // O0.Z
    public final /* synthetic */ int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.i(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.l(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.f(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.c(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            O0.Y y6 = (O0.Y) list.get(i7);
            if (androidx.compose.ui.layout.a.a(y6) == q0.f11078o) {
                O0.m0 m0VarD = y6.d(j3);
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    O0.Y y7 = (O0.Y) list.get(i8);
                    if (androidx.compose.ui.layout.a.a(y7) == q0.f11079p) {
                        O0.m0 m0VarD2 = y7.d(n1.a.a(n1.b.i(-m0VarD.f5416o, 0, j3), 0, 0, 0, 0, 11));
                        int i9 = m0VarD.f5416o + m0VarD2.f5416o;
                        int iMax = Math.max(m0VarD2.f5417p, m0VarD.f5417p);
                        float f7 = m0VarD.f5416o;
                        D0 d02 = this.f11149a;
                        d02.h.j(f7);
                        d02.f10838f.j(i9);
                        int i10 = m0VarD.f5416o / 2;
                        float f8 = m0VarD2.f5416o;
                        C1420a c1420a = d02.f10834b;
                        float fH = d02.f10835c.h();
                        float f9 = c1420a.f15779a;
                        float f10 = c1420a.f15780b;
                        float fP = i6.h.p(fH, f9, f10);
                        float f11 = f10 - f9;
                        return interfaceC0298b0.k(i9, iMax, Z4.w.f8819o, new C0463j(m0VarD2, i10, (iMax - m0VarD2.f5417p) / 2, m0VarD, AbstractC1267a.H(i6.h.p(f11 == 0.0f ? 0.0f : (fP - f9) / f11, 0.0f, 1.0f) * f8), (iMax - m0VarD.f5417p) / 2, 1));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
