package w3;

/* JADX INFO: renamed from: w3.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1707J implements S {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f18994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18996r;

    public /* synthetic */ C1707J(U u7, int i7, int i8, int i9) {
        this.f18993o = i9;
        this.f18994p = u7;
        this.f18995q = i7;
        this.f18996r = i8;
    }

    @Override // w3.S
    public final void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f18993o) {
            case 0:
                interfaceC1741o.q(this.f18994p.f19061c, i7, this.f18995q, this.f18996r);
                break;
            case 1:
                interfaceC1741o.K(this.f18994p.f19061c, i7, this.f18995q, this.f18996r);
                break;
            default:
                interfaceC1741o.v(this.f18994p.f19061c, i7, this.f18995q, this.f18996r);
                break;
        }
    }
}
