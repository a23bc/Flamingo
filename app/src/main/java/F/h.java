package F;

import f0.C0912t;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h implements l5.g {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2073o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2074p;

    public /* synthetic */ h(int i7, Object obj) {
        this.f2073o = i7;
        this.f2074p = obj;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2073o) {
            case 0:
                C0130c c0130c = (C0130c) obj;
                ((Number) obj2).intValue();
                C0912t c0912t = (C0912t) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0912t.f(c0130c) ? 4 : 2;
                }
                if (c0912t.N(iIntValue & 1, (iIntValue & 131) != 130)) {
                    ((n0.d) this.f2074p).d(c0130c, c0912t, Integer.valueOf(iIntValue & 14));
                } else {
                    c0912t.Q();
                }
                break;
            case 1:
                G.j jVar = (G.j) obj;
                ((Number) obj2).intValue();
                C0912t c0912t2 = (C0912t) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0912t2.f(jVar) ? 4 : 2;
                }
                if (c0912t2.N(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    ((n0.d) this.f2074p).d(jVar, c0912t2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    c0912t2.Q();
                }
                break;
            default:
                int iIntValue3 = ((Number) obj2).intValue();
                C0912t c0912t3 = (C0912t) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$items");
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= c0912t3.d(iIntValue3) ? 32 : 16;
                }
                if ((iIntValue4 & 145) == 144 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    i6.h.c((String) ((List) this.f2074p).get(iIntValue3), c0912t3, 0);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
