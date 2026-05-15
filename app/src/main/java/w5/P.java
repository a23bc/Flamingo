package w5;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC1774a0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19501o;

    public P(boolean z6) {
        this.f19501o = z6;
    }

    @Override // w5.InterfaceC1774a0
    public final boolean b() {
        return this.f19501o;
    }

    @Override // w5.InterfaceC1774a0
    public final r0 e() {
        return null;
    }

    public final String toString() {
        return Z1.l.s(new StringBuilder("Empty{"), this.f19501o ? "Active" : "New", '}');
    }
}
