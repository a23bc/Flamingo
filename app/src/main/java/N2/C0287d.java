package N2;

/* JADX INFO: renamed from: N2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0287d implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0289f f5028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5033f;

    public C0287d(InterfaceC0289f interfaceC0289f, long j3, long j7, long j8, long j9, long j10) {
        this.f5028a = interfaceC0289f;
        this.f5029b = j3;
        this.f5030c = j7;
        this.f5031d = j8;
        this.f5032e = j9;
        this.f5033f = j10;
    }

    @Override // N2.B
    public final boolean h() {
        return true;
    }

    @Override // N2.B
    public final A j(long j3) {
        C c7 = new C(j3, C0288e.a(this.f5028a.p(j3), 0L, this.f5030c, this.f5031d, this.f5032e, this.f5033f));
        return new A(c7, c7);
    }

    @Override // N2.B
    public final long l() {
        return this.f5029b;
    }
}
