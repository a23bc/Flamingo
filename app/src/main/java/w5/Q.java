package w5;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1793k f19502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ V f19503r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(V v3, long j3, C1793k c1793k) {
        super(j3);
        this.f19503r = v3;
        this.f19502q = c1793k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19502q.B(this.f19503r);
    }

    @Override // w5.T
    public final String toString() {
        return super.toString() + this.f19502q;
    }
}
