package c5;

import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q */
    public static final b f10679q = new b(2, 0);

    /* JADX INFO: renamed from: r */
    public static final b f10680r = new b(2, 1);

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f10681p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f10681p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f10681p) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                AbstractC1209k.f(str, "acc");
                AbstractC1209k.f(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                AbstractC1209k.f(iVar, "acc");
                AbstractC1209k.f(gVar2, "element");
                i iVarU = iVar.u(gVar2.getKey());
                j jVar = j.f10685o;
                if (iVarU == jVar) {
                    return gVar2;
                }
                e eVar = e.f10684o;
                f fVar = (f) iVarU.n(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, iVarU);
                } else {
                    i iVarU2 = iVarU.u(eVar);
                    if (iVarU2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, iVarU2));
                }
                return cVar;
        }
    }
}
