package s4;

import A2.W;
import F5.m;
import Z4.n;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;
import m5.AbstractC1209k;
import q4.C1377a;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f15919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f15920b;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap.Config unused = Bitmap.Config.RGBA_F16;
        } else {
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        }
        f15919a = i7 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f15920b = new m((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC1545g.Z(str)) {
            return null;
        }
        String strR0 = AbstractC1545g.r0(AbstractC1545g.r0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC1545g.p0(AbstractC1545g.p0(strR0, '/', strR0), '.', ""));
    }

    public static final boolean c(Uri uri) {
        return AbstractC1209k.a(uri.getScheme(), "file") && AbstractC1209k.a((String) n.r0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(j0.k kVar, q4.g gVar) {
        if (kVar instanceof C1377a) {
            return ((C1377a) kVar).f15582a;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new W();
    }
}
