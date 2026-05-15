package D;

import r0.AbstractC1397o;

/* JADX INFO: renamed from: D.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0065f0 extends AbstractC1397o implements Q0.v0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f1317C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f1318D;

    @Override // Q0.v0
    public final Object M(n1.d dVar, Object obj) {
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var == null) {
            n0Var = new n0();
        }
        n0Var.f1355a = this.f1317C;
        n0Var.f1356b = this.f1318D;
        return n0Var;
    }
}
