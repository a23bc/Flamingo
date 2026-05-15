package G1;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends I0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f2726c;

    public n0(Window window) {
        this.f2726c = window;
    }

    @Override // I0.c
    public final boolean F() {
        return (this.f2726c.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // I0.c
    public final void Q(boolean z6) {
        Window window = this.f2726c;
        if (!z6) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
