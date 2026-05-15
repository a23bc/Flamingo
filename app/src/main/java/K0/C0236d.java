package K0;

import Q0.A0;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import Q0.C0364u;
import Q0.P;
import Q0.U;
import Q0.Y;
import Q0.j0;
import R0.M0;
import android.content.Context;
import d0.V;
import d0.n0;
import d0.o0;
import d2.C0821i;
import h0.C0994b;
import i2.C1070e;
import java.util.regex.Matcher;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1220v;
import r0.AbstractC1397o;
import u5.C1543e;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x0.C1893c;
import y3.C2019h;

/* JADX INFO: renamed from: K0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0236d extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f3865p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f3866q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f3867r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0236d(Object obj, int i7, Object obj2) {
        super(0);
        this.f3865p = i7;
        this.f3866q = obj;
        this.f3867r = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r4v11 */
    @Override // l5.InterfaceC1180a
    public final Object a() {
        Y0.o oVar;
        Q0.K k7;
        switch (this.f3865p) {
            case 0:
                ((C0237e) this.f3866q).d((AbstractC1397o) this.f3867r);
                break;
            case 1:
                C0352h0 c0352h0 = ((Q0.K) this.f3866q).f5821T;
                if ((c0352h0.f6005f.f15640r & 8) != 0) {
                    for (AbstractC1397o abstractC1397o = c0352h0.f6004e; abstractC1397o != null; abstractC1397o = abstractC1397o.f15641s) {
                        if ((abstractC1397o.f15639q & 8) != 0) {
                            ?? F6 = abstractC1397o;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof A0) {
                                    A0 a0 = (A0) F6;
                                    boolean zA0 = a0.a0();
                                    C1220v c1220v = (C1220v) this.f3867r;
                                    if (zA0) {
                                        Y0.j jVar = new Y0.j();
                                        c1220v.f14439o = jVar;
                                        jVar.f8476r = true;
                                    }
                                    if (a0.d0()) {
                                        ((Y0.j) c1220v.f14439o).f8475q = true;
                                    }
                                    a0.T((Y0.j) c1220v.f14439o);
                                } else if ((F6.f15639q & 8) != 0 && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                                    int i7 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o2 != null) {
                                        if ((abstractC1397o2.f15639q & 8) != 0) {
                                            i7++;
                                            eVar = eVar;
                                            if (i7 == 1) {
                                                F6 = abstractC1397o2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.b(F6);
                                                    F6 = 0;
                                                }
                                                eVar.b(abstractC1397o2);
                                            }
                                        }
                                        abstractC1397o2 = abstractC1397o2.f15642t;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                F6 = AbstractC0347f.f(eVar);
                            }
                        }
                    }
                }
                break;
            case 2:
                Y y6 = (Y) this.f3866q;
                P p7 = y6.f5915t;
                p7.h = 0;
                h0.e eVarA = p7.f5856a.A();
                Object[] objArr = eVarA.f12546o;
                int i8 = eVarA.f12548q;
                for (int i9 = 0; i9 < i8; i9++) {
                    Y y7 = ((Q0.K) objArr[i9]).f5822U.f5870q;
                    AbstractC1209k.c(y7);
                    y7.f5917v = y7.f5918w;
                    y7.f5918w = Integer.MAX_VALUE;
                    if (y7.f5919x == Q0.I.f5795p) {
                        y7.f5919x = Q0.I.f5796q;
                    }
                }
                P p8 = y6.f5915t;
                h0.e eVarA2 = p8.f5856a.A();
                Object[] objArr2 = eVarA2.f12546o;
                int i10 = eVarA2.f12548q;
                for (int i11 = 0; i11 < i10; i11++) {
                    Y y8 = ((Q0.K) objArr2[i11]).f5822U.f5870q;
                    AbstractC1209k.c(y8);
                    y8.f5908F.getClass();
                }
                C0364u c0364u = y6.o().f6084g0;
                Q0.K k8 = p8.f5856a;
                if (c0364u != null) {
                    boolean z6 = c0364u.f5886y;
                    C0994b c0994b = (C0994b) k8.o();
                    int i12 = ((h0.e) c0994b.f12538p).f12548q;
                    for (int i13 = 0; i13 < i12; i13++) {
                        U uH0 = ((Q0.K) c0994b.get(i13)).f5821T.f6003d.H0();
                        if (uH0 != null) {
                            uH0.f5886y = z6;
                        }
                    }
                }
                ((C0364u) this.f3867r).r0().b();
                if (y6.o().f6084g0 != null) {
                    C0994b c0994b2 = (C0994b) k8.o();
                    int i14 = ((h0.e) c0994b2.f12538p).f12548q;
                    for (int i15 = 0; i15 < i14; i15++) {
                        U uH02 = ((Q0.K) c0994b2.get(i15)).f5821T.f6003d.H0();
                        if (uH02 != null) {
                            uH02.f5886y = false;
                        }
                    }
                }
                h0.e eVarA3 = k8.A();
                Object[] objArr3 = eVarA3.f12546o;
                int i16 = eVarA3.f12548q;
                for (int i17 = 0; i17 < i16; i17++) {
                    Y y9 = ((Q0.K) objArr3[i17]).f5822U.f5870q;
                    AbstractC1209k.c(y9);
                    int i18 = y9.f5917v;
                    int i19 = y9.f5918w;
                    if (i18 != i19 && i19 == Integer.MAX_VALUE) {
                        y9.f0(true);
                    }
                }
                h0.e eVarA4 = k8.A();
                Object[] objArr4 = eVarA4.f12546o;
                int i20 = eVarA4.f12548q;
                for (int i21 = 0; i21 < i20; i21++) {
                    Y y10 = ((Q0.K) objArr4[i21]).f5822U.f5870q;
                    AbstractC1209k.c(y10);
                    Q0.L l = y10.f5908F;
                    l.getClass();
                    l.f5844c = false;
                }
                break;
            case 3:
                Context context = (Context) this.f3866q;
                ((Q1.b) this.f3867r).getClass();
                break;
            case 4:
                break;
            case 5:
                M0 m02 = (M0) this.f3866q;
                Y0.h hVar = m02.f6329s;
                Y0.h hVar2 = m02.f6330t;
                Float f7 = m02.f6327q;
                Float f8 = m02.f6328r;
                float fFloatValue = (hVar == null || f7 == null) ? 0.0f : ((Number) hVar.f8445a.a()).floatValue() - f7.floatValue();
                float fFloatValue2 = (hVar2 == null || f8 == null) ? 0.0f : ((Number) hVar2.f8445a.a()).floatValue() - f8.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int i22 = m02.f6325o;
                    R0.F f9 = (R0.F) this.f3867r;
                    int iV = f9.v(i22);
                    Y0.p pVar = (Y0.p) f9.o().b(f9.f6295n);
                    if (pVar != null) {
                        try {
                            H1.e eVar2 = f9.f6297p;
                            if (eVar2 != null) {
                                eVar2.f2969a.setBoundsInScreen(f9.f(pVar));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    Y0.p pVar2 = (Y0.p) f9.o().b(f9.f6296o);
                    if (pVar2 != null) {
                        try {
                            H1.e eVar3 = f9.f6298q;
                            if (eVar3 != null) {
                                eVar3.f2969a.setBoundsInScreen(f9.f(pVar2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    f9.f6287d.invalidate();
                    Y0.p pVar3 = (Y0.p) f9.o().b(iV);
                    if (pVar3 != null && (oVar = pVar3.f8488a) != null && (k7 = oVar.f8483c) != null) {
                        if (hVar != null) {
                            f9.f6300s.h(iV, hVar);
                        }
                        if (hVar2 != null) {
                            f9.f6301t.h(iV, hVar2);
                        }
                        f9.r(k7);
                    }
                }
                if (hVar != null) {
                    m02.f6327q = (Float) hVar.f8445a.a();
                }
                if (hVar2 != null) {
                    m02.f6328r = (Float) hVar2.f8445a.a();
                }
                break;
            case 6:
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f3866q;
                if (interfaceC1180a == null || (r0 = (C1893c) interfaceC1180a.a()) == null) {
                    j0 j0Var = (j0) this.f3867r;
                    if (!j0Var.J0().f15636B) {
                        j0Var = null;
                    }
                    if (j0Var != null) {
                    }
                }
                break;
            case 7:
                ((n0) this.f3866q).f11049b = (n1.d) this.f3867r;
                break;
            case 8:
                n0 n0Var = (n0) this.f3866q;
                if (((Boolean) n0Var.f11048a.f11058c.b(o0.f11054q)).booleanValue()) {
                    AbstractC1767D.t((InterfaceC1765B) this.f3867r, null, new V(n0Var, null), 3);
                }
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                AbstractC1767D.t((InterfaceC1765B) this.f3866q, null, new C1070e((i2.s) this.f3867r, null), 3);
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C1543e c1543e = (C1543e) this.f3866q;
                String str = (String) this.f3867r;
                AbstractC1209k.f(str, "input");
                Matcher matcher = c1543e.f17323o.matcher(str);
                AbstractC1209k.e(matcher, "matcher(...)");
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((v0.c) this.f3866q).f18207E.b((v0.d) this.f3867r);
                break;
            case 12:
                ((y5.g) this.f3866q).k(this.f3867r);
                break;
            case 13:
                ((C1220v) this.f3866q).f14439o = ((w0.u) this.f3867r).C0();
                break;
            default:
                z3.l lVar = (z3.l) this.f3866q;
                lVar.getClass();
                C2019h c2019h = (C2019h) this.f3867r;
                AbstractC1209k.f(c2019h, "backStackEntry");
                lVar.b().e(c2019h, false);
                break;
        }
        return Y4.o.f8736a;
    }
}
