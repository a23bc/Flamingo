package U3;

import N3.p;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    static {
        p.i("BatteryChrgTracker");
    }

    @Override // U3.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f7032b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            p.d().c(new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // U3.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // U3.c
    public final void g(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        p pVarD = p.d();
        "Received ".concat(action);
        pVarD.b(new Throwable[0]);
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                c(Boolean.FALSE);
                break;
            case "android.os.action.DISCHARGING":
                c(Boolean.FALSE);
                break;
            case "android.os.action.CHARGING":
                c(Boolean.TRUE);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                c(Boolean.TRUE);
                break;
        }
    }
}
