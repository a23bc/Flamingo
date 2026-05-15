package w3;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* JADX INFO: renamed from: w3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731j {
    public static void a(NotificationManager notificationManager, String str, String str2) {
        NotificationChannel notificationChannelX = s0.g.x(str, str2);
        if (w2.t.f18881a <= 27) {
            notificationChannelX.setShowBadge(false);
        }
        notificationManager.createNotificationChannel(notificationChannelX);
    }
}
