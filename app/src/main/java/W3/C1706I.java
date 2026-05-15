package w3;

/* JADX INFO: renamed from: w3.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1706I implements S, w2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f18990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f18991q;

    public /* synthetic */ C1706I(U u7, boolean z6, int i7) {
        this.f18989o = i7;
        this.f18990p = u7;
        this.f18991q = z6;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f18989o) {
            case 1:
                v3.U(this.f18990p.f19070n.f19304r, this.f18991q);
                break;
            default:
                v3.U(this.f18990p.f19070n.f19304r, this.f18991q);
                break;
        }
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f18989o) {
            case 0:
                interfaceC1741o.j1(this.f18990p.f19061c, i7, this.f18991q);
                break;
            case 1:
            default:
                interfaceC1741o.g0(this.f18990p.f19061c, i7, this.f18991q);
                break;
            case 2:
                interfaceC1741o.D(this.f18990p.f19061c, i7, this.f18991q);
                break;
        }
    }
}
