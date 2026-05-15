package G1;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y f2681a;

    public Z(int i7, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2681a = new X(B0.l.i(i7, interpolator, j3));
        } else {
            this.f2681a = new V(i7, interpolator, j3);
        }
    }
}
