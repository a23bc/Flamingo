package e6;

import android.graphics.Bitmap;
import m5.AbstractC1209k;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Bitmap a(Bitmap bitmap, int i7) {
        boolean z6 = (i7 & 2) == 0;
        boolean z7 = (i7 & 4) == 0;
        AbstractC1209k.f(bitmap, "bitmap");
        int i8 = z6 ? 4 : (!SettingsLibrary.INSTANCE.getNowplayingBackgroundEffect() || z7) ? 32 : 86;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (width - iMin) / 2, (height - iMin) / 2, iMin, iMin);
        AbstractC1209k.e(bitmapCreateBitmap, "createBitmap(...)");
        if (iMin > i8) {
            int i9 = iMin / (iMin / i8);
            bitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i9, i9, true);
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        AbstractC1209k.e(bitmapCopy, "copy(...)");
        return bitmapCopy;
    }
}
