package U5;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import yos.music.player.CrashActivity;

/* JADX INFO: renamed from: U5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0435g implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f7232p;

    public /* synthetic */ C0435g(String str, int i7) {
        this.f7231o = i7;
        this.f7232p = str;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        String str = this.f7232p;
        F.u uVar = (F.u) obj;
        switch (this.f7231o) {
            case 0:
                int i7 = CrashActivity.f20572H;
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "CrashUI", new n0.d(-1231361655, new C0438j(str, 0), true), 2);
                break;
            case 1:
                AbstractC1209k.f(str, "$message");
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "tip_no_song", new n0.d(2089907131, new C0438j(str, 1), true), 2);
                break;
            case 2:
                AbstractC1209k.f(str, "$message");
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "tip_no_song", new n0.d(1256968957, new C0438j(str, 2), true), 2);
                break;
            case 3:
                AbstractC1209k.f(str, "$message");
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "tip_no_song", new n0.d(-1724763027, new C0438j(str, 3), true), 2);
                break;
            default:
                AbstractC1209k.f(str, "$message");
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "tip_no_song", new n0.d(-318823019, new C0438j(str, 4), true), 2);
                break;
        }
        return oVar;
    }
}
