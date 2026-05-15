package L3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f4255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f4256r = new b(0, this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f4254p = new c();

    public e(Context context) {
        this.f4255q = context;
    }

    @Override // L3.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f4254p;
        cVar.f4249a.draw(canvas);
        if (cVar.f4250b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getAlpha() : this.f4254p.f4249a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4254p.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getColorFilter() : this.f4254p.f4249a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4259o == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f4259o.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4254p.f4249a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4254p.f4249a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getOpacity() : this.f4254p.f4249a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        if (r8.f4250b != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0171, code lost:
    
        r8.f4250b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0178, code lost:
    
        r8.f4250b.playTogether(r8.f4251c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017f, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.isAutoMirrored() : this.f4254p.f4249a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4259o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4254p.f4250b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.isStateful() : this.f4254p.f4249a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4254p.f4249a.setBounds(rect);
        }
    }

    @Override // L3.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.setLevel(i7) : this.f4254p.f4249a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.setState(iArr) : this.f4254p.f4249a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f4254p.f4249a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f4254p.f4249a.setAutoMirrored(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4254p.f4249a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            i6.g.B(drawable, i7);
        } else {
            this.f4254p.f4249a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f4254p.f4249a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f4254p.f4249a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            return drawable.setVisible(z6, z7);
        }
        this.f4254p.f4249a.setVisible(z6, z7);
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f4254p;
        if (cVar.f4250b.isStarted()) {
            return;
        }
        cVar.f4250b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4254p.f4250b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
