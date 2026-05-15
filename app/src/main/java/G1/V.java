package G1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import m2.InterpolatorC1193a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class V extends Y {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f2669e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final InterpolatorC1193a f2670f = new InterpolatorC1193a(InterpolatorC1193a.f14362c);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f2671g = new DecelerateInterpolator();

    public static void f(Z z6, View view) {
        P pK = k(view);
        if (pK != null) {
            pK.d(z6);
            if (pK.f2653o == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                f(z6, viewGroup.getChildAt(i7));
            }
        }
    }

    public static void g(View view, Z z6, WindowInsets windowInsets, boolean z7) {
        P pK = k(view);
        if (pK != null) {
            pK.f2654p = windowInsets;
            if (!z7) {
                pK.e(z6);
                z7 = pK.f2653o == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                g(viewGroup.getChildAt(i7), z6, windowInsets, z7);
            }
        }
    }

    public static void h(View view, m0 m0Var, List list) {
        P pK = k(view);
        if (pK != null) {
            m0Var = pK.f(m0Var, list);
            if (pK.f2653o == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                h(viewGroup.getChildAt(i7), m0Var, list);
            }
        }
    }

    public static void i(View view, Z z6, V.o oVar) {
        P pK = k(view);
        if (pK != null) {
            pK.g(z6, oVar);
            if (pK.f2653o == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                i(viewGroup.getChildAt(i7), z6, oVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static P k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof U) {
            return ((U) tag).f2667a;
        }
        return null;
    }
}
