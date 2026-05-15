package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import java.util.List;
import m5.AbstractC1209k;
import m5.C1218t;
import o0.C1247d;
import r0.InterfaceC1386d;

/* JADX INFO: loaded from: classes.dex */
public final class r implements O0.Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1386d f1384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1385b;

    public r(InterfaceC1386d interfaceC1386d, boolean z6) {
        this.f1384a = interfaceC1386d;
        this.f1385b = z6;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC1209k.a(this.f1384a, rVar.f1384a) && this.f1385b == rVar.f1385b;
    }

    @Override // O0.Z
    public final /* synthetic */ int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.c(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        boolean zIsEmpty = list.isEmpty();
        Z4.w wVar = Z4.w.f8819o;
        if (zIsEmpty) {
            return interfaceC0298b0.k(n1.a.j(j3), n1.a.i(j3), wVar, new C1247d(16));
        }
        long j7 = this.f1385b ? j3 : j3 & (-8589934589L);
        if (list.size() == 1) {
            O0.Y y6 = (O0.Y) list.get(0);
            boolean z6 = y6.i() instanceof C0071l;
            O0.m0 m0VarD = y6.d(j7);
            int iMax = Math.max(n1.a.j(j3), m0VarD.f5416o);
            int iMax2 = Math.max(n1.a.i(j3), m0VarD.f5417p);
            return interfaceC0298b0.k(iMax, iMax2, wVar, new C0075p(m0VarD, y6, interfaceC0298b0, iMax, iMax2, this));
        }
        O0.m0[] m0VarArr = new O0.m0[list.size()];
        C1218t c1218t = new C1218t();
        c1218t.f14437o = n1.a.j(j3);
        C1218t c1218t2 = new C1218t();
        c1218t2.f14437o = n1.a.i(j3);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            O0.Y y7 = (O0.Y) list.get(i7);
            boolean z7 = y7.i() instanceof C0071l;
            O0.m0 m0VarD2 = y7.d(j7);
            m0VarArr[i7] = m0VarD2;
            c1218t.f14437o = Math.max(c1218t.f14437o, m0VarD2.f5416o);
            c1218t2.f14437o = Math.max(c1218t2.f14437o, m0VarD2.f5417p);
        }
        return interfaceC0298b0.k(c1218t.f14437o, c1218t2.f14437o, wVar, new C0076q(m0VarArr, list, interfaceC0298b0, c1218t, c1218t2, this, 0));
    }

    public final int hashCode() {
        return (this.f1384a.hashCode() * 31) + (this.f1385b ? 1231 : 1237);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f1384a + ", propagateMinConstraints=" + this.f1385b + ')';
    }
}
