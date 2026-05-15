package k3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f14029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f14030p;

    public g(long j3, byte[] bArr) {
        this.f14029o = j3;
        this.f14030p = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f14029o, ((g) obj).f14029o);
    }
}
