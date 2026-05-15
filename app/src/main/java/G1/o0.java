package G1;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends n0 {
    @Override // I0.c
    public final boolean E() {
        return (this.f2726c.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override // I0.c
    public final void P(boolean z6) {
        Window window = this.f2726c;
        if (!z6) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
