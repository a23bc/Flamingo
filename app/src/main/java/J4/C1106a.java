package j4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: j4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1106a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13702a;

    public /* synthetic */ C1106a(int i7) {
        this.f13702a = i7;
    }

    @Override // j4.f
    public final g a(Object obj, p4.l lVar) {
        switch (this.f13702a) {
            case 0:
                Uri uri = (Uri) obj;
                if (s4.e.c(uri)) {
                    return new b(uri, lVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, lVar, 0);
            case 2:
                return new c((ByteBuffer) obj, lVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (AbstractC1209k.a(uri2.getScheme(), "content")) {
                    return new b(uri2, lVar, 1);
                }
                return null;
            case 4:
                return new c((Drawable) obj, lVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC1209k.a(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, lVar, 2);
                }
                return null;
        }
    }
}
