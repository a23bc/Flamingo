package Y0;

import O0.w0;
import Q0.A0;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.K;
import Q0.j0;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;
import t.J;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a */
    public final AbstractC1397o f8481a;

    /* JADX INFO: renamed from: b */
    public final boolean f8482b;

    /* JADX INFO: renamed from: c */
    public final K f8483c;

    /* JADX INFO: renamed from: d */
    public final j f8484d;

    /* JADX INFO: renamed from: e */
    public boolean f8485e;

    /* JADX INFO: renamed from: f */
    public o f8486f;

    /* JADX INFO: renamed from: g */
    public final int f8487g;

    public o(AbstractC1397o abstractC1397o, boolean z6, K k7, j jVar) {
        this.f8481a = abstractC1397o;
        this.f8482b = z6;
        this.f8483c = k7;
        this.f8484d = jVar;
        this.f8487g = k7.f5831p;
    }

    public static /* synthetic */ List j(int i7, o oVar) {
        return oVar.i((i7 & 1) != 0 ? !oVar.f8482b : false, (i7 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final C1893c a(j0 j0Var) {
        ?? F6;
        o oVarL = l();
        if (oVarL == null) {
            return C1893c.f19868e;
        }
        AbstractC1397o abstractC1397o = oVarL.f8483c.f5821T.f6005f;
        if ((abstractC1397o.f15640r & 8) != 0) {
            loop0: while (abstractC1397o != null) {
                if ((abstractC1397o.f15639q & 8) != 0) {
                    F6 = abstractC1397o;
                    ?? eVar = 0;
                    while (F6 != 0) {
                        if (F6 instanceof A0) {
                            if (((A0) F6).i()) {
                                break loop0;
                            }
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
                if ((abstractC1397o.f15640r & 8) == 0) {
                    break;
                }
                abstractC1397o = abstractC1397o.f15642t;
            }
            F6 = 0;
        } else {
            F6 = 0;
        }
        A0 a0 = (A0) F6;
        j0 j0VarV = a0 != null ? AbstractC0347f.v(a0, 8) : null;
        return j0VarV == null ? oVarL.a(j0Var) : j0VarV.m(j0Var, true);
    }

    public final o b(g gVar, InterfaceC1182c interfaceC1182c) {
        j jVar = new j();
        jVar.f8475q = false;
        jVar.f8476r = false;
        interfaceC1182c.b(jVar);
        o oVar = new o(new n(interfaceC1182c), false, new K(this.f8487g + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        oVar.f8485e = true;
        oVar.f8486f = this;
        return oVar;
    }

    public final void c(K k7, ArrayList arrayList) {
        h0.e eVarZ = k7.z();
        Object[] objArr = eVarZ.f12546o;
        int i7 = eVarZ.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            K k8 = (K) objArr[i8];
            if (k8.I() && !k8.f5829e0) {
                if (k8.f5821T.d(8)) {
                    arrayList.add(r.a(k8, this.f8482b));
                } else {
                    c(k8, arrayList);
                }
            }
        }
    }

    public final j0 d() {
        if (!this.f8485e) {
            A0 a0F = f();
            return a0F != null ? AbstractC0347f.v(a0F, 8) : this.f8483c.f5821T.f6002c;
        }
        o oVarL = l();
        if (oVarL != null) {
            return oVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            o oVar = (o) arrayList.get(size2);
            if (oVar.n()) {
                arrayList2.add(oVar);
            } else if (!oVar.f8484d.f8476r) {
                oVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final A0 f() {
        ?? F6;
        boolean z6 = this.f8484d.f8475q;
        K k7 = this.f8483c;
        ?? r52 = 0;
        r52 = 0;
        r52 = 0;
        r52 = 0;
        if (z6) {
            AbstractC1397o abstractC1397o = k7.f5821T.f6005f;
            if ((abstractC1397o.f15640r & 8) != 0) {
                F6 = 0;
                while (abstractC1397o != null) {
                    if ((abstractC1397o.f15639q & 8) != 0) {
                        ?? F7 = abstractC1397o;
                        ?? eVar = 0;
                        while (F7 != 0) {
                            if (F7 instanceof A0) {
                                A0 a0 = (A0) F7;
                                if (a0.i()) {
                                    if (a0.d0()) {
                                        return a0;
                                    }
                                    if (F6 == 0) {
                                        F6 = a0;
                                    }
                                }
                            } else if ((F7.f15639q & 8) != 0 && (F7 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F7).f6056D;
                                int i7 = 0;
                                F7 = F7;
                                eVar = eVar;
                                while (abstractC1397o2 != null) {
                                    if ((abstractC1397o2.f15639q & 8) != 0) {
                                        i7++;
                                        eVar = eVar;
                                        if (i7 == 1) {
                                            F7 = abstractC1397o2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (F7 != 0) {
                                                eVar.b(F7);
                                                F7 = 0;
                                            }
                                            eVar.b(abstractC1397o2);
                                        }
                                    }
                                    abstractC1397o2 = abstractC1397o2.f15642t;
                                    F7 = F7;
                                    eVar = eVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F7 = AbstractC0347f.f(eVar);
                        }
                    }
                    if ((abstractC1397o.f15640r & 8) == 0) {
                        break;
                    }
                    abstractC1397o = abstractC1397o.f15642t;
                    F6 = F6;
                }
                r52 = F6;
            }
        } else {
            AbstractC1397o abstractC1397o3 = k7.f5821T.f6005f;
            if ((abstractC1397o3.f15640r & 8) != 0) {
                loop3: while (abstractC1397o3 != null) {
                    if ((abstractC1397o3.f15639q & 8) != 0) {
                        F6 = abstractC1397o3;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof A0) {
                                if (((A0) F6).i()) {
                                    r52 = F6;
                                }
                            } else if ((F6.f15639q & 8) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o4 = ((AbstractC0358n) F6).f6056D;
                                int i8 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC1397o4 != null) {
                                    if ((abstractC1397o4.f15639q & 8) != 0) {
                                        i8++;
                                        eVar2 = eVar2;
                                        if (i8 == 1) {
                                            F6 = abstractC1397o4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.b(F6);
                                                F6 = 0;
                                            }
                                            eVar2.b(abstractC1397o4);
                                        }
                                    }
                                    abstractC1397o4 = abstractC1397o4.f15642t;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i8 == 1) {
                                }
                            }
                            F6 = AbstractC0347f.f(eVar2);
                        }
                    }
                    if ((abstractC1397o3.f15640r & 8) == 0) {
                        break;
                    }
                    abstractC1397o3 = abstractC1397o3.f15642t;
                }
            }
        }
        return (A0) r52;
    }

    public final C1893c g() {
        j0 j0VarD = d();
        if (j0VarD != null) {
            if (!j0VarD.J0().f15636B) {
                j0VarD = null;
            }
            if (j0VarD != null) {
                return w0.i(j0VarD).m(j0VarD, true);
            }
        }
        return C1893c.f19868e;
    }

    public final C1893c h() {
        j0 j0VarD = d();
        if (j0VarD != null) {
            if (!j0VarD.J0().f15636B) {
                j0VarD = null;
            }
            if (j0VarD != null) {
                return w0.g(j0VarD);
            }
        }
        return C1893c.f19868e;
    }

    public final List i(boolean z6, boolean z7) {
        if (!z6 && this.f8484d.f8476r) {
            return Z4.v.f8818o;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z7);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final j k() {
        boolean zN = n();
        j jVar = this.f8484d;
        if (!zN) {
            return jVar;
        }
        j jVarC = jVar.c();
        p(new ArrayList(), jVarC);
        return jVarC;
    }

    public final o l() {
        K kV;
        o oVar = this.f8486f;
        if (oVar != null) {
            return oVar;
        }
        K k7 = this.f8483c;
        boolean z6 = this.f8482b;
        if (z6) {
            kV = k7.v();
            while (kV != null) {
                j jVarY = kV.y();
                if (jVarY != null && jVarY.f8475q) {
                    break;
                }
                kV = kV.v();
            }
            kV = null;
        } else {
            kV = null;
        }
        if (kV == null) {
            K kV2 = k7.v();
            while (true) {
                if (kV2 == null) {
                    kV = null;
                    break;
                }
                if (kV2.f5821T.d(8)) {
                    kV = kV2;
                    break;
                }
                kV2 = kV2.v();
            }
        }
        if (kV == null) {
            return null;
        }
        return r.a(kV, z6);
    }

    public final j m() {
        return this.f8484d;
    }

    public final boolean n() {
        return this.f8482b && this.f8484d.f8475q;
    }

    public final boolean o() {
        if (this.f8485e || !j(4, this).isEmpty()) {
            return false;
        }
        K kV = this.f8483c.v();
        while (true) {
            if (kV == null) {
                kV = null;
                break;
            }
            j jVarY = kV.y();
            if (jVarY != null && jVarY.f8475q) {
                break;
            }
            kV = kV.v();
        }
        return kV == null;
    }

    public final void p(ArrayList arrayList, j jVar) {
        if (this.f8484d.f8476r) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            o oVar = (o) arrayList.get(size2);
            if (!oVar.n()) {
                jVar.g(oVar.f8484d);
                oVar.p(arrayList, jVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z6) {
        if (this.f8485e) {
            return Z4.v.f8818o;
        }
        c(this.f8483c, arrayList);
        if (z6) {
            w wVar = t.f8551x;
            j jVar = this.f8484d;
            J j3 = jVar.f8473o;
            Object objG = j3.g(wVar);
            if (objG == null) {
                objG = null;
            }
            g gVar = (g) objG;
            if (gVar != null && jVar.f8475q && !arrayList.isEmpty()) {
                arrayList.add(b(gVar, new B0.b(17, gVar)));
            }
            w wVar2 = t.f8530a;
            if (j3.c(wVar2) && !arrayList.isEmpty() && jVar.f8475q) {
                Object objG2 = j3.g(wVar2);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) Z4.n.r0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new m(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
