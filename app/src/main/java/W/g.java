package W;

import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f7670p;

    public /* synthetic */ g(h hVar, int i7) {
        this.f7669o = i7;
        this.f7670p = hVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f7669o) {
            case 0:
                return this.f7670p.f7674r.f7683a;
            case 1:
                return this.f7670p.f7674r.f7684b;
            default:
                return this.f7670p.f7674r.f7683a;
        }
    }
}
