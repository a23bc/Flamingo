package i6;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y3.x f13519p;

    public /* synthetic */ b(y3.x xVar, int i7) {
        this.f13518o = i7;
        this.f13519p = xVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        F.u uVar = (F.u) obj;
        switch (this.f13518o) {
            case 0:
                y3.x xVar = this.f13519p;
                AbstractC1209k.f(xVar, "$navController");
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "Library", new n0.d(-283764164, new f(xVar, 0), true), 2);
                break;
            case 1:
                y3.x xVar2 = this.f13519p;
                AbstractC1209k.f(xVar2, "$navController");
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "settings", new n0.d(55607454, new f(xVar2, 1), true), 2);
                break;
            default:
                y3.x xVar3 = this.f13519p;
                AbstractC1209k.f(xVar3, "$navController");
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "settings", new n0.d(-643348638, new f(xVar3, 2), true), 2);
                break;
        }
        return Y4.o.f8736a;
    }
}
