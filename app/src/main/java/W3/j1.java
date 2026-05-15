package w3;

import android.app.Notification;
import android.media.session.MediaSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, C1751t0 c1751t0) {
        mediaStyle.getClass();
        c1751t0.getClass();
        if (iArr != null) {
            d(mediaStyle, iArr);
        }
        mediaStyle.setMediaSession((MediaSession.Token) c1751t0.f19363a.h.f19005k.f20025a.f20007c.f20021p);
        return mediaStyle;
    }

    public static void c(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void d(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
