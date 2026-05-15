package q;

import G1.AbstractC0151s;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j5.AbstractC1107a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k.AbstractC1113a;
import y1.AbstractC1996e;

/* JADX INFO: renamed from: q.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1302a0 extends TextView implements K1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J2.r f15254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W f15255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1299A f15256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1342v f15257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k.I f15259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Future f15260u;

    public C1302a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1342v getEmojiTextViewHelper() {
        if (this.f15257r == null) {
            this.f15257r = new C1342v(this);
        }
        return this.f15257r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15254o;
        if (rVar != null) {
            rVar.a();
        }
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.b();
        }
    }

    public final void g() {
        Future future = this.f15260u;
        if (future == null) {
            return;
        }
        try {
            this.f15260u = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            android.support.v4.media.session.b.t(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j1.f15322c) {
            return super.getAutoSizeMaxTextSize();
        }
        W w7 = this.f15255p;
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
        W w7 = this.f15255p;
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
        W w7 = this.f15255p;
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
        W w7 = this.f15255p;
        return w7 != null ? w7.f15238i.f15299f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (j1.f15322c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        W w7 = this.f15255p;
        if (w7 != null) {
            return w7.f15238i.f15294a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.b.N(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public X getSuperCaller() {
        if (this.f15259t == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                this.f15259t = new Z(this);
            } else if (i7 >= 28) {
                this.f15259t = new Y(this);
            } else if (i7 >= 26) {
                this.f15259t = new k.I(9, this);
            }
        }
        return this.f15259t;
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15254o;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15254o;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15255p.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15255p.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1299A c1299a;
        if (Build.VERSION.SDK_INT >= 28 || (c1299a = this.f15256q) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1299a.f15124c;
        return textClassifier == null ? Q.a((TextView) c1299a.f15123b) : textClassifier;
    }

    public E1.a getTextMetricsParamsCompat() {
        return android.support.v4.media.session.b.t(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f15255p.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            I1.d.a(editorInfo, getText());
        }
        AbstractC1107a.u(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        W w7 = this.f15255p;
        if (w7 == null || j1.f15322c) {
            return;
        }
        w7.f15238i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        g();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        W w7 = this.f15255p;
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
        W w7 = this.f15255p;
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
        W w7 = this.f15255p;
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
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.j(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15254o;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15254o;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15255p;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((M3.a) getEmojiTextViewHelper().f15410b.f4105p).R(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().u(i7);
        } else {
            android.support.v4.media.session.b.H(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i7);
        } else {
            android.support.v4.media.session.b.I(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        android.support.v4.media.session.b.J(this, i7);
    }

    public void setPrecomputedText(E1.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        android.support.v4.media.session.b.t(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15254o;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15254o;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w7 = this.f15255p;
        w7.k(colorStateList);
        w7.b();
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w7 = this.f15255p;
        w7.l(mode);
        w7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1299A c1299a;
        if (Build.VERSION.SDK_INT >= 28 || (c1299a = this.f15256q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1299a.f15124c = textClassifier;
        }
    }

    public void setTextFuture(Future<E1.b> future) {
        this.f15260u = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(E1.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f1818b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(aVar.f1817a);
        setBreakStrategy(aVar.f1819c);
        setHyphenationFrequency(aVar.f1820d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        boolean z6 = j1.f15322c;
        if (z6) {
            super.setTextSize(i7, f7);
            return;
        }
        W w7 = this.f15255p;
        if (w7 == null || z6) {
            return;
        }
        C1312f0 c1312f0 = w7.f15238i;
        if (c1312f0.f()) {
            return;
        }
        c1312f0.g(i7, f7);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typefaceCreate;
        if (this.f15258s) {
            return;
        }
        if (typeface == null || i7 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC1113a abstractC1113a = AbstractC1996e.f20278a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i7);
        }
        this.f15258s = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f15258s = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302a0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Q0.a(context);
        this.f15258s = false;
        this.f15259t = null;
        P0.a(this, getContext());
        J2.r rVar = new J2.r(this);
        this.f15254o = rVar;
        rVar.d(attributeSet, i7);
        W w7 = new W(this);
        this.f15255p = w7;
        w7.f(attributeSet, i7);
        w7.b();
        C1299A c1299a = new C1299A();
        c1299a.f15123b = this;
        this.f15256q = c1299a;
        getEmojiTextViewHelper().a(attributeSet, i7);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i7, float f7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            getSuperCaller().z(i7, f7);
        } else if (i8 >= 34) {
            AbstractC0151s.k(this, i7, f7);
        } else {
            android.support.v4.media.session.b.J(this, Math.round(TypedValue.applyDimension(i7, f7, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? i6.g.v(context, i7) : null, i8 != 0 ? i6.g.v(context, i8) : null, i9 != 0 ? i6.g.v(context, i9) : null, i10 != 0 ? i6.g.v(context, i10) : null);
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? i6.g.v(context, i7) : null, i8 != 0 ? i6.g.v(context, i8) : null, i9 != 0 ? i6.g.v(context, i9) : null, i10 != 0 ? i6.g.v(context, i10) : null);
        W w7 = this.f15255p;
        if (w7 != null) {
            w7.b();
        }
    }
}
