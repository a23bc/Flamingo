package x3;

/* JADX INFO: renamed from: x3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1935t extends C1934s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC1940y f20104v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1935t(AbstractServiceC1940y abstractServiceC1940y) {
        super(abstractServiceC1940y);
        this.f20104v = abstractServiceC1940y;
    }

    @Override // F5.t
    public final f0 i() {
        AbstractServiceC1940y abstractServiceC1940y = this.f20104v;
        C1931p c1931p = abstractServiceC1940y.f20129t;
        if (c1931p == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (c1931p != abstractServiceC1940y.f20126q) {
            return c1931p.f20095d;
        }
        C1932q c1932q = (C1932q) this.f2442q;
        c1932q.getClass();
        return new f0(c1932q.getCurrentBrowserInfo());
    }
}
