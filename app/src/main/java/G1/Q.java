package G1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f2655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f2656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f2657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2659e;

    public Q(Z z6, m0 m0Var, m0 m0Var2, int i7, View view) {
        this.f2655a = z6;
        this.f2656b = m0Var;
        this.f2657c = m0Var2;
        this.f2658d = i7;
        this.f2659e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        int i7;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Z z6 = this.f2655a;
        z6.f2681a.e(animatedFraction);
        float fC = z6.f2681a.c();
        PathInterpolator pathInterpolator = V.f2669e;
        int i8 = Build.VERSION.SDK_INT;
        m0 m0Var = this.f2656b;
        d0 c0Var = i8 >= 30 ? new c0(m0Var) : i8 >= 29 ? new b0(m0Var) : new a0(m0Var);
        int i9 = 1;
        while (i9 <= 256) {
            int i10 = this.f2658d & i9;
            j0 j0Var = m0Var.f2725a;
            if (i10 == 0) {
                c0Var.c(i9, j0Var.g(i9));
                f7 = fC;
                i7 = 1;
            } else {
                C1993b c1993bG = j0Var.g(i9);
                C1993b c1993bG2 = this.f2657c.f2725a.g(i9);
                float f8 = 1.0f - fC;
                f7 = fC;
                i7 = 1;
                c0Var.c(i9, m0.a(c1993bG, (int) (((double) ((c1993bG.f20271a - c1993bG2.f20271a) * f8)) + 0.5d), (int) (((double) ((c1993bG.f20272b - c1993bG2.f20272b) * f8)) + 0.5d), (int) (((double) ((c1993bG.f20273c - c1993bG2.f20273c) * f8)) + 0.5d), (int) (((double) ((c1993bG.f20274d - c1993bG2.f20274d) * f8)) + 0.5d)));
            }
            i9 <<= i7;
            fC = f7;
        }
        V.h(this.f2659e, c0Var.b(), Collections.singletonList(z6));
    }
}
