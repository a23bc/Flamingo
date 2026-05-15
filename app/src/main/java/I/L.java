package I;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f3316p;

    public /* synthetic */ L(InterfaceC1180a interfaceC1180a, int i7) {
        this.f3315o = i7;
        this.f3316p = interfaceC1180a;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f3315o) {
            case 0:
                break;
            case 1:
                InterfaceC1180a interfaceC1180a = this.f3316p;
                AbstractC1209k.f(interfaceC1180a, "$expandNowPlaying");
                interfaceC1180a.a();
                break;
            case 2:
                InterfaceC1180a interfaceC1180a2 = this.f3316p;
                AbstractC1209k.f(interfaceC1180a2, "$onLyrics");
                interfaceC1180a2.a();
                break;
            case 3:
                InterfaceC1180a interfaceC1180a3 = this.f3316p;
                AbstractC1209k.f(interfaceC1180a3, "$onPlaylist");
                interfaceC1180a3.a();
                break;
            case 4:
                InterfaceC1180a interfaceC1180a4 = this.f3316p;
                AbstractC1209k.f(interfaceC1180a4, "$nowPageLambda");
                break;
            case 5:
                InterfaceC1180a interfaceC1180a5 = this.f3316p;
                AbstractC1209k.f(interfaceC1180a5, "$nowPageLambda");
                break;
            case 6:
                InterfaceC1180a interfaceC1180a6 = this.f3316p;
                AbstractC1209k.f(interfaceC1180a6, "$onDismiss");
                interfaceC1180a6.a();
                break;
            case 7:
                AbstractC1209k.f(this.f3316p, "$nowPage");
                break;
            case 8:
                InterfaceC1180a interfaceC1180a7 = this.f3316p;
                if (interfaceC1180a7 != null) {
                    interfaceC1180a7.a();
                }
                break;
            default:
                this.f3316p.a();
                break;
        }
        return Y4.o.f8736a;
    }
}
