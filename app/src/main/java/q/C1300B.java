package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import f0.C0913t0;
import yos.music.player.R;

/* JADX INFO: renamed from: q.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1300B extends RadioButton implements K1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0913t0 f15126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J2.r f15127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W f15128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1342v f15129r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1300B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        Q0.a(context);
        P0.a(this, getContext());
        C0913t0 c0913t0 = new C0913t0(this);
        this.f15126o = c0913t0;
        c0913t0.d(attributeSet, R.attr.radioButtonStyle);
        J2.r rVar = new J2.r(this);
        this.f15127p = rVar;
        rVar.d(attributeSet, R.attr.radioButtonStyle);
        W w7 = new W(this);
        this.f15128q = w7;
        w7.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C1342v getEmojiTextViewHelper() {
        if (this.f15129r == null) {
            this.f15129r = new C1342v(this);
        }
        return this.f15129r;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15127p;
        if (rVar != null) {
            rVar.a();
        }
        W w7 = this.f15128q;
        if (w7 != null) {
            w7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15127p;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15127p;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0913t0 c0913t0 = this.f15126o;
        if (c0913t0 != null) {
            return (ColorStateList) c0913t0.f11921e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0913t0 c0913t0 = this.f15126o;
        if (c0913t0 != null) {
            return (PorterDuff.Mode) c0913t0.f11922f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15128q.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15128q.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15127p;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15127p;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0913t0 c0913t0 = this.f15126o;
        if (c0913t0 != null) {
            if (c0913t0.f11919c) {
                c0913t0.f11919c = false;
            } else {
                c0913t0.f11919c = true;
                c0913t0.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15128q;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15128q;
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
        J2.r rVar = this.f15127p;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15127p;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0913t0 c0913t0 = this.f15126o;
        if (c0913t0 != null) {
            c0913t0.f11921e = colorStateList;
            c0913t0.f11917a = true;
            c0913t0.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0913t0 c0913t0 = this.f15126o;
        if (c0913t0 != null) {
            c0913t0.f11922f = mode;
            c0913t0.f11918b = true;
            c0913t0.a();
        }
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w7 = this.f15128q;
        w7.k(colorStateList);
        w7.b();
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w7 = this.f15128q;
        w7.l(mode);
        w7.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(i6.g.v(getContext(), i7));
    }
}
