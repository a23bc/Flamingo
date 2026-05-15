package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import yos.music.player.R;

/* JADX INFO: renamed from: q.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1331p extends Button implements K1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J2.r f15364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W f15365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1342v f15366q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        Q0.a(context);
        P0.a(this, getContext());
        J2.r rVar = new J2.r(this);
        this.f15364o = rVar;
        rVar.d(attributeSet, R.attr.buttonStyle);
        W w7 = new W(this);
        this.f15365p = w7;
        w7.f(attributeSet, R.attr.buttonStyle);
        w7.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private C1342v getEmojiTextViewHelper() {
        if (this.f15366q == null) {
            this.f15366q = new C1342v(this);
        }
        return this.f15366q;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15364o;
        if (rVar != null) {
            rVar.a();
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j1.f15322c) {
            return super.getAutoSizeMaxTextSize();
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            return Math.round(w7.f15238i.f15298e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (j1.f15322c) {
            return super.getAutoSizeMinTextSize();
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            return Math.round(w7.f15238i.f15297d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (j1.f15322c) {
            return super.getAutoSizeStepGranularity();
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            return Math.round(w7.f15238i.f15296c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (j1.f15322c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        W w7 = this.f15365p;
        return w7 != null ? w7.f15238i.f15299f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (j1.f15322c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            return w7.f15238i.f15294a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.b.N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15364o;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15364o;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15365p.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15365p.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        W w7 = this.f15365p;
        if (w7 == null || j1.f15322c) {
            return;
        }
        w7.f15238i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        W w7 = this.f15365p;
        if (w7 == null || j1.f15322c) {
            return;
        }
        C1312f0 c1312f0 = w7.f15238i;
        if (c1312f0.f()) {
            c1312f0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (j1.f15322c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            w7.h(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (j1.f15322c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            w7.i(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (j1.f15322c) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        W w7 = this.f15365p;
        if (w7 != null) {
            w7.j(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15364o;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15364o;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.b.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((M3.a) getEmojiTextViewHelper().f15410b.f4105p).R(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        W w7 = this.f15365p;
        if (w7 != null) {
            w7.f15231a.setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15364o;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15364o;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w7 = this.f15365p;
        w7.k(colorStateList);
        w7.b();
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w7 = this.f15365p;
        w7.l(mode);
        w7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        W w7 = this.f15365p;
        if (w7 != null) {
            w7.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        boolean z6 = j1.f15322c;
        if (z6) {
            super.setTextSize(i7, f7);
            return;
        }
        W w7 = this.f15365p;
        if (w7 == null || z6) {
            return;
        }
        C1312f0 c1312f0 = w7.f15238i;
        if (c1312f0.f()) {
            return;
        }
        c1312f0.g(i7, f7);
    }
}
