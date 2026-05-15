package V4;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import O0.Y;
import O0.Z;
import O0.m0;
import f0.InterfaceC0878b0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7523c;

    public k(float f7, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02) {
        this.f7521a = interfaceC0878b0;
        this.f7522b = interfaceC0878b02;
        this.f7523c = f7;
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
        AbstractC1209k.f(interfaceC0298b0, "$this$Layout");
        AbstractC1209k.f(list, "measurables");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y y6 = (Y) it.next();
            if (androidx.compose.ui.layout.a.a(y6) == D.f7454o) {
                m0 m0VarD = y6.d(j3);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Y y7 = (Y) it2.next();
                    if (androidx.compose.ui.layout.a.a(y7) == D.f7455p) {
                        m0 m0VarD2 = y7.d(n1.a.a(n1.b.i(-m0VarD.f5416o, 0, j3), 0, 0, 0, 0, 11));
                        int i7 = m0VarD.f5416o + m0VarD2.f5416o;
                        int iMax = Math.max(m0VarD2.f5417p, m0VarD.f5417p);
                        this.f7521a.setValue(Float.valueOf(m0VarD.f5416o));
                        this.f7522b.setValue(Integer.valueOf(i7));
                        return interfaceC0298b0.k(i7, iMax, Z4.w.f8819o, new C0463j(m0VarD2, m0VarD.f5416o / 2, (iMax - m0VarD2.f5417p) / 2, m0VarD, AbstractC1267a.H(m0VarD2.f5416o * this.f7523c), (iMax - m0VarD.f5417p) / 2, 0));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
