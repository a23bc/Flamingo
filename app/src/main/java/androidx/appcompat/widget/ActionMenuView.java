package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import d.C0746L;
import k.I;
import p.k;
import p.l;
import p.n;
import p.z;
import q.AbstractC1343v0;
import q.C1313g;
import q.C1319j;
import q.C1321k;
import q.C1325m;
import q.C1341u0;
import q.InterfaceC1323l;
import q.InterfaceC1327n;
import q.U0;
import q.j1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1343v0 implements k, z {

    /* JADX INFO: renamed from: D */
    public l f9031D;

    /* JADX INFO: renamed from: E */
    public Context f9032E;

    /* JADX INFO: renamed from: F */
    public int f9033F;

    /* JADX INFO: renamed from: G */
    public boolean f9034G;

    /* JADX INFO: renamed from: H */
    public C1321k f9035H;

    /* JADX INFO: renamed from: I */
    public U0 f9036I;

    /* JADX INFO: renamed from: J */
    public boolean f9037J;

    /* JADX INFO: renamed from: K */
    public int f9038K;

    /* JADX INFO: renamed from: L */
    public final int f9039L;

    /* JADX INFO: renamed from: M */
    public final int f9040M;

    /* JADX INFO: renamed from: N */
    public InterfaceC1327n f9041N;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f9039L = (int) (56.0f * f7);
        this.f9040M = (int) (f7 * 4.0f);
        this.f9032E = context;
        this.f9033F = 0;
    }

    public static C1325m i() {
        C1325m c1325m = new C1325m(-2, -2);
        c1325m.f15348a = false;
        ((LinearLayout.LayoutParams) c1325m).gravity = 16;
        return c1325m;
    }

    public static C1325m j(ViewGroup.LayoutParams layoutParams) {
        C1325m c1325m;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof C1325m) {
            C1325m c1325m2 = (C1325m) layoutParams;
            c1325m = new C1325m(c1325m2);
            c1325m.f15348a = c1325m2.f15348a;
        } else {
            c1325m = new C1325m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1325m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1325m).gravity = 16;
        }
        return c1325m;
    }

    @Override // p.z
    public final void a(l lVar) {
        this.f9031D = lVar;
    }

    @Override // p.k
    public final boolean b(n nVar) {
        return this.f9031D.q(nVar, null, 0);
    }

    @Override // q.AbstractC1343v0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1325m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // q.AbstractC1343v0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C1341u0 generateDefaultLayoutParams() {
        return i();
    }

    @Override // q.AbstractC1343v0
    /* JADX INFO: renamed from: f */
    public final C1341u0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1325m(getContext(), attributeSet);
    }

    @Override // q.AbstractC1343v0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C1341u0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // q.AbstractC1343v0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // q.AbstractC1343v0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f9031D == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f9031D = lVar;
            lVar.f14819e = new I(8, this);
            C1321k c1321k = new C1321k(context);
            this.f9035H = c1321k;
            c1321k.f15345z = true;
            c1321k.f15323A = true;
            c1321k.f15338s = new C0746L(17);
            this.f9031D.b(c1321k, this.f9032E);
            C1321k c1321k2 = this.f9035H;
            c1321k2.f15341v = this;
            this.f9031D = c1321k2.f15336q;
        }
        return this.f9031D;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1321k c1321k = this.f9035H;
        C1319j c1319j = c1321k.f15342w;
        if (c1319j != null) {
            return c1319j.getDrawable();
        }
        if (c1321k.f15344y) {
            return c1321k.f15343x;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f9033F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i7) {
        boolean zA = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC1323l)) {
            zA = ((InterfaceC1323l) childAt).a();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC1323l)) ? zA : ((InterfaceC1323l) childAt2).c() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1321k c1321k = this.f9035H;
        if (c1321k != null) {
            c1321k.d();
            if (this.f9035H.e()) {
                this.f9035H.c();
                this.f9035H.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1321k c1321k = this.f9035H;
        if (c1321k != null) {
            c1321k.c();
            C1313g c1313g = c1321k.f15330H;
            if (c1313g == null || !c1313g.b()) {
                return;
            }
            c1313g.f14886i.dismiss();
        }
    }

    @Override // q.AbstractC1343v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int width;
        int paddingLeft;
        if (!this.f9037J) {
            super.onLayout(z6, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i9 - i7;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean z7 = j1.f15320a;
        boolean z8 = getLayoutDirection() == 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C1325m c1325m = (C1325m) childAt.getLayoutParams();
                if (c1325m.f15348a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z8) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1325m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1325m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1325m).leftMargin) + ((LinearLayout.LayoutParams) c1325m).rightMargin;
                    k(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int iMax = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (z8) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                C1325m c1325m2 = (C1325m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1325m2.f15348a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) c1325m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1325m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            C1325m c1325m3 = (C1325m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1325m3.f15348a) {
                int i24 = paddingLeft2 + ((LinearLayout.LayoutParams) c1325m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1325m3).rightMargin + iMax + i24;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // q.AbstractC1343v0, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        ?? r11;
        int i11;
        int i12;
        l lVar;
        boolean z6 = this.f9037J;
        boolean z7 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f9037J = z7;
        if (z6 != z7) {
            this.f9038K = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f9037J && (lVar = this.f9031D) != null && size != this.f9038K) {
            this.f9038K = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f9037J || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C1325m c1325m = (C1325m) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) c1325m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1325m).leftMargin = 0;
            }
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f9039L;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i19 = 0;
        int iMax2 = 0;
        int i20 = 0;
        boolean z8 = false;
        int i21 = 0;
        long j3 = 0;
        while (true) {
            i9 = this.f9040M;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i11 = i18;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                i19++;
                if (z9) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C1325m c1325m2 = (C1325m) childAt.getLayoutParams();
                c1325m2.f15353f = false;
                c1325m2.f15350c = 0;
                c1325m2.f15349b = 0;
                c1325m2.f15351d = false;
                ((LinearLayout.LayoutParams) c1325m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1325m2).rightMargin = 0;
                c1325m2.f15352e = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i24 = c1325m2.f15348a ? 1 : i16;
                C1325m c1325m3 = (C1325m) childAt.getLayoutParams();
                int i25 = i16;
                i11 = i18;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i23, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z11 = z10;
                if (i24 <= 0 || (z10 && i24 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i24, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i11;
                    if (measuredWidth % i11 != 0) {
                        i12++;
                    }
                    if (z11 && i12 < 2) {
                        i12 = 2;
                    }
                }
                c1325m3.f15351d = !c1325m3.f15348a && z11;
                c1325m3.f15349b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i12);
                if (c1325m2.f15351d) {
                    i21++;
                }
                if (c1325m2.f15348a) {
                    z8 = true;
                }
                i16 = i25 - i12;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j3 |= (long) (1 << i20);
                }
            }
            i20++;
            size3 = i22;
            paddingBottom = i23;
            i18 = i11;
        }
        int i26 = size3;
        int i27 = i16;
        int i28 = i18;
        boolean z12 = z8 && i19 == 2;
        int i29 = i27;
        boolean z13 = false;
        while (i21 > 0 && i29 > 0) {
            int i30 = Integer.MAX_VALUE;
            long j7 = 0;
            int i31 = 0;
            int i32 = 0;
            while (i32 < childCount2) {
                boolean z14 = z12;
                C1325m c1325m4 = (C1325m) getChildAt(i32).getLayoutParams();
                int i33 = iMax;
                if (c1325m4.f15351d) {
                    int i34 = c1325m4.f15349b;
                    if (i34 < i30) {
                        j7 = 1 << i32;
                        i30 = i34;
                        i31 = 1;
                    } else if (i34 == i30) {
                        j7 |= 1 << i32;
                        i31++;
                    }
                }
                i32++;
                iMax = i33;
                z12 = z14;
            }
            boolean z15 = z12;
            i10 = iMax;
            j3 |= j7;
            if (i31 > i29) {
                break;
            }
            int i35 = i30 + 1;
            int i36 = 0;
            while (i36 < childCount2) {
                View childAt2 = getChildAt(i36);
                C1325m c1325m5 = (C1325m) childAt2.getLayoutParams();
                boolean z16 = z8;
                long j8 = 1 << i36;
                if ((j7 & j8) != 0) {
                    if (z15 && c1325m5.f15352e) {
                        r11 = 1;
                        r11 = 1;
                        if (i29 == 1) {
                            childAt2.setPadding(i9 + i28, 0, i9, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1325m5.f15349b += r11;
                    c1325m5.f15353f = r11;
                    i29--;
                } else if (c1325m5.f15349b == i35) {
                    j3 |= j8;
                }
                i36++;
                z8 = z16;
            }
            iMax = i10;
            z12 = z15;
            z13 = true;
        }
        i10 = iMax;
        boolean z17 = !z8 && i19 == 1;
        if (i29 > 0 && j3 != 0 && (i29 < i19 - 1 || z17 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j3);
            if (!z17) {
                if ((j3 & 1) != 0 && !((C1325m) getChildAt(0).getLayoutParams()).f15352e) {
                    fBitCount -= 0.5f;
                }
                int i37 = childCount2 - 1;
                if ((j3 & ((long) (1 << i37))) != 0 && !((C1325m) getChildAt(i37).getLayoutParams()).f15352e) {
                    fBitCount -= 0.5f;
                }
            }
            int i38 = fBitCount > 0.0f ? (int) ((i29 * i28) / fBitCount) : 0;
            boolean z18 = z13;
            for (int i39 = 0; i39 < childCount2; i39++) {
                if ((j3 & ((long) (1 << i39))) != 0) {
                    View childAt3 = getChildAt(i39);
                    C1325m c1325m6 = (C1325m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1325m6.f15350c = i38;
                        c1325m6.f15353f = true;
                        if (i39 == 0 && !c1325m6.f15352e) {
                            ((LinearLayout.LayoutParams) c1325m6).leftMargin = (-i38) / 2;
                        }
                        z18 = true;
                    } else if (c1325m6.f15348a) {
                        c1325m6.f15350c = i38;
                        c1325m6.f15353f = true;
                        ((LinearLayout.LayoutParams) c1325m6).rightMargin = (-i38) / 2;
                        z18 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) c1325m6).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1325m6).rightMargin = i38 / 2;
                        }
                    }
                }
            }
            z13 = z18;
        }
        if (z13) {
            for (int i40 = 0; i40 < childCount2; i40++) {
                View childAt4 = getChildAt(i40);
                C1325m c1325m7 = (C1325m) childAt4.getLayoutParams();
                if (c1325m7.f15353f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1325m7.f15349b * i28) + c1325m7.f15350c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? i10 : i26);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f9035H.f15327E = z6;
    }

    public void setOnMenuItemClickListener(InterfaceC1327n interfaceC1327n) {
        this.f9041N = interfaceC1327n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1321k c1321k = this.f9035H;
        C1319j c1319j = c1321k.f15342w;
        if (c1319j != null) {
            c1319j.setImageDrawable(drawable);
        } else {
            c1321k.f15344y = true;
            c1321k.f15343x = drawable;
        }
    }

    public void setOverflowReserved(boolean z6) {
        this.f9034G = z6;
    }

    public void setPopupTheme(int i7) {
        if (this.f9033F != i7) {
            this.f9033F = i7;
            if (i7 == 0) {
                this.f9032E = getContext();
            } else {
                this.f9032E = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C1321k c1321k) {
        this.f9035H = c1321k;
        c1321k.f15341v = this;
        this.f9031D = c1321k.f15336q;
    }

    @Override // q.AbstractC1343v0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1325m(getContext(), attributeSet);
    }
}
