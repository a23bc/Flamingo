package h6;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f12777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12780s;

    public /* synthetic */ B0(Context context, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c2, int i7) {
        this.f12776o = i7;
        this.f12777p = context;
        this.f12778q = interfaceC1182c;
        this.f12779r = interfaceC1180a;
        this.f12780s = interfaceC1182c2;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f12776o) {
            case 0:
                Context context = this.f12777p;
                AbstractC1209k.f(context, "$context");
                InterfaceC1182c interfaceC1182c = this.f12778q;
                AbstractC1209k.f(interfaceC1182c, "$isPlayingOnChanged");
                InterfaceC1180a interfaceC1180a = this.f12779r;
                AbstractC1209k.f(interfaceC1180a, "$isPlayingLambda");
                InterfaceC1182c interfaceC1182c2 = this.f12780s;
                AbstractC1209k.f(interfaceC1182c2, "$onStatus");
                Object systemService = context.getSystemService("vibrator");
                AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator.vibrate(30L);
                }
                interfaceC1182c.b(Boolean.valueOf(!((Boolean) interfaceC1180a.a()).booleanValue()));
                interfaceC1182c2.b(interfaceC1180a.a());
                break;
            default:
                Context context2 = this.f12777p;
                AbstractC1209k.f(context2, "$context");
                InterfaceC1182c interfaceC1182c3 = this.f12778q;
                AbstractC1209k.f(interfaceC1182c3, "$isPlayingOnChanged");
                InterfaceC1180a interfaceC1180a2 = this.f12779r;
                AbstractC1209k.f(interfaceC1180a2, "$isPlayingLambda");
                InterfaceC1182c interfaceC1182c4 = this.f12780s;
                AbstractC1209k.f(interfaceC1182c4, "$onStatus");
                Object systemService2 = context2.getSystemService("vibrator");
                AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator2 = (Vibrator) systemService2;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator2.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator2.vibrate(30L);
                }
                interfaceC1182c3.b(Boolean.valueOf(!((Boolean) interfaceC1180a2.a()).booleanValue()));
                interfaceC1182c4.b(interfaceC1180a2.a());
                break;
        }
        return Y4.o.f8736a;
    }
}
