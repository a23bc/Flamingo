package X3;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f8308a;

    /* JADX INFO: renamed from: b */
    public final HashMap f8309b;

    /* JADX INFO: renamed from: c */
    public final HashMap f8310c;

    /* JADX INFO: renamed from: d */
    public final Object f8311d;

    static {
        N3.p.i("WorkTimer");
    }

    public r() {
        o oVar = new o();
        oVar.f8305o = 0;
        this.f8309b = new HashMap();
        this.f8310c = new HashMap();
        this.f8311d = new Object();
        this.f8308a = Executors.newSingleThreadScheduledExecutor(oVar);
    }

    public final void a(String str, Q3.e eVar) {
        synchronized (this.f8311d) {
            N3.p.d().b(new Throwable[0]);
            b(str);
            q qVar = new q(this, str);
            this.f8309b.put(str, qVar);
            this.f8310c.put(str, eVar);
            this.f8308a.schedule(qVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f8311d) {
            try {
                if (((q) this.f8309b.remove(str)) != null) {
                    N3.p.d().b(new Throwable[0]);
                    this.f8310c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
