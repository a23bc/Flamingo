package androidx.work;

import B3.c;
import N3.n;
import Y3.j;
import android.annotation.SuppressLint;
import android.content.Context;
import i.InterfaceC1052a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f9842t;

    @SuppressLint({"BanKeepAnnotation"})
    @InterfaceC1052a
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final j f() {
        this.f9842t = new j();
        this.f9838p.f9846d.execute(new c(5, this));
        return this.f9842t;
    }

    public abstract n h();
}
