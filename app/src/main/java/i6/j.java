package i6;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import y0.C1960J;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L.e f13541p;

    public /* synthetic */ j(L.e eVar, int i7) {
        this.f13540o = i7;
        this.f13541p = eVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1960J c1960j = (C1960J) obj;
        switch (this.f13540o) {
            case 0:
                L.e eVar = this.f13541p;
                AbstractC1209k.f(eVar, "$shape");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.m(eVar);
                c1960j.d(true);
                break;
            default:
                L.e eVar2 = this.f13541p;
                AbstractC1209k.f(eVar2, "$shape");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.e(1);
                c1960j.d(true);
                c1960j.m(eVar2);
                break;
        }
        return Y4.o.f8736a;
    }
}
