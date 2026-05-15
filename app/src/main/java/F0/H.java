package f0;

import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class H implements C0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1182c f11665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public I f11666p;

    public H(InterfaceC1182c interfaceC1182c) {
        this.f11665o = interfaceC1182c;
    }

    @Override // f0.C0
    public final void a() {
        this.f11666p = (I) this.f11665o.b(C0879c.f11792b);
    }

    @Override // f0.C0
    public final void f() {
        I i7 = this.f11666p;
        if (i7 != null) {
            i7.a();
        }
        this.f11666p = null;
    }

    @Override // f0.C0
    public final void e() {
    }
}
