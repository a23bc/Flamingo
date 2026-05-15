package androidx.appcompat.widget;

import B2.m;
import G1.AbstractC0158z;
import G1.B;
import G1.I;
import G1.InterfaceC0145l;
import G1.InterfaceC0146m;
import G1.M;
import G1.a0;
import G1.b0;
import G1.c0;
import G1.d0;
import G1.j0;
import G1.m0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import i6.g;
import java.util.WeakHashMap;
import k.K;
import o.j;
import p.l;
import p.w;
import q.C1309e;
import q.C1311f;
import q.C1321k;
import q.InterfaceC1307d;
import q.InterfaceC1318i0;
import q.InterfaceC1320j0;
import q.RunnableC1305c;
import q.W0;
import q.b1;
import y1.C1993b;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1318i0, InterfaceC0145l, InterfaceC0146m {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[] f9000Q = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final m0 f9001R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Rect f9002S;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f9003A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Rect f9004B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f9005C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f9006D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public m0 f9007E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public m0 f9008F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public m0 f9009G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public m0 f9010H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public InterfaceC1307d f9011I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public OverScroller f9012J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ViewPropertyAnimator f9013K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final M f9014L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RunnableC1305c f9015M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final RunnableC1305c f9016N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final m f9017O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C1311f f9018P;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ContentFrameLayout f9021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ActionBarContainer f9022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC1320j0 f9023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f9024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9025u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9026v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9029y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9030z;

    static {
        int i7 = Build.VERSION.SDK_INT;
        d0 c0Var = i7 >= 30 ? new c0() : i7 >= 29 ? new b0() : new a0();
        c0Var.g(C1993b.b(0, 1, 0, 1));
        f9001R = c0Var.b();
        f9002S = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9020p = 0;
        this.f9003A = new Rect();
        this.f9004B = new Rect();
        this.f9005C = new Rect();
        this.f9006D = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        m0 m0Var = m0.f2724b;
        this.f9007E = m0Var;
        this.f9008F = m0Var;
        this.f9009G = m0Var;
        this.f9010H = m0Var;
        this.f9014L = new M(3, this);
        this.f9015M = new RunnableC1305c(this, 0);
        this.f9016N = new RunnableC1305c(this, 1);
        h(context);
        this.f9017O = new m();
        C1311f c1311f = new C1311f(context);
        c1311f.setWillNotDraw(true);
        this.f9018P = c1311f;
        addView(c1311f);
    }

    public static boolean e(View view, Rect rect, boolean z6) {
        boolean z7;
        C1309e c1309e = (C1309e) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) c1309e).leftMargin;
        int i8 = rect.left;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c1309e).leftMargin = i8;
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c1309e).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c1309e).topMargin = i10;
            z7 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c1309e).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c1309e).rightMargin = i12;
            z7 = true;
        }
        if (z6) {
            int i13 = ((ViewGroup.MarginLayoutParams) c1309e).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c1309e).bottomMargin = i14;
                return true;
            }
        }
        return z7;
    }

    @Override // G1.InterfaceC0145l
    public final void a(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // G1.InterfaceC0145l
    public final void b(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // G1.InterfaceC0146m
    public final void c(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        f(nestedScrollView, i7, i8, i9, i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1309e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f9024t != null) {
            if (this.f9022r.getVisibility() == 0) {
                translationY = (int) (this.f9022r.getTranslationY() + this.f9022r.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f9024t.setBounds(0, translationY, getWidth(), this.f9024t.getIntrinsicHeight() + translationY);
            this.f9024t.draw(canvas);
        }
    }

    @Override // G1.InterfaceC0145l
    public final void f(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(nestedScrollView, i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        removeCallbacks(this.f9015M);
        removeCallbacks(this.f9016N);
        ViewPropertyAnimator viewPropertyAnimator = this.f9013K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1309e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1309e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f9022r;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        m mVar = this.f9017O;
        return mVar.f780b | mVar.f779a;
    }

    public CharSequence getTitle() {
        k();
        return ((b1) this.f9023s).f15264a.getTitle();
    }

    public final void h(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f9000Q);
        this.f9019o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f9024t = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f9012J = new OverScroller(context);
    }

    @Override // G1.InterfaceC0145l
    public final boolean i(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    public final void j(int i7) {
        k();
        if (i7 == 2) {
            this.f9023s.getClass();
        } else if (i7 == 5) {
            this.f9023s.getClass();
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC1320j0 wrapper;
        if (this.f9021q == null) {
            this.f9021q = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f9022r = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1320j0) {
                wrapper = (InterfaceC1320j0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f9023s = wrapper;
        }
    }

    public final void l(l lVar, w wVar) {
        k();
        b1 b1Var = (b1) this.f9023s;
        C1321k c1321k = b1Var.f15274m;
        Toolbar toolbar = b1Var.f15264a;
        if (c1321k == null) {
            b1Var.f15274m = new C1321k(toolbar.getContext());
        }
        C1321k c1321k2 = b1Var.f15274m;
        c1321k2.f15338s = wVar;
        if (lVar == null && toolbar.f9086o == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.f9086o.f9031D;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.b0);
            lVar2.r(toolbar.f9080c0);
        }
        if (toolbar.f9080c0 == null) {
            toolbar.f9080c0 = new W0(toolbar);
        }
        c1321k2.f15327E = true;
        if (lVar != null) {
            lVar.b(c1321k2, toolbar.f9095x);
            lVar.b(toolbar.f9080c0, toolbar.f9095x);
        } else {
            c1321k2.g(toolbar.f9095x, null);
            toolbar.f9080c0.g(toolbar.f9095x, null);
            c1321k2.d();
            toolbar.f9080c0.d();
        }
        toolbar.f9086o.setPopupTheme(toolbar.f9096y);
        toolbar.f9086o.setPresenter(c1321k2);
        toolbar.b0 = c1321k2;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        m0 m0VarC = m0.c(this, windowInsets);
        j0 j0Var = m0VarC.f2725a;
        boolean zE = e(this.f9022r, new Rect(j0Var.l().f20271a, j0Var.l().f20272b, j0Var.l().f20273c, j0Var.l().f20274d), false);
        WeakHashMap weakHashMap = I.f2641a;
        Rect rect = this.f9003A;
        B.b(this, m0VarC, rect);
        m0 m0VarN = j0Var.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f9007E = m0VarN;
        boolean z6 = true;
        if (!this.f9008F.equals(m0VarN)) {
            this.f9008F = this.f9007E;
            zE = true;
        }
        Rect rect2 = this.f9004B;
        if (rect2.equals(rect)) {
            z6 = zE;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return j0Var.a().f2725a.c().f2725a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h(getContext());
        WeakHashMap weakHashMap = I.f2641a;
        AbstractC0158z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1309e c1309e = (C1309e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c1309e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c1309e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (!this.f9027w || !z6) {
            return false;
        }
        this.f9012J.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f9012J.getFinalY() > this.f9022r.getHeight()) {
            g();
            this.f9016N.run();
        } else {
            g();
            this.f9015M.run();
        }
        this.f9028x = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f9029y + i8;
        this.f9029y = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        K k7;
        j jVar;
        this.f9017O.f779a = i7;
        this.f9029y = getActionBarHideOffset();
        g();
        InterfaceC1307d interfaceC1307d = this.f9011I;
        if (interfaceC1307d == null || (jVar = (k7 = (K) interfaceC1307d).f13871t) == null) {
            return;
        }
        jVar.a();
        k7.f13871t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f9022r.getVisibility() != 0) {
            return false;
        }
        return this.f9027w;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f9027w || this.f9028x) {
            return;
        }
        if (this.f9029y <= this.f9022r.getHeight()) {
            g();
            postDelayed(this.f9015M, 600L);
        } else {
            g();
            postDelayed(this.f9016N, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        k();
        int i8 = this.f9030z ^ i7;
        this.f9030z = i7;
        boolean z6 = (i7 & 4) == 0;
        boolean z7 = (i7 & 256) != 0;
        InterfaceC1307d interfaceC1307d = this.f9011I;
        if (interfaceC1307d != null) {
            K k7 = (K) interfaceC1307d;
            k7.f13867p = !z7;
            if (z6 || !z7) {
                if (k7.f13868q) {
                    k7.f13868q = false;
                    k7.U(true);
                }
            } else if (!k7.f13868q) {
                k7.f13868q = true;
                k7.U(true);
            }
        }
        if ((i8 & 256) == 0 || this.f9011I == null) {
            return;
        }
        WeakHashMap weakHashMap = I.f2641a;
        AbstractC0158z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f9020p = i7;
        InterfaceC1307d interfaceC1307d = this.f9011I;
        if (interfaceC1307d != null) {
            ((K) interfaceC1307d).f13866o = i7;
        }
    }

    public void setActionBarHideOffset(int i7) {
        g();
        this.f9022r.setTranslationY(-Math.max(0, Math.min(i7, this.f9022r.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1307d interfaceC1307d) {
        this.f9011I = interfaceC1307d;
        if (getWindowToken() != null) {
            ((K) this.f9011I).f13866o = this.f9020p;
            int i7 = this.f9030z;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap weakHashMap = I.f2641a;
                AbstractC0158z.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f9026v = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f9027w) {
            this.f9027w = z6;
            if (z6) {
                return;
            }
            g();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        k();
        b1 b1Var = (b1) this.f9023s;
        b1Var.f15267d = i7 != 0 ? g.v(b1Var.f15264a.getContext(), i7) : null;
        b1Var.c();
    }

    public void setLogo(int i7) {
        k();
        b1 b1Var = (b1) this.f9023s;
        b1Var.f15268e = i7 != 0 ? g.v(b1Var.f15264a.getContext(), i7) : null;
        b1Var.c();
    }

    public void setOverlayMode(boolean z6) {
        this.f9025u = z6;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // q.InterfaceC1318i0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((b1) this.f9023s).f15273k = callback;
    }

    @Override // q.InterfaceC1318i0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        b1 b1Var = (b1) this.f9023s;
        if (b1Var.f15270g) {
            return;
        }
        b1Var.h = charSequence;
        if ((b1Var.f15265b & 8) != 0) {
            Toolbar toolbar = b1Var.f15264a;
            toolbar.setTitle(charSequence);
            if (b1Var.f15270g) {
                I.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1309e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        b1 b1Var = (b1) this.f9023s;
        b1Var.f15267d = drawable;
        b1Var.c();
    }

    @Override // G1.InterfaceC0145l
    public final void d(int i7, int i8, int[] iArr, int i9) {
    }
}
