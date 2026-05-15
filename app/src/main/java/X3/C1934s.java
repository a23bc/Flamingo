package x3;

/* JADX INFO: renamed from: x3.s */
/* JADX INFO: loaded from: classes.dex */
public class C1934s extends F5.t {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AbstractServiceC1940y f20103u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1934s(AbstractServiceC1940y abstractServiceC1940y) {
        super(abstractServiceC1940y);
        this.f20103u = abstractServiceC1940y;
    }

    @Override // F5.t
    public final void q() {
        C1933r c1933r = new C1933r(this, this.f20103u);
        this.f2442q = c1933r;
        c1933r.onCreate();
    }
}
