package i4;

import android.graphics.RenderNode;
import android.media.session.MediaSession;
import android.os.Bundle;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: i4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1086a {
    public static /* synthetic */ RenderNode d() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ MediaSession e(YosPlaybackService yosPlaybackService, String str, Bundle bundle) {
        return new MediaSession(yosPlaybackService, str, bundle);
    }
}
