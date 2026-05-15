package G1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import q.C1340u;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f2641a = null;

    /* JADX INFO: renamed from: b */
    public static Field f2642b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f2643c = false;

    /* JADX INFO: renamed from: d */
    public static final C0154v f2644d = new C0154v();

    /* JADX INFO: renamed from: e */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0156x f2645e = new ViewTreeObserverOnGlobalLayoutListenerC0156x();

    public static N a(View view) {
        if (f2641a == null) {
            f2641a = new WeakHashMap();
        }
        N n7 = (N) f2641a.get(view);
        if (n7 != null) {
            return n7;
        }
        N n8 = new N(view);
        f2641a.put(view, n8);
        return n8;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = H.f2637d;
        H h = (H) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (h == null) {
            h = new H();
            h.f2638a = null;
            h.f2639b = null;
            h.f2640c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, h);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = h.f2638a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = H.f2637d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (h.f2638a == null) {
                            h.f2638a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = H.f2637d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                h.f2638a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    h.f2638a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = h.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (h.f2639b == null) {
                    h.f2639b = new SparseArray();
                }
                h.f2639b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return E.a(view);
        }
        if (f2643c) {
            return null;
        }
        if (f2642b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2642b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2643c = true;
                return null;
            }
        }
        try {
            Object obj = f2642b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2643c = true;
            return null;
        }
    }

    public static String[] d(C1340u c1340u) {
        return Build.VERSION.SDK_INT >= 31 ? G.a(c1340u) : (String[]) c1340u.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i7) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i8 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i8 >= 28) {
                tag = D.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z6 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i7);
                if (z6) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i8 >= 28) {
                        objA = D.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i7);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i8 >= 28) {
                objA = D.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0139f f(View view, C0139f c0139f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0139f);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return G.b(view, c0139f);
        }
        K1.o oVar = (K1.o) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0148o interfaceC0148o = f2644d;
        if (oVar == null) {
            if (view instanceof InterfaceC0148o) {
                interfaceC0148o = (InterfaceC0148o) view;
            }
            return interfaceC0148o.a(c0139f);
        }
        C0139f c0139fA = K1.o.a(view, c0139f);
        if (c0139fA == null) {
            return null;
        }
        if (view instanceof InterfaceC0148o) {
            interfaceC0148o = (InterfaceC0148o) view;
        }
        return interfaceC0148o.a(c0139fA);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            E.b(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }

    public static void h(View view, C0135b c0135b) {
        if (c0135b == null && (c(view) instanceof C0134a)) {
            c0135b = new C0135b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0135b == null ? null : c0135b.f2690b);
    }

    public static void i(View view, CharSequence charSequence) {
        new C0155w(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0156x viewTreeObserverOnGlobalLayoutListenerC0156x = f2645e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0156x.f2741o.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0156x);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0156x);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0156x.f2741o.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0156x);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0156x);
            }
        }
    }

    public static void j(View view, P p7) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(p7 != null ? new W(p7) : null);
            return;
        }
        PathInterpolator pathInterpolator = V.f2669e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (p7 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener u7 = new U(view, p7);
        view.setTag(R.id.tag_window_insets_animation_callback, u7);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(u7);
        }
    }
}
