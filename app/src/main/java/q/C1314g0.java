package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: q.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1314g0 extends ToggleButton implements K1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J2.r f15312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W f15313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1342v f15314q;

    public C1314g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        P0.a(this, getContext());
        J2.r rVar = new J2.r(this);
        this.f15312o = rVar;
        rVar.d(attributeSet, R.attr.buttonStyleToggle);
        W w7 = new W(this);
        this.f15313p = w7;
        w7.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1342v getEmojiTextViewHelper() {
        if (this.f15314q == null) {
            this.f15314q = new C1342v(this);
        }
        return this.f15314q;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15312o;
        if (rVar != null) {
            rVar.a();
        }
        W w7 = this.f15313p;
        if (w7 != null) {
            w7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15312o;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15312o;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15313p.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15313p.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15312o;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15312o;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15313p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15313p;
        if (w7 != null) {
            w7.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((M3.a) getEmojiTextViewHelper().f15410b.f4105p).R(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15312o;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15312o;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w7 = this.f15313p;
        w7.k(colorStateList);
        w7.b();
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w7 = this.f15313p;
        w7.l(mode);
        w7.b();
    }
}
