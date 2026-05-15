package w3;

/* JADX INFO: renamed from: w3.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1699B implements S, J0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f18923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f18924q;

    public /* synthetic */ C1699B(Object obj, float f7, int i7) {
        this.f18922o = i7;
        this.f18923p = obj;
        this.f18924q = f7;
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f18922o) {
            case 0:
                interfaceC1741o.s0(((U) this.f18923p).f19061c, i7, this.f18924q);
                break;
            default:
                interfaceC1741o.W(((U) this.f18923p).f19061c, i7, this.f18924q);
                break;
        }
    }

    @Override // w3.J0
    public void f(C1747r0 c1747r0) {
        ((K0) this.f18923p).f19002g.f18914s.l(this.f18924q);
    }
}
