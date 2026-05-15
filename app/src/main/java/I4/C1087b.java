package i4;

import I0.c;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import i6.h;
import java.util.ArrayList;
import o5.AbstractC1267a;
import q4.g;

/* JADX INFO: renamed from: i4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1087b extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: o */
    public final g f13504o;

    /* JADX INFO: renamed from: p */
    public final int f13505p;

    /* JADX INFO: renamed from: q */
    public final boolean f13506q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f13507r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final int f13508s;

    /* JADX INFO: renamed from: t */
    public final int f13509t;

    /* JADX INFO: renamed from: u */
    public long f13510u;

    /* JADX INFO: renamed from: v */
    public int f13511v;

    /* JADX INFO: renamed from: w */
    public int f13512w;

    /* JADX INFO: renamed from: x */
    public Drawable f13513x;

    /* JADX INFO: renamed from: y */
    public final Drawable f13514y;

    public C1087b(Drawable drawable, g gVar, int i7, boolean z6) {
        this.f13504o = gVar;
        this.f13505p = i7;
        this.f13506q = z6;
        this.f13508s = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.f13509t = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.f13511v = 255;
        this.f13513x = null;
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.f13514y = drawableMutate;
        if (i7 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable2 = this.f13513x;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    public final int a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dO = c.o(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f13504o);
        double d4 = 2;
        int iG = AbstractC1267a.G((((double) iWidth) - (((double) intrinsicWidth) * dO)) / d4);
        int iG2 = AbstractC1267a.G((((double) iHeight) - (dO * ((double) intrinsicHeight))) / d4);
        drawable.setBounds(rect.left + iG, rect.top + iG2, rect.right - iG, rect.bottom - iG2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i7 = this.f13512w;
        if (i7 == 0) {
            Drawable drawable2 = this.f13513x;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f13511v);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f13514y;
        if (i7 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f13511v);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f13510u) / ((double) this.f13505p);
        double dO = h.o(dUptimeMillis, 0.0d, 1.0d);
        int i8 = this.f13511v;
        int i9 = (int) (dO * ((double) i8));
        if (this.f13506q) {
            i8 -= i9;
        }
        boolean z6 = dUptimeMillis >= 1.0d;
        if (!z6 && (drawable = this.f13513x) != null) {
            drawable.setAlpha(i8);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i9);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (!z6) {
            invalidateSelf();
            return;
        }
        this.f13512w = 2;
        this.f13513x = null;
        ArrayList arrayList = this.f13507r;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13511v;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i7 = this.f13512w;
        if (i7 == 0) {
            Drawable drawable = this.f13513x;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f13514y;
        if (i7 != 1) {
            if (i7 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f13513x;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13509t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13508s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13513x;
        int i7 = this.f13512w;
        if (i7 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f13514y;
        if (i7 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f13512w == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13513x;
        if (drawable != null) {
            b(drawable, rect);
        }
        Drawable drawable2 = this.f13514y;
        if (drawable2 != null) {
            b(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f13513x;
        boolean level = drawable != null ? drawable.setLevel(i7) : false;
        Drawable drawable2 = this.f13514y;
        return level || (drawable2 != null ? drawable2.setLevel(i7) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13513x;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f13514y;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (i7 < 0 || i7 >= 256) {
            throw new IllegalArgumentException(n1.c.s(i7, "Invalid alpha: ").toString());
        }
        this.f13511v = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13513x;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f13514y;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f13513x;
        if (drawable != null) {
            drawable.setTint(i7);
        }
        Drawable drawable2 = this.f13514y;
        if (drawable2 != null) {
            drawable2.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f13513x;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f13514y;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13513x;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f13514y;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13513x;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f13514y;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f13513x;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f13514y;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f13512w != 0) {
            return;
        }
        this.f13512w = 1;
        this.f13510u = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f13507r;
        if (arrayList.size() <= 0) {
            invalidateSelf();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f13513x;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f13514y;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f13512w != 2) {
            this.f13512w = 2;
            this.f13513x = null;
            ArrayList arrayList = this.f13507r;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
