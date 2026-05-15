package i2;

import K0.C0236d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: i2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1069d extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f13361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IntentFilter f13362c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0236d f13363a;

    static {
        List listE0 = Z4.o.e0("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f13361b = listE0;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        f13362c = intentFilter;
    }

    public C1069d(C0236d c0236d) {
        this.f13363a = c0236d;
    }

    public final void a(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        boolean zA = C1066a.f13353a.a(powerManager);
        if (i7 >= 33) {
            zA = zA || C1067b.f13354a.a(powerManager);
        }
        if (zA) {
            this.f13363a.a();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Z4.n.n0(f13361b, intent.getAction())) {
            a(context);
        }
    }
}
