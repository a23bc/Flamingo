package G1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends f0 {
    public g0(m0 m0Var, WindowInsets windowInsets) {
        super(m0Var, windowInsets);
    }

    @Override // G1.j0
    public m0 a() {
        return m0.c(null, this.f2703c.consumeDisplayCutout());
    }

    @Override // G1.e0, G1.j0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Objects.equals(this.f2703c, g0Var.f2703c) && Objects.equals(this.f2707g, g0Var.f2707g);
    }

    @Override // G1.j0
    public C0141h f() {
        DisplayCutout displayCutout = this.f2703c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0141h(displayCutout);
    }

    @Override // G1.j0
    public int hashCode() {
        return this.f2703c.hashCode();
    }

    public g0(m0 m0Var, g0 g0Var) {
        super(m0Var, g0Var);
    }
}
