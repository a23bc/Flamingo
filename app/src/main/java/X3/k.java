package X3;

import android.content.Context;
import androidx.work.ListenableWorker;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f8289u = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y3.j f8290o = new Y3.j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f8291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W3.i f8292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ListenableWorker f8293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f8294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A0.b f8295t;

    static {
        N3.p.i("WorkForegroundRunnable");
    }

    public k(Context context, W3.i iVar, ListenableWorker listenableWorker, m mVar, A0.b bVar) {
        this.f8291p = context;
        this.f8292q = iVar;
        this.f8293r = listenableWorker;
        this.f8294s = mVar;
        this.f8295t = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f8292q.f7819q || B1.b.b()) {
            this.f8290o.j(null);
            return;
        }
        Y3.j jVar = new Y3.j();
        A0.b bVar = this.f8295t;
        ((C1.o) bVar.f52r).execute(new j(this, jVar, 0));
        jVar.b(new j(this, jVar, 1), (C1.o) bVar.f52r);
    }
}
