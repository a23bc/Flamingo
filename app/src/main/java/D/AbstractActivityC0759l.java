package d;

import G1.InterfaceC0143j;
import R0.C0408t0;
import a.AbstractC0509a;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.InterfaceC0588k;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import f.InterfaceC0872a;
import g.InterfaceC0939f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import p2.C1293c;
import v1.InterfaceC1632b;
import v1.InterfaceC1633c;
import yos.music.player.R;

/* JADX INFO: renamed from: d.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0759l extends u1.f implements Y, InterfaceC0588k, E3.f, InterfaceC0744J, InterfaceC0939f, InterfaceC1632b, InterfaceC1633c, u1.s, u1.t, InterfaceC0143j {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ int f10777G = 0;

    /* JADX INFO: renamed from: A */
    public final CopyOnWriteArrayList f10778A;

    /* JADX INFO: renamed from: B */
    public final CopyOnWriteArrayList f10779B;

    /* JADX INFO: renamed from: C */
    public boolean f10780C;

    /* JADX INFO: renamed from: D */
    public boolean f10781D;

    /* JADX INFO: renamed from: E */
    public final Y4.m f10782E;

    /* JADX INFO: renamed from: F */
    public final Y4.m f10783F;

    /* JADX INFO: renamed from: p */
    public final I4.x f10784p = new I4.x();

    /* JADX INFO: renamed from: q */
    public final A0.b f10785q = new A0.b((Runnable) new RunnableC0751d(this, 0));

    /* JADX INFO: renamed from: r */
    public final V.o f10786r;

    /* JADX INFO: renamed from: s */
    public X f10787s;

    /* JADX INFO: renamed from: t */
    public final ViewTreeObserverOnDrawListenerC0756i f10788t;

    /* JADX INFO: renamed from: u */
    public final Y4.m f10789u;

    /* JADX INFO: renamed from: v */
    public final C0757j f10790v;

    /* JADX INFO: renamed from: w */
    public final CopyOnWriteArrayList f10791w;

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArrayList f10792x;

    /* JADX INFO: renamed from: y */
    public final CopyOnWriteArrayList f10793y;

    /* JADX INFO: renamed from: z */
    public final CopyOnWriteArrayList f10794z;

    public AbstractActivityC0759l() {
        C2.I i7 = new C2.I(this, new E3.e(0, this));
        V.o oVar = new V.o(i7);
        this.f10786r = oVar;
        this.f10788t = new ViewTreeObserverOnDrawListenerC0756i(this);
        this.f10789u = AbstractC0509a.O(new C0758k(this, 2));
        new AtomicInteger();
        this.f10790v = new C0757j(this);
        this.f10791w = new CopyOnWriteArrayList();
        this.f10792x = new CopyOnWriteArrayList();
        this.f10793y = new CopyOnWriteArrayList();
        this.f10794z = new CopyOnWriteArrayList();
        this.f10778A = new CopyOnWriteArrayList();
        this.f10779B = new CopyOnWriteArrayList();
        C0599w c0599w = this.f17150o;
        if (c0599w == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i8 = 0;
        c0599w.a(new InterfaceC0595s(this) { // from class: d.e

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0759l f10759p;

            {
                this.f10759p = this;
            }

            @Override // androidx.lifecycle.InterfaceC0595s
            public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
                Window window;
                View viewPeekDecorView;
                switch (i8) {
                    case 0:
                        AbstractActivityC0759l abstractActivityC0759l = this.f10759p;
                        if (enumC0592o == EnumC0592o.ON_STOP && (window = abstractActivityC0759l.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0759l abstractActivityC0759l2 = this.f10759p;
                        if (enumC0592o == EnumC0592o.ON_DESTROY) {
                            abstractActivityC0759l2.f10784p.f3541b = null;
                            if (!abstractActivityC0759l2.isChangingConfigurations()) {
                                abstractActivityC0759l2.g().a();
                            }
                            ViewTreeObserverOnDrawListenerC0756i viewTreeObserverOnDrawListenerC0756i = abstractActivityC0759l2.f10788t;
                            AbstractActivityC0759l abstractActivityC0759l3 = viewTreeObserverOnDrawListenerC0756i.f10767r;
                            abstractActivityC0759l3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0756i);
                            abstractActivityC0759l3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0756i);
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f17150o.a(new InterfaceC0595s(this) { // from class: d.e

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0759l f10759p;

            {
                this.f10759p = this;
            }

            @Override // androidx.lifecycle.InterfaceC0595s
            public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
                Window window;
                View viewPeekDecorView;
                switch (i9) {
                    case 0:
                        AbstractActivityC0759l abstractActivityC0759l = this.f10759p;
                        if (enumC0592o == EnumC0592o.ON_STOP && (window = abstractActivityC0759l.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0759l abstractActivityC0759l2 = this.f10759p;
                        if (enumC0592o == EnumC0592o.ON_DESTROY) {
                            abstractActivityC0759l2.f10784p.f3541b = null;
                            if (!abstractActivityC0759l2.isChangingConfigurations()) {
                                abstractActivityC0759l2.g().a();
                            }
                            ViewTreeObserverOnDrawListenerC0756i viewTreeObserverOnDrawListenerC0756i = abstractActivityC0759l2.f10788t;
                            AbstractActivityC0759l abstractActivityC0759l3 = viewTreeObserverOnDrawListenerC0756i.f10767r;
                            abstractActivityC0759l3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0756i);
                            abstractActivityC0759l3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0756i);
                        }
                        break;
                }
            }
        });
        this.f17150o.a(new E3.b(this, 1));
        i7.b();
        androidx.lifecycle.K.f(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.f17150o.a(new C0772y(this));
        }
        ((V.o) oVar.f7343q).G("android:support:activity-result", new C0408t0(3, this));
        j(new Y1.f(this, 1));
        this.f10782E = AbstractC0509a.O(new C0758k(this, 0));
        this.f10783F = AbstractC0509a.O(new C0758k(this, 3));
    }

    @Override // d.InterfaceC0744J
    public final C0743I a() {
        return (C0743I) this.f10783F.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        this.f10788t.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // E3.f
    public final V.o b() {
        return (V.o) this.f10786r.f7343q;
    }

    @Override // androidx.lifecycle.InterfaceC0588k
    public final U d() {
        return (U) this.f10782E.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0588k
    public final C1293c e() {
        C1293c c1293c = new C1293c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c1293c.f14994a;
        if (application != null) {
            N2.z zVar = T.f9726e;
            Application application2 = getApplication();
            AbstractC1209k.e(application2, "application");
            linkedHashMap.put(zVar, application2);
        }
        linkedHashMap.put(androidx.lifecycle.K.f9700a, this);
        linkedHashMap.put(androidx.lifecycle.K.f9701b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.K.f9702c, extras);
        }
        return c1293c;
    }

    @Override // g.InterfaceC0939f
    public final C0757j f() {
        return this.f10790v;
    }

    @Override // androidx.lifecycle.Y
    public final X g() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f10787s == null) {
            C0755h c0755h = (C0755h) getLastNonConfigurationInstance();
            if (c0755h != null) {
                this.f10787s = c0755h.f10763a;
            }
            if (this.f10787s == null) {
                this.f10787s = new X();
            }
        }
        X x6 = this.f10787s;
        AbstractC1209k.c(x6);
        return x6;
    }

    @Override // androidx.lifecycle.InterfaceC0597u
    public final androidx.lifecycle.K h() {
        return this.f17150o;
    }

    public final void j(InterfaceC0872a interfaceC0872a) {
        I4.x xVar = this.f10784p;
        xVar.getClass();
        AbstractActivityC0759l abstractActivityC0759l = (AbstractActivityC0759l) xVar.f3541b;
        if (abstractActivityC0759l != null) {
            interfaceC0872a.a(abstractActivityC0759l);
        }
        ((CopyOnWriteArraySet) xVar.f3540a).add(interfaceC0872a);
    }

    public final void k() {
        View decorView = getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        androidx.lifecycle.K.m(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1209k.e(decorView2, "window.decorView");
        androidx.lifecycle.K.n(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1209k.e(decorView3, "window.decorView");
        AbstractC1267a.K(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1209k.e(decorView4, "window.decorView");
        N5.l.O(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC1209k.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f10790v.a(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC1209k.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f10791w.iterator();
        while (it.hasNext()) {
            ((F1.a) it.next()).c(configuration);
        }
    }

    @Override // u1.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f10786r.D(bundle);
        I4.x xVar = this.f10784p;
        xVar.getClass();
        xVar.f3541b = this;
        Iterator it = ((CopyOnWriteArraySet) xVar.f3540a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0872a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = androidx.lifecycle.H.f9693p;
        androidx.lifecycle.F.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        AbstractC1209k.f(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        getMenuInflater();
        this.f10785q.d0();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        AbstractC1209k.f(menuItem, "item");
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        this.f10785q.e0();
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6) {
        if (this.f10780C) {
            return;
        }
        Iterator it = this.f10794z.iterator();
        while (it.hasNext()) {
            ((F1.a) it.next()).c(new u1.g(z6));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC1209k.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f10793y.iterator();
        while (it.hasNext()) {
            ((F1.a) it.next()).c(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        AbstractC1209k.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f10785q.f51q).iterator();
        while (it.hasNext()) {
            Y1.q qVar = ((Y1.m) it.next()).f8612a;
            if (qVar.f8638q >= 1) {
                Iterator it2 = qVar.f8626c.U().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6) {
        if (this.f10781D) {
            return;
        }
        Iterator it = this.f10778A.iterator();
        while (it.hasNext()) {
            ((F1.a) it.next()).c(new u1.u(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        AbstractC1209k.f(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        this.f10785q.f0();
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        AbstractC1209k.f(strArr, "permissions");
        AbstractC1209k.f(iArr, "grantResults");
        if (this.f10790v.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0755h c0755h;
        X x6 = this.f10787s;
        if (x6 == null && (c0755h = (C0755h) getLastNonConfigurationInstance()) != null) {
            x6 = c0755h.f10763a;
        }
        if (x6 == null) {
            return null;
        }
        C0755h c0755h2 = new C0755h();
        c0755h2.f10763a = x6;
        return c0755h2;
    }

    @Override // u1.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1209k.f(bundle, "outState");
        C0599w c0599w = this.f17150o;
        if (c0599w instanceof C0599w) {
            AbstractC1209k.d(c0599w, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c0599w.t(EnumC0593p.f9747q);
        }
        super.onSaveInstanceState(bundle);
        this.f10786r.E(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f10792x.iterator();
        while (it.hasNext()) {
            ((F1.a) it.next()).c(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f10779B.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC1267a.A()) {
                AbstractC1267a.n("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0767t c0767t = (C0767t) this.f10789u.getValue();
            synchronized (c0767t.f10801b) {
                try {
                    c0767t.f10802c = true;
                    Iterator it = c0767t.f10803d.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1180a) it.next()).a();
                    }
                    c0767t.f10803d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        k();
        View decorView = getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        this.f10788t.a(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        AbstractC1209k.f(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) throws IntentSender.SendIntentException {
        AbstractC1209k.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        AbstractC1209k.f(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC1209k.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6, Configuration configuration) {
        AbstractC1209k.f(configuration, "newConfig");
        this.f10780C = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.f10780C = false;
            Iterator it = this.f10794z.iterator();
            while (it.hasNext()) {
                ((F1.a) it.next()).c(new u1.g(z6));
            }
        } catch (Throwable th) {
            this.f10780C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6, Configuration configuration) {
        AbstractC1209k.f(configuration, "newConfig");
        this.f10781D = true;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.f10781D = false;
            Iterator it = this.f10778A.iterator();
            while (it.hasNext()) {
                ((F1.a) it.next()).c(new u1.u(z6));
            }
        } catch (Throwable th) {
            this.f10781D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k();
        View decorView = getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        this.f10788t.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        this.f10788t.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
