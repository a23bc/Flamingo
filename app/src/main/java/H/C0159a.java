package H;

/* JADX INFO: renamed from: H.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0159a {

    /* JADX INFO: renamed from: a */
    public boolean f2838a;

    /* JADX INFO: renamed from: b */
    public long f2839b;

    public long a() {
        if (this.f2838a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f2839b - System.nanoTime());
    }
}
