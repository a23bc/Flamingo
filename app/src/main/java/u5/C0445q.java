package U5;

import D.h0;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import d0.n0;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0890h0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t4.AbstractC1515j;
import w.C1670c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: renamed from: U5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0445q implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f7255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7258s;

    public /* synthetic */ C0445q(Context context, InterfaceC1182c interfaceC1182c, C0886f0 c0886f0, InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f7254o = i7;
        this.f7255p = context;
        this.f7256q = interfaceC1182c;
        this.f7257r = c0886f0;
        this.f7258s = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Y4.o oVar = Y4.o.f8736a;
        Object obj = this.f7257r;
        Object obj2 = this.f7256q;
        Object obj3 = this.f7258s;
        Object obj4 = this.f7255p;
        switch (this.f7254o) {
            case 0:
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) obj3;
                AbstractC1209k.f(interfaceC0878b0, "$nowPageNowPlaying");
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) obj4;
                AbstractC1209k.f(interfaceC1765B, "$scope");
                C1670c c1670c = (C1670c) obj2;
                AbstractC1209k.f(c1670c, "$offsetY");
                w.S s7 = (w.S) obj;
                if (!AbstractC1209k.a(interfaceC0878b0.getValue(), "Album")) {
                    interfaceC0878b0.setValue("Album");
                } else {
                    AbstractC1767D.t(interfaceC1765B, null, new r(c1670c, s7, null), 3);
                }
                break;
            case 1:
                InterfaceC1765B interfaceC1765B2 = (InterfaceC1765B) obj4;
                AbstractC1209k.f(interfaceC1765B2, "$scope");
                C1670c c1670c2 = (C1670c) obj2;
                AbstractC1209k.f(c1670c2, "$offsetY");
                C0888g0 c0888g0 = (C0888g0) obj3;
                AbstractC1209k.f(c0888g0, "$parentHeight");
                AbstractC1767D.t(interfaceC1765B2, null, new J(c1670c2, c0888g0, (w.S) obj, null), 3);
                break;
            case 2:
                Context context = (Context) obj4;
                AbstractC1209k.f(context, "$context");
                b6.k kVar = (b6.k) obj2;
                C0886f0 c0886f0 = (C0886f0) obj;
                AbstractC1209k.f(c0886f0, "$sliderPosition");
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) obj3;
                AbstractC1209k.f(interfaceC0878b02, "$isSliding");
                Object systemService = context.getSystemService("vibrator");
                AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator.vibrate(VibrationEffect.createPredefined(5));
                } else {
                    vibrator.vibrate(30L);
                }
                kVar.b(Float.valueOf(c0886f0.h()));
                interfaceC0878b02.setValue(Boolean.FALSE);
                break;
            case 3:
                Context context2 = (Context) obj4;
                AbstractC1209k.f(context2, "$context");
                b6.k kVar2 = (b6.k) obj2;
                C0886f0 c0886f02 = (C0886f0) obj;
                AbstractC1209k.f(c0886f02, "$sliderPosition");
                InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) obj3;
                AbstractC1209k.f(interfaceC0878b03, "$isSliding");
                Object systemService2 = context2.getSystemService("vibrator");
                AbstractC1209k.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator2 = (Vibrator) systemService2;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator2.vibrate(VibrationEffect.createPredefined(5));
                } else {
                    vibrator2.vibrate(30L);
                }
                kVar2.b(Float.valueOf(c0886f02.h()));
                interfaceC0878b03.setValue(Boolean.FALSE);
                break;
            case 4:
                Context context3 = (Context) obj4;
                AbstractC1209k.f(context3, "$context");
                InterfaceC0878b0 interfaceC0878b04 = (InterfaceC0878b0) obj3;
                AbstractC1209k.f(interfaceC0878b04, "$translation");
                InterfaceC0878b0 interfaceC0878b05 = (InterfaceC0878b0) obj2;
                AbstractC1209k.f(interfaceC0878b05, "$showControl");
                C0890h0 c0890h0 = (C0890h0) obj;
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                Object systemService3 = context3.getSystemService("vibrator");
                AbstractC1209k.d(systemService3, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator3 = (Vibrator) systemService3;
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator3.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator3.vibrate(30L);
                }
                interfaceC0878b04.setValue(Boolean.valueOf(!((Boolean) interfaceC0878b04.getValue()).booleanValue()));
                interfaceC0878b05.setValue(Boolean.TRUE);
                int i7 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                SettingsLibrary.INSTANCE.setNowPlayingTranslation(((Boolean) interfaceC0878b04.getValue()).booleanValue());
                break;
            default:
                InterfaceC1765B interfaceC1765B3 = (InterfaceC1765B) obj4;
                AbstractC1209k.f(interfaceC1765B3, "$scope");
                n0 n0Var = (n0) obj3;
                AbstractC1209k.f(n0Var, "$bottomSheetState");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj2;
                AbstractC1209k.f(interfaceC1180a, "$onDismiss");
                C0886f0 c0886f03 = (C0886f0) obj;
                AbstractC1209k.f(c0886f03, "$cornerValue");
                AbstractC1767D.t(interfaceC1765B3, null, new s6.g(n0Var, null), 3).t(new h0(interfaceC1180a, 26, c0886f03));
                break;
        }
        return oVar;
    }

    public /* synthetic */ C0445q(InterfaceC0878b0 interfaceC0878b0, InterfaceC1765B interfaceC1765B, C1670c c1670c, w.S s7) {
        this.f7254o = 0;
        this.f7258s = interfaceC0878b0;
        this.f7255p = interfaceC1765B;
        this.f7256q = c1670c;
        this.f7257r = s7;
    }

    public /* synthetic */ C0445q(Object obj, Object obj2, Object obj3, InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f7254o = i7;
        this.f7255p = obj;
        this.f7258s = obj2;
        this.f7256q = obj3;
        this.f7257r = interfaceC0878b0;
    }

    public /* synthetic */ C0445q(InterfaceC1765B interfaceC1765B, C1670c c1670c, C0888g0 c0888g0, w.S s7) {
        this.f7254o = 1;
        this.f7255p = interfaceC1765B;
        this.f7256q = c1670c;
        this.f7258s = c0888g0;
        this.f7257r = s7;
    }
}
