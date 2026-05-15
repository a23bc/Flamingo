package G1;

import android.view.WindowInsets;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends e0 {

    /* JADX INFO: renamed from: m */
    public C1993b f2709m;

    public f0(m0 m0Var, WindowInsets windowInsets) {
        super(m0Var, windowInsets);
        this.f2709m = null;
    }

    @Override // G1.j0
    public m0 b() {
        return m0.c(null, this.f2703c.consumeStableInsets());
    }

    @Override // G1.j0
    public m0 c() {
        return m0.c(null, this.f2703c.consumeSystemWindowInsets());
    }

    @Override // G1.j0
    public final C1993b j() {
        if (this.f2709m == null) {
            WindowInsets windowInsets = this.f2703c;
            this.f2709m = C1993b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2709m;
    }

    @Override // G1.j0
    public boolean o() {
        return this.f2703c.isConsumed();
    }

    @Override // G1.j0
    public void u(C1993b c1993b) {
        this.f2709m = c1993b;
    }

    public f0(m0 m0Var, f0 f0Var) {
        super(m0Var, f0Var);
        this.f2709m = null;
        this.f2709m = f0Var.f2709m;
    }
}
