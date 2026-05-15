package I;

import H.InterfaceC0174p;

/* JADX INFO: renamed from: I.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222n implements InterfaceC0174p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0211c f3373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3374b;

    public C0222n(C0211c c0211c, int i7) {
        this.f3373a = c0211c;
        this.f3374b = i7;
    }

    @Override // H.InterfaceC0174p
    public final int a() {
        return this.f3373a.m();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // H.InterfaceC0174p
    public final int b() {
        return Math.min(r0.m() - 1, ((C0218j) Z4.n.x0(this.f3373a.l().f3408a)).f3361a + this.f3374b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // H.InterfaceC0174p
    public final boolean c() {
        return !this.f3373a.l().f3408a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // H.InterfaceC0174p
    public final int d() {
        int i7;
        C0211c c0211c = this.f3373a;
        if (c0211c.l().f3408a.size() == 0) {
            return 0;
        }
        int iA = N5.l.A(c0211c.l());
        int i8 = c0211c.l().f3409b + c0211c.l().f3410c;
        if (i8 != 0 && (i7 = iA / i8) >= 1) {
            return i7;
        }
        return 1;
    }

    @Override // H.InterfaceC0174p
    public final int e() {
        return Math.max(0, this.f3373a.f3295e - this.f3374b);
    }
}
