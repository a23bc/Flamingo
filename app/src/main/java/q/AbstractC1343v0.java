package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import j.AbstractC1089a;

/* JADX INFO: renamed from: q.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1343v0 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15411A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15412B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15413C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f15420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f15422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f15423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f15424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15425z;

    public AbstractC1343v0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15414o = true;
        this.f15415p = -1;
        this.f15416q = 0;
        this.f15418s = 8388659;
        int[] iArr = AbstractC1089a.f13605n;
        S0 s0K = S0.k(context, attributeSet, iArr, 0);
        G1.I.g(this, context, iArr, attributeSet, (TypedArray) s0K.f15226q, 0);
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        int i7 = typedArray.getInt(1, -1);
        if (i7 >= 0) {
            setOrientation(i7);
        }
        int i8 = typedArray.getInt(0, -1);
        if (i8 >= 0) {
            setGravity(i8);
        }
        boolean z6 = typedArray.getBoolean(2, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f15420u = typedArray.getFloat(4, -1.0f);
        this.f15415p = typedArray.getInt(3, -1);
        this.f15421v = typedArray.getBoolean(7, false);
        setDividerDrawable(s0K.g(5));
        this.f15412B = typedArray.getInt(8, 0);
        this.f15413C = typedArray.getDimensionPixelSize(6, 0);
        s0K.l();
    }

    public final void c(Canvas canvas, int i7) {
        this.f15424y.setBounds(getPaddingLeft() + this.f15413C, i7, (getWidth() - getPaddingRight()) - this.f15413C, this.f15411A + i7);
        this.f15424y.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1341u0;
    }

    public final void d(Canvas canvas, int i7) {
        this.f15424y.setBounds(i7, getPaddingTop() + this.f15413C, this.f15425z + i7, (getHeight() - getPaddingBottom()) - this.f15413C);
        this.f15424y.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1341u0 generateDefaultLayoutParams() {
        int i7 = this.f15417r;
        if (i7 == 0) {
            return new C1341u0(-2, -2);
        }
        if (i7 == 1) {
            return new C1341u0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1341u0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1341u0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1341u0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1341u0 ? new C1341u0((C1341u0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1341u0((ViewGroup.MarginLayoutParams) layoutParams) : new C1341u0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f15415p < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f15415p;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f15415p == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f15416q;
        if (this.f15417r == 1 && (i7 = this.f15418s & 112) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f15419t) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f15419t;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1341u0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f15415p;
    }

    public Drawable getDividerDrawable() {
        return this.f15424y;
    }

    public int getDividerPadding() {
        return this.f15413C;
    }

    public int getDividerWidth() {
        return this.f15425z;
    }

    public int getGravity() {
        return this.f15418s;
    }

    public int getOrientation() {
        return this.f15417r;
    }

    public int getShowDividers() {
        return this.f15412B;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f15420u;
    }

    public final boolean h(int i7) {
        if (i7 == 0) {
            return (this.f15412B & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f15412B & 4) != 0;
        }
        if ((this.f15412B & 2) != 0) {
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        if (this.f15424y == null) {
            return;
        }
        int i8 = 0;
        if (this.f15417r == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && h(i8)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1341u0) childAt.getLayoutParams())).topMargin) - this.f15411A);
                }
                i8++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f15411A : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1341u0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z6 = j1.f15320a;
        boolean z7 = getLayoutDirection() == 1;
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i8)) {
                C1341u0 c1341u0 = (C1341u0) childAt3.getLayoutParams();
                d(canvas, z7 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1341u0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1341u0).leftMargin) - this.f15425z);
            }
            i8++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1341u0 c1341u02 = (C1341u0) childAt4.getLayoutParams();
                if (z7) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1341u02).leftMargin;
                    i7 = this.f15425z;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1341u02).rightMargin;
                }
            } else if (z7) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f15425z;
                right = left - i7;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC1343v0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC1343v0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z6) {
        this.f15414o = z6;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f15415p = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f15424y) {
            return;
        }
        this.f15424y = drawable;
        if (drawable != null) {
            this.f15425z = drawable.getIntrinsicWidth();
            this.f15411A = drawable.getIntrinsicHeight();
        } else {
            this.f15425z = 0;
            this.f15411A = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f15413C = i7;
    }

    public void setGravity(int i7) {
        if (this.f15418s != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f15418s = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f15418s;
        if ((8388615 & i9) != i8) {
            this.f15418s = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f15421v = z6;
    }

    public void setOrientation(int i7) {
        if (this.f15417r != i7) {
            this.f15417r = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f15412B) {
            requestLayout();
        }
        this.f15412B = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f15418s;
        if ((i9 & 112) != i8) {
            this.f15418s = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f15420u = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
