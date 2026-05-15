package d;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0754g f10762a = new C0754g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        AbstractC1209k.f(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC1209k.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
