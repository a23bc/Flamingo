package x3;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static Bundle a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
