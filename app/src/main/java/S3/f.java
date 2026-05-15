package s3;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f15896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1432b f15897p;

    public f(int i7, C1432b c1432b) {
        this.f15896o = i7;
        this.f15897p = c1432b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f15896o, ((f) obj).f15896o);
    }
}
