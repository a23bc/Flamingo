package G1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends I0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsetsController f2730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Window f2731d;

    public p0(Window window) {
        this.f2730c = window.getInsetsController();
        this.f2731d = window;
    }

    @Override // I0.c
    public boolean E() {
        this.f2730c.setSystemBarsAppearance(0, 0);
        return (this.f2730c.getSystemBarsAppearance() & 16) != 0;
    }

    @Override // I0.c
    public boolean F() {
        this.f2730c.setSystemBarsAppearance(0, 0);
        return (this.f2730c.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // I0.c
    public final void P(boolean z6) {
        Window window = this.f2731d;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f2730c.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f2730c.setSystemBarsAppearance(0, 16);
    }

    @Override // I0.c
    public final void Q(boolean z6) {
        Window window = this.f2731d;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f2730c.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f2730c.setSystemBarsAppearance(0, 8);
    }
}
