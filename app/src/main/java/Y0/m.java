package Y0;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r5.C1423d;
import s5.InterfaceC1438c;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f8479q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i7) {
        super(1);
        this.f8478p = i7;
        this.f8479q = str;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        String str = this.f8479q;
        switch (this.f8478p) {
            case 0:
                v.b((j) obj, str);
                return oVar;
            case 1:
                v.b((j) obj, str);
                return oVar;
            case 2:
                j jVar = (j) obj;
                v.b(jVar, str);
                v.c(jVar, 5);
                return oVar;
            case 3:
                InterfaceC1438c[] interfaceC1438cArr = v.f8556a;
                w wVar = t.f8533d;
                InterfaceC1438c interfaceC1438c = v.f8556a[2];
                wVar.a((j) obj, str);
                return oVar;
            case 4:
                j jVar2 = (j) obj;
                v.b(jVar2, str);
                v.c(jVar2, 5);
                return oVar;
            default:
                C1423d c1423d = (C1423d) obj;
                AbstractC1209k.f(c1423d, "it");
                return AbstractC1545g.n0(str, c1423d);
        }
    }
}
