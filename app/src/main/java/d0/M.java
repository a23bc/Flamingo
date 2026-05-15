package d0;

import R0.AbstractC0370a;
import android.R;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import f0.C0879c;
import f0.C0894j0;
import f0.C0912t;
import f0.C0915u0;
import java.util.UUID;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r1.EnumC1406E;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0370a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: A */
    public final WindowManager f10888A;

    /* JADX INFO: renamed from: B */
    public final WindowManager.LayoutParams f10889B;

    /* JADX INFO: renamed from: C */
    public final C0894j0 f10890C;

    /* JADX INFO: renamed from: D */
    public boolean f10891D;

    /* JADX INFO: renamed from: w */
    public final K f10892w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC1180a f10893x;

    /* JADX INFO: renamed from: y */
    public final View f10894y;

    /* JADX INFO: renamed from: z */
    public Object f10895z;

    public M(K k7, InterfaceC1180a interfaceC1180a, View view, UUID uuid) {
        super(view.getContext());
        this.f10892w = k7;
        this.f10893x = interfaceC1180a;
        this.f10894y = view;
        setId(R.id.content);
        androidx.lifecycle.K.m(this, androidx.lifecycle.K.g(view));
        androidx.lifecycle.K.n(this, androidx.lifecycle.K.h(view));
        AbstractC1267a.K(this, AbstractC1267a.w(view));
        setTag(yos.music.player.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        boolean z6 = false;
        setClipChildren(false);
        Object systemService = view.getContext().getSystemService("window");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f10888A = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = 1000;
        layoutParams.width = getContext().getResources().getDisplayMetrics().widthPixels;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(yos.music.player.R.string.default_popup_window_title));
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        EnumC1406E enumC1406E = EnumC1406E.f15661o;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null && (layoutParams3.flags & 8192) != 0) {
            z6 = true;
        }
        if (z6) {
            layoutParams.flags |= 8192;
        } else {
            layoutParams.flags &= -8193;
        }
        layoutParams.flags &= -9;
        this.f10889B = layoutParams;
        this.f10890C = C0879c.t(AbstractC0807w.f11161a);
    }

    @Override // R0.AbstractC0370a
    public final void a(int i7, C0912t c0912t) {
        c0912t.Z(-463309699);
        if ((((c0912t.h(this) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            ((l5.e) this.f10890C.getValue()).invoke(c0912t, 0);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new A5.y(i7, 3, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f10892w.f10887a) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f10893x.a();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // R0.AbstractC0370a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f10891D;
    }

    public final void h(n1.n nVar) {
        int i7;
        int iOrdinal = nVar.ordinal();
        if (iOrdinal != 0) {
            i7 = 1;
            if (iOrdinal != 1) {
                throw new A2.W();
            }
        } else {
            i7 = 0;
        }
        super.setLayoutDirection(i7);
    }

    @Override // R0.AbstractC0370a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f10892w.f10887a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f10895z == null) {
            this.f10895z = L.a(this.f10893x);
        }
        L.b(this, this.f10895z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            L.c(this, this.f10895z);
        }
        this.f10895z = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i7) {
    }
}
