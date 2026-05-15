package R0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import q1.AbstractC1368i;

/* JADX INFO: renamed from: R0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0377d0 extends ViewGroup {

    /* JADX INFO: renamed from: o */
    public final HashMap f6432o;

    /* JADX INFO: renamed from: p */
    public final HashMap f6433p;

    public C0377d0(Context context) {
        super(context);
        setClipChildren(false);
        this.f6432o = new HashMap();
        this.f6433p = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC1368i, Q0.K> getHolderToLayoutNode() {
        return this.f6432o;
    }

    public final HashMap<Q0.K, AbstractC1368i> getLayoutNodeToHolder() {
        return this.f6433p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        for (AbstractC1368i abstractC1368i : this.f6432o.keySet()) {
            abstractC1368i.layout(abstractC1368i.getLeft(), abstractC1368i.getTop(), abstractC1368i.getRight(), abstractC1368i.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (!(View.MeasureSpec.getMode(i7) == 1073741824)) {
            N0.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i8) == 1073741824)) {
            N0.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
        for (AbstractC1368i abstractC1368i : this.f6432o.keySet()) {
            int i10 = abstractC1368i.f15481I;
            if (i10 != Integer.MIN_VALUE && (i9 = abstractC1368i.f15482J) != Integer.MIN_VALUE) {
                abstractC1368i.measure(i10, i9);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            Q0.K k7 = (Q0.K) this.f6432o.get(childAt);
            if (childAt.isLayoutRequested() && k7 != null) {
                Q0.K.V(k7, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
