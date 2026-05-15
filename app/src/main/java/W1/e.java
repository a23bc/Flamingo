package W1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7746b;

    public e(long j3, long j7) {
        if (j7 == 0) {
            this.f7745a = 0L;
            this.f7746b = 1L;
        } else {
            this.f7745a = j3;
            this.f7746b = j7;
        }
    }

    public final String toString() {
        return this.f7745a + "/" + this.f7746b;
    }
}
