package D;

import r0.AbstractC1397o;
import r0.C1388f;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC1397o implements Q0.v0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1388f f1276C;

    @Override // Q0.v0
    public final Object M(n1.d dVar, Object obj) {
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var == null) {
            n0Var = new n0();
        }
        n0Var.f1357c = new B(this.f1276C);
        return n0Var;
    }
}
