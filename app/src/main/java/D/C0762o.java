package d;

import G1.n0;
import G1.o0;
import G1.p0;
import G1.q0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0762o extends N5.d {
    @Override // N5.d
    public void U(C0747M c0747m, C0747M c0747m2, Window window, View view, boolean z6, boolean z7) {
        AbstractC1209k.f(c0747m, "statusBarStyle");
        AbstractC1209k.f(c0747m2, "navigationBarStyle");
        AbstractC1209k.f(window, "window");
        AbstractC1209k.f(view, "view");
        android.support.v4.media.session.b.G(window, false);
        window.setStatusBarColor(z6 ? c0747m.f10750b : c0747m.f10749a);
        window.setNavigationBarColor(c0747m2.f10750b);
        int i7 = Build.VERSION.SDK_INT;
        (i7 >= 35 ? new q0(window) : i7 >= 30 ? new p0(window) : i7 >= 26 ? new o0(window) : new n0(window)).Q(!z6);
    }
}
