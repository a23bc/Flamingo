package R0;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC0597u;
import f0.AbstractC0918w;
import f0.C0912t;
import f0.EnumC0917v0;
import java.lang.ref.WeakReference;
import m5.C1220v;
import r0.C1385c;
import r0.InterfaceC1399q;
import w5.AbstractC1767D;
import yos.music.player.R;

/* JADX INFO: renamed from: R0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0370a extends ViewGroup {

    /* JADX INFO: renamed from: o */
    public WeakReference f6404o;

    /* JADX INFO: renamed from: p */
    public IBinder f6405p;

    /* JADX INFO: renamed from: q */
    public l1 f6406q;

    /* JADX INFO: renamed from: r */
    public AbstractC0918w f6407r;

    /* JADX INFO: renamed from: s */
    public J5.j f6408s;

    /* JADX INFO: renamed from: t */
    public boolean f6409t;

    /* JADX INFO: renamed from: u */
    public boolean f6410u;

    /* JADX INFO: renamed from: v */
    public boolean f6411v;

    public AbstractC0370a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        A a4 = new A(1, this);
        addOnAttachStateChangeListener(a4);
        B2.g gVar = new B2.g(18);
        N5.l.C(this).f4102a.add(gVar);
        this.f6408s = new J5.j(this, a4, gVar, 1);
    }

    private final void setParentContext(AbstractC0918w abstractC0918w) {
        if (this.f6407r != abstractC0918w) {
            this.f6407r = abstractC0918w;
            if (abstractC0918w != null) {
                this.f6404o = null;
            }
            l1 l1Var = this.f6406q;
            if (l1Var != null) {
                l1Var.a();
                this.f6406q = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f6405p != iBinder) {
            this.f6405p = iBinder;
            this.f6404o = null;
        }
    }

    public abstract void a(int i7, C0912t c0912t);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i7, layoutParams);
    }

    public final void b() {
        if (this.f6410u) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        l1 l1Var = this.f6406q;
        if (l1Var != null) {
            l1Var.a();
        }
        this.f6406q = null;
        requestLayout();
    }

    public final void d() {
        if (this.f6406q == null) {
            try {
                this.f6410u = true;
                this.f6406q = m1.a(this, g(), new n0.d(-656146368, new A5.y(1, this), true));
            } finally {
                this.f6410u = false;
            }
        }
    }

    public void e(boolean z6, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i9 - i7) - getPaddingRight(), (i10 - i8) - getPaddingBottom());
        }
    }

    public void f(int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i7, i8);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i7)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i8)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final AbstractC0918w g() {
        f0.B0 b0;
        c5.i iVar;
        C0371a0 c0371a0;
        AbstractC0918w abstractC0918wB = this.f6407r;
        if (abstractC0918wB == null) {
            abstractC0918wB = h1.b(this);
            if (abstractC0918wB == null) {
                Object parent = getParent();
                while (abstractC0918wB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC0918wB = h1.b(view);
                    parent = view.getParent();
                }
            }
            if (abstractC0918wB != null) {
                AbstractC0918w abstractC0918w = (!(abstractC0918wB instanceof f0.B0) || ((EnumC0917v0) ((f0.B0) abstractC0918wB).f11639u.getValue()).compareTo(EnumC0917v0.f11937p) > 0) ? abstractC0918wB : null;
                if (abstractC0918w != null) {
                    this.f6404o = new WeakReference(abstractC0918w);
                }
            } else {
                abstractC0918wB = null;
            }
            if (abstractC0918wB == null) {
                WeakReference weakReference = this.f6404o;
                if (weakReference == null || (abstractC0918wB = (AbstractC0918w) weakReference.get()) == null || ((abstractC0918wB instanceof f0.B0) && ((EnumC0917v0) ((f0.B0) abstractC0918wB).f11639u.getValue()).compareTo(EnumC0917v0.f11937p) <= 0)) {
                    abstractC0918wB = null;
                }
                if (abstractC0918wB == null) {
                    if (!isAttachedToWindow()) {
                        N0.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC0918w abstractC0918wB2 = h1.b(view2);
                    if (abstractC0918wB2 == null) {
                        ((W0) Y0.f6399a.get()).getClass();
                        c5.i iVar2 = c5.j.f10685o;
                        Y4.m mVar = Y.f6387A;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            iVar = (c5.i) Y.f6387A.getValue();
                        } else {
                            iVar = (c5.i) Y.f6388B.get();
                            if (iVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        c5.i iVarH = iVar.h(iVar2);
                        f0.X x6 = (f0.X) iVarH.n(f0.W.f11763p);
                        if (x6 != null) {
                            c0371a0 = new C0371a0(x6);
                            D2.B b7 = (D2.B) c0371a0.f6414q;
                            synchronized (b7.f1459p) {
                                b7.f1458o = false;
                            }
                        } else {
                            c0371a0 = null;
                        }
                        C1220v c1220v = new C1220v();
                        c5.i f02 = (InterfaceC1399q) iVarH.n(C1385c.f15611D);
                        if (f02 == null) {
                            f02 = new F0();
                            c1220v.f14439o = f02;
                        }
                        if (c0371a0 != null) {
                            iVar2 = c0371a0;
                        }
                        c5.i iVarH2 = iVarH.h(iVar2).h(f02);
                        b0 = new f0.B0(iVarH2);
                        b0.F();
                        B5.d dVarA = AbstractC1767D.a(iVarH2);
                        InterfaceC0597u interfaceC0597uG = androidx.lifecycle.K.g(view2);
                        androidx.lifecycle.K kH = interfaceC0597uG != null ? interfaceC0597uG.h() : null;
                        if (kH == null) {
                            N0.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new A2.W();
                        }
                        view2.addOnAttachStateChangeListener(new Z0(view2, b0));
                        kH.a(new e1(dVarA, c0371a0, b0, c1220v, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, b0);
                        w5.Y y6 = w5.Y.f19515o;
                        Handler handler = view2.getHandler();
                        int i7 = x5.e.f20146a;
                        view2.addOnAttachStateChangeListener(new A(2, AbstractC1767D.t(y6, new x5.d(handler, "windowRecomposer cleanup", false).f20145t, new X0(b0, view2, null), 2)));
                    } else {
                        if (!(abstractC0918wB2 instanceof f0.B0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        b0 = (f0.B0) abstractC0918wB2;
                    }
                    f0.B0 b02 = ((EnumC0917v0) b0.f11639u.getValue()).compareTo(EnumC0917v0.f11937p) > 0 ? b0 : null;
                    if (b02 != null) {
                        this.f6404o = new WeakReference(b02);
                    }
                    return b0;
                }
            }
        }
        return abstractC0918wB;
    }

    public final boolean getHasComposition() {
        return this.f6406q != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f6409t;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f6411v || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        e(z6, i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        d();
        f(i7, i8);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i7);
        }
    }

    public final void setParentCompositionContext(AbstractC0918w abstractC0918w) {
        setParentContext(abstractC0918w);
    }

    public final void setShowLayoutBounds(boolean z6) {
        this.f6409t = z6;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C0415x) ((Q0.s0) childAt)).setShowLayoutBounds(z6);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z6) {
        super.setTransitionGroup(z6);
        this.f6411v = true;
    }

    public final void setViewCompositionStrategy(R0 r02) {
        J5.j jVar = this.f6408s;
        if (jVar != null) {
            jVar.a();
        }
        ((M) r02).getClass();
        A a4 = new A(1, this);
        addOnAttachStateChangeListener(a4);
        B2.g gVar = new B2.g(18);
        N5.l.C(this).f4102a.add(gVar);
        this.f6408s = new J5.j(this, a4, gVar, 1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        b();
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z6) {
        b();
        return super.addViewInLayout(view, i7, layoutParams, z6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        b();
        super.addView(view, i7, i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i7, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
