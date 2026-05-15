package G1;

import android.view.WindowInsets;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2691c;

    public b0() {
        this.f2691c = C2.C.f();
    }

    @Override // G1.d0
    public m0 b() {
        a();
        m0 m0VarC = m0.c(null, this.f2691c.build());
        m0VarC.f2725a.r(this.f2699b);
        return m0VarC;
    }

    @Override // G1.d0
    public void d(C1993b c1993b) {
        this.f2691c.setMandatorySystemGestureInsets(c1993b.d());
    }

    @Override // G1.d0
    public void e(C1993b c1993b) {
        this.f2691c.setStableInsets(c1993b.d());
    }

    @Override // G1.d0
    public void f(C1993b c1993b) {
        this.f2691c.setSystemGestureInsets(c1993b.d());
    }

    @Override // G1.d0
    public void g(C1993b c1993b) {
        this.f2691c.setSystemWindowInsets(c1993b.d());
    }

    @Override // G1.d0
    public void h(C1993b c1993b) {
        this.f2691c.setTappableElementInsets(c1993b.d());
    }

    public b0(m0 m0Var) {
        WindowInsets.Builder builderF;
        super(m0Var);
        WindowInsets windowInsetsB = m0Var.b();
        if (windowInsetsB != null) {
            builderF = C2.C.g(windowInsetsB);
        } else {
            builderF = C2.C.f();
        }
        this.f2691c = builderF;
    }
}
