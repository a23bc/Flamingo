package androidx.appcompat.widget;

import G1.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import j.AbstractC1089a;
import java.util.WeakHashMap;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9045q;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9045q = -1;
        int[] iArr = AbstractC1089a.f13603k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        I.g(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f9043o = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f9043o);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f9044p != z6) {
            if (!z6 || this.f9043o) {
                this.f9044p = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int iMakeMeasureSpec;
        boolean z6;
        int i9;
        int size = View.MeasureSpec.getSize(i7);
        int paddingBottom = 0;
        if (this.f9043o) {
            if (size > this.f9045q && this.f9044p) {
                setStacked(false);
            }
            this.f9045q = size;
        }
        if (this.f9044p || View.MeasureSpec.getMode(i7) != 1073741824) {
            iMakeMeasureSpec = i7;
            z6 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i8);
        if (this.f9043o && !this.f9044p && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i7, i8);
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            i9 = -1;
            if (i10 >= childCount) {
                i10 = -1;
                break;
            } else if (getChildAt(i10).getVisibility() == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f9044p) {
                int i11 = i10 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i11 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i11).getVisibility() == 0) {
                        i9 = i11;
                        break;
                    }
                    i11++;
                }
                paddingBottom = i9 >= 0 ? getChildAt(i9).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = I.f2641a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f9043o != z6) {
            this.f9043o = z6;
            if (!z6 && this.f9044p) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
