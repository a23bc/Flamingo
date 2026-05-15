package u1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: u1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1530b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f17136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f17137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17139d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17140e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17141f = false;

    public C1530b(Activity activity) {
        this.f17137b = activity;
        this.f17138c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f17137b == activity) {
            this.f17137b = null;
            this.f17140e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f17140e || this.f17141f || this.f17139d) {
            return;
        }
        Object obj = this.f17136a;
        try {
            Object obj2 = c.f17144c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f17138c) {
                c.f17148g.postAtFrontOfQueue(new I4.t(c.f17143b.get(activity), 14, obj2));
                this.f17141f = true;
                this.f17136a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f17137b == activity) {
            this.f17139d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
