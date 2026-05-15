package t4;

import android.app.NotificationChannel;
import android.os.Build;

/* JADX INFO: renamed from: t4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1508c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1508c f17069b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationChannel f17070a;

    static {
        String packageName = i6.h.z().getPackageName();
        String packageName2 = i6.h.z().getPackageName();
        C1508c c1508c = new C1508c();
        if (Build.VERSION.SDK_INT >= 26) {
            c1508c.f17070a = s0.g.b(packageName, packageName2);
        }
        f17069b = c1508c;
    }
}
