package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public class H extends Fragment {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f9693p = 0;

    /* JADX INFO: renamed from: o */
    public W f9694o;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new G();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC1209k.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC1209k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC1209k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC1209k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC1209k.f(activity, "activity");
            int i7 = H.f9693p;
            F.a(activity, EnumC0592o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1209k.f(activity, "activity");
            int i7 = H.f9693p;
            F.a(activity, EnumC0592o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1209k.f(activity, "activity");
            int i7 = H.f9693p;
            F.a(activity, EnumC0592o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC1209k.f(activity, "activity");
            int i7 = H.f9693p;
            F.a(activity, EnumC0592o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC1209k.f(activity, "activity");
            int i7 = H.f9693p;
            F.a(activity, EnumC0592o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC1209k.f(activity, "activity");
            int i7 = H.f9693p;
            F.a(activity, EnumC0592o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC1209k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC1209k.f(activity, "activity");
            AbstractC1209k.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC1209k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC1209k.f(activity, "activity");
        }
    }

    public final void a(EnumC0592o enumC0592o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1209k.e(activity, "getActivity(...)");
            F.a(activity, enumC0592o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0592o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0592o.ON_DESTROY);
        this.f9694o = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0592o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        W w7 = this.f9694o;
        if (w7 != null) {
            ((E) w7.f9729a).c();
        }
        a(EnumC0592o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        W w7 = this.f9694o;
        if (w7 != null) {
            E e7 = (E) w7.f9729a;
            int i7 = e7.f9685o + 1;
            e7.f9685o = i7;
            if (i7 == 1 && e7.f9688r) {
                e7.f9690t.r(EnumC0592o.ON_START);
                e7.f9688r = false;
            }
        }
        a(EnumC0592o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0592o.ON_STOP);
    }
}
