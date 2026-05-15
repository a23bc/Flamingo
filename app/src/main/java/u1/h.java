package u1;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    public final Bundle f17152a;

    /* JADX INFO: renamed from: b */
    public IconCompat f17153b;

    /* JADX INFO: renamed from: c */
    public final boolean f17154c;

    /* JADX INFO: renamed from: d */
    public final boolean f17155d;

    /* JADX INFO: renamed from: e */
    public final int f17156e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f17157f;

    /* JADX INFO: renamed from: g */
    public final PendingIntent f17158g;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f17155d = true;
        this.f17153b = iconCompat;
        int iIntValue = iconCompat.f9347a;
        if (iIntValue == -1) {
            int i7 = Build.VERSION.SDK_INT;
            Object obj = iconCompat.f9348b;
            if (i7 >= 28) {
                iIntValue = B1.d.n(obj);
            } else {
                try {
                    iIntValue = ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
                } catch (IllegalAccessException unused) {
                    Objects.toString(obj);
                    iIntValue = -1;
                } catch (NoSuchMethodException unused2) {
                    Objects.toString(obj);
                    iIntValue = -1;
                } catch (InvocationTargetException unused3) {
                    Objects.toString(obj);
                    iIntValue = -1;
                }
            }
        }
        if (iIntValue == 2) {
            this.f17156e = iconCompat.c();
        }
        this.f17157f = i.b(charSequence);
        this.f17158g = pendingIntent;
        this.f17152a = bundle;
        this.f17154c = true;
        this.f17155d = true;
    }

    public final IconCompat a() {
        int i7;
        if (this.f17153b == null && (i7 = this.f17156e) != 0) {
            this.f17153b = IconCompat.b(null, "", i7);
        }
        return this.f17153b;
    }
}
