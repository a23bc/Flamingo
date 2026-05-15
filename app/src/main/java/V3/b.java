package V3;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Notification f7439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f7441r;

    public b(SystemForegroundService systemForegroundService, int i7, Notification notification, int i8) {
        this.f7441r = systemForegroundService;
        this.f7438o = i7;
        this.f7439p = notification;
        this.f7440q = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = Build.VERSION.SDK_INT;
        Notification notification = this.f7439p;
        int i8 = this.f7438o;
        SystemForegroundService systemForegroundService = this.f7441r;
        if (i7 >= 29) {
            systemForegroundService.startForeground(i8, notification, this.f7440q);
        } else {
            systemForegroundService.startForeground(i8, notification);
        }
    }
}
