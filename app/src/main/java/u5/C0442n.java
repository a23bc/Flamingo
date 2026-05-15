package U5;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: renamed from: U5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0442n implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4.i f7250p;

    public /* synthetic */ C0442n(D4.i iVar, int i7) {
        this.f7249o = i7;
        this.f7250p = iVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f7249o) {
            case 0:
                D4.i iVar = this.f7250p;
                AbstractC1209k.f(iVar, "$yosBottomSheetConfig");
                return Boolean.valueOf(iVar.o() < 0.3f);
            case 1:
                return Boolean.valueOf(this.f7250p.p() < 1.0f);
            default:
                D4.i iVar2 = this.f7250p;
                AbstractC1209k.f(iVar2, "$yosBottomSheetConfig");
                return Boolean.valueOf(iVar2.o() == 1.0f && SettingsLibrary.INSTANCE.getBarBlurEffect());
        }
    }
}
