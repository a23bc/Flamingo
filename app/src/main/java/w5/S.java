package w5;

/* JADX INFO: loaded from: classes.dex */
public final class S extends T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final D0 f19504q;

    public S(long j3, D0 d02) {
        super(j3);
        this.f19504q = d02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19504q.run();
    }

    @Override // w5.T
    public final String toString() {
        return super.toString() + this.f19504q;
    }
}
