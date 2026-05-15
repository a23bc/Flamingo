package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final void a(Activity activity, D.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
