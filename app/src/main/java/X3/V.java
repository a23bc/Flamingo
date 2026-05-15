package x3;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j3) {
        return new MediaSession.QueueItem(mediaDescription, j3);
    }

    public static MediaDescription b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
