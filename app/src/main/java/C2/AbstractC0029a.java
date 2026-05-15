package C2;

import android.content.ClipData;
import android.media.MediaDrm;
import android.view.ContentInfo;
import android.view.View;
import android.window.SplashScreenView;

/* JADX INFO: renamed from: C2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0029a {
    public static /* bridge */ /* synthetic */ boolean B(View view) {
        return view instanceof SplashScreenView;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent k(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ ContentInfo.Builder l(ClipData clipData, int i7) {
        return new ContentInfo.Builder(clipData, i7);
    }

    public static /* bridge */ /* synthetic */ ContentInfo n(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView p(View view) {
        return (SplashScreenView) view;
    }
}
