package androidx.appcompat.widget;

import A0.b;
import B3.c;
import G1.I;
import G1.InterfaceC0143j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import i6.g;
import j.AbstractC1089a;
import j5.AbstractC1109c;
import java.util.ArrayList;
import java.util.Iterator;
import k.ViewOnClickListenerC1114b;
import o.h;
import p.l;
import p.n;
import q.C1302a0;
import q.C1321k;
import q.C1344w;
import q.C1346x;
import q.InterfaceC1320j0;
import q.M0;
import q.S0;
import q.T0;
import q.U0;
import q.V0;
import q.W0;
import q.X0;
import q.Y0;
import q.Z0;
import q.a1;
import q.b1;
import q.j1;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0143j {

    /* JADX INFO: renamed from: A */
    public int f9057A;

    /* JADX INFO: renamed from: B */
    public final int f9058B;

    /* JADX INFO: renamed from: C */
    public final int f9059C;

    /* JADX INFO: renamed from: D */
    public int f9060D;

    /* JADX INFO: renamed from: E */
    public int f9061E;

    /* JADX INFO: renamed from: F */
    public int f9062F;

    /* JADX INFO: renamed from: G */
    public int f9063G;

    /* JADX INFO: renamed from: H */
    public M0 f9064H;

    /* JADX INFO: renamed from: I */
    public int f9065I;

    /* JADX INFO: renamed from: J */
    public int f9066J;

    /* JADX INFO: renamed from: K */
    public final int f9067K;

    /* JADX INFO: renamed from: L */
    public CharSequence f9068L;

    /* JADX INFO: renamed from: M */
    public CharSequence f9069M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f9070N;

    /* JADX INFO: renamed from: O */
    public ColorStateList f9071O;

    /* JADX INFO: renamed from: P */
    public boolean f9072P;

    /* JADX INFO: renamed from: Q */
    public boolean f9073Q;

    /* JADX INFO: renamed from: R */
    public final ArrayList f9074R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f9075S;

    /* JADX INFO: renamed from: T */
    public final int[] f9076T;

    /* JADX INFO: renamed from: U */
    public final b f9077U;

    /* JADX INFO: renamed from: V */
    public ArrayList f9078V;

    /* JADX INFO: renamed from: W */
    public final U0 f9079W;
    public b1 a0;
    public C1321k b0;

    /* JADX INFO: renamed from: c0 */
    public W0 f9080c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f9081d0;

    /* JADX INFO: renamed from: e0 */
    public OnBackInvokedCallback f9082e0;

    /* JADX INFO: renamed from: f0 */
    public OnBackInvokedDispatcher f9083f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f9084g0;

    /* JADX INFO: renamed from: h0 */
    public final c f9085h0;

    /* JADX INFO: renamed from: o */
    public ActionMenuView f9086o;

    /* JADX INFO: renamed from: p */
    public C1302a0 f9087p;

    /* JADX INFO: renamed from: q */
    public C1302a0 f9088q;

    /* JADX INFO: renamed from: r */
    public C1344w f9089r;

    /* JADX INFO: renamed from: s */
    public C1346x f9090s;

    /* JADX INFO: renamed from: t */
    public final Drawable f9091t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f9092u;

    /* JADX INFO: renamed from: v */
    public C1344w f9093v;

    /* JADX INFO: renamed from: w */
    public View f9094w;

    /* JADX INFO: renamed from: x */
    public Context f9095x;

    /* JADX INFO: renamed from: y */
    public int f9096y;

    /* JADX INFO: renamed from: z */
    public int f9097z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f9067K = 8388627;
        this.f9074R = new ArrayList();
        this.f9075S = new ArrayList();
        this.f9076T = new int[2];
        this.f9077U = new b((Runnable) new T0(this, 1));
        this.f9078V = new ArrayList();
        this.f9079W = new U0(this);
        this.f9085h0 = new c(12, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1089a.f13614w;
        S0 s0K = S0.k(context2, attributeSet, iArr, R.attr.toolbarStyle);
        I.g(this, context, iArr, attributeSet, (TypedArray) s0K.f15226q, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        this.f9097z = typedArray.getResourceId(28, 0);
        this.f9057A = typedArray.getResourceId(19, 0);
        this.f9067K = typedArray.getInteger(0, 8388627);
        this.f9058B = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f9063G = dimensionPixelOffset;
        this.f9062F = dimensionPixelOffset;
        this.f9061E = dimensionPixelOffset;
        this.f9060D = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f9060D = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f9061E = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f9062F = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f9063G = dimensionPixelOffset5;
        }
        this.f9059C = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        M0 m02 = this.f9064H;
        m02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            m02.f15203e = dimensionPixelSize;
            m02.f15199a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            m02.f15204f = dimensionPixelSize2;
            m02.f15200b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            m02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f9065I = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f9066J = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f9091t = s0K.g(4);
        this.f9092u = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f9095x = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableG = s0K.g(16);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableG2 = s0K.g(11);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(s0K.f(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(s0K.f(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        s0K.l();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static X0 h() {
        X0 x02 = new X0(-2, -2);
        x02.f15246b = 0;
        x02.f15245a = 8388627;
        return x02;
    }

    public static X0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z6 = layoutParams instanceof X0;
        if (z6) {
            X0 x02 = (X0) layoutParams;
            X0 x03 = new X0(x02);
            x03.f15246b = 0;
            x03.f15246b = x02.f15246b;
            return x03;
        }
        if (z6) {
            X0 x04 = new X0((X0) layoutParams);
            x04.f15246b = 0;
            return x04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            X0 x05 = new X0(layoutParams);
            x05.f15246b = 0;
            return x05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        X0 x06 = new X0(marginLayoutParams);
        x06.f15246b = 0;
        ((ViewGroup.MarginLayoutParams) x06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) x06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) x06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) x06).bottomMargin = marginLayoutParams.bottomMargin;
        return x06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                X0 x02 = (X0) childAt.getLayoutParams();
                if (x02.f15246b == 0 && s(childAt)) {
                    int i9 = x02.f15245a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            X0 x03 = (X0) childAt2.getLayoutParams();
            if (x03.f15246b == 0 && s(childAt2)) {
                int i11 = x03.f15245a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i11, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        X0 x0H = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (X0) layoutParams;
        x0H.f15246b = 1;
        if (!z6 || this.f9094w == null) {
            addView(view, x0H);
        } else {
            view.setLayoutParams(x0H);
            this.f9075S.add(view);
        }
    }

    public final void c() {
        if (this.f9093v == null) {
            C1344w c1344w = new C1344w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f9093v = c1344w;
            c1344w.setImageDrawable(this.f9091t);
            this.f9093v.setContentDescription(this.f9092u);
            X0 x0H = h();
            x0H.f15245a = (this.f9058B & 112) | 8388611;
            x0H.f15246b = 2;
            this.f9093v.setLayoutParams(x0H);
            this.f9093v.setOnClickListener(new ViewOnClickListenerC1114b(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof X0);
    }

    public final void d() {
        if (this.f9064H == null) {
            M0 m02 = new M0();
            m02.f15199a = 0;
            m02.f15200b = 0;
            m02.f15201c = Integer.MIN_VALUE;
            m02.f15202d = Integer.MIN_VALUE;
            m02.f15203e = 0;
            m02.f15204f = 0;
            m02.f15205g = false;
            m02.h = false;
            this.f9064H = m02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f9086o;
        if (actionMenuView.f9031D == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.f9080c0 == null) {
                this.f9080c0 = new W0(this);
            }
            this.f9086o.setExpandedActionViewsExclusive(true);
            lVar.b(this.f9080c0, this.f9095x);
            t();
        }
    }

    public final void f() {
        if (this.f9086o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f9086o = actionMenuView;
            actionMenuView.setPopupTheme(this.f9096y);
            this.f9086o.setOnMenuItemClickListener(this.f9079W);
            ActionMenuView actionMenuView2 = this.f9086o;
            U0 u02 = new U0(this);
            actionMenuView2.getClass();
            actionMenuView2.f9036I = u02;
            X0 x0H = h();
            x0H.f15245a = (this.f9058B & 112) | 8388613;
            this.f9086o.setLayoutParams(x0H);
            b(this.f9086o, false);
        }
    }

    public final void g() {
        if (this.f9089r == null) {
            this.f9089r = new C1344w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            X0 x0H = h();
            x0H.f15245a = (this.f9058B & 112) | 8388611;
            this.f9089r.setLayoutParams(x0H);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1344w c1344w = this.f9093v;
        if (c1344w != null) {
            return c1344w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1344w c1344w = this.f9093v;
        if (c1344w != null) {
            return c1344w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        M0 m02 = this.f9064H;
        if (m02 != null) {
            return m02.f15205g ? m02.f15199a : m02.f15200b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f9066J;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        M0 m02 = this.f9064H;
        if (m02 != null) {
            return m02.f15199a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        M0 m02 = this.f9064H;
        if (m02 != null) {
            return m02.f15200b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        M0 m02 = this.f9064H;
        if (m02 != null) {
            return m02.f15205g ? m02.f15200b : m02.f15199a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f9065I;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f9086o;
        return (actionMenuView == null || (lVar = actionMenuView.f9031D) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f9066J, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f9065I, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1346x c1346x = this.f9090s;
        if (c1346x != null) {
            return c1346x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1346x c1346x = this.f9090s;
        if (c1346x != null) {
            return c1346x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f9086o.getMenu();
    }

    public View getNavButtonView() {
        return this.f9089r;
    }

    public CharSequence getNavigationContentDescription() {
        C1344w c1344w = this.f9089r;
        if (c1344w != null) {
            return c1344w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1344w c1344w = this.f9089r;
        if (c1344w != null) {
            return c1344w.getDrawable();
        }
        return null;
    }

    public C1321k getOuterActionMenuPresenter() {
        return this.b0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f9086o.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f9095x;
    }

    public int getPopupTheme() {
        return this.f9096y;
    }

    public CharSequence getSubtitle() {
        return this.f9069M;
    }

    public final TextView getSubtitleTextView() {
        return this.f9088q;
    }

    public CharSequence getTitle() {
        return this.f9068L;
    }

    public int getTitleMarginBottom() {
        return this.f9063G;
    }

    public int getTitleMarginEnd() {
        return this.f9061E;
    }

    public int getTitleMarginStart() {
        return this.f9060D;
    }

    public int getTitleMarginTop() {
        return this.f9062F;
    }

    public final TextView getTitleTextView() {
        return this.f9087p;
    }

    public InterfaceC1320j0 getWrapper() {
        Drawable drawable;
        if (this.a0 == null) {
            b1 b1Var = new b1();
            b1Var.f15275n = 0;
            b1Var.f15264a = this;
            b1Var.h = getTitle();
            b1Var.f15271i = getSubtitle();
            b1Var.f15270g = b1Var.h != null;
            b1Var.f15269f = getNavigationIcon();
            S0 s0K = S0.k(getContext(), null, AbstractC1089a.f13594a, R.attr.actionBarStyle);
            b1Var.f15276o = s0K.g(15);
            TypedArray typedArray = (TypedArray) s0K.f15226q;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                b1Var.f15270g = true;
                b1Var.h = text;
                if ((b1Var.f15265b & 8) != 0) {
                    Toolbar toolbar = b1Var.f15264a;
                    toolbar.setTitle(text);
                    if (b1Var.f15270g) {
                        I.i(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                b1Var.f15271i = text2;
                if ((b1Var.f15265b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableG = s0K.g(20);
            if (drawableG != null) {
                b1Var.f15268e = drawableG;
                b1Var.c();
            }
            Drawable drawableG2 = s0K.g(17);
            if (drawableG2 != null) {
                b1Var.f15267d = drawableG2;
                b1Var.c();
            }
            if (b1Var.f15269f == null && (drawable = b1Var.f15276o) != null) {
                b1Var.f15269f = drawable;
                int i7 = b1Var.f15265b & 4;
                Toolbar toolbar2 = b1Var.f15264a;
                if (i7 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            b1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = b1Var.f15266c;
                if (view != null && (b1Var.f15265b & 16) != 0) {
                    removeView(view);
                }
                b1Var.f15266c = viewInflate;
                if (viewInflate != null && (b1Var.f15265b & 16) != 0) {
                    addView(viewInflate);
                }
                b1Var.a(b1Var.f15265b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f9064H.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f9097z = resourceId2;
                C1302a0 c1302a0 = this.f9087p;
                if (c1302a0 != null) {
                    c1302a0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f9057A = resourceId3;
                C1302a0 c1302a02 = this.f9088q;
                if (c1302a02 != null) {
                    c1302a02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            s0K.l();
            if (R.string.abc_action_bar_up_description != b1Var.f15275n) {
                b1Var.f15275n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i8 = b1Var.f15275n;
                    b1Var.f15272j = i8 != 0 ? getContext().getString(i8) : null;
                    b1Var.b();
                }
            }
            b1Var.f15272j = getNavigationContentDescription();
            setNavigationOnClickListener(new a1(b1Var));
            this.a0 = b1Var;
        }
        return this.a0;
    }

    public final int j(View view, int i7) {
        X0 x02 = (X0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i9 = x02.f15245a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f9067K & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i8;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) x02).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) x02).topMargin;
        if (iMax < i10) {
            iMax = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) x02).bottomMargin;
            if (i11 < i12) {
                iMax = Math.max(0, iMax - (i12 - i11));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.f9078V.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        this.f9077U.d0();
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f9078V = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f9075S.contains(view);
    }

    public final int o(View view, int i7, int i8, int[] iArr) {
        X0 x02 = (X0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) x02).leftMargin - iArr[0];
        int iMax = Math.max(0, i9) + i7;
        iArr[0] = Math.max(0, -i9);
        int iJ = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) x02).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f9085h0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9073Q = false;
        }
        if (!this.f9073Q) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f9073Q = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f9073Q = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x028f A[LOOP:0: B:227:0x028d->B:228:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02a7 A[LOOP:1: B:230:0x02a5->B:231:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c8 A[LOOP:2: B:233:0x02c6->B:234:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0318 A[LOOP:3: B:242:0x0316->B:243:0x0318, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        byte b7;
        byte b8;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z6 = j1.f15320a;
        int i9 = 0;
        if (getLayoutDirection() == 1) {
            b8 = true;
            b7 = 0;
        } else {
            b7 = 1;
            b8 = false;
        }
        if (s(this.f9089r)) {
            r(this.f9089r, i7, 0, i8, this.f9059C);
            iK = k(this.f9089r) + this.f9089r.getMeasuredWidth();
            iMax = Math.max(0, l(this.f9089r) + this.f9089r.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f9089r.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.f9093v)) {
            r(this.f9093v, i7, 0, i8, this.f9059C);
            iK = k(this.f9093v) + this.f9093v.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f9093v) + this.f9093v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9093v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b9 = b8;
        int[] iArr = this.f9076T;
        iArr[b9 == true ? 1 : 0] = iMax4;
        if (s(this.f9086o)) {
            r(this.f9086o, i7, iMax3, i8, this.f9059C);
            iK2 = k(this.f9086o) + this.f9086o.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f9086o) + this.f9086o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9086o.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b7] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f9094w)) {
            iMax5 += q(this.f9094w, i7, iMax5, i8, 0, iArr);
            iMax = Math.max(iMax, l(this.f9094w) + this.f9094w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9094w.getMeasuredState());
        }
        if (s(this.f9090s)) {
            iMax5 += q(this.f9090s, i7, iMax5, i8, 0, iArr);
            iMax = Math.max(iMax, l(this.f9090s) + this.f9090s.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9090s.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((X0) childAt.getLayoutParams()).f15246b == 0 && s(childAt)) {
                iMax5 += q(childAt, i7, iMax5, i8, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i11 = iMax5;
        int i12 = this.f9062F + this.f9063G;
        int i13 = this.f9060D + this.f9061E;
        if (s(this.f9087p)) {
            q(this.f9087p, i7, i11 + i13, i8, i12, iArr);
            int iK3 = k(this.f9087p) + this.f9087p.getMeasuredWidth();
            iL = l(this.f9087p) + this.f9087p.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f9087p.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.f9088q)) {
            iMax2 = Math.max(iMax2, q(this.f9088q, i7, i11 + i13, i8, i12 + iL, iArr));
            iL += l(this.f9088q) + this.f9088q.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f9088q.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i11 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16);
        if (!this.f9081d0) {
            i9 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i9 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i9);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof Z0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Z0 z02 = (Z0) parcelable;
        super.onRestoreInstanceState(z02.f4757o);
        ActionMenuView actionMenuView = this.f9086o;
        l lVar = actionMenuView != null ? actionMenuView.f9031D : null;
        int i7 = z02.f15249q;
        if (i7 != 0 && this.f9080c0 != null && lVar != null && (menuItemFindItem = lVar.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (z02.f15250r) {
            c cVar = this.f9085h0;
            removeCallbacks(cVar);
            post(cVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        M0 m02 = this.f9064H;
        boolean z6 = i7 == 1;
        if (z6 == m02.f15205g) {
            return;
        }
        m02.f15205g = z6;
        if (!m02.h) {
            m02.f15199a = m02.f15203e;
            m02.f15200b = m02.f15204f;
            return;
        }
        if (z6) {
            int i8 = m02.f15202d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = m02.f15203e;
            }
            m02.f15199a = i8;
            int i9 = m02.f15201c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = m02.f15204f;
            }
            m02.f15200b = i9;
            return;
        }
        int i10 = m02.f15201c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = m02.f15203e;
        }
        m02.f15199a = i10;
        int i11 = m02.f15202d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = m02.f15204f;
        }
        m02.f15200b = i11;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1321k c1321k;
        n nVar;
        Z0 z02 = new Z0(super.onSaveInstanceState());
        W0 w02 = this.f9080c0;
        if (w02 != null && (nVar = w02.f15243p) != null) {
            z02.f15249q = nVar.f14843a;
        }
        ActionMenuView actionMenuView = this.f9086o;
        z02.f15250r = (actionMenuView == null || (c1321k = actionMenuView.f9035H) == null || !c1321k.e()) ? false : true;
        return z02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9072P = false;
        }
        if (!this.f9072P) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f9072P = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f9072P = false;
        return true;
    }

    public final int p(View view, int i7, int i8, int[] iArr) {
        X0 x02 = (X0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) x02).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int iJ = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) x02).leftMargin);
    }

    public final int q(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + iMax + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f9084g0 != z6) {
            this.f9084g0 = z6;
            t();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(g.v(getContext(), i7));
    }

    public void setCollapsible(boolean z6) {
        this.f9081d0 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f9066J) {
            this.f9066J = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f9065I) {
            this.f9065I = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(g.v(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(g.v(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f9089r.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f9086o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f9096y != i7) {
            this.f9096y = i7;
            if (i7 == 0) {
                this.f9095x = getContext();
            } else {
                this.f9095x = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f9063G = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f9061E = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f9060D = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f9062F = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = V0.a(this);
            W0 w02 = this.f9080c0;
            boolean z6 = (w02 == null || w02.f15243p == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f9084g0) ? false : true;
            if (z6 && this.f9083f0 == null) {
                if (this.f9082e0 == null) {
                    this.f9082e0 = V0.b(new T0(this, 0));
                }
                V0.c(onBackInvokedDispatcherA, this.f9082e0);
                this.f9083f0 = onBackInvokedDispatcherA;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.f9083f0) == null) {
                return;
            }
            V0.d(onBackInvokedDispatcher, this.f9082e0);
            this.f9083f0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        X0 x02 = new X0(context, attributeSet);
        x02.f15245a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13595b);
        x02.f15245a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        x02.f15246b = 0;
        return x02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1344w c1344w = this.f9093v;
        if (c1344w != null) {
            c1344w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f9093v.setImageDrawable(drawable);
        } else {
            C1344w c1344w = this.f9093v;
            if (c1344w != null) {
                c1344w.setImageDrawable(this.f9091t);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f9090s == null) {
                this.f9090s = new C1346x(getContext(), null, 0);
            }
            if (!n(this.f9090s)) {
                b(this.f9090s, true);
            }
        } else {
            C1346x c1346x = this.f9090s;
            if (c1346x != null && n(c1346x)) {
                removeView(this.f9090s);
                this.f9075S.remove(this.f9090s);
            }
        }
        C1346x c1346x2 = this.f9090s;
        if (c1346x2 != null) {
            c1346x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f9090s == null) {
            this.f9090s = new C1346x(getContext(), null, 0);
        }
        C1346x c1346x = this.f9090s;
        if (c1346x != null) {
            c1346x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1344w c1344w = this.f9089r;
        if (c1344w != null) {
            c1344w.setContentDescription(charSequence);
            AbstractC1109c.y(this.f9089r, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f9089r)) {
                b(this.f9089r, true);
            }
        } else {
            C1344w c1344w = this.f9089r;
            if (c1344w != null && n(c1344w)) {
                removeView(this.f9089r);
                this.f9075S.remove(this.f9089r);
            }
        }
        C1344w c1344w2 = this.f9089r;
        if (c1344w2 != null) {
            c1344w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1302a0 c1302a0 = this.f9088q;
            if (c1302a0 != null && n(c1302a0)) {
                removeView(this.f9088q);
                this.f9075S.remove(this.f9088q);
            }
        } else {
            if (this.f9088q == null) {
                Context context = getContext();
                C1302a0 c1302a02 = new C1302a0(context, null);
                this.f9088q = c1302a02;
                c1302a02.setSingleLine();
                this.f9088q.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f9057A;
                if (i7 != 0) {
                    this.f9088q.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f9071O;
                if (colorStateList != null) {
                    this.f9088q.setTextColor(colorStateList);
                }
            }
            if (!n(this.f9088q)) {
                b(this.f9088q, true);
            }
        }
        C1302a0 c1302a03 = this.f9088q;
        if (c1302a03 != null) {
            c1302a03.setText(charSequence);
        }
        this.f9069M = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f9071O = colorStateList;
        C1302a0 c1302a0 = this.f9088q;
        if (c1302a0 != null) {
            c1302a0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1302a0 c1302a0 = this.f9087p;
            if (c1302a0 != null && n(c1302a0)) {
                removeView(this.f9087p);
                this.f9075S.remove(this.f9087p);
            }
        } else {
            if (this.f9087p == null) {
                Context context = getContext();
                C1302a0 c1302a02 = new C1302a0(context, null);
                this.f9087p = c1302a02;
                c1302a02.setSingleLine();
                this.f9087p.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f9097z;
                if (i7 != 0) {
                    this.f9087p.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f9070N;
                if (colorStateList != null) {
                    this.f9087p.setTextColor(colorStateList);
                }
            }
            if (!n(this.f9087p)) {
                b(this.f9087p, true);
            }
        }
        C1302a0 c1302a03 = this.f9087p;
        if (c1302a03 != null) {
            c1302a03.setText(charSequence);
        }
        this.f9068L = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f9070N = colorStateList;
        C1302a0 c1302a0 = this.f9087p;
        if (c1302a0 != null) {
            c1302a0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(Y0 y02) {
    }
}
