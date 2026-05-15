package L2;

import android.view.Surface;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static void a(Surface surface, float f7) {
        try {
            surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e7) {
            AbstractC1697a.n("Failed to call Surface.setFrameRate", e7);
        }
    }
}
