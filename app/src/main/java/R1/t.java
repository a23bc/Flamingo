package r1;

import G1.I;
import G1.InterfaceC0147n;
import G1.m0;
import R0.AbstractC0370a;
import android.content.Context;
import android.view.View;
import android.view.Window;
import f0.C0879c;
import f0.C0894j0;
import f0.C0912t;
import f0.C0915u0;
import java.util.WeakHashMap;
import q1.C1360a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0370a implements v, InterfaceC0147n {

    /* JADX INFO: renamed from: A */
    public boolean f15716A;

    /* JADX INFO: renamed from: B */
    public boolean f15717B;

    /* JADX INFO: renamed from: w */
    public final Window f15718w;

    /* JADX INFO: renamed from: x */
    public final C0894j0 f15719x;

    /* JADX INFO: renamed from: y */
    public boolean f15720y;

    /* JADX INFO: renamed from: z */
    public boolean f15721z;

    public t(Context context, Window window) {
        super(context);
        this.f15718w = window;
        this.f15719x = C0879c.t(r.f15714a);
        WeakHashMap weakHashMap = I.f2641a;
        G1.B.h(this, this);
        I.j(this, new C1360a(this, 1));
    }

    @Override // R0.AbstractC0370a
    public final void a(int i7, C0912t c0912t) {
        c0912t.Z(1735448596);
        int i8 = (c0912t.h(this) ? 4 : 2) | i7;
        if (c0912t.N(i8 & 1, (i8 & 3) != 2)) {
            ((l5.e) this.f15719x.getValue()).invoke(c0912t, 0);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new A5.y(i7, 5, this);
        }
    }

    @Override // R0.AbstractC0370a
    public final void e(boolean z6, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i11 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i12 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // R0.AbstractC0370a
    public final void f(int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i7, i8);
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        Window window = this.f15718w;
        int i9 = (mode != Integer.MIN_VALUE || this.f15720y || this.f15721z || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i10 = size - paddingRight;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = i9 - paddingBottom;
        int i12 = i11 >= 0 ? i11 : 0;
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 != 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        childAt.measure(i7, i8);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f15721z || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f15720y) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // R0.AbstractC0370a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15717B;
    }

    @Override // G1.InterfaceC0147n
    public final m0 j(View view, m0 m0Var) {
        if (!this.f15721z) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return m0Var.f2725a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return m0Var;
    }
}
