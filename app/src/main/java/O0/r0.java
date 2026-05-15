package O0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Q0.H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f5440b = new r0("Undefined intrinsics block and it is required");

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        int size = list.size();
        Z4.w wVar = Z4.w.f8819o;
        if (size == 0) {
            return interfaceC0298b0.k(n1.a.j(j3), n1.a.i(j3), wVar, n0.f5423r);
        }
        if (size == 1) {
            m0 m0VarD = ((Y) list.get(0)).d(j3);
            return interfaceC0298b0.k(n1.b.g(j3, m0VarD.f5416o), n1.b.f(j3, m0VarD.f5417p), wVar, new p0(m0VarD, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            m0 m0VarD2 = ((Y) list.get(i7)).d(j3);
            iMax = Math.max(m0VarD2.f5416o, iMax);
            iMax2 = Math.max(m0VarD2.f5417p, iMax2);
            arrayList.add(m0VarD2);
        }
        return interfaceC0298b0.k(n1.b.g(j3, iMax), n1.b.f(j3, iMax2), wVar, new q0(0, arrayList));
    }
}
