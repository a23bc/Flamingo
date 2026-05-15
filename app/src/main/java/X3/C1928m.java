package x3;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import q.S0;

/* JADX INFO: renamed from: x3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1928m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20066b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1925j f20067a;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public C1928m(Context context, ComponentName componentName, S0 s02) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20067a = new C1926k(context, componentName, s02);
        } else {
            this.f20067a = new C1925j(context, componentName, s02);
        }
    }
}
