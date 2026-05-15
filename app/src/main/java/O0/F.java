package O0;

import Q0.C0351h;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import V4.C0458e;
import V4.C0461h;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r0.AbstractC1383a;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.C1585C;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC1210l implements l5.f {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f5292p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f5293q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i7, Object obj) {
        super(3);
        this.f5292p = i7;
        this.f5293q = obj;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f5292p) {
            case 0:
                C0912t c0912t = ((f0.G0) obj).f11664a;
                C0912t c0912t2 = (C0912t) obj2;
                ((Number) obj3).intValue();
                long j3 = c0912t2.f11891T;
                int i7 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, (InterfaceC1398p) this.f5293q);
                c0912t.Y(509942095);
                InterfaceC0355k.f6047i.getClass();
                C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                C0351h c0351h = C0354j.f6020g;
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                    n1.c.w(i7, c0912t, i7, c0351h);
                }
                c0912t.p(false);
                return Y4.o.f8736a;
            case 1:
                V4.H h = (V4.H) obj;
                C0912t c0912t3 = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f(h, "sliderPositions");
                if ((iIntValue & 14) == 0) {
                    iIntValue |= c0912t3.f(h) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    C0461h.f7504a.a(h, null, (C0458e) this.f5293q, c0912t3, (iIntValue & 14) | 24576);
                }
                return Y4.o.f8736a;
            case 2:
                m0 m0VarD = ((Y) obj2).d(((n1.a) obj3).f14505a);
                return ((InterfaceC0298b0) obj).k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new K0.A(m0VarD, 18, (C1585C) this.f5293q));
            case 3:
                InterfaceC0298b0 interfaceC0298b0 = (InterfaceC0298b0) obj;
                m0 m0VarD2 = ((Y) obj2).d(((n1.a) obj3).f14505a);
                return interfaceC0298b0.k(m0VarD2.f5416o, m0VarD2.f5417p, Z4.w.f8819o, new Q0.M(interfaceC0298b0, (v.k0) this.f5293q, m0VarD2, 10));
            default:
                V v3 = (V) obj;
                C0912t c0912t4 = (C0912t) obj2;
                ((Number) obj3).intValue();
                Object objK = c0912t4.K();
                f0.W w7 = C0903o.f11850a;
                if (objK == w7) {
                    f0.C c7 = new f0.C(C0879c.l(c0912t4));
                    c0912t4.i0(c7);
                    objK = c7;
                }
                InterfaceC1765B interfaceC1765B = ((f0.C) objK).f11644o;
                Object objK2 = c0912t4.K();
                if (objK2 == w7) {
                    objK2 = new v.k0(v3, interfaceC1765B);
                    c0912t4.i0(objK2);
                }
                v.k0 k0Var = (v.k0) objK2;
                C1395m c1395m = C1395m.f15634a;
                Object objK3 = c0912t4.K();
                if (objK3 == w7) {
                    objK3 = new F(3, k0Var);
                    c0912t4.i0(objK3);
                }
                InterfaceC1398p interfaceC1398pB = androidx.compose.ui.layout.a.b(c1395m, (l5.f) objK3);
                Object objK4 = c0912t4.K();
                if (objK4 == w7) {
                    objK4 = new v.j0(k0Var, 1);
                    c0912t4.i0(objK4);
                }
                ((n0.d) this.f5293q).h(k0Var, androidx.compose.ui.draw.a.c(interfaceC1398pB, (InterfaceC1182c) objK4), c0912t4, 6);
                Y4.o oVar = Y4.o.f8736a;
                Object objK5 = c0912t4.K();
                if (objK5 == w7) {
                    objK5 = new v.j0(k0Var, 2);
                    c0912t4.i0(objK5);
                }
                C0879c.d(oVar, (InterfaceC1182c) objK5, c0912t4);
                return oVar;
        }
    }
}
