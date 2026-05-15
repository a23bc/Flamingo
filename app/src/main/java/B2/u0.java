package b2;

import a2.C0512b;
import java.util.ArrayList;
import l2.C1164d;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u0 f10332q = new u0(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u0 f10333r = new u0(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u0 f10334s = new u0(1, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u0 f10335t = new u0(1, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u0 f10336u = new u0(1, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u0 f10337v = new u0(1, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10338p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i7, int i8) {
        super(i7);
        this.f10338p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Z1.j jVar;
        Z1.o oVarC;
        Z1.o oVarC2;
        switch (this.f10338p) {
            case 0:
                return Boolean.valueOf(((Z1.n) obj) instanceof C0512b);
            case 1:
                Z1.n nVar = (Z1.n) obj;
                return Boolean.valueOf((nVar instanceof g2.s) || (nVar instanceof g2.n) || (nVar instanceof C0684z));
            case 2:
                Z1.i iVar = (Z1.i) obj;
                if ((iVar instanceof C0633C) || !iVar.b().d(new u0(1, 6))) {
                    return iVar;
                }
                ArrayList<Z1.o> arrayList = new ArrayList();
                ArrayList<Z1.o> arrayList2 = new ArrayList();
                Z1.o oVarB = iVar.b();
                boolean zD = oVarB.d(f10335t);
                Z1.o oVar = Z1.m.f8781a;
                Y4.h hVar = zD ? (Y4.h) oVarB.b(new Y4.h(null, oVar), o0.f10251F) : new Y4.h(null, oVarB);
                Z1.c cVar = (Z1.c) hVar.f8726o;
                Z1.o oVar2 = (Z1.o) hVar.f8727p;
                if (cVar != null && (cVar instanceof Z1.c)) {
                    arrayList2.add(cVar);
                }
                ((Number) oVar2.b(0, o0.f10253H)).intValue();
                Y4.h hVar2 = oVar2.d(f10336u) ? (Y4.h) oVar2.b(new Y4.h(null, oVar), o0.f10252G) : new Y4.h(null, oVar2);
                C0512b c0512b = (C0512b) hVar2.f8726o;
                Z1.o oVar3 = (Z1.o) hVar2.f8727p;
                arrayList.add(c0512b);
                C1164d c1164d = C1164d.f14164a;
                if (c0512b != null) {
                    Z1.a aVar = new Z1.a(R.drawable.glance_ripple);
                    jVar = new Z1.j();
                    jVar.f8776a = new g2.s(c1164d).c(new g2.n(c1164d));
                    jVar.f8777b = aVar;
                } else {
                    jVar = null;
                }
                C0635E c0635e = oVar3.d(f10333r) ? (C0635E) oVar3.b(new C0635E((Z1.o) null, 3), o0.f10246A) : new C0635E(oVar3, 1);
                arrayList.add(c0635e.f10038a);
                arrayList2.add(c0635e.f10039b.c(new g2.s(c1164d)).c(new g2.n(c1164d)));
                g2.k kVar = new g2.k();
                Z1.o oVar4 = oVar;
                for (Z1.o oVar5 : arrayList) {
                    if (oVar5 != null && (oVarC2 = oVar4.c(oVar5)) != null) {
                        oVar4 = oVarC2;
                    }
                }
                kVar.f12438c = oVar4;
                for (Z1.o oVar6 : arrayList2) {
                    if (oVar6 != null && (oVarC = oVar.c(oVar6)) != null) {
                        oVar = oVarC;
                    }
                }
                iVar.c(oVar);
                ArrayList arrayList3 = kVar.f8780b;
                arrayList3.add(iVar);
                if (jVar != null) {
                    arrayList3.add(jVar);
                }
                return kVar;
            case 3:
                return Boolean.valueOf(((Z1.n) obj) instanceof Z1.c);
            case 4:
                return Boolean.valueOf(((Z1.n) obj) instanceof C0512b);
            case 5:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(((Z1.n) obj) instanceof C0512b);
        }
    }
}
