package s0;

import D.AbstractC0074o;
import D.r;
import O0.w0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.view.ViewStructure;
import f0.C0879c;
import f0.C0912t;
import f0.G0;
import f0.InterfaceC0906p0;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;
import v.k0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1210l implements l5.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15840q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i7, Object obj) {
        super(4);
        this.f15839p = i7;
        this.f15840q = obj;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        switch (this.f15839p) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((ViewStructure) this.f15840q).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
                break;
            default:
                k0 k0Var = (k0) obj;
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) obj2;
                C0912t c0912t = (C0912t) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i7 = (c0912t.f(k0Var) ? 4 : 2) | iIntValue3;
                } else {
                    i7 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i7 |= c0912t.f(interfaceC1398p) ? 32 : 16;
                }
                if ((i7 & 147) == 146 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    c0912t.Y(733328855);
                    r rVarE = AbstractC0074o.e(0, c0912t, false);
                    c0912t.Y(-1323940314);
                    int iP = C0879c.p(c0912t);
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    n0.d dVarK = w0.k(interfaceC1398p);
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, rVarE, C0354j.f6019f);
                    C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(iP))) {
                        n1.c.w(iP, c0912t, iP, c0351h);
                    }
                    dVarK.d(new G0(c0912t), c0912t, 0);
                    c0912t.Y(2058660585);
                    ((n0.d) this.f15840q).d(k0Var, c0912t, Integer.valueOf(i7 & 14));
                    c0912t.p(false);
                    c0912t.p(true);
                    c0912t.p(false);
                    c0912t.p(false);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
