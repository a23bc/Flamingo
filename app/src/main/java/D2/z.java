package D2;

import C2.AbstractC0029a;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, B2.p pVar) {
        B2.o oVar = pVar.f809b;
        oVar.getClass();
        LogSessionId logSessionId = oVar.f807a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        AbstractC0029a.k(playbackComponent).setLogSessionId(logSessionId);
    }
}
