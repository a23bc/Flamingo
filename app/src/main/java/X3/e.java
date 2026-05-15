package X3;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        N3.p.i("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z6) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            N3.p.d().b(new Throwable[0]);
        } catch (Exception e7) {
            N3.p.d().b(e7);
        }
    }
}
