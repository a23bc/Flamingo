package d;

import G1.n0;
import G1.o0;
import G1.p0;
import G1.q0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0765r extends C0764q {
    @Override // d.C0763p, N5.d
    public void U(C0747M c0747m, C0747M c0747m2, Window window, View view, boolean z6, boolean z7) {
        AbstractC1209k.f(c0747m, "statusBarStyle");
        AbstractC1209k.f(c0747m2, "navigationBarStyle");
        AbstractC1209k.f(window, "window");
        AbstractC1209k.f(view, "view");
        android.support.v4.media.session.b.G(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i7 = Build.VERSION.SDK_INT;
        I0.c q0Var = i7 >= 35 ? new q0(window) : i7 >= 30 ? new p0(window) : i7 >= 26 ? new o0(window) : new n0(window);
        q0Var.Q(!z6);
        q0Var.P(!z7);
    }
}
