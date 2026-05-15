package x3;

import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: b */
    public static final boolean f20041b = Log.isLoggable("MediaSessionManager", 3);

    /* JADX INFO: renamed from: c */
    public static final Object f20042c = new Object();

    /* JADX INFO: renamed from: d */
    public static volatile g0 f20043d;

    /* JADX INFO: renamed from: a */
    public b0 f20044a;

    public static g0 a(Context context) {
        g0 g0Var;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        synchronized (f20042c) {
            try {
                if (f20043d == null) {
                    Context applicationContext = context.getApplicationContext();
                    g0 g0Var2 = new g0();
                    if (Build.VERSION.SDK_INT >= 28) {
                        d0 d0Var = new d0(applicationContext);
                        g0Var2.f20044a = d0Var;
                    } else {
                        g0Var2.f20044a = new b0(applicationContext);
                    }
                    f20043d = g0Var2;
                }
                g0Var = f20043d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0Var;
    }

    public final boolean b(f0 f0Var) {
        if (f0Var != null) {
            return this.f20044a.a(f0Var.f20039a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
