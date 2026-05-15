package androidx.appcompat.widget;

import G1.I;
import G1.N;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import i6.g;
import j.AbstractC1089a;
import k.ViewOnClickListenerC1114b;
import o.AbstractC1243a;
import p.l;
import p.z;
import q.C1301a;
import q.C1313g;
import q.C1321k;
import q.j1;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f8980A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f8981B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f8982C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f8983D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f8984E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f8985F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f8986G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f8987H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1301a f8988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f8989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActionMenuView f8990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1321k f8991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public N f8993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f8996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f8997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f8998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f8999z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f8988o = new C1301a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f8989p = context;
        } else {
            this.f8989p = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13597d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : g.v(context, resourceId));
        this.f8984E = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f8985F = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f8992s = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f8987H = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i7, int i8) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, i7 - view.getMeasuredWidth());
    }

    public static int g(View view, int i7, int i8, int i9, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z6) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC1243a abstractC1243a) {
        View view = this.f8998y;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f8987H, (ViewGroup) this, false);
            this.f8998y = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f8998y);
        }
        View viewFindViewById = this.f8998y.findViewById(R.id.action_mode_close_button);
        this.f8999z = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1114b(1, abstractC1243a));
        l lVarC = abstractC1243a.c();
        C1321k c1321k = this.f8991r;
        if (c1321k != null) {
            c1321k.c();
            C1313g c1313g = c1321k.f15330H;
            if (c1313g != null && c1313g.b()) {
                c1313g.f14886i.dismiss();
            }
        }
        C1321k c1321k2 = new C1321k(getContext());
        this.f8991r = c1321k2;
        c1321k2.f15345z = true;
        c1321k2.f15323A = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        lVarC.b(this.f8991r, this.f8989p);
        C1321k c1321k3 = this.f8991r;
        z zVar = c1321k3.f15341v;
        if (zVar == null) {
            z zVar2 = (z) c1321k3.f15337r.inflate(c1321k3.f15339t, (ViewGroup) this, false);
            c1321k3.f15341v = zVar2;
            zVar2.a(c1321k3.f15336q);
            c1321k3.d();
        }
        z zVar3 = c1321k3.f15341v;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c1321k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f8990q = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f8990q, layoutParams);
    }

    public final void d() {
        if (this.f8981B == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8981B = linearLayout;
            this.f8982C = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f8983D = (TextView) this.f8981B.findViewById(R.id.action_bar_subtitle);
            int i7 = this.f8984E;
            if (i7 != 0) {
                this.f8982C.setTextAppearance(getContext(), i7);
            }
            int i8 = this.f8985F;
            if (i8 != 0) {
                this.f8983D.setTextAppearance(getContext(), i8);
            }
        }
        this.f8982C.setText(this.f8996w);
        this.f8983D.setText(this.f8997x);
        boolean zIsEmpty = TextUtils.isEmpty(this.f8996w);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f8997x);
        this.f8983D.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f8981B.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f8981B.getParent() == null) {
            addView(this.f8981B);
        }
    }

    public final void e() {
        removeAllViews();
        this.f8980A = null;
        this.f8990q = null;
        this.f8991r = null;
        View view = this.f8999z;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f8993t != null ? this.f8988o.f15252p : getVisibility();
    }

    public int getContentHeight() {
        return this.f8992s;
    }

    public CharSequence getSubtitle() {
        return this.f8997x;
    }

    public CharSequence getTitle() {
        return this.f8996w;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            N n7 = this.f8993t;
            if (n7 != null) {
                n7.b();
            }
            super.setVisibility(i7);
        }
    }

    public final N i(long j3, int i7) {
        N n7 = this.f8993t;
        if (n7 != null) {
            n7.b();
        }
        C1301a c1301a = this.f8988o;
        if (i7 != 0) {
            N nA = I.a(this);
            nA.a(0.0f);
            nA.c(j3);
            c1301a.f15253q.f8993t = nA;
            c1301a.f15252p = i7;
            nA.d(c1301a);
            return nA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        N nA2 = I.a(this);
        nA2.a(1.0f);
        nA2.c(j3);
        c1301a.f15253q.f8993t = nA2;
        c1301a.f15252p = i7;
        nA2.d(c1301a);
        return nA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1089a.f13594a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1321k c1321k = this.f8991r;
        if (c1321k != null) {
            Configuration configuration2 = c1321k.f15335p.getResources().getConfiguration();
            int i7 = configuration2.screenWidthDp;
            int i8 = configuration2.screenHeightDp;
            c1321k.f15326D = (configuration2.smallestScreenWidthDp > 600 || i7 > 600 || (i7 > 960 && i8 > 720) || (i7 > 720 && i8 > 960)) ? 5 : (i7 >= 500 || (i7 > 640 && i8 > 480) || (i7 > 480 && i8 > 640)) ? 4 : i7 >= 360 ? 3 : 2;
            l lVar = c1321k.f15336q;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1321k c1321k = this.f8991r;
        if (c1321k != null) {
            c1321k.c();
            C1313g c1313g = this.f8991r.f15330H;
            if (c1313g == null || !c1313g.b()) {
                return;
            }
            c1313g.f14886i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8995v = false;
        }
        if (!this.f8995v) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8995v = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f8995v = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        boolean z7 = j1.f15320a;
        boolean z8 = getLayoutDirection() == 1;
        int paddingRight = z8 ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8998y;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8998y.getLayoutParams();
            int i11 = z8 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = z8 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i13 = z8 ? paddingRight - i11 : paddingRight + i11;
            int iG = g(this.f8998y, i13, paddingTop, paddingTop2, z8) + i13;
            paddingRight = z8 ? iG - i12 : iG + i12;
        }
        LinearLayout linearLayout = this.f8981B;
        if (linearLayout != null && this.f8980A == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f8981B, paddingRight, paddingTop, paddingTop2, z8);
        }
        View view2 = this.f8980A;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z8);
        }
        int paddingLeft = z8 ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8990q;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = this.f8992s;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i8);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f8998y;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8998y.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8990q;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f8990q, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f8981B;
        if (linearLayout != null && this.f8980A == null) {
            if (this.f8986G) {
                this.f8981B.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f8981B.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f8981B.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f8980A;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                iMin = Math.min(i11, iMin);
            }
            this.f8980A.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(iMin, i12));
        }
        if (this.f8992s > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8994u = false;
        }
        if (!this.f8994u) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8994u = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f8994u = false;
        return true;
    }

    public void setContentHeight(int i7) {
        this.f8992s = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8980A;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8980A = view;
        if (view != null && (linearLayout = this.f8981B) != null) {
            removeView(linearLayout);
            this.f8981B = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8997x = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f8996w = charSequence;
        d();
        I.i(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f8986G) {
            requestLayout();
        }
        this.f8986G = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
