package androidx.work;

import I4.y;
import Y3.j;
import android.annotation.SuppressLint;
import android.content.Context;
import i.InterfaceC1052a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f9837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WorkerParameters f9838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f9839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9841s;

    @SuppressLint({"BanKeepAnnotation"})
    @InterfaceC1052a
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f9837o = context;
        this.f9838p = workerParameters;
    }

    public y a() {
        j jVar = new j();
        jVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public boolean b() {
        return this.f9841s;
    }

    public void e() {
    }

    public abstract j f();

    public final void g() {
        this.f9839q = true;
        e();
    }
}
