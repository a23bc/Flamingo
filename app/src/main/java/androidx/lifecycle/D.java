package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0586i {
    final /* synthetic */ E this$0;

    public static final class a extends AbstractC0586i {
        final /* synthetic */ E this$0;

        public a(E e7) {
            this.this$0 = e7;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1209k.f(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1209k.f(activity, "activity");
            E e7 = this.this$0;
            int i7 = e7.f9685o + 1;
            e7.f9685o = i7;
            if (i7 == 1 && e7.f9688r) {
                e7.f9690t.r(EnumC0592o.ON_START);
                e7.f9688r = false;
            }
        }
    }

    public D(E e7) {
        this.this$0 = e7;
    }

    @Override // androidx.lifecycle.AbstractC0586i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1209k.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = H.f9693p;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC1209k.d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) fragmentFindFragmentByTag).f9694o = this.this$0.f9692v;
        }
    }

    @Override // androidx.lifecycle.AbstractC0586i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1209k.f(activity, "activity");
        E e7 = this.this$0;
        int i7 = e7.f9686p - 1;
        e7.f9686p = i7;
        if (i7 == 0) {
            Handler handler = e7.f9689s;
            AbstractC1209k.c(handler);
            handler.postDelayed(e7.f9691u, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1209k.f(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0586i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1209k.f(activity, "activity");
        E e7 = this.this$0;
        int i7 = e7.f9685o - 1;
        e7.f9685o = i7;
        if (i7 == 0 && e7.f9687q) {
            e7.f9690t.r(EnumC0592o.ON_STOP);
            e7.f9688r = true;
        }
    }
}
