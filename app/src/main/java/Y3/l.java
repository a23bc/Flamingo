package y3;

import H.F;
import f0.J;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f20434p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ x f20435q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(x xVar, int i7) {
        super(1);
        this.f20434p = i7;
        this.f20435q = xVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f20434p) {
            case 0:
                AbstractC1209k.f((s) obj, "destination");
                return Boolean.valueOf(!this.f20435q.f20501m.containsKey(Integer.valueOf(r3.f20467t)));
            case 1:
                AbstractC1209k.f((s) obj, "destination");
                return Boolean.valueOf(!this.f20435q.f20501m.containsKey(Integer.valueOf(r3.f20467t)));
            default:
                AbstractC1209k.f((J) obj, "$this$DisposableEffect");
                x xVar = this.f20435q;
                xVar.f20510v = true;
                xVar.r();
                return new F(16, xVar);
        }
    }
}
