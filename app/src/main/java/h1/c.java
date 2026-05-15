package H1;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ BlendModeColorFilter d(int i7) {
        return new BlendModeColorFilter(i7, BlendMode.SRC_ATOP);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession g(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
