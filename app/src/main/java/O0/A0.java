package O0;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a */
    public final D0 f5278a;

    /* JADX INFO: renamed from: b */
    public S f5279b;

    /* JADX INFO: renamed from: c */
    public final z0 f5280c = new z0(this, 2);

    /* JADX INFO: renamed from: d */
    public final z0 f5281d = new z0(this, 0);

    /* JADX INFO: renamed from: e */
    public final z0 f5282e = new z0(this, 1);

    public A0(D0 d02) {
        this.f5278a = d02;
    }

    public final S a() {
        S s7 = this.f5279b;
        if (s7 != null) {
            return s7;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
