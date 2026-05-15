package w5;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends B5.r implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f19482s;

    public D0(long j3, E0 e02) {
        super(e02, e02.getContext());
        this.f19482s = j3;
    }

    @Override // w5.p0
    public final String W() {
        return super.W() + "(timeMillis=" + this.f19482s + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1767D.l(this.f19517q);
        C(new C0("Timed out waiting for " + this.f19482s + " ms", this));
    }
}
