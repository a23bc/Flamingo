package com.hchen.superlyricapi;

import X.r;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.util.Base64;
import com.hchen.superlyricapi.ISuperLyric;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SoonBlockedPrivateApi"})
public class SuperLyricTool {
    public static int apiVersion = 20;
    public static boolean isEnabled = false;
    private static final String[] keys = {"android.media.metadata.ART", "android.media.metadata.ALBUM_ART", "android.media.metadata.DISPLAY_ICON"};
    private static Field mediaMetadataBundle;

    static {
        try {
            Field declaredField = MediaMetadata.class.getDeclaredField("mBundle");
            mediaMetadataBundle = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private SuperLyricTool() {
    }

    private static String adaptiveIconDrawableBase64(AdaptiveIconDrawable adaptiveIconDrawable) {
        Drawable background = adaptiveIconDrawable.getBackground();
        Drawable foreground = adaptiveIconDrawable.getForeground();
        if (background == null || foreground == null) {
            return "";
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{background, foreground});
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        layerDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        layerDrawable.draw(canvas);
        return bitmapToBase64(bitmapCreateBitmap);
    }

    public static Bitmap base64ToBitmap(String str) {
        try {
            if (str.isEmpty()) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String bitmapToBase64(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static String drawableToBase64(Drawable drawable) {
        return r.z(drawable) ? adaptiveIconDrawableBase64(r.e(drawable)) : drawable instanceof BitmapDrawable ? bitmapToBase64(((BitmapDrawable) drawable).getBitmap()) : drawable instanceof VectorDrawable ? bitmapToBase64(makeDrawableToBitmap((VectorDrawable) drawable)) : "";
    }

    private static Bitmap makeDrawableToBitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static void registerSuperLyric(Context context, ISuperLyric.Stub stub) {
        Intent intent = new Intent("Super_Lyric");
        Bundle bundle = new Bundle();
        bundle.putBinder("super_lyric_binder", stub);
        intent.putExtras(bundle);
        context.sendBroadcast(intent);
    }

    public static MediaMetadata removeMediaMetadataBitmap(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null || mediaMetadataBundle == null) {
            return null;
        }
        try {
            MediaMetadata mediaMetadataBuild = new MediaMetadata.Builder(mediaMetadata).build();
            Bundle bundle = (Bundle) mediaMetadataBundle.get(mediaMetadataBuild);
            if (bundle == null) {
                return null;
            }
            for (String str : keys) {
                bundle.remove(str);
            }
            return mediaMetadataBuild;
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public static void unregisterSuperLyric(Context context, ISuperLyric.Stub stub) {
        Intent intent = new Intent("Super_Lyric");
        Bundle bundle = new Bundle();
        bundle.putBinder("super_lyric_un_binder", stub);
        intent.putExtras(bundle);
        context.sendBroadcast(intent);
    }
}
