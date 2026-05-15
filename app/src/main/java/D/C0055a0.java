package D;

/* JADX INFO: renamed from: D.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055a0 extends AbstractC0059c0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public EnumC0057b0 f1296D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f1297E;

    @Override // D.AbstractC0059c0
    public final long B0(O0.Y y6, long j3) {
        int iQ = this.f1296D == EnumC0057b0.f1299o ? y6.Q(n1.a.h(j3)) : y6.e(n1.a.h(j3));
        if (iQ < 0) {
            iQ = 0;
        }
        if (iQ < 0) {
            n1.j.a("height must be >= 0");
        }
        return n1.b.h(0, Integer.MAX_VALUE, iQ, iQ);
    }

    @Override // D.AbstractC0059c0
    public final boolean C0() {
        return this.f1297E;
    }

    @Override // D.AbstractC0059c0, Q0.A
    public final int c(Q0.T t7, O0.Y y6, int i7) {
        return this.f1296D == EnumC0057b0.f1299o ? y6.Q(i7) : y6.e(i7);
    }

    @Override // D.AbstractC0059c0, Q0.A
    public final int g(Q0.T t7, O0.Y y6, int i7) {
        return this.f1296D == EnumC0057b0.f1299o ? y6.Q(i7) : y6.e(i7);
    }
}
