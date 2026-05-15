package w5;

/* JADX INFO: loaded from: classes.dex */
public final class O extends k0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f19499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f19500t;

    public /* synthetic */ O(int i7, Object obj) {
        this.f19499s = i7;
        this.f19500t = obj;
    }

    @Override // w5.InterfaceC1780d0
    public final void c(Throwable th) {
        switch (this.f19499s) {
            case 0:
                ((N) this.f19500t).a();
                break;
            case 1:
                ((InterfaceC1780d0) this.f19500t).c(th);
                break;
            case 2:
                Object objO = k().O();
                boolean z6 = objO instanceof C1800s;
                l0 l0Var = (l0) this.f19500t;
                if (!z6) {
                    l0Var.resumeWith(AbstractC1767D.A(objO));
                } else {
                    l0Var.resumeWith(android.support.v4.media.session.b.l(((C1800s) objO).f19570a));
                }
                break;
            default:
                ((C1793k) this.f19500t).resumeWith(Y4.o.f8736a);
                break;
        }
    }
}
