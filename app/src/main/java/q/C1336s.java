package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* JADX INFO: renamed from: q.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1336s {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f15388b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C1336s f15389c;

    /* JADX INFO: renamed from: a */
    public K0 f15390a;

    public static synchronized C1336s a() {
        try {
            if (f15389c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15389c;
    }

    public static synchronized void c() {
        if (f15389c == null) {
            C1336s c1336s = new C1336s();
            f15389c = c1336s;
            c1336s.f15390a = K0.d();
            f15389c.f15390a.m(new B2.h(2));
        }
    }

    public static void d(Drawable drawable, F5.h hVar, int[] iArr) {
        PorterDuff.Mode mode = K0.h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z6 = hVar.f2359b;
            if (z6 || hVar.f2358a) {
                PorterDuffColorFilter porterDuffColorFilterH = null;
                ColorStateList colorStateList = z6 ? (ColorStateList) hVar.f2360c : null;
                PorterDuff.Mode mode2 = hVar.f2358a ? (PorterDuff.Mode) hVar.f2361d : K0.h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterH = K0.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterH);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i7) {
        return this.f15390a.f(context, i7);
    }
}
