package L2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static boolean a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i7 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i7 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
