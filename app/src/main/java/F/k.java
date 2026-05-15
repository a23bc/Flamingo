package F;

import H.C0167i;
import H.K;
import I.C0225q;
import f0.C0912t;

/* JADX INFO: loaded from: classes.dex */
public final class k implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K f2082q;

    public /* synthetic */ k(K k7, int i7, int i8) {
        this.f2080o = i8;
        this.f2082q = k7;
        this.f2081p = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2080o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l lVar = (l) this.f2082q;
                    D4.i iVar = lVar.f2084b.f2075c;
                    int i7 = this.f2081p;
                    C0167i c0167iJ = iVar.j(i7);
                    ((f) c0167iJ.f2882c).f2071c.h(lVar.f2085c, Integer.valueOf(i7 - c0167iJ.f2880a), c0912t, 0);
                } else {
                    c0912t.Q();
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0912t2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    D4.i iVar2 = ((G.h) this.f2082q).f2510b.f2507d;
                    int i8 = this.f2081p;
                    C0167i c0167iJ2 = iVar2.j(i8);
                    ((G.f) c0167iJ2.f2882c).f2504d.h(G.j.f2515a, Integer.valueOf(i8 - c0167iJ2.f2880a), c0912t2, 6);
                } else {
                    c0912t2.Q();
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c0912t3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    D4.i iVar3 = ((I.w) this.f2082q).f3395b.f3393c;
                    int i9 = this.f2081p;
                    C0167i c0167iJ3 = iVar3.j(i9);
                    int i10 = i9 - c0167iJ3.f2880a;
                    ((C0225q) c0167iJ3.f2882c).f3381b.h(I.A.f3255a, Integer.valueOf(i10), c0912t3, 0);
                } else {
                    c0912t3.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
