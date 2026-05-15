package Z1;

import K0.C0239g;
import java.util.ArrayList;
import t5.C1523g;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements i {

    /* JADX INFO: renamed from: a */
    public int f8779a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8780b;

    public k(int i7, int i8) {
        this.f8779a = (i8 & 1) != 0 ? Integer.MAX_VALUE : i7;
        this.f8780b = new ArrayList();
    }

    public final String d() {
        return t5.j.I(new C1523g(AbstractC1545g.c0(Z4.n.w0(this.f8780b, ",\n", null, null, null, 62)), new C0239g(1), 2), "\n");
    }
}
