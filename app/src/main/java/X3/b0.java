package x3;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f20030c = g0.f20041b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentResolver f20032b;

    public b0(Context context) {
        this.f20031a = context;
        this.f20032b = context.getContentResolver();
        this.f20031a = context;
    }

    @Override // x3.a0
    public boolean a(e0 e0Var) {
        if (this.f20031a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", e0Var.f20037b, e0Var.f20038c) == 0) {
            return true;
        }
        boolean z6 = false;
        try {
            if (this.f20031a.getPackageManager().getApplicationInfo(e0Var.f20036a, 0) != null) {
                if (b(e0Var, "android.permission.STATUS_BAR_SERVICE") || b(e0Var, "android.permission.MEDIA_CONTENT_CONTROL") || e0Var.f20038c == 1000) {
                    z6 = true;
                    break;
                }
                String string = Settings.Secure.getString(this.f20032b, "enabled_notification_listeners");
                if (string != null) {
                    for (String str : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(e0Var.f20036a)) {
                            z6 = true;
                            break;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (f20030c) {
                String str2 = e0Var.f20036a;
            }
        }
        return z6;
    }

    public final boolean b(e0 e0Var, String str) {
        int i7 = e0Var.f20037b;
        return i7 < 0 ? this.f20031a.getPackageManager().checkPermission(str, e0Var.f20036a) == 0 : this.f20031a.checkPermission(str, i7, e0Var.f20038c) == 0;
    }
}
