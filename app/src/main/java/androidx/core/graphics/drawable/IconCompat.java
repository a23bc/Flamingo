package androidx.core.graphics.drawable;

import B1.d;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f9346k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f9349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f9350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f9353g;
    public PorterDuff.Mode h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f9354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9355j;

    public IconCompat() {
        this.f9347a = -1;
        this.f9349c = null;
        this.f9350d = null;
        this.f9351e = 0;
        this.f9352f = 0;
        this.f9353g = null;
        this.h = f9346k;
        this.f9354i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z6) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f7 = iMin;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z6) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i7) {
        str.getClass();
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f9351e = i7;
        if (resources != null) {
            try {
                iconCompat.f9348b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f9348b = str;
        }
        iconCompat.f9355j = str;
        return iconCompat;
    }

    public final int c() {
        int i7 = this.f9347a;
        if (i7 != -1) {
            if (i7 == 2) {
                return this.f9351e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj = this.f9348b;
        if (i8 >= 28) {
            return d.f(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final String d() {
        int i7 = this.f9347a;
        if (i7 == -1) {
            int i8 = Build.VERSION.SDK_INT;
            Object obj = this.f9348b;
            if (i8 >= 28) {
                return d.g(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i7 == 2) {
            String str = this.f9355j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f9348b).split(":", -1)[0] : this.f9355j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final Uri e() {
        int i7 = this.f9347a;
        if (i7 == -1) {
            int i8 = Build.VERSION.SDK_INT;
            Object obj = this.f9348b;
            if (i8 >= 28) {
                return d.o(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f9348b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Icon f(android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.f(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f9347a == -1) {
            return String.valueOf(this.f9348b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f9347a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f9347a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f9348b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f9348b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f9355j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f9351e);
                if (this.f9352f != 0) {
                    sb.append(" off=");
                    sb.append(this.f9352f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f9348b);
                break;
        }
        if (this.f9353g != null) {
            sb.append(" tint=");
            sb.append(this.f9353g);
        }
        if (this.h != f9346k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i7) {
        this.f9349c = null;
        this.f9350d = null;
        this.f9351e = 0;
        this.f9352f = 0;
        this.f9353g = null;
        this.h = f9346k;
        this.f9354i = null;
        this.f9347a = i7;
    }
}
