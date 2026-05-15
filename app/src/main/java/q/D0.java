package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import j.AbstractC1089a;
import java.lang.reflect.Method;
import p.InterfaceC1269B;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 implements InterfaceC1269B {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Method f15133N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Method f15134O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Method f15135P;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public A0 f15137B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f15138C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AdapterView.OnItemClickListener f15139D;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Handler f15144I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Rect f15146K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f15147L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C1350z f15148M;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f15149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ListAdapter f15150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1334q0 f15151q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15155u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15159y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15152r = -2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15153s = -2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f15156v = 1002;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15160z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f15136A = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final RunnableC1351z0 f15140E = new RunnableC1351z0(this, 1);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0 f15141F = new C0(this);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final B0 f15142G = new B0(this);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RunnableC1351z0 f15143H = new RunnableC1351z0(this, 0);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Rect f15145J = new Rect();

    static {
        int i7 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i7 <= 28) {
            try {
                f15133N = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f15135P = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f15134O = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public D0(Context context, AttributeSet attributeSet, int i7) {
        int resourceId;
        this.f15149o = context;
        this.f15144I = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13606o, i7, 0);
        this.f15154t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f15155u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f15157w = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1350z c1350z = new C1350z(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13610s, i7, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c1350z.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1350z.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : i6.g.v(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f15148M = c1350z;
        c1350z.setInputMethodMode(1);
    }

    @Override // p.InterfaceC1269B
    public final boolean a() {
        return this.f15148M.isShowing();
    }

    public final int b() {
        return this.f15154t;
    }

    @Override // p.InterfaceC1269B
    public final void c() {
        int i7;
        int iA;
        int paddingBottom;
        C1334q0 c1334q0;
        C1334q0 c1334q02 = this.f15151q;
        C1350z c1350z = this.f15148M;
        Context context = this.f15149o;
        if (c1334q02 == null) {
            C1334q0 c1334q0P = p(context, !this.f15147L);
            this.f15151q = c1334q0P;
            c1334q0P.setAdapter(this.f15150p);
            this.f15151q.setOnItemClickListener(this.f15139D);
            this.f15151q.setFocusable(true);
            this.f15151q.setFocusableInTouchMode(true);
            this.f15151q.setOnItemSelectedListener(new C1345w0(this));
            this.f15151q.setOnScrollListener(this.f15142G);
            c1350z.setContentView(this.f15151q);
        }
        Drawable background = c1350z.getBackground();
        Rect rect = this.f15145J;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i7 = rect.bottom + i8;
            if (!this.f15157w) {
                this.f15155u = -i8;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        boolean z6 = c1350z.getInputMethodMode() == 2;
        View view = this.f15138C;
        int i9 = this.f15155u;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f15134O;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c1350z, view, Integer.valueOf(i9), Boolean.valueOf(z6))).intValue();
                } catch (Exception unused) {
                    iA = c1350z.getMaxAvailableHeight(view, i9);
                }
            } else {
                iA = c1350z.getMaxAvailableHeight(view, i9);
            }
        } else {
            iA = AbstractC1347x0.a(c1350z, view, i9, z6);
        }
        int i10 = this.f15152r;
        if (i10 == -1) {
            paddingBottom = iA + i7;
        } else {
            int i11 = this.f15153s;
            int iA2 = this.f15151q.a(i11 != -2 ? i11 != -1 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f15151q.getPaddingBottom() + this.f15151q.getPaddingTop() + i7 : 0);
        }
        boolean z7 = this.f15148M.getInputMethodMode() == 2;
        c1350z.setWindowLayoutType(this.f15156v);
        if (c1350z.isShowing()) {
            if (this.f15138C.isAttachedToWindow()) {
                int width = this.f15153s;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f15138C.getWidth();
                }
                if (i10 == -1) {
                    i10 = z7 ? paddingBottom : -1;
                    if (z7) {
                        c1350z.setWidth(this.f15153s == -1 ? -1 : 0);
                        c1350z.setHeight(0);
                    } else {
                        c1350z.setWidth(this.f15153s == -1 ? -1 : 0);
                        c1350z.setHeight(-1);
                    }
                } else if (i10 == -2) {
                    i10 = paddingBottom;
                }
                c1350z.setOutsideTouchable(true);
                int i12 = width;
                View view2 = this.f15138C;
                int i13 = this.f15154t;
                int i14 = this.f15155u;
                if (i12 < 0) {
                    i12 = -1;
                }
                c1350z.update(view2, i13, i14, i12, i10 < 0 ? -1 : i10);
                return;
            }
            return;
        }
        int width2 = this.f15153s;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f15138C.getWidth();
        }
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = paddingBottom;
        }
        c1350z.setWidth(width2);
        c1350z.setHeight(i10);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f15133N;
            if (method2 != null) {
                try {
                    method2.invoke(c1350z, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC1349y0.b(c1350z, true);
        }
        c1350z.setOutsideTouchable(true);
        c1350z.setTouchInterceptor(this.f15141F);
        if (this.f15159y) {
            c1350z.setOverlapAnchor(this.f15158x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f15135P;
            if (method3 != null) {
                try {
                    method3.invoke(c1350z, this.f15146K);
                } catch (Exception unused3) {
                }
            }
        } else {
            AbstractC1349y0.a(c1350z, this.f15146K);
        }
        c1350z.showAsDropDown(this.f15138C, this.f15154t, this.f15155u, this.f15160z);
        this.f15151q.setSelection(-1);
        if ((!this.f15147L || this.f15151q.isInTouchMode()) && (c1334q0 = this.f15151q) != null) {
            c1334q0.setListSelectionHidden(true);
            c1334q0.requestLayout();
        }
        if (this.f15147L) {
            return;
        }
        this.f15144I.post(this.f15143H);
    }

    public final Drawable d() {
        return this.f15148M.getBackground();
    }

    @Override // p.InterfaceC1269B
    public final void dismiss() {
        C1350z c1350z = this.f15148M;
        c1350z.dismiss();
        c1350z.setContentView(null);
        this.f15151q = null;
        this.f15144I.removeCallbacks(this.f15140E);
    }

    @Override // p.InterfaceC1269B
    public final C1334q0 e() {
        return this.f15151q;
    }

    public final void h(Drawable drawable) {
        this.f15148M.setBackgroundDrawable(drawable);
    }

    public final void i(int i7) {
        this.f15155u = i7;
        this.f15157w = true;
    }

    public final void k(int i7) {
        this.f15154t = i7;
    }

    public final int m() {
        if (this.f15157w) {
            return this.f15155u;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        A0 a0 = this.f15137B;
        if (a0 == null) {
            this.f15137B = new A0(this);
        } else {
            ListAdapter listAdapter2 = this.f15150p;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(a0);
            }
        }
        this.f15150p = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f15137B);
        }
        C1334q0 c1334q0 = this.f15151q;
        if (c1334q0 != null) {
            c1334q0.setAdapter(this.f15150p);
        }
    }

    public C1334q0 p(Context context, boolean z6) {
        return new C1334q0(context, z6);
    }

    public final void q(int i7) {
        Drawable background = this.f15148M.getBackground();
        if (background == null) {
            this.f15153s = i7;
            return;
        }
        Rect rect = this.f15145J;
        background.getPadding(rect);
        this.f15153s = rect.left + rect.right + i7;
    }
}
