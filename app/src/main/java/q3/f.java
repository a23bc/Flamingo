package Q3;

import N3.p;
import X3.i;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6130o;

    /* JADX INFO: renamed from: p */
    public final h f6131p;

    public /* synthetic */ f(h hVar, int i7) {
        this.f6130o = i7;
        this.f6131p = hVar;
    }

    private final void a() {
        synchronized (this.f6131p.f6144v) {
            h hVar = this.f6131p;
            hVar.f6145w = (Intent) hVar.f6144v.get(0);
        }
        Intent intent = this.f6131p.f6145w;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f6131p.f6145w.getIntExtra("KEY_START_ID", 0);
            p pVarD = p.d();
            int i7 = h.f6136y;
            String.format("Processing command %s, %s", this.f6131p.f6145w, Integer.valueOf(intExtra));
            pVarD.b(new Throwable[0]);
            PowerManager.WakeLock wakeLockA = i.a(this.f6131p.f6137o, action + " (" + intExtra + ")");
            try {
                p pVarD2 = p.d();
                Objects.toString(wakeLockA);
                pVarD2.b(new Throwable[0]);
                wakeLockA.acquire();
                h hVar2 = this.f6131p;
                hVar2.f6142t.e(hVar2.f6145w, intExtra, hVar2);
                p pVarD3 = p.d();
                wakeLockA.toString();
                pVarD3.b(new Throwable[0]);
                wakeLockA.release();
                h hVar3 = this.f6131p;
                hVar3.f(new f(hVar3, 1));
            } catch (Throwable th) {
                try {
                    p pVarD4 = p.d();
                    int i8 = h.f6136y;
                    pVarD4.c(th);
                    p pVarD5 = p.d();
                    Objects.toString(wakeLockA);
                    pVarD5.b(new Throwable[0]);
                    wakeLockA.release();
                    h hVar4 = this.f6131p;
                    hVar4.f(new f(hVar4, 1));
                } catch (Throwable th2) {
                    p pVarD6 = p.d();
                    int i9 = h.f6136y;
                    Objects.toString(wakeLockA);
                    pVarD6.b(new Throwable[0]);
                    wakeLockA.release();
                    h hVar5 = this.f6131p;
                    hVar5.f(new f(hVar5, 1));
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6130o) {
            case 0:
                a();
                return;
            default:
                h hVar = this.f6131p;
                hVar.getClass();
                p pVarD = p.d();
                int i7 = h.f6136y;
                pVarD.b(new Throwable[0]);
                hVar.c();
                synchronized (hVar.f6144v) {
                    try {
                        if (hVar.f6145w != null) {
                            p pVarD2 = p.d();
                            String.format("Removing command %s", hVar.f6145w);
                            pVarD2.b(new Throwable[0]);
                            if (!((Intent) hVar.f6144v.remove(0)).equals(hVar.f6145w)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar.f6145w = null;
                        }
                        X3.g gVar = (X3.g) hVar.f6138p.f50p;
                        if (!hVar.f6142t.d() && hVar.f6144v.isEmpty() && !gVar.a()) {
                            p.d().b(new Throwable[0]);
                            SystemAlarmService systemAlarmService = hVar.f6146x;
                            if (systemAlarmService != null) {
                                systemAlarmService.c();
                            }
                        } else if (!hVar.f6144v.isEmpty()) {
                            hVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
