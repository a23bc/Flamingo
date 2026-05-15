package r1;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import O0.Y;
import O0.Z;
import O0.m0;
import O0.p0;
import O0.q0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: r1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1413g implements Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1413g f15684b = new C1413g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1413g f15685c = new C1413g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15686a;

    public /* synthetic */ C1413g(int i7) {
        this.f15686a = i7;
    }

    @Override // O0.Z
    public final /* synthetic */ int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f15686a;
        return A0.e.i(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f15686a;
        return A0.e.l(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f15686a;
        return A0.e.f(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f15686a;
        return A0.e.c(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        switch (this.f15686a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    m0 m0VarD = ((Y) list.get(i8)).d(j3);
                    iJ = Math.max(iJ, m0VarD.f5416o);
                    i7 = Math.max(i7, m0VarD.f5417p);
                    arrayList.add(m0VarD);
                }
                if (list.isEmpty()) {
                    iJ = n1.a.j(j3);
                    i7 = n1.a.i(j3);
                }
                return interfaceC0298b0.k(iJ, i7, Z4.w.f8819o, new q0(1, arrayList));
            default:
                int size2 = list.size();
                Z4.w wVar = Z4.w.f8819o;
                if (size2 == 0) {
                    return interfaceC0298b0.k(0, 0, wVar, C1411e.f15677u);
                }
                if (size2 == 1) {
                    m0 m0VarD2 = ((Y) list.get(0)).d(j3);
                    return interfaceC0298b0.k(m0VarD2.f5416o, m0VarD2.f5417p, wVar, new p0(m0VarD2, 4));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i9 = 0; i9 < size3; i9++) {
                    m0 m0VarD3 = ((Y) list.get(i9)).d(j3);
                    iMax = Math.max(iMax, m0VarD3.f5416o);
                    iMax2 = Math.max(iMax2, m0VarD3.f5417p);
                    arrayList2.add(m0VarD3);
                }
                return interfaceC0298b0.k(iMax, iMax2, wVar, new q0(2, arrayList2));
        }
    }
}
