package Q3;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f6134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f6135r;

    public /* synthetic */ g(Object obj, Object obj2, int i7, int i8) {
        this.f6132o = i8;
        this.f6134q = obj;
        this.f6135r = obj2;
        this.f6133p = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6132o) {
            case 0:
                ((h) this.f6134q).b((Intent) this.f6135r, this.f6133p);
                break;
            case 1:
                ((SystemForegroundService) this.f6135r).f9866s.notify(this.f6133p, (Notification) this.f6134q);
                break;
            default:
                ((TextView) this.f6134q).setTypeface((Typeface) this.f6135r, this.f6133p);
                break;
        }
    }

    public g(SystemForegroundService systemForegroundService, int i7, Notification notification) {
        this.f6132o = 1;
        this.f6135r = systemForegroundService;
        this.f6133p = i7;
        this.f6134q = notification;
    }
}
