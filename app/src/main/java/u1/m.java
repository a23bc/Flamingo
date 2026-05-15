package u1;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static void a(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void b(Notification.Builder builder, int i7) {
        builder.setForegroundServiceBehavior(i7);
    }
}
