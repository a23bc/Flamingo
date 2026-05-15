package X;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements O0.Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f8190a = new w0();

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
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            O0.m0 m0VarD = ((O0.Y) list.get(i7)).d(j3);
            iMax = Math.max(iMax, m0VarD.f5416o);
            iMax2 = Math.max(iMax2, m0VarD.f5417p);
            arrayList.add(m0VarD);
        }
        return interfaceC0298b0.k(iMax, iMax2, Z4.w.f8819o, new I.x(1, arrayList));
    }
}
