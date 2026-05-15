package h6;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O3.f f12856p;

    public /* synthetic */ G(O3.f fVar, int i7) {
        this.f12855o = i7;
        this.f12856p = fVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f12855o) {
            case 0:
                O3.f fVar = this.f12856p;
                AbstractC1209k.f(fVar, "$systemMediaControlResolver");
                fVar.b();
                break;
            default:
                O3.f fVar2 = this.f12856p;
                AbstractC1209k.f(fVar2, "$systemMediaControlResolver");
                fVar2.b();
                break;
        }
        return Y4.o.f8736a;
    }
}
