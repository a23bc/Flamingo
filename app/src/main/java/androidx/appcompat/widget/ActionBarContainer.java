package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import j.AbstractC1089a;
import q.C1303b;
import q.N0;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: o */
    public boolean f8971o;

    /* JADX INFO: renamed from: p */
    public View f8972p;

    /* JADX INFO: renamed from: q */
    public View f8973q;

    /* JADX INFO: renamed from: r */
    public Drawable f8974r;

    /* JADX INFO: renamed from: s */
    public Drawable f8975s;

    /* JADX INFO: renamed from: t */
    public Drawable f8976t;

    /* JADX INFO: renamed from: u */
    public final boolean f8977u;

    /* JADX INFO: renamed from: v */
    public boolean f8978v;

    /* JADX INFO: renamed from: w */
    public final int f8979w;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1303b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13594a);
        boolean z6 = false;
        this.f8974r = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f8975s = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f8979w = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f8977u = true;
            this.f8976t = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f8977u ? !(this.f8974r != null || this.f8975s != null) : this.f8976t == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8974r;
        if (drawable != null && drawable.isStateful()) {
            this.f8974r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8975s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f8975s.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8976t;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f8976t.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8974r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8975s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8976t;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f8972p = findViewById(R.id.action_bar);
        this.f8973q = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8971o || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        boolean z7 = true;
        if (this.f8977u) {
            Drawable drawable = this.f8976t;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = false;
            }
        } else {
            if (this.f8974r == null) {
                z7 = false;
            } else if (this.f8972p.getVisibility() == 0) {
                this.f8974r.setBounds(this.f8972p.getLeft(), this.f8972p.getTop(), this.f8972p.getRight(), this.f8972p.getBottom());
            } else {
                View view = this.f8973q;
                if (view == null || view.getVisibility() != 0) {
                    this.f8974r.setBounds(0, 0, 0, 0);
                } else {
                    this.f8974r.setBounds(this.f8973q.getLeft(), this.f8973q.getTop(), this.f8973q.getRight(), this.f8973q.getBottom());
                }
            }
            this.f8978v = false;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f8972p == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f8979w) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f8972p == null) {
            return;
        }
        View.MeasureSpec.getMode(i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f8974r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8974r);
        }
        this.f8974r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f8972p;
            if (view != null) {
                this.f8974r.setBounds(view.getLeft(), this.f8972p.getTop(), this.f8972p.getRight(), this.f8972p.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f8977u ? !(this.f8974r != null || this.f8975s != null) : this.f8976t == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8976t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8976t);
        }
        this.f8976t = drawable;
        boolean z6 = this.f8977u;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f8976t) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f8974r != null || this.f8975s != null) : this.f8976t == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f8975s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8975s);
        }
        this.f8975s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8978v && this.f8975s != null) {
                throw null;
            }
        }
        boolean z6 = false;
        if (!this.f8977u ? !(this.f8974r != null || this.f8975s != null) : this.f8976t == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z6) {
        this.f8971o = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f8974r;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f8975s;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f8976t;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8974r;
        boolean z6 = this.f8977u;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f8975s && this.f8978v) {
            return true;
        }
        return (drawable == this.f8976t && z6) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }

    public void setTabContainer(N0 n02) {
    }
}
