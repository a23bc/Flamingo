package androidx.core.widget;

import A.b;
import B0.a;
import B2.m;
import G1.B;
import G1.C0140g;
import G1.I;
import G1.InterfaceC0145l;
import G1.InterfaceC0146m;
import K1.c;
import K1.e;
import K1.f;
import K1.g;
import K1.i;
import a.AbstractC0509a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0146m {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final float f9356P = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final e f9357Q = new e();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f9358R = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f9359A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9360B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f9361C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f9362D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f9363E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9364F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int[] f9365G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int[] f9366H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9367I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f9368J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public i f9369K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final m f9370L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final a f9371M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f9372N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C0140g f9373O;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f9374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f9376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f9377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EdgeEffect f9378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EdgeEffect f9379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f9383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public VelocityTracker f9385z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, yos.music.player.R.attr.nestedScrollViewStyle);
        this.f9376q = new Rect();
        this.f9381v = true;
        this.f9382w = false;
        this.f9383x = null;
        this.f9384y = false;
        this.f9360B = true;
        this.f9364F = -1;
        this.f9365G = new int[2];
        this.f9366H = new int[2];
        this.f9373O = new C0140g(getContext(), new b(28, this));
        int i7 = Build.VERSION.SDK_INT;
        this.f9378s = i7 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f9379t = i7 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f9374o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f9377r = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9361C = viewConfiguration.getScaledTouchSlop();
        this.f9362D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9363E = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9358R, yos.music.player.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f9370L = new m();
        a aVar = new a();
        aVar.f608d = this;
        this.f9371M = aVar;
        setNestedScrollingEnabled(true);
        I.h(this, f9357Q);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // G1.InterfaceC0145l
    public final void a(View view, View view2, int i7, int i8) {
        m mVar = this.f9370L;
        if (i8 == 1) {
            mVar.f780b = i7;
        } else {
            mVar.f779a = i7;
        }
        w(2, i8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // G1.InterfaceC0145l
    public final void b(View view, int i7) {
        m mVar = this.f9370L;
        if (i7 == 1) {
            mVar.f780b = 0;
        } else {
            mVar.f779a = 0;
        }
        y(i7);
    }

    @Override // G1.InterfaceC0146m
    public final void c(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        o(i10, i11, iArr);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // G1.InterfaceC0145l
    public final void d(int i7, int i8, int[] iArr, int i9) {
        h(i7, i8, i9, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        ViewParent viewParentD;
        a aVar = this.f9371M;
        if (aVar.f605a && (viewParentD = aVar.d(0)) != null) {
            try {
                return viewParentD.onNestedFling((NestedScrollView) aVar.f608d, f7, f8, z6);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentD);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f9371M.a(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return h(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f9371M.b(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f9378s;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f9379t;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i7) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f9376q;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(g(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i7);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !n(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // G1.InterfaceC0145l
    public final void f(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11) {
        o(i10, i11, null);
    }

    public final int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        m mVar = this.f9370L;
        return mVar.f780b | mVar.f779a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f9372N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f9372N = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f9372N;
    }

    public final boolean h(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        ViewParent viewParentD;
        int i10;
        int i11;
        a aVar = this.f9371M;
        if (!aVar.f605a || (viewParentD = aVar.d(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) aVar.f608d;
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (((int[]) aVar.f609e) == null) {
                aVar.f609e = new int[2];
            }
            iArr = (int[]) aVar.f609e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentD instanceof InterfaceC0145l) {
            ((InterfaceC0145l) viewParentD).d(i7, i8, iArr, i9);
        } else if (i9 == 0) {
            try {
                viewParentD.onNestedPreScroll(nestedScrollView, i7, i8, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentD);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f9371M.d(0) != null;
    }

    @Override // G1.InterfaceC0145l
    public final boolean i(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9371M.f605a;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f9376q
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto L98
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L98
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc0
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L88
            r3 = 20
            if (r0 == r3) goto L78
            r3 = 62
            if (r0 == r3) goto L6d
            r6 = 92
            if (r0 == r6) goto L68
            r6 = 93
            if (r0 == r6) goto L63
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L5f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5b
            goto Lc0
        L5b:
            r5.r(r2)
            return r1
        L5f:
            r5.r(r4)
            return r1
        L63:
            boolean r6 = r5.l(r2)
            return r6
        L68:
            boolean r6 = r5.l(r4)
            return r6
        L6d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L74
            r2 = r4
        L74:
            r5.r(r2)
            return r1
        L78:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L83
            boolean r6 = r5.l(r2)
            return r6
        L83:
            boolean r6 = r5.e(r2)
            return r6
        L88:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L93
            boolean r6 = r5.l(r4)
            return r6
        L93:
            boolean r6 = r5.e(r4)
            return r6
        L98:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lc0
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lc0
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto Lac
            r6 = 0
        Lac:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lc0
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto Lc0
            r6 = 1
            return r6
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i7) {
        if (getChildCount() > 0) {
            this.f9377r.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f9368J = getScrollY();
            postInvalidateOnAnimation();
            if (B1.b.c()) {
                f.a(this, Math.abs(this.f9377r.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i7) {
        int childCount;
        boolean z6 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f9376q;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i7, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i7, int i8) {
        Rect rect = this.f9376q;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i8;
    }

    public final void o(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9371M.b(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9382w = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int measuredHeight;
        super.onLayout(z6, i7, i8, i9, i10);
        int i11 = 0;
        this.f9381v = false;
        View view = this.f9383x;
        if (view != null && m(view, this)) {
            View view2 = this.f9383x;
            Rect rect = this.f9376q;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iG = g(rect);
            if (iG != 0) {
                scrollBy(0, iG);
            }
        }
        this.f9383x = null;
        if (!this.f9382w) {
            if (this.f9369K != null) {
                scrollTo(getScrollX(), this.f9369K.f3967o);
                this.f9369K = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i11 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i11 != scrollY) {
                scrollTo(getScrollX(), i11);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9382w = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f9359A && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        k((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return this.f9371M.a(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        h(i7, i8, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        o(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i7, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f9369K = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f3967o = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i10)) {
            return;
        }
        Rect rect = this.f9376q;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iG = g(rect);
        if (iG != 0) {
            if (this.f9360B) {
                v(0, iG, false);
            } else {
                scrollBy(0, iG);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return i(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f9385z == null) {
            this.f9385z = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9367I = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f7 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f9367I);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f9379t;
            EdgeEffect edgeEffect2 = this.f9378s;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f9385z;
                velocityTracker.computeCurrentVelocity(1000, this.f9363E);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f9364F);
                if (Math.abs(yVelocity) >= this.f9362D) {
                    if (AbstractC0509a.A(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (AbstractC0509a.A(edgeEffect) != 0.0f) {
                        int i7 = -yVelocity;
                        if (u(edgeEffect, i7)) {
                            edgeEffect.onAbsorb(i7);
                        } else {
                            k(i7);
                        }
                    } else {
                        int i8 = -yVelocity;
                        float f8 = i8;
                        if (!this.f9371M.a(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            k(i8);
                        }
                    }
                } else if (this.f9377r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f9364F = -1;
                this.f9384y = false;
                VelocityTracker velocityTracker2 = this.f9385z;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f9385z = null;
                }
                y(0);
                this.f9378s.onRelease();
                this.f9379t.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9364F);
                if (iFindPointerIndex != -1) {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    int i9 = this.f9380u - y6;
                    float x6 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i9 / getHeight();
                    if (AbstractC0509a.A(edgeEffect2) != 0.0f) {
                        float f9 = -AbstractC0509a.R(edgeEffect2, -height, x6);
                        if (AbstractC0509a.A(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f7 = f9;
                    } else if (AbstractC0509a.A(edgeEffect) != 0.0f) {
                        float fR = AbstractC0509a.R(edgeEffect, height, 1.0f - x6);
                        if (AbstractC0509a.A(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f7 = fR;
                    }
                    int iRound = Math.round(f7 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i10 = i9 - iRound;
                    if (!this.f9384y && Math.abs(i10) > this.f9361C) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f9384y = true;
                        i10 = i10 > 0 ? i10 - this.f9361C : i10 + this.f9361C;
                    }
                    if (this.f9384y) {
                        int iT = t(i10, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f9380u = y6 - iT;
                        this.f9367I += iT;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f9384y && getChildCount() > 0 && this.f9377r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f9364F = -1;
                this.f9384y = false;
                VelocityTracker velocityTracker3 = this.f9385z;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f9385z = null;
                }
                y(0);
                this.f9378s.onRelease();
                this.f9379t.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f9380u = (int) motionEvent.getY(actionIndex);
                this.f9364F = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f9380u = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f9364F));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f9384y && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f9377r.isFinished()) {
                this.f9377r.abortAnimation();
                y(1);
            }
            int y7 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f9380u = y7;
            this.f9364F = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f9385z;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9364F) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f9380u = (int) motionEvent.getY(i7);
            this.f9364F = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f9385z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i7, int i8, int i9, int i10) {
        int i11;
        boolean z6;
        int i12;
        boolean z7;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i13 = i9 + i7;
        if (i8 <= 0 && i8 >= 0) {
            i11 = i8;
            z6 = false;
        } else {
            i11 = 0;
            z6 = true;
        }
        if (i13 > i10) {
            i12 = i10;
        } else {
            if (i13 >= 0) {
                i12 = i13;
                z7 = false;
                if (z7 && this.f9371M.d(1) == null) {
                    this.f9377r.springBack(i11, i12, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i11, i12);
                return !z6 || z7;
            }
            i12 = 0;
        }
        z7 = true;
        if (z7) {
            this.f9377r.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i12);
        if (z6) {
        }
    }

    public final void r(int i7) {
        boolean z6 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f9376q;
        if (z6) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i8 = rect.top;
        int i9 = height + i8;
        rect.bottom = i9;
        s(i7, i8, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f9381v) {
            this.f9383x = view2;
        } else {
            Rect rect = this.f9376q;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iG = g(rect);
            if (iG != 0) {
                scrollBy(0, iG);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iG = g(rect);
        boolean z7 = iG != 0;
        if (z7) {
            if (z6) {
                scrollBy(0, iG);
                return z7;
            }
            v(0, iG, false);
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f9385z) != null) {
            velocityTracker.recycle();
            this.f9385z = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f9381v = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.t(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r0.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, int):boolean");
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i8 < 0) {
                i8 = 0;
            } else if (height + i8 > height2) {
                i8 = height2 - height;
            }
            if (i7 == getScrollX() && i8 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i8);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f9359A) {
            this.f9359A = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        a aVar = this.f9371M;
        if (aVar.f605a) {
            WeakHashMap weakHashMap = I.f2641a;
            B.i((NestedScrollView) aVar.f608d);
        }
        aVar.f605a = z6;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f9360B = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return w(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i7, int i8, int i9, boolean z6) {
        int i10;
        int i11;
        boolean z7;
        VelocityTracker velocityTracker;
        if (i9 == 1) {
            w(2, i9);
        }
        boolean zH = h(0, i7, i9, this.f9366H, this.f9365G);
        int[] iArr = this.f9366H;
        int[] iArr2 = this.f9365G;
        if (zH) {
            i10 = i7 - iArr[1];
            i11 = iArr2[1];
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z8 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z6;
        boolean z9 = q(i10, 0, scrollY, scrollRange) && this.f9371M.d(i9) == null;
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f9371M.b(0, scrollY2, 0, i10 - scrollY2, this.f9365G, i9, iArr);
        int i12 = i11 + iArr2[1];
        int i13 = i10 - iArr[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f9379t;
        EdgeEffect edgeEffect2 = this.f9378s;
        if (i14 < 0) {
            if (z8) {
                AbstractC0509a.R(edgeEffect2, (-i13) / getHeight(), i8 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > scrollRange && z8) {
            AbstractC0509a.R(edgeEffect, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z7 = z9;
        } else {
            postInvalidateOnAnimation();
            z7 = false;
        }
        if (z7 && i9 == 0 && (velocityTracker = this.f9385z) != null) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
            y(i9);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i12;
    }

    public final boolean u(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float fA = AbstractC0509a.A(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i7) * 0.35f;
        float f7 = this.f9374o * 0.015f;
        double dLog = Math.log(fAbs / f7);
        double d4 = f9356P;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * dLog) * ((double) f7))) < fA;
    }

    public final void v(int i7, int i8, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9375p > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f9377r.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z6) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f9368J = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f9377r.isFinished()) {
                this.f9377r.abortAnimation();
                y(1);
            }
            scrollBy(i7, i8);
        }
        this.f9375p = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i7, int i8) {
        boolean zOnStartNestedScroll;
        a aVar = this.f9371M;
        if (aVar.d(i8) != null) {
            return true;
        }
        if (!aVar.f605a) {
            return false;
        }
        View view = (NestedScrollView) aVar.f608d;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            boolean z6 = parent instanceof InterfaceC0145l;
            if (z6) {
                zOnStartNestedScroll = ((InterfaceC0145l) parent).i(view2, view, i7, i8);
            } else if (i8 == 0) {
                try {
                    zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i7);
                } catch (AbstractMethodError unused) {
                    Objects.toString(parent);
                    zOnStartNestedScroll = false;
                }
            } else {
                zOnStartNestedScroll = false;
            }
            if (zOnStartNestedScroll) {
                if (i8 == 0) {
                    aVar.f606b = parent;
                } else if (i8 == 1) {
                    aVar.f607c = parent;
                }
                if (z6) {
                    ((InterfaceC0145l) parent).a(view2, view, i7, i8);
                } else if (i8 == 0) {
                    try {
                        parent.onNestedScrollAccepted(view2, view, i7);
                    } catch (AbstractMethodError unused2) {
                        Objects.toString(parent);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view2 = (View) parent;
            }
        }
        return false;
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f9378s;
        if (AbstractC0509a.A(edgeEffect) != 0.0f) {
            AbstractC0509a.R(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f9379t;
        if (AbstractC0509a.A(edgeEffect2) == 0.0f) {
            return z6;
        }
        AbstractC0509a.R(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i7) {
        a aVar = this.f9371M;
        ViewParent viewParentD = aVar.d(i7);
        if (viewParentD != null) {
            boolean z6 = viewParentD instanceof InterfaceC0145l;
            NestedScrollView nestedScrollView = (NestedScrollView) aVar.f608d;
            if (z6) {
                ((InterfaceC0145l) viewParentD).b(nestedScrollView, i7);
            } else if (i7 == 0) {
                try {
                    viewParentD.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentD);
                }
            }
            if (i7 == 0) {
                aVar.f606b = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                aVar.f607c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
