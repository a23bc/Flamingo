package U5;

import android.app.Activity;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import yos.music.player.CrashActivity;

/* JADX INFO: renamed from: U5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0434f implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Activity f7230p;

    public /* synthetic */ C0434f(Activity activity, int i7) {
        this.f7229o = i7;
        this.f7230p = activity;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Y4.o oVar = Y4.o.f8736a;
        Activity activity = this.f7230p;
        switch (this.f7229o) {
            case 0:
                int i7 = CrashActivity.f20572H;
                activity.finish();
                break;
            default:
                AbstractC1209k.f(activity, "$this_Settings");
                activity.finish();
                break;
        }
        return oVar;
    }
}
