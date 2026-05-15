package Q0;

import R0.C0415x;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: Q0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0340b0 extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0342c0 f5936q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0340b0(C0342c0 c0342c0, int i7) {
        super(0);
        this.f5935p = i7;
        this.f5936q = c0342c0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        O0.l0 placementScope;
        switch (this.f5935p) {
            case 0:
                C0342c0 c0342c0 = this.f5936q;
                P p7 = c0342c0.f5965t;
                p7.f5863i = 0;
                h0.e eVarA = p7.f5856a.A();
                Object[] objArr = eVarA.f12546o;
                int i7 = eVarA.f12548q;
                for (int i8 = 0; i8 < i7; i8++) {
                    C0342c0 c0342c02 = ((K) objArr[i8]).f5822U.f5869p;
                    c0342c02.f5967v = c0342c02.f5968w;
                    c0342c02.f5968w = Integer.MAX_VALUE;
                    c0342c02.f5947H = false;
                    if (c0342c02.f5971z == I.f5795p) {
                        c0342c02.f5971z = I.f5796q;
                    }
                }
                P p8 = c0342c0.f5965t;
                h0.e eVarA2 = p8.f5856a.A();
                Object[] objArr2 = eVarA2.f12546o;
                int i9 = eVarA2.f12548q;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((K) objArr2[i10]).f5822U.f5869p.f5951L.getClass();
                }
                c0342c0.o().r0().b();
                K k7 = p8.f5856a;
                h0.e eVarA3 = k7.A();
                Object[] objArr3 = eVarA3.f12546o;
                int i11 = eVarA3.f12548q;
                for (int i12 = 0; i12 < i11; i12++) {
                    K k8 = (K) objArr3[i12];
                    if (k8.f5822U.f5869p.f5967v != k8.x()) {
                        k7.O();
                        k7.D();
                        if (k8.x() == Integer.MAX_VALUE) {
                            P p9 = k8.f5822U;
                            if (p9.f5858c) {
                                Y y6 = p9.f5870q;
                                AbstractC1209k.c(y6);
                                y6.f0(false);
                            }
                            p9.f5869p.j0();
                        }
                    }
                }
                h0.e eVarA4 = k7.A();
                Object[] objArr4 = eVarA4.f12546o;
                int i13 = eVarA4.f12548q;
                for (int i14 = 0; i14 < i13; i14++) {
                    L l = ((K) objArr4[i14]).f5822U.f5869p.f5951L;
                    l.getClass();
                    l.f5844c = false;
                }
                break;
            case 1:
                C0342c0 c0342c03 = this.f5936q;
                c0342c03.f5965t.a().d(c0342c03.f5955P);
                break;
            default:
                C0342c0 c0342c04 = this.f5936q;
                j0 j0Var = c0342c04.f5965t.a().f6028G;
                P p10 = c0342c04.f5965t;
                if (j0Var == null || (placementScope = j0Var.f5887z) == null) {
                    placementScope = ((C0415x) O.a(p10.f5856a)).getPlacementScope();
                }
                InterfaceC1182c interfaceC1182c = c0342c04.f5960U;
                B0.d dVar = c0342c04.f5961V;
                if (dVar != null) {
                    j0 j0VarA = p10.a();
                    long j3 = c0342c04.f5962W;
                    float f7 = c0342c04.f5963X;
                    placementScope.getClass();
                    O0.l0.a(placementScope, j0VarA);
                    j0VarA.Z(n1.k.d(j3, j0VarA.f5420s), f7, dVar);
                } else if (interfaceC1182c == null) {
                    j0 j0VarA2 = p10.a();
                    long j7 = c0342c04.f5962W;
                    float f8 = c0342c04.f5963X;
                    placementScope.getClass();
                    O0.l0.a(placementScope, j0VarA2);
                    j0VarA2.a0(n1.k.d(j7, j0VarA2.f5420s), f8, null);
                } else {
                    j0 j0VarA3 = p10.a();
                    long j8 = c0342c04.f5962W;
                    float f9 = c0342c04.f5963X;
                    placementScope.getClass();
                    O0.l0.a(placementScope, j0VarA3);
                    j0VarA3.a0(n1.k.d(j8, j0VarA3.f5420s), f9, interfaceC1182c);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
