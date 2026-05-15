package X3;

import N3.v;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: o */
    public final O3.l f8282o;

    /* JADX INFO: renamed from: p */
    public final String f8283p;

    /* JADX INFO: renamed from: q */
    public final boolean f8284q;

    static {
        N3.p.i("StopWorkRunnable");
    }

    public h(O3.l lVar, String str, boolean z6) {
        this.f8282o = lVar;
        this.f8283p = str;
        this.f8284q = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        O3.l lVar = this.f8282o;
        WorkDatabase workDatabase = lVar.f5642e;
        O3.b bVar = lVar.h;
        W3.j jVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f8283p;
            synchronized (bVar.f5617y) {
                zContainsKey = bVar.f5612t.containsKey(str);
            }
            if (this.f8284q) {
                this.f8282o.h.j(this.f8283p);
            } else {
                if (!zContainsKey && jVarN.h(this.f8283p) == v.f5151p) {
                    jVarN.q(v.f5150o, this.f8283p);
                }
                this.f8282o.h.k(this.f8283p);
            }
            N3.p.d().b(new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
