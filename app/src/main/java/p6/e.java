package p6;

import F.t;
import F.u;
import Y4.o;
import f0.Z0;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import v6.E;
import v6.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z0 f15112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f15113q;

    public /* synthetic */ e(Z0 z02, List list, int i7) {
        this.f15111o = i7;
        this.f15112p = z02;
        this.f15113q = list;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f15111o) {
            case 0:
                u uVar = (u) obj;
                Z0 z02 = this.f15112p;
                AbstractC1209k.f(z02, "$logsSize$delegate");
                List list = this.f15113q;
                AbstractC1209k.f(list, "$logs");
                AbstractC1209k.f(uVar, "$this$Title");
                E.b(uVar, new e(z02, list, 1));
                break;
            default:
                l lVar = (l) obj;
                Z0 z03 = this.f15112p;
                AbstractC1209k.f(z03, "$logsSize$delegate");
                List list2 = this.f15113q;
                AbstractC1209k.f(list2, "$logs");
                AbstractC1209k.f(lVar, "$this$yosRoundColumn");
                lVar.b(((Number) z03.getValue()).intValue(), new f(0, list2), t.f2149o, new n0.d(-1414260875, new F.h(2, list2), true));
                break;
        }
        return o.f8736a;
    }
}
