package U5;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Base64;
import j5.AbstractC1107a;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import u5.AbstractC1539a;
import w3.C1760y;
import yos.music.player.SettingsActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f7122p;

    public /* synthetic */ I(Context context, int i7) {
        this.f7121o = i7;
        this.f7122p = context;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f7121o) {
            case 0:
                Context context = this.f7122p;
                AbstractC1209k.f(context, "$context");
                Object systemService = context.getSystemService("vibrator");
                AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator.vibrate(30L);
                }
                C1760y c1760y = b6.i.f10423c;
                if (c1760y != null) {
                    c1760y.F();
                }
                break;
            case 1:
                Context context2 = this.f7122p;
                AbstractC1209k.f(context2, "$context");
                Intent intent = new Intent().setClass(context2, SettingsActivity.class);
                AbstractC1209k.e(intent, "setClass(...)");
                context2.startActivity(intent);
                break;
            case 2:
                Context context3 = this.f7122p;
                AbstractC1209k.f(context3, "$context");
                Object systemService2 = context3.getSystemService("vibrator");
                AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator2 = (Vibrator) systemService2;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator2.vibrate(VibrationEffect.createPredefined(5));
                } else {
                    vibrator2.vibrate(30L);
                }
                break;
            case 3:
                Context context4 = this.f7122p;
                AbstractC1209k.f(context4, "$context");
                Intent intent2 = new Intent().setClass(context4, SettingsActivity.class);
                AbstractC1209k.e(intent2, "setClass(...)");
                context4.startActivity(intent2);
                break;
            case 4:
                Context context5 = this.f7122p;
                AbstractC1209k.f(context5, "$context");
                AbstractC1107a.B(context5, "https://github.com/Yos-X");
                break;
            case 5:
                Context context6 = this.f7122p;
                AbstractC1209k.f(context6, "$context");
                byte[] bArrDecode = Base64.decode("aHR0cHM6Ly9hZmRpYW4uY29tL2EveW9zLXg=", 8);
                AbstractC1209k.e(bArrDecode, "decode(...)");
                AbstractC1107a.B(context6, new String(bArrDecode, AbstractC1539a.f17313a));
                break;
            default:
                Context context7 = this.f7122p;
                AbstractC1209k.f(context7, "$context");
                byte[] bArrDecode2 = Base64.decode("aHR0cHM6Ly90Lm1lL011bHRpcGx5U3R1ZGlv", 8);
                AbstractC1209k.e(bArrDecode2, "decode(...)");
                AbstractC1107a.B(context7, new String(bArrDecode2, AbstractC1539a.f17313a));
                break;
        }
        return Y4.o.f8736a;
    }
}
