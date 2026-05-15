package R0;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import m5.AbstractC1209k;
import p.ViewOnKeyListenerC1270C;
import p.ViewOnKeyListenerC1277f;
import y0.C1972e;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class A implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6224o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f6225p;

    public /* synthetic */ A(int i7, Object obj) {
        this.f6224o = i7;
        this.f6225p = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f6224o) {
            case 0:
                F f7 = (F) this.f6225p;
                AccessibilityManager accessibilityManager = f7.f6290g;
                f7.f6293k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(f7.f6291i);
                accessibilityManager.addTouchExplorationStateChangeListener(f7.f6292j);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                Context context = view.getContext();
                C1972e c1972e = (C1972e) this.f6225p;
                if (!c1972e.f20236d) {
                    context.getApplicationContext().registerComponentCallbacks(c1972e.f20237e);
                    c1972e.f20236d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z6;
        switch (this.f6224o) {
            case 0:
                F f7 = (F) this.f6225p;
                f7.l.removeCallbacks(f7.f6284N);
                AccessibilityManager accessibilityManager = f7.f6290g;
                accessibilityManager.removeAccessibilityStateChangeListener(f7.f6291i);
                accessibilityManager.removeTouchExplorationStateChangeListener(f7.f6292j);
                break;
            case 1:
                AbstractC0370a abstractC0370a = (AbstractC0370a) this.f6225p;
                AbstractC1209k.f(abstractC0370a, "<this>");
                Iterator it = t5.j.H(abstractC0370a.getParent(), G1.K.f2647w).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            AbstractC1209k.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z6 = true;
                            }
                        }
                    }
                }
                if (!z6) {
                    abstractC0370a.c();
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((w5.w0) this.f6225p).c(null);
                break;
            case 3:
                ViewOnKeyListenerC1277f viewOnKeyListenerC1277f = (ViewOnKeyListenerC1277f) this.f6225p;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1277f.f14786L;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1277f.f14786L = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1277f.f14786L.removeGlobalOnLayoutListener(viewOnKeyListenerC1277f.f14796w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                ViewOnKeyListenerC1270C viewOnKeyListenerC1270C = (ViewOnKeyListenerC1270C) this.f6225p;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1270C.f14735C;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1270C.f14735C = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1270C.f14735C.removeGlobalOnLayoutListener(viewOnKeyListenerC1270C.f14748w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                Context context = view.getContext();
                C1972e c1972e = (C1972e) this.f6225p;
                if (c1972e.f20236d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c1972e.f20237e);
                    c1972e.f20236d = false;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
