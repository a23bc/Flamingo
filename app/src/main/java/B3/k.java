package B3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    public volatile I3.b f849a;

    /* JADX INFO: renamed from: b */
    public Executor f850b;

    /* JADX INFO: renamed from: c */
    public H3.b f851c;

    /* JADX INFO: renamed from: d */
    public final f f852d;

    /* JADX INFO: renamed from: e */
    public boolean f853e;

    /* JADX INFO: renamed from: f */
    public boolean f854f;

    /* JADX INFO: renamed from: g */
    public ArrayList f855g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i */
    public final ThreadLocal f856i = new ThreadLocal();

    public k() {
        new ConcurrentHashMap();
        this.f852d = d();
    }

    public final void a() {
        if (!this.f853e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f851c.x().f3474p).inTransaction() && this.f856i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        I3.b bVarX = this.f851c.x();
        this.f852d.c(bVarX);
        bVarX.b();
    }

    public abstract f d();

    public abstract H3.b e(a aVar);

    public final void f() {
        this.f851c.x().i();
        if (((SQLiteDatabase) this.f851c.x().f3474p).inTransaction()) {
            return;
        }
        f fVar = this.f852d;
        if (fVar.f831d.compareAndSet(false, true)) {
            fVar.f830c.f850b.execute(fVar.f835i);
        }
    }

    public final Cursor g(H3.c cVar) {
        a();
        b();
        return this.f851c.x().n(cVar);
    }

    public final void h() {
        this.f851c.x().q();
    }
}
