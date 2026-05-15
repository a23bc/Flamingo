package I;

import O0.l0;
import O0.m0;
import O0.n0;
import O0.o0;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3398p;

    public /* synthetic */ x(int i7, ArrayList arrayList) {
        this.f3397o = i7;
        this.f3398p = arrayList;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        int i7 = 0;
        ArrayList arrayList = this.f3398p;
        switch (this.f3397o) {
            case 0:
                l0 l0Var = (l0) obj;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    C0218j c0218j = (C0218j) arrayList.get(i8);
                    if (c0218j.f3370k == Integer.MIN_VALUE) {
                        C.b.a("position() should be called first");
                    }
                    List list = c0218j.f3362b;
                    int size2 = list.size();
                    int i9 = i7;
                    while (i9 < size2) {
                        m0 m0Var = (m0) list.get(i9);
                        int i10 = i9 * 2;
                        int[] iArr = c0218j.f3368i;
                        int i11 = iArr[i10];
                        int i12 = iArr[i10 + 1];
                        Y4.o oVar2 = oVar;
                        ArrayList arrayList2 = arrayList;
                        long jD = n1.k.d((((long) i11) << 32) | (((long) i12) & 4294967295L), c0218j.f3363c);
                        if (c0218j.f3367g) {
                            l0.q(l0Var, m0Var, jD);
                        } else {
                            int i13 = o0.f5431b;
                            n0 n0Var = n0.f5422q;
                            if (l0Var.e() == n1.n.f14521o || l0Var.g() == 0) {
                                l0.a(l0Var, m0Var);
                                m0Var.a0(n1.k.d(jD, m0Var.f5420s), 0.0f, n0Var);
                            } else {
                                int iG = (l0Var.g() - m0Var.f5416o) - ((int) (jD >> 32));
                                l0.a(l0Var, m0Var);
                                m0Var.a0(n1.k.d((((long) ((int) (jD & 4294967295L))) & 4294967295L) | (((long) iG) << 32), m0Var.f5420s), 0.0f, n0Var);
                            }
                        }
                        i9++;
                        oVar = oVar2;
                        arrayList = arrayList2;
                    }
                    i8++;
                    i7 = 0;
                }
                break;
            default:
                l0 l0Var2 = (l0) obj;
                int size3 = arrayList.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    l0.h(l0Var2, (m0) arrayList.get(i14), 0, 0);
                }
                break;
        }
        return oVar;
    }
}
