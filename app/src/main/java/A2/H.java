package A2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static B2.p a(Context context, N n7, boolean z6, String str) {
        MediaMetricsManager mediaMetricsManagerB = G.b(context.getSystemService("media_metrics"));
        B2.n nVar = mediaMetricsManagerB == null ? null : new B2.n(context, mediaMetricsManagerB.createPlaybackSession());
        if (nVar == null) {
            AbstractC1697a.w("MediaMetricsService unavailable.");
            return new B2.p(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z6) {
            n7.getClass();
            B2.i iVar = n7.f135s;
            iVar.getClass();
            iVar.f760t.a(nVar);
        }
        return new B2.p(nVar.f784c.getSessionId(), str);
    }
}
