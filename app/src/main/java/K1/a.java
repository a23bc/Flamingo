package K1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public int f3940a;

    /* JADX INFO: renamed from: b */
    public int f3941b;

    /* JADX INFO: renamed from: c */
    public float f3942c;

    /* JADX INFO: renamed from: d */
    public float f3943d;

    /* JADX INFO: renamed from: e */
    public long f3944e;

    /* JADX INFO: renamed from: f */
    public long f3945f;

    /* JADX INFO: renamed from: g */
    public long f3946g;
    public float h;

    /* JADX INFO: renamed from: i */
    public int f3947i;

    public final float a(long j3) {
        if (j3 < this.f3944e) {
            return 0.0f;
        }
        long j7 = this.f3946g;
        if (j7 < 0 || j3 < j7) {
            return d.b((j3 - r0) / this.f3940a, 0.0f, 1.0f) * 0.5f;
        }
        float f7 = this.h;
        return (d.b((j3 - j7) / this.f3947i, 0.0f, 1.0f) * f7) + (1.0f - f7);
    }
}
