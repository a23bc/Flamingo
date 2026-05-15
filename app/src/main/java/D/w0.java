package D;

import r0.AbstractC1397o;
import r0.C1389g;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends AbstractC1397o implements Q0.v0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1389g f1410C;

    @Override // Q0.v0
    public final Object M(n1.d dVar, Object obj) {
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var == null) {
            n0Var = new n0();
        }
        n0Var.f1357c = new C(this.f1410C);
        return n0Var;
    }
}
