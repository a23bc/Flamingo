package j1;

import L2.C0247a;
import f0.C0894j0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends T1.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0894j0 f13671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0247a f13672p;

    public g(C0894j0 c0894j0, C0247a c0247a) {
        this.f13671o = c0894j0;
        this.f13672p = c0247a;
    }

    @Override // T1.g
    public final void a() {
        this.f13672p.f4105p = j.f13675a;
    }

    @Override // T1.g
    public final void b() {
        this.f13671o.setValue(Boolean.TRUE);
        this.f13672p.f4105p = new k(true);
    }
}
