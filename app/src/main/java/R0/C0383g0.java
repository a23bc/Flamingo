package R0;

import K0.C0236d;
import android.view.ViewGroup;
import e5.AbstractC0865c;
import r0.AbstractC1397o;
import x0.C1893c;
import y0.AbstractC1959I;

/* JADX INFO: renamed from: R0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0383g0 extends AbstractC1397o implements V0.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ViewGroup f6461C;

    @Override // V0.a
    public final Object P(Q0.j0 j0Var, C0236d c0236d, AbstractC0865c abstractC0865c) {
        long jI = j0Var.I(0L);
        C1893c c1893c = (C1893c) c0236d.a();
        C1893c c1893cI = c1893c != null ? c1893c.i(jI) : null;
        if (c1893cI != null) {
            this.f6461C.requestRectangleOnScreen(AbstractC1959I.u(c1893cI), false);
        }
        return Y4.o.f8736a;
    }
}
