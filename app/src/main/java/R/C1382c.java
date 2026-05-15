package r;

import B1.d;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j5.AbstractC1110d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: r.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1382c extends AbstractC1110d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15602a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f15603b = Executors.newFixedThreadPool(4, new ThreadFactoryC1381b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f15604c;

    public static Handler L(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
