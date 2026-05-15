package w;

/* JADX INFO: renamed from: w.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1667P implements InterfaceC1652A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18547a;

    public C1667P(int i7) {
        this.f18547a = i7;
    }

    @Override // w.InterfaceC1679l
    public final q0 d(o0 o0Var) {
        return new N3.p(this.f18547a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1667P) && ((C1667P) obj).f18547a == this.f18547a;
    }

    public final int hashCode() {
        return this.f18547a;
    }
}
