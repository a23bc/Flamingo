package q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static e1 f15281y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static e1 f15282z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f15283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CharSequence f15284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d1 f15286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d1 f15287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f1 f15290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15292x;

    /* JADX WARN: Type inference failed for: r0v0, types: [q.d1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q.d1] */
    public e1(View view, CharSequence charSequence) {
        final int i7 = 0;
        this.f15286r = new Runnable(this) { // from class: q.d1

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ e1 f15280p;

            {
                this.f15280p = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f15280p.c(false);
                        break;
                    default:
                        this.f15280p.a();
                        break;
                }
            }
        };
        final int i8 = 1;
        this.f15287s = new Runnable(this) { // from class: q.d1

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ e1 f15280p;

            {
                this.f15280p = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i8) {
                    case 0:
                        this.f15280p.c(false);
                        break;
                    default:
                        this.f15280p.a();
                        break;
                }
            }
        };
        this.f15283o = view;
        this.f15284p = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = G1.J.f2646a;
        this.f15285q = Build.VERSION.SDK_INT >= 28 ? B1.d.l(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f15292x = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(e1 e1Var) {
        e1 e1Var2 = f15281y;
        if (e1Var2 != null) {
            e1Var2.f15283o.removeCallbacks(e1Var2.f15286r);
        }
        f15281y = e1Var;
        if (e1Var != null) {
            e1Var.f15283o.postDelayed(e1Var.f15286r, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        e1 e1Var = f15282z;
        View view = this.f15283o;
        if (e1Var == this) {
            f15282z = null;
            f1 f1Var = this.f15290v;
            if (f1Var != null) {
                View view2 = f1Var.f15305b;
                if (view2.getParent() != null) {
                    ((WindowManager) f1Var.f15304a.getSystemService("window")).removeView(view2);
                }
                this.f15290v = null;
                this.f15292x = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f15281y == this) {
            b(null);
        }
        view.removeCallbacks(this.f15287s);
    }

    public final void c(boolean z6) {
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long longPressTimeout;
        long j3;
        long j7;
        View view = this.f15283o;
        if (view.isAttachedToWindow()) {
            b(null);
            e1 e1Var = f15282z;
            if (e1Var != null) {
                e1Var.a();
            }
            f15282z = this;
            this.f15291w = z6;
            f1 f1Var = new f1(view.getContext());
            this.f15290v = f1Var;
            int width = this.f15288t;
            int i12 = this.f15289u;
            boolean z7 = this.f15291w;
            View view2 = f1Var.f15305b;
            ViewParent parent = view2.getParent();
            Context context = f1Var.f15304a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            f1Var.f15306c.setText(this.f15284p);
            WindowManager.LayoutParams layoutParams = f1Var.f15307d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i7 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z7 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                i11 = 1;
            } else {
                Rect rect = f1Var.f15308e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i8 = width;
                    i9 = i7;
                    i10 = 0;
                    i11 = 1;
                } else {
                    Resources resources = context.getResources();
                    i11 = 1;
                    i8 = width;
                    i9 = i7;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = f1Var.f15310g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = f1Var.f15309f;
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i13;
                iArr2[i11] = iArr2[i11] - iArr[i11];
                layoutParams.x = (i13 + i8) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i14 = iArr2[i11];
                int i15 = ((i14 + i9) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z7) {
                    if (i15 >= 0) {
                        layoutParams.y = i15;
                    } else {
                        layoutParams.y = i16;
                    }
                } else if (measuredHeight + i16 <= rect.height()) {
                    layoutParams.y = i16;
                } else {
                    layoutParams.y = i15;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f15291w) {
                j7 = 2500;
            } else {
                WeakHashMap weakHashMap = G1.I.f2641a;
                if ((view.getWindowSystemUiVisibility() & 1) == i11) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j7 = j3 - longPressTimeout;
            }
            d1 d1Var = this.f15287s;
            view.removeCallbacks(d1Var);
            view.postDelayed(d1Var, j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            q.f1 r4 = r3.f15290v
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f15291w
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f15283o
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f15292x = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            q.f1 r4 = r3.f15290v
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f15292x
            if (r1 != 0) goto L66
            int r1 = r3.f15288t
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f15285q
            if (r1 > r2) goto L66
            int r1 = r3.f15289u
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f15288t = r4
            r3.f15289u = r5
            r3.f15292x = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f15288t = view.getWidth() / 2;
        this.f15289u = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
