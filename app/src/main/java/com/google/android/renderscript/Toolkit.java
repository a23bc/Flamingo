package com.google.android.renderscript;

import I0.c;
import android.graphics.Bitmap;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Toolkit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f10709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Toolkit f10710b;

    static {
        Toolkit toolkit = new Toolkit();
        f10710b = toolkit;
        System.loadLibrary("renderscript-toolkit");
        f10709a = toolkit.createNative();
    }

    public static Bitmap a(Bitmap bitmap) {
        Toolkit toolkit = f10710b;
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException(("RenderScript Toolkit. blur supports only ARGB_8888 and ALPHA_8 bitmaps. " + bitmap.getConfig() + " provided.").toString());
        }
        if (c.Y(bitmap) * bitmap.getWidth() == bitmap.getRowBytes()) {
            bitmap.getWidth();
            bitmap.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            AbstractC1209k.e(bitmapCreateBitmap, "outputBitmap");
            toolkit.nativeBlurBitmap(f10709a, bitmap, bitmapCreateBitmap, 25, null);
            return bitmapCreateBitmap;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit blur. Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=" + bitmap.getRowBytes() + ", width={" + bitmap.getWidth() + ", and vectorSize=" + c.Y(bitmap) + '.').toString());
    }

    private final native long createNative();

    private final native void nativeBlurBitmap(long j3, Bitmap bitmap, Bitmap bitmap2, int i7, Range2d range2d);
}
