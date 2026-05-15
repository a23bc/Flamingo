package T1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class q implements i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f6882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1.f f6883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final N2.z f6884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f6885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Handler f6886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ThreadPoolExecutor f6887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ThreadPoolExecutor f6888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.support.v4.media.session.b f6889v;

    public q(Context context, C1.f fVar) {
        N2.z zVar = r.f6890d;
        this.f6885r = new Object();
        N5.d.r(context, "Context cannot be null");
        this.f6882o = context.getApplicationContext();
        this.f6883p = fVar;
        this.f6884q = zVar;
    }

    @Override // T1.i
    public final void a(android.support.v4.media.session.b bVar) {
        synchronized (this.f6885r) {
            this.f6889v = bVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f6885r) {
            try {
                this.f6889v = null;
                Handler handler = this.f6886s;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f6886s = null;
                ThreadPoolExecutor threadPoolExecutor = this.f6888u;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f6887t = null;
                this.f6888u = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f6885r) {
            try {
                if (this.f6889v == null) {
                    return;
                }
                if (this.f6887t == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f6888u = threadPoolExecutor;
                    this.f6887t = threadPoolExecutor;
                }
                this.f6887t.execute(new B2.e(10, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1.l d() {
        try {
            N2.z zVar = this.f6884q;
            Context context = this.f6882o;
            C1.f fVar = this.f6883p;
            zVar.getClass();
            Object[] objArr = {fVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C1.k kVarA = C1.e.a(context, Collections.unmodifiableList(arrayList));
            int i7 = kVarA.f959o;
            if (i7 != 0) {
                throw new RuntimeException(Z1.l.o(i7, "fetchFonts failed (", ")"));
            }
            C1.l[] lVarArr = (C1.l[]) ((List) kVarA.f960p).get(0);
            if (lVarArr == null || lVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return lVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
