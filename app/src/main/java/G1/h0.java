package G1;

import android.view.WindowInsets;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends g0 {

    /* JADX INFO: renamed from: n */
    public C1993b f2718n;

    /* JADX INFO: renamed from: o */
    public C1993b f2719o;

    /* JADX INFO: renamed from: p */
    public C1993b f2720p;

    public h0(m0 m0Var, WindowInsets windowInsets) {
        super(m0Var, windowInsets);
        this.f2718n = null;
        this.f2719o = null;
        this.f2720p = null;
    }

    @Override // G1.j0
    public C1993b i() {
        if (this.f2719o == null) {
            this.f2719o = C1993b.c(this.f2703c.getMandatorySystemGestureInsets());
        }
        return this.f2719o;
    }

    @Override // G1.j0
    public C1993b k() {
        if (this.f2718n == null) {
            this.f2718n = C1993b.c(this.f2703c.getSystemGestureInsets());
        }
        return this.f2718n;
    }

    @Override // G1.j0
    public C1993b m() {
        if (this.f2720p == null) {
            this.f2720p = C1993b.c(this.f2703c.getTappableElementInsets());
        }
        return this.f2720p;
    }

    @Override // G1.e0, G1.j0
    public m0 n(int i7, int i8, int i9, int i10) {
        return m0.c(null, this.f2703c.inset(i7, i8, i9, i10));
    }

    public h0(m0 m0Var, h0 h0Var) {
        super(m0Var, h0Var);
        this.f2718n = null;
        this.f2719o = null;
        this.f2720p = null;
    }

    @Override // G1.f0, G1.j0
    public void u(C1993b c1993b) {
    }
}
