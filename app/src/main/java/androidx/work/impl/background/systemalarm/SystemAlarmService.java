package androidx.work.impl.background.systemalarm;

import N3.p;
import Q3.h;
import X3.i;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0600x;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0600x {

    /* JADX INFO: renamed from: p */
    public h f9859p;

    /* JADX INFO: renamed from: q */
    public boolean f9860q;

    static {
        p.i("SystemAlarmService");
    }

    public final void c() {
        this.f9860q = true;
        p.d().b(new Throwable[0]);
        WeakHashMap weakHashMap = i.f8285a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap2 = i.f8285a;
        synchronized (weakHashMap2) {
            map.putAll(weakHashMap2);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", map.get(wakeLock));
                p pVarD = p.d();
                WeakHashMap weakHashMap3 = i.f8285a;
                pVarD.j(new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0600x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f9859p = hVar;
        if (hVar.f6146x != null) {
            p.d().c(new Throwable[0]);
        } else {
            hVar.f6146x = this;
        }
        this.f9860q = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0600x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f9860q = true;
        this.f9859p.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f9860q) {
            p.d().h(new Throwable[0]);
            this.f9859p.e();
            h hVar = new h(this);
            this.f9859p = hVar;
            if (hVar.f6146x != null) {
                p.d().c(new Throwable[0]);
            } else {
                hVar.f6146x = this;
            }
            this.f9860q = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f9859p.b(intent, i8);
        return 3;
    }
}
