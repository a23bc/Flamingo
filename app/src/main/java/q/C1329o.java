package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import j5.AbstractC1107a;

/* JADX INFO: renamed from: q.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1329o extends AutoCompleteTextView implements K1.p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f15358r = {R.attr.popupBackground};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J2.r f15359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W f15360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1299A f15361q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1329o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, yos.music.player.R.attr.autoCompleteTextViewStyle);
        Q0.a(context);
        P0.a(this, getContext());
        S0 s0K = S0.k(getContext(), attributeSet, f15358r, yos.music.player.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) s0K.f15226q).hasValue(0)) {
            setDropDownBackgroundDrawable(s0K.g(0));
        }
        s0K.l();
        J2.r rVar = new J2.r(this);
        this.f15359o = rVar;
        rVar.d(attributeSet, yos.music.player.R.attr.autoCompleteTextViewStyle);
        W w7 = new W(this);
        this.f15360p = w7;
        w7.f(attributeSet, yos.music.player.R.attr.autoCompleteTextViewStyle);
        w7.b();
        C1299A c1299a = new C1299A(this);
        this.f15361q = c1299a;
        c1299a.b(attributeSet, yos.music.player.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c1299a.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15359o;
        if (rVar != null) {
            rVar.a();
        }
        W w7 = this.f15360p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.b.N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15359o;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15359o;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15360p.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15360p.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1107a.u(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f15361q.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15359o;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15359o;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15360p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15360p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.b.P(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(i6.g.v(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f15361q.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f15361q.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15359o;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15359o;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w7 = this.f15360p;
        w7.k(colorStateList);
        w7.b();
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w7 = this.f15360p;
        w7.l(mode);
        w7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        W w7 = this.f15360p;
        if (w7 != null) {
            w7.g(context, i7);
        }
    }
}
