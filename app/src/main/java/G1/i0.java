package G1;

import android.view.View;
import android.view.WindowInsets;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends h0 {

    /* JADX INFO: renamed from: q */
    public static final m0 f2721q = m0.c(null, WindowInsets.CONSUMED);

    public i0(m0 m0Var, WindowInsets windowInsets) {
        super(m0Var, windowInsets);
    }

    @Override // G1.e0, G1.j0
    public C1993b g(int i7) {
        return C1993b.c(this.f2703c.getInsets(l0.a(i7)));
    }

    @Override // G1.e0, G1.j0
    public C1993b h(int i7) {
        return C1993b.c(this.f2703c.getInsetsIgnoringVisibility(l0.a(i7)));
    }

    @Override // G1.e0, G1.j0
    public boolean q(int i7) {
        return this.f2703c.isVisible(l0.a(i7));
    }

    public i0(m0 m0Var, i0 i0Var) {
        super(m0Var, i0Var);
    }

    @Override // G1.e0, G1.j0
    public final void d(View view) {
    }
}
