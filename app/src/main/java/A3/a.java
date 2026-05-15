package A3;

import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i7) {
        return new JobInfo.TriggerContentUri(uri, i7);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e(int i7, int i8) {
        return new MediaCodec.CryptoInfo.Pattern(i7, i8);
    }

    public static /* bridge */ /* synthetic */ LocaleList g(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ void n() {
    }
}
