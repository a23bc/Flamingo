package Q0;

import R0.AbstractC0403q0;
import R0.S0;
import f0.C0879c;
import f0.InterfaceC0874B;
import f0.a1;
import m5.AbstractC1210l;
import r0.AbstractC1397o;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: Q0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0351h extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q */
    public static final C0351h f5995q = new C0351h(2, 0);

    /* JADX INFO: renamed from: r */
    public static final C0351h f5996r = new C0351h(2, 1);

    /* JADX INFO: renamed from: s */
    public static final C0351h f5997s = new C0351h(2, 2);

    /* JADX INFO: renamed from: t */
    public static final C0351h f5998t = new C0351h(2, 3);

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f5999p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0351h(int i7, int i8) {
        super(i7);
        this.f5999p = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5999p) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0355k) obj).getClass();
                break;
            case 1:
                ((K) ((InterfaceC0355k) obj)).c0((O0.Z) obj2);
                break;
            case 2:
                ((K) ((InterfaceC0355k) obj)).d0((InterfaceC1398p) obj2);
                break;
            default:
                InterfaceC0874B interfaceC0874B = (InterfaceC0874B) obj2;
                K k7 = (K) ((InterfaceC0355k) obj);
                k7.f5817P = interfaceC0874B;
                a1 a1Var = AbstractC0403q0.h;
                n0.i iVar = (n0.i) interfaceC0874B;
                iVar.getClass();
                k7.Z((n1.d) C0879c.v(iVar, a1Var));
                n1.n nVar = (n1.n) C0879c.v(iVar, AbstractC0403q0.f6513n);
                n1.n nVar2 = k7.f5815N;
                C0352h0 c0352h0 = k7.f5821T;
                if (nVar2 != nVar) {
                    k7.f5815N = nVar;
                    k7.F();
                    K kV = k7.v();
                    if (kV != null) {
                        kV.D();
                    }
                    k7.E();
                    for (AbstractC1397o abstractC1397o = c0352h0.f6005f; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
                        abstractC1397o.u0();
                    }
                }
                k7.e0((S0) C0879c.v(iVar, AbstractC0403q0.f6518s));
                AbstractC1397o abstractC1397o2 = c0352h0.f6005f;
                if ((abstractC1397o2.f15640r & 32768) != 0) {
                    while (abstractC1397o2 != null) {
                        if ((abstractC1397o2.f15639q & 32768) != 0) {
                            ?? F6 = abstractC1397o2;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof InterfaceC0356l) {
                                    AbstractC1397o abstractC1397o3 = ((AbstractC1397o) ((InterfaceC0356l) F6)).f15637o;
                                    if (abstractC1397o3.f15636B) {
                                        k0.c(abstractC1397o3);
                                    } else {
                                        abstractC1397o3.f15646x = true;
                                    }
                                } else if ((F6.f15639q & 32768) != 0 && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o4 = ((AbstractC0358n) F6).f6056D;
                                    int i7 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o4 != null) {
                                        if ((abstractC1397o4.f15639q & 32768) != 0) {
                                            i7++;
                                            eVar = eVar;
                                            if (i7 == 1) {
                                                F6 = abstractC1397o4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.b(F6);
                                                    F6 = 0;
                                                }
                                                eVar.b(abstractC1397o4);
                                            }
                                        }
                                        abstractC1397o4 = abstractC1397o4.f15642t;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                F6 = AbstractC0347f.f(eVar);
                            }
                        }
                        if ((abstractC1397o2.f15640r & 32768) != 0) {
                            abstractC1397o2 = abstractC1397o2.f15642t;
                        }
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
