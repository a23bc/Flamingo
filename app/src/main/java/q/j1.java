package q;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f15320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f15321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f15322c;

    static {
        f15322c = Build.VERSION.SDK_INT >= 27;
    }
}
