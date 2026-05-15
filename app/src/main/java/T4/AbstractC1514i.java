package t4;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: t4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1514i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f17080a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f17081b = new HashMap();

    static {
        new ConcurrentHashMap();
        Runtime.getRuntime().availableProcessors();
        new Timer();
    }
}
