package d;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0597u;
import m5.AbstractC1209k;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: d.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC0760m extends Dialog implements InterfaceC0597u, InterfaceC0744J, E3.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0599w f10795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V.o f10796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0743I f10797q;

    public AbstractDialogC0760m(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, i7);
        this.f10796p = new V.o(new C2.I(this, new E3.e(0, this)));
        this.f10797q = new C0743I(new B2.e(16, this));
    }

    public static void c(AbstractDialogC0760m abstractDialogC0760m) {
        AbstractC1209k.f(abstractDialogC0760m, "this$0");
        super.onBackPressed();
    }

    @Override // d.InterfaceC0744J
    public final C0743I a() {
        return this.f10797q;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1209k.f(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // E3.f
    public final V.o b() {
        return (V.o) this.f10796p.f7343q;
    }

    public final void d() {
        Window window = getWindow();
        AbstractC1209k.c(window);
        View decorView = window.getDecorView();
        AbstractC1209k.e(decorView, "window!!.decorView");
        androidx.lifecycle.K.m(decorView, this);
        Window window2 = getWindow();
        AbstractC1209k.c(window2);
        View decorView2 = window2.getDecorView();
        AbstractC1209k.e(decorView2, "window!!.decorView");
        N5.l.O(decorView2, this);
        Window window3 = getWindow();
        AbstractC1209k.c(window3);
        View decorView3 = window3.getDecorView();
        AbstractC1209k.e(decorView3, "window!!.decorView");
        AbstractC1267a.K(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0597u
    public final androidx.lifecycle.K h() {
        C0599w c0599w = this.f10795o;
        if (c0599w != null) {
            return c0599w;
        }
        C0599w c0599w2 = new C0599w(this, true);
        this.f10795o = c0599w2;
        return c0599w2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f10797q.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1209k.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0743I c0743i = this.f10797q;
            c0743i.getClass();
            c0743i.f10741e = onBackInvokedDispatcher;
            c0743i.d(c0743i.f10743g);
        }
        this.f10796p.D(bundle);
        C0599w c0599w = this.f10795o;
        if (c0599w == null) {
            c0599w = new C0599w(this, true);
            this.f10795o = c0599w;
        }
        c0599w.r(EnumC0592o.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC1209k.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f10796p.E(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0599w c0599w = this.f10795o;
        if (c0599w == null) {
            c0599w = new C0599w(this, true);
            this.f10795o = c0599w;
        }
        c0599w.r(EnumC0592o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0599w c0599w = this.f10795o;
        if (c0599w == null) {
            c0599w = new C0599w(this, true);
            this.f10795o = c0599w;
        }
        c0599w.r(EnumC0592o.ON_DESTROY);
        this.f10795o = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        d();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC1209k.f(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1209k.f(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
