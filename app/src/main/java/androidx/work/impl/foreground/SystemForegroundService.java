package androidx.work.impl.foreground;

import N3.p;
import O3.l;
import V3.a;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0600x;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0600x {

    /* JADX INFO: renamed from: p */
    public Handler f9863p;

    /* JADX INFO: renamed from: q */
    public boolean f9864q;

    /* JADX INFO: renamed from: r */
    public a f9865r;

    /* JADX INFO: renamed from: s */
    public NotificationManager f9866s;

    static {
        p.i("SystemFgService");
    }

    public final void c() {
        this.f9863p = new Handler(Looper.getMainLooper());
        this.f9866s = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f9865r = aVar;
        if (aVar.f7437w != null) {
            p.d().c(new Throwable[0]);
        } else {
            aVar.f7437w = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0600x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // androidx.lifecycle.AbstractServiceC0600x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f9865r.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f9864q) {
            p.d().h(new Throwable[0]);
            this.f9865r.g();
            c();
            this.f9864q = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f9865r;
        aVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        int i9 = a.f7428x;
        l lVar = aVar.f7429o;
        if (zEquals) {
            p pVarD = p.d();
            String.format("Started foreground service %s", intent);
            pVarD.h(new Throwable[0]);
            aVar.f7430p.Q(new C1.p(aVar, lVar.f5642e, intent.getStringExtra("KEY_WORKSPEC_ID"), 4));
            aVar.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.f(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            p pVarD2 = p.d();
            String.format("Stopping foreground work for %s", intent);
            pVarD2.h(new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra);
            lVar.getClass();
            lVar.f5643f.Q(new X3.a(lVar, uuidFromString, 0));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        p.d().h(new Throwable[0]);
        SystemForegroundService systemForegroundService = aVar.f7437w;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f9864q = true;
        p.d().b(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
