package F2;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(h hVar, B2.p pVar) {
        B2.o oVar = pVar.f809b;
        oVar.getClass();
        LogSessionId logSessionId = oVar.f807a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        hVar.f2220b.setString("log-session-id", logSessionId.getStringId());
    }
}
