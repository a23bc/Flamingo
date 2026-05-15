package w3;

import android.content.ComponentName;
import android.media.session.MediaSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class H0 {
    public static void a(x3.Z z6, ComponentName componentName) {
        MediaSession mediaSession = z6.f20025a.f20005a;
        mediaSession.getClass();
        mediaSession.setMediaButtonBroadcastReceiver(componentName);
    }
}
