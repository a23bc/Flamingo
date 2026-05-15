package k;

import G1.AbstractC0158z;
import G1.N;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o.AbstractC1243a;
import t.T;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Window.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Window.Callback f13943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C1111A f13947s;

    public w(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A, Window.Callback callback) {
        this.f13947s = layoutInflaterFactory2C1111A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f13943o = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f13944p = true;
            callback.onContentChanged();
        } finally {
            this.f13944p = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f13943o.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f13943o.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        o.l.a(this.f13943o, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f13943o.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f13945q;
        Window.Callback callback = this.f13943o;
        return z6 ? callback.dispatchKeyEvent(keyEvent) : this.f13947s.q(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f13943o
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            k.A r2 = r6.f13947s
            r2.z()
            k.K r3 = r2.f13781C
            r4 = 0
            if (r3 == 0) goto L3d
            k.J r3 = r3.f13862j
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            p.l r3 = r3.f13849r
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            k.z r0 = r2.b0
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.E(r0, r3, r7)
            if (r0 == 0) goto L52
            k.z r7 = r2.b0
            if (r7 == 0) goto L3b
            r7.l = r1
            goto L3b
        L52:
            k.z r0 = r2.b0
            if (r0 != 0) goto L6a
            k.z r0 = r2.y(r4)
            r2.F(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.E(r0, r3, r7)
            r0.f13961k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f13943o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f13943o.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f13943o.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f13943o.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f13943o.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f13943o.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f13944p) {
            this.f13943o.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof p.l)) {
            return this.f13943o.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        return this.f13943o.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f13943o.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f13943o.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        b(i7, menu);
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13947s;
        if (i7 != 108) {
            layoutInflaterFactory2C1111A.getClass();
            return true;
        }
        layoutInflaterFactory2C1111A.z();
        K k7 = layoutInflaterFactory2C1111A.f13781C;
        if (k7 != null && true != k7.f13864m) {
            k7.f13864m = true;
            ArrayList arrayList = k7.f13865n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.f13946r) {
            this.f13943o.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13947s;
        if (i7 != 108) {
            if (i7 != 0) {
                layoutInflaterFactory2C1111A.getClass();
                return;
            }
            z zVarY = layoutInflaterFactory2C1111A.y(i7);
            if (zVarY.f13962m) {
                layoutInflaterFactory2C1111A.o(zVarY, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C1111A.z();
        K k7 = layoutInflaterFactory2C1111A.f13781C;
        if (k7 == null || !k7.f13864m) {
            return;
        }
        k7.f13864m = false;
        ArrayList arrayList = k7.f13865n;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z6) {
        o.m.a(this.f13943o, z6);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        p.l lVar = menu instanceof p.l ? (p.l) menu : null;
        if (i7 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f14836x = true;
        }
        boolean zOnPreparePanel = this.f13943o.onPreparePanel(i7, view, menu);
        if (lVar != null) {
            lVar.f14836x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        p.l lVar = this.f13947s.y(0).h;
        if (lVar != null) {
            d(list, lVar, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return o.k.a(this.f13943o, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f13943o.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f13943o.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13947s;
        if (!layoutInflaterFactory2C1111A.f13792N || i7 != 0) {
            return o.k.b(this.f13943o, callback, i7);
        }
        Context context = layoutInflaterFactory2C1111A.f13825y;
        U3.h hVar = new U3.h();
        hVar.f7043p = context;
        hVar.f7042o = callback;
        hVar.f7044q = new ArrayList();
        hVar.f7045r = new T(0);
        AbstractC1243a abstractC1243a = layoutInflaterFactory2C1111A.f13787I;
        if (abstractC1243a != null) {
            abstractC1243a.a();
        }
        V1.a aVar = new V1.a();
        aVar.f7390p = layoutInflaterFactory2C1111A;
        aVar.f7389o = hVar;
        layoutInflaterFactory2C1111A.z();
        K k7 = layoutInflaterFactory2C1111A.f13781C;
        if (k7 != null) {
            J j3 = k7.f13862j;
            if (j3 != null) {
                j3.a();
            }
            k7.f13857d.setHideOnContentScrollEnabled(false);
            k7.f13860g.e();
            J j7 = new J(k7, k7.f13860g.getContext(), aVar);
            p.l lVar = j7.f13849r;
            lVar.w();
            try {
                if (((U3.h) j7.f13850s.f7389o).i0(j7, lVar)) {
                    k7.f13862j = j7;
                    j7.g();
                    k7.f13860g.c(j7);
                    k7.P(true);
                } else {
                    j7 = null;
                }
                layoutInflaterFactory2C1111A.f13787I = j7;
            } finally {
                lVar.v();
            }
        }
        if (layoutInflaterFactory2C1111A.f13787I == null) {
            N n7 = layoutInflaterFactory2C1111A.f13791M;
            if (n7 != null) {
                n7.b();
            }
            AbstractC1243a abstractC1243a2 = layoutInflaterFactory2C1111A.f13787I;
            if (abstractC1243a2 != null) {
                abstractC1243a2.a();
            }
            if (layoutInflaterFactory2C1111A.f13788J == null) {
                boolean z6 = layoutInflaterFactory2C1111A.f13802X;
                Context context2 = layoutInflaterFactory2C1111A.f13825y;
                if (z6) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        o.c cVar = new o.c(context2, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context2 = cVar;
                    }
                    layoutInflaterFactory2C1111A.f13788J = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C1111A.f13789K = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C1111A.f13789K.setContentView(layoutInflaterFactory2C1111A.f13788J);
                    layoutInflaterFactory2C1111A.f13789K.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C1111A.f13788J.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C1111A.f13789K.setHeight(-2);
                    layoutInflaterFactory2C1111A.f13790L = new p(layoutInflaterFactory2C1111A, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C1111A.f13794P.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C1111A.z();
                        K k8 = layoutInflaterFactory2C1111A.f13781C;
                        Context contextQ = k8 != null ? k8.Q() : null;
                        if (contextQ != null) {
                            context2 = contextQ;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C1111A.f13788J = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C1111A.f13788J != null) {
                N n8 = layoutInflaterFactory2C1111A.f13791M;
                if (n8 != null) {
                    n8.b();
                }
                layoutInflaterFactory2C1111A.f13788J.e();
                Context context3 = layoutInflaterFactory2C1111A.f13788J.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C1111A.f13788J;
                o.d dVar = new o.d();
                dVar.f14567q = context3;
                dVar.f14568r = actionBarContextView;
                dVar.f14569s = aVar;
                p.l lVar2 = new p.l(actionBarContextView.getContext());
                lVar2.l = 1;
                dVar.f14572v = lVar2;
                lVar2.f14819e = dVar;
                if (((U3.h) aVar.f7389o).i0(dVar, lVar2)) {
                    dVar.g();
                    layoutInflaterFactory2C1111A.f13788J.c(dVar);
                    layoutInflaterFactory2C1111A.f13787I = dVar;
                    if (layoutInflaterFactory2C1111A.f13793O && (viewGroup = layoutInflaterFactory2C1111A.f13794P) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C1111A.f13788J.setAlpha(0.0f);
                        N nA = G1.I.a(layoutInflaterFactory2C1111A.f13788J);
                        nA.a(1.0f);
                        layoutInflaterFactory2C1111A.f13791M = nA;
                        nA.d(new r(1, layoutInflaterFactory2C1111A));
                    } else {
                        layoutInflaterFactory2C1111A.f13788J.setAlpha(1.0f);
                        layoutInflaterFactory2C1111A.f13788J.setVisibility(0);
                        if (layoutInflaterFactory2C1111A.f13788J.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C1111A.f13788J.getParent();
                            WeakHashMap weakHashMap = G1.I.f2641a;
                            AbstractC0158z.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C1111A.f13789K != null) {
                        layoutInflaterFactory2C1111A.f13826z.getDecorView().post(layoutInflaterFactory2C1111A.f13790L);
                    }
                } else {
                    layoutInflaterFactory2C1111A.f13787I = null;
                }
            }
            layoutInflaterFactory2C1111A.H();
            layoutInflaterFactory2C1111A.f13787I = layoutInflaterFactory2C1111A.f13787I;
        }
        layoutInflaterFactory2C1111A.H();
        AbstractC1243a abstractC1243a3 = layoutInflaterFactory2C1111A.f13787I;
        if (abstractC1243a3 != null) {
            return hVar.L(abstractC1243a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f13943o.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
