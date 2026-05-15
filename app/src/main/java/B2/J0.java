package b2;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f10073a = new AtomicBoolean(false);

    public static void a() {
        if (Build.VERSION.SDK_INT < 29 || !f10073a.get()) {
            return;
        }
        K0.f10078a.b("GlanceAppWidget::update", 0);
    }
}
