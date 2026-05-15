package Y1;

import G1.AbstractC0158z;
import G1.I;
import G1.m0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.AbstractActivityC1121i;
import m5.AbstractC1209k;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class h extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f8601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f8602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f8603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8604r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, q qVar) {
        super(context, attributeSet);
        AbstractC1209k.f(context, "context");
        AbstractC1209k.f(attributeSet, "attrs");
        AbstractC1209k.f(qVar, "fm");
        this.f8601o = new ArrayList();
        this.f8602p = new ArrayList();
        this.f8604r = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X1.a.f8263b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        qVar.g();
        if (classAttribute == null) {
            Iterator it = qVar.f8626c.O().iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            return;
        }
        if (id == -1) {
            throw new IllegalStateException(Z1.l.q("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
        }
        context.getClassLoader();
        qVar.f8641t.a(classAttribute);
        AbstractC1209k.e(null, "fm.fragmentFactory.insta…ontext.classLoader, name)");
        throw null;
    }

    public final void a(View view) {
        if (this.f8602p.contains(view)) {
            this.f8601o.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        AbstractC1209k.f(view, "child");
        view.getTag(R.id.fragment_container_view_tag);
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        m0 m0VarC;
        AbstractC1209k.f(windowInsets, "insets");
        m0 m0VarC2 = m0.c(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f8603q;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC1209k.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            m0VarC = m0.c(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = I.f2641a;
            WindowInsets windowInsetsB = m0VarC2.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsB2 = AbstractC0158z.b(this, windowInsetsB);
                if (!windowInsetsB2.equals(windowInsetsB)) {
                    m0VarC2 = m0.c(this, windowInsetsB2);
                }
            }
            m0VarC = m0VarC2;
        }
        if (!m0VarC.f2725a.o()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                WeakHashMap weakHashMap2 = I.f2641a;
                WindowInsets windowInsetsB3 = m0VarC.b();
                if (windowInsetsB3 != null) {
                    WindowInsets windowInsetsA = AbstractC0158z.a(childAt, windowInsetsB3);
                    if (!windowInsetsA.equals(windowInsetsB3)) {
                        m0.c(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC1209k.f(canvas, "canvas");
        if (this.f8604r) {
            Iterator it = this.f8601o.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        AbstractC1209k.f(canvas, "canvas");
        AbstractC1209k.f(view, "child");
        if (this.f8604r) {
            ArrayList arrayList = this.f8601o;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC1209k.f(view, "view");
        this.f8602p.remove(view);
        if (this.f8601o.remove(view)) {
            this.f8604r = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends d> F getFragment() {
        AbstractActivityC1121i abstractActivityC1121i;
        View view = this;
        while (view != null) {
            view.getTag(R.id.fragment_container_view_tag);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC1121i = null;
                break;
            }
            if (context instanceof AbstractActivityC1121i) {
                abstractActivityC1121i = (AbstractActivityC1121i) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC1121i != null) {
            g gVar = (g) abstractActivityC1121i.f13916H.f4105p;
            getId();
            gVar.f8599q.g();
            return null;
        }
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC1209k.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC1209k.e(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC1209k.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View childAt = getChildAt(i7);
        AbstractC1209k.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC1209k.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            AbstractC1209k.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            AbstractC1209k.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i7, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f8604r = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC1209k.f(onApplyWindowInsetsListener, "listener");
        this.f8603q = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC1209k.f(view, "view");
        if (view.getParent() == this) {
            this.f8602p.add(view);
        }
        super.startViewTransition(view);
    }
}
