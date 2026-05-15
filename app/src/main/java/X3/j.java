package X3;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y3.j f8287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k f8288q;

    public /* synthetic */ j(k kVar, Y3.j jVar, int i7) {
        this.f8286o = i7;
        this.f8288q = kVar;
        this.f8287p = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y3.j jVar = this.f8287p;
        k kVar = this.f8288q;
        switch (this.f8286o) {
            case 0:
                jVar.l(kVar.f8293r.a());
                return;
            default:
                Y3.j jVar2 = kVar.f8290o;
                try {
                    N3.i iVar = (N3.i) jVar.get();
                    W3.i iVar2 = kVar.f8292q;
                    if (iVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + iVar2.f7807c + ") but did not provide ForegroundInfo");
                    }
                    N3.p pVarD = N3.p.d();
                    int i7 = k.f8289u;
                    String str = iVar2.f7807c;
                    pVarD.b(new Throwable[0]);
                    ListenableWorker listenableWorker = kVar.f8293r;
                    listenableWorker.f9841s = true;
                    m mVar = kVar.f8294s;
                    Context context = kVar.f8291p;
                    UUID uuid = listenableWorker.f9838p.f9843a;
                    mVar.getClass();
                    Y3.j jVar3 = new Y3.j();
                    mVar.f8302a.Q(new l(mVar, jVar3, uuid, iVar, context, 0));
                    jVar2.l(jVar3);
                    return;
                } catch (Throwable th) {
                    jVar2.k(th);
                    return;
                }
        }
    }
}
