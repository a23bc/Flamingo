package I;

import M.C0265j;
import M.C0271p;
import M.r0;
import Q0.AbstractC0347f;
import X.V;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d5.EnumC0830a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.C1219u;
import w5.AbstractC1767D;
import x.C1812C;
import x.C1814D;
import x.C1820G;
import x.C1873r;
import x.C1875s;
import z.l1;
import z.q1;
import z.r1;

/* JADX INFO: renamed from: I.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0216h implements PointerInputEventHandler {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f3357o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f3358p;

    public /* synthetic */ C0216h(int i7, Object obj) {
        this.f3357o = i7;
        this.f3358p = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(K0.y yVar, c5.d dVar) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj = this.f3358p;
        switch (this.f3357o) {
            case 0:
                Object objH = AbstractC1767D.h(new C0215g(yVar, (C0211c) obj, null), dVar);
                return objH == EnumC0830a.f11264o ? objH : oVar;
            case 1:
                Object objC = r1.c(yVar, new Q.b(new r0(1, (S.f) obj, S.f.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 1), null), dVar);
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                if (objC != enumC0830a) {
                    objC = oVar;
                }
                return objC == enumC0830a ? objC : oVar;
            case 2:
                Object objC2 = r1.c(yVar, new U.a((U.b) obj, null), dVar);
                return objC2 == EnumC0830a.f11264o ? objC2 : oVar;
            case 3:
                Object objB0 = ((K0.N) yVar).B0(new V((InterfaceC1182c) obj, null), dVar);
                return objB0 == EnumC0830a.f11264o ? objB0 : oVar;
            case 4:
                Object objC3 = r1.c(yVar, new C1873r((C1875s) obj, null), dVar);
                return objC3 == EnumC0830a.f11264o ? objC3 : oVar;
            case 5:
                C1820G c1820g = (C1820G) obj;
                boolean z6 = c1820g.f19795J;
                C1812C c1812c = (!z6 || c1820g.a0 == null) ? null : new C1812C(c1820g, 0);
                C1812C c1812c2 = (!z6 || c1820g.Z == null) ? null : new C1812C(c1820g, 1);
                C1814D c1814d = new C1814D(c1820g, null);
                C1812C c1812c3 = new C1812C(c1820g, 2);
                z.K k7 = q1.f20945a;
                Object objH2 = AbstractC1767D.h(new l1(yVar, c1814d, c1812c2, c1812c, c1812c3, null), dVar);
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                if (objH2 != enumC0830a2) {
                    objH2 = oVar;
                }
                return objH2 == enumC0830a2 ? objH2 : oVar;
            default:
                K1.l lVar = new K1.l();
                C1219u c1219u = new C1219u();
                c1219u.f14438o = AbstractC0347f.w((z.J) obj).c(0L);
                z.J j3 = (z.J) obj;
                Object objH3 = AbstractC1767D.h(new z.D(yVar, j3, new C0224p(j3, 2, lVar), new C0265j(lVar, yVar, j3, 18), new InterfaceC1180a() { // from class: z.C

                    /* JADX INFO: renamed from: o */
                    public final /* synthetic */ int f20599o;

                    /* JADX INFO: renamed from: p */
                    public final /* synthetic */ J f20600p;

                    public /* synthetic */ C(J j32, int i7) {
                        i = i7;
                        j = j32;
                    }

                    @Override // l5.InterfaceC1180a
                    public final Object a() {
                        switch (i) {
                            case 0:
                                y5.c cVar = j.f20662I;
                                if (cVar != null) {
                                    cVar.k(C2055p.f20939a);
                                }
                                return Y4.o.f8736a;
                            default:
                                return Boolean.valueOf(!j.L0());
                        }
                    }
                }, new InterfaceC1180a() { // from class: z.C

                    /* JADX INFO: renamed from: o */
                    public final /* synthetic */ int f20599o;

                    /* JADX INFO: renamed from: p */
                    public final /* synthetic */ J f20600p;

                    public /* synthetic */ C(J j32, int i7) {
                        i = i7;
                        j = j32;
                    }

                    @Override // l5.InterfaceC1180a
                    public final Object a() {
                        switch (i) {
                            case 0:
                                y5.c cVar = j.f20662I;
                                if (cVar != null) {
                                    cVar.k(C2055p.f20939a);
                                }
                                return Y4.o.f8736a;
                            default:
                                return Boolean.valueOf(!j.L0());
                        }
                    }
                }, new C0271p(j32, c1219u, lVar, 9), null), dVar);
                return objH3 == EnumC0830a.f11264o ? objH3 : oVar;
        }
    }
}
