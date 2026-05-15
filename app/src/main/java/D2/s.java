package D2;

import android.media.MediaDrmResetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
