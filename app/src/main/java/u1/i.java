package u1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import q.S0;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17159a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f17163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f17164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f17165g;
    public IconCompat h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S0 f17168k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f17169m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f17171o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f17173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Notification f17174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f17175s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17160b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17161c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17162d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17166i = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17170n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17172p = 0;

    public i(Context context, String str) {
        Notification notification = new Notification();
        this.f17174r = notification;
        this.f17159a = context;
        this.f17171o = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f17175s = new ArrayList();
        this.f17173q = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Notification a() {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.i.a():android.app.Notification");
    }

    public final void c(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f17159a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f9346k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f9348b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void d(S0 s02) {
        if (this.f17168k != s02) {
            this.f17168k = s02;
            if (((i) s02.f15225p) != this) {
                s02.f15225p = this;
                d(s02);
            }
        }
    }
}
