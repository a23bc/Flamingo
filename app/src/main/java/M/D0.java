package M;

import D.C0069j;
import O0.InterfaceC0298b0;
import X.K0;
import b1.AbstractC0607C;
import f0.C0888g0;
import g1.C0980v;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D0 implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4383o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f4384p;

    public /* synthetic */ D0(int i7, Object obj) {
        this.f4383o = i7;
        this.f4384p = obj;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Z4.w wVar = Z4.w.f8819o;
        Object obj4 = this.f4384p;
        switch (this.f4383o) {
            case 0:
                n1.a aVar = (n1.a) obj3;
                long j3 = ((C0) obj4).f4382f;
                long j7 = aVar.f14505a;
                int iJ = n1.a.j(j7);
                long j8 = aVar.f14505a;
                O0.m0 m0VarD = ((O0.Y) obj2).d(n1.a.a(j7, i6.h.q((int) (j3 >> 32), iJ, n1.a.h(j8)), 0, i6.h.q((int) (4294967295L & j3), n1.a.i(j8), n1.a.g(j8)), 0, 10));
                return ((InterfaceC0298b0) obj).k(m0VarD.f5416o, m0VarD.f5417p, wVar, new C0069j(m0VarD, 5));
            case 1:
                InterfaceC0298b0 interfaceC0298b0 = (InterfaceC0298b0) obj;
                O0.Y y6 = (O0.Y) obj2;
                C0888g0 c0888g0 = (C0888g0) obj4;
                AbstractC1209k.f(c0888g0, "$parentHeight");
                AbstractC1209k.f(interfaceC0298b0, "$this$layout");
                AbstractC1209k.f(y6, "measurable");
                O0.m0 m0VarD2 = y6.d(n1.a.a(((n1.a) obj3).f14505a, 0, 0, c0888g0.h(), c0888g0.h(), 3));
                return interfaceC0298b0.k(m0VarD2.f5416o, m0VarD2.f5417p, wVar, new C0069j(m0VarD2, 6));
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                V.h hVar = (V.h) obj4;
                if (!zBooleanValue) {
                    hVar.f7326I.b(iIntValue);
                }
                if (!zBooleanValue) {
                    hVar.f7326I.b(iIntValue2);
                }
                boolean z6 = false;
                if (hVar.f7325H) {
                    long j9 = hVar.f7323F.f12385b;
                    int i7 = b1.L.f9944c;
                    if (iIntValue != ((int) (j9 >> 32)) || iIntValue2 != ((int) (4294967295L & j9))) {
                        if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > hVar.f7323F.f12384a.f9970p.length()) {
                            K0 k02 = hVar.f7327J;
                            k02.s(false);
                            k02.p(N.f4425o);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                K0 k03 = hVar.f7327J;
                                k03.s(false);
                                k03.p(N.f4425o);
                            } else {
                                hVar.f7327J.h(true);
                            }
                            hVar.f7324G.f4516v.b(new C0980v(hVar.f7323F.f12384a, AbstractC0607C.b(iIntValue, iIntValue2), (b1.L) null));
                            z6 = true;
                        }
                    }
                }
                return Boolean.valueOf(z6);
            default:
                ((C0249a0) obj4).f4526p.c(((K0.u) obj2).f3912c);
                return Y4.o.f8736a;
        }
    }
}
