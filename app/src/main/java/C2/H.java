package C2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static void a(AudioTrack audioTrack, B2.p pVar) {
        B2.o oVar = pVar.f809b;
        oVar.getClass();
        LogSessionId logSessionId = oVar.f807a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
