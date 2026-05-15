package G1;

import android.animation.ValueAnimator;
import android.view.View;
import m5.AbstractC1209k;
import w3.C1760y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2649b;

    public /* synthetic */ L(k.I i7, View view) {
        this.f2648a = 0;
        this.f2649b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2648a) {
            case 0:
                ((View) ((k.K) ((k.I) this.f2649b).f13847p).f13858e.getParent()).invalidate();
                break;
            case 1:
                C1760y c1760y = (C1760y) this.f2649b;
                AbstractC1209k.f(c1760y, "$player");
                AbstractC1209k.f(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC1209k.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                try {
                    c1760y.A0(((Float) animatedValue).floatValue());
                } catch (Exception unused) {
                    valueAnimator.cancel();
                    return;
                }
                break;
            default:
                A2.N n7 = (A2.N) this.f2649b;
                AbstractC1209k.f(valueAnimator, "animation");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC1209k.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                try {
                    n7.A0(((Float) animatedValue2).floatValue());
                } catch (Exception unused2) {
                    valueAnimator.cancel();
                }
                break;
        }
    }

    public /* synthetic */ L(t2.X x6, int i7) {
        this.f2648a = i7;
        this.f2649b = x6;
    }
}
