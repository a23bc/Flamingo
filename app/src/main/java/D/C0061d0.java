package D;

/* JADX INFO: renamed from: D.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0061d0 extends AbstractC0059c0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public EnumC0057b0 f1311D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f1312E;

    @Override // D.AbstractC0059c0
    public final long B0(O0.Y y6, long j3) {
        int iM = this.f1311D == EnumC0057b0.f1299o ? y6.M(n1.a.g(j3)) : y6.P(n1.a.g(j3));
        if (iM < 0) {
            iM = 0;
        }
        if (iM < 0) {
            n1.j.a("width must be >= 0");
        }
        return n1.b.h(iM, iM, 0, Integer.MAX_VALUE);
    }

    @Override // D.AbstractC0059c0
    public final boolean C0() {
        return this.f1312E;
    }

    @Override // D.AbstractC0059c0, Q0.A
    public final int d(Q0.T t7, O0.Y y6, int i7) {
        return this.f1311D == EnumC0057b0.f1299o ? y6.M(i7) : y6.P(i7);
    }

    @Override // D.AbstractC0059c0, Q0.A
    public final int h(Q0.T t7, O0.Y y6, int i7) {
        return this.f1311D == EnumC0057b0.f1299o ? y6.M(i7) : y6.P(i7);
    }
}
