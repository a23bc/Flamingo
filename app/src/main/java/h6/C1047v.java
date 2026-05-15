package h6;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import yos.music.player.data.libraries.FavPlayListLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: h6.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1047v implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f13247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13248q;

    public /* synthetic */ C1047v(Context context, InterfaceC1180a interfaceC1180a, int i7) {
        this.f13246o = i7;
        this.f13247p = context;
        this.f13248q = interfaceC1180a;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f13246o) {
            case 0:
                InterfaceC1180a interfaceC1180a = this.f13248q;
                AbstractC1209k.f(interfaceC1180a, "$musicPlayingLambda");
                Context context = this.f13247p;
                AbstractC1209k.f(context, "$context");
                YosMediaItem yosMediaItem = (YosMediaItem) interfaceC1180a.a();
                if (yosMediaItem != null) {
                    Object systemService = context.getSystemService("vibrator");
                    AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                    Vibrator vibrator = (Vibrator) systemService;
                    if (Build.VERSION.SDK_INT >= 29) {
                        vibrator.vibrate(VibrationEffect.createPredefined(0));
                    } else {
                        vibrator.vibrate(30L);
                    }
                    FavPlayListLibrary favPlayListLibrary = FavPlayListLibrary.INSTANCE;
                    if (favPlayListLibrary.isFavorite(yosMediaItem)) {
                        favPlayListLibrary.removeMusic(yosMediaItem);
                    } else {
                        favPlayListLibrary.addMusic(yosMediaItem);
                    }
                }
                break;
            case 1:
                Context context2 = this.f13247p;
                AbstractC1209k.f(context2, "$context");
                InterfaceC1180a interfaceC1180a2 = this.f13248q;
                AbstractC1209k.f(interfaceC1180a2, "$onPrevious");
                Object systemService2 = context2.getSystemService("vibrator");
                AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator2 = (Vibrator) systemService2;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator2.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator2.vibrate(30L);
                }
                interfaceC1180a2.a();
                break;
            case 2:
                Context context3 = this.f13247p;
                AbstractC1209k.f(context3, "$context");
                InterfaceC1180a interfaceC1180a3 = this.f13248q;
                AbstractC1209k.f(interfaceC1180a3, "$onNext");
                Object systemService3 = context3.getSystemService("vibrator");
                AbstractC1209k.d(systemService3, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator3 = (Vibrator) systemService3;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator3.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator3.vibrate(30L);
                }
                interfaceC1180a3.a();
                break;
            case 3:
                Context context4 = this.f13247p;
                AbstractC1209k.f(context4, "$context");
                InterfaceC1180a interfaceC1180a4 = this.f13248q;
                AbstractC1209k.f(interfaceC1180a4, "$onNext");
                Object systemService4 = context4.getSystemService("vibrator");
                AbstractC1209k.d(systemService4, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator4 = (Vibrator) systemService4;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator4.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator4.vibrate(30L);
                }
                interfaceC1180a4.a();
                break;
            case 4:
                Context context5 = this.f13247p;
                AbstractC1209k.f(context5, "$context");
                InterfaceC1180a interfaceC1180a5 = this.f13248q;
                AbstractC1209k.f(interfaceC1180a5, "$onPrevious");
                Object systemService5 = context5.getSystemService("vibrator");
                AbstractC1209k.d(systemService5, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator5 = (Vibrator) systemService5;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator5.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator5.vibrate(30L);
                }
                interfaceC1180a5.a();
                break;
            default:
                Context context6 = this.f13247p;
                AbstractC1209k.f(context6, "$context");
                InterfaceC1180a interfaceC1180a6 = this.f13248q;
                if (interfaceC1180a6 != null) {
                    Object systemService6 = context6.getSystemService("vibrator");
                    AbstractC1209k.d(systemService6, "null cannot be cast to non-null type android.os.Vibrator");
                    Vibrator vibrator6 = (Vibrator) systemService6;
                    if (Build.VERSION.SDK_INT >= 29) {
                        vibrator6.vibrate(VibrationEffect.createPredefined(0));
                    } else {
                        vibrator6.vibrate(30L);
                    }
                }
                if (interfaceC1180a6 != null) {
                    interfaceC1180a6.a();
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C1047v(InterfaceC1180a interfaceC1180a, Context context, int i7) {
        this.f13246o = i7;
        this.f13248q = interfaceC1180a;
        this.f13247p = context;
    }
}
