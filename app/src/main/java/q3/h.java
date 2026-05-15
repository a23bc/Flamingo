package Q3;

import N3.p;
import O3.l;
import X3.i;
import X3.r;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class h implements O3.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6136y = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f6137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A0.b f6138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f6139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final O3.b f6140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f6141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f6142t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f6143u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f6144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Intent f6145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SystemAlarmService f6146x;

    static {
        p.i("SystemAlarmDispatcher");
    }

    public h(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f6137o = applicationContext;
        this.f6142t = new b(applicationContext);
        this.f6139q = new r();
        l lVarL0 = l.l0(systemAlarmService);
        this.f6141s = lVarL0;
        O3.b bVar = lVarL0.h;
        this.f6140r = bVar;
        this.f6138p = lVarL0.f5643f;
        bVar.b(this);
        this.f6144v = new ArrayList();
        this.f6145w = null;
        this.f6143u = new Handler(Looper.getMainLooper());
    }

    @Override // O3.a
    public final void a(String str, boolean z6) {
        int i7 = b.f6111r;
        Intent intent = new Intent(this.f6137o, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        f(new g(this, intent, 0, 0));
    }

    public final void b(Intent intent, int i7) {
        p pVarD = p.d();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i7));
        pVarD.b(new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            p.d().j(new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f6144v) {
            try {
                boolean zIsEmpty = this.f6144v.isEmpty();
                this.f6144v.add(intent);
                if (zIsEmpty) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f6143u.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.f6144v) {
            try {
                Iterator it = this.f6144v.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        p.d().b(new Throwable[0]);
        this.f6140r.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f6139q.f8308a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f6146x = null;
    }

    public final void f(Runnable runnable) {
        this.f6143u.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock wakeLockA = i.a(this.f6137o, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f6141s.f5643f.Q(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
