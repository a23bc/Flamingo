package O3;

import C1.o;
import G1.AbstractC0144k;
import I4.y;
import N2.z;
import N3.p;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f5606z = 0;

    /* JADX INFO: renamed from: p */
    public final Context f5608p;

    /* JADX INFO: renamed from: q */
    public final N3.b f5609q;

    /* JADX INFO: renamed from: r */
    public final A0.b f5610r;

    /* JADX INFO: renamed from: s */
    public final WorkDatabase f5611s;

    /* JADX INFO: renamed from: v */
    public final List f5614v;

    /* JADX INFO: renamed from: u */
    public final HashMap f5613u = new HashMap();

    /* JADX INFO: renamed from: t */
    public final HashMap f5612t = new HashMap();

    /* JADX INFO: renamed from: w */
    public final HashSet f5615w = new HashSet();

    /* JADX INFO: renamed from: x */
    public final ArrayList f5616x = new ArrayList();

    /* JADX INFO: renamed from: o */
    public PowerManager.WakeLock f5607o = null;

    /* JADX INFO: renamed from: y */
    public final Object f5617y = new Object();

    static {
        p.i("Processor");
    }

    public b(Context context, N3.b bVar, A0.b bVar2, WorkDatabase workDatabase, List list) {
        this.f5608p = context;
        this.f5609q = bVar;
        this.f5610r = bVar2;
        this.f5611s = workDatabase;
        this.f5614v = list;
    }

    public static boolean c(String str, m mVar) {
        boolean zIsDone;
        if (mVar == null) {
            p.d().b(new Throwable[0]);
            return false;
        }
        mVar.f5654F = true;
        mVar.i();
        y yVar = mVar.f5653E;
        if (yVar != null) {
            zIsDone = yVar.isDone();
            mVar.f5653E.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = mVar.f5659s;
        if (listenableWorker == null || zIsDone) {
            Objects.toString(mVar.f5658r);
            p pVarD = p.d();
            int i7 = m.f5648G;
            pVarD.b(new Throwable[0]);
        } else {
            listenableWorker.g();
        }
        p.d().b(new Throwable[0]);
        return true;
    }

    @Override // O3.a
    public final void a(String str, boolean z6) {
        synchronized (this.f5617y) {
            try {
                this.f5613u.remove(str);
                p.d().b(new Throwable[0]);
                Iterator it = this.f5616x.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(str, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this.f5617y) {
            this.f5616x.add(aVar);
        }
    }

    public final boolean d(String str) {
        boolean zContains;
        synchronized (this.f5617y) {
            zContains = this.f5615w.contains(str);
        }
        return zContains;
    }

    public final boolean e(String str) {
        boolean z6;
        synchronized (this.f5617y) {
            try {
                z6 = this.f5613u.containsKey(str) || this.f5612t.containsKey(str);
            } finally {
            }
        }
        return z6;
    }

    public final void f(a aVar) {
        synchronized (this.f5617y) {
            this.f5616x.remove(aVar);
        }
    }

    public final void g(String str, N3.i iVar) {
        synchronized (this.f5617y) {
            try {
                p.d().h(new Throwable[0]);
                m mVar = (m) this.f5613u.remove(str);
                if (mVar != null) {
                    if (this.f5607o == null) {
                        PowerManager.WakeLock wakeLockA = X3.i.a(this.f5608p, "ProcessorForegroundLck");
                        this.f5607o = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f5612t.put(str, mVar);
                    Intent intentE = V3.a.e(this.f5608p, str, iVar);
                    Context context = this.f5608p;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC0144k.k(context, intentE);
                    } else {
                        context.startService(intentE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(String str, z zVar) {
        synchronized (this.f5617y) {
            try {
                if (e(str)) {
                    p.d().b(new Throwable[0]);
                    return false;
                }
                Context context = this.f5608p;
                N3.b bVar = this.f5609q;
                A0.b bVar2 = this.f5610r;
                WorkDatabase workDatabase = this.f5611s;
                List list = Collections.EMPTY_LIST;
                Context applicationContext = context.getApplicationContext();
                List list2 = this.f5614v;
                m mVar = new m();
                mVar.f5661u = new N3.l();
                mVar.f5652D = new Y3.j();
                mVar.f5653E = null;
                mVar.f5655o = applicationContext;
                mVar.f5660t = bVar2;
                mVar.f5663w = this;
                mVar.f5656p = str;
                mVar.f5657q = list2;
                mVar.f5659s = null;
                mVar.f5662v = bVar;
                mVar.f5664x = workDatabase;
                mVar.f5665y = workDatabase.n();
                mVar.f5666z = workDatabase.i();
                mVar.f5649A = workDatabase.o();
                Y3.j jVar = mVar.f5652D;
                C1.p pVar = new C1.p(1);
                pVar.f970p = this;
                pVar.f971q = str;
                pVar.f972r = jVar;
                jVar.b(pVar, (o) this.f5610r.f52r);
                this.f5613u.put(str, mVar);
                ((X3.g) this.f5610r.f50p).execute(mVar);
                p.d().b(new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f5617y) {
            try {
                if (this.f5612t.isEmpty()) {
                    Context context = this.f5608p;
                    int i7 = V3.a.f7428x;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f5608p.startService(intent);
                    } catch (Throwable th) {
                        p.d().c(th);
                    }
                    PowerManager.WakeLock wakeLock = this.f5607o;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f5607o = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean zC;
        synchronized (this.f5617y) {
            p.d().b(new Throwable[0]);
            zC = c(str, (m) this.f5612t.remove(str));
        }
        return zC;
    }

    public final boolean k(String str) {
        boolean zC;
        synchronized (this.f5617y) {
            p.d().b(new Throwable[0]);
            zC = c(str, (m) this.f5613u.remove(str));
        }
        return zC;
    }
}
