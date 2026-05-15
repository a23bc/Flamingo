package f0;

import l5.InterfaceC1180a;

/* JADX INFO: renamed from: f0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0905p implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0912t f11858p;

    public /* synthetic */ C0905p(int i7, C0912t c0912t) {
        this.f11857o = i7;
        this.f11858p = c0912t;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f11857o) {
            case 0:
                throw null;
            case 1:
                return this.f11858p.m();
            default:
                return this.f11858p.m();
        }
    }

    public /* synthetic */ C0905p(C0912t c0912t, AbstractC0876a0 abstractC0876a0) {
        this.f11857o = 0;
        this.f11858p = c0912t;
    }
}
