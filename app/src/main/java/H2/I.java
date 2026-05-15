package H2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f3004p;

    public /* synthetic */ I(N n7, int i7) {
        this.f3003o = i7;
        this.f3004p = n7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3003o) {
            case 0:
                this.f3004p.f3044V = true;
                break;
            case 1:
                this.f3004p.v();
                break;
            default:
                N n7 = this.f3004p;
                if (!n7.b0) {
                    InterfaceC0206x interfaceC0206x = n7.f3028F;
                    interfaceC0206x.getClass();
                    interfaceC0206x.a(n7);
                }
                break;
        }
    }
}
