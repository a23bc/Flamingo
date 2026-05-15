package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p.ViewTreeObserverOnGlobalLayoutListenerC1275d;

/* JADX INFO: loaded from: classes.dex */
public final class P extends Spinner {

    /* JADX INFO: renamed from: w */
    public static final int[] f15207w = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: o */
    public final J2.r f15208o;

    /* JADX INFO: renamed from: p */
    public final Context f15209p;

    /* JADX INFO: renamed from: q */
    public final G f15210q;

    /* JADX INFO: renamed from: r */
    public SpinnerAdapter f15211r;

    /* JADX INFO: renamed from: s */
    public final boolean f15212s;

    /* JADX INFO: renamed from: t */
    public final O f15213t;

    /* JADX INFO: renamed from: u */
    public int f15214u;

    /* JADX INFO: renamed from: v */
    public final Rect f15215v;

    /* JADX WARN: Removed duplicated region for block: B:67:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.P.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f15215v;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15208o;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        O o7 = this.f15213t;
        return o7 != null ? o7.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        O o7 = this.f15213t;
        return o7 != null ? o7.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f15213t != null ? this.f15214u : super.getDropDownWidth();
    }

    public final O getInternalPopup() {
        return this.f15213t;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        O o7 = this.f15213t;
        return o7 != null ? o7.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f15209p;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        O o7 = this.f15213t;
        return o7 != null ? o7.n() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15208o;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15208o;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O o7 = this.f15213t;
        if (o7 == null || !o7.a()) {
            return;
        }
        o7.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f15213t == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        N n7 = (N) parcelable;
        super.onRestoreInstanceState(n7.getSuperState());
        if (!n7.f15206o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1275d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        N n7 = new N(super.onSaveInstanceState());
        O o7 = this.f15213t;
        n7.f15206o = o7 != null && o7.a();
        return n7;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        G g6 = this.f15210q;
        if (g6 == null || !g6.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        O o7 = this.f15213t;
        if (o7 == null) {
            return super.performClick();
        }
        if (o7.a()) {
            return true;
        }
        this.f15213t.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15208o;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15208o;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        O o7 = this.f15213t;
        if (o7 == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            o7.j(i7);
            o7.k(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        O o7 = this.f15213t;
        if (o7 != null) {
            o7.i(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f15213t != null) {
            this.f15214u = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        O o7 = this.f15213t;
        if (o7 != null) {
            o7.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(i6.g.v(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        O o7 = this.f15213t;
        if (o7 != null) {
            o7.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15208o;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15208o;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f15212s) {
            this.f15211r = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        O o7 = this.f15213t;
        if (o7 != null) {
            Context context = this.f15209p;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            J j3 = new J();
            j3.f15179a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                j3.f15180b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                H.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o7.o(j3);
        }
    }
}
