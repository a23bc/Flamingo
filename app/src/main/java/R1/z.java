package r1;

import A2.I;
import A2.W;
import R0.AbstractC0370a;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.K;
import d.C0737C;
import f0.AbstractC0918w;
import f0.C0879c;
import f0.C0894j0;
import f0.C0912t;
import f0.C0915u0;
import f0.G;
import java.util.UUID;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.C1219u;
import o5.AbstractC1267a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0370a {

    /* JADX INFO: renamed from: A */
    public final C1403B f15740A;

    /* JADX INFO: renamed from: B */
    public final WindowManager f15741B;

    /* JADX INFO: renamed from: C */
    public final WindowManager.LayoutParams f15742C;

    /* JADX INFO: renamed from: D */
    public InterfaceC1404C f15743D;

    /* JADX INFO: renamed from: E */
    public n1.n f15744E;

    /* JADX INFO: renamed from: F */
    public final C0894j0 f15745F;

    /* JADX INFO: renamed from: G */
    public final C0894j0 f15746G;

    /* JADX INFO: renamed from: H */
    public n1.l f15747H;

    /* JADX INFO: renamed from: I */
    public final G f15748I;

    /* JADX INFO: renamed from: J */
    public final Rect f15749J;

    /* JADX INFO: renamed from: K */
    public final p0.u f15750K;

    /* JADX INFO: renamed from: L */
    public C0737C f15751L;

    /* JADX INFO: renamed from: M */
    public final C0894j0 f15752M;

    /* JADX INFO: renamed from: N */
    public boolean f15753N;

    /* JADX INFO: renamed from: O */
    public final int[] f15754O;

    /* JADX INFO: renamed from: w */
    public InterfaceC1180a f15755w;

    /* JADX INFO: renamed from: x */
    public C1405D f15756x;

    /* JADX INFO: renamed from: y */
    public String f15757y;

    /* JADX INFO: renamed from: z */
    public final View f15758z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InterfaceC1180a interfaceC1180a, C1405D c1405d, String str, View view, n1.d dVar, InterfaceC1404C interfaceC1404C, UUID uuid) {
        super(view.getContext());
        C1403B c1402a = Build.VERSION.SDK_INT >= 29 ? new C1402A() : new C1403B();
        this.f15755w = interfaceC1180a;
        this.f15756x = c1405d;
        this.f15757y = str;
        this.f15758z = view;
        this.f15740A = c1402a;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f15741B = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C1405D c1405d2 = this.f15756x;
        boolean zC = n.c(view);
        boolean z6 = c1405d2.f15657b;
        int i7 = c1405d2.f15656a;
        if (z6 && zC) {
            i7 |= 8192;
        } else if (z6 && !zC) {
            i7 &= -8193;
        }
        layoutParams.flags = i7;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f15742C = layoutParams;
        this.f15743D = interfaceC1404C;
        this.f15744E = n1.n.f14521o;
        this.f15745F = C0879c.t(null);
        this.f15746G = C0879c.t(null);
        this.f15748I = C0879c.o(new x(0, this));
        this.f15749J = new Rect();
        this.f15750K = new p0.u(new l(this, 2));
        setId(android.R.id.content);
        K.m(this, K.g(view));
        K.n(this, K.h(view));
        AbstractC1267a.K(this, AbstractC1267a.w(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.v((float) 8));
        setOutlineProvider(new B0.p(3));
        this.f15752M = C0879c.t(s.f15715a);
        this.f15754O = new int[2];
    }

    private final l5.e getContent() {
        return (l5.e) this.f15752M.getValue();
    }

    public final O0.C getParentLayoutCoordinates() {
        return (O0.C) this.f15746G.getValue();
    }

    private final n1.l getVisibleDisplayBounds() {
        this.f15740A.getClass();
        View view = this.f15758z;
        Rect rect = this.f15749J;
        view.getWindowVisibleDisplayFrame(rect);
        return new n1.l(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(l5.e eVar) {
        this.f15752M.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(O0.C c7) {
        this.f15746G.setValue(c7);
    }

    @Override // R0.AbstractC0370a
    public final void a(int i7, C0912t c0912t) {
        c0912t.Z(-857613600);
        int i8 = (c0912t.h(this) ? 4 : 2) | i7;
        if (c0912t.N(i8 & 1, (i8 & 3) != 2)) {
            getContent().invoke(c0912t, 0);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new A5.y(i7, 6, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15756x.f15658c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC1180a interfaceC1180a = this.f15755w;
                if (interfaceC1180a != null) {
                    interfaceC1180a.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // R0.AbstractC0370a
    public final void e(boolean z6, int i7, int i8, int i9, int i10) {
        super.e(z6, i7, i8, i9, i10);
        this.f15756x.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f15742C;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f15740A.getClass();
        this.f15741B.updateViewLayout(this, layoutParams);
    }

    @Override // R0.AbstractC0370a
    public final void f(int i7, int i8) {
        this.f15756x.getClass();
        n1.l visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f14518c - visibleDisplayBounds.f14516a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f14519d - visibleDisplayBounds.f14517b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f15748I.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f15742C;
    }

    public final n1.n getParentLayoutDirection() {
        return this.f15744E;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw */
    public final n1.m m6getPopupContentSizebOM6tXw() {
        return (n1.m) this.f15745F.getValue();
    }

    public final InterfaceC1404C getPositionProvider() {
        return this.f15743D;
    }

    @Override // R0.AbstractC0370a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15753N;
    }

    public final String getTestTag() {
        return this.f15757y;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(AbstractC0918w abstractC0918w, l5.e eVar) {
        setParentCompositionContext(abstractC0918w);
        setContent(eVar);
        this.f15753N = true;
    }

    public final void k(InterfaceC1180a interfaceC1180a, C1405D c1405d, String str, n1.n nVar) {
        int i7;
        this.f15755w = interfaceC1180a;
        this.f15757y = str;
        if (!AbstractC1209k.a(this.f15756x, c1405d)) {
            c1405d.getClass();
            WindowManager.LayoutParams layoutParams = this.f15742C;
            this.f15756x = c1405d;
            boolean zC = n.c(this.f15758z);
            boolean z6 = c1405d.f15657b;
            int i8 = c1405d.f15656a;
            if (z6 && zC) {
                i8 |= 8192;
            } else if (z6 && !zC) {
                i8 &= -8193;
            }
            layoutParams.flags = i8;
            this.f15740A.getClass();
            this.f15741B.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = nVar.ordinal();
        if (iOrdinal != 0) {
            i7 = 1;
            if (iOrdinal != 1) {
                throw new W();
            }
        } else {
            i7 = 0;
        }
        super.setLayoutDirection(i7);
    }

    public final void l() {
        O0.C parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.y()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jG = parentLayoutCoordinates.G();
            long jH = parentLayoutCoordinates.h(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jH >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jH & 4294967295L)))) & 4294967295L);
            int i7 = (int) (jRound >> 32);
            int i8 = (int) (jRound & 4294967295L);
            n1.l lVar = new n1.l(i7, i8, ((int) (jG >> 32)) + i7, ((int) (jG & 4294967295L)) + i8);
            if (lVar.equals(this.f15747H)) {
                return;
            }
            this.f15747H = lVar;
            n();
        }
    }

    public final void m(O0.C c7) {
        setParentLayoutCoordinates(c7);
        l();
    }

    public final void n() {
        n1.m mVarM6getPopupContentSizebOM6tXw;
        n1.l lVar = this.f15747H;
        if (lVar == null || (mVarM6getPopupContentSizebOM6tXw = m6getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        n1.l visibleDisplayBounds = getVisibleDisplayBounds();
        long j3 = (((long) (visibleDisplayBounds.f14519d - visibleDisplayBounds.f14517b)) & 4294967295L) | (((long) (visibleDisplayBounds.f14518c - visibleDisplayBounds.f14516a)) << 32);
        C1219u c1219u = new C1219u();
        c1219u.f14438o = 0L;
        this.f15750K.d(this, C1411e.f15678v, new y(c1219u, this, lVar, j3, mVarM6getPopupContentSizebOM6tXw.f14520a));
        WindowManager.LayoutParams layoutParams = this.f15742C;
        long j7 = c1219u.f14438o;
        layoutParams.x = (int) (j7 >> 32);
        layoutParams.y = (int) (j7 & 4294967295L);
        boolean z6 = this.f15756x.f15660e;
        C1403B c1403b = this.f15740A;
        if (z6) {
            c1403b.a(this, (int) (j3 >> 32), (int) (j3 & 4294967295L));
        }
        c1403b.getClass();
        this.f15741B.updateViewLayout(this, layoutParams);
    }

    @Override // R0.AbstractC0370a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15750K.e();
        if (!this.f15756x.f15658c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f15751L == null) {
            this.f15751L = new C0737C(this.f15755w, 2);
        }
        B1.c.d(this, this.f15751L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0.u uVar = this.f15750K;
        I i7 = uVar.h;
        if (i7 != null) {
            i7.k();
        }
        uVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            B1.c.e(this, this.f15751L);
        }
        this.f15751L = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15756x.f15659d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC1180a interfaceC1180a = this.f15755w;
            if (interfaceC1180a != null) {
                interfaceC1180a.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC1180a interfaceC1180a2 = this.f15755w;
            if (interfaceC1180a2 != null) {
                interfaceC1180a2.a();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(n1.n nVar) {
        this.f15744E = nVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA */
    public final void m7setPopupContentSizefhxjrPA(n1.m mVar) {
        this.f15745F.setValue(mVar);
    }

    public final void setPositionProvider(InterfaceC1404C interfaceC1404C) {
        this.f15743D = interfaceC1404C;
    }

    public final void setTestTag(String str) {
        this.f15757y = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC0370a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
    }
}
