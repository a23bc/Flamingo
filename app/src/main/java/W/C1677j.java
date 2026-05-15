package w;

/* JADX INFO: renamed from: w.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1677j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1680m f18686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18687b;

    public C1677j(C1680m c1680m, int i7) {
        this.f18686a = c1680m;
        this.f18687b = i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i7 = this.f18687b;
        sb.append(i7 != 1 ? i7 != 2 ? "null" : "Finished" : "BoundReached");
        sb.append(", endState=");
        sb.append(this.f18686a);
        sb.append(')');
        return sb.toString();
    }
}
