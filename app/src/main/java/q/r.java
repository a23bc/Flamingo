package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import f0.C0913t0;
import j.AbstractC1089a;
import j5.AbstractC1107a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class r extends CheckedTextView implements K1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0913t0 f15384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J2.r f15385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W f15386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1342v f15387r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        Q0.a(context);
        P0.a(this, getContext());
        W w7 = new W(this);
        this.f15386q = w7;
        w7.f(attributeSet, R.attr.checkedTextViewStyle);
        w7.b();
        J2.r rVar = new J2.r(this);
        this.f15385p = rVar;
        rVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f15384o = new C0913t0(this);
        Context context2 = getContext();
        int[] iArr = AbstractC1089a.l;
        S0 s0K = S0.k(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        G1.I.g(this, getContext(), iArr, attributeSet, (TypedArray) s0K.f15226q, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(i6.g.v(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(i6.g.v(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(i6.g.v(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(s0K.f(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1322k0.b(typedArray.getInt(3, -1), null));
            }
            s0K.l();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            s0K.l();
            throw th;
        }
    }

    private C1342v getEmojiTextViewHelper() {
        if (this.f15387r == null) {
            this.f15387r = new C1342v(this);
        }
        return this.f15387r;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W w7 = this.f15386q;
        if (w7 != null) {
            w7.b();
        }
        J2.r rVar = this.f15385p;
        if (rVar != null) {
            rVar.a();
        }
        C0913t0 c0913t0 = this.f15384o;
        if (c0913t0 != null) {
            c0913t0.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.b.N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15385p;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15385p;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0913t0 c0913t0 = this.f15384o;
        if (c0913t0 != null) {
            return (ColorStateList) c0913t0.f11921e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0913t0 c0913t0 = this.f15384o;
        if (c0913t0 != null) {
            return (PorterDuff.Mode) c0913t0.f11922f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15386q.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15386q.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1107a.u(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15385p;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15385p;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0913t0 c0913t0 = this.f15384o;
        if (c0913t0 != null) {
            if (c0913t0.f11919c) {
                c0913t0.f11919c = false;
            } else {
                c0913t0.f11919c = true;
                c0913t0.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15386q;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15386q;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.b.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15385p;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15385p;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0913t0 c0913t0 = this.f15384o;
        if (c0913t0 != null) {
            c0913t0.f11921e = colorStateList;
            c0913t0.f11917a = true;
            c0913t0.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0913t0 c0913t0 = this.f15384o;
        if (c0913t0 != null) {
            c0913t0.f11922f = mode;
            c0913t0.f11918b = true;
            c0913t0.b();
        }
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w7 = this.f15386q;
        w7.k(colorStateList);
        w7.b();
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w7 = this.f15386q;
        w7.l(mode);
        w7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        W w7 = this.f15386q;
        if (w7 != null) {
            w7.g(context, i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(i6.g.v(getContext(), i7));
    }
}
