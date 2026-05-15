package C4;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1205a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f1205a = iArr;
        iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
    }
}
