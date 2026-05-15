package androidx.work.impl.workers;

import B3.c;
import N3.p;
import S3.b;
import Y3.j;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f9867y = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WorkerParameters f9868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f9869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f9870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f9871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListenableWorker f9872x;

    static {
        p.i("ConstraintTrkngWrkr");
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9868t = workerParameters;
        this.f9869u = new Object();
        this.f9870v = false;
        this.f9871w = new j();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean b() {
        ListenableWorker listenableWorker = this.f9872x;
        return listenableWorker != null && listenableWorker.b();
    }

    @Override // S3.b
    public final void c(ArrayList arrayList) {
        p pVarD = p.d();
        String.format("Constraints changed for %s", arrayList);
        pVarD.b(new Throwable[0]);
        synchronized (this.f9869u) {
            this.f9870v = true;
        }
    }

    @Override // S3.b
    public final void d(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final void e() {
        ListenableWorker listenableWorker = this.f9872x;
        if (listenableWorker == null || listenableWorker.f9839q) {
            return;
        }
        this.f9872x.g();
    }

    @Override // androidx.work.ListenableWorker
    public final j f() {
        this.f9838p.f9846d.execute(new c(8, this));
        return this.f9871w;
    }
}
