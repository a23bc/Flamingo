package w5;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends C1793k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p0 f19546w;

    public l0(c5.d dVar, p0 p0Var) {
        super(1, dVar);
        this.f19546w = p0Var;
    }

    @Override // w5.C1793k
    public final Throwable p(p0 p0Var) {
        Throwable thC;
        Object objO = this.f19546w.O();
        return (!(objO instanceof n0) || (thC = ((n0) objO).c()) == null) ? objO instanceof C1800s ? ((C1800s) objO).f19570a : p0Var.q() : thC;
    }

    @Override // w5.C1793k
    public final String y() {
        return "AwaitContinuation";
    }
}
