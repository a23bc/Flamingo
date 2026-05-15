package v6;

import F.C0130c;
import f0.C0912t;
import j5.AbstractC1109c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;
import y0.C1958H;

/* JADX INFO: loaded from: classes.dex */
public final class k implements l5.g {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f18380o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ n0.d f18381p;

    public k(int i7, n0.d dVar) {
        this.f18380o = i7;
        this.f18381p = dVar;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        C0130c c0130c = (C0130c) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0912t c0912t = (C0912t) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC1209k.f(c0130c, "$this$items");
        if ((iIntValue2 & 6) == 0) {
            i7 = (c0912t.f(c0130c) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i7 |= c0912t.d(iIntValue) ? 32 : 16;
        }
        if ((i7 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            n0.d dVar = this.f18381p;
            int i8 = this.f18380o;
            if (i8 == 1) {
                c0912t.X(-685472688);
                E.a(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), null, 0L, n0.e.e(-533869547, new j(dVar, c0130c, iIntValue, 0), c0912t), c0912t, 3078, 6);
                c0912t.p(false);
            } else if (iIntValue == 0) {
                c0912t.X(-685278008);
                float f7 = E.f18342a;
                E.a(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 16.5f, 0.0f, 2), AbstractC1109c.j(60), 0L, n0.e.e(-594391348, new j(dVar, c0130c, iIntValue, 1), c0912t), c0912t, 3078, 4);
                c0912t.p(false);
            } else if (iIntValue == i8 - 1) {
                c0912t.X(-684758014);
                float f8 = E.f18342a;
                E.a(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 16.5f, 0.0f, 2), AbstractC1109c.j(51), 0L, n0.e.e(-471487411, new j(dVar, c0130c, iIntValue, 2), c0912t), c0912t, 3078, 4);
                c0912t.p(false);
            } else {
                c0912t.X(-684249645);
                C1958H c1958h = AbstractC1959I.f20180a;
                InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                float f9 = E.f18342a;
                E.a(androidx.compose.foundation.layout.a.i(interfaceC1398pB, 16.5f, 0.0f, 2), c1958h, 0L, n0.e.e(-2030635860, new j(dVar, c0130c, iIntValue, 3), c0912t), c0912t, 3126, 4);
                c0912t.p(false);
            }
        }
        return Y4.o.f8736a;
    }
}
